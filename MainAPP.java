package facade_skritaya_realizachiya;

public class MainAPP {

    public static void main(String[] args) {
        Power power = new Power();
        DVD dvd = new DVD();
        HardDisk hd = new HardDisk();
        
        power.on();
        dvd.load();
        hd.copy(dvd);
        dvd.unload();
    }

}
