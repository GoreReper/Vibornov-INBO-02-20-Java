package pr5;
import java.util.Scanner;

public class Recursion {
    static int one(int n,int k){ // firstTask(n,1,0);
        if (n<=0)
            return 0;
        else {
            for (int i=0;i<k && n>0;i++){
                System.out.println(k);
                n--;
            }
            return one(n, k+1);
        }

    }
    static int two(int n,int i){
        if(i>n) {
            return 0;
        }
        System.out.println(i);
        return two(n,++i);
    }
    static int three(int a,int b){
        if(a==b) {
            System.out.println(a);
            return 0;
        }
        else if(a<b) {
            System.out.println(a);
            return three(++a,b);
        }
        else{
            System.out.println(b);
            return three(a,++b);
        }
    }
    static int four(int len,int sum, int s,int k){
        if (len == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int c;
        if (len==0){
            c = 1;
        }
        else{
            c = 0;
        }
        int res = 0;
        for (int i = c; i < 10; i++) {
            res += four(len + 1, sum + i, k, s);
        }
        return res;
    }
    static int five(int n,int sum){
        if (n==0){
            return sum;
        }
        return five( n/10, sum+(n%10));
    }
    static boolean six(int n,int k){
        if (k>=n/2){
            return true;
        }
        else if (n%k==0){
            return false;
        }
        return six(n,++k);
    }
    static int seven(int n,int k) {
        if (k > n / 2) {
            System.out.println(n);
            return 0;
        }
        if (n % k == 0) {
            System.out.println(k);
            return seven(n / k, k);
        } else {
            return seven(n, ++k);

        }
    }
    public static String eight(String s) {
        if (s.length() == 1) {
            return "YES";
        } else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1, s.length()))) {
                if (s.length() == 2) {
                    return "YES";
                }
                return eight(s.substring(1, s.length() - 1));
            } else {
                return "NO";
            }
        }
    }
    public static int nine(int a, int b) {
        if (a > b + 1 ) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return nine(a, b - 1) + nine(a - 1, b - 1);
    }
    public static int ten(int n, int res){
        if (n==0){
            return res;
        }
        return ten(n/10,res*10+n%10);
    }
    public static int eleven() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n==0){
            n = in.nextInt();
            if (n==0){
                return 0;
            }
        }
        if (n==1) {
            return eleven()+1;
        }
        return eleven();
    }
    public static String twelve() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n==0){
            return " ";
        }
        if (n%2!=0) {
            return n+" "+twelve();
        }
        return twelve();
    }
    public static String thirteen() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n==0){
            return " ";
        }
        int m = in.nextInt();
        if (m==0){
            return n+" ";
        }
        return n+" "+thirteen();
    }
    public static String fourteen(int n) {
        if (n < 10) {
            return Integer.toString(n);
        }
        else {
            return fourteen(n / 10)+" "+n%10;
        }
    }
    public static String fifteen(int n) {
        if (n < 10) {
            return Integer.toString(n);
        }
        else {
            return n%10+" "+fifteen(n / 10);
        }
    }
    public static int sixteen(int max,int i) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n==0){
            System.out.println(i);
            return 0;
        }
        if (n>max) {
            return sixteen(n,1);
        }
        else if (n==max) {
            return sixteen(n,++i);
        }
        return sixteen(max,i);
    }
    public static int seventeen() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 0) {
            return 0;
        }
        else {
            return Math.max(n, seventeen());
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a,b;
        String s;
        a = in.nextInt();
        s = in.nextLine();
        switch (a){
            case 1:
                a = in.nextInt();
                one(a,1);
                in.close();
                break;
            case 2:
                a = in.nextInt();
                two(a,1);
                in.close();
                break;
            case 3:
                 a = in.nextInt();
                 b = in.nextInt();
                three(a,b);
                in.close();
                break;
            case 4:
                a = in.nextInt();
                b = in.nextInt();
                System.out.println(four(0,0,a,b));
                in.close();
                break;
            case 5:
                a = in.nextInt();
                System.out.println(five(a,0));
                in.close();
                break;
            case 6:
                a = in.nextInt();
                System.out.println(six(a,2));
                in.close();
                break;
            case 7:
                a = in.nextInt();
                seven(a,2);
                in.close();
                break;
            case 8:
                s = in.nextLine();
                System.out.println(eight(s));
                break;
            case 9:
                a = in.nextInt();
                b = in.nextInt();
                System.out.println(nine(a,b));
                in.close();
                break;
            case 10:
                a = in.nextInt();
                System.out.println(ten(a,0));
                in.close();
                break;
            case 11:
                System.out.println(eleven());
                break;
            case 12:
                System.out.println(twelve());
                break;
            case 13:
                System.out.println(thirteen());
                break;
            case 14:
                a = in.nextInt();
                System.out.println(fourteen(a));
                in.close();
                break;
            case 15:
                a = in.nextInt();
                System.out.println(fifteen(a));
                in.close();
                break;
            case 16:
                sixteen(0,0);
                break;
            case 17:
                System.out.println(seventeen());



        }
    }
}
