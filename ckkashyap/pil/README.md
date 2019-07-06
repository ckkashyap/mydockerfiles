To build the image
docker build -t ckkashyap/tools:picolisp-hack .
docker push ckkashyap/tools:picolisp-hack

docker build -t ckkashyap/picolisp -f PicoLisp . && docker push ckkashyap/picolisp
