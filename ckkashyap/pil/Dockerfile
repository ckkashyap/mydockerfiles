FROM ubuntu:18.04 as build
WORKDIR /root
RUN apt-get update && apt-get install -y picolisp && apt-get install -y vim gcc gcc-multilib gdb nasm git cscope make curl telnet mercurial build-essential libssl-dev strace w3m && git clone -b contrib https://github.com/ckkashyap/picoLisp.git picoLispFordocker && cd picoLispFordocker/src && USE_IPV4=-DUSE_IPV4 make gate && cp ../bin/* /bin/ && rm -rf /root/picoLispFordocker && useradd user && mkdir /home/user
COPY dbapp.l /home/user
COPY names /root

FROM ubuntu:18.04
COPY --from=build / /
EXPOSE 3000
WORKDIR /root
ENV LANG=en-US
ENV DISPLAY=host.docker.internal:0
RUN chown -R user:user /home/user
CMD /bin/httpGate 3000 names && /bin/bash
