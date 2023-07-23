package pallavi;

public class Machine {
	void machineDetails()
	{
		System.out.println("Showing Machine Class.... ");
	}
	
	
	public static void main(String[] args) {
		WashingMachine wm=new WashingMachine();
		wm.machineDetails();
		wm.WashingMachineDetails();
		
		App ap=new App();
		ap.mobileDetails();
		ap.appDetails();
		
	}
}

class Mobile extends Machine{  //Single Inheritance
	void mobileDetails()
	{
		System.out.println("Showing Mobile Class.... ");
	}
	
}

class App extends Mobile{   //Multilevel Inheritance
	void appDetails()
	{
		System.out.println("Showing App Class.... ");
	}
	
}

class WashingMachine extends Machine{  //Hierarchical Inheritance
	void WashingMachineDetails()
	{
		System.out.println("Showing WashingMachine Class.... ");
	}
	
	
}
