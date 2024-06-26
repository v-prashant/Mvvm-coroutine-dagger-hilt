package com.example.trendingapp.network.response

import java.util.ArrayList

class GetRepositoriesResponse {
    var items: ArrayList<Item>? = null

    inner class Item {
        var photo: String? = null
        var name: String? = null
        var htmlUrl: String? = null
        var description: String? = null
        var language: String? = null
        var watchersCount: String? = null
        var forksCount: String? = null
    }
}