package online.study.tdd;

public class FizzBuzzGame {
    public String handleInputNumber(int inputNumber) {
        if (inputNumber % 3 == 0 && inputNumber % 5 == 0 && inputNumber % 7 == 0) {
            return "fizzbuzzwhizz";
        } else if (inputNumber % 3 == 0 && inputNumber % 5 == 0) {
            return "fizzbuzz";
        } else if (inputNumber % 3 == 0 && inputNumber % 7 == 0) {
            return "fizzwhizz";
        } else if (inputNumber % 5 == 0 && inputNumber % 7 == 0) {
            return "buzzwhizz";
        } else if (inputNumber % 3 == 0) {
            return "fizz";
        } else if (inputNumber % 5 == 0) {
            return "buzz";
        } else if (inputNumber % 7 == 0) {
            return "whizz";
        }
        return String.valueOf(inputNumber);
    }
}
