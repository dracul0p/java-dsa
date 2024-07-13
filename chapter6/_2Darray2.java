import javax.xml.stream.events.StartDocument;

// vvvIMP : SPIRAL matrix

public class _2Darray2 {
    public static void spiralMatrix(int arr[][]) {
        int starRow= 0;
        int starCol= 0;
        int endRow = arr.length-1;
        int endCol = arr[0].length-1;
        while(starRow <= endRow && starCol <= endCol){
            //top
            for(int j = starCol; j <= endCol; j++){
                System.out.print(arr[starRow][j] + " ");

            }
           
            // right
            for(int  i = starRow+1; i <= endRow; i++){
                System.out.print(arr[i][endCol] + " ");
            }
             //bottom
             for(int j = endCol-1; j >= starCol; j--){
                if(starRow == endRow){
                    return;
                }
                
                System.out.print(arr[endRow][j] + " ");
                }

            
            // left
            for(int i = endRow-1; i >= starRow+1;i--){
                if(starCol == endCol){
                    return;
                }
                System.out.print(arr[i][starCol] + " ");
            }
            starRow++;
            endRow--;
            starCol++;
            endCol--;


        }
        System.out.println();
        
    }
    public static void main(String[] args) {

        int arr[][] ={{1,2,3,4,},
                      {5,6,7,8},
                      {9,10,11,12},
                      {13,14,15,16}};
        spiralMatrix(arr);



    }
    
    
}
