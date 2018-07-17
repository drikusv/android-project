package drikus.bitcube.tech.android_project.ViewModel

import android.content.Intent
import androidx.core.content.ContextCompat.startActivity
import androidx.lifecycle.ViewModel
import drikus.bitcube.tech.android_project.App
import drikus.bitcube.tech.android_project.MainActivity
import drikus.bitcube.tech.android_project.sharedPref


class LoginViewModel : ViewModel() {

    fun loginUser(email: String, Password: String): Boolean{
        var dbEmail = App.database!!.userDao().getEmail(email).toString()
        var dbPassword = App.database!!.userDao().getPassword(Password).toString()
        if (email == dbEmail && Password == dbPassword) {
           return true
            sharedPref.email = email
            sharedPref.userStored = true
        }else {
            return false


        }
    }


}


