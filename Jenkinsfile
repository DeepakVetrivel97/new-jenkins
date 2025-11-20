library identifier: 'Jenkins_Pipeline_Shared_Libs@main',
retriever: modernSCM([$class: 'GitSCMSource', remote: 'https://github.com/anshulc55/Jenkins_Pipeline_Shared_Libs.git'])

pipeline{
 agent any
   environment{
     index=prod
   }
  
  stages{
   stage('checking commands') {
     steps{
        auto_checks()
    }
  }
 }
}

