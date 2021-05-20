job('freestyle-seed-job1') {
    steps {
        shell('echo Hello World!')
    }
}

pipelineJob('pipeline-seed-job2') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        github('jenkinsci/pipeline-examples')
                    }
                }
            }
            scriptPath('declarative-examples/simple-examples/environmentInStage.groovy')
        }
    }
}
