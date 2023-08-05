/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author arkadiuszkuzma
 */
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;

public class Dictionary {

    private HashMap<String, String> translations;
    private ArrayList<String> words;

    Dictionary() {
        this.translations = new HashMap<>();
        this.words = new ArrayList<>();
        add("sana", "word");
    }

    public String get(String word) {
        return this.translations.get(word);
    }

    public void add(String word, String translation) {
        if (!this.translations.containsKey(word)) {
            this.words.add(word);
        }
        this.translations.putIfAbsent(word, translation);
    }

    public String getRandom() {
        Random random = new Random();
        return this.words.get(random.nextInt(this.words.size()));
    }

}
