package drikus.bitcube.tech.android_project.shared

import android.content.Context
import android.content.SharedPreferences

class SharedPref(context: Context) {

    private val PREFERENCES_FILENAME = SharedPref::class.qualifiedName
    private val ID = "id"
    private val EMAIL = "email_address"
    private val USER_STORED = "user_stored"

    private var sharedPreferences: SharedPreferences = context.getSharedPreferences(PREFERENCES_FILENAME, 0)

    var id: String?
        get() = sharedPreferences.getString(ID, "")
        set(value) = sharedPreferences.edit().putString(ID, value).apply()

    var email: String?
        get() = sharedPreferences.getString(EMAIL, "")
        set(value) = sharedPreferences.edit().putString(EMAIL, value).apply()

    var userStored: Boolean
        get() = sharedPreferences.getBoolean(USER_STORED, false)
        set(value) = sharedPreferences.edit().putBoolean(USER_STORED, value).apply()
}