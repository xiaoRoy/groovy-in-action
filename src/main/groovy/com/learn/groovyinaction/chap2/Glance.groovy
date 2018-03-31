package com.learn.groovyinaction.chap2

def second = '2nd'
def groovyInAction = "Groovy In Action $second"
assert groovyInAction == "Groovy In Action 2nd"

def roman = ['', 'I', 'II', 'III', 'IV', 'V', 'VI', 'VII']
assert roman[4] == 'IV'
roman[8] = 'VIII'
assert roman.size() == 9
