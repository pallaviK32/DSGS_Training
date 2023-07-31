import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		FileOutputStream fileOutputStream = new FileOutputStream("disease.txt", true); 
		
		String str="Welcome to Hospital Managament system";
		
		byte array[] = str.getBytes(); 
		fileOutputStream.write(array);
		
		fileOutputStream.close();
		
		
		
		FileReader fileInputStream = new FileReader("Disease.txt");

		int theChar=fileInputStream.read(); 
		
		while(theChar != -1 ) { //-1 is EOF 
			System.out.print((char)theChar);
			theChar=fileInputStream.read(); //read successive letter
			Thread.sleep(100);
		}
		fileInputStream.close();
	
	 // Creating some sample doctors
		Doctor doctor1 = new Doctor("Dr. Smith","Cardiology");
		Doctor doctor2 = new Doctor("Dr. Johnson","Orthology"); 

	 // Display doctor information
		doctor1.displayInfo();
		doctor2.displayInfo(); 
	 
	 
		Patient patient1 = new Patient("Ram Shinde", 25, "Fever");
		 Patient patient2 = new Patient("Snehal kadam", 30,  "Influenza");
		 Patient patient3 = new Patient("Adesh Kale", 45, "Broken Arm");

	     
	        Thread thread1 = new Thread(patient1);
	        Thread thread2 = new Thread(patient2);
	        Thread thread3 = new Thread(patient3);

	        thread1.start();
	        thread2.start();
	        thread3.start();

	        // Wait for all patient threads to complete
	        try {
	            thread1.join();
	            thread2.join();
	            thread3.join();
	        } catch (InterruptedException e) {
	            System.out.println("Main thread interrupted.");
	        }
	        
	        patient1.display();
	        patient2.display();
	        patient3.display();

	       // System.out.println("All patients have completed treatment.");
			    }
	


	}
