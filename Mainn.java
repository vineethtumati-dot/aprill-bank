package bankAprill;


class Testing1 {

	long acc_number;
	int balance ;

	
	Testing1(){
		acc_number =12345678l;
		balance =1000;
		System.out.println("Account number : "+acc_number);
		System.out.println("Balance : "+balance);
	}
}
	class Testing2 extends Testing1{
		
	
	Testing2 (int deposit){
		super();
		balance +=deposit;
			
		System.out.println("deposited amount:"+deposit);
		System.out.println("balance : "+ balance);
		
	}
	}
	
	class Testing3 extends Testing2{
	Testing3 (int withdraw,int charges){
		super(200);
		 balance -=withdraw;
		balance -=charges ;
		System.out.println("withdraw : "+withdraw);
		System.out.println("charges : "+charges);
		System.out.println("balance : "+balance);
	}
	}
public class Mainn {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testing3 t=new Testing3(1000,10);
	}
}

