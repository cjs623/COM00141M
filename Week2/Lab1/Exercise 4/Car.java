class Car
{
    String registration;
    String make;
    double price;
    
    //Methods to set car details below here
    
    public void setReg(String regIn) {
    	registration = regIn;
    }
    
    public void setMake(String makeIn) {
    	make = makeIn;
    }
    
    public void setPrice(double priceIn) {
    	price = priceIn;
    }    
    
    //displayCarDetails()
    
    public void displayCarDetails(){
		System.out.println("Registration set to: " + getRegistration());
		System.out.println("Make set to: " + getMake());
		System.out.println("Price set to: " + getPrice());
    }
    
    
    //Try out these 'getter' methods after you have set info.
    public String getRegistration()
    {
       return registration;
    }
    
    public String getMake()
    {
        return make;
    }

    public double getPrice()
    {
        return price;
    }
}


