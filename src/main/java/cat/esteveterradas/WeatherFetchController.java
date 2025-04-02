package cat.esteveterradas;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class WeatherFetchController implements Initializable {

    @FXML
    TextField searchBar;
    @FXML
    Button acceptButton, closeButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        searchBar.setOnKeyPressed(event -> {});
        acceptButton.setOnAction(event -> {
            String city = searchBar.getText();
            if (!city.isEmpty()) {
                // Call the method to fetch weather data
                //WeatherFetch.fetchWeatherData(city);
            }
        });
        closeButton.setOnAction(event -> {
            // Close the application
            Main.getStage().close();
        });
    }
}
