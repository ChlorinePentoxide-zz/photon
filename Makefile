all: main

main:
	cd src
	make

test:
	cd src
	make
	make test
	
clean:
	cd src
	make clean