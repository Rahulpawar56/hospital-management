import java.util.*;

public class HospitalManagement {
	private Map<Integer, Patient> patients = new HashMap<>();
	private int count = 1;

	public void addNewPatient(String name, String adress, String mo, int age) {
		Patient patient = new Patient(count, name, mo, adress, age);
		patients.put(count, patient);
		count++;
		System.out.println("==================================================");
	}
	
	public void viewAllDetails() {
		if(patients.isEmpty())
		{
			System.out.println("No Patients are here");
			System.out.println("==========================================================");
		}
		else
		{
			for(Patient val:patients.values()) {
				System.out.println(val);
			}
			System.out.println("==========================================================");
		}
	}
	
	public void removePatientDetails(int id) {
		if(patients.containsKey(id))
		{
			patients.remove(id);
			System.out.println("Remove Patients detils succesfully");
			System.out.println("==========================================================");
		}
		else
		{
			System.out.println("No Patients details are here ...");
			System.out.println("==========================================================");
		}
	}
}
