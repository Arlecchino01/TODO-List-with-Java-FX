import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;


public class Main extends Application{

    @Override
    public void start(Stage stage){
        //빈 루트 컨테이너
        StackPane root = new StackPane();

        //Scene 생성
        Scene scene = new Scene(root, 700, 400);

        //Stage 설정
        stage.setTitle("FX 테스팅");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
