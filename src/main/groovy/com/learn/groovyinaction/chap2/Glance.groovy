package com.learn.groovyinaction.chap2

def second = '2nd'
def groovyInAction = "Groovy In Action $second"
assert groovyInAction == "Groovy In Action 2nd"

def roman = ['', 'I', 'II', 'III', 'IV', 'V', 'VI', 'VII']
assert roman[4] == 'IV'
roman[8] = 'VIII'
assert roman.size() == 9

def http = [
        100 : 'CONTINUE',
        200 : 'OK',
        400 : 'BDA REQUEST'
]
assert http[200] == 'OK'
http[500] = 'INTERNAL SERVER ERROR'
assert http.size() == 4

def numberRange = 1..10
assert numberRange.contains(2)
assert numberRange.size() == 10
assert numberRange.from == 1
assert numberRange.to == 10


def totalClinks = 0
def partyPeople = 100
1.upto(partyPeople, {guestIndex ->
    def clink = guestIndex - 1
    totalClinks += clink
})
assert totalClinks == (partyPeople * (partyPeople-1)) / 2
totalClinks = 0


1.upto(partyPeople) {guestIndex ->
    def clink = guestIndex - 1
    totalClinks += clink
}
assert totalClinks == (partyPeople * (partyPeople-1)) / 2

def numberList = [1, 2, 3, 4]
numberList.each {print it}

if(null){
   //never reach
    assert false
} else {
    assert true
}
