package week6;

public class Q3 {
    public static void main(String[] args) {
        MyStack<Integer> S = new MyStack<>();
        S.push(7);
        S.push(3);
        S.push(5);
        S.push(6);
        S.push(2);

        System.out.println(getSum(S));

    }

    public static int getSum(MyStack<Integer> S) {
        int sum = 0;
        while (!S.isEmpty())
            sum += S.pop();

        return sum;
    }
}
