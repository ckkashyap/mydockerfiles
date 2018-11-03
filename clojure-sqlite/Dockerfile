FROM clojure:tools-deps-alpine
RUN apk add sqlite
WORKDIR /root/project1
RUN mkdir src
COPY deps.edn .
COPY sample.clj src/
RUN clojure -m sample