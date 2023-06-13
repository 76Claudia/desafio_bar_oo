package entities;

public class Bill {

	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	public double ticket() {
		if(gender == 'F') {
			return 8.0;
		}
		else {
			return 10.0;
		}
	}
	
	
	public double feeding() {
		return beer * 5.0 + softDrink * 3.0 + barbecue * 7.0;
	}
	
	public double cover() {
	   int feeding = 0;
	if (feeding > 30) {
		return 0.0;
	}
	   else {
		   return 4.0;
	   }
	
	}
	public double total() {
		
			int cover = 0;
			int ticket = 0;
			int feeding = 0;
			return feeding + cover + ticket;
	}
    
    
	}


