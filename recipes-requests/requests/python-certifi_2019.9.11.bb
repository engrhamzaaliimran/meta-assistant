
SUMMARY = "Python package for providing Mozilla's CA Bundle."
HOMEPAGE = "https://certifi.io/"
AUTHOR = "Kenneth Reitz <me@kennethreitz.com>"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f77f61d14ee6feac4228d3ebd26cc1f1"

SRC_URI = "https://files.pythonhosted.org/packages/62/85/7585750fd65599e88df0fed59c74f5075d4ea2fe611deceb95dd1c2fb25b/certifi-2019.9.11.tar.gz"
SRC_URI[md5sum] = "cadd4e373fc08f649fa39b82aed9ad96"
SRC_URI[sha256sum] = "e4f3620cfea4f83eedc95b24abd9cd56f3c4b146dd0177e83a21b4eb49e21e50"

S = "${WORKDIR}/certifi-2019.9.11"

RDEPENDS_${PN} = ""

inherit setuptools
