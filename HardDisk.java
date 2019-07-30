package facade_skritaya_realizachiya;

public class HardDisk {

    public void copy(DVD dvd) {
        if (dvd.isload) {
            System.out.println("Copy is loading");
        } else {
            System.out.println("Put disk inside");
        }
    }
}
