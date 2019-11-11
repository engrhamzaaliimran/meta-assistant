
SUMMARY = "Pure-Python RSA implementation"
HOMEPAGE = "https://stuvel.eu/rsa"
AUTHOR = "Sybren A. Stuvel <sybren@stuvel.eu>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c403f6882d4f97a9cd927df987d55634"

SRC_URI = "https://files.pythonhosted.org/packages/cb/d0/8f99b91432a60ca4b1cd478fd0bdf28c1901c58e3a9f14f4ba3dba86b57f/rsa-4.0.tar.gz"
SRC_URI[md5sum] = "9f9af433a16868b616fc609215e91ddb"
SRC_URI[sha256sum] = "1a836406405730121ae9823e19c6e806c62bbad73f890574fff50efa4122c487"

S = "${WORKDIR}/rsa-4.0"

RDEPENDS_${PN} = "python-pyasn1"

inherit setuptools
