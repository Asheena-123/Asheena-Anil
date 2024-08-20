package mavenproject1;

public class StringProgram {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// method literal ----> by using string literal
		
		//String s1="Hello World";
		//System.out.println(s1.length());
		
		// method -> contain
		/*String s1="Java is Programming Language";
		System.out.println(s1.contains("Java is"));
		System.out.println(s1.contains("java is"));
		System.out.println(s1.contains("java python"));*/
		
		//isEmpty
		
		/*String s1="";
		String s2="Hello World";
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());*/
		
		// method -> equals ...it s case sensitive 
		
		/*String s1="Java";
		String s2="java";
		String s3="python";
		String s4="Python";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s1));
		System.out.println(s1.equals(s4));*/
		
		
		// method-> toLowerCase
		/*String s1="Java is Programming Language";
		System.out.println(s1.toLowerCase());*/
		
		// method -> UpperCase
		
		/*String s1="Java is Programming Language";
		System.out.println(s1.toUpperCase());*/
		
		// method -> equalsIgnoreCase ... only check the content
		
		/*String s1="Java";
		String s2="java";
		String s3="python";
		String s4="Python";
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s1));
		System.out.println(s1.equalsIgnoreCase(s4));*/
		
		// method replace
		/*String s1="Java is a Programming Lang";
		//System.out.println(s1.replace('i', 'l'));
		System.out.println(s1.replace("Java", "Python"));*/
		
		
		//method trim   -----> to eliminate the white space
		/*String s1=" Hello ";
		System.out.println(s1.trim());*/
		
		//method startsWith() , endsWith()
		/*String s1="Apple";
		System.out.println(s1.startsWith("ap"));
		System.out.println(s1.startsWith("Ap"));
		System.out.println(s1.startsWith("cd"));*/
		
		
		//method endsWith
		String s1="Apple";
		System.out.println(s1.endsWith("le"));
		System.out.println(s1.endsWith("Le"));
		System.out.println(s1.endsWith("is"));


		
		
		
		
		
	}

}
