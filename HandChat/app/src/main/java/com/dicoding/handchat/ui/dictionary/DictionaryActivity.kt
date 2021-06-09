package com.dicoding.handchat.ui.dictionary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.handchat.R
import com.dicoding.handchat.Dictionary
import com.dicoding.handchat.DictionaryData

class DictionaryActivity : AppCompatActivity() {
    private lateinit var rvUsers: RecyclerView
    private var list: ArrayList<Dictionary> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dictionary)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        rvUsers = findViewById(R.id.rvuser)
        rvUsers.setHasFixedSize(true)

        list.addAll(DictionaryData.listData)
        showRecyclerList()
            }

    private fun showRecyclerList() {
        rvUsers.layoutManager = LinearLayoutManager(this)
        val listUserAdapter = ListUserAdapter(list)
        rvUsers.adapter = listUserAdapter

        listUserAdapter.setOnItemClickCallback(object : ListUserAdapter.OnItemClickCallback {
            override fun onItemClicked(dataku: Dictionary) {
                val moveWithDataIntent = Intent(this@DictionaryActivity, DataDictionary ::class.java)
                moveWithDataIntent.putExtra(DataDictionary.EXTRA_NAMA, dataku.name)
                 moveWithDataIntent.putExtra(DataDictionary.EXTRA_AVATAR, dataku.avatar)
                startActivity(moveWithDataIntent)
            }
        })
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}