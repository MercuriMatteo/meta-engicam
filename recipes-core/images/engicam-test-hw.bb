DESCRIPTION = "Engicam image for hardware test"

LICENSE = "MIT"

inherit core-image

EXTRA_IMAGE_FEATURES = " debug-tweaks ssh-server-openssh tools-debug \
			"

IMAGE_INSTALL_append_mx6 = " \
    firmware-imx-vpu-imx6q \
    engicam-emmc-script \
    engicam-mtd-script \
    wf111-driver \
    wireless-tools \
    wpa-supplicant \
    packagegroup-fslc-gstreamer1.0-full \
    packagegroup-fsl-gstreamer-full \    
    gstreamer1.0-plugins-imx \
    gst1.0-fsl-plugin \    
    cpufrequtils \
    usbutils \
    dosfstools \
    e2fsprogs \
    imx-test \
"

IMAGE_INSTALL_remove_mx6sx = " gstreamer1.0-plugins-imx"

IMAGE_INSTALL_append_mx6sx = " vadc-pxp"

IMAGE_INSTALL_append = " \    
    binutils \ 
    tslib evtest tslib-conf tslib-tests tslib-calibrate \
    psplash \
    engicam-mtd-script \    
    iproute2 \
    canutils \
    cantest \
    mtd-utils \  
    mtd-utils-ubifs \
    serialtools \    
    devmem2 \
    i2c-tools \ 
    imx-kobs \
    u-boot-eng-fw-utils \
    fw-nandautosize \  
    alsa-utils \
    alsa-tools \
    alsa-state \
    alsa-lib \
    alsa-utils-alsaconf \
    test-sound \
    fbset \
    minicom \
    ethtool \
    fsl-alsa-plugins \ 
    v4l-utils \
"
