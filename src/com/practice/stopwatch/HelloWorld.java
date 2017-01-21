package com.practice.stopwatch;
 
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
public class HelloWorld extends Application {
    
    @Override
    public void start(Stage primaryStage) {
    	
        Button btn = new Button();
        btn.setText("START");
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
            	btn.setText("STOP");
//                System.out.println("Hello World!");
//            	StopWatch stopWatch = new StopWatch();
//        		stopWatch.startTimer();
//        		Thread th = new Thread(stopWatch);
//        		th.start();
            }
        });
        
        Text scenetitle = new Text("Welcome");
        
        StackPane root = new StackPane();
        
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("STOPWATCH");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 public static void main(String[] args) {
        launch(args);
    }
}