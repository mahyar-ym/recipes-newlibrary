recipes-newlibrary
==================

add a simple shared library to libdir:

create the recipes-newlibrary directory in one of meta-... directories.

compile the recipe using "bitbake -c compile mklibrary"

add the compiled package to the core image but edditing local.conf file
ADD_IMAGE_EXTRA_INSTALL = "mklibrary"

create the final image/SDK
bitbake core-image-minimal
bitbake core-image-minimal -c popoulate_sdk
