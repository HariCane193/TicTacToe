package com.example.tictactoe

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.INVISIBLE
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    private lateinit var Player1:String
    private lateinit var Player2:String
    private lateinit var CurPlayer:String
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Players
        //TODO("Change default symbols of players")

        //button declaration
        val ChooseX = findViewById<Button>(R.id.btnChooseX)
        val ChooseO = findViewById<Button>(R.id.btnChooseO)
        val textChoose = findViewById<TextView>(R.id.tvChoose)

        val TL = findViewById<Button>(R.id.btnTL)
        val TM = findViewById<Button>(R.id.btnTM)
        val TR = findViewById<Button>(R.id.btnTR)
        val ML = findViewById<Button>(R.id.btnML)
        val MM = findViewById<Button>(R.id.btnMM)
        val MR = findViewById<Button>(R.id.btnMR)
        val BL = findViewById<Button>(R.id.btnBL)
        val BM = findViewById<Button>(R.id.btnBM)
        val BR = findViewById<Button>(R.id.btnBR)


        ChooseX.setOnClickListener{
            setPlayerMarks(0)
            ChooseX.visibility = INVISIBLE
            ChooseO.visibility = INVISIBLE
            textChoose.visibility = INVISIBLE
        }
        ChooseO.setOnClickListener{
            setPlayerMarks(1)
            ChooseX.visibility = INVISIBLE
            ChooseO.visibility = INVISIBLE
            textChoose.visibility = INVISIBLE
        }

        TL.setOnClickListener{
            if (CurPlayer=="X") {
                TL.setTextColor(ContextCompat.getColor(this,R.color.X))
                TL.text = getString(R.string.x)
                CurPlayer = "O"
            }
            else if (CurPlayer=="O"){
                TL.setTextColor(ContextCompat.getColor(this,R.color.O))
                TL.text = getString(R.string.o)
                CurPlayer = "X"
            }
            TL.isClickable = false
        }
        TM.setOnClickListener{
            if (CurPlayer=="X") {
                TM.setTextColor(ContextCompat.getColor(this,R.color.X))
                TM.text = getString(R.string.x)
                CurPlayer = "O"
            }
            else if (CurPlayer=="O"){
                TM.setTextColor(ContextCompat.getColor(this,R.color.O))
                TM.text = getString(R.string.o)
                CurPlayer = "X"
            }
            TM.isClickable = false
        }
        TR.setOnClickListener{
            if (CurPlayer=="X") {
                TR.setTextColor(ContextCompat.getColor(this,R.color.X))
                TR.text = getString(R.string.x)
                CurPlayer = "O"
            }
            else if (CurPlayer=="O"){
                TR.setTextColor(ContextCompat.getColor(this,R.color.O))
                TR.text = getString(R.string.o)
                CurPlayer = "X"
            }
            TR.isClickable = false
        }



        // row 2
        ML.setOnClickListener{
            if (CurPlayer=="X") {
                ML.setTextColor(ContextCompat.getColor(this,R.color.X))
                ML.text = getString(R.string.x)
                CurPlayer = "O"
            }
            else if (CurPlayer=="O"){
                ML.setTextColor(ContextCompat.getColor(this,R.color.O))
                ML.text = getString(R.string.o)
                CurPlayer = "X"
            }
            ML.isClickable = false
        }
        MM.setOnClickListener{
            if (CurPlayer=="X") {
                MM.setTextColor(ContextCompat.getColor(this,R.color.X))
                MM.text = getString(R.string.x)
                CurPlayer = "O"
            }
            else if (CurPlayer=="O"){
                MM.setTextColor(ContextCompat.getColor(this,R.color.O))
                MM.text = getString(R.string.o)
                CurPlayer = "X"
            }
            MM.isClickable = false
        }
        MR.setOnClickListener{
            if (CurPlayer=="X") {
                MR.setTextColor(ContextCompat.getColor(this,R.color.X))
                MR.text = getString(R.string.x)
                CurPlayer = "O"
            }
            else if (CurPlayer=="O"){
                MR.setTextColor(ContextCompat.getColor(this,R.color.O))
                MR.text = getString(R.string.o)
                CurPlayer = "X"
            }
            MR.isClickable = false
        }



        //row 3
        BL.setOnClickListener{
            if (CurPlayer=="X") {
                BL.setTextColor(ContextCompat.getColor(this,R.color.X))
                BL.text = getString(R.string.x)
                CurPlayer = "O"
            }
            else if (CurPlayer=="O"){
                BL.setTextColor(ContextCompat.getColor(this,R.color.O))
                BL.text = getString(R.string.o)
                CurPlayer = "X"
            }
            BL.isClickable = false
        }
        BM.setOnClickListener{
            if (CurPlayer=="X") {
                BM.setTextColor(ContextCompat.getColor(this,R.color.X))
                BM.text = getString(R.string.x)
                CurPlayer = "O"
            }
            else if (CurPlayer=="O"){
                BM.setTextColor(ContextCompat.getColor(this,R.color.O))
                BM.text = getString(R.string.o)
                CurPlayer = "X"
            }
            BM.isClickable = false
        }
        BR.setOnClickListener{
            if (CurPlayer=="X") {
                BR.setTextColor(ContextCompat.getColor(this,R.color.X))
                BR.text = getString(R.string.x)
                CurPlayer = "O"
            }
            else if (CurPlayer=="O"){
                BR.setTextColor(ContextCompat.getColor(this,R.color.O))
                BR.text = getString(R.string.o)
                CurPlayer = "X"
            }
            BR.isClickable = false
        }
    }
    private fun setPlayerMarks(value: Int){
        if (value==1){
            // chosen X
            Player1 = "X"
            Player2 = "O"
        }
        else{
            //chosen O
            Player1 = "O"
            Player2 = "X"

        }
        CurPlayer = Player1
    }
}