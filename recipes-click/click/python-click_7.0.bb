
SUMMARY = "Composable command line interface toolkit"
HOMEPAGE = "https://palletsprojects.com/p/click/"
AUTHOR = "Armin Ronacher <armin.ronacher@active-4.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=c13ed890b210a882c1778216694c98c7"

SRC_URI = "https://files.pythonhosted.org/packages/f8/5c/f60e9d8a1e77005f664b76ff8aeaee5bc05d0a91798afd7f53fc998dbc47/Click-7.0.tar.gz"
SRC_URI[md5sum] = "7f53d50f7b7373ebc7963f9ff697450a"
SRC_URI[sha256sum] = "5b94b49521f6456670fdb30cd82a4eca9412788a93fa6dd6df72c94d5a8ff2d7"

S = "${WORKDIR}/Click-7.0"

RDEPENDS_${PN} = ""

inherit setuptools
