job('freestyle-seed-job1') {
    steps {
       shell('echo Hello World!')
    }
}

pipelineJob('pipeline-seed-job2') {
    definition {
        cps {
          script(jenkinsfile)
          sandbox()
        } }
          properties {
        disableResume()
        disableConcurrentBuilds()
      }
          triggers {
        cron(cronTrigger)
        scm("H/15 * * * *")
        githubPush()
      }
        }
