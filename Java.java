public class Java{
    public static int maxval(int[]A, int N){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            if(A[i] > max){
                max = A[i];
            }
        }
        return max;
    }

    public static int minval(int[]A, int N){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            if(A[i]<min){
                min = A[i];
            }
        }
        return min;
    }

    public static void main(String[] args){
        int[] A = {1, 2, 5, 6, 3, 5, 7, 9, 8};
        int N =A.length;

        System.out.println("Max value is : " + maxval(A, N));
        System.out.println("Min value is : " + minval(A, N));
    }
}