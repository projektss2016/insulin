import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

//    private Stage primaryStage;
//    private BorderPane rootLayout;

//    @Override
//    public void start(Stage primaryStage) {
//        this.primaryStage = primaryStage;
//        this.primaryStage.setTitle("InsulinApp");
//
//        initRootLayout();
//
//        showPersonOverview();
//    }

    /**
     * Initializes the root layout.
     */
//    public void initRootLayout() {
//        try {
//             Load root layout from fxml file.
//            FXMLLoader loader = new FXMLLoader();
//            loader.setLocation(Main.class.getResource("RootLayout.fxml"));
//  rootLayout = (BorderPane) loader.load();
//
//            // Show the scene containing the root layout.
//            Scene scene = new Scene(rootLayout);
//            primaryStage.setScene(scene);
//            primaryStage.show();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    /**
     * Shows the person overview inside the root layout.
     */
//    public void showPersonOverview() {
//        try {
//            // Load person overview.
//            FXMLLoader loader = new FXMLLoader();
//            loader.setLocation(Main.class.getResource("StartWindow.fxml"));
//            AnchorPane produktOverview = (AnchorPane) loader.load();
//
//            // Set person overview into the center of root layout.
//            rootLayout.setCenter(produktOverview);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    /**
     * Returns the main stage.
     *
     * @return
     */
//    public Stage getPrimaryStage() {
//        return primaryStage;
//    }
    public static void main(String[] args) {
        launch(args);
    }



    @Override
    public void start(Stage primaryStage) throws IOException {
        //TODO: check language sys parametr
        ResourceBundle resourceBundle = ResourceBundle.getBundle("bundles.bundle", new Locale("de"));
        Parent root = FXMLLoader.load(getClass().getResource("/w_start08.fxml"), resourceBundle);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 600, 600));
        primaryStage.show();
    }


//    public static void main(String[] args) {
//        launch(args);
//    }
}
