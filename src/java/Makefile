all: main

main:
	@$(MAKE) -C global
	@$(MAKE) -C util

test:
	@$(MAKE) -C global test
	@$(MAKE) -C util test
	
clean:
	@$(MAKE) -C global clean
	@$(MAKE) -C util clean