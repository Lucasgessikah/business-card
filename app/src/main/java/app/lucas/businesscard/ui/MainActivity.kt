package app.lucas.businesscard.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.lucas.businesscard.R
import app.lucas.businesscard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }
}