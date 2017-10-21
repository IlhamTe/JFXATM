/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasatm;

import com.jfoenix.controls.JFXPasswordField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class FXMLATMController implements Initializable {
    String pin="";
    String PIN="1234";
    int kesempatan=3;
    int tmp;
    @FXML
    private Button satu;
    @FXML
    private Button empat;
    @FXML
    private Button tujuh;
    @FXML
    private Button cancel;
    @FXML
    private Button dua;
    @FXML
    private Button tiga;
    @FXML
    private Button lima;
    @FXML
    private Button delapan;
    @FXML
    private Button enol;
    @FXML
    private Button enam;
    @FXML
    private Button sembilan;
    @FXML
    private Button ok;
    @FXML
    private JFXPasswordField editPin;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
     void buttonSatu(ActionEvent event) {
        pin+="1";
        editPin.setText(pin);
        
    }

    @FXML
     void buttonEmpat(ActionEvent event) {
         pin+="4";
        editPin.setText(pin);
    }

    @FXML
     void buttonTujuh(ActionEvent event) {
         pin+="7";
        editPin.setText(pin);
    }

    @FXML
     void buttonCancel(ActionEvent event) {
         pin="";
        editPin.setText(pin);
    }

    @FXML
     void buttonDua(ActionEvent event) {
         pin+="2";
        editPin.setText(pin);
    }

    @FXML
     void buttonTiga(ActionEvent event) {
         pin+="3";
        editPin.setText(pin);
    }

    @FXML
  void buttonLima(ActionEvent event) {
         pin+="5";
        editPin.setText(pin);
    }

    @FXML
    void buttonDelapan(ActionEvent event) {
         pin+="8";
        editPin.setText(pin);
    }

    @FXML
     void buttonEnol(ActionEvent event) {
         pin+="0";
        editPin.setText(pin);
    }

    @FXML
     void buttonEnam(ActionEvent event) {
         pin+="6";
        editPin.setText(pin);
    }

    @FXML
     void buttonSembilan(ActionEvent event) {
         pin+="9";
        editPin.setText(pin);
    }

    @FXML
     void buttonOk(ActionEvent event) {
        if (pin.equals(PIN)){
        try{
        ((Node) (event.getSource())).getScene().getWindow().hide();
        FXMLLoader fxmlLoader=new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("FXMLMenuAwal.fxml"));
        Scene scene =new Scene(fxmlLoader.load(),830,450);
        Stage stage=new Stage();
        stage.setScene(scene);
        stage.show();
        }catch (IOException e){
        System.out.println("Failed."+e);
        }
        }else{
        kesempatan-=1;
        JOptionPane.showMessageDialog(null, "PIN Salah \nTersisa "+kesempatan+" Kesemepatan lagi!");
        editPin.setText("");
        pin="";
        if(kesempatan == 0){
        System.exit(0);
        }
        }
    }

    @FXML
    private void buttonPin(ActionEvent event) {
    }
    
}
