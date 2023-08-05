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
public class InputView {

    private Dictionary dictionary;

    public InputView(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public Parent getView() {
        GridPane inputView = new GridPane();
        Label word = new Label("Word");
        Label translation = new Label("Translation");
        TextField wordInput = new TextField();
        TextField transInput = new TextField();
        Button addWord = new Button("Add the word pair");
        inputView.add(word, 0, 0);
        inputView.add(wordInput, 0, 1);
        inputView.add(translation, 0, 2);
        inputView.add(transInput, 0, 3);
        inputView.add(addWord, 0, 4);
        inputView.setPadding(new Insets(20, 20, 20, 20));
        addWord.setOnMouseClicked((event) -> {
            dictionary.add(wordInput.getText(), transInput.getText());
            wordInput.clear();
            transInput.clear();
        });
        return inputView;
    }
}
