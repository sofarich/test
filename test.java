package test;

public class Main {

	public static void main(String[] args) {
		String year = "";
		for (int i = 1;i<=100;i++) {
			
			if ((i ==1)||(i%10==1)&&(i>20)) {
				year = " год";
			}
			
			else if (i <=4) {
				year = " года";
			}
			
			else if ((i >20)&&(i%10<=4&&i%10>1)) {
				year = " года";
			}
			
			else {
				year = " лет";
			}
			
			
		System.out.println(i + year);
		}
	}

}
