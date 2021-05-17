package online.study.tdd;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzGameTest {
    @Test
    public void shouldReturnInputNumberInStringGivenInt() {
        //given
        int inputNumber = 1;
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        //when
        String result = fizzBuzzGame.handleInputNumber(inputNumber);
        //then
        assertThat(result, is("1"));
    }

    @Test
    public void shouldReturnFizzGivenInputNumberCanBeDividedBy3() {
        //given
        int inputNumber = 3;
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        //when
        String result = fizzBuzzGame.handleInputNumber(inputNumber);
        //then
        assertThat(result, is("fizz"));
    }
}