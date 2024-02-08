package task1;

public class Assignment1 {

    public static void main(String[] args) {
        String documentNumber = "1234-abc-5678-xyz-1a2b";

        printFirstTwoBlocks(documentNumber);
        printDocumentWithMaskedLetters(documentNumber);
        printLowerCaseLetters(documentNumber);
        printUpperCaseLetters(documentNumber);
        checkSequenceContains(documentNumber, "abc");
        checkStartsWithSequence(documentNumber, "555");
        checkEndsWithSequence(documentNumber, "1a2b");

        String randomString = "This is a random string with some words.";
        findShortestWord(randomString);
        findLongestWord(randomString);

        String initialString = "Hello";
        duplicateLetters(initialString);
    }

    public static void printFirstTwoBlocks(String documentNumber) {
        String[] blocks = documentNumber.split("-");
        System.out.println(blocks[0] + "-" + blocks[1]);
    }

    public static void printDocumentWithMaskedLetters(String documentNumber) {
        String[] blocks = documentNumber.split("-");
        System.out.println(blocks[0] + "-***-" + blocks[3] + "-***-" + blocks[4]);
    }

    public static void printLowerCaseLetters(String documentNumber) {
        String letters = documentNumber.replaceAll("[^a-zA-Z]", "");
        System.out.println(letters.toLowerCase().replaceAll("...", "$0/"));
    }

    public static void printUpperCaseLetters(String documentNumber) {
        String letters = documentNumber.replaceAll("[^a-zA-Z]", "");
        StringBuilder result = new StringBuilder("Letters:");
        for (char c : letters.toCharArray()) {
            result.append(Character.toUpperCase(c)).append("/");
        }
        System.out.println(result.substring(0, result.length() - 1));
    }

    public static void checkSequenceContains(String documentNumber, String sequence) {
        if (documentNumber.toLowerCase().contains(sequence.toLowerCase())) {
            System.out.println("Document contains the sequence '" + sequence + "'.");
        } else {
            System.out.println("Document does not contain the sequence '" + sequence + "'.");
        }
    }

    public static void checkStartsWithSequence(String documentNumber, String sequence) {
        if (documentNumber.startsWith(sequence)) {
            System.out.println("Document starts with the sequence '" + sequence + "'.");
        } else {
            System.out.println("Document does not start with the sequence '" + sequence + "'.");
        }
    }

    public static void checkEndsWithSequence(String documentNumber, String sequence) {
        if (documentNumber.endsWith(sequence)) {
            System.out.println("Document ends with the sequence '" + sequence + "'.");
        } else {
            System.out.println("Document does not end with the sequence '" + sequence + "'.");
        }
    }

    public static void findShortestWord(String input) {
        String[] words = input.split("\\s+");
        String shortestWord = words[0];
        for (String word : words) {
            if (word.length() <= shortestWord.length()) {
                shortestWord = word;
            }
        }
        System.out.println("Shortest word: " + shortestWord);
    }

    public static void findLongestWord(String input) {
        String[] words = input.split("\\s+");
        String longestWord = words[0];
        for (String word : words) {
            if (word.length() >= longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("Longest word: " + longestWord);
    }

    public static void duplicateLetters(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            result.append(c).append(c);
        }
        System.out.println(result.toString());
    }
}

