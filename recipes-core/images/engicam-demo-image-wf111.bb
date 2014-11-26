require core-image-minimal.bb

DESCRIPTION = "Engicam minimal image for using wf111 module"


IMAGE_INSTALL_append += " mtd-utils imx-kobs mtd-utils-ubifs"

EXTRA_IMAGE_FEATURES = "debug-tweaks ssh-server-openssh tools-debug"

FSL_KERNEL_DEFCONFIG="icore-defconfig"

UBOOT_CONFIG = "nand"

SOC_IMAGE_INSTALL = ""
SOC_IMAGE_INSTALL_mx6 = "gpu-viv-bin-mx6q gpu-viv-g2d fsl-gpu-sdk"

IMAGE_INSTALL += " \
    ${SOC_IMAGE_INSTALL} \
    engicam-mtd-script \
    iproute2 \
    cantest \
    wf111-driver \
    wireless-tools \
    wpa-supplicant \
    "
