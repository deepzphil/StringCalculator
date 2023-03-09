package StringCalculator;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
public int add(String numbers) {
if (numbers.isEmpty()) {
return 0;
}


if (numbers.startsWith("//")) {
String[] parts = numbers.split("\n", 2);
numbers = parts[1];
}
String[] numberStrings = numbers.split(",");
List<Integer> negativeNumbers = new ArrayList<>();
int sum = 0;
for (String numberString : numberStrings) {
int number = Integer.parseInt(numberString);
if (number < 0) {
negativeNumbers.add(number);
} else if (number <= 1000) {
sum += number;
}
}
if (!negativeNumbers.isEmpty()) {
String message = "No negatives: " + negativeNumbers.toString();
throw new IllegalArgumentException(message);
}
return sum;
}

public static void main(String args[]) {
	StringCalculator t = new StringCalculator();
int sum = t.add("//\n5,2,3");
System.out.println("The Sum is " +sum);
}
}
