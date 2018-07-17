package drikus.bitcube.tech.android_project.Database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [(UserModel::class)], version = 1)
abstract class AppDatebase : RoomDatabase() {

    abstract fun userDao() : UserDao
}