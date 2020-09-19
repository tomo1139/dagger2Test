package develop.beta1139.dagger2test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import develop.beta1139.dagger2test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { DataBindingUtil.setContentView(this, R.layout.activity_main) as ActivityMainBinding }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding
    }
}