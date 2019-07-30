package facade_skritaya_realizachiya;

public class DVD {

    boolean isload;

    public void load() {
        if (isload) {
            System.out.println("DISK inside");
            return;
        } else {
            isload = true;
            System.out.println("DISK inside in DVD");
        }
    }

    public void unload() {
        if (!isload) {
            System.out.println("DVD don`t have a disk inside");
            return;
        } else {
            isload = false;
            System.out.println("DISK output");
        }
    }
}
