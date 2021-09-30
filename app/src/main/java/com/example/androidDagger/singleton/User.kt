package com.example.androidDagger.singleton

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


data class User (
    @SerializedName("page")
    @Expose
    var page: Int? = null,

    @SerializedName("per_page")
    @Expose
    var perPage: Int? = null,

    @SerializedName("total")
    @Expose
    var total: Int? = null,

    @SerializedName("total_pages")
    @Expose
    var totalPages: Int? = null,

    @SerializedName("data")
    @Expose
    var data: List<Any>? = null,

    @SerializedName("support")
    @Expose
    var support: Support? = null
)

data class Support (
    @SerializedName("url")
    @Expose
    var url: String? = null,

    @SerializedName("text")
    @Expose
    var text: String? = null
)