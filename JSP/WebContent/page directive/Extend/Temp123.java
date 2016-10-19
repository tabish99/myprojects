package my;
abstract public class Temp123 extends weblogic.servlet.jsp.JspBase
{
	public String show()
	{
		return "lalu from temp123 class";
	}
//abstract because (many method coming from JspBase is abstract we must not give body of those ABSTRACT METRHOD COMING FROM PARENT CLASS)
}