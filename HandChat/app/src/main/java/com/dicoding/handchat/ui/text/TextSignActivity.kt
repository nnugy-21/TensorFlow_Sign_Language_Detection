package com.dicoding.handchat.ui.text

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.handchat.R
import com.dicoding.handchat.databinding.ActivityTextSignBinding

class TextSignActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_sign)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        this.title = "Text Translator"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}