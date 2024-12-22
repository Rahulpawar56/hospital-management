import java.util.*;

public class HospitalManagementSystemApplication {

	public static void main(String[] args) {

		HospitalManagement system = new HospitalManagement();
		Scanner xyz = new Scanner(System.in);
		while (true) {
			System.out.println("case 1:Add new Patient details");
			System.out.println("case 2:View All Patient details");
			System.out.println("case 3:remove patient details");
			System.out.println("Enter a your choice");
			int choice = xyz.nextInt();
			switch (choice) {
				case 1: {
					xyz.nextLine();
					System.out.println("Enter a patient Name");
					String name=xyz.nextLine();
					System.out.println("Adress of patient");
					String adress=xyz.nextLine();
					System.out.println("Enter a mobile Number");
					String mo=xyz.nextLine();
					System.out.println("Enter a age ");
					int age=xyz.nextInt();
					system.addNewPatient(name, adress, mo, age);
					break;
				}
				case 2: {

					system.viewAllDetails();
					break;
				}
				case 3: {
					System.out.println("Enter a remove patients  id");
					int id=xyz.nextInt();
					system.removePatientDetails(id);
					break;
				}
				default: {
					System.out.println("Wrong choice");
				}
			}
		}
	}

}
