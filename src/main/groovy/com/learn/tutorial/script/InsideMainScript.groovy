package com.learn.tutorial.script

import org.codehaus.groovy.runtime.InvokerHelper

class InsideMainScript extends Script{

    def run(){
        println 'Groovy World'
    }

    static void main(String[] args) {
        InvokerHelper.runScript(InsideMainScript, args)
    }
}
