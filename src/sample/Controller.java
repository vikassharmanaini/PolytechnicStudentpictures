package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.io.File;

public class Controller {


    private int y=19;
@FXML
    private TextField Scode;
@FXML
    private TextField bcode;
@FXML
    private TextField pathtxt;
@FXML
    private Button start;
@FXML
    private Button chose;
@FXML
    private Button close;
@FXML
    private ProgressBar pr;
@FXML
    private Pane base;
@FXML
private Label err;
    @FXML
    private void twnine(){
    this.y=19;
    }
    @FXML
    private  void twtw(){
    this.y=20;
    }
    @FXML
    private void twone(){
    this.y=21;
    }
    @FXML
    private void close(ActionEvent actionEvent) {

    }
    @FXML
    private void Start(){
        String a="https://bteup.ac.in/PDFFILES/studentimages/PE"+y+Scode.getText()+bcode.getText()+"000";
        Scode.setVisible(false);
        bcode.setVisible(false);
        pathtxt.setVisible(false);
        start.setVisible(false);
        chose.setVisible(false);
        pr.setVisible(true);

        pr.setProgress(0.00);
        for (int i = 1; i <=75; i++) {
            String temp=null;
            if(i<10){
                temp="0"+ i;
                err.setText("Enroll number :- E"+ y+Scode.getText()+bcode.getText()+"000"+temp);
                try {
                    test.create(pathtxt.getText(), "E20" + Scode.getText() + bcode.getText() + "000" + temp, a + temp+".jpg");

                }catch(Exception e){
                    System.out.println("error to get "+ i);
                }
            }
            else {
                try {
                    test.create(pathtxt.getText(), "E20" + Scode.getText() + bcode.getText() + "000" +Integer.toString(i), a + Integer.toString(i)+".jpg");
                    err.setText("Enroll number :- E"+ y+Scode.getText()+bcode.getText()+"000"+i);
                }catch(Exception e){
                    System.out.println("error to get "+ i);
                }
            }
        pr.setProgress(pr.getProgress()+0.133);
        }
        pr.setProgress(10);
        close.setVisible(true);
    }
    File file =null;
    @FXML
    private void choose(){
        DirectoryChooser directoryChooser = new DirectoryChooser();
        Stage stage = (Stage) base.getScene().getWindow();
        file = directoryChooser.showDialog(null);
        if (file != null) {
            pathtxt.setText(file.getAbsolutePath());
        }
    }

}
