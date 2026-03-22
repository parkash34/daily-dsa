package LeetCode.Arrays;

public class TwoSumIIInputArrayIsSorted_167 {
    public static int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length-1;
        while(j > i){
            if(numbers[i] + numbers[j] == target){
                return new int[]{++i, ++j};
            }
            if(numbers[i] + numbers[j] > target){
                j--;
            } else {
                i++;
            }
        }
        return null;
    }
    public static void print(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,7,11,15};
        print(twoSum(arr1, 9));
    }
}