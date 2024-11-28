import java.time.Duration;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class OtherFeatures {
	public static void main(String[] args) {
		
		
		Predicate<String> str = Pattern.compile("aba").asMatchPredicate();
		
		System.out.println(str.test("aba"));
		System.out.println(str.test("abac"));
		//4. Epsilon Garbage Collector
		//5. Removed the Java EE and CORBA modules
		//6. Removal of thread functions
			//stop(Throwable obj) and destroy() objects that have been removed from the JDK 11 because 
			//they only throw UnSupportedOperation and NoSuchMethodError respectively. Other than that,
			//they were of no use. 
		//7. TimeUnit Conversion
		
		TimeUnit c = TimeUnit.DAYS;
		System.out.println(c.convert(Duration.ofHours(36)));
		//Optional.isEmpty(): This method returns true if the value of any object is null and else returns false.
		Optional strOp = Optional.empty();
		System.out.println(strOp.isEmpty());
		Optional strOp1 = Optional.of("Chanchal");
		System.out.println(strOp1.isEmpty());
		
		//8. Local-Variable Syntax for Lambda Parameters
		//JDK 11 allows ‘var’ to be used in lambda expressions. This was introduced to be consistent with the 
		//local ‘var’ syntax of Java 10.
		
		IntStream.of(1,2,3,4,5,6,7,8).filter((var i)->i%2==0).forEach(System.out::println);
	}

}
