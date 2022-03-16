package com.example.sportsapp

class Sport {
    var sportName: String? = null
    var sportDetail: String? = null
    var sportImage: Int? = null

    constructor(name: String, detail: String, image: Int){

        sportName = name
        sportDetail = detail
        sportImage = image
    }
}