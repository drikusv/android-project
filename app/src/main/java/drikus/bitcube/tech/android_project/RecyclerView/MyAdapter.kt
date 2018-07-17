package drikus.bitcube.tech.android_project.RecyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import drikus.bitcube.tech.android_project.Database.UserModel
import drikus.bitcube.tech.android_project.R

class MyAdapter(private val MyDatabase: List<UserModel>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val name = inflater!!.inflate(R.layout.layout_item, parent, false) as TextView
        return ViewHolder(name)
    }

    class ViewHolder(val name: TextView) : RecyclerView.ViewHolder(name)


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = MyDatabase[position].Name
    }

    override fun getItemCount() = MyDatabase.size


}


