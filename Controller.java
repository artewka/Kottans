package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javax.swing.*;

public class Controller {

    @FXML
    private Label output;
    private String row;
    private boolean start = true;

    @FXML
    private void num(ActionEvent event) {
        if (start) {
            output.setText("");
            start = false;
        }
        String value = ((Button) event.getSource()).getText();
        output.setText(output.getText() + value);
        }


    @FXML
    private void clear(ActionEvent event) {
        output.setText("");

    }

    @FXML
    private void cancel(ActionEvent event) {
        row = output.getText();
        row = row.substring(0, row.length() - 1);
        output.setText(row);
    }

    @FXML
    private void enter(ActionEvent event){
        row = output.getText();
        JOptionPane.showMessageDialog(null,row);
    }

    @FXML
    private void hide(ActionEvent event) {
       output.setVisible(false);

    }

    @FXML
    private void toshow(ActionEvent event){
       output.setVisible(true);
    }
    @FXML
    private void rnd(ActionEvent event) {
        row = output.getText();
        String random = row;
        row = "";
        int i = 0;
        int j = i + 1;

        for(i = 0; i < random.length(); ++i) {
            if(j + 1 == random.length()) {
                j = 0;
            } else {
                ++j;
            }
            char rnd = random.charAt(j);
            row = row + rnd;
        }
        output.setText(this.row);
    }
}





