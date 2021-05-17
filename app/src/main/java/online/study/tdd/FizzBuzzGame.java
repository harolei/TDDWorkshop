package online.study.tdd;

public class FizzBuzzGame {
    public String handleInputNumber(int inputNumber) {
        String result = getFizzBuzz(inputNumber);
        if (result.equals("")) {
            result = String.valueOf(inputNumber);
        }
        return result;
    }

    private String getFizzBuzz(int inputNumber) {
        String result = "";
        if (inputNumber % 3 == 0) {
            result += "fizz";
        }
        if (inputNumber % 5 == 0) {
            result += "buzz";
        }
        if (inputNumber % 7 == 0) {
            result += "whizz";
        }
        return result;
    }
}
