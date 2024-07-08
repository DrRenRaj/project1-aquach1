package edu.msudenver.cs3013.project1_s24

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NotesAdapter(private val notes: List<Note>) : RecyclerView.Adapter<NotesAdapter.NoteViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_note, parent, false)
        return NoteViewHolder(view)
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        val note = notes[position]
        holder.bind(note)
    }

    override fun getItemCount(): Int {
        return notes.size
    }

    inner class NoteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textViewNoteTitle: TextView = itemView.findViewById(R.id.textViewNoteTitle)
        private val textViewNoteContent: TextView = itemView.findViewById(R.id.textViewNoteContent)

        fun bind(note: Note) {
            textViewNoteTitle.text = note.title
            textViewNoteContent.text = note.content
        }
    }
}