FROM clojure:tools-deps-alpine as build
WORKDIR /root
RUN apk add git
RUN apk add sqlite
RUN mkdir sample
ADD src sample/src
ADD resources sample/resources
COPY *edn setup ./sample/
RUN cd sample && clojure -A:cljsbuild
RUN cp -R /root /_root
RUN rm -rf /root

COPY setup /bin/setup
RUN chmod +x /bin/setup

FROM scratch
COPY --from=build / /
WORKDIR /root
CMD /bin/bash