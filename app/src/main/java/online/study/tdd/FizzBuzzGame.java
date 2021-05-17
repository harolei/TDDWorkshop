package online.study.tdd;

public class FizzBuzzGame {
    public String handleInputNumber(int inputNumber) {
        if (inputNumber % 3 == 0) {
            return "fizz";
        } else if (inputNumber % 5 == 0) {
            return "buzz";
        }
        return String.valueOf(inputNumber);
    }
}
