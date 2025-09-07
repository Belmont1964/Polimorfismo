package Entities;

import java.util.Date;
import java.text.SimpleDateFormat; 

public class UsedProducts extends Product {
	
	private Date manufactureDate;
	
	
	
	public UsedProducts () {
		
	}

	public UsedProducts(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	
	
	
	
	

	public Date getManufactureDate() {
		return manufactureDate;
	}


	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}


	@Override
	public String toString() {
		SimpleDateFormat  sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		return name + " (used) $ " 
			   + String.format("%.2f", price)
			   + " (Manufacture date: "
			   + sdf1.format(manufactureDate)
			   + ")";
	}
	
}
