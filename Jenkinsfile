library identifier: 'new-jenkins@main',
retriever: modernSCM([$class: 'GitSCMSource', remote: 'https://github.com/DeepakVetrivel97/new-jenkins.git'])

pipeline{
 agent any
   environment{
     index = 'prod'
   }
  
  stages{
   stage('checking commands') {
     steps{
        auto_checks()
    }
  }
 }
}

