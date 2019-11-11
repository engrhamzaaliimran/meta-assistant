
SUMMARY = "Backport of the concurrent.futures package from Python 3"
HOMEPAGE = "https://github.com/agronholm/pythonfutures"
AUTHOR = "Brian Quinlan <brian@sweetapp.com>"
LICENSE = "Python-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=834d982f973c48b6d662b5944c5ab567"

SRC_URI = "https://files.pythonhosted.org/packages/47/04/5fc6c74ad114032cd2c544c575bffc17582295e9cd6a851d6026ab4b2c00/futures-3.3.0.tar.gz"
SRC_URI[md5sum] = "b43a39ae1475e3fd6940f2b4f7214675"
SRC_URI[sha256sum] = "7e033af76a5e35f58e56da7a91e687706faf4e7bdfb2cbc3f2cca6b9bcda9794"

S = "${WORKDIR}/futures-3.3.0"

RDEPENDS_${PN} = ""

inherit setuptools
