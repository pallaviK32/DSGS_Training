
public class Doctor implements Treatment {

	static String doctorName;
	String post;
	
	
	
	public Doctor(String doctorName, String post) {
		super();
		this.doctorName = doctorName;
		this.post = post;
	}

	@Override
	public void operating() {
		// TODO Auto-generated method stub
		System.out.println(doctorName+" is operating patients..");
	}
	@Override
	public void prescribing() {
		// TODO Auto-generated method stub
		System.out.println(doctorName+" is prescribing patients..");
		
	}
	void displayInfo()
	{
		System.out.println("Doctor Name: "+doctorName);
		System.out.println("Post of the Doctor "+post);
	}
}
interface Treatment 
{
	void operating();
	void prescribing();
}

class InvalidDoctorDataException extends Exception{
	InvalidDoctorDataException(String msg){
		super(msg);
	}
	
	 
		
}