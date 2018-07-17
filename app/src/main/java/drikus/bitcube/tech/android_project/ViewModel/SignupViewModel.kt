package drikus.bitcube.tech.android_project.ViewModel

import android.database.CursorJoiner
import androidx.lifecycle.ViewModel
import java.util.*
import java.util.regex.Pattern
import javax.xml.transform.Result

class SignupViewModel : ViewModel(){

    fun Age(age: String): Int {

        var Year: String = age.substring(0, 4)
        var Month: String = age.substring(5, 7)
        var day: String = age.substring(8, 10)

        var curYear: Int = Calendar.getInstance().get(Calendar.YEAR)
        var curmonth: Int = Calendar.getInstance().get(Calendar.MONTH)
        var curDay: Int = Calendar.getInstance().get(Calendar.DAY_OF_MONTH)

        var tage: Int = 0;

        if (curYear < Year.toInt()) {

        } else {
            tage = curYear - Year.toInt()

            if (Month.toInt() < curmonth) {
                tage -= 1
            } else {
                if (curmonth == Month.toInt()) {
                    if (day.toInt() < curDay) {
                        tage -= 1
                    }

                }
            }

        }

        return  tage
    }

    fun validEmail(email: String): Boolean{

        return Pattern.compile("^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]|[\\w-]{2,}))@"
                + "((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
                + "([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                + "[0-9]{1,2}|25[0-5]|2[0-4][0-9]))|"
                + "([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$").matcher(email).matches()

    }

    fun validPassword(password: String): Boolean{
        val REGEX_password ="""^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@-_=+#&!*])(?=S+$).{4,12}""".toRegex()
         if (!(password.substring(0, 1).matches(Regex("\\d")) && !password.substring(0, 1).matches(Regex("[@-_=+#&!*]")))) {
             return true //REGEX_password.matches(password)
        } else {
            return false
        }
        //"((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@-_=+#&!*]).{4,12}"

    }




    }


