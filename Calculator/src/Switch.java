
public class Switch {
	public static void main(String args[]){
		char grade = '6';
		boolean check = false;
		switch (grade)
		{
		case 'A' :
			System.out.println("Excellent!");
			break;
			case 'B':
		case 'C' :
			System.out.println("Well done");
			break;
		case 'D' :
			System.out.println("You passed");
			break;
		case 'F' :
			System.out.println("Better try again");
			break;
		default :
			System.out.println("Invalid Grade");
			check = false;
		}
		System.out.println("Your grade is " + grade);
	}

}

