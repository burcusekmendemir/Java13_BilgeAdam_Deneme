package OOP_Odev_2;

public class KargoUcagi extends Ucak  implements IYuk {
    @Override
    public void yukAl() {
        System.out.println(getClass().getSimpleName()+" yuk alýyor");
    }
    @Override
    public void yukBosalt() {
        System.out.println(getClass().getSimpleName()+" yuk  bosaltýyor");
    }
}
