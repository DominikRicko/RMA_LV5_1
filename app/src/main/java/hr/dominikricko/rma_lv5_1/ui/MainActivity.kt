package hr.dominikricko.rma_lv5_1.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import hr.dominikricko.rma_lv5_1.databinding.ActivityMainBinding
import hr.dominikricko.rma_lv5_1.service.Sounds

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private val sounds = Sounds()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.ivBird.setOnClickListener{ sounds.playBirdSound()}
        binding.ivCat.setOnClickListener{ sounds.playCatSound()}
        binding.ivDog.setOnClickListener{ sounds.playDogSound()}
        binding.ivHorse.setOnClickListener { sounds.playHorseSound() }

        setContentView(binding.root)
    }

}