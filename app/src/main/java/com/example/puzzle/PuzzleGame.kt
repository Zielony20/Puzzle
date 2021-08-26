package com.example.puzzle
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView


class PuzzleGame : Fragment() {

    companion object{
        val IMAGE_REQUEST_CODE=100
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_puzzle_game_5x5, container, false)

        var imageName : Int = requireArguments().getInt("puzzleId")

        if(imageName==999){
            pickImageFromGallery()
        }
        else{
            view.findViewById<ImageView>(R.id.imageView1).setImageResource(imageName)
            view.findViewById<ImageView>(R.id.imageView2).setImageResource(imageName)
            view.findViewById<ImageView>(R.id.imageView3).setImageResource(imageName)
            view.findViewById<ImageView>(R.id.imageView4).setImageResource(imageName)
            view.findViewById<ImageView>(R.id.imageView5).setImageResource(imageName)
            view.findViewById<ImageView>(R.id.imageView6).setImageResource(imageName)
            view.findViewById<ImageView>(R.id.imageView7).setImageResource(imageName)
            view.findViewById<ImageView>(R.id.imageView8).setImageResource(imageName)
            view.findViewById<ImageView>(R.id.imageView9).setImageResource(imageName)
            view.findViewById<ImageView>(R.id.imageView10).setImageResource(imageName)
            view.findViewById<ImageView>(R.id.imageView11).setImageResource(imageName)
            view.findViewById<ImageView>(R.id.imageView12).setImageResource(imageName)
            view.findViewById<ImageView>(R.id.imageView13).setImageResource(imageName)
            view.findViewById<ImageView>(R.id.imageView14).setImageResource(imageName)
            view.findViewById<ImageView>(R.id.imageView15).setImageResource(imageName)
            view.findViewById<ImageView>(R.id.imageView16).setImageResource(imageName)
            view.findViewById<ImageView>(R.id.imageView17).setImageResource(imageName)
            view.findViewById<ImageView>(R.id.imageView18).setImageResource(imageName)
            view.findViewById<ImageView>(R.id.imageView19).setImageResource(imageName)
            view.findViewById<ImageView>(R.id.imageView20).setImageResource(imageName)
            view.findViewById<ImageView>(R.id.imageView21).setImageResource(imageName)
            view.findViewById<ImageView>(R.id.imageView22).setImageResource(imageName)
            view.findViewById<ImageView>(R.id.imageView23).setImageResource(imageName)
            view.findViewById<ImageView>(R.id.imageView24).setImageResource(imageName)
            view.findViewById<ImageView>(R.id.imageView25).setImageResource(imageName)

        }

        return view
    }

    private fun pickImageFromGallery() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, PuzzleGame.IMAGE_REQUEST_CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == PuzzleGame.IMAGE_REQUEST_CODE && resultCode == Activity.RESULT_OK) {

            view?.findViewById<ImageView>(R.id.imageView1)?.setImageURI(data?.data)
            view?.findViewById<ImageView>(R.id.imageView2)?.setImageURI(data?.data)
            view?.findViewById<ImageView>(R.id.imageView3)?.setImageURI(data?.data)
            view?.findViewById<ImageView>(R.id.imageView4)?.setImageURI(data?.data)
            view?.findViewById<ImageView>(R.id.imageView5)?.setImageURI(data?.data)
            view?.findViewById<ImageView>(R.id.imageView6)?.setImageURI(data?.data)
            view?.findViewById<ImageView>(R.id.imageView7)?.setImageURI(data?.data)
            view?.findViewById<ImageView>(R.id.imageView8)?.setImageURI(data?.data)
            view?.findViewById<ImageView>(R.id.imageView9)?.setImageURI(data?.data)
            view?.findViewById<ImageView>(R.id.imageView10)?.setImageURI(data?.data)
            view?.findViewById<ImageView>(R.id.imageView11)?.setImageURI(data?.data)
            view?.findViewById<ImageView>(R.id.imageView12)?.setImageURI(data?.data)
            view?.findViewById<ImageView>(R.id.imageView13)?.setImageURI(data?.data)
            view?.findViewById<ImageView>(R.id.imageView14)?.setImageURI(data?.data)
            view?.findViewById<ImageView>(R.id.imageView15)?.setImageURI(data?.data)
            view?.findViewById<ImageView>(R.id.imageView16)?.setImageURI(data?.data)
            view?.findViewById<ImageView>(R.id.imageView17)?.setImageURI(data?.data)
            view?.findViewById<ImageView>(R.id.imageView18)?.setImageURI(data?.data)
            view?.findViewById<ImageView>(R.id.imageView19)?.setImageURI(data?.data)
            view?.findViewById<ImageView>(R.id.imageView20)?.setImageURI(data?.data)
            view?.findViewById<ImageView>(R.id.imageView21)?.setImageURI(data?.data)
            view?.findViewById<ImageView>(R.id.imageView22)?.setImageURI(data?.data)
            view?.findViewById<ImageView>(R.id.imageView23)?.setImageURI(data?.data)
            view?.findViewById<ImageView>(R.id.imageView24)?.setImageURI(data?.data)
            view?.findViewById<ImageView>(R.id.imageView25)?.setImageURI(data?.data)

        }

    }
}
