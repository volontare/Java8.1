package ru.RadioTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldChangeTheStation() {
        Radio radio = new Radio();
        radio.setRadioStation(5);
        assertEquals(5, radio.getradioStation());
    }

    @Test
    void shouldChangeTheStationNumberIsOverMax() {
        Radio radio = new Radio();
        radio.setRadioStation(15);
        assertEquals(0, radio.getradioStation());
    }

    @Test
    void shouldChangeTheStationNumberIsUnderMin() {
        Radio radio = new Radio();
        radio.setRadioStation(-1);
        assertEquals(0, radio.getradioStation());
    }

    @Test
    void shouldChangeTheStationByNextButton() {
        Radio radio = new Radio();
        radio.changeTheStationByNextButton();
        assertEquals(1, radio.getradioStation());
    }

    @Test
    void shouldChangeTheStationByPrevButton() {
        Radio radio = new Radio();
        radio.setRadioStation(4);
        radio.changeTheStationByPrevButton();
        assertEquals(3, radio.getradioStation());
    }

    @Test
    void shouldChangeTheStationByNextButtonIsOverMax() {
        Radio radio = new Radio();
        radio.setRadioStation(9);
        radio.changeTheStationByNextButton();
        assertEquals(0, radio.getradioStation());
    }

    @Test
    void shouldChangeTheStationByPrevButtonUnderMin() {
        Radio radio = new Radio();
        radio.setRadioStation(0);
        radio.changeTheStationByPrevButton();
        assertEquals(9, radio.getradioStation());
    }

    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(5);
        radio.increaseVolume();
        assertEquals(6, radio.getVolume());
    }

    @Test
    void shouldDecreaseVolumeIfCurrentVolumeIsMin() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(8);
        radio.decreaseVolume();
        assertEquals(7, radio.getVolume());
    }

    @Test
    void shouldIncreaseVolumeIfCurrentVolumeIsMax () {
        Radio radio = new Radio();

        for (int i = 0; i < 11; i++) {
            radio.increaseVolume();
        }
        assertEquals(10, radio.getVolume());
    }
}