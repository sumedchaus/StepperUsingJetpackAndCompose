package sk.sandeep.jfldemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.stepstone.stepper.StepperLayout
import sk.sandeep.jfldemo.adapter.StepperAdapter


class MainActivity : AppCompatActivity() {

    private var mStepperLayout: StepperLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStepperLayout = findViewById(R.id.stepperLayout)
        mStepperLayout!!.setAdapter(StepperAdapter(supportFragmentManager, this))

        //mStepperLayout!!.adapter = StepperAdapter(supportFragmentManager, this)
    }
}
