package edu.msudenver.cs3013.project1_s24

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeFragment : Fragment() {

    // Assuming this is a sample list of notes
    private val notes = listOf(
        Note("Note 1", "Content of Note 1"),
        Note("Note 2", "Content of Note 2"),
        Note("Note 3", "Content of Note 3")
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        // Instantiate NotesAdapter with the list of notes
        val adapter = NotesAdapter(notes)
        recyclerView.adapter = adapter

        return view
    }
}