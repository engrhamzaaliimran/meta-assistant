
SUMMARY = "Play and Record Sound with Python"
HOMEPAGE = "http://python-sounddevice.readthedocs.io/"
AUTHOR = "Matthias Geier <Matthias.Geier@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=82e143d2ce5d4ff60912b98fcbc0e3a1"

SRC_URI = "https://files.pythonhosted.org/packages/07/27/a0968acd79542acf702241f22fdded700bf2f74de2ed4bf9ed24b3c417d7/sounddevice-0.3.14.tar.gz"
SRC_URI[md5sum] = "31a7b4d2d7fce15c4a2dbe8f470c27ac"
SRC_URI[sha256sum] = "c7b0f7ad86550668da55404eabcb63d4212ec622fcce86510092306b77d2e80a"

S = "${WORKDIR}/sounddevice-0.3.14"

RDEPENDS_${PN} = "python-cffi-native"

inherit setuptools
