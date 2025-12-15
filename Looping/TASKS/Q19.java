import java.util.Scanner;

class Q19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sq = n * n;

        if (String.valueOf(sq).endsWith(String.valueOf(n)))
            System.out.println("Automorphic");
        else
            System.out.println("Not Automorphic");
    }
}
