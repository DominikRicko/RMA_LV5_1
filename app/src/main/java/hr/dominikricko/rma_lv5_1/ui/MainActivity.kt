package hr.dominikricko.rma_lv5_1.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import hr.dominikricko.rma_lv5_1.databinding.ActivityMainBinding
import hr.dominikricko.rma_lv5_1.service.Sounds

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.ivBird.setOnClickListener{ Sounds.playBirdSound()}
        binding.ivCat.setOnClickListener{ Sounds.playCatSound()}
        binding.ivDog.setOnClickListener{ Sounds.playDogSound()}
        binding.ivHorse.setOnClickListener { Sounds.playHorseSound() }

        setContentView(binding.root)
    }

}