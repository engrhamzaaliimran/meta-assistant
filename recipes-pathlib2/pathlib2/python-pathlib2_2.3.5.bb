
SUMMARY = "Object-oriented filesystem paths"
HOMEPAGE = "https://github.com/mcmtroffaes/pathlib2"
AUTHOR = "Matthias C. M. Troffaes <matthias.troffaes@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=042856c23a3e903b33bf361ea1cbe29a"

SRC_URI = "https://files.pythonhosted.org/packages/94/d8/65c86584e7e97ef824a1845c72bbe95d79f5b306364fa778a3c3e401b309/pathlib2-2.3.5.tar.gz"
SRC_URI[md5sum] = "f2bd0a363eb0f8fa0556f35c1d9e66fb"
SRC_URI[sha256sum] = "6cd9a47b597b37cc57de1c05e56fb1a1c9cc9fab04fe78c29acd090418529868"

S = "${WORKDIR}/pathlib2-2.3.5"

RDEPENDS_${PN} = "python-six"

inherit setuptools
