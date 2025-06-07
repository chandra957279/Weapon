package weapon_Game;
import java.util.Scanner;
public class User {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Game g = new Game();
		char c;
		do {
		Weapon w =g.selectWeapon();
		w.use();
		System.out.println("Press Y/y to Continue...");
		c =sc.next().charAt(0);
		}while(c=='Y' ||c=='y');
		System.out.println("==============Program Ends!=============");
	}
}
