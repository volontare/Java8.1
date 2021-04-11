package ru.RadioTesting;

public class Radio {

    private int volume;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int radioStation;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;

    public int getradioStation() {
        return radioStation;
    }

    public int setRadioStation(int radioStation) {
        if (radioStation <= maxRadioStation && radioStation >= minRadioStation) {
            this.radioStation = radioStation;
        }
        return this.radioStation;
    }

    public void changeTheStationByNextButton() {
        if (radioStation == maxRadioStation) {
            radioStation = minRadioStation;
            return;
        }
        radioStation++;
    }

    public void changeTheStationByPrevButton() {
        if (radioStation == minRadioStation) {
            radioStation = maxRadioStation;
            return;
        } else {
            radioStation--;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void increaseVolume() {
        if (volume == maxVolume) {
            return;
        } else {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (volume == minVolume) {
            return;
        } else {
            volume--;

        }
    }

}