package com.example.tictactoe

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

@Suppress("UNREACHABLE_CODE")
class MainActivity : AppCompatActivity() {
    private lateinit var Player1:String
    private lateinit var Player2:String
    private lateinit var CurPlayer:String
    private lateinit var turn:TextView
    private lateinit var TL:Button
    private lateinit var TM:Button
    private lateinit var TR:Button
    private lateinit var ML:Button
    private lateinit var MM:Button
    private lateinit var MR:Button
    private lateinit var BL:Button
    private lateinit var BM:Button
    private lateinit var BR:Button
    private var playCount = 0
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Players
        // default values
        Player1 = "NA"
        Player2 = "NA"
        CurPlayer = "NA"

        //button declaration
        val ChooseX = findViewById<Button>(R.id.btnChooseX)
        val ChooseO = findViewById<Button>(R.id.btnChooseO)
        val textChoose = findViewById<TextView>(R.id.tvChoose)

        TL = findViewById<Button>(R.id.btnTL)
        TL.text = "?"
        TM = findViewById<Button>(R.id.btnTM)
        TM.text = "?"
        TR = findViewById<Button>(R.id.btnTR)
        TR.text = "?"
        ML = findViewById<Button>(R.id.btnML)
        ML.text = "?"
        MM = findViewById<Button>(R.id.btnMM)
        MM.text = "?"
        MR = findViewById<Button>(R.id.btnMR)
        MR.text = "?"
        BL = findViewById<Button>(R.id.btnBL)
        BL.text = "?"
        BM = findViewById<Button>(R.id.btnBM)
        BM.text = "?"
        BR = findViewById<Button>(R.id.btnBR)
        BR.text = "?"


        ChooseX.setOnClickListener{
            setPlayerMarks(0)
            ChooseX.visibility = INVISIBLE
            ChooseO.visibility = INVISIBLE
            textChoose.visibility = INVISIBLE
            startGame()
        }
        ChooseO.setOnClickListener{
            setPlayerMarks(1)
            ChooseX.visibility = INVISIBLE
            ChooseO.visibility = INVISIBLE
            textChoose.visibility = INVISIBLE
            startGame()
        }

        TL.setOnClickListener{
            if (validate()) {
                if (CurPlayer == "X") {
                    TL.setTextColor(ContextCompat.getColor(this, R.color.X))
                    TL.text = getString(R.string.x)
                    CurPlayer = "O"
                } else if (CurPlayer == "O") {
                    TL.setTextColor(ContextCompat.getColor(this, R.color.O))
                    TL.text = getString(R.string.o)
                    CurPlayer = "X"
                }
                TL.isClickable = false
                ++playCount
                checkEnd(1)
                Log.i("TL","In TL")
            }
        }
        TM.setOnClickListener{
            if (validate()) {
                if (CurPlayer == "X") {
                    TM.setTextColor(ContextCompat.getColor(this, R.color.X))
                    TM.text = getString(R.string.x)
                    CurPlayer = "O"
                } else if (CurPlayer == "O") {
                    TM.setTextColor(ContextCompat.getColor(this, R.color.O))
                    TM.text = getString(R.string.o)
                    CurPlayer = "X"
                }
                TM.isClickable = false
                ++playCount
                checkEnd(2)
            }
        }
        TR.setOnClickListener{
            if (validate()) {
                if (CurPlayer == "X") {
                    TR.setTextColor(ContextCompat.getColor(this, R.color.X))
                    TR.text = getString(R.string.x)
                    CurPlayer = "O"
                } else if (CurPlayer == "O") {
                    TR.setTextColor(ContextCompat.getColor(this, R.color.O))
                    TR.text = getString(R.string.o)
                    CurPlayer = "X"
                }
                TR.isClickable = false
                ++playCount
                checkEnd(3)
            }
        }



        // row 2
        ML.setOnClickListener{
            if (validate()) {
                if (CurPlayer == "X") {
                    ML.setTextColor(ContextCompat.getColor(this, R.color.X))
                    ML.text = getString(R.string.x)
                    CurPlayer = "O"
                } else if (CurPlayer == "O") {
                    ML.setTextColor(ContextCompat.getColor(this, R.color.O))
                    ML.text = getString(R.string.o)
                    CurPlayer = "X"
                }
                ML.isClickable = false
                ++playCount
                checkEnd(4)
            }
        }
        MM.setOnClickListener{
            if (validate()) {
                if (CurPlayer == "X") {
                    MM.setTextColor(ContextCompat.getColor(this, R.color.X))
                    MM.text = getString(R.string.x)
                    CurPlayer = "O"
                } else if (CurPlayer == "O") {
                    MM.setTextColor(ContextCompat.getColor(this, R.color.O))
                    MM.text = getString(R.string.o)
                    CurPlayer = "X"
                }
                MM.isClickable = false
                ++playCount
                checkEnd(5)
            }
        }
        MR.setOnClickListener{
            if (validate()) {
                if (CurPlayer == "X") {
                    MR.setTextColor(ContextCompat.getColor(this, R.color.X))
                    MR.text = getString(R.string.x)
                    CurPlayer = "O"
                } else if (CurPlayer == "O") {
                    MR.setTextColor(ContextCompat.getColor(this, R.color.O))
                    MR.text = getString(R.string.o)
                    CurPlayer = "X"
                }
                MR.isClickable = false
                ++playCount
                checkEnd(6)
            }
        }



        //row 3
        BL.setOnClickListener{
            if (validate()) {
                if (CurPlayer == "X") {
                    BL.setTextColor(ContextCompat.getColor(this, R.color.X))
                    BL.text = getString(R.string.x)
                    CurPlayer = "O"
                } else if (CurPlayer == "O") {
                    BL.setTextColor(ContextCompat.getColor(this, R.color.O))
                    BL.text = getString(R.string.o)
                    CurPlayer = "X"
                }
                BL.isClickable = false
                ++playCount
                checkEnd(7)
            }
        }
        BM.setOnClickListener{
            if (validate()) {
                if (CurPlayer == "X") {
                    BM.setTextColor(ContextCompat.getColor(this, R.color.X))
                    BM.text = getString(R.string.x)
                    CurPlayer = "O"
                } else if (CurPlayer == "O") {
                    BM.setTextColor(ContextCompat.getColor(this, R.color.O))
                    BM.text = getString(R.string.o)
                    CurPlayer = "X"
                }
                BM.isClickable = false
                ++playCount
                checkEnd(8)
            }
        }
        BR.setOnClickListener{
            if (validate()) {
                if (CurPlayer == "X") {
                    BR.setTextColor(ContextCompat.getColor(this, R.color.X))
                    BR.text = getString(R.string.x)
                    CurPlayer = "O"
                } else if (CurPlayer == "O") {
                    BR.setTextColor(ContextCompat.getColor(this, R.color.O))
                    BR.text = getString(R.string.o)
                    CurPlayer = "X"
                }
                BR.isClickable = false
                ++playCount
                checkEnd(9)
            }
        }
    }
    private fun updateTurn(){
        if (playCount%2==0){
            turn.text = getString(R.string.TurnPlayer1)
        }
        else{
            turn.text = getString(R.string.TurnPlayer2)

        }
    }
    private fun validate():Boolean{
        return when {
            (Player1 == "NA" || Player2 == "NA") -> {
                Toast.makeText(this, "Player 1 Choose your mark first", Toast.LENGTH_SHORT).show()
                false
            }
            else -> {
                true
            }
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

    private fun endGame(winner:Int){
        if (winner!=0) {
            var winVal = 1
            if (playCount % 2 == 0) winVal = 2
            Toast.makeText(this, "Player $winVal wins", Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText(this, "Draw", Toast.LENGTH_SHORT).show()
        }
        TL.isClickable = false
        TM.isClickable = false
        TR.isClickable = false
        ML.isClickable = false
        MM.isClickable = false
        MR.isClickable = false
        BL.isClickable = false
        BM.isClickable = false
        BR.isClickable = false
        //turn.visibility = INVISIBLE
    }
    private fun startGame(){
        Toast.makeText(this,"Game Start",Toast.LENGTH_SHORT).show()
        TL.visibility = VISIBLE
        TM.visibility = VISIBLE
        TR.visibility = VISIBLE
        ML.visibility = VISIBLE
        MM.visibility = VISIBLE
        MR.visibility = VISIBLE
        BL.visibility = VISIBLE
        BM.visibility = VISIBLE
        BR.visibility = VISIBLE
        //turn.visibility = VISIBLE
    }
    private fun checkEnd(location:Int){
        // locations range: 1-9
        // corner locations are 1,3,7,9
        // side locations are 2,4,6,8
        // middle location is 5
        var playerWin:Boolean = false
        Log.i(location.toString(),"In here")
        if (CurPlayer=="X"){
            CurPlayer = "O"
        }
        else{
            CurPlayer = "X"
        }

        if (location==1 || location==3 || location==7 || location==9){
            //corners
            when (location) {
                1 -> {
                    // Case 1: Top Row                                  Case 2: Left Column                             Case 3: Main Diagonal
                    if ((TR.text==CurPlayer && TM.text==CurPlayer) || (ML.text==CurPlayer && BL.text==CurPlayer) || (MM.text==CurPlayer && BR.text==CurPlayer)) {
                        TR.text = "A"
                        endGame(1)
                        playerWin = true
                    }
                }
                3 -> {
                    // Case 1: Top Row                                  Case 2: Right Column                             Case 3: Second Diagonal
                    if ((TL.text==CurPlayer && TM.text==CurPlayer) || (MR.text==CurPlayer && BR.text==CurPlayer) || (MM.text==CurPlayer && BL.text==CurPlayer)){
                        endGame(1)
                        playerWin = true
                    }
                }
                7 -> {
                    // Case 1: Top Row                                  Case 2: Left Column                             Case 3: Second Diagonal
                    if ((BR.text==CurPlayer && BM.text==CurPlayer) || (ML.text==CurPlayer && TL.text==CurPlayer) || (MM.text==CurPlayer && TR.text==CurPlayer)){
                        endGame(1)
                        playerWin = true
                    }
                }
                else -> {
                    // Case 1: Top Row                                  Case 2: Right Column                             Case 3: Second Diagonal
                    if ((BL.text==CurPlayer && BM.text==CurPlayer) || (MR.text==CurPlayer && TR.text==CurPlayer) || (MM.text==CurPlayer && TL.text==CurPlayer)){
                        endGame(1)
                        playerWin = true
                    }
                }
            }
        }
        else if (location==2 || location==4 || location==6 || location==8){
            //sides
            when (location) {
                2 -> {
                    // Case 1: Top Row                                  Case 2: Middle Column
                    if ((TL.text==CurPlayer && TR.text==CurPlayer) || (MM.text==CurPlayer && BM.text==CurPlayer)){
                        endGame(1)
                        playerWin = true
                    }
                }
                4 -> {
                    // Case 1: Middle Row                                  Case 2: Left Column
                    if ((MM.text==CurPlayer && MR.text==CurPlayer) || (TL.text==CurPlayer && BL.text==CurPlayer)){
                        endGame(1)
                        playerWin = true
                    }
                }
                6 -> {
                    // Case 1: Middle Row                                  Case 2: Right Column
                    if ((ML.text==CurPlayer && MM.text==CurPlayer) || (TR.text==CurPlayer && BR.text==CurPlayer)){
                        endGame(1)
                        playerWin = true
                    }
                }
                8 -> {
                    // Case 1: Bottom Row                                  Case 2: Middle Column
                    if ((BL.text==CurPlayer && BR.text==CurPlayer) || (MM.text==CurPlayer && TM.text==CurPlayer)){
                        endGame(1)
                        playerWin = true
                    }
                }
            }

        }
        else {
            //middle
            // Case 1: Main Diagonal                             Case 2: Second Diagonal
            if ((TL.text==CurPlayer && BR.text==CurPlayer) || (TR.text==CurPlayer && BL.text==CurPlayer)) {
                endGame(1)
                playerWin = true
            }
        }
        if (CurPlayer=="X"){
            CurPlayer = "O"
        }
        else{
            CurPlayer = "X"
        }
        if (!playerWin && playCount==9){
            endGame(0)
        }
        //updateTurn()
    }
}