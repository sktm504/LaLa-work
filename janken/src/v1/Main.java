package v1;

public class Main {

	public static void main(String[] args) {
		String userName = "";
		if (args.length == 1) {
			userName = args[0];
		} else {
			userName = "あなた";
		}
		String[] hand = { "グー", "チョキ", "パー" };
		int com = new java.util.Random().nextInt(3);
		int user = userinput();

		System.out.println("COMの手は" + hand[com] + "です。");
		System.out.println(userName + "の手は" + hand[user] + "です");

		hantei(com, user, userName);
	}

	public static int userinput() {
		System.out.println("[0:グー],[1:チョキ],[2:パー]");
		System.out.print("数字を入力してください。 >");
		int user = new java.util.Scanner(System.in).nextInt();
		return user;
	}

	public static void hantei(int com, int user, String name) {
		// int result = (com - user +3 ) % 3;
		if (com == user) {
			System.out.println("あいこです");
		} else if ((user + 1) % 3 == com) {
			System.out.println(name + "の勝ちです");
		} else {
			System.out.println("COMの勝ちです");

		}
	}
}
