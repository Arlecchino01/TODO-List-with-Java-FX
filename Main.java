import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;



public class Main extends Application{
    
    @Override
    public void start(Stage stage) throws Exception{
        Font.loadFont(getClass().getResourceAsStream("/resources/fonts/Monoton.ttf"), 14);
        Font.loadFont(getClass().getResourceAsStream("/resources/fonts/Poppins-Black.ttf"), 14);
        Label label = new Label("Font test");
        
        
        //루트 컨테이너
        StackPane root = new StackPane(label);

        //Scene 생성
        Scene scene = new Scene(root, 700, 400);

        scene.getStylesheets().add(getClass().getResource("resources/style.css").toExternalForm());

        //Stage 설정
        stage.setTitle("FX 테스팅");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
