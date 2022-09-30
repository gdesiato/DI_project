package main;

public class AsusHardDrive implements HardDrive{

    @Override
    public void SaveToDisk(String info) {
        System.out.println("Saving to Asus Hard Drive " + info);

    }
}
