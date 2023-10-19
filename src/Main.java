import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a monitor type: (1) VGA Monitor, (2) HDMI Port");
        int monitorType = scanner.nextInt();

        VGAMonitor vgaMonitor = null;
        HDMI hdmiPort = null;

        if (monitorType == 1) {
            vgaMonitor = new ConcreteVGAMonitor();
        } else if (monitorType == 2) {
            hdmiPort = new ConcreteHDMIPort();
        } else {
            System.out.println("Invalid choice.");
            scanner.close();
            return;
        }

        if (vgaMonitor == null) {
            System.out.println("Using HDMI Port:");
            hdmiPort.displayHDMI();
        } else {
            VGAtoHDMIAdapter vgaToHDMIAdapter = new VGAtoHDMIAdapter(vgaMonitor);

            System.out.println("Using VGA Monitor:");
            vgaMonitor.displayVGA();

            System.out.println("\nUsing VGA-to-HDMI Adapter:");
            vgaToHDMIAdapter.displayHDMI();
        }
        scanner.close();
    }
}