public class ComputeWeeklyHours {

	public static void main(String[] args) {
		int i,j,temp; 
		String tempString;
		int[] employee = new int[8];
		String[] numEmployee = {"Employee 0","Employee 1","Employee 2","Employee 3",
				"Employee 4", "Employee 5","Employee 6","Employee 7"};
		int [][] matrix = {
				{2,4,3,4,5,8,8},
				{7,3,4,3,3,4,4},
				{3,3,4,3,3,2,2},
				{9,3,4,7,3,4,1},
				{3,5,4,3,6,3,8},
				{3,4,4,6,3,4,4},
				{3,7,4,8,3,8,4},
				{6,3,5,9,2,7,9}};
		
		
		//Call computeRowSum and store result for each 
		//in 1D employee Array
		for(i = 0; i < employee.length; i++){
			employee[i] = computeRowSum(matrix,i);
		}
		
		//Sort numEmployee Array dependent upon 
		//Sorted array of employee in descending order
		for(i=0; i < employee.length;i++)
		{
		    for( j=i ; j < employee.length; j++)
		    {
		        if(employee[i] < employee[j] )
		        {
		        temp=employee[i];
		        tempString = numEmployee[i];
		        employee[i]=employee[j];
		        numEmployee[i]=numEmployee[j];
		        employee[j]=temp;
		        numEmployee[j]=tempString;
		        } // end of if statement
		        
		    } // end of inner for loop 
		    
		}// end of outer for loop 
		
		//Print Result
		System.out.println("Hours worked by employee in decreasing order :");
		for (int k = 0; k < employee.length ; k++){
			System.out.println( ""+ numEmployee[k] + ""+ " "+employee[k]);
		} 
		
	}//end of main 
	
	public static int computeRowSum(int[][] a,int row){
		int j,total = 0; 
		
		
			for(j = 0; j < a[row].length; j++){
				total += a[row][j];
			}//end of outer for loop 
		return total;
	}//end of computeSum

}//end of ComputeWeeklyHours Class

/////OUTPUT////////
Hours worked by employee in decreasing order :
Employee 7 41
Employee 6 37
Employee 0 34
Employee 4 32
Employee 3 31
Employee 1 28
Employee 5 28
Employee 2 20
