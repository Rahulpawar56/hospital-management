
public class Patient {
	private int patientId;
	private String name;
	private String mo;
	private String adress;
	private int age;

	public Patient(int patientId,String name, String mo, String adress, int age) {
		this.patientId=patientId;
		this.name = name;
		this.mo = mo;
		this.adress = adress;
		this.age = age;
	}
	
	public int getPatientId() {
		return patientId;
	}
	
	public String toString()
	{
		return "Patient Id:"+patientId+",Patient Name"+name+",Mo:"+mo+",Adress:"+adress+",age:"+age;
	}
}
