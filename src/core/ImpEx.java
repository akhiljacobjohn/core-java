package core;



public class ImpEx implements InEx {
	
	enum DAYS_OF_THE_WEEK{
		
	};

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return "Audi";
	}

	@Override
	public int getNum() {
		// TODO Auto-generated method stub
		return 8;
	}
	
	
	

	
	
	@Override
	public String getStr() {
		// TODO Auto-generated method stub
		return "Hello";
	}

	@Override
	public String getNumAgain() {
		// TODO Auto-generated method stub
		return InEx.super.getNumAgain();
	}

	public static void main(String[] args) {

		
		InEx ex = new ImpEx();
		System.out.println(ex.getBrand());
		System.out.println(ex.getNum());
		
		System.out.println(ex.getStr());
		System.out.println(ex.getNumAgain());
		
		System.out.println(STR);
	}
	

}
