package interface02_다중;

public class Duck implements Swimmable, Flyable {

	@Override
	public void swim() {
		System.out.println("수영");
	}
	
	@Override
	public void fly() {
		System.out.println("하늘 날기");
	}
	
	

}
