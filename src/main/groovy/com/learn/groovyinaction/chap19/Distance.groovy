package com.learn.groovyinaction.chap19

import groovy.transform.TupleConstructor

@TupleConstructor
class Distance {
    Number amount
    DistanceUnit unit

    Speed div(Duration duration){
        new Speed(amount, unit)
    }

    @Override
    String toString () {
        "$amount$unit"
    }
}
