#!/bin/sh

git clone https://bitbucket.org/alfonsovillen/picolispffi/src/master/ picolispsdl
ln -s $PWD/picolispsdl/sdl /usr/lib/picolisp/
cd picolispsdl/demos
pil demo1.l -main
