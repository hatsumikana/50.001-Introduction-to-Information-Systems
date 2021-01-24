package piano;

import midi.Midi;
import music.NoteEvent;
import music.Pitch;

import javax.sound.midi.MidiUnavailableException;

import midi.Instrument;
import midi.Midi;
import music.NoteEvent;
import music.Pitch;

import java.util.ArrayList;


public class test1 {

    private Midi midi;
    private ArrayList<Pitch> recordnote = new ArrayList<Pitch>();
    private ArrayList<NoteEvent> noteList = new ArrayList<NoteEvent>();
    private Instrument instrument = Midi.DEFAULT_INSTRUMENT;
    public int changeSemitone = 0;
    public boolean isRecording = false;

    /**
     * constructor for PianoMachine.
     *
     * initialize midi device and any other state that we're storing.
     */
    public test1() {
        try {
            midi = Midi.getInstance();
        } catch (MidiUnavailableException e1) {
            System.err.println("Could not initialize midi device");
            e1.printStackTrace();
            return;
        }
    }

    //TODO write method spec
    public void beginNote(Pitch rawPitch) {
        //TODO implement for question 1
        Pitch nextPitch = rawPitch.transpose(changeSemitone);

        if(!recordnote.contains(rawPitch)){
            recordnote.add(rawPitch);
            midi.beginNote(nextPitch.toMidiFrequency(),instrument);
        }

        if(isRecording){
            noteList.add(new NoteEvent(nextPitch,System.currentTimeMillis()/10, instrument,NoteEvent.Kind.start));
        }
    }

    //TODO write method spec
    public void endNote(Pitch rawPitch) {
        //TODO implement for question 1
        Pitch nextPitch = rawPitch.transpose(changeSemitone);
        if(recordnote.contains(rawPitch)){
            recordnote.remove(rawPitch);
            midi.endNote(nextPitch.toMidiFrequency(),instrument);
        }
        if(isRecording){
            noteList.add(new NoteEvent(nextPitch,System.currentTimeMillis()/10, instrument,NoteEvent.Kind.start));
        }

    }

    //TODO write method spec
    public void changeInstrument() {
        //TODO: implement for question 2
        instrument = instrument.next();
    }

    public void shiftUp() {
        //TODO: implement for question 3
        if (changeSemitone < Pitch.OCTAVE * 2) {
            changeSemitone += Pitch.OCTAVE;
        }
    }

    //TODO write method spec
    public void shiftDown() {
        //TODO: implement for question 3
        if (changeSemitone > -Pitch.OCTAVE * 2) {
            changeSemitone -= Pitch.OCTAVE;
        }
    }

    //TODO write method spec
    public boolean toggleRecording() {
        //TODO: implement for question 4
        if(isRecording){
            isRecording = false;
        }
        else{
            isRecording = true;
            noteList.clear();
        }
        return isRecording;
    }

    //TODO write method spec
    public void playback() {
        //TODO: implement for question 4
        for (int k = 0; k < noteList.size(); k++) {
            NoteEvent noteEvent = noteList.get(k);
            NoteEvent.Kind kind = noteEvent.getKind();

            if (kind == NoteEvent.Kind.start)
                midi.beginNote(noteEvent.getPitch().toMidiFrequency(), noteEvent.getInstr());
            else
                midi.endNote(noteEvent.getPitch().toMidiFrequency(), noteEvent.getInstr());

            if (k < noteList.size() - 1) {
                NoteEvent nextNoteEvent = noteList.get(k+1);
                int delay = (int)(nextNoteEvent.getTime()-noteEvent.getTime());
                Midi.rest(delay);
            }

        }
    }

}