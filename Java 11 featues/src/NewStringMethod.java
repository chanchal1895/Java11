import java.util.Collections;
import java.util.stream.Collectors;

public class NewStringMethod {
	
	public static void main(String[] args) {
		String str1 = " ";
        System.out.println(str1.isBlank());
 
        String str2 = "GeeksForGeeks";
        System.out.println(str1.isBlank());//It treats whitespace also empty.
        System.out.println(str1.isEmpty());//It treats whitespace as not empty.
        
       //lines(): This method is to return a collection of strings that are divided by line terminators.
        String str = "Geeks\nFor\nGeeks";
        System.out.println(str.lines().collect(Collectors.toList()));
        
       // repeat(n): Result is the concatenated string of original string repeated the number
       //of times in the argument.
        String strN = "chanchal ";
        System.out.println(strN.repeat(4));
        
        //stripLeading(): It is used to remove the white space which is in front of the string
        String str3 = " GeeksForGeeks";
        System.out.println(str3.stripLeading());
        
       // stripTrailing(): It is used to remove the white space which is in the back of the string
        String str4 = "GeeksForGeeks ";
        System.out.println(str4.stripTrailing());
        
       // strip(): It is used to remove the white spaces which are in front and back of the string
        String str5 = " GeeksForGeeks ";
        System.out.println(str5.strip());
	}
	
}
