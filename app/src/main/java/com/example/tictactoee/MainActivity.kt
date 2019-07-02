package com.example.tictactoee


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var curr = " "

  private var roundCount=1
    val field  :Array<Array<String>> = Array(3) { Array(8) { " " } }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        reset.setOnClickListener {
            btn1.text= " "
            btn2.text= " "
            btn3.text= " "
            btn4.text= " "
            btn5.text= " "
            btn6.text= " "
            btn7.text= " "
            btn8.text= " "
            btn9.text= " "
            roundCount=1

            for(i in 0..2)
            {
                for(j in 0..2)
                {
                    field[i][j]= " "
                }
            }
        }

        btn1.setOnClickListener{
            if(roundCount%2!=0)
            {
                btn1.text="O"
                curr="O"
            }
            else
            {
                btn1.text="X"
                curr="X"
            }
            field[0][0]=curr



            if (checkForWin()) {
                if (roundCount%2!=0) {
                    player1Wins()
                } else {
                    player2Wins()
                }
            }
            if (roundCount == 9) {
                draw()
            }
            roundCount++

        }

        btn2.setOnClickListener{
            if(roundCount%2!=0)
            {
                btn2.text="O"
                curr="O"
            }
            else
            {
                btn2.text="X"
                curr="X"
            }
            field[0][1]=curr
            if (checkForWin()) {
                if (roundCount%2!=0) {
                    player1Wins()
                } else {
                    player2Wins()
                }
            }
            if (roundCount == 9) {
                draw()
            }
            roundCount++
        }

        btn3.setOnClickListener{

            if(roundCount%2!=0)
            {
                btn3.text="O"
                curr="O"

            }
            else
            {
                btn3.text="X"
                curr="X"
            }
            field[0][2]=curr
            if (checkForWin()) {
                if (roundCount%2!=0) {
                    player1Wins()
                } else {
                    player2Wins()
                }
            }
            if (roundCount == 9) {
                draw()
            }
            roundCount++
        }

        btn4.setOnClickListener{
            if(roundCount%2!=0)
            {
                btn4.text="O"
                curr="O"
            }
            else
            {
                btn4.text="X"
                curr="X"
            }
            field[1][0]=curr
            if (checkForWin()) {
                if (roundCount%2!=0) {
                    player1Wins()
                } else {
                    player2Wins()
                }
            }
            if (roundCount == 9) {
                draw()
            }
            roundCount++
        }

        btn5.setOnClickListener{


            if(roundCount%2!=0)
            {
                btn5.text="O"
                curr="O"
            }
            else
            {
                btn5.text="X"
                curr="X"
            }
            field[1][1]=curr
            if (checkForWin()) {
                if (roundCount%2!=0) {
                    player1Wins()
                } else {
                    player2Wins()
                }
            }
            if (roundCount == 9) {
                draw()
            }
            roundCount++
        }

        btn6.setOnClickListener{

            if(roundCount%2!=0)
            {
                btn6.text="O"
                curr="O"
            }
            else
            {
                btn6.text="X"
                curr="X"
            }
            field[1][2]=curr
            if (checkForWin()) {
                if (roundCount%2!=0) {
                    player1Wins()
                } else {
                    player2Wins()
                }
            }
            if (roundCount == 9) {
                draw()
            }
            roundCount++
        }

        btn7.setOnClickListener{

            if(roundCount%2!=0)
            {
                btn7.text="O"
                curr="O"
            }
            else
            {
                btn7.text="X"
                curr= "X"
            }
            field[2][0]=curr

            if (checkForWin()) {
                if (roundCount%2!=0) {
                    player1Wins()
                } else {
                    player2Wins()
                }
            }
            if (roundCount == 9) {
                draw()
            }
            roundCount++
        }

        btn8.setOnClickListener{

            if(roundCount%2!=0)
            {
                btn8.text="O"
                curr= "O"
            }
            else
            {
                btn8.text="X"
                curr="X"
            }
            field[2][1]=curr

            if (checkForWin()) {
                if (roundCount%2!=0) {
                    player1Wins()
                } else {
                    player2Wins()
                }
            }
            if (roundCount == 9) {
                draw()
            }
            roundCount++

        }

        btn9.setOnClickListener{

            if(roundCount%2!=0)
            {
                btn9.text="O"
                curr="O"
            }
            else
            {
                btn9.text="X"
                curr="X"
            }
            field[2][2]=curr
            if (checkForWin()) {
                if (roundCount%2!=0) {
                    player1Wins()
                } else {
                    player2Wins()
                }
            }
            if (roundCount == 9) {
                draw()
            }
            roundCount++

        }

    }

    private fun checkForWin():Boolean {


        for (i in 0..2) {
            if (field[i][0]==(field[i][1])
                && field[i][0]==(field[i][2])
                && field[i][0]!=" ") {
                return true
            }
        }

        for (i in 0..2) {
            if (field[0][i]==(field[1][i])
                && field[0][i]==(field[2][i])
                && field[0][i]!=" ") {
                return true
            }
        }

        if (field[0][0]==(field[1][1])
            && field[0][0]==(field[2][2])
            && field[0][0]!=" ") {
            return true
        }

        if (field[0][2]==(field[1][1])
            && field[0][2]==(field[2][0])
            && field[0][2]!=" ") {
            return true
        }

        return false
    }
    private fun player1Wins(): Unit{

        Toast.makeText(this, "Player 1 wins!", Toast.LENGTH_SHORT).show()


    }

    private fun player2Wins(): Unit {
        Toast.makeText(this, "Player 2 wins!", Toast.LENGTH_SHORT).show()
    }

    private fun  draw(): Unit {
        Toast.makeText(this, "Draw!", Toast.LENGTH_SHORT).show();
    }

}
