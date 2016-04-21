
public class RandomNumber {
	
	private double highNum;
	private double lowNum;

	public double GetANumber() {

		double computerNum = lowNum + (int) (Math.random() * highNum);
		return computerNum;
	}
	
	public void SetLowNumber(double low) {

		lowNum = low;
	}
	
	public void SetHighNumber(double high) {

		highNum = high;
	}
}
