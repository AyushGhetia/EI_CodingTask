package structural;

public class USBtoUSB_CAdapter implements USBPort {
    private OldUSBDevice oldUSBDevice;

    public USBtoUSB_CAdapter(OldUSBDevice oldUSBDevice) {
        this.oldUSBDevice = oldUSBDevice;
    }

    @Override
    public void connectWithUsbCable() {
        oldUSBDevice.connectWithOldUsbCable();
    }
}
