
SUMMARY = "ASN.1 types and codecs"
HOMEPAGE = "https://github.com/etingof/pyasn1"
AUTHOR = "Ilya Etingof <etingof@gmail.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=a14482d15c2249de3b6f0e8a47e021fd"

SRC_URI = "https://files.pythonhosted.org/packages/ca/f8/2a60a2c88a97558bdd289b6dc9eb75b00bd90ff34155d681ba6dbbcb46b2/pyasn1-0.4.7.tar.gz"
SRC_URI[md5sum] = "50290e833395016c49903f4f9c7e47e5"
SRC_URI[sha256sum] = "a9495356ca1d66ed197a0f72b41eb1823cf7ea8b5bd07191673e8147aecf8604"

S = "${WORKDIR}/pyasn1-0.4.7"

RDEPENDS_${PN} = ""

inherit setuptools
