package Newpro;

public class stringconcept {

	public void string1() {
		String s="insha allah";
		System.out.println(s.charAt(1));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.indexOf("a"));
		System.out.println(s.startsWith("insha"));
		System.out.println(s.endsWith("ah"));
	}
	public void string2() {
		String a="masha allah";
		String b="alhamdulillah";
		System.out.println(a.contains(b));
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(a));
		String c="ALLAH";
		String d="ALLAH";
		System.out.println(c.equals(d));
		System.out.println(c.equalsIgnoreCase(d));
		System.out.println(c.substring(3));
		System.out.println(a.replace("masha","insha"));
		System.out.println(a.substring(0,5));
		
	}
	
	public void string3() {
		String s="mohammed razak";
		int count_of_M=0;
		int count_of_A=0;
		int other_count=0;
		for(int i=0;i<s.length();i++) {
			char a=s.charAt(i);
			if(a=='m') {
				count_of_M=count_of_M+1;
			}else if(a=='a') {
				count_of_A=count_of_A+1;
			}else {
				other_count=other_count+1;
			}
		}
		System.out.println(count_of_M);
		System.out.println(count_of_A);
		System.out.println(other_count);
	}
	public void string4() {
		String s="{}{{{}}}}{";
		int pair_count=0;
		int unpair_count=0;
		for(int i=0;i<s.length()-1;i++) {
			char a=s.charAt(i);
			char b=s.charAt(i+1);
			if((a=='{')&&(b=='}')){
				pair_count=pair_count+1;
			}else {
				unpair_count=unpair_count+1;
			}
		}
		System.out.println("Total pair count :"+pair_count);
		System.out.println("Total unpair count :"+unpair_count);
	}
	
	public static void main(String[] args) {
		stringconcept cd=new stringconcept();
//		cd.string1();
//		cd.string2(); 
//		cd.string3();
		cd.string4();
	}
}
