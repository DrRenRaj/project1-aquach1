package edu.msudenver.cs3013.project1_s24

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class NoteDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_detail)

        // Retrieve Note object from intent extras
        val note = intent.getParcelableExtra<Note>("note")

        // Use the note object as needed
        if (note != null) {
            // Example usage
            supportActionBar?.title = note.title
        }
    }
}