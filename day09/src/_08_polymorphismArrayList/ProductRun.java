package _08_polymorphismArrayList;

public class ProductRun {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		GameDevice game = new GameDevice();
		
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new GameDevice());
		b.info();
		
		b.refund(tv);
		b.info();
		}
}
