package Newpro;

public class supermark {

	private String vegname;
	private String nonvegname;
	private String milkname;
	
	public supermark(String veg,String nonveg,String milk) {
		this.vegname=veg;
		this.nonvegname=nonveg;
		this.milkname=milk;
	}
	public void Newsupermark() {
		String vegrate=vegname;
		String nonvegrate=nonvegname;
		String milkrate=milkname;
		System.out.println("print All Items names :"+vegrate+","+nonvegrate+","+milkrate);
	}
	
	public static void main(String[] args) {
		supermark sp=new supermark("carrot","mutton","aavin");
		sp.Newsupermark();
	}
}