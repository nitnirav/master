def call(Map pipelineParams) {

    pipeline {
        agent any
        stages {
            stage('checkout git') {
                steps {
                    echo "Git checkout"
                }
            }

            stage('build') {
                steps {
                    echo "build Stage"
                }
            }

            stage ('test') {
                steps {
                   echo "Test stage"
                }
            }

            stage('deploy developmentServer'){
                steps {
                    echo "Deploymentt"
                }
            }

          
            stage('deploy production'){
                steps {
                    echo "Deploy in prod"
                }
            }
        }
    }
}
