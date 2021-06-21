package week10;

class T_Q3 {
    public static String reverse(String str) {
        if (str.isEmpty())
            return str;

        return reverse(str.substring(1)) + str.charAt(0);
    }
}

class T_Q4 {
    public static void printDigit(int integer) {
        if (integer / 10 == 0) {
            //if there's one digit left, just print the integer and stop the recursive function (base case)
            System.out.println(integer);
            return;
        }

        String str = String.valueOf(integer);  //change integer to string
        System.out.print(str.charAt(0) + " "); //print the first digit + " "
        printDigit(Integer.parseInt(str.substring(1))); //call the function recursively and truncate the first digit
    }
}
