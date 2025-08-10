package corejavasvit.tnsif;
//online food delivery
public class Datatype_demo {

	public static void main(String[] args) {
		//primitive datatype
		
		int orderId = 101;
		double price = 299.99;
		boolean isdelivered = false;
		char rating = 'A';
		float deliveryDistance = 5.3f;
		long delivereyBoyPhoneNo = 897165432;
		byte deliverytime = 45;
		short restaurantid = 12;
		
		//non-primitive datatype
		
		String customerName = "Anjali";
		String fooditems[] = {"burger","fries","coke"};
		
		
		//order summery
		System.out.println("order Summery");
		System.out.println("Customer Name:" +customerName);
		System.out.println("Order id :" +restaurantid);
		System.out.println("DeliveryBoy Number:" +delivereyBoyPhoneNo);
		System.out.println("food items:" );
		for(String item : fooditems) {
			System.out.println("- "+item);
			
		}
		System.out.println("Total price:" +price);
		System.out.println("Deliveer distance:" +deliveryDistance);
		System.out.println("is Deliverd:"+isdelivered);
		System.out.println("Rating:"+rating);
		
		
		
	}

}
