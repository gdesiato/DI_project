package main;

public class Computer {

    // LOOSE COUPLING
    private Monitor monitor;
    private HardDrive hardDrive;

    // CONSTRUCTOR INJECTION
    public Computer(Monitor monitor, HardDrive hardDrive) {
        this.monitor = monitor;
        this.hardDrive = hardDrive;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    // SETTER INJECTION
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    // SETTER INJECTION
    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }
}
