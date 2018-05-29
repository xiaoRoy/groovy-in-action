package com.learn.designpattern.visitor

class FootballManagementSystem {

    List<FootballPlayer> players

    def doAnalysis(Closure analyst){
        players.each { it.accept(analyst) }
    }
}
