Number of Digits

Given the number 'n', find out and return the number of digits present in a number .
Input Format :
Integer n
Output Format :
Count of digits
Constraints :
1 <= n <= 10^6
Sample Input 1 :
 156
Sample Output 1 :
3
Sample Input 2 :
 7
Sample Output 2 :
1
  _______________________________________________________________
  
  import java.util.Scanner;
public class Solution {
	static int count = 0;

	public static int count(int n){
		if (n > 0) {
			count++;
			count(n / 10);
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 0;
		int res = 0;

		System.out.printf("Enter number: ");
		n = sc.nextInt();

		res = count(n);
		System.out.printf("Total digits are: " + res);
		
		
	}
}
