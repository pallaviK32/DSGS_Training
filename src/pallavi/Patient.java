
public class Patient extends Doctor implements Treatment, Runnable {

	String patientName;
	int age;
	String diseaseName;
	public Patient(String patientName, int age, String specialization) {
		super(doctorName, specialization);
		this.patientName = patientName;
		this.age = age;
		this.diseaseName = specialization;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	void display()
	{
		System.out.println("Patient Name: "+patientName);
		System.out.println("Age: "+age);
		System.out.println("Disease Name : "+diseaseName);
	}
		
	
}

