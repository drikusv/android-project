package drikus.bitcube.tech.android_project.Database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull
import java.util.*


@Entity(tableName = "Users")

data class UserModel(

        @PrimaryKey(autoGenerate = true)
        @NotNull
        @ColumnInfo(name = "userID")         var ID: Int? = 0,

        @ColumnInfo(name = "userName")       var Name: String?,

        @ColumnInfo(name = "userSurname")    var Surname: String?,

        @ColumnInfo(name = "userAge")        var Age: Int?,

        @ColumnInfo(name = "userDOB")        var Dob: String?,

        @ColumnInfo(name = "userCell")       var Cell: String?,

        @ColumnInfo(name = "userAddress")    var Address: String?,

        @NotNull
        @ColumnInfo(name = "userEmail")      var Email: String,

        @NotNull
        @ColumnInfo(name = "userPassword")   var Password: String


)



