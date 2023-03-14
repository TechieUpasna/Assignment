package strings;

public class ProblemStatement1 {

	public static void main(String[] args) {
		String a="Welcome to Java World";
		System.out.println("Character at 5th position: "+a.charAt(5));  //substring
		String b="Welcome";  //second string
		System.out.println("Comparision between the two:-");
		if (a.compareTo(b) > 0) { // compare lexicographically
			System.out.println("Equal");
		} else {
			System.out.println("Unequal");
		}
		String c=" Let us Learn";
		System.out.println("after concatenation:"+a+c);//concatenation
		System.out.println("Position of a: "+a.indexOf('a'));  //to show index number
		System.out.println("replacing a from e :"+a.replace('a', 'e')); //to replace the character
		System.out.println("String between 4th and 10th positions: "+a.substring(4,10));  //to display string from 4th index to 10th index
		System.out.println("String in lower case: "+a.toLowerCase());  //display the string in lower case
	}

}
