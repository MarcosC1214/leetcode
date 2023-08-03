public class Main {
    public static void main(String[] args) {

        int[] test = {1, 1, 2, 3, 4, 5};
        System.out.println(removeDuplicates(test));
    }

    public static int removeDuplicates(int[] nums) {
        int index = 1;
        for(int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i+1]){
                nums[index++] = nums[i + 1];
            }

        }
        return index;
    }

}