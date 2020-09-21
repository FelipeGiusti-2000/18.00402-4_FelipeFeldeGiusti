package giusti.felipe.tests;

import giusti.felipe.controller.ControllerInterface;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Classe que roda a aplicacao com interface gráfica
 * @author Felipe Felde Giusti
 * @since 16/09/2020
 */
public class RunApplication extends Application {
    /**
     * Método que começa a aplicação
     */
    public void run(){
        launch();
    }

    /**
     * Método que usa as classes do controller e viewer para inicializar a aplicação
     * @param primaryStage Stage primário da aplicacao
     * @throws Exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("../view/ViewInterface.fxml"));
        primaryStage.setTitle("Atividade PSub1");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }
}
