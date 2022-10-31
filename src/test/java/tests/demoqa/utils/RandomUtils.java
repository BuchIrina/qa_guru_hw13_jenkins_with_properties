package tests.demoqa.utils;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class RandomUtils {


    public static String getRandomPhoneNumber(int numbers) {
        String generatedString = RandomStringUtils.randomNumeric(numbers);
        return generatedString;
    }

    public static String getRandomString(int length) {
        String SALTCHARS = "ABCDEFGHIJKLMNOPRSTUVWXYZ1234567890";
        StringBuilder result = new StringBuilder();
        Random random = new Random();
        while (result.length() < length) {
            int index = (int) (random.nextFloat() * SALTCHARS.length());
            result.append(SALTCHARS.charAt(index));
        }
        return result.toString();
    }

    public static String getHobbies() {
        String[] hobbies = new String[]{"Sports", "Reading", "Music"};
        Random random = new Random();
        int index = (int) (Math.random() * 3);
        return hobbies[index];
    }


}

