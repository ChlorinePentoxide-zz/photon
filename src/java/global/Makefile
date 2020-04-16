include ../share/share.mk

MAKEFLAGS += -s

all: main

main:
	echo Compiling Global.java ...
	javac -d $(BUILD_DIR) Global.java
	echo Compiling GlobalTest.java ...
	javac -d $(BUILD_TEST_DIR) GlobalTest.java
	rm -rf *.class

test:
	echo "	java GlobalTest" >> $(BUILD_TEST_DIR)Makefile

clean:
	rm -rf *.class