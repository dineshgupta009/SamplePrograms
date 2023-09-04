package org.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class streamProb1 {

    public static void main(String[] args) {

        List<String> listString = Arrays.asList("83d","349d", "12234");
        long str = listString.stream()
                .filter(x->x.chars().filter(Character::isDigit)
                        .map(Character::getNumericValue).sum()>10).count();
        System.out.println(str);

    }
}
