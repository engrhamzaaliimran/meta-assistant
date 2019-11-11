
SUMMARY = "Easily download, build, install, upgrade, and uninstall Python packages"
HOMEPAGE = "https://github.com/pypa/setuptools"
AUTHOR = "Python Packaging Authority <distutils-sig@python.org>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9a33897f1bca1160d7aad3835152e158"

SRC_URI = "https://files.pythonhosted.org/packages/cb/83/055c30a0d60b12aec280e41fa3b0b316ae9d655b11ff8decfe74c4395908/setuptools-41.5.0.zip"
SRC_URI[md5sum] = "72dca70432617f3f3472965c030a76a8"
SRC_URI[sha256sum] = "3025741f235bee01847ec315b31b34fa6673d5076d666a92594e3999b20a9ee1"

S = "${WORKDIR}/setuptools-41.5.0"

RDEPENDS_${PN} = ""

inherit setuptools
