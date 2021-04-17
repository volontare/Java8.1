package ru.RadioTesting;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Radio {

    private int volume;
    private int maxVolume = 100;
    private int minVolume;
    private int radioStation;
    private int maxRadioStation = 10;
    private int minRadioStation;

    public Radio(int maxVolume, int maxRadioStation) {
        this.maxVolume = maxVolume;
        this.maxRadioStation = maxRadioStation;
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
