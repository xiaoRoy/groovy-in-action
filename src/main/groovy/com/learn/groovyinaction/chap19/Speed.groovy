package com.learn.groovyinaction.chap19

import groovy.transform.TupleConstructor

@TupleConstructor
class Speed {
    Number number
    DistanceUnit unit

    @Override
    String toString () {
        "$number $unit/h"
    }
}
