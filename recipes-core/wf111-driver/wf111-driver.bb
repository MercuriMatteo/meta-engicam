DESCRIPTION = "WF111 driver and bin utils"
SECTION = "wireless driver"
LICENSE = "CLOSED"

INSANE_SKIP_${PN} = "already-stripped"


SRC_URI = " \
	file://wf111-linux-driver_5.2.2-r1_armv7-a.tar.gz \	
"

CFLAGS_append = " -Wno-error=date-time "
CFLAGS_append = " -Wno-date-time "

do_compile () {
    cd ${WORKDIR}/wf111-linux-driver_5.2.2-r1_armv7-a    
    unset LDFLAG    
    echo ${EXTRA_CFLAGS}
    make install_static KDIR=${STAGING_KERNEL_BUILDDIR} ARCH=arm  CROSS_COMPILE=arm-poky-linux-gnueabi-
}

do_install (){
	install -d ${D}
	cp -rf ${WORKDIR}/wf111-linux-driver_5.2.2-r1_armv7-a/output/* ${D}
} 


FILES_${PN} = "/usr/* \
		/lib* "



