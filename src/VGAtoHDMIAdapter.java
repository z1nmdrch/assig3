class VGAtoHDMIAdapter implements HDMI {
    private VGAMonitor vgaMonitor;

    public VGAtoHDMIAdapter(VGAMonitor vgaMonitor) {
        this.vgaMonitor = vgaMonitor;
    }

    @Override
    public void displayHDMI() {
        System.out.println("Converting VGA to HDMI signal.");
        vgaMonitor.displayVGA();
    }
}