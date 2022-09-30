package main;

public class AppleMonitor implements Monitor{
    @Override
    public void brighten(int level) {
        System.out.println("Brightening Apple Monitor by: " + level);
    }
}
