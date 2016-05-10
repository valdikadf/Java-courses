package quadratic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *Created for solve quadratic equation
 */
public class Main {
    public static BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        Format coefficients = new Format(); //creat "Format" object for format expressions.
        coefficients.setCountArg(3);
        String[] nameCoef = new String[]{"a","b","c"};
        coefficients.setNameArg(nameCoef);
        System.out.println(
                "Enter the quadratic equations coefficients in the form:\"A=6 B=3 C=0\"\n" +
                        "The values must be separated by a space"
        );

        //loop until user enter correct or full value
        do {
            String expression = "A=1 b=-4 c=4";//stdIn.readLine();
            expression = expression.toLowerCase();
            coefficients.findValue(expression);
        } while (!coefficients.isCorrect());
    }

}
