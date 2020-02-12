package skillrack;
import java.io.*;
import java.util.*;
public class all_in_one2 
{
static public void main(String... args)
{
	
	Scanner sc=new Scanner(System.in);
	
	/*String s=sc.nextLine();
	
	s.replace("h", "");     // both should be string or both shold be chactr
	
	//or
	s.replace('h','g');     // null cannot be a charcter
	
	
	s.startsWith("pk");
	s.startsWith("p");   //should be string
	s.endsWith("fgd");   //should be string
	
	s.indexOf('g');
	s.indexOf("fgdf");     //starting address lega
	
	///  == is used only in charcter
	//for string we need to use s1.equals(s2);
	
	
	//to send hashset in some function what we do is , let we have 
	//  two hshset
	*/
	
	HashSet<String> hs1=new HashSet<String>();
	HashSet<String> hs2=new HashSet<String>();
	boolean hh=hs1.isEmpty();System.out.println(hh);



	
	hs1=check(hs1,hs2);
	hs2=check(hs1,hs2);
	System.out.println(hs1);    // both is not allowed in one statement like (hs1+hs2)
	System.out.println(hs2);
}
	public static HashSet<String> check(Collection<String> hs1, Collection<String> hs2)
	{	
		HashSet<String> list=new HashSet<String>();
		list.add("hello");
		list.add("world");
		// to print elemnts from hashset  and storing in array also
		int k=0,i;
		String ss[]=new String[list.size()];
		for(String z: list)
		{
			System.out.println(z);
			ss[k]=z;
		}
		
		for(i=0;i<list.size();i++)
			System.out.print(ss[i]+"  ");
		
		return list;
		
//-----------------------------------------------------------------------------------------------------

//Split 
class abc
{
static public void main(String... args)
{
Scanner sc=new Scanner(System.in);

String st="14%2 15*55-49.2";

//String s[]=st.split("[-.*% ]");    //to use multiple delimiter , just write all in one set   here we are using - . * % space
String s[]=st.split("\\W");				//to use all delimiter presrnt in string , just use "\\W"      W should be capital

for(int i=0;i<s.length;i++)
	System.out.println(s[i]);
}
}		
//------------------------------------------------------------------------------------------------------------------


two Null Strings are also considered to be equals
if we do s.substring(2,2);
then it will have a null String in it
so be careful while finding all sub strings of a string
}


------------------------------
import java.util.*;
import java.io.*;
import javax.script.*;
class n
{
	public static void main(String[] args) throws Exception
	{
		ScriptEngineManager manager = new ScriptEngineManager();
    	ScriptEngine engine = manager.getEngineByName("js");        
    	Object result = engine.eval("3+4");
		System.out.println(result);
	}
	
	
	
	
	https://www.javatpoint.com/java-hashmap
	
	https://www.javatpoint.com/access-modifiers

}


