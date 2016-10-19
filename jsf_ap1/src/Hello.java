import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

import com.sun.corba.se.spi.orbutil.fsm.Action;



public class Hello{

	private int count;
	private String name;
	
	
	
	public Hello() {
		init();
	}
	public void init(){
		
		
		
		value();
		
	}
	public void one(){
		
	}
	public void two(){
		
	}
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

    public void value(){
    	setName("tabish");
    	setCount(3);
    	
    	System.out.println(getName());
    	System.out.println(getCount());
    }
    public void onBtn(ActionEvent a)
    	{
    		System.out.println("In Action Event onBtn METHOD ");
    		setName("tabishaction");
        	setCount(30);
    		    		
    	}
}
