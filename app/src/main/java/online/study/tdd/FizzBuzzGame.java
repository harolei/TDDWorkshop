package online.study.tdd;

public class FizzBuzzGame {
    public String handleInputNumber(int inputNumber) {
        if (inputNumber % 3 == 0) {
            return "fizz";
        }
        return String.valueOf(inputNumber);
    }
}
