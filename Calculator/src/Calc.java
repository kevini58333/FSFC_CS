
public class Calc {
	private float numOne;
	private float numTwo;
	
	public Calc (){
		
	}
	public float getNumOne(){
		return this.numOne;
	}
	public float getNumTwo(){
		return this.numTwo;
	}
	public void setNumOne(float nOne){
		this.numOne=nOne;
	}
	public void setNumTwo(float nTwo){
		this.numTwo=nTwo;
	}
	public float add(){
		return numOne+numTwo;
	}
	public float sub(){
		return numOne-numTwo;
	}
	public float multiply(){
		return numOne*numTwo;
	}
	public float div(){
		return numOne/numTwo;
	}
}
