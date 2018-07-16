package com.learn.groovyinaction.chap19.namedargument

import com.learn.groovyinaction.chap19.Distance
import com.learn.groovyinaction.chap19.category.DistanceCategory

class DistanceAbbreviationCategory {

    static Distance getCm(Number number){
        DistanceCategory.getCentimeters(number)
    }

    static Distance getM(Number number){
        DistanceCategory.getMeters(number)
    }

    static Distance getKm(Number number){
        DistanceCategory.getKilometers(number)
    }
}
