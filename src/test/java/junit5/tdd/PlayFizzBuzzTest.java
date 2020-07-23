package junit5.tdd;

import javafx.scene.media.AudioClip;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PlayFizzBuzzTest {
    @BeforeAll
    static void initTestEnv() {
    }

    @BeforeEach
    void initEveryMethod() {
    }
    @Test
    void should_return_1_when_play_fizz_buzz_when_given_1(){
        //given
        FizzBuzz fizzBuzz=new FizzBuzz();
        //when

        String actual=fizzBuzz.play(1);
        //then
        assertThat(actual, is("1"));
    }

}
