import java.util.Scanner;

import com.zubiri.Person;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Person person = new Person();
		
		boolean notFinished = true;
		while(notFinished) {
			
			try {
				
				System.out.println("Enter the age");
				int age = sc.nextInt();
				sc.nextLine();
				
				person.setAge(age);
				
				
				System.out.println("Enter the birthYear");
				String birthYear = sc.next();
				sc.nextLine();
				
				person.setBirthYear(birthYear);
				
				
				System.out.println("Enter the city");
				String city = sc.next();
				sc.nextLine();
				
				person.setCity(city);
				
				notFinished = false;
				
				
			}
			
			catch(Exception e) {
				
				System.out.println(e);
				
			}
			
		}
		
		System.out.println("Person information");
		
		System.out.println("Age is " +person.getAge());
		
		System.out.println("birthYear is " +person.getBirthYear());
		
		System.out.println("City is " +person.getCity());

	}

}
