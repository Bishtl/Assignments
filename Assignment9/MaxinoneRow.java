public class MaxinoneRow {
    public static void maxInOneRow(int x[][]){
        int max = 0;
        for(int i=0;i<x.length;i++){
            for(int j =0;j<x.length;j++){
                for(int k=0;k<x.length;k++){
                    if(max<x[k][j]){
                        max = x[k][j];
                    }
                }
              
            }

        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int arr[][]={
            {4,2,2,5,9},{1,5,70,3,6},{5,3,1,6,9}
        };
        maxInOneRow(arr);
    }
}
