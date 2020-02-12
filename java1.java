package skillrack;
import java.io.*;
import java.util.*;
public class all_in_one
{
static public void main(String... args)throws IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	//---------------------------------------------------------
	
/*	
	char c= (br.readLine()).charAt(0);
	int a=Character.getNumericValue(c);
	System.out.println(a);
	int b=(int)c;
	System.out.println(b);

//-------------------------------------------------------------------	
	String p=br.readLine();
	long d=Long.parseLong(p);
	System.out.println(d);

//-------------------------------------------------------------------
	
	char ch=(br.readLine()).charAt(0);
	String stt=Character.toString(ch);
	System.out.println(stt);
	
	//---------------------------------------------------------------
	
	//String to character array
	String sttt=br.readLine();
	char chh[]=sttt.toCharArray();
	System.out.println(chh[1]);
	//----------------------------------------------------------------
	
	//charcter array to String
	String nst=new String(chh);
	System.out.println(nst);
	
	//----------------------------
	
	//spiltting in one line and getting in array
	
	String stst=br.readLine();
	String k[]=stst.split(" ");  /// some regexp will not get split of "." and other , so we need to use "\\."  for that like,,, it works for all
	
	// to split string through .  we use    string k[]=s.split("\\.");
	
	int len=k.length;
	int i=0;
	int hg[]=new int[len];
	for(String z:k)       ///jab enchanced for loop use karte hai toh hamesha datatype "FOR" loop ke andar likhe hai..
	{
		hg[i]=Integer.parseInt(z);
				i++;
	}
		
	
	System.out.println(len);
	System.out.println(k[3]);
	System.out.println(hg[3]+hg[4]);
	
	
	
//-----------------------------------------------------------
	
	//String reverse
	String pure=br.readLine();
	String rev=new StringBuffer(pure).reverse().toString();
	System.out.println(pure);
	System.out.println(rev);
	
	String hkhk=pure.replace('l', 'p');
	System.out.println(hkhk);
	
	//-----------------------------------------------
	
	
	// s1.equals(s2)   return true or false
	// but, s1.compareTo(s2) retuen 0 with string are equal , if s1>s2 lexicograplly
	// then it will return value greatr than 0 else less than 0
	// s1.compareToIgnoreCase(s2)
	 * 
	 * 
	 * 
	 
	//----------------------------------
	
	// Sort directly in asc order
	int i;
	int a[]=new int[5];
	for( i=0;i<5;i++)
	{
		a[i]=Integer.parseInt(br.readLine());
	}
	Arrays.sort(a);   /// for this you have to define import java.util.*
	--------------------------------
	int []pk={2,2,2,23,4,5,1};  //sort from particulr index to particulzr index
	Arrays.sort(pk,0,pk.length);  // this sorting is applied in string and char array also
	---------------------------------
	for(i=0;i<5;i++)
	System.out.println(a[i]);
	
	int w=65;
	char ch=(char)w;
	System.out.println(ch);
	
	//-------------------------------------------------------
	
	// Array index hamesha integer hona chaiye
	
	long a[]=new long[i];
	//agar long ko bht large num se initilise karna hai toh like more than 10 digit then end
	//me L add kar do
	long kk=4454254522005L;
	

	
	String sttt=br.readLine();
	char chh[]=sttt.toCharArray();
	System.out.println(chh[1]);
	
	
	//---------------------------------------------------------
	
	//replace functions in String
	String res,st;
	st=br.readLine();     //hello
	res=st.replace("l", "");
	System.out.println(res);
	res=st.replaceFirst("l", "p");
	System.out.println(res);
	res=st.replaceFirst("ell", "21");
	System.out.println(res);
	
	
	
	
	
	
	
	
	
	//---------------------------
	//to remove duplicate charcter
	

package skillrack;
import java.io.*;

class dublicate
{
	static public void main(String... args)throws IOException
	{
	BufferedReader br=new BufferedReader( new InputStreamReader(System.in));


	String s=br.readLine();

		int i,j,k,find;
		char ch[]=new char[26];

		

		for(i=0;i<26;i++)
			ch[i]='0';
		k=0;
		for(i=0;i<s.length();i++)
		{
		
		find=0;

			for(j=0;j<26;j++)
			{

				if(s.charAt(i)==ch[j])
				{

					//ch[k]=ch[k];
					find=1;
					break;
					
				}


			}

			
			if(find==0)
			{
				ch[k]=s.charAt(i);
				k++;
			}

		}
		String st=new String(ch);
		String res=st.replace("0","");   //hamesha string type replace hota hai
		System.out.println(res);
		
	}
} 
	
	//----------------------------------------
	
	//to find substring
	s=br.readLine();
	int i,j,len;
	len=s.length();
	String sss;
	for(i=0;i<len;i++)
	{
		for(j=len;j>=i;j--)
		{
			sss=s.substring(i,j); //  everything should be small letter
			System.out.println(sss);
		}
	}
	
	
	
	/////   for Calculating length of a string we use s.length()
	//// for calculating length of an array we use a.length;
	
	//------------------------------------------------------------------------------
	
	//contains functions
	
	String s=br.readLine();
	String p=br.readLine();
	
	boolean res=s.contains(p);   // both should be string
	System.out.println(res); 
	//------------------------------------------------------------------------------
	
	//convrrting integer to String
	int a=24;
	int b=26;
	String res1=String.valueOf(a);
	String res2=String.valueOf(b);
	System.out.println(res1+res2);   // output  2426
	

	
	int[] array={3,4,5,6,7,8,0};
	StringBuffer builder = new StringBuffer();
	for (int i : array) {
	  builder.append(i);
	}
	String text = builder.toString();
	System.out.println(text);
	
	
	
	
	//-----------------------------------------------------------
	//reverse using string buffer
	String st="aaaaaabbbbb";
	
	StringBuffer bf=new StringBuffer(st);
	bf.reverse();
	String text=bf.toString();
	System.out.println(text);
	
	//-------------------------------------------------------------
	 // to Append use StringBuffer
	  
	  int store[]={2,3,4,5,6,7,10};
	   StringBuffer bf=new StringBuffer();
        for(int z:store )
            bf.append(z);
        String text=bf.toString();
        System.out.println(text);   ///  output:    23456710   and it is converted in string
	  
	
//-------------------------------------------------------------
	// int by default 0 leta hai , character space leta hai and String null leta hai
	char ch[]=new char[10];
	int a[]=new int[10];
	String[] st=new String[10];
	for(int i=0;i<10;i++)
	{
		//System.out.println(ch[i]+"  gggg ");
		//System.out.println(a[i]+" ");
		System.out.println(st[i]);
		
	
	
	//-----------------------------------------------------------
	
	//make ANAGRAM program from Hacker Rank--IMPORTANT
	
	
	https://www.hackerrank.com/challenges/make-it-anagram/submissions/code/11258985
	
	
	}

//---------------------------------------------------

//anathor way to remove duplicate charctr
package skillrack;
import java.util.*;
public class unique

{
public static void main(String... args)
{

Scanner sc=new Scanner(System.in);

String st=sc.nextLine();
char ch;
int i;
String k="";
boolean find=false;
for(ch='a';ch<='z';ch++)
{
	for(i=0;i<st.length();i++)
	{
		
		if(st.charAt(i)==ch)
		{
			find=true;
			k=k+st.charAt(i);
			st=st.replace(Character.toString(ch),"");
			break;
		}
	}
	if(find==false)
	{
	continue;
	}
	
	
}
System.out.println(k);




}
}


	//----------------------------------------------------------
	//Random number
	//this will give random value between 1 to 50 both inclusive

	System.out.println((int)(Math.random()*50+1));
	
	
	//--------------------------------------------------------------------
	//Insert something in middle using stringBuffer
	String st=br.readLine();
	
	StringBuffer bff=new StringBuffer(st); 
	bff.insert(0, 'b');     // here  at index 0, takes charcter
	bff.insert(2,"bbb");
	System.out.println(bff.length());
	bff.append("hello");
	
	
	///to delete full string or someparticular substring
	 bff.setLength(0);    // to delete full
	 bff.delete(0,2);   //to delete from some to some
	 bff.deleteCharAt(3); //to delete from some particular index
	 
	 // Accordingly length will be modified
	  * 
	  * 
	st=bff.toString();
	
	System.out.println(st);
	
	//-----------------------------------------------------------
	 // creating hashset..
	  to set in Asending order we use TreeSet
	  
------------------------------------------------------------------------------------------------------------------------------------------------------------	  
	  // ******************** ALL VARIABLE ASSOCIATED OR RELATED WITH SET OR LIST ARE GENERIC SO THEY SHOUD BE DEFINE IN FULL
	  //  LIKE FOR int --> Integer ,,  String --> String ,, Double--> Double ,, Long --> Long
	  // to define integer array ,,  Integer a[]=new Integer[10];   **********************************
-------------------------------------------------------------------------------------------------------------------------------------------------------------	
	
	HashSet<String> ts=new HashSet<String>();
	ts.add("d");
	ts.add("f");
	ts.add("j");
	int len=ts.size();   ///to get length of hash set
	
	System.out.println(len);
	System.out.println(ts);
	for(String z : ts)
		System.out.println(z);
	
	
//////-----------------------------------------------------------
	//converting arry to hashSet
	int i;
	String myarray[]={"fgdf","abc","yyyy"};
	Arrays.sort(myarray,0,myarray.length);
	for(i=0;i<myarray.length;i++)
		System.out.println(myarray[i]);
	HashSet<String> myset = new HashSet<String>();//set will never store dublicate element, never
	Collections.addAll(myset, myarray);
	System.out.println(myset+"-----");
	// HashSet elemnts randmly store karta hai, no order
	//TreeSet Natural Ascending order me store karta hai
	//LinkedHashSet store in the order they are added
	
	// in this sets index use nahi hota hai coz inme elemts ka index nahi hota hai
	// but in ArrayList index bhi use hota hai
	getting specific elemnt from arraylist
	
	ArrayList<> al=new ArrayList<>();
	----some code
	al.get(3);     3 is index
	
	
	int len1=myset.size();
	String sss[]=new String[len1];    //converting hashset to array;
	sss=myset.toArray(sss);
	
	for(i=0;i<len1;i++)
		System.out.println(sss[i]);
	
	
	char []a={'d','f','y','a'};
	Arrays.sort(a,0,a.length);
	for(i=0;i<a.length;i++)
		System.out.println(a[i]);
		
		
	
	String st="hello";
	StringBuffer bs=new StringBuffer(st);
	bs.deleteCharAt(0);
	System.out.println(bs);
	System.out.println(bs.length());  */
/*
	
	///-------------------------------------------------------------------
	//copy one hashSet other HashSet
	HashSet<String> hs1=new HashSet<String>();
	HashSet<String> hs2=new HashSet<String>();
	hs1.add("hello");
	hs1.add("world");
	System.out.println(hs1);
	
	hs2.add("kaise");
	hs2.add("ho");
	hs2.add("world");
	System.out.println(hs2);
	
	hs1.retainAll(hs2);             //Takes commom elemnt betwwen two HashSet
	System.out.println(hs1);
	
	
	hs1.addAll(hs2);   // copying
	System.out.println(hs1);
	
	//System.out.println(hs10);
	
	
	hs1.remove("world");
	System.out.println(hs1);
	
	hs1.clear();
	System.out.println(hs1);  //to clear all elemnt of hashset
	
	// for more operations
	//http://www.beingjavaguys.com/2013/03/hash-set-in-java.html
	
 //	http://www.dotnetperls.com/hashset-java
 
 
-----------------------------------------------------------------------------------------------------
 retainAll, will modify the content of s1. You should create a copy of s1 and use retainAll on the copy 
 
 Set<String> s1;
Set<String> s2;
s1.retainAll(s2); // s1 now contains only elements in both sets
If you want to preserve the sets, create a new set to hold the intersection:

Set<String> intersection = new HashSet<String>(s1); // use the copy constructor
intersection.retainAll(s2);
-----------------------------------------------------------------------------------------------------
	
//--------------------------------------------------------------------------------
	
	
//-----------------------------------------------------------------------------
	//Generic
//	http://www.tutorialspoint.com/java/java_generics.htm
	
	// in generic  when we have a return type then we use <T extends Comparable<T>> T max(T a,T b)

		
		
//--------------------------------------------------------------------
 HashSet, LinkedHashSet uses equals to check equaltiy but TreeSet uses CompareTo
 HashSet, LinkedHashSet accept maximum one NULL values but TreeSet does not
 if null values are passed in TreeSet it will show ERROR 
 TreeSet<String> ts=new TreeSet<String>();
	ts.add(null);  // null is used in small letter
 
 
 //---------------------------------------------------------------------
	// ArrayList
	
	//converting is same as sets
	 
	it has index involved with it so some of it operation uses index
	
	it strore ALL elemts (allow dublicats) in the order it is inserted
	
	it can allow any number of null
	
	
	*/
	
	
	
	ArrayList<String> obj=new ArrayList<String>();    // check some of its functions from nagaeshwar rao book  // 
	
	  obj.add("Ajeet");
	  obj.add("Harry");
	  obj.add("Chaitanya");
	  obj.add("Steve");
	  obj.add("Anuj");
	  
	  /*Add element at the given index*/
	  obj.add(0, "Rahul");
	  obj.add(1, "Justin");

	  /*Remove elements from array list like this*/
	  obj.remove("Chaitanya");
	  obj.remove("Harry");
	  
	  obj.contains("harry");    /// most useful for checking contain in array directly
	  
	  /*Remove element from the given index*/
	  obj.remove(1);
	  
	  obj.set(2, "Tom");  //It would replace the 3rd element (index =2 is 3rd element) with the value Tom.
	
	  int pos = obj.indexOf("Tom"); //This would give the index (position) of the string Tom in the list.
	
	  String str= obj.get(2);  //It returns the object of list which is present at the specified index.
	  
	  int a=obj.size();
	  
	 boolean check= obj.contains("john");
	 
	 System.out.println(obj);
	 System.out.println(a);
	 System.out.println(check);
	  
	  obj.clear();
	  
//---------------------------------------------------------
	  
	  //To take null into character we write it as
	  char ch='\0';
	  
//-----------------------------------------------------------

class abc
{
static public void main(String... args)
{
Scanner sc=new Scanner(System.in);
//--------------------------------------------------------------------------
char ch1='a';
char ch2='c';
int res=ch2-ch1;
System.out.println(res);  // output = 2

//----------------------------------------------------------------------

// for loop  , having two operation in one for loop, we can have as many as we want
int i,j,k;

for(i=0, j=10; i!=5 && j!=6 ;i++,j--)
{
	
}
//--------------------------------------------------------------
}
}	  
	//---------------------------------------------------------------------
String st=sc.nextLine();      //this two line  will work properly
int n=sc.nextInt();

// but if you want to take Integer 1st and then String in next Line
//  then you have to write sc.nextLine()   in betweem them   like

int n=sc.nextInt();
sc.nextLine();
String st=sc.nextLine(); 

	
}
}



****** AGAR KISI STRING SE TU CHARACTER EXTRACT KARKE KOI DUSARI STRING BANA RAHA HAI
        TOH HAR EK CHARACTER ME +"" LAGA PADEGA BRO....********



        //Checking character in upprcase or not

        Character.isUpperCase('h');

        //Converting character to uppercase

        Character.toUpperCase('h');




 ///check wheater character.digit of letter

 boolean find = Character.isDigit('3');      //true
 boolean find=Character.isLetter('f')    // true






 ///to check all character of particular string present in other string

 ----just store all ememnts of  it in hashset or ArrayList according to the need , both of them

 		and then check
 		boolean check=hs1.containsAll(hs2);



 		//round off till 2 precision


 		int a=25.2545
 		a=Math.round(a*100.0)/100.0;


//how to sort list

Collections.sort(hs);



--------------------------------------------------------------

BigInteger  ---- import java.math.*;
------------------------
ye hamesha string leta hai
BigInteger a=new BigInteger(sc.next());
BigInteger a=new BigInteger(sc.next());
BigInteger a=new BigInteger("0")

operation in BigInterger
-----------------------
c=c.add(a);
c=c.divide(a);
c=c.multiply(a);
c=c.gcd(a);
c=c.intValue();
c=c.mod(a);
c=c.negate();
c=c.pow(4);------>  4 should be of integer type

----------------------------
convert int to BigInteger

int regularInt = 321312; // some value
BigInteger bigInt = new BigInteger(String.valueOf(regularInt));

----------------------------
converting biginteger to int
int a;
a=c.intValue();





-----------------------------
convert biginteger to string

String s
s=sc.toString();

----------------------------

Directly binary Search:
int index=Arrays.binarySearch(arr,item);  // it will return the index of the item, 
// if item is not present then it will return the negative value
