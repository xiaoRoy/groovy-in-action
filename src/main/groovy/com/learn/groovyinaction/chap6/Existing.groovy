package com.learn.groovyinaction.chap6


def static throwCheckedException(){
    throw new FileNotFoundException()
}

def logs = []

try{
    throwCheckedException()
}catch (FileNotFoundException exception){
    logs << exception.toString()
}finally{
    logs << 'finally'
}
assert logs.size() == 2
