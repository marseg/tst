package by.konezhlod;

public class TstMain {

    public static void main(String args[]) {
        method(null);
        System.out.println(division(100, 23));
    }
    
    private static void strings() {
        String s1 = "ABC";
        String s2 = "ABC";
        String s3 = new String(s2);
        String s4 = new String("ABC");

        // s1
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println("Result: " + s1 == s2);

        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));

        System.out.println(s1 == s4);
        System.out.println(s1.equals(s4));

        // s2
        System.out.println(s2 == s3);
        System.out.println(s2.equals(s3));

        System.out.println(s2 == s4);
        System.out.println(s2.equals(s4));

        // s3
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
    }

    // https://www.journaldev.com/552/java-tricky-interview-questions
    public static void method(Long l) {
        System.out.println("Long impl");
    }
    public static void method(Number n) {
        System.out.println("Number impl");
    }
    public static void method(Object o) {
        System.out.println("Object impl");
    }

    public static long division (long a, long b) {
        if (a < b)
            return 0;

        long c = b;

        long counter = 1;
        while (a >= c) {
            long tmp = c;
            c <<= 1;
            if (a >= c) {
                counter <<= 1; // counter *= 2;
            } else {
                counter += division(a - tmp, b);
            }
        }
        return counter;
    }
}
