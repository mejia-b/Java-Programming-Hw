import java.util.Scanner;
public class SumElements {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] matrix = new double[3][4];
		int i,j = 0;
		double sum;
		//Prompt User
		System.out.println("Enter a 3-by-4 matrix row by row");
		
		//Initialize Array with user input
		for(i=0; i < matrix.length; i++){
			for(j=0; j < matrix[i].length; j++){
				matrix[i][j] = input.nextDouble();
			}//end of inner for loop 
		}//end of outer for loop
		
		//Calculate sum for each column in array matrix
		for(i = 0; i < matrix[0].length; i++){
			sum = sumColumn(matrix,i);
			System.out.println("Sum for column " + i + " is " + sum + "\n");
		}//end of for loop 
		
}//end of main 
	
	public static double sumColumn(double[][] m, int columnIndex){
		int j; 
		double total = 0;
		
		
			for(j=0; j < m.length; j++){
				total += m[j][columnIndex];
		    }//end of for loop 
		
		  return total;
	}//end of sumColumn Method
		
}//end of SumElements Class

//////OUTPUT/////
Enter a 3-by-4 matrix row by row
1.5 2 3 4
5.5 6 7 8
9.5 1 3 1
Sum for column 0 is 16.5

Sum for column 1 is 9.0

Sum for column 2 is 13.0

Sum for column 3 is 13.0
