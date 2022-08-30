package com.example.airlineapp
import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class RecyclerAdapter(val context: Context,var airlinesList: ArrayList<Airlines>?) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>(){
// just to test it out



    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.card_layout1, viewGroup, false)
        return ViewHolder(v)
    }


    override fun onBindViewHolder(holder:ViewHolder, position: Int) {

        holder.title.text = airlinesList?.get(position)?.airline_name?:"HAMADA"
      //  holder.details.text = details[position]
        //holder.itemImage.setImageResource(images[position])
    }

    fun setAirlineList(airlinesList: ArrayList<Airlines>)
    {
            this.airlinesList?.clear()
            this.airlinesList?.addAll(airlinesList)
            notifyDataSetChanged()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        //var image: ImageView
        val title: TextView = itemView.findViewById(R.id.item_title)
     //   var details: TextView

       /* init {
            // image = itemView.findViewById(R.id.item_image)
            title = itemView.findViewById(R.id.item_title)
         //   details = itemView.findViewById(R.id.item_detail)
        }*/
    }

    override fun getItemCount(): Int {
        return airlinesList?.size?:0
    }

}
