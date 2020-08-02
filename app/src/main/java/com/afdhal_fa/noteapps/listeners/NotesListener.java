package com.afdhal_fa.noteapps.listeners;

import com.afdhal_fa.noteapps.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
