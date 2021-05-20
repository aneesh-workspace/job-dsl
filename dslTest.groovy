job('freestyle-seed-job1') {
    steps {
       shell('echo Hello World!')
    }
}

pipelineJob('pipeline-seed-job2') {
     parameters {
        stringParam('Parameter1', Parameter1, 'Enter a Parameter')
    }
  definition {
    cps {
      script(readFileFromWorkspace('jenkinsfile'))
      sandbox()     
    }
  }
 }
