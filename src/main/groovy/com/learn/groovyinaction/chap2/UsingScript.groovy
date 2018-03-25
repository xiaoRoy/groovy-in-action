package com.learn.groovyinaction.chap2

Book groovy = new Book("Groovy In Action")
assert groovy.getTitle() == "Groovy In Action"
assert getTitleBackwards(groovy) == "noitcA nI yvoorG"

String getTitleBackwards(book){
    String title = book.getTitle()
    return title.reverse()
}
