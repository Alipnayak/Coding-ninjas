Staircase

A child is running up a staircase with N steps, and can hop either 1 step, 2 steps or 3 steps at a time. Implement a method to count how many possible ways the child can run up to the stairs. You need to return number of possible ways W.
Input format :
Integer N
Output Format :
Integer W
Constraints :
1 <= N <= 30
Sample Input 1 :
4
Sample Output 1 :
7
Sample Input 2 :
5
Sample Output 2 :
13
  _____________________________________________________
  
  
public class Solution {
	
		
     public static int staircase(int n){
		 	int storage[] = new int[n + 1];
			storage[0] = 1;
			storage[1] = 1;
			for (int i = 2; i < storage.length; i++) {
				int op2 = 0, op3 = 0;
				int op1 = storage[i - 1];
				if (i - 2 >= 0)
					op2 = storage[i - 2];
				if (i - 3 >= 0)
					op3 = storage[i - 3];
				storage[i] = op1 + op2 + op3;
			}
			return storage[n];
		
	/* Your class should be named Solution.
	 * Don't write main() function.
	 * Don't read input, it is passed as function argument.
	 * Return output and don't print it.
	 * Taking input and printing output is handled automatically.
	 */

	}
	
}
