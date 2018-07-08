package com.learn.groovyinaction.chap19

enum DistanceUnit {

    centimeter('cm', 0.01),
    meter('m', 1),
    kilometer('km', 1000)

    String abbreviation
    double multiple

    DistanceUnit(String abbreviation, double multiple){
        this.abbreviation = abbreviation
        this.multiple = multiple
    }

    @Override
    String toString () {
        abbreviation
    }
}
