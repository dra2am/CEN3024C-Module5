public class Main {

    public static void main(String[] args) {
        int input = 10;

        System.out.println("Iterative Method: ");
        long startTime = System.nanoTime();
        iterativeFib(input);
        long elapsedNanos = System.nanoTime() - startTime;
        System.out.println("Iterative time: " + elapsedNanos);

        System.out.println("Recursive Method: ");
        long startTimeB = System.nanoTime();
        System.out.println(recursiveFib(input));
        long elapsedNanosB = System.nanoTime() - startTimeB;
        System.out.println("Recursive time: " + elapsedNanosB);
    }

    //iterative
    public static void iterativeFib(int max){

        int num1 = 0;
        int num2 = 1;
        int counter = 0;

        //print 0...1...
        System.out.println(num1);
        System.out.println(num2);

        while (counter < max){
            int newNum = num1 + num2;

            System.out.println(newNum);

            //reassign variables
            num1 = num2;
            num2 = newNum;

            //inc counter
            counter++;
        }
    }


    //recursive
    public static int recursiveFib(int num){
        if (num == 1 || num == 0){
            return num;
        }
        return recursiveFib(num - 1) + recursiveFib(num - 2);
    }
}
