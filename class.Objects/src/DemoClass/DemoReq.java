package DemoClass;

public class DemoReq {
	
	static int add;

	public int Addition_Demo()
	{
		int a = 10;
		int b = 20;
		
		 add = a+b;		
		return add;
		
	}
	public static void main(String[] args) 
	{
		DemoReq Add1;
		Add1 = new DemoReq();
		Add1.Addition_Demo();
		System.out.println(add);
		
	}

}
