class Punkt
{
    int x;
    int y;
    Punkt(int x,int y)
    {
        this.x = x;
        this.y = y;
    }
    Punkt PobierzWspolrzedne()
    {
        Punkt punkt = new Punkt(x,y);
        return punkt;
    }
}
public class Main {
    public static void main(String[] args) {
        Punkt miejsceZerowe = new Punkt(15,0);
        System.out.println(miejsceZerowe.x);
        Punkt miejsce = miejsceZerowe.PobierzWspolrzedne();
        System.out.println(miejsce.y);
    }
}