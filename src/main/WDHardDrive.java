package main;

public class WDHardDrive implements HardDrive{

    @Override
    public void SaveToDisk(String info){
        System.out.println("Saving to WD Hard Drive" + info);
    }
}
