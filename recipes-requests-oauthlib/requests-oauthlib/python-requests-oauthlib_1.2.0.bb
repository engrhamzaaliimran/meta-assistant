
SUMMARY = "OAuthlib authentication support for Requests."
HOMEPAGE = "https://github.com/requests/requests-oauthlib"
AUTHOR = "Kenneth Reitz <me@kennethreitz.com>"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=22d117a849df10d047ed9b792838e863"

SRC_URI = "https://files.pythonhosted.org/packages/de/a2/f55312dfe2f7a344d0d4044fdfae12ac8a24169dc668bd55f72b27090c32/requests-oauthlib-1.2.0.tar.gz"
SRC_URI[md5sum] = "c32a54ce04123480132960a290d50792"
SRC_URI[sha256sum] = "bd6533330e8748e94bf0b214775fed487d309b8b8fe823dc45641ebcd9a32f57"

S = "${WORKDIR}/requests-oauthlib-1.2.0"

RDEPENDS_${PN} = ""

inherit setuptools
