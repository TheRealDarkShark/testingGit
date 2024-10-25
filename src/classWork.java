import java.util.Date;
public class classWork {
	public static void main(String[] args) {
		Date birthday = new Date(109,0,9);
		System.out.println(birthday.getDay());
		}


	public static int rollDice() {
		int i = (int) ((Math.random()*6)+1);
		int j = (int) ((Math.random()*6)+1);
		return i+j;
	}
}