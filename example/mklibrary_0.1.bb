
DESCRIPTION = "create sample library file"
SECTION = "example"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9629d10f254a7321520544a8077fec74" 
PR = "r06"

ALLOW_EMPTY_${PN} = "1"

SRC_URI = "file://helloworldlib.c \
	   file://helloworld.c \
	   file://Makefile \
	   file://LICENSE"

S = "${WORKDIR}"

do_install() {
	install -d ${D}${libdir}
	install -m 644 libhworld02.so ${D}${libdir}

#	install -d ${D}${bindir}
#	install -m 755 out ${D}${bindir}
}



