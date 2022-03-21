package com.example.videoplayer


import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import androidx.appcompat.app.AppCompatActivity
import com.example.videoplayer.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

//        play video from online by uri link
//        val uriPath = "https://videoshub.com/videos/25316664"
//        val uri : Uri = Uri.parse(uriPath)
//        binding.videoPlayer.setVideoURI(uri)
//        val mediaController = MediaController(this)
//        mediaController.setAnchorView(binding.videoPlayer)
//        binding.videoPlayer.setMediaController(mediaController)
//        binding.videoPlayer.start()

//        play video statically by using raw materials
//        val uriPath = "android.resource://" + packageName + "/" + R.raw.sample
//        val uri: Uri = Uri.parse(uriPath)
//        binding.videoPlayer.setVideoURI(uri)
//        val mediaController = MediaController(this)
//        mediaController.setAnchorView(binding.videoPlayer)
//        binding.videoPlayer.setMediaController(mediaController)
//        binding.videoPlayer.start()
    }
}