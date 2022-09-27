package com.sriyank.globotour.city

import com.sriyank.globotour.R


data class City(var imageId: Int, var name: String, var isFavorite: Boolean)


object VacationSpots {

    private val images = arrayListOf(

        R.drawable.thumb_1_0, R.drawable.thumb_1_1, R.drawable.thumb_1_2,
        R.drawable.thumb_1_3, R.drawable.thumb_1_4, R.drawable.thumb_1_5,
        R.drawable.thumb_1_6, R.drawable.thumb_1_7,

    )

    private val cityNames = arrayListOf(
        "New Delhi", "Manchester", "Nottingham", "Portsmouth", "Agra",
        "Hyderabad", "Goa", "Srinagar"

    )

    // Returns the list of city objects to be displayed in CityListFragment RecyclerView
    var cityList: ArrayList<City>? = null
        get() {

            if (field != null)      // backing 'field' refers to 'cityList' property object
                return field

            field = ArrayList()
            for (i in images.indices) {

                val imageId = images[i]
                val cityName = cityNames[i]
                val city = City(imageId, cityName, false)
                field!!.add(city)
            }

            return field
        }

    // Will contain the 'favorite' marked cities to be displayed in FavoriteFragment RecyclerView
    var favoriteCityList: MutableList<City> = mutableListOf()
}
