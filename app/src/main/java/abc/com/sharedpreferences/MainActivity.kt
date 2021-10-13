package abc.com.sharedpreferences

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sPref =getPreferences(Context.MODE_PRIVATE)
       var color= sPref.getInt("COLOR", Color.WHITE)
        AllBackground.setBackgroundColor(color)

        var editor= sPref.edit()
        editor.putInt("COLOR", Color.RED)
        editor.apply()
        fun  saveColor(color: Int) {
            var editor=sPref.edit()
            editor.putInt("COLOR", color)
            editor.apply()
        }
        btnBlue.setOnClickListener {
            AllBackground.setBackgroundColor(Color.BLUE)
            saveColor(Color.BLUE)
        }
        btnRed.setOnClickListener {
            AllBackground.setBackgroundColor(Color.RED)
            saveColor(Color.RED)
        }
        btnGreen.setOnClickListener {
            AllBackground.setBackgroundColor(Color.GREEN)
            saveColor(Color.GREEN)
        }





    }
}