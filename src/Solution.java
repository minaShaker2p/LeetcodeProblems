import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {

        System.out.println(AddBinaryProblem67.addBinarySol1("100","110010"));


    }


    public static int sumTwoNumber(int x, int y) {
        return x + y;
    }

    public static String concatTwoStrings(String firstString, String secondString) {
        return firstString + secondString;
    }

    public static String solution(String s) {
        // write your code in Java SE 8

        List<Character> characters = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (c != ' ' && c != '-') {
                characters.add(c);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();

        int numOfChunks = characters.size() / 3;
        int numOfRemainingChar = characters.size() - (numOfChunks * 3);
        if (numOfRemainingChar == 1)
            numOfChunks -= 1;
        for (int i = 0; i < (numOfChunks * 3); i++) {
            if (i % 3 != 0 || i == 0)
                stringBuilder.append(characters.get(i));
            else
                stringBuilder.append("-").append(characters.get(i));

        }
        for (int i = numOfChunks * 3; i < characters.size(); i++) {
            if (i % 2 != 0 || i == 0)
                stringBuilder.append(characters.get(i));
            else
                stringBuilder.append("-").append(characters.get(i));
        }

        return stringBuilder.toString();

    }

    public  static int romanToInt(String s) {
        HashMap<Character, Integer> romanValues=new HashMap<>();
        romanValues.put('I',1);
        romanValues.put('V',5);
        romanValues.put('X',10);
        romanValues.put('L',50);
        romanValues.put('C',100);
        romanValues.put('D',500);
        romanValues.put('M',1000);
        char[] chars =s.toCharArray();

        int result=romanValues.get(chars[chars.length-1]);
        for(int i=chars.length-2; i >=0;i--)
        {
            if(romanValues.get(chars[i]) >=romanValues.get(chars[i+1]))
                result+=romanValues.get(chars[i]);
            else
                result-=romanValues.get(chars[i]);

        }

        // Stack<Character> myStack = new Stack<>();
        /*for(int i=chars.length-1;i >= 0;i--)
        {
            myStack.push(chars[i]);

        }
        while(myStack.size() > 0){
            {
                int  val1 =map.get(myStack.pop()); //I
                int val2= 0;
                if(myStack.size() >0)
                    val2=map.get(myStack.pop()); //V
                if(val2==0)
                    result +=val1;
                else if(val1 >= val2)
                    result+=val1+val2;
                else
                    result +=val2 - val1;


            }
        }*/
        return result;

    }

    static String countnndSay(int n)
    {
        // Base cases
        if (n == 1)     return "1";
        if (n == 2)     return "11";

        // Find n'th term by generating
        // all terms from 3 to n-1.
        // Every term is generated
        // using previous term

        // Initialize previous term
        StringBuilder str = new StringBuilder("11");
        for (int i = 3; i <= n; i++)
        {
            // In below for loop, previous
            // character is processed in
            // current iteration. That is
            // why a dummy character is
            // added to make sure that loop
            // runs one extra iteration.
            str.append('$');
            int len = str.length();

            int cnt = 1; // Initialize count
            // of matching chars
            StringBuilder tmp = new StringBuilder(); // Initialize i'th
            // term in series
            char []arr = str.toString().toCharArray();

            // Process previous term
            // to find the next term
            for (int j = 1; j < len; j++)
            {
                // If current character
                // does't match
                if (arr[j] != arr[j - 1])
                {
                    // Append count of
                    // str[j-1] to temp
                    tmp.append(cnt);

                    // Append str[j-1]
                    tmp.append(arr[j - 1]);

                    // Reset count
                    cnt = 1;
                }

                // If matches, then increment
                // count of matching characters
                else cnt++;
            }

            // Update str
            str = new StringBuilder(tmp.toString());
        }

        return str.toString();
    }


}
