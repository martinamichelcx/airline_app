package com.example.airlineapp.placeholder

import java.util.ArrayList
import java.util.HashMap

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object PlaceholderContent {

    /**
     * An array of sample (placeholder) items.
     */
    val ITEMS: MutableList<PlaceholderItem> = ArrayList()

    /**
     * A map of sample (placeholder) items, by ID.
     */
    val ITEM_MAP: MutableMap<String, PlaceholderItem> = HashMap()

    init
    {
        //adding sample items to the list
        addItem(PlaceholderItem( "1", "Quatar Airways", "Quatar", "Going Places Together",
            "Qatar Airways Towers, Doha, Qatar",
            "www.qatarairways.com",
            "1994"))
        addItem(
            PlaceholderItem("2", "Singapore Airlines", "Singapore", "A Great Way to Fly",
                "Airline House, 25 Airline Road, Singapore 819829",
                "www.singaporeair.com",
                "1947"))
    }
   /* private val COUNT = 25

    init {
        // Add some sample items.
        for (i in 1..COUNT) {
            addItem(createPlaceholderItem(i))
        }
    }
*/
    private fun addItem(item: PlaceholderItem) {
        ITEMS.add(item)
        ITEM_MAP.put(item.id, item)
    }

  /*  private fun createPlaceholderItem(position: Int): PlaceholderItem {
        return PlaceholderItem(position.toString(), "Item " + position, makeDetails(position))
    }

    private fun makeDetails(position: Int): String {
        val builder = StringBuilder()
        builder.append("Details about Item: ").append(position)
        for (i in 0..position - 1) {
            builder.append("\nMore details information here.")
        }
        return builder.toString()
    }
*/
    /**
     * A placeholder item representing a piece of content.
     */
    data class PlaceholderItem(val id: String, val airline_name: String, val country: String, val slogan: String,
    val head_quarters: String, val website: String, val established: String ) {
        override fun toString(): String = airline_name
    }
}