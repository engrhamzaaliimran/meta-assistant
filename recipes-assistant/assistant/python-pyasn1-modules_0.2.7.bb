
SUMMARY = "A collection of ASN.1-based protocols modules."
HOMEPAGE = "https://github.com/etingof/pyasn1-modules"
AUTHOR = "Ilya Etingof <etingof@gmail.com> <etingof@gmail.com>"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a14482d15c2249de3b6f0e8a47e021fd"

SRC_URI = "https://files.pythonhosted.org/packages/75/93/c51104ea6a74252957c341ccd110b65efecc18edfd386b666637d67d4d10/pyasn1-modules-0.2.7.tar.gz"
SRC_URI[md5sum] = "18c77d56abeef631d94f95ff2d652859"
SRC_URI[sha256sum] = "0c35a52e00b672f832e5846826f1fb7507907f7d52fba6faa9e3c4cbe874fe4b"

S = "${WORKDIR}/pyasn1-modules-0.2.7"

RDEPENDS_${PN} = "python-pyasn1"

inherit setuptools
