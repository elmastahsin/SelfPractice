package SelfPracticeInMentorTraining;

public class Choose {
    public static void main(String[] args) {
        System.out.println(choose(6,3));
    }
   public static int choose(int n, int k) {
       System.out.println("n: " + n +  "k = " + k);
        if (n < 0 || k < 0 || k > n) {
            return -1;
        }
        if (k == 0) {
            return 1;
        }
        if (k == n) {
            return 1;
        }
        return choose(n - 1, k - 1) + choose(n - 1, k);
    }
}
