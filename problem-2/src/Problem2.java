// delete this line
public class Problem2 {
    public static void main(String[] args) {

        int firstFib = 1;
        int secondFib = 2;
        int nextFib = 3;    // 1 + 2
        int answer = 2;     // сразу заносим в ответ как четное

        while (nextFib < 4_000_000) {

            nextFib = firstFib + secondFib;
            firstFib = secondFib;
            secondFib = nextFib;

            if (nextFib % 2 == 0) {
                answer += nextFib;
            }
        }

        System.out.println("Answer is " + answer);
    }
}