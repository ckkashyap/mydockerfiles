FROM clojure:tools-deps-alpine
RUN apk add git
RUN apk add sqlite
WORKDIR /root/project1
ADD src src
ADD resources resources
COPY *edn ./
RUN clojure -A:cljsbuild