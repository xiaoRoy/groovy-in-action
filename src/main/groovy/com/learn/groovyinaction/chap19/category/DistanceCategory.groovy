package com.learn.groovyinaction.chap19.category

import com.learn.groovyinaction.chap19.Distance
import com.learn.groovyinaction.chap19.DistanceUnit

class DistanceCategory {

    static Distance getCentimeters(Number amount){
        new Distance(amount, DistanceUnit.centimeter)
    }

    static Distance getMeters(Number amount){
        new Distance(amount, DistanceUnit.meter)
    }

    static Distance getKilometers(Number amount){
        new Distance(amount, DistanceUnit.kilometer)
    }
}
