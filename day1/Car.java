package week1.day1;

public class Car {
	public void applyBreak() {
    	System.out.println("BREAK");

    }
    public void applyAccelarate() {
    	System.out.println("ACCELARATE");
    }
    public void applyGear() {
    	System.out.println("CHANGE GEAR");
    }
    public void switchOnAc() {
    	System.out.println("TEMPERATURE");

    }

	public static void main(String[] args) {
		Car tata=new Car();
		tata.applyBreak();
		tata.applyAccelarate();
		tata.applyGear();
		tata.switchOnAc();

	}
}