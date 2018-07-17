package drikus.bitcube.tech.android_project

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import drikus.bitcube.tech.android_project.Database.UserModel
import drikus.bitcube.tech.android_project.RecyclerView.MyAdapter
import io.reactivex.schedulers.Schedulers


class MainActivity : AppCompatActivity() {

    private lateinit var recycleView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        App.database!!.userDao().getAll().subscribeOn(Schedulers.newThread())
                .subscribe { result ->

                }
    }

    fun onUserUpdate(userModels: List<UserModel>) {
        recycleView.findViewById<RecyclerView>(R.id.layout_item).apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = MyAdapter(userModels)
        }
    }

}
