# clojure-sqlite
This docker image helps getting started with cljure and sqlite. To run the the image, 

## Getting started

### Build the image
```bash
    docker build -t clj-sqlite:1.0 .
```

### Run the image
```bash
    docker run --rm -it clj-sqlite:1.0
```
This is should drop into a bash shell at ~/project1 . You can run the sample code as follows -

```bash
    clj -m sample
```
The sample has been copied from [ogrim/clojure-sqlite-example](https://github.com/ogrim/clojure-sqlite-example)