public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();

        Component monitor = new Component("Monitor");
        Component keyboard = new Component("Keyboard");
        Component mouse = new Component("Mouse");

        computer.addObserver(monitor);
        computer.addObserver(keyboard);
        computer.addObserver(mouse);

        computer.setStatus("Power On");
        computer.setStatus("Booting up");

        computer.removeObserver(monitor);

        computer.setStatus("Shutting down");
    }
}
