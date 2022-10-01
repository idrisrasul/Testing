package Newpro;

public class Forloop {
	public void loop1() {
		int a=0;
		for(a=0;a<5;a++) {
			System.out.println(a);
		}
	}
	public void loop2() {
		int a;
		for(a=1;a<30;a++) {
			if(a%2==0) {
				System.out.println("This is even :"+a);
			}
		}
	}
	public void loop3() {
		int a;
		for(a=1;a<30;a++) {
			if(a%2==1) {
				System.out.println("This is ODD :"+a);
			}
		}
	}
	public void loop4() {
		int a=1;
		while(a<=10) {
			System.out.println(a);
			a++;
		}
	}
	public void loop5() {
		int a=1;
		while(a<=10) {
			if(a%2==0) {
				System.out.println(a);
				
			}
			a++;
		}
	}
	public void sum() {
		int a=1;
		int evencount=0;
		int oddcount=0;
		while(a<=10) {
			if(a%2==0) {
				 evencount=evencount+1;
			}else {
				 oddcount=oddcount+1;
				
			}
			a++;
		}
		System.out.println("even number count :"+evencount);
		System.out.println("odd number count :"+oddcount);
	}
	public void sum_count() {
		int a=1;
		int evencount=0;
		int evensum=0;
		int oddcount=0;
		int oddsum=0;
		while(a<=10) {
			if(a%2==0) {
				 evencount=evencount+1;
				 evensum=evensum+a;
			}else {
				 oddcount=oddcount+1;
				 oddsum=oddsum+a;
			}
			a++;
		}
		System.out.println("even number count :"+evencount);
		System.out.println("odd number count :"+oddcount);
		System.out.println("even number sum :"+evensum);
		System.out.println("odd number sum :"+oddsum);
	}
	
	public void reverse() {
		int a=12345;
		int b=0;
		int c=0;
		while(a>0) {
			b=a%10;
			a=a/10;
			c=(c*10)+b;
		}
		System.out.println("reverse number is :"+c);
		
	}
	public static void main(String[] args) {
		Forloop fb=new Forloop();
		fb.loop1();
		fb.loop2();
		fb.loop3();
		fb.loop4();
		fb.loop5();
		fb.sum();
		fb.sum_count();
		fb.reverse();
	}
}
