import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{

    public void start(Stage primaryStage){
        Label titulo = new Label("Soma");
        TextField campo1 = new TextField();
        campo1.setPromptText("Digite o primeiro numero");

        TextField campo2 = new TextField();
        campo2.setPromptText("Digite o segundo numero");

        Button botao = new Button("Enviar");
        Label resultado=new Label();

        botao.setOnAction(evento ->{
            try{
                double numero1 = Double.parseDouble(campo1.getText());
                double numero2 = Double.parseDouble(campo2.getText());
                double soma = numero1+numero2;
                resultado.setText("O resultado é "+soma);
            }catch (NumberFormatException exception){
                resultado.setText("O numero não é valido");
                campo1.setText("");
                campo2.setText("");

            };
        });
        
        VBox layout = new VBox(10);
        layout.getChildren().addAll(titulo,campo1,campo2,botao,resultado);
        Scene scene = new Scene(layout,300,150);
        primaryStage.setTitle("Calculadora");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main (String[] args){
        launch(args);
    }
}


