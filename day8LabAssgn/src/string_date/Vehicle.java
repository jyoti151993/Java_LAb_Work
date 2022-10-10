package string_date;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Vehicle {
	private String chasisNo;// unique ID
	private String model;
	private double price;
	//add manufacture date n make necessary changes
   private Date manufactureDate;
   
   //create instance of SINGLE SimpleDateFormat class :for parsing(string-->date format)
   // Date n for formatting (Date-->Single)
	public static SimpleDateFormat sdf;//sdf=null'
	static {
		//init SDF with pattern
		sdf=new SimpleDateFormat("yyyy-MM-dd");
	}
	


	public Vehicle(String chasisNo, String model, double price, Date manufactureDate) {
		super();
		this.chasisNo = chasisNo;// unique iD
		this.model = model;
		this.price = price;
		this.manufactureDate=manufactureDate;
	}

	@Override
	public String toString() {
		return "Vehicle [chasisNo=" + chasisNo + ", model=" + model + ", price=" + price +",Manufacturedate on"+sdf.format(manufactureDate);
	}

	@Override
	public boolean equals(Object anotherObject) {
		System.out.println("in vehicle's equals");
		if (anotherObject instanceof Vehicle) {
			Vehicle anotherVehicle=(Vehicle)anotherObject;
	return (chasisNo.equals(anotherVehicle.chasisNo)&&manufactureDate.equals(anotherVehicle.manufactureDate)) ;//based upon string's class equal ie content equality
		}//==
		return false;
		}
	
}
