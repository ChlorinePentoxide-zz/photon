TEST_DIR = ./build/test/
TEST_MAKEFILE = ./build/test/Makefile
SHARED_MAKEFILE = ./src/share/share.mk

all: main

main:
	@$(MAKE) -C src

test:
	@touch $(TEST_MAKEFILE)
	@echo "MAKEFLAGS += -s" > $(TEST_MAKEFILE)
	@echo "all: test" >> $(TEST_MAKEFILE)
	@echo "" >> $(TEST_MAKEFILE)
	@echo "test: " >> $(TEST_MAKEFILE)
	@$(MAKE) -C src test
	@$(MAKE) -C $(TEST_DIR) test
	
clean:
	@$(MAKE) -C src clean
	@rm -rf build