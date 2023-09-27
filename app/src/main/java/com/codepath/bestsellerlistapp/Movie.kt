package com.codepath.bestsellerlistapp

import com.google.gson.annotations.SerializedName

/**
 * The Model for storing a single book from the NY Times API
 *
 * SerializedName tags MUST match the JSON response for the
 * object to correctly parse with the gson library.
 */
class Movie {

    @SerializedName("name")
    var title: String? = null

//    @SerializedName("overview")
//    var description: String? = null

    @SerializedName("poster_path")
    var imageUrl: String? = null

    @SerializedName("original_name")
    var originalTitle: String? = null

    @SerializedName("backdrop_path")
    var backdropUrl: String? = null

    @SerializedName("first_air_date")
    var firstAirDate: String? = null

    @SerializedName("overview")
    var overview: String? = null

}