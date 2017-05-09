import java.util.Scanner;  
import java.util.Random;

public class Jar {
	String items;
	int max_value;
	
	public Jar(){
	}
	
	public void setItems(){
    System.out.println("ADMINISTRATOR SETUP");
    System.out.println("-------------------");
		System.out.print("What type of item should go in jar: ");
		Scanner sc  =new Scanner(System.in);  
		String name=sc.next(); 
		//sc.close(); 
		this.items = name;
	}
	   
	public void setMaxvalue(){
		System.out.print("What is the maximum amount of "+ items +" that should go in the jar: ");
		Scanner sc=new Scanner(System.in);  
		int name=sc.nextInt();  
		//sc.close(); 
		this.max_value = name;
    System.out.println("-------------------\n\n\n\n\n\n");
	}
	
	public int Randomnumber(){
		Random random = new Random();
		return random.nextInt(max_value);
	}
	
	public void playgame(){
		setItems();
		setMaxvalue();
    System.out.println("-----------------------------");
		System.out.println("Welcome to the guessing game!");
		System.out.print("How many "+ items+" are in the jar? Pick a number between 1 and "+ max_value + ": ");
		int random = Randomnumber();
		int count = 1;
		boolean flag = false;
		while (flag == false ){
			Scanner sc=new Scanner(System.in);
			int name = sc.nextInt();
			//sc.close();
			if (name == random){
				System.out.println("Congrats you win in "+ count + " attempts!");
				flag = true;
				//System.exit(0);
			}
			else{
				System.out.print("How many "+ items+" are in the jar? Pick a number between 1 and "+ max_value + ": ");
				count++;	
			}
		}
	}
}
