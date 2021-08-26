package com.example.puzzle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.google.android.material.card.MaterialCardView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val pcl = findViewById<DraggableCoordinatorLayout>(R.id.parentCoordinatorLayout)
       // setupActionBarWithNavController(findNavController(R.id.puzzleStart))

        //findViewById<DraggableCoordinatorLayout>(R.id.parentCoordinatorLayout).addDraggableChild(R.id.imageView1)
  //      pcl.addDraggableChild(findViewById<ImageView>(R.id.imageView1))
  //      pcl.addDraggableChild(findViewById<ImageView>(R.id.imageView2))
  //      pcl.addDraggableChild(findViewById<ImageView>(R.id.imageView3))
        //parentCoordinatorLayout.addDraggableChild(R.id.imageView4)
/*
        pcl.setViewDragListener(object : DraggableCoordinatorLayout.ViewDragListener{
            override fun onViewCaptured(view: View, i: Int) {
                when(view.id){
                    R.id.draggableCard1->findViewById<MaterialCardView>(R.id.draggableCard1).isDragged = true
                    R.id.draggableCard2->findViewById<MaterialCardView>(R.id.draggableCard2).isDragged = true
                    R.id.draggableCard3->findViewById<MaterialCardView>(R.id.draggableCard3).isDragged = true

                }
            }

            override fun onViewReleased(view: View, v: Float, v1: Float) {
                when(view.id){
                    R.id.draggableCard1->findViewById<MaterialCardView>(R.id.draggableCard1).isDragged = false
                    R.id.draggableCard2->findViewById<MaterialCardView>(R.id.draggableCard2).isDragged = false
                    R.id.draggableCard3->findViewById<MaterialCardView>(R.id.draggableCard3).isDragged = false

                }
            }
        })

 */
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController : NavController = findNavController(R.id.puzzleStart)
        return navController.navigateUp() || super.onSupportNavigateUp()
    }

}
