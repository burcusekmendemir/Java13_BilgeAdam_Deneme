package OOP_Odev_2;

public class Ucak extends  Arac  implements IHavaAraci {

    private int kanatUzunlugu;

    public int getKanatUzunlugu() {
        return kanatUzunlugu;
    }

    public void setKanatUzunlugu(int kanatUzunlugu) {
        this.kanatUzunlugu = kanatUzunlugu;
    }

    @Override
    public String toString() {
        return "Ucak{" +
                "kanatUzunlugu=" + kanatUzunlugu +
                '}';
    }

    @Override
    public void kalkisYap() {
        System.out.println(getClass().getSimpleName()+ " Ucak kalkýyor");
    }

    @Override
    public void inisYap() {
        System.out.println( getClass().getSimpleName()+" Ucak iniyor");
    }


}
