
class ComputeElectricityBill 
{ 
	private long units;
	private double bill;
	
	//	Constructors
	public ComputeElectricityBill() {
		this.bill = 0.00;
	}
	public ComputeElectricityBill(long units) {
		this.units = units;
		this.bill = 0.00;
	}
	
	//	Setters and Getters
	
	public long getUnits() {
		return units;
	}
	public void setUnits(long units) {
		this.units = units;
	}
	public double getBill() {
		return bill;
	}
	public void setBill(double bill) {
		this.bill = bill;
	}
	
	public void ComputeBill() {
		/*
		 	1 to 100 units – Rs. 10/unit
			100 to 200 units – Rs. 15/unit
			200 to 300 units – Rs. 20/unit
			above 300 units – Rs. 25/unit
		 */
		
		if(this.units<=100)
			
			{
				this.bill=this.units*10;
			}

 	    	else if(this.units<=200)
 	    		this.bill=(100*10)+(this.units-100)*15;
		
	 	    else if(this.units<=300)
	 	    	this.bill=(100*10)+(100*15)+(this.units-200)*20;

		    else if(this.units>300)
		    	this.bill=(100*10)+(100*15)+(100*20)+(this.units-300)*25;
	}
}