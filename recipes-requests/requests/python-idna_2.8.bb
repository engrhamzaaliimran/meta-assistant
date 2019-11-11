
SUMMARY = "Internationalized Domain Names in Applications (IDNA)"
HOMEPAGE = "https://github.com/kjd/idna"
AUTHOR = "Kim Davies <kim@cynosure.com.au>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=782775b32f96098512e283fb5d4546cd"

SRC_URI = "https://files.pythonhosted.org/packages/ad/13/eb56951b6f7950cadb579ca166e448ba77f9d24efc03edd7e55fa57d04b7/idna-2.8.tar.gz"
SRC_URI[md5sum] = "2e9ae0b4a0b26d1747c6127cdb060bc1"
SRC_URI[sha256sum] = "c357b3f628cf53ae2c4c05627ecc484553142ca23264e593d327bcde5e9c3407"

S = "${WORKDIR}/idna-2.8"

RDEPENDS_${PN} = ""

inherit setuptools
