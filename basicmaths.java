//Q:1 Count Digits
//Q:2 Reverse a Number
//Q:3 Check Palindrome
//Q:4 Armstrong Numbers

//solution
//1.
public class Solution {
    public static int countDigits(int n){
          int num = n, cnt=0;
        
        while( n >0 ){

            int rem =n%10; 
            if( rem!=0 && num % rem == 0) cnt++;
            n/=10;

        }
        return cnt;
    }
}



//2.
class Solution {
    public int reverse(int x) {
         int result = 0;

    while (x != 0)
    {
        int lastdigit = x % 10;
        int newResult = result * 10 + lastdigit;
        if ((newResult - lastdigit) / 10 != result)
        { return 0; }
        result = newResult;
        x = x / 10;
    }

    return result;
}
        
    }


//3.
class Solution
{
    public String is_palindrome(int n)
    {
        int reverse =0;
        int temp;
        temp=n;
        while(n>0){
            int lastdigit = n%10;
            reverse =(reverse*10)+lastdigit;
            n=n/10;
        }
            if(temp==reverse){
                return "Yes";
            }
            else{
                return "No";
            }
           
            
        }
        
       
    }

//4.
class Solution {
    static String armstrongNumber(int n){
        int sum  =0;
        int temp;
        temp=n;
        while(n>0){
            int ld=n%10;
            sum =sum+(ld*ld*ld);
            n=n/10;
        }
        if(temp==sum){
            return "Yes";
        }
        else{
            return "No";
        }
       
    }
}
   
