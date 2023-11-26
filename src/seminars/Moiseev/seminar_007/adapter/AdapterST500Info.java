package seminars.Moiseev.seminar_007.adapter;

import java.time.LocalDateTime;

public class AdapterST500Info implements MeteoSensor {

    private SensorTemperature adaptee;

    public AdapterST500Info(SensorTemperature sensorTemperature) {
        this.adaptee = sensorTemperature;
    }

    @Override
    public int getId() {
        return adaptee.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float) adaptee.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        LocalDateTime dataTime = LocalDateTime.of(adaptee.year(), 1, 1, 0, 0);
        dataTime = dataTime.plusDays(adaptee.day() - 1);
        dataTime = dataTime.plusSeconds(adaptee.second());
        return dataTime;
    }
}
