package JavaCode;

public class Algorithm {
    public void sumTwoString() {
        String str1 = "299";
        String str2 = "22";
        int carry = 0;
        StringBuffer str = new StringBuffer();
        int n1 = str1.length() - 1;
        int n2 = str2.length() - 1;
        while (n1 >= 0 || n2 >= 0) {
            int v1 = 0, v2 = 0;
            if (n1 >= 0)
                v1 = str1.charAt(n1--) - '0';
            if (n2 >= 0)
                v2 = str2.charAt(n2--) - '0';
            int sum = v1 + v2 + carry;
            str.insert(0, sum % 10);
            carry = sum / 10;
        }
        if (carry > 0)
            str.insert(0, carry);
        System.out.println(" sum of a and b is " + str);
        char x = '0';
        char y = '1';
        int u = x;
        System.out.println("x = " + (int) x);
        System.out.println("u = " + u);
    }

    //valindrom with delete al most 1 character
    public boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        boolean isDeleted = false;
        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                System.out.println("i = " + i + " j  = " + j + " val = " + s.charAt(i));
                i++;
                j--;
            } else {
                System.out.println("sai i = " + i + " j = " + j +  " val1 = " + s.charAt(i) + " val2 = " +  s.charAt(j));
                System.out.println("sai val1 + 1 = " + s.charAt(i + 1 ) + " val2 - 1 " +  s.charAt(j));
                if (isDeleted)
                    return false;

                if (s.charAt(i + 1) == s.charAt(j)) {
                    int x = i + 1;
                    System.out.println("i + 1= " + x + " j = " + j + " val = " + s.charAt(x));
                    i++;
                    isDeleted = true;
                } else if (s.charAt(i) == s.charAt(j - 1)) {
                    int x = i - 1;
                    System.out.println("i = " + i + " j - 1 = " + x + "val = " + s.charAt(x));
                    j--;
                    isDeleted = true;
                } else {
                    System.out.println(" false i = " + i + " j  = " + j + "val = " + s.charAt(i));
                    return false;
                }
                System.out.println("i = " + i + " j = " + j);
            }
            if (i > j)
                System.out.println(" i > j ");
        }
        System.out.println(" finally i = " + i + " j = " + j);
        return true;
    }
}