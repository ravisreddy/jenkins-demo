pipelineJob('app-service-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/ravisreddy/app.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}
