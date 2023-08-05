package application;

import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.geometry.Insets;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;

// END SOLUTION
public class VocabularyPracticeApplication extends Application {

    private Dictionary dictionary;

    @Override
    public void init() {
        this.dictionary = new Dictionary();
    }

    public void start(Stage window) {
        InputView inputView = new InputView(dictionary);
        PracticeView practiceView = new PracticeView(dictionary);
        HBox menu = new HBox();
        Button inputBtn = new Button("Add words");
        Button practiceBtn = new Button("Practice words");
        menu.getChildren().addAll(inputBtn, practiceBtn);
        menu.setSpacing(10);
        menu.setPadding(new Insets(20, 20, 20, 20));
        BorderPane mainView = new BorderPane();
        mainView.setTop(menu);
        mainView.setCenter(inputView.getView());
        inputBtn.setOnAction((event) -> mainView.setCenter(inputView.getView()));
        practiceBtn.setOnAction((event) -> mainView.setCenter(practiceView.getView()));

        Scene main = new Scene(mainView);
        window.setScene(main);
        window.show();
    }

    public static void main(String[] args) {
        launch(VocabularyPracticeApplication.class);
    }
}
