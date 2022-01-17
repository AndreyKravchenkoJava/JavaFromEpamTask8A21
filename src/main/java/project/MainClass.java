package project;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClass {
    public static void main(String[] args) {
        String text = "У меня было 2000 гривен, из которых я потратил 500 на курсы";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);
        List<Integer> number = new ArrayList<>();
        while (matcher.find()) {
            number.add(Integer.parseInt(matcher.group()));
        }

        int sum = 0;
        for (int numbers : number) {
            sum += numbers;
        }

        System.out.println("Sum numbers of text: " + sum);
    }
}
