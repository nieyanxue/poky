#
# Copyright (C) 2011 Colin Walters <walters@verbum.org>
#
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

PACKAGE_ARCH = "${MACHINE_ARCH}"
ALLOW_EMPTY = "1"

PR = 1

RDEPENDS += "     \
	 autoconf \
	 automake \
	 binutils \
	 binutils-symlinks \
	 coreutils \
	 cpp \
	 cpp-symlinks \
	 ccache \
	 diffutils \
	 gcc \
	 gcc-symlinks \
	 g++ \
	 g++-symlinks \
	 gettext \
	 make \
	 intltool \
	 libtool \
	 libtool-dev \
	 perl-module-re \
	 perl-module-text-wrap \
	 pkgconfig \
	 findutils \
	 less \
	 ldd \
	 file \
	 python-dev \
	 bison flex \
	 git \
	 gdb \
	 zip \
	 ruby \
	 libxml-parser-perl \
	 gettext-dev \
	 libpci-dev \
	 bzip2-dev \
	 xz-dev \
	 libc6-dev \
	 linux-libc-headers-dev \
	 zlib-dev \
	 gdbm-dev \
	 libtool-dev \
	 util-linux-libuuid-dev \
	 util-linux-libblkid-dev \
	 libpam-dev \
	 tiff-dev \
	 jpeg-dev \
	 libexif-dev \
	 libtool-dev \
	 libsndfile1-dev \
	 libatomics-ops-dev \
	 libogg-dev \
	 speex-dev \
	 libvorbis-dev \
	 libstdc++-dev \
	 libcap-dev \
	 libcap-bin \
	 libgpg-error-dev \
	 libtasn1-dev \
	 libtasn1-bin \
	 libgcrypt-dev \
	 libattr-dev \
	 libacl-dev \
	 gnutls-dev \
	 icu-dev \
	 curl-dev \
	 ncurses-dev \
	 db-dev \
	 cracklib-dev \
	 e2fsprogs-dev \
	 krb5-dev \
	 "

