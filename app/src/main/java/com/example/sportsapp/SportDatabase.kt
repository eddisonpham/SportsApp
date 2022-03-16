package com.example.sportsapp

class SportDatabase {

    var sports: ArrayList<Sport>? = null
    constructor(){
        sports = ArrayList()

        sports?.add(Sport("Boxing", "Boxing is a combat sport in which two people," +
                " usually wearing protective gloves," +
                " throw punches at each other for a predetermined set of time" +
                " in a boxing ring", R.drawable.boxing))
        sports?.add(Sport("Wrestling", "Wrestling is a combat sport involving grappling type" +
                " techniques such as clinch fighting, throws and takedowns, joint locks," +
                " pins and other grappling holds.", R.drawable.wrestling))
        sports?.add(Sport("Taekwondo", "Taekwondo is a korean martial art" +
                " characterized by its emphasis on head-height kicks," +
                " jumping and spinning kicks, and fast kicking techniques.", R.drawable.taekwondo))
        sports?.add(Sport("Crossfit", "CrossFit is a branded fitness regimen created" +
                " by Greg Glassman and is a registered trademark of CrossFit, Inc.", R.drawable.crossfit))
        sports?.add(Sport("Karate", "Karate is a martial art developed in" +
                " the Ryukyu Kingdom.", R.drawable.karate))
        sports?.add(Sport("Football", "Association football, more commonly known as" +
                " football or soccer, is a team sport played between" +
                " two teams of eleven players with a spherical ball",
            R.drawable.football))
        sports?.add(Sport("Judo", "Judo was created as" +
                " a physical, mental and moral pedagogy in Japan," +
                " in 1882, by Jigoro Kano. ", R.drawable.judo))
    }
}