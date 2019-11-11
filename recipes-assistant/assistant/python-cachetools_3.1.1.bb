
SUMMARY = "Extensible memoizing collections and decorators"
HOMEPAGE = "https://github.com/tkem/cachetools"
AUTHOR = "Thomas Kemmer <tkemmer@computer.org>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=27f7518eb6f7dc686d0f953b2f28dae5"

SRC_URI = "https://files.pythonhosted.org/packages/ae/37/7fd45996b19200e0cb2027a0b6bef4636951c4ea111bfad36c71287247f6/cachetools-3.1.1.tar.gz"
SRC_URI[md5sum] = "91aa9b611b6345154df84e8e37746f41"
SRC_URI[sha256sum] = "8ea2d3ce97850f31e4a08b0e2b5e6c34997d7216a9d2c98e0f3978630d4da69a"

S = "${WORKDIR}/cachetools-3.1.1"

RDEPENDS_${PN} = ""

inherit setuptools
