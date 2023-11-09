package OOP_Odev_2;

public class Arac implements IHareket {

    private  int hiz;

    public int getHiz() {
        return hiz;
    }

    public void setHiz(int hiz) {
        this.hiz = hiz;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "hiz=" + hiz +
                '}';
    }

    @Override
    public void hizlan() {
        System.out.println(getClass().getSimpleName()+ "  hýzlanýyor");
    }

    @Override
    public void yavasla() {
        System.out.println(getClass().getSimpleName()+"  yavaslýyor");
    }

}


