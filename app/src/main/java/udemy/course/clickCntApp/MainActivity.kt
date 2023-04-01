package udemy.course.clickCntApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickerButton = findViewById<Button>(R.id.clicker_button)
        val clickNumText = findViewById<TextView>(R.id.click_num)
        var clickCnt = 0
        clickerButton.setOnClickListener {
            clickCnt++
            clickNumText.text = "Number of clicks: $clickCnt"

            if (clickCnt == 15) {
                Toast.makeText(this, "Woah, such count", Toast.LENGTH_LONG).show()
            }
        }
    }
}