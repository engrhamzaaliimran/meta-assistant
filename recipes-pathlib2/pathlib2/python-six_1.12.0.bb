
SUMMARY = "Python 2 and 3 compatibility utilities"
HOMEPAGE = "https://github.com/benjaminp/six"
AUTHOR = "Benjamin Peterson <benjamin@python.org>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=83e0f622bd5ac7d575dbd83d094d69b5"

SRC_URI = "https://files.pythonhosted.org/packages/dd/bf/4138e7bfb757de47d1f4b6994648ec67a51efe58fa907c1e11e350cddfca/six-1.12.0.tar.gz"
SRC_URI[md5sum] = "9ae5d1feed8c0215f4ae4adcd9207fcb"
SRC_URI[sha256sum] = "d16a0141ec1a18405cd4ce8b4613101da75da0e9a7aec5bdd4fa804d0e0eba73"

S = "${WORKDIR}/six-1.12.0"

RDEPENDS_${PN} = ""

inherit setuptools
