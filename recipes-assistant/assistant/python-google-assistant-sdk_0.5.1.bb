
SUMMARY = "Samples and Tools the Google Assistant SDK"
HOMEPAGE = "https://github.com/googlesamples/assistant-sdk-python"
AUTHOR = "Google Assistant SDK team <proppy+assistant-sdk@google.com>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1b388b135719dbe1143117b38cadeb4e"

SRC_URI = "https://files.pythonhosted.org/packages/2c/b1/08a5383c851288c3faafab607f5bac5ac31d1cf81a8198afa0d8c5c80606/google-assistant-sdk-0.5.1.tar.gz"
SRC_URI[md5sum] = "c062e8d950b797971449208775b2ab62"
SRC_URI[sha256sum] = "db11b43087a4db51ca03dabc8d555e83363dfc49c9dcc9715027fbd06a19fbf2"

S = "${WORKDIR}/google-assistant-sdk-0.5.1"

RDEPENDS_${PN} = "python-google-auth-oauthlib"

inherit setuptools
