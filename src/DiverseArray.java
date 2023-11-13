import java.util.Arrays;

public class DiverseArray {
    public static int arraySum(int[] a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }
    public static int[] rowSums(int[][] a){
        int[] sum=new int[a.length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                sum[i]+=a[i][j];
            }
        }
        return sum;
    }
    public static boolean isDiverse(int[][] a){
        int[] sum=rowSums(a);
        Arrays.sort(sum);
        for(int i=0;i<sum.length-1;i++){
            if(sum[i]==sum[i+1])return false;
        }
        return true;
    }

}
