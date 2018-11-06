# cljs
This docker image helps getting started with clojurescript version 1.10.339

## Getting started

## Build the image
```bash
    docker build -t <image name:tag> .
```

## Run the image

The image contains a sample project under /root/project1 which has already been compiled and the generated code is in /root/project1/out. The generated code is referenced in index.html

To test the code you would need to extract the html and the generated javascript into the host. So the image must be run using a volume mounted for moving files out of the container.

```bash
    docker run --rm -it -v /tmp:/tmp <image name:tag> 
```
This will drop you into a bash shell at /tmp/project1 . You can copy index.html and out/ to /tmp
```bash
    cp -Rf index.html out /tmp
```

index.html at /tmp on the host is ready for testing.

## watch.clj and build.clj

watch.clj and build.clj are scripts that watch and build the src directory.

```bash
    clj [ watch.clj | build.clj ]
```
