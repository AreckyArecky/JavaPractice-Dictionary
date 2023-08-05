/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.scene.control.Button;
import javafx.scene.Parent;
import javafx.geometry.Insets;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 *
 * @author arkadiuszkuzma
 */
public class PracticeView {

    private Dictionary dictionary;
    private String word;

    public PracticeView(Dictionary dictionary) {
        this.dictionary = dictionary;
        this.word = dictionary.getRandom();

    }

    public Parent getView() {
        GridPane practiceView = new GridPane();
        Label practice = new Label("Practice the word '" + this.word + "'");
        TextField inputWord = new TextField();
        Button check = new Button("Check");
        Label feedback = new Label("");
        practiceView.add(practice, 0, 0);
        practiceView.add(inputWord, 0, 1);
        practiceView.add(check, 0, 2);
        practiceView.add(feedback, 0, 3);
        practiceView.setPadding(new Insets(20,20,20,20));
        check.setOnMouseClicked((event) -> {
            if (dictionary.get(word).equals(inputWord.getText())) {
                feedback.setText("Correct!");
            } else {
                feedback.setText("Incorrect! The translation for the word " + this.word + " is " + dictionary.get(word));
            }
            this.word = this.dictionary.getRandom();
            practice.setText("Practice the word '" + this.word + "'");
            inputWord.clear();
        });
        return practiceView;
    }
}
