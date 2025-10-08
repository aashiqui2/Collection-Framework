package collection.ArrayListLearning;

public class CompareToDemo {

	public static void main(String[] args) {
		    String s1=new String("Java");
	        String s2=new String("Php");
	        String s3=new String("Java");
	        String s4=new String("java");

	        // to compare Lexicography not by length
	        // It returns a negative integer, zero, or a positive integer if the current object is less than, equal to, or greater than the specified object o, respectively.
	        // it compare depending upon the ASCII table
            //if s1>s2 positive value returned
	        //if s1<s2 negative value returned
	        //if s1==s2 zero returned
	        
	        int result=s1.compareTo(s2);
	        System.out.println(result);

	         result=s1.compareTo(s3);
	        System.out.println(result);

	        result=s1.compareTo(s4);
	        System.out.println(result);

	        result=s1.compareToIgnoreCase(s3);
	        System.out.println(result);
	        
	        result=s2.compareToIgnoreCase(s4);
	        System.out.println(result);
	        String s5="elc";
	        System.out.println(s5.compareTo("lco"));
	}

}
