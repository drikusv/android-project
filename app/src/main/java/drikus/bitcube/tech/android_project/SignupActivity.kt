package drikus.bitcube.tech.android_project

import android.content.Intent
import drikus.bitcube.tech.android_project.Database.UserDao
import drikus.bitcube.tech.android_project.ViewModel.SignupViewModel
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import drikus.bitcube.tech.android_project.Database.UserModel
import drikus.bitcube.tech.android_project.R.layout.activity_signup
import kotlinx.android.synthetic.main.activity_signup.*


class  SignupActivity: AppCompatActivity(){

    private val signVM = SignupViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_signup)

    }

    fun onSignup(view: View){

            var valid: Boolean = true


       if (txt_Password.text == null){
           txt_Password.setError(getString(R.string.Field_require))
           valid = false
       }
       else if (!signVM.validPassword(txt_Password.text.toString())){
           txt_Password.setError(getString(R.string.Invalid_Password))
           txt_Password.text.clear()
           valid = false
       }

        if (txt_Email.text == null){
            txt_Email.setError(getString(R.string.Field_require))
            valid = false
        }
        else if (!signVM.validEmail(txt_Email.text.toString())) {
            txt_Email.setError(getString(R.string.Invalid_Email))
            txt_Email.text.clear()
            valid = false
        }



        if (valid) {

            val user = UserModel(Name = txt_Name.text.toString(),
                    Surname = txt_Surname.text.toString(),
                    Age = signVM.Age(txtD_Date.text.toString()),
                    Dob = txtD_Date.text.toString(),
                    Cell = txt_Cell.text.toString(),
                    Address = txt_Address.text.toString(),
                    Email = txt_Email.text.toString(),
                    Password = txt_Password.text. toString ()


            )

            startActivity(Intent(this, LoginActivity::class.java))
            finish()

        }

    }

    fun ondateclick(view: View){

    }

    fun onBackClick(view: View){
        startActivity(Intent(this, LoginActivity::class.java))
        finish()

        txt_Name.text.clear()
        txt_Surname.text.clear()
        txtD_Date.text.toString()
        txt_Cell.text.toString()
        txt_Address.text.toString()
        txt_Email.text.toString()
        txt_Password.text. toString ()

    }
}