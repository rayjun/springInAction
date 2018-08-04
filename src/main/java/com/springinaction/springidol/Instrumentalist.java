package com.springinaction.springidol;

public class Instrumentalist implements Performer{

    public Instrumentalist() {}

    @Override
    public void perform() throws PerformanceException {
        System.out.print("playing "+song+" : ");
        instrument.play();
    }

    private String song;

    private Instrument instrument;

    public void setSong(String song) {
        this.song = song;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
