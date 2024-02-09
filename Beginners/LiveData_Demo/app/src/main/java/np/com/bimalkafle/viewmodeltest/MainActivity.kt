package np.com.bimalkafle.viewmodeltest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    lateinit var textView : TextView
    lateinit var button: Button
    lateinit var subButton: Button
    lateinit var viewModel: MainViewModel



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        textView = findViewById(R.id.text_view)
        button = findViewById(R.id.btn)
        subButton = findViewById(R.id.sub_btn)

        viewModel.count.observe(this,{count->
            textView.text = "Count is $count";
        })



        button.setOnClickListener {
            viewModel.increaseCount()
        }

        subButton.setOnClickListener {
            viewModel.decreaseCount()
        }

    }
}