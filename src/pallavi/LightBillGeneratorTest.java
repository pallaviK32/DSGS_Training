package pallavi;

public class LightBillGeneratorTest {

	public static void main(String[] args) {
        LightBillGenerator lightBill1 = new LightBillGenerator();
        lightBill1.setUnitsConsumed(15);
        lightBill1.printBill();
        
        LightBillGenerator lightBill2 = new LightBillGenerator();
        lightBill1.setUnitsConsumed(25);
        lightBill1.printBill();
        
    }
}
class LightBillGenerator{

    private static final float ratePerUnit = 7.5f; 
    private int unitsConsumed;

    public int getUnitsConsumed() {
		return unitsConsumed;
	}

	public void setUnitsConsumed(int unitsConsumed) {
		this.unitsConsumed = unitsConsumed;
	}

	public double calculateBillAmount() {
        return unitsConsumed * ratePerUnit;
    }
    
    public void printBill()
    {
         System.out.println("Units Consumed: " + unitsConsumed);
        
         System.out.println("Total Bill Amount: Rs. " + calculateBillAmount());
    }
}


