
public class day3 {
	public static void main(String[] args){
		Man a = new Man("prashant");
		System.out.println(a.name);
		Man b= new Man();
		System.out.println(b.name);
		
	}
	

}
class Man {
	String name;
	Man(String f){
		 name =f;
		
	}
	Man(){
		name =null;
	}
	
}
