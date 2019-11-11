
SUMMARY = "Python HTTP for Humans."
HOMEPAGE = "http://python-requests.org"
AUTHOR = "Kenneth Reitz <me@kennethreitz.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a8d5a1d1c2d53025e2282c511033f6f7"

SRC_URI = "https://files.pythonhosted.org/packages/01/62/ddcf76d1d19885e8579acb1b1df26a852b03472c0e46d2b959a714c90608/requests-2.22.0.tar.gz"
SRC_URI[md5sum] = "ee28bee2de76e9198fc41e48f3a7dd47"
SRC_URI[sha256sum] = "11e007a8a2aa0323f5a921e9e6a2d7e4e67d9877e85773fba9ba6419025cbeb4"

S = "${WORKDIR}/requests-2.22.0"

RDEPENDS_${PN} = "python-chardet python-idna python-urllib3 python-certifi"

inherit setuptools
