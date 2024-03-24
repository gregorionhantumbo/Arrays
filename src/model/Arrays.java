package model;
public class Arrays {
	public static void main(String[]args) {
		int [] num = new int [10];
		int par = 2;
		for (int i = 0;i < 10;i++) {
			num[i] = par;
			par += 2;
		}
		for (int i = 0;i < num.length;i++) {
			System.out.println("Na posicao " + i + " tem " + num[i]);
		}
	}
}
