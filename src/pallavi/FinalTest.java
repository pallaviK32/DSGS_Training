package pallavi;

public class FinalTest {

	public static void main(String args[])
	{
	  Hour hr1=new Hour(5);
	  hr1.calcSec();
	  
	  Hour hr2=new Hour(17);
	  hr2.calcSec();
	  
	  Hour hr3=new Hour(10);
	  hr3.calcSec();

	}
}
final class Hour
{
	int hours;
	final int minPerHour=60;
	final int secPerMin=60;
	
	Hour(int hours){
		this.hours=hours;
	}
	final void calcSec()
	{
		int seconds=hours * minPerHour * secPerMin;
		System.out.println("There are "+seconds+" seconds in "+hours+" Hours");
	}
}
