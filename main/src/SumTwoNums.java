import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class SumTwoNums {
    // Standard SLF4J logger initialization
    private static final Logger logger = Logger.getLogger(SumTwoNums.class.getName());

    public static String sum(String stn1, String stn2) {
        // Initialize 2 pointers for 2 number string
        int i = stn1.length() - 1;
        int j = stn2.length() - 1;
        int carry = 0;

        // Intialize result string
        StringBuilder result = new StringBuilder();

        // Perform calculation until there is no digit left in string 1, string 2 and carry has set to 0
        while (i >= 0 || j >= 0 || carry > 0) {
            // If both string's digits has been processed but there is still carry, we append it to the final result
            if (i < 0 && j < 0 && carry > 0) {
                logger.log(Level.INFO, "There is no digit left, append carry {0} to the result", carry);
                result.append(carry);
                carry = 0;
            } else {
                // Initilaize and extract 2 strings current digit
                int val1 = (i >= 0) ? stn1.charAt(i) - '0' : 0;
                int val2 = (j >= 0) ? stn2.charAt(j) - '0' : 0;

                int total = val1 + val2 + carry;
                int digit = total % 10;
                int nextCarry = total / 10;

                // // Log the current sum's factors
                StringBuilder logMsg = new StringBuilder();
                if (i >= 0 && j >= 0) {
                    logMsg.append(String.format("We sum %d and %d", val1, val2));
                } else {
                    logMsg.append(String.format("We sum digit %d", (i >= 0 ? val1 : val2)));
                }

                // Log next carry's value if present
                if (carry > 0) {
                    logMsg.append(" with carry 1 from previous step");
                }

                logMsg.append(String.format(", get %d, append %d to result", total, digit));

                if (nextCarry > 0) {
                    logMsg.append(", carry 1");
                }

                logger.info(logMsg.toString());
                // Append current digit to result
                result.append(digit);
                carry = nextCarry;
            }
            // Continue to next digit to the left of both string
            i--;
            j--;
        }
        // Log final result
        String finalResult = result.reverse().toString();
        logger.log(Level.INFO, "Final result: {0}", finalResult);
        return finalResult;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        logger.log(Level.INFO, "Input first number");
        String stn1 = in.nextLine();
        logger.log(Level.INFO, "Input second number");
        String stn2 = in.nextLine();
        String result = sum(stn1,stn2);
        logger.log(Level.INFO, "Result sum 2 number "+stn1+" and "+stn2+" is: "+result);
    }
}