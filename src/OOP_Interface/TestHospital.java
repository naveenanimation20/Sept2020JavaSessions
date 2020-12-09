package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {

		
		FortisHospital fh = new FortisHospital();
		fh.audiologyServices();
		fh.emergencyServices();
		fh.ENTServices();
		fh.gyncServices();
		fh.physioServices();
		fh.pathalogy();
		USMedical.minFee();
		System.out.println(USMedical.admission_fee);//50
		//USMedical.admission_fee = 100;
		
		//Top Casting:
		USMedical us = new FortisHospital();//child class object can be referred by parent interface ref variable.
		us.audiologyServices();
		us.emergencyServices();
		us.physioServices();
		us.orthoServices();
		
		//Down Casting -- not allowed at compile time
		//FortisHospital fh1 = (FortisHospital) new USMedical();
		
		
		
	}

}
