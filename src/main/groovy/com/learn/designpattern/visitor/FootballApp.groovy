package com.learn.designpattern.visitor


def players = [new Forward(), new Midfielder(), new CentreBack()]
FootballManagementSystem footballManagementSystem = new FootballManagementSystem(players: players)
footballManagementSystem.doAnalysis { it.rating }
