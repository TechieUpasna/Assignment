package strings;

public class ProblemStatement1 {

	public static void main(String[] args) {
		String a="Welcome to Java World";
		//Returns the character at 5th position and display it.
		System.out.println("Character at 5th position: "+a.charAt(5));  
		//Compares the above String with “Welcome” lexicographically ignoring case differences and display the result.
		String b="Welcome";  //second string
		System.out.println("Comparision between the two:-");
		/*if (a.compareTo(b) > 0) { // compare lexicographically
			System.out.println("Equal");
		} else {
			System.out.println("Unequal");
		}*/
		System.out.println(a.compareToIgnoreCase(b));
		
		
		//Concatenates “- Let us learn” to the above string and display it.
		String c=" Let us Learn";
		System.out.println("after concatenation:"+a.concat(c));//concatenation
		
		
		//Returns the position of the first occurrence of character ‘a’ and display it.
		System.out.println("Position of a: "+a.indexOf('a'));  //to show index number
		
		//Replaces all the occurrences of ‘a’ character with the new ‘e’ and display it.
		System.out.println("replacing a from e :"+a.replace('a', 'e')); //to replace the character
		
		
		//Returns string between 4th position and 10th position and display it.
		System.out.println("String between 4th and 10th positions: "+a.substring(4,10));  //to display string from 4th index to 10th index
		
		
		//Returns the lower case of the string and display it.
		System.out.println("String in lower case: "+a.toLowerCase());  //display the string in lower case
	}

}
;