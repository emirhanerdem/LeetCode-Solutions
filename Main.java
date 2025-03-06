public class Main {
    public static void main(String[] args) {

        //*************************************************************
        Solution1_two_sum solution1 = new Solution1_two_sum();
        int[] dizi = {2,11,15,7,4};
        int[] dizi2 = solution1.twoSum(dizi,9);
        for (int j : dizi2) {
            System.out.print(j + " ");
        }

        //*************************************************************

        Solution2_palindrome_number solution2 = new Solution2_palindrome_number();
        System.out.println(solution2.isPalindrome(1233));

        //*************************************************************





    }
}