package com.learn.groovyinaction.chap4

class WeekDay implements Comparable<WeekDay>{

    static final DAYS = ['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat']

    private int index = 0

    WeekDay(String day){
        index = DAYS.indexOf(day)
    }

    WeekDay next(){
        return new WeekDay(DAYS[(index + 1) % DAYS.size()])
    }

    WeekDay previous(){
        return new WeekDay(DAYS[index - 1])
    }

    @Override
    int compareTo (WeekDay another) {
        return index <=> another.index
    }

    @Override
    String toString () {
        return DAYS[index]
    }
}
