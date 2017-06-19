package fxplayer;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;
import javafx.scene.control.Button;

public class FXMLDocumentController implements Initializable {

    String filePath = "src/fxplayer/file/dt_32bars_105jazz.wav";
    String fileName;

    @FXML
    private Button button;

    @FXML
    private void handleButtonAction(ActionEvent event) {

        splitString(filePath);

        Media sound = new Media(new File(filePath).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();

        button.setText(fileName);
    }

    public void splitString(String path) {
        String[] paths = path.split("/");
        for (int i = 0; i < paths.length; i++) {
            fileName = paths[i];
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
