package com.example.puzzle

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_puzzle_start.view.*

class PuzzleStart : Fragment() {
    public var imageId : Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_puzzle_start, container, false)

        view.getPictureButton.setOnClickListener{

            val bundle = bundleOf("puzzleId" to 999)
            Navigation.findNavController(view).navigate(R.id.action_puzzleStart_to_puzzleTest,bundle)

        }

        view.imageButton1.setOnClickListener {
            //val imgUri: Uri = Uri.parse("android.resource://com.example.puzzle/" + R.drawable.puzzle1)
           // imageViewHandler.setImageURI(imgUri)
            imageId = R.drawable.puzzle1
            val bundle = bundleOf("puzzleId" to imageId)
            Navigation.findNavController(view).navigate(R.id.action_puzzleStart_to_puzzleTest,bundle)

        }
        view.imageButton2.setOnClickListener {

            imageId = R.drawable.puzzle2
            val bundle = bundleOf("puzzleId" to imageId)
            Navigation.findNavController(view).navigate(R.id.action_puzzleStart_to_puzzleTest,bundle)

        }
        view.imageButton3.setOnClickListener {
            imageId = R.drawable.puzzle3
            val bundle = bundleOf("puzzleId" to imageId)
            Navigation.findNavController(view).navigate(R.id.action_puzzleStart_to_puzzleTest,bundle)
        }
        view.imageButton4.setOnClickListener {
            imageId = R.drawable.puzzle4
            val bundle = bundleOf("puzzleId" to imageId)
            Navigation.findNavController(view).navigate(R.id.action_puzzleStart_to_puzzleTest,bundle)
        }
        view.imageButton5.setOnClickListener {
            imageId = R.drawable.puzzle5
            val bundle = bundleOf("puzzleId" to imageId)
            Navigation.findNavController(view).navigate(R.id.action_puzzleStart_to_puzzleTest,bundle)
        }
        view.imageButton6.setOnClickListener {
            imageId = R.drawable.puzzle6
            val bundle = bundleOf("puzzleId" to imageId)
            Navigation.findNavController(view).navigate(R.id.action_puzzleStart_to_puzzleTest,bundle)
        }
        view.imageButton7.setOnClickListener {
            imageId = R.drawable.puzzle7
            val bundle = bundleOf("puzzleId" to imageId)
            Navigation.findNavController(view).navigate(R.id.action_puzzleStart_to_puzzleTest,bundle)
        }
        view.imageButton8.setOnClickListener {
            imageId = R.drawable.puzzle8
            val bundle = bundleOf("puzzleId" to imageId)
            Navigation.findNavController(view).navigate(R.id.action_puzzleStart_to_puzzleTest,bundle)
        }
        view.imageButton9.setOnClickListener {
            imageId = R.drawable.puzzle9
            val bundle = bundleOf("puzzleId" to imageId)
            Navigation.findNavController(view).navigate(R.id.action_puzzleStart_to_puzzleTest,bundle)
        }
        return view
    }

}
