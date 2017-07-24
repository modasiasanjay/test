package base;

public class ComplementaryPairs {

    public int noOfComplementaryPairs(int arr[],int k){
        int result = 0;
        for(int i=0;i<=arr.length;i++){
            for(int j=i;j<arr.length-1;j++){
                if(arr[i] + arr[j+1] == k){
                    result++;
                }
            }
        }
        return result * 2;
    }
    public static void main(String[] args) {
        int[] intArray = new int[] {4,5,6,3,1,8,-7,-6};
        int k = 9;
        System.out.println("No of k complementary pairs : "+new ComplementaryPairs().noOfComplementaryPairs(intArray, k));
    }

}