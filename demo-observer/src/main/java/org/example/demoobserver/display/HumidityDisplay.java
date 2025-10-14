package org.example.demoobserver.display;



import lombok.extern.slf4j.Slf4j;
import org.example.demoobserver.model.WeatherData;
import org.example.demoobserver.observer.Observer;

@Slf4j
public class HumidityDisplay implements Observer<WeatherData> {

    private float currentHumidity;

    public HumidityDisplay() {
        this.currentHumidity = 0.0f;
        log.info("Inicializando display de humedad");
    }

    @Override
    public void update(WeatherData weatherData) {
        if (weatherData != null) {
            // Corregido: Se asigna el nuevo valor en lugar de acumularlo.
            this.currentHumidity = weatherData.getHumidity();
            display();
        } else {
            log.warn("Datos meteorológicos nulos");
        }
    }

    private void display() {
        log.info("💧 Display de Humedad: {} %", String.format("%.1f", this.currentHumidity));
    }

    public float getCurrentHumidity() {
        return this.currentHumidity;
    }
}
