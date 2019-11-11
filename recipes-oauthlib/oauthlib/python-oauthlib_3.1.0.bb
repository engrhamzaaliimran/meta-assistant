
SUMMARY = "A generic, spec-compliant, thorough implementation of the OAuth request-signing logic"
HOMEPAGE = "https://github.com/oauthlib/oauthlib"
AUTHOR = "The OAuthlib Community <idan@gazit.me>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=abd2675e944a2011aed7e505290ba482"

SRC_URI = "https://files.pythonhosted.org/packages/fc/c7/829c73c64d3749da7811c06319458e47f3461944da9d98bb4df1cb1598c2/oauthlib-3.1.0.tar.gz"
SRC_URI[md5sum] = "43cb2b5bac983712ee55076b61181cc2"
SRC_URI[sha256sum] = "bee41cc35fcca6e988463cacc3bcb8a96224f470ca547e697b604cc697b2f889"

S = "${WORKDIR}/oauthlib-3.1.0"

RDEPENDS_${PN} = ""

inherit setuptools
