xas99.py -i -q -R -L gyruss.lst -E symbols.txt src/gyruss.a99 -o bin/gyruss

java -jar tools/ea5tocart.jar bin\gyruss "GYRUSS"

copy bin\gyruss8.bin .

