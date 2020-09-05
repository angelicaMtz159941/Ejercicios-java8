package com.ibm;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.ibm.stream.Stream8;
import com.ibm.stream.User;

public class StreamTest {


    @Test
    public void shouldReturnSquareRoot() {
        List<Integer> numbers = Arrays.asList(1, 4, 16, 256);
        List<Integer> squares = Stream8.returnSquareRoot(numbers);
        assertThat(squares, is(equalTo(Arrays.asList(1, 2, 4, 16))));
    }

    @Test
    public void shouldReturnAgeFromUser() {
        List<User> users = User.getUsersWithAge(18, 20);
        List<Integer> ageFromUsers = Stream8.getAgeFromUsers(users);
        assertThat(ageFromUsers, is(equalTo(Arrays.asList(18, 20))));
    }

    @Test
    public void shouldReturnDistinctLetters() {
        List<String> names = asList("Homer Simpson", "Marge Simpson", "Bart Simpson", "Kent Brockman");
        List<String> result = Stream8.getDistinctLetters(names);
        assertThat(result, equalTo(Arrays.asList("H", "o", "m", "e", "r", " " , "S", "i", "p", "s", "n", "M", "a", "g", "B", "t", "K", "c", "k")));
    }

    @Test
    public void shouldSeparateNamesByComma() {
        List<User> input = asList(
                new User("Homer"),
                new User("Maggie"),
                new User("Bart"));
        String result = Stream8.separateNamesByComma(input);
        assertThat(result, equalTo("Homer, Maggie, Bart"));
    }

}
