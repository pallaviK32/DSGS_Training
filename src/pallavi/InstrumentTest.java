package pallavi;

public class InstrumentTest {
	public static void main(String[] args) {
		
	/*	Guitar guitar = new Guitar();
		guitar.use();
		guitar.tuneStrings();
		guitar.play();
		guitar.pluck();
		
		Violin violin = new Violin();
		violin.use();
		violin.tuneStrings();
		violin.play();
		violin.bow();
		*/
		
		StringBasedMusicalInstrument sbmi = new Violin();
		sbmi.use();
		sbmi.play();
		sbmi.tuneStrings();
		//sbmi.bow();
		System.out.println("------------------------------");
//The method pluck() is undefined for the 
		//type StringBasedMusicalInstrument		
		
		ElectronicGuitar eg=new ElectronicGuitar();
		eg.use();
		eg.preset();
		eg.tuneStrings();
		System.out.println("------------------------------");
		
		Cello c=new Cello();
		c.play();
		c.longBow();
		c.tuneStrings();
		
		System.out.println("------------------------------");
		
		Flute f =new Flute();
		f.use();
		f.playNote();
		f.blowAir();
	
		System.out.println("------------------------------");
		
		Harmonium h=new Harmonium();
		h.use();
		h.tunning();
		h.blowAir();
		
		System.out.println("------------------------------");
		
		DrumBasedMusicalInstrument dbmi=new Tabla();
		dbmi.tuneSurface();
		
		System.out.println("------------------------------");
		
		Dhol dhol=new Dhol();
		dhol.use();
		dhol.tuneSurface();
		dhol.playBass();
		
		System.out.println("------------------------------");
		
		SurgicalInstrument si=new SurgicalCutter();
		si.use();
		si.operate();
		
		System.out.println("------------------------------");
		
		SurgicalNeedle sn=new SurgicalNeedle();
		sn.use();
		sn.operate();
		sn.stitching();
		
		System.out.println("------------------------------");
		
		Glucometer gm=new Glucometer();
		gm.use();
		gm.operate();
		gm.displayResult(70.0f);
	
		System.out.println("------------------------------");
		
		ECGMachine ecg=new ECGMachine();
		ecg.ecgReport();
		ecg.use();
	}
}

interface Instrument
{
	void use(); //by default method is public and abstract
}
abstract class MusicalInstrument implements Instrument
{
	abstract void play();
}
abstract class StringBasedMusicalInstrument extends MusicalInstrument
{
	abstract void tuneStrings();
}
class Guitar extends StringBasedMusicalInstrument
{
	public void use() {
		System.out.println("Using Guitar...");
	}
	void play() {
		System.out.println("Playing Guitar...");

	}
	void tuneStrings() {
		System.out.println("Tuning Strings of Guitar...");

	}
	void pluck() {
		System.out.println("Plucking Strings of Guitar...");

	}
}


class Violin extends StringBasedMusicalInstrument
{
	public void use() {
		System.out.println("Using Violin...");
	}
	void play() {
		System.out.println("Playing Violin...");

	}
	void tuneStrings() {
		System.out.println("Tuning Strings of Violin...");

	}
	void bow() {
		System.out.println("Bowing Strings of Violin...");

	}
}

class ElectronicGuitar extends Guitar
{
	public void use()
	{
		System.out.println("Using Electronic Guitar......");
	}
	void preset()
	{
		System.out.println("Preseting the Electronic Guitar");
	}
}

class Cello extends Violin
{
	void longBow()
	{
		System.out.println("Long Bowing the Cello");
	}
	void tuneStrings()
	{
		System.out.println("Tuning strings of Cello");
	}
	public void use()
	{
		System.out.println("Using Cello....");
	}
	void play()
	{
		System.out.println("Playing Cello");
	}
}


abstract class AirBasedMusicalInstrument implements Instrument
{
	abstract public void blowAir();
}

class Flute extends AirBasedMusicalInstrument
{
	public void use()
	{
		System.out.println("Using Flute....");
	}
	public void blowAir()
	{
		System.out.println("Flute produces sound by blowing air..");
	}
	
	void playNote()
	{
		System.out.println("Playing correct note of the flute...");
	}
	
}

class Harmonium extends AirBasedMusicalInstrument
{
	public void use()
	{
		System.out.println("Using Harmonium....");
	}
	public void blowAir()
	{
		System.out.println("Harmonium produces sound by blowing air..");
	}
	void tunning()
	{
		System.out.println("Tunning the harmonium reeds..");
	}
}

abstract class DrumBasedMusicalInstrument implements Instrument
{
	abstract void tuneSurface();
}

class Tabla extends DrumBasedMusicalInstrument
{
	public void use()
	{
		System.out.println("Using Tabla as a DrumBasedMusicalInstrument");
	}
	void tuneSurface()
	{
		System.out.println("Tuning the tabla drumhead surface.");
	}
	void playNote()
	{
		System.out.println("Playing Notes of Tabla..");
	}
}

class Dhol extends DrumBasedMusicalInstrument
{
	public void use()
	{
		System.out.println("Using Dhol as a DrumBasedMusicalInstrument");
	}
	void tuneSurface()
	{
		System.out.println("Tuning the dhol drumhead surface.");
	}
	public void playBass() {
		
        System.out.println("Playing the bass sound on the dhol.");
    }
}

abstract class MedicalInstrument implements Instrument
{
	abstract void operate();
}

class SurgicalInstrument extends MedicalInstrument
{
	public void use()
	{
		System.out.println("Using surgical instruments..");
	}
	void operate()
	{
		System.out.println("Performing surgical operation..");
	}
}

class SurgicalCutter extends SurgicalInstrument
{
	void cut()
	{
		System.out.println("Surgical Cutter is used for cutting during surgical operation..");
	}
}

class SurgicalNeedle extends SurgicalInstrument
{
	void stitching()
	{
		System.out.println("Surgical Needle is used for stitching during surgical operation..");
		
	}
}

class PathologicalInstrument extends MedicalInstrument
{
	public void use()
	{
		System.out.println("Using Pathalogical instruments..");
	}
	void operate()
	{
		System.out.println("Operating patient using pathological instruments..");
	}
}



class Glucometer extends PathologicalInstrument
{
	public void displayResult(float glucoseLevel)
	{
        System.out.println("Displaying glucose level: " + glucoseLevel);
    }
}

class ECGMachine extends PathologicalInstrument
{
	public void ecgReport()
	{
		System.out.println("Showing ECG report..");
	}
}

