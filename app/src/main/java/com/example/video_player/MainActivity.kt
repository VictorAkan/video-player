package com.example.video_player

import android.net.Uri
import android.os.Bundle
import android.widget.VideoView
import android.widget.MediaController
import android.net.Uri.*
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.example.video_player.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val videoView = findViewById<VideoView>(binding.testView.id)
//        Creating MediaController
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
//        specify the location of the video
//        val uri: Uri = parse(
//            "android.resource://$packageName/ppp"
//        )
        val uri: Uri = parse("android.resource://$packageName/${R.raw.ppp}")
//        Setting media controller and uri, then starting the video
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()
    }
}