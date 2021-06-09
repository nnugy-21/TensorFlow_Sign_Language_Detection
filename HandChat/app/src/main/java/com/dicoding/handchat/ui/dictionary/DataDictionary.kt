package com.dicoding.handchat.ui.dictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.dicoding.handchat.R

class DataDictionary : AppCompatActivity() {
    companion object {
        const val EXTRA_NAMA = "extra_nama"
        const val EXTRA_AVATAR= "extra_avatar"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_dictionary)

        val tvNameReceived : TextView =findViewById(R.id.tv_item_name)
        val tvAvatarReceived: ImageView = findViewById(R.id.image_item_photo)
        val name = intent.getStringExtra(EXTRA_NAMA)
        val img = intent.getIntExtra(EXTRA_AVATAR, 0)
        tvNameReceived.text = name
        tvAvatarReceived.setImageResource(img)
    }
}