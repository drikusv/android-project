package drikus.bitcube.tech.android_project

import drikus.bitcube.tech.android_project.Database.AppDatebase
import android.app.Application
import androidx.room.Room
import androidx.room.RoomDatabase
import drikus.bitcube.tech.android_project.shared.SharedPref

val sharedPref: SharedPref by lazy{
    App.pref!!
}

val database: RoomDatabase by lazy {
    App.database!!

}


class App: Application(){

    companion object {
        var database: AppDatebase? = null
        var pref: SharedPref? = null
    }


    override fun onCreate() {
        super.onCreate()

        pref = SharedPref(applicationContext)

        database = Room.databaseBuilder(this, AppDatebase::class.java, "Database")
                .build()
    }





}