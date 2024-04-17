package com.adso.marvelapp.data

import com.adso.marvelapp.model.Superheroe

class DataSource {
    fun getSuperheroes(): MutableList<Superheroe> {
        var superheroes: MutableList<Superheroe> = mutableListOf()

        superheroes.add(Superheroe("Spiderman","Marvel","Peter Parker",""))

        superheroes.add(Superheroe("Daredevil","Marvel","Matthew Murdock",""))

        superheroes.add(Superheroe("Wolverine","Marvel","James Howlett ",""))

        superheroes.add(Superheroe("Batman","DC","Bruce Wayne",""))

        superheroes.add(Superheroe("Thor","Marvel","Thor Odinson",""))

        return superheroes


    }
}