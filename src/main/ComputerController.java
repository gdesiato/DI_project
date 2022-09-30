package main;

public class ComputerController {

    public static void main(String[] args) {

        SonyMonitor monitor = new SonyMonitor();
        WDHardDrive hardDrive = new WDHardDrive();

        Computer computer = new Computer(monitor, hardDrive);

        computer.getMonitor().brighten(50);
        computer.getHardDrive().SaveToDisk("demo 2");

        DellMonitor monitor2 = new DellMonitor();
        AsusHardDrive hardDrive2 = new AsusHardDrive();

        Computer computer2 = new Computer(monitor2, hardDrive2);

        computer2.getMonitor().brighten(20);
        computer2.getHardDrive().SaveToDisk("demo 3");

        AppleMonitor monitor3 = new AppleMonitor();

        computer2.setMonitor(monitor3);
        computer2.getMonitor().brighten(20);

    }
}
