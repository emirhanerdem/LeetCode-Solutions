import java.util.*;
public class Solution2_palindrome_number {
    public boolean isPalindrome(int x){
        int num=0;
        int temp=x;
        if(x<0) return false;
        while(temp!=0){
            int remainder = temp % 10;
            num = num * 10 + remainder;
            temp /= 10;
        }
        return num==x;
    }
}
