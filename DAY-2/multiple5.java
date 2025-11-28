package multipleof5;

public class multiple5 {

	public static void main(String[] args) {
		for(int i=0;i<=100;i++)
		{
			System.out.println(i*5);
		}
		
		// TODO Auto-generated method stub
		
		
		// type casting
		long num1 =98765432125l;
		int num = (int)num1;
		System.out.println("the " + num);
		
		float a=1.3334f;
		long b=(long)a;
		System.out.println("is " + b);
		
		double c=123.09978678767511;
		System.out.println(c);
		
		
		String d="1234";
		char[] e=d.toCharArray();
		System.out.println();
		for(char g: e) {
			System.out.println(g);
		}
		
		char j='g';
		int nw=(int)j;
		System.out.println("j"+nw);
	}

}
