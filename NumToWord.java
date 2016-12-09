import java.util.Scanner;

public class NumToWord {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, digit1, digit2, digit3;

		String ones[] = {
			"",
        	"One",
        	"Two",
       		"Three",
        	"Four",
        	"Five",
        	"Six",
        	"Seven",
        	"Eight",
        	"Nine"
		};

		String teens[] = {
			"Eleven",
        	"Twelve",
        	"Thirteen",
        	"Fourteen",
        	"Fifteen",
        	"Sixteen",
        	"Seventeen",
        	"Eighteen",
        	"Nineteen"
		};

		String tens[] = {
			"",
			"Ten",
        	"Twenty",
        	"Thirty",
        	"Forty",
        	"Fifty",
        	"Sixty",
        	"Seventy",
        	"Eighty",
        	"Ninety"
		};

		String hundreds[] = {
			"Hundred"
		};

		String thousands[] = {
			"Thousand"
		};


		System.out.print("Enter any number between 1 and 199: ");
		num = input.nextInt();

		if((num <= 1) || (num >= 1000)){		
			System.out.println("Nope! Incorrect input!");  //working
		}

		if((num > 0) && (num < 10)){
			num = num % 10;
			System.out.println(ones[num]);  //working
		}

		if((num > 10) && (num < 20)){
			num = num % 10;
			System.out.println(teens[num - 1]);  //working
		}

		if((num > 19) && (num < 100)){
			digit1 = num/10;
			digit2 = num%10;
			System.out.println(tens[digit1] + ones[digit2]); //working
		}

		if((num > 100) && (num < 1000)){
			// digit3 = num/100;
			// digit1 = num/100;
			// digit2 = num%100;
			System.out.println(ones[num / 100] + " Hundred" + ((num % 100 > 0) ? " and " + (num % 100) : "")); //printing hundred correctly but printing teennums in integers.		
		}

	}
}

		
		







