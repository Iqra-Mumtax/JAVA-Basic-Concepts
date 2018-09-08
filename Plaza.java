// Name:	Iqra Mumtaz
// Roll No.:	L144121
// Course (Section):	Software for Mobile Devices (B)
// Assignment 1: Java Concepts Basic

// A Class (Plaza) extending ("is-a") Class Building and implementing three Interfaces (Apartment, Shop, Office) 

import java.util.Random;

public class Plaza extends Building implements Apartment, Shop, Office{

private class Dates{		//private nested class for Date (Date of renting apartment or room in plaza)
	int dt;
	String dy;
	int mnth;
	int yr;
	
	Dates(int dt, String dy, int mnth, int yr){	//overloaded constructor
		this.dt = dt;
		this.dy = dy;
		this.mnth = mnth;
		this.yr = yr;		
	}	
}

public static class Parking{	//public static nested class
	int CarsCounts;
	public int ParkCount() {
		return this.CarsCounts++;
	}
}
	
//following are data members of class Plaza
private final Dates date;	//start of date for renting room in plaza
private static int OwnersCount = 0;	

	Plaza(String Name) {
		System.out.println("I am Plaza.");
		
		//Date dw = new Date();	//getting PC current date
		//System.out.println(dw.toString());
		Dates date = new Dates(7,"Friday",9,2018);
		this.date = date;
		//this.date = dw;
	}

	public void SetDate(int dt, String dy, int mnt, int yr) {
		this.SetDate(dt, dy, mnt, yr);
	}
	
	public static void Method1() {
		System.out.println("Static Method");		
	}
	
	public final void Method2() {
		System.out.println("Final Method");
	}
	
	@Override
	public void OfficeManager() {
		System.out.println("Office Manager is Ricky.");
	}

	@Override
	public void OfficeEmployeCount() {
		System.out.println("We are Hiring.");
	}

	@Override
	public void ShopOwner() {
		System.out.println("Shop owner is Darren.");
	}

	@Override
	public void ShopType() {
		System.out.println("Branded Cloth Shop.");
	}

	@Override
	public void ApartmentHead() {
		System.out.println("Apartment Owner is Smith.");
	}

	@Override
	public void ApartmentType() {
		
		Random r = new Random();
		if (r.nextInt()<50) {
			System.out.println("Apartment type is GOLD.");
		}
		
		else if (r.nextInt()>50 && r.nextInt()<100) {
			System.out.println("Apartment type is SILVER.");
		}
		
		else
			System.out.println("Apartment type is PLATINUM.");
	}

	@Override
	public void Area() {
		
		Random r = new Random();
		if (r.nextBoolean() == true) {
			System.out.println("Area of Plaza is 12 Kanal.");
		}
		else
			System.out.println("Area of Plaza is 30 Kanal.");
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
	public static void main(String[] args) {

		Building Building1 = new Plaza("Building One");
		Plaza Plaza1 = new Plaza("PLAZA ONE");
		
		System.out.println("\n<<< WELCOME TO PLAZA ONE >>>\n");
				
		//following try-catch is for handling un-checked exceptions (Checked exceptions are compile time which are already been handled before execution)
		try {	//this block may cause an exception
			
			Building1.Area();
			
			//Testing Abstract Class Methods
			Plaza1.Area();
			Plaza1.SetName("PLAZA-A-ONE");
			//Testing Interface Class - Apartment Methods
			Plaza1.ApartmentHead();
			Plaza1.ApartmentType();
			//Testing Interface Class - Shop Methods
			Plaza1.ShopOwner();
			Plaza1.ShopType();
			//Testing Interface Class - Office Methods
			Plaza1.OfficeManager();
			Plaza1.OfficeEmployeCount();
			//Testing static and non-static methods
			Plaza1.Method1();
			Plaza1.Method2();
			//Using static variable
			Plaza1.OwnersCount++;
		}
		
		catch (Exception e){	//error handling block
			System.out.println("Catch Code Block.");
		}
		
		finally {	//block must be executed
			System.out.println("\n<<< THANKS FOR VISITING "+ Plaza1.GetName() + ">>>\n");
		}		
	}
}