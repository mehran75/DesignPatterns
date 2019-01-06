package observable;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

public class Controller implements Initializable {


    @FXML
    private Button start_btn;
    @FXML
    private ProgressBar progressBar;
    @FXML
    private Label label;
    @FXML
    private CheckBox checkBox;


//    private SimpleBooleanProperty check_box_observable =
//            new SimpleBooleanProperty(false);

    private SimpleDoubleProperty progress_value_observable
            = new SimpleDoubleProperty(0);


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        progressBar.progressProperty().bind(progress_value_observable);

        label.visibleProperty().bind(checkBox.selectedProperty());

        start_btn
                .disableProperty().bind(progress_value_observable
                .isNotEqualTo(0));

    }


    public void start_progress(ActionEvent actionEvent) {

        final Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                progress_value_observable
                        .set(progress_value_observable.get() + 0.1);

                if (progress_value_observable.get() >= 1.0) {
//                    start_btn.setDisable(false);
                    timer.cancel();
                    progress_value_observable.set(0);
                }


            }
        }, 0, 1000);

//        start_btn.setDisable(true);


    }
}
