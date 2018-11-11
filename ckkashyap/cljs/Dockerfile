FROM clojure:tools-deps-alpine as build
WORKDIR /root
RUN mkdir -p setup/src
COPY deps.edn watch.clj build.clj index.html ./setup/
COPY sample.cljs setup/src/
RUN cd setup && clj build.clj
RUN cp -R /root /_root
RUN rm -rf /root

COPY setup /bin/setup
RUN chmod +x /bin/setup

FROM scratch
COPY --from=build / /
WORKDIR /root
CMD /bin/bash