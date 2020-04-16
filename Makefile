TEST_DIR = ./build/test/
TEST_MAKEFILE = ./build/test/Makefile

all: main

main:
	@$(MAKE) -C src

test:
	@touch $(TEST_MAKEFILE)
	@echo "all: test" > $(TEST_MAKEFILE)
	@echo "" >> $(TEST_MAKEFILE)
	@echo "test: " >> $(TEST_MAKEFILE)
	@$(MAKE) -C src test
	@$(MAKE) -C $(TEST_DIR) test
	
clean:
	@$(MAKE) -C src clean
	rm -rf build