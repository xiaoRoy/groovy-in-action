package com.learn.groovyinaction.chap3

import groovy.transform.Immutable

@Immutable
class Money {
    int amount
    String currency

    Money plus(Money another){
        if(another == null){
            return this
        }
        if(currency != another.currency){
            throw new IllegalAccessException(
                    "cannot add $currency to $another.currency"
            )
        }
        return new Money(amount + another.amount, currency)
    }

    Money plus(Integer more){
        return new Money(amount + more, currency)
    }
}
