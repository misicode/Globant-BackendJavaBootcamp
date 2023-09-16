package _01POO.P108.services;

import _01POO.P108.entities.Chain;

import java.util.HashMap;
import java.util.Scanner;

public class ChainService {
    Scanner scanner = new Scanner(System.in);

    public Chain createChain() {
        Chain chain = new Chain();

        System.out.print("Ingrese la frase: ");
        chain.setPhrase(scanner.nextLine());

        return chain;
    }

    private boolean isVowel(char c) {
        return "aeiou".contains(String.valueOf(c));
    }

    public void showVowels(Chain chain) {
        HashMap<Character, Integer> countVowels = new HashMap<>();
        countVowels.put('a', 0);
        countVowels.put('e', 0);
        countVowels.put('i', 0);
        countVowels.put('o', 0);
        countVowels.put('u', 0);

        for(char letter: chain.getPhrase().toLowerCase().toCharArray()) {
            if(isVowel(letter)) {
                countVowels.put(letter, countVowels.get(letter) + 1);
            }
        }

        System.out.println("N° de \"A\": " + countVowels.get('a'));
        System.out.println("N° de \"E\": " + countVowels.get('e'));
        System.out.println("N° de \"I\": " + countVowels.get('i'));
        System.out.println("N° de \"O\": " + countVowels.get('o'));
        System.out.println("N° de \"U\": " + countVowels.get('u'));
    }

    public void reversePhrase(Chain chain) {
        StringBuilder chainBuilder = new StringBuilder(chain.getPhrase());

        System.out.println("Frase original: " + chain.getPhrase());
        System.out.println("Frase invertida: " + chainBuilder.reverse());
    }

    public void countCharacter(Chain chain, char c) {
        int count = 0;

        for(char letter: chain.getPhrase().toCharArray()) {
            if(letter == c) {
                count++;
            }
        }

        System.out.println("El carácter " + c + " se repite " + count + " veces");
    }

    public void compareLongitude(Chain chain, String phrase) {
        if(chain.getLongitude() == phrase.length()) {
            System.out.println("Longitudes coinciden");
        } else {
            System.out.println("Longitudes no coinciden");
        }
    }

    public void joinPhrases(Chain chain, String phrase) {
        String newPhrase = chain.getPhrase().concat(" ").concat(phrase).trim();
        chain.setPhrase(newPhrase);
        System.out.println("Resultado: " + newPhrase);
    }

    public void replaceCharacter(Chain chain, char c) {
        String newPhrase = chain.getPhrase().replace('a', c);
        chain.setPhrase(newPhrase);
        System.out.println("Resultado: " + newPhrase);
    }

    public void containsCharacter(Chain chain, char c) {
        if(chain.getPhrase().contains(String.valueOf(c))) {
            System.out.println("Contiene el carácter");
        } else {
            System.out.println("No contiene el carácter");
        }
    }
}
