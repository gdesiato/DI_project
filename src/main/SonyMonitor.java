package main;

public class SonyMonitor implements Monitor {

    @Override
    public void brighten(int level){
        System.out.println("Brightening Sony Monitor by: " + level);
    }
}
