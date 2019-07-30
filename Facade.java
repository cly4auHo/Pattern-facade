package facade_skritaya_realizachiya;

public class Facade {

    Power power = new Power();
    DVD dvd = new DVD();
    HardDisk hd = new HardDisk();

    public void copy() {
        power.on();
        dvd.load();
        hd.copy(dvd);
        dvd.unload();
    }
}
