
import java.util.Scanner;

    public class nhap {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập số cần đọc: ");
            int number = scanner.nextInt();
            String result = "";

            if (number >= 0 && number < 10) {
                switch (number) {
                    case 0:
                        result = "zero";
                        break;
                    case 1:
                        result = "one";
                        break;
                    case 2:
                        result = "two";
                        break;
                    case 3:
                        result = "three";
                        break;
                    case 4:
                        result = "four";
                        break;
                    case 5:
                        result = "five";
                        break;
                    case 6:
                        result = "six";
                        break;
                    case 7:
                        result = "seven";
                        break;
                    case 8:
                        result = "eight";
                        break;
                    case 9:
                        result = "nine";
                        break;
                }
            } else if (number >= 10 && number < 20) {
                int ones = number % 10;
                switch (ones) {
                    case 0:
                        result = "ten";
                        break;
                    case 1:
                        result = "eleven";
                        break;
                    case 2:
                        result = "twelve";
                        break;
                    case 3:
                        result = "thirteen";
                        break;
                    case 4:
                        result = "fourteen";
                        break;
                    case 5:
                        result = "fifteen";
                        break;
                    case 6:
                        result = "sixteen";
                        break;
                    case 7:
                        result = "seventeen";
                        break;
                    case 8:
                        result = "eighteen";
                        break;
                    case 9:
                        result = "nineteen";
                        break;
                }
            } else if (number >= 20 && number < 100) {
                int tens = number / 10;
                int ones = number % 10;
                String tensString = "";
                String onesString = "";

                switch (tens) {
                    case 2:
                        tensString = "twenty";
                        break;
                    case 3:
                        tensString = "thirty";
                        break;
                    case 4:
                        tensString = "forty";
                        break;
                    case 5:
                        tensString = "fifty";
                        break;
                    case 6:
                        tensString = "sixty";
                        break;
                    case 7:
                        tensString = "seventy";
                        break;
                    case 8:
                        tensString = "eighty";
                        break;
                    case 9:
                        tensString = "ninety";
                        break;
                }

                switch (ones) {
                    case 1:
                        onesString = "one";
                        break;
                    case 2:
                        onesString = "two";
                        break;
                    case 3:
                        onesString = "three";
                        break;
                    case 4:
                        onesString = "four";
                        break;
                    case 5:
                        onesString = "five";
                        break;
                    case 6:
                        onesString = "six";
                        break;
                    case 7:
                        onesString = "seven";
                        break;
                    case 8:
                        onesString = "eight";
                        break;
                    case 9:
                        onesString = "nine";
                        break;
                }

                result = tensString + " " + onesString;
            } else if (number >= 100 && number < 1000) {
                int hundreds = number / 100;
                int tens = (number % 100) / 10;
                int ones = (number % 100) % 10;
                String hundredsString = "";
                String tensString = "";
                String onesString = "";

                switch (hundreds) {
                    case 1:
                        hundredsString = "one hundred";
                        break;
                    case 2:
                        hundredsString = "two hundred";
                        break;
                    case 3:
                        hundredsString = "three hundred";
                        break;
                    case 4:
                        hundredsString = "four hundred";
                        break;
                    case 5:
                        hundredsString = "five hundred";
                        break;
                    case 6:
                        hundredsString = "six hundred";
                        break;
                    case 7:
                        hundredsString = "seven hundred";
                        break;
                    case 8:
                        hundredsString = "eight hundred";
                        break;
                    case 9:
                        hundredsString = "nine hundred";
                        break;
                }

                switch (tens) {
                    case 2:
                        tensString = "twenty";
                        break;
                    case 3:
                        tensString = "thirty";
                        break;
                    case 4:
                        tensString = "forty";
                        break;
                    case 5:
                        tensString = "fifty";
                        break;
                    case 6:
                        tensString = "sixty";
                        break;
                    case 7:
                        tensString = "seventy";
                        break;
                    case 8:
                        tensString = "eighty";
                        break;
                    case 9:
                        tensString = "ninety";
                        break;
                }

                switch (ones) {
                    case 1:
                        onesString = "one";
                        break;
                    case 2:
                        onesString = "two";
                        break;
                    case 3:
                        onesString = "three";
                        break;
                    case 4:
                        onesString = "four";
                        break;
                    case 5:
                        onesString = "five";
                        break;
                    case 6:
                        onesString = "six";
                        break;
                    case 7:
                        onesString = "seven";
                        break;
                    case 8:
                        onesString = "eight";
                        break;
                    case 9:
                        onesString = "nine";
                        break;
                }

                result = hundredsString + " " + tensString + " " + onesString;
            } else {
                result = "out of ability";
            }

            System.out.println(number + ":" + result);
        }
    }

