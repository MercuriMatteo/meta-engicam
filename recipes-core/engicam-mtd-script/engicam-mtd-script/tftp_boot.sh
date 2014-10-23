serverip=192.168.2.96
tftp -g -r u-boot.imx -l u-boot.imx $serverip
if [ -f u-boot.imx ]; then
 	echo "Download u-boot.imx"
	dd if=u-boot.imx of=/mnt/u-boot_my.imx bs=512 seek=2 
	flash_erase /dev/mtd0 0 0
	kobs-ng init -v /mnt/u-boot_my.imx
	rm u-boot.imx
	rm /mnt/u-boot_my.imx
else
	echo "Unable to download u-boot.imx"
fi
