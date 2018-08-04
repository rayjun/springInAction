package com.springinaction.springidol;

import java.util.Collection;

public class OneManBand implements Performer{

    public OneManBand() {}

    @Override
    public void perform() throws PerformanceException {

    }


    private Collection<Instrument> instruments;

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }
}
