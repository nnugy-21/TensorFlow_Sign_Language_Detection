package com.dicoding.handchat.ui.settings

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.provider.Settings
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.dicoding.handchat.R
import com.dicoding.handchat.databinding.FragmentSettingsBinding
import com.dicoding.handchat.reminder.ReminderReceiver

class SettingsFragment : Fragment() {

    private lateinit var fragmentSettingsBinding: FragmentSettingsBinding
    private lateinit var sharedPreference : SharedPreferences
    private lateinit var reminderReceiver: ReminderReceiver

    companion object{
        private const val PREFS_NAME = "user_pref"
        private const val DAILY = "daily"
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        fragmentSettingsBinding = FragmentSettingsBinding.inflate(layoutInflater)
        return (fragmentSettingsBinding.root)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        sharedPreference = requireContext().getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

        reminderReceiver = ReminderReceiver()

       fragmentSettingsBinding.switchReminder.isChecked = sharedPreference.getBoolean(DAILY, false)

        fragmentSettingsBinding.switchReminder.setOnCheckedChangeListener{_, onNotif ->
            if (onNotif){
                reminderReceiver.setDailyNotification(
                    this@SettingsFragment.context, ReminderReceiver.TYPE_DAY, getString(R.string.dailyNotify))
            }else{
                reminderReceiver.cancelDailyNotification(this@SettingsFragment.context)
            }

            val editor = sharedPreference.edit()
            editor.putBoolean(DAILY, onNotif)
            editor.apply()
        }

        fragmentSettingsBinding.btnLanguage.setOnClickListener {
            startActivity(Intent(Settings.ACTION_LOCALE_SETTINGS))
        }
    }

}