package com.learn.tutorial.script

import org.codehaus.groovy.runtime.InvokerHelper

class InsideMainScript extends Script{

    int power(int number){
        2 ** number
    }

    def run(){
        println 'Groovy World'
        println "2^6=${power(6)}"
    }

    static void main(String[] args) {
        InvokerHelper.runScript(InsideMainScript, args)
    }
}
