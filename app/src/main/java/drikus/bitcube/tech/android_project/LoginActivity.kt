@file:Suppress("DEPRECATION")

package drikus.bitcube.tech.android_project

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import drikus.bitcube.tech.android_project.R.layout.activity_login
import drikus.bitcube.tech.android_project.ViewModel.LoginViewModel
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : AppCompatActivity() {
    private val loginVM = LoginViewModel()

    val signupNM: SignupActivity = SignupActivity()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_login)

        if (sharedPref.userStored) {
            val Main = Intent(this, MainActivity::class.java)
            startActivity(Main)
            finish()
        }
    }

    fun onLogin(view: View) {
        var email: String = txt_sEmail.text.toString()
        var pass: String = txt_sPassword.text.toString()

       if (loginVM.loginUser(email, pass)){
           startActivity(Intent(this, MainActivity::class.java))
           finish()
       }


    }

    fun onSignUp(view: View) {
        startActivity(Intent(this, SignupActivity::class.java))
        finish()
    }

}
