FROM clojure:tools-deps-alpine
RUN apk add git
WORKDIR /tmp/project1
RUN mkdir src
COPY deps.edn .
COPY watch.clj build.clj index.html ./
COPY build.clj .
COPY sample.cljs src/
RUN clj build.clj
