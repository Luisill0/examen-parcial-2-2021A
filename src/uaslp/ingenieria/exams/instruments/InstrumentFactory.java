package uaslp.ingenieria.exams.instruments;

public class InstrumentFactory {

    public Instrument getInstrumentInstance(SupportedInstrument supportedInstrument){
        switch(supportedInstrument){
            case PIANO:
                return new Piano();
            case GUITARRA:
                return new Guitarra();
            case FLAUTA:
                return new Flauta();
            case VIOLIN:
                return new Violin();
            default:
                return null;
        }
    }
}
