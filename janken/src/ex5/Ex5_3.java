package ex5;

public class Ex5_3 {

	public static void main(String[] args) {
		String title = "メールのタイトル";
		String address = "xxx.xxx@xxx";
		String text = "メールの本文";
		
		//email(title, address, text);
		email(address,text);
		
	}
	
	public static void email(String t, String a, String txt ) {
		System.out.println(a + "に、以下のメールを送信しました。");
		System.out.println("件名:" + t);
		System.out.println("本文:" + txt);
	}
	
	public static void email(String a, String txt) {
		System.out.println(a + "に、以下のメールを送信しました。");
		System.out.println("件名:無題");
		System.out.println("本文：" + txt);
	}
}
