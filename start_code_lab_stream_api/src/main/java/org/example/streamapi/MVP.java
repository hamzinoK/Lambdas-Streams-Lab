package org.example.streamapi;

import com.sun.security.jgss.InquireSecContextPermission;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MVP {

    /*
        Convert a List<String> to an object stream and for each element -> System,out.println.
     */

    public void printNames(List<String> names) {

        names.stream().forEach(System.out::println);
    }

    /*
        Given a List<Integers>, return a List<Integer> with event numbers.
     */
    public List<Integer> returnEvenNumbers(List<Integer> numbers) {

        return numbers.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());


        }



    /*
        Given an int [], double the value of each int and return an int [].
    */
    public int[] doubleInts(int[] numbers) {

       return Arrays.stream(numbers).map(num -> num * 2).toArray();

    }

    /*
        Given a String, return a List<String>, all caps.
     */
    public List<String> splitToAllCapsList(String input) {
        // Implement me :)
        return Arrays.stream(input.split("")).map(str -> str.toUpperCase()).collect(Collectors.toList());
    }

    /*
    Given a list of animals:
     - filter the ones that start with a given letter
     - return sorted List<String>, all caps.
    */
    public List<String> filterByFirstLetterAndOrder(List<String> list, String letter) {
        return list.stream().filter(str -> str.substring(0,1).equals(letter)).sorted().map(str -> str.toUpperCase())
                .collect(Collectors.toList());
    }

    /*
        Given a list of words, return elements that:
         - are shorter than the given number and
         - start with a given letter.
    */
    public List<String> filterWords(List<String> words, int maxLength, String firstLetter) {

        words.stream().filter(str -> str.length() < maxLength && str.startsWith(firstLetter))
                .collect(Collectors.toList());
        return words;
    }
}