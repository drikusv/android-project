package drikus.bitcube.tech.android_project.Database

import android.provider.ContactsContract
import androidx.room.*
import io.reactivex.Flowable


@Dao
interface UserDao{

    @Query("SELECT * FROM Users")
    fun getAll() : Flowable<List<UserModel>>

    @Query("SELECT * FROM Users Where userEmail = :email")
    fun getEmail(email: String): Flowable<UserModel>

    @Query("SELECT * FROM Users Where userPassword = :password ")
    fun getPassword(password: String): Flowable<UserModel>

   @Insert(onConflict = OnConflictStrategy.REPLACE )
    fun insert(entity: UserModel)

}