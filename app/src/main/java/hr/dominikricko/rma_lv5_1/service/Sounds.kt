package hr.dominikricko.rma_lv5_1.service

import android.media.AudioAttributes
import android.media.SoundPool
import hr.dominikricko.rma_lv5_1.ApplicationContext
import hr.dominikricko.rma_lv5_1.R

object Sounds {

    private val soundpool : SoundPool

    private val horseSoundId : Int
    private val dogSoundId : Int
    private val catSoundId : Int
    private val birdSoundId : Int

    init{

        val soundBuilder = SoundPool.Builder()
        val soundAttributeBuilder = AudioAttributes.Builder()

        soundAttributeBuilder.setContentType(AudioAttributes.CONTENT_TYPE_UNKNOWN)
        soundAttributeBuilder.setUsage(AudioAttributes.USAGE_GAME)

        soundBuilder.setMaxStreams(4)
        soundBuilder.setAudioAttributes(soundAttributeBuilder.build())

        soundpool = soundBuilder.build()

        birdSoundId = soundpool.load(ApplicationContext.context, R.raw.bird_chirp,0)
        horseSoundId = soundpool.load(ApplicationContext.context, R.raw.horse_neigh,0)
        catSoundId = soundpool.load(ApplicationContext.context, R.raw.cat_meow,0)
        dogSoundId = soundpool.load(ApplicationContext.context, R.raw.dog_woof,0)

    }

    fun playHorseSound(){
        soundpool.play(horseSoundId, 0.8F, 0.8F, 1, 0, 1.0F)
    }

    fun playBirdSound(){
        soundpool.play(birdSoundId, 0.8F, 0.8F, 1, 0, 1.0F)
    }

    fun playCatSound(){
        soundpool.play(catSoundId, 0.8F, 0.8F, 1, 0, 1.0F)
    }

    fun playDogSound(){
        soundpool.play(dogSoundId, 0.8F, 0.8F, 1, 0, 1.0F)
    }

}