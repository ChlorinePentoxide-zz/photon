include ../share/share.mk

MAKEFLAGS += -s

all: main

main:
	echo Compiling SFileStream.java ...
	javac -d $(BUILD_DIR) SFileStream.java
	cp $(BUILD_DIR)SFileStream.class $(BUILD_TEST_DIR)SFileStream.class
	echo Compiling SFileStreamTest.java ...
	javac -d $(BUILD_TEST_DIR) SFileStreamTest.java
	rm -rf *.class

test:
	# Test Resources
	touch $(BUILD_TEST_DIR)readable.test
	echo "TESTING SINGLE LINE" > $(BUILD_TEST_DIR)readable.test
	echo "TESTING MULTIPLE LINES" >> $(BUILD_TEST_DIR)readable.test
	
	echo "	java SFileStreamTest "readable.test >> $(BUILD_TEST_DIR)Makefile 
	
clean:
	rm -rf *.class