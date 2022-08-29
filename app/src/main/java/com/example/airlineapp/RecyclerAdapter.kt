package com.example.airlineapp
import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView

class RecyclerAdapter(val context: Context) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>(){
// just to test it out
    var airlinesList : List<Airlines> = listOf()



    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.card_layout1, viewGroup, false)
        return ViewHolder(v)
    }


    override fun onBindViewHolder(holder:ViewHolder, position: Int) {

        holder.title.text = airlinesList.get(position).airline_name
      //  holder.details.text = details[position]
        //holder.itemImage.setImageResource(images[position])
    }

    fun setAirlineList(airlinesList: List<Airlines>)
    {
            this.airlinesList=airlinesList
            notifyDataSetChanged()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        //var image: ImageView
        val title: TextView = itemView!!.findViewById(R.id.title)
     //   var details: TextView

       /* init {
            // image = itemView.findViewById(R.id.item_image)
            title = itemView.findViewById(R.id.item_title)
         //   details = itemView.findViewById(R.id.item_detail)
        }*/
    }

    override fun getItemCount(): Int {
        return airlinesList.size
    }

}


/*class RvAdapter(val userList: ArrayList<String>) : RecyclerView.Adapter<RvAdapter.ViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val v = LayoutInflater.from(p0?.context).inflate(R.layout.card_layout1, p0, false)
        return ViewHolder(v);
    }
    override fun getItemCount(): Int {
        return userList.size
    }
    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {

        p0.name?.text = userList[p1]
       // p0.count?.text = userList[p1].count.toString()
    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name = itemView.findViewById<TextView>(R.id.id_text)
      //  val count = itemView.findViewById<TextView>(R.id.tvCount)

    }
}
*/
