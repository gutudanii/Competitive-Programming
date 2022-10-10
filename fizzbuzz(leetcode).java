import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> fizz = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizz.add("FizzBuzz");
            } else if (i % 3 == 0) {
                fizz.add("Fizz");
            } else if (i % 5 == 0) {
                fizz.add("Buzz");
            }
            else {
                fizz.add(String.valueOf(i));
            }
        }
        return fizz;
    }

    public static void main(String [] args){

        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter Number = ");
        num = sc.nextInt();
        System.out.println(sol.fizzBuzz(num));
    }
}
