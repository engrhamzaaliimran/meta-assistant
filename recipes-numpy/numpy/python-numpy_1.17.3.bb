
SUMMARY = "NumPy is the fundamental package for array computing with Python."
HOMEPAGE = "https://www.numpy.org"
AUTHOR = "Travis E. Oliphant et al. <>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=1a32aba007a415aa8a1c708a0e2b86a1"

SRC_URI = "https://files.pythonhosted.org/packages/b6/d6/be8f975f5322336f62371c9abeb936d592c98c047ad63035f1b38ae08efe/numpy-1.17.3.zip"
SRC_URI[md5sum] = "a3195ccbbd97b0366f0c46e36a62717a"
SRC_URI[sha256sum] = "a0678793096205a4d784bd99f32803ba8100f639cf3b932dc63b21621390ea7e"

S = "${WORKDIR}/numpy-1.17.3"

RDEPENDS_${PN} = ""

inherit setuptools
