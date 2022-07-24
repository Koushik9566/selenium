package week1.day1;

public class TwoWheeler {
	int noOfWheeles=2;
	short noOfMirrors=5;
	long chassIsNumber=14345486580L;
	boolean isPunctred=false;
	String bikeName="passionpro";
	double runningKm=23456.34434;


	public static void main(String[] args) {
		TwoWheeler bike=new TwoWheeler(); 
		System.out.println(bike.noOfWheeles);
		System.out.println(bike.noOfMirrors);
		System.out.println(bike.chassIsNumber);
		System.out.println(bike.isPunctred);
		System.out.println(bike.bikeName);
		System.out.println(bike.runningKm);
	}

}