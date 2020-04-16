MAKEFLAGS += -s

all: main

main:
	echo Compiling Global.java ...
	javac -d ../../../build Global.java
	echo Compiling GlobalTest.java ...
	javac -d ../../../build/test GlobalTest.java
	rm -rf *.class

test:
	echo "	java GlobalTest" >> ../../../build/test/Makefile

clean:
	rm -rf *.class