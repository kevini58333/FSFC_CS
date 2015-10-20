
public class Controller {
	public static void main(String[] args){
		float nOne, nTwo;
		Calc KevinsCalc = new Calc();
		
		nOne = Float.parseFloat(args[0]);
		nTwo = Float.parseFloat(args[1]);
		
		KevinsCalc.setNumOne(nOne);
		
	}
}
