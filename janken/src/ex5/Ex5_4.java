package ex5;

public class Ex5_4 {

	public static void main(String[] args) {
		double bottomm = 10.0;
		double height =5.0;
		double radius = 5.0;
		
		double area1 = calcTriangleArea(bottomm,height);
		double area2 = calcCircleArea(radius); 
		System.out.println("底辺:" + bottomm+"cm 高さ:" + height + "cm の"
				+ "三角形の面積は" + area1 +"㎠");
		System.out.println("円の半径が"+radius+"cmの場合、面積は"+ area2+"㎠");
		
	}
	public static double calcTriangleArea(double bottomm, double height) {
		return (bottomm * height) /2;
		
	}
	
	public static double calcCircleArea(double radius) {
		return  radius * radius * 3.14;
		
	}
}
