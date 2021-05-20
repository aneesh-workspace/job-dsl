job('freestyle-seed-job1') {
    steps {
       shell('echo Hello World!')
    }
}

pipelineJob('pipeline-seed-job2') {
    logRotator {
    numToKeep 5
  }
  definition {
    cps {
      script(readFileFromWorkspace('jenkinsfile'))
      sandbox()     
    }
  }
 }
