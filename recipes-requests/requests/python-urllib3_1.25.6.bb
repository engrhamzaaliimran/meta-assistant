
SUMMARY = "HTTP library with thread-safe connection pooling, file post, and more."
HOMEPAGE = "https://urllib3.readthedocs.io/"
AUTHOR = "Andrey Petrov <andrey.petrov@shazow.net>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=65715c2eb961313d71b297dd5a04f85e"

SRC_URI = "https://files.pythonhosted.org/packages/ff/44/29655168da441dff66de03952880c6e2d17b252836ff1aa4421fba556424/urllib3-1.25.6.tar.gz"
SRC_URI[md5sum] = "a7504a9fcb7ed4ffa482fe098c80b6d4"
SRC_URI[sha256sum] = "9a107b99a5393caf59c7aa3c1249c16e6879447533d0887f4336dde834c7be86"

S = "${WORKDIR}/urllib3-1.25.6"

RDEPENDS_${PN} = ""

inherit setuptools
