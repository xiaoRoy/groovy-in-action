package com.learn.groovyinaction.chap4

def numRange = 0..10
assert numRange.contains(0)
assert numRange.contains(10)

def numRangeExclusive = 0..<10
assert !numRangeExclusive.contains(10)

def alphabeticRange = 'a'..'d'
def log = ''
for(letter in alphabeticRange){
    log += letter
}
assert log == 'abcd'

log = ''
alphabeticRange.each{
    log += it
}
assert log == 'abcd'

def age = 36
def insuranceRate = 0.0
switch (age){
    case 16..20 : insuranceRate = 0.05; break
    case 21..50 : insuranceRate = 0.06; break
    case 51..65 : insuranceRate = 0.07; break
    default: throw new IllegalArgumentException()
}
assert insuranceRate == 0.06

def midAge = 21..50
def ages = [20, 36, 42, 56]
assert ages.grep(midAge) == [36, 42]

def monday = new WeekDay("Mon")
def friday = new WeekDay("Fri")
def workday = ''
(monday..friday).each {
    workday += it.toString() + ' '
}
assert workday == 'Mon Tue Wed Thu Fri '
