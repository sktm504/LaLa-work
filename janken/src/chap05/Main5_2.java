package chap05;

public class Main5_2 {
  public static void main(String[] args) {
	  System.out.println("メソッドを呼び出します。");
	  String msg = "五郎さん、こんにちは";
	  hello(msg);
	  int x = 100;
	  int y = 10;
	  int ans = add(x, y);
	  add(x, y);
	  System.out.println(x + "+" + y + "=" + ans);
	  System.out.println("メソッドの呼び出しが終わりました。");
  }
  public static void hello(String m) {
	  System.out.println(m);
  }
  
  public static int add(int x, int y) {
	  int ans = x + y;
	 return ans;
  }
}
