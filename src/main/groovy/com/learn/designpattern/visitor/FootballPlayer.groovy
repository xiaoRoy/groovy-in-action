package com.learn.designpattern.visitor

class FootballPlayer {

    String name
    Float rating

    def accept(Closure analyst){
        analyst(this)
    }
}
