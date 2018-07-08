package com.learn.groovyinaction.chap19

import groovy.transform.TupleConstructor

@TupleConstructor
class Distance {
    Number amount
    DistanceUnit unit

    @Override
    String toString () {
        "$amount$unit"
    }
}
