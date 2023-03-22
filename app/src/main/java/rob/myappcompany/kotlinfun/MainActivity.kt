package rob.myappcompany.kotlinfun

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import rob.myappcompany.kotlinfun.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    var count = 0

    fun reset(view : View) {
        count = 0
        textView.text = count.toString()
    }

    fun plusOne(view : View) {
        count++
        textView.text = count.toString()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView = findViewById<TextView>(R.id.textView)
        binding.textView.text = "0"
    }
}
