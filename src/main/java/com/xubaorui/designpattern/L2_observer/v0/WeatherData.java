package com.xubaorui.designpattern.L2_observer.v0;

public class WeatherData {


    public void measurementsChanged() {

        //获取最新的测量值
        float temperature = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        //更新布告板1
        //更新布告板2
        //更新布告板3


    }


    float getTemperature() {
        return 0;
    }

    float getHumidity(){
        return 0;
    }

    float getPressure(){
        return 0;
    }
}
