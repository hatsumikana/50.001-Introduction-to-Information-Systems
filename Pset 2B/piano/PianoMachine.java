package piano;

import java.util.ArrayList;

import javax.sound.midi.MidiUnavailableException;
import static midi.Midi.DEFAULT_INSTRUMENT;
import midi.Instrument;
import midi.Midi;
import music.NoteEvent;
import music.Pitch;


public class PianoMachine {
	
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
    public PianoMachine() {
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
        long time = (long) (System.currentTimeMillis());
        if(!recordnote.contains(nextPitch)){
            recordnote.add(nextPitch);
            midi.beginNote(nextPitch.toMidiFrequency(),instrument);
        }
        if (isRecording){
            NoteEvent newEvent = new NoteEvent(nextPitch, time, instrument, NoteEvent.Kind.start);
            noteList.add(newEvent);
        }
    }

    //TODO write method spec
    public void endNote(Pitch rawPitch) {
        //TODO implement for question 1
        Pitch nextPitch = rawPitch.transpose(changeSemitone);
        long time = (long) (System.currentTimeMillis());
        if(recordnote.contains(nextPitch)){
            midi.endNote(nextPitch.toMidiFrequency(),instrument);
            recordnote.remove(nextPitch);
        }
        if (isRecording){
            NoteEvent newEvent = new NoteEvent(nextPitch, time, instrument, NoteEvent.Kind.stop);
            noteList.add(newEvent);
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
        isRecording = !isRecording;
            if (isRecording) {
            noteList = new ArrayList<NoteEvent>();
        }
            return isRecording;
    }

    //TODO write method spec
    public void playback() {
        //TODO: implement for question 4
        long timestamp = 0;

//        for(NoteEvent e: noteList){
//            if(timestamp > 0){
//                int delay = (int) Math.round((e.getTime() - timestamp/10.0));
//                Midi.rest(delay);
//            }
//            timestamp = e.getTime();
//            if(e.getKind() == music.NoteEvent.Kind.start){
//                midi.beginNote(e.getPitch().toMidiFrequency(), e.getInstr());
//            }
//            else if (e.getKind() == music.NoteEvent.Kind.stop){
//                midi.endNote(e.getPitch().toMidiFrequency(), e.getInstr());
//            }
//
//        }

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
                Midi.rest(delay/10);
            }

        }
    }

}