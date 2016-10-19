
public class ObjectStatic {

	
	int x;
	static int y=2;
	
	public static void main(String[] args) {
		
        new ObjectStatic().staticfunction();
	}
	
	
	public static void staticfunction(){

		System.out.println("static function called from object "+y);
		System.out.println("static member variable "+new ObjectStatic().y);
				
	}
	

}
