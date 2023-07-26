package pallavi;

public class DivisionThreadTest {
	
	    public static void main(String[] args) {
	        int numerator = 10;
	        int denominator = 0; // Change this value to any non-zero value to avoid division by zero

	        DivisionThread divisionThread = new DivisionThread(numerator, denominator);
	        divisionThread.start();

	        try {
	            divisionThread.join();
	            System.out.println("Result of division: " + divisionThread.getResult());
	        } catch (InterruptedException e) {
	            System.err.println("Thread interrupted: " + e.getMessage());
	        }
	    }
	}

class DivisionThread extends Thread {
	    private int numerator;
	    private int denominator;
	    private double result;

	    public DivisionThread(int numerator, int denominator) {
	        this.numerator = numerator;
	        this.denominator = denominator;
	    }

	    public double getResult() {
	        return result;
	    }

	    @Override
	    public void run() {
	        try {
	            result = divideNumbers(numerator, denominator);
	        } catch (ArithmeticException e) {
	            System.err.println("Error: " + e.getMessage());
	        }
	    }

	    private double divideNumbers(int numerator, int denominator) {
	        if (denominator == 0) {
	            throw new ArithmeticException("Cannot divide by zero.");
	        }
	        return (double) numerator / denominator;
	    }
	}

	
	


