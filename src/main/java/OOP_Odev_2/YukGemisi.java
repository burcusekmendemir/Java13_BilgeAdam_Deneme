package OOP_Odev_2;

public class YukGemisi extends Gemi implements IYuk {
    @Override
    public void yukAl() {
        System.out.println(getClass().getSimpleName()+" yuk al�yor");
    }
    @Override
    public void yukBosalt() {
        System.out.println(getClass().getSimpleName()+" yuk  bosalt�yor");
    }

}
