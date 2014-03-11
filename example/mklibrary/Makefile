all: libhworld02.so out clean

libhworld02.so: helloworld.o
	$(AR) rcs libhworld02.so helloworld.o

helloworld.o: helloworldlib.c
	$(CC) -c -fPIC helloworldlib.c -o helloworld.o

out: helloworld.c
	$(CC) helloworld.c -o out 
	
clean:
	rm -rf *.o
	
