package corejavasvit.tnsif;

public class Typecasting {

	public static void main(String[] args) {
		//widening
		int quality = 3;
		double priceperitem = 99.50;
		double totalprice = quality * priceperitem;
		
		//narrowing
		double discount = 10.75;
		int roundeddiscount = (int)	discount; 
		
		double finalAmount = totalprice -  roundeddiscount;
		
		System.out.println ("online shopping summery");
		System.out.println("Final amount : " + finalAmount);
	}

}
