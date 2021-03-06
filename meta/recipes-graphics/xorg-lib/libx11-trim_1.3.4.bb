require libx11.inc

DESCRIPTION += " Support for XCB, and XCMS is disabled in this version."

LICENSE = "MIT & MIT-style & BSD"
LIC_FILES_CHKSUM = "file://COPYING;md5=bf75bfe4d05068311b5e6862d4b5f2c5"

PR = "r2"

DEPENDS += "libxcb xproto xextproto xtrans libxau kbproto inputproto xf86bigfontproto xproto-native"

SRC_URI += "file://x11_disable_makekeys.patch \
            file://include_fix.patch \
            file://nodolt.patch \
            file://makekeys_crosscompile.patch"

SRC_URI[md5sum] = "f65c9c7ecbfb64c19dbd7927160d63fd"
SRC_URI[sha256sum] = "88d7238ce5f7cd123450567de7a3b56a43556e4ccc45df38b8324147c889a844"

EXTRA_OECONF += "--with-keysymdef=${STAGING_INCDIR}/X11/keysymdef.h --disable-xcms --with-xcb"
