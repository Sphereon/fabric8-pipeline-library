#!/usr/bin/groovy
package io.fabric8

def init() {
    Utils.metaClass.isCI = {
        ->
        def branch = $deledate.getBranch()
        if(branch && (branch.toLowerCase().startsWith('pr-') || branch.toLowerCase().startsWith('feature'))){
            echo "- CI branch detected: ${branch}"
            return true
        }
        // if we can't get the branch assume we're not in a CI pipeline as that would be a PR branch
        return false
    }
}