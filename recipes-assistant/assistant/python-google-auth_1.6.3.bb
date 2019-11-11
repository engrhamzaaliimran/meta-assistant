
SUMMARY = "Google Authentication Library"
HOMEPAGE = "https://github.com/GoogleCloudPlatform/google-auth-library-python"
AUTHOR = "Google Cloud Platform <jonwayne+google-auth@google.com>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "https://files.pythonhosted.org/packages/ef/77/eb1d3288dbe2ba6f4fe50b9bb41770bac514cd2eb91466b56d44a99e2f8d/google-auth-1.6.3.tar.gz"
SRC_URI[md5sum] = "0440718247cc4531422e2a8f4f012e8b"
SRC_URI[sha256sum] = "0f7c6a64927d34c1a474da92cfc59e552a5d3b940d3266606c6a28b72888b9e4"

S = "${WORKDIR}/google-auth-1.6.3"

RDEPENDS_${PN} = "python-pyasn1-modules python-rsa python-six python-cachetools"

inherit setuptools
