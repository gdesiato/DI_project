package main;

public class DellMonitor implements Monitor{

    @Override
    public void brighten(int level) {
        System.out.println("Brightening Dell Monitor by: " + level);

    }
}
