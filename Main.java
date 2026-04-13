package bankAprill;




class accholderDetails{
	String accountholderName;
	String adress;
	void details() {
		accountholderName ="vineeth";
		adress ="kota";
	System.out.println( "accountholderName: "+accountholderName);
	System.out.println("adress: "+adress);
}
}

class accountdetails extends accholderDetails{
	long accountNumber;
	long ifsc_code;
	String branch;
	void acc_details() {
		accountNumber = 123456789l;
		ifsc_code =1234l;
		branch ="kota";
		System.out.println("accountNumber: "+accountNumber);
		System.out.println("ifsc_code: "+ifsc_code);
		System.out.println("branch: "+branch);
		
	}
}

class debitcardDetails extends accholderDetails {
	long debitcardNumber;
	int pin;
	
	void debit() {
		
		debitcardNumber =987654321l;
		pin =12345;
		
		System.out.println("debitcardNumber: "+debitcardNumber);
		System.out.println("pin: "+pin);
		
	}

	}

	
public class Main {

	public static void main(String[] args) {
		
		System.out.println("------welcome------");
		 accountdetails bbb = new  accountdetails();
		 
		 bbb.details();
		bbb. acc_details();
		
		 System.out.println("-----------------------");
		
		debitcardDetails aaa=new debitcardDetails();
		aaa.details();
		
		aaa.debit();
		 
		
System.out.println("--------ok done--------");
		
		
	}

}







