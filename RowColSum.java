public class RowColSum    
{    
    public static void main(String[] args) {    
        int rows, cols, sumRow, sumCol;    
        int a[][] = {       
                        {10,20,30},    
                        {10,10,10},    
                        {30,20,10}    
                    };    
          rows = a.length;    
        cols = a[0].length;    
        for(int i = 0; i < rows; i++){    
            sumRow = 0;  
              sumCol = 0;      
            for(int j = 0; j < cols; j++){    
              sumRow = sumRow + a[i][j];
	 sumCol = sumCol + a[j][i];        
            }    
            System.out.println("Sum of " + (i+1) +" row: " + sumRow);    
           System.out.println("Sum of " + (i+1) +" column: " + sumCol);    
        }    
    }    
}    
