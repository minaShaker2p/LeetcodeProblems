public class AddBinaryProblem67 {
    /**
     * Given two binary strings, return their sum (also a binary string).
     * <p>
     * The input strings are both non-empty and contains only characters 1 or 0.
     * <p>
     * Example 1:
     * <p>
     * Input: a = "11", b = "1"
     * Output: "100"
     * Example 2:
     * <p>
     * Input: a = "1010", b = "1011"
     * Output: "10101"
     */

    public static String addBinarySol1(String a, String b) {
        StringBuilder result = new StringBuilder();
        char [] binaryNum1 = a.toCharArray();
        char [] binaryNum2 = b.toCharArray();
        int carry = 0,sum=0;
        int i=binaryNum1.length -1;
        int j=binaryNum2.length -1;


        while (i >=0  && j >=0) {
            int chunk1 = Character.getNumericValue(binaryNum1[i]);
            int chunk2 = Character.getNumericValue(binaryNum2[j]);
             sum=carry+chunk1+chunk2;

            if( sum==1)
            {
                carry=0;
                result.append(1);

            }else if(sum ==2)
            {
                carry=1;
                result.append(0);
            }
            else if(sum==3)
            {
                carry=1;
                result.append(1);
            }
            else
            {
                carry=0;
                result.append(0);
            }
            i--;
            j--;



        }

        while (i >= 0) {
            int chunk1 =Character.getNumericValue(binaryNum1[i]);
            sum= chunk1+carry;
            if(sum==1)
            {
                carry=0;
                result.append(1);
            }else if(sum==0)
            {
                carry=0;
                result.append(0);

            }else
            {
                carry=1;
                result.append(0);
            }
            i--;

        }

        while (j>= 0) {
            int chunk1 =Character.getNumericValue(binaryNum2[j]);
            sum=chunk1+carry;
            if(sum==1)
            {
                carry=0;
                result.append(1);
            }else if(sum==0)
            {
                carry=0;
                result.append(0);

            }else
            {
                carry=1;
                result.append(0);
            }
            j--;
        }
        if(carry ==1)
            result.append(1);

        return result.reverse().toString();
    }
}
