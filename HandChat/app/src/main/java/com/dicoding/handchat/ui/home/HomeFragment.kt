package com.dicoding.handchat.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import com.dicoding.handchat.databinding.FragmentHomeBinding
import com.dicoding.handchat.ui.dictionary.DictionaryActivity
import com.dicoding.handchat.ui.learn.LearnActivity
import com.dicoding.handchat.ui.sign.SignTranslatorActivity
import com.dicoding.handchat.ui.text.TextSignActivity

class HomeFragment : Fragment() {

    private lateinit var fragmentHomeBinding: FragmentHomeBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        fragmentHomeBinding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return fragmentHomeBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        buttonSignTranslator()
        buttonTextTranslator()
        buttonDictionary()
        buttonLearn()

    }

    private fun buttonSignTranslator(){
        fragmentHomeBinding.btnSign.setOnClickListener{
            val intent = Intent(this@HomeFragment.context, SignTranslatorActivity::class.java)
            startActivity(intent)
        }
    }

    private fun buttonTextTranslator(){
        fragmentHomeBinding.btnText.setOnClickListener{
            val intent = Intent(this@HomeFragment.context, TextSignActivity::class.java)
            startActivity(intent)
        }
    }

    private fun buttonDictionary(){
        fragmentHomeBinding.btnDictionary.setOnClickListener{
            val intent = Intent(this@HomeFragment.context, DictionaryActivity::class.java)
            startActivity(intent)
        }
    }

    private fun buttonLearn(){
        fragmentHomeBinding.btnLearn.setOnClickListener{
            val intent = Intent(this@HomeFragment.context, LearnActivity::class.java)
            startActivity(intent)
        }
    }
}