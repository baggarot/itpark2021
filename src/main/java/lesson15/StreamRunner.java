package lesson15;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamRunner {

    public static void main(String[] args) {
        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus at " +
                "faucibus. Donec mi quam, tempor vel ipsum non, faucibus suscipit massa. Morbi lacinia velit blandit " +
                "tincidunt efficitur. Vestibulum eget metus imperdiet sapien laoreet faucibus. Nunc eget vehicula " +
                "mauris, ac auctor lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer vel odio " +
                "nec mi tempor dignissim.";
        List<String> words = List.of(str.split("\\W+"));
        System.out.println(words);
        Map<String, Long> wordCount = words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder())
                        .thenComparing(Map.Entry.comparingByKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e2, LinkedHashMap::new));
        System.out.println(wordCount);
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текс для его разбивки на слова и обработки");
        String text = in.nextLine();
        List<String> wordsFromText = List.of(text.split("\\W+"));
        Map<String, Long> wordProcessing = wordsFromText.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder())
                        .thenComparing(Map.Entry.comparingByKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e2, LinkedHashMap::new));
        System.out.println(wordProcessing);
    }
}
