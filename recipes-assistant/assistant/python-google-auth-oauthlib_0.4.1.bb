
SUMMARY = "Google Authentication Library"
HOMEPAGE = "https://github.com/GoogleCloudPlatform/google-auth-library-python-oauthlib"
AUTHOR = "Google Cloud Platform <jonwayne+google-auth@google.com>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "https://files.pythonhosted.org/packages/cd/5a/2b5a4c1294a4e8903bdba122083bd505dc51688a95d4670cde89dc45e6ed/google-auth-oauthlib-0.4.1.tar.gz"
SRC_URI[md5sum] = "ba41016e9e3869fac468231ae819f668"
SRC_URI[sha256sum] = "88d2cd115e3391eb85e1243ac6902e76e77c5fe438b7276b297fbe68015458dd"

S = "${WORKDIR}/google-auth-oauthlib-0.4.1"

RDEPENDS_${PN} = "python-google-auth python-requests-oauthlib"

inherit setuptools
