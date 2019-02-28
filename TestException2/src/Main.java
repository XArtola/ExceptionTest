import java.util.Scanner;

import com.zubiri.Person;

public class Main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Person person = new Person();

		boolean notFinished = true;
		int cnt = 0;
		while (notFinished) {

			try {

				if (cnt == 0) {
					System.out.println("Enter the dni");
					String dni = sc.next();
					sc.nextLine();
					person.setDni(dni);
					cnt++;
				}

				if (cnt == 1) {
					System.out.println("Enter the age");
					int age = sc.nextInt();
					sc.nextLine();
					person.setAge(age);
					cnt++;
				}

				if (cnt == 2) {
					System.out.println("Enter the birthYear");
					String birthYear = sc.next();
					sc.nextLine();
					person.setBirthYear(birthYear);
					cnt++;
				}

				if (cnt == 3) {
					System.out.println("Enter the city");
					String city = sc.next();
					sc.nextLine();
					person.setCity(city);
					cnt++;
				}
				cnt = 0;
				notFinished = false;

			}

			catch (Exception e) {

				System.out.println(e);
				e.printStackTrace();

			}

		}
		
		System.out.println("Person information");

		System.out.println("Age is " + person.getAge());

		System.out.println("birthYear is " + person.getBirthYear());

		System.out.println("City is " + person.getCity());

	}

}
