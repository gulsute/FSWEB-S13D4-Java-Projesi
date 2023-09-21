import com.workintech.s13g4.Player;
import com.workintech.s13g4.Point;
import com.workintech.s13g4.Weapon;

public class Main {
    public static void main(String[] args) {
        Point first = new Point( 6,5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point(0,0);
        System.out.println("distance()= " + point.distance());
        System.out.println("---------------------");

        Player player1 = new Player("güls", 1000, Weapon.AXE);
        System.out.println(player1);
        player1.loseHealth(80);
        System.out.println(player1);
        player1.restoreHealth(200);
        System.out.println(player1);
        player1.loseHealth(50);
        System.out.println(player1);

    }
}