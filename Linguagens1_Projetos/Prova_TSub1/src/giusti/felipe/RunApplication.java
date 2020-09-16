package giusti.felipe;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RunApplication extends Application {
    public void run(){
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("view/ViewInterface.fxml"));
        primaryStage.setTitle("Atividade PSub1");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }
}
