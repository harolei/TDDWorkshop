package online.study.tdd;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzGameTest {

    private final FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();

    @Test
    public void shouldReturnInputNumberInStringGivenInt() {
        //given
        int inputNumber = 1;
        //when
        String result = fizzBuzzGame.handleInputNumber(inputNumber);
        //then
        assertThat(result, is("1"));
    }

    @Test
    public void shouldReturnFizzGivenInputNumberCanBeDividedBy3() {
        //given
        int inputNumber = 3;
        //when
        String result = fizzBuzzGame.handleInputNumber(inputNumber);
        //then
        assertThat(result, is("fizz"));
    }

    @Test
    public void shouldReturnBuzzGivenInputCanBeDividedBy5() {
        //given
        int inputNumber = 5;
        //when
        String result = fizzBuzzGame.handleInputNumber(inputNumber);
        //then
        assertThat(result, is("buzz"));
    }

    @Test
    public void shouldReturnFizzBuzzGivenInputCanBeDividedBy3And5() {
        //given
        int inputNumber = 15;
        //when
        String result = fizzBuzzGame.handleInputNumber(inputNumber);
        //then
        assertThat(result, is("fizzbuzz"));
    }

    @Test
    public void shouldReturnWhizzGivenInputCanBeDividedBy7() {
        //given
        int inputNumber = 7;
        //when
        String result = fizzBuzzGame.handleInputNumber(inputNumber);
        //then
        assertThat(result, is("whizz"));
    }

    @Test
    public void shouldReturnFizzWhizzGivenInputCanBeDividedBy3And7() {
        //given
        int inputNumber = 21;
        //when
        String result = fizzBuzzGame.handleInputNumber(inputNumber);
        //then
        assertThat(result, is("fizzwhizz"));
    }

    @Test
    public void shouldReturnBuzzWhizzGivenInputCanBeDividedBy5And7() {
        //given
        int inputNumber = 35;
        //when
        String result = fizzBuzzGame.handleInputNumber(inputNumber);
        //then
        assertThat(result, is("buzzwhizz"));
    }

    @Test
    public void shouldReturnFizzBuzzWhizzGivenInputCanBeDividedBy3_5_7() {
        //given
        int inputNumber = 105;
        //when
        String result = fizzBuzzGame.handleInputNumber(inputNumber);
        //then
        assertThat(result, is("fizzbuzzwhizz"));
    }
}