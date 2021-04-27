package uaslp.ingenieria.exams;

import uaslp.ingenieria.exams.instruments.*;

import java.util.Iterator;

public class SongPlayer {

    private InstrumentFactory instrumentFactory;

    public SongPlayer(){
        instrumentFactory = new InstrumentFactory();
    }

    public void play(Song song, SupportedInstrument instrumento) {

        Iterator<Nota> notas = song.getSongIterator();
        Instrument instrument = instrumentFactory.getInstrumentInstance(instrumento);

        while (notas.hasNext()) {
            Nota nota = notas.next();
            instrument.playNote(nota);
        }
    }
}
