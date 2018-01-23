#!/usr/bin/groovy
package io.fabric8

def init() {
    Utils.metaClass.isCI = {
        ->
        echo "WHOEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEIIIIIIIIIIIIIIIIIIII"
        return true
    }
}