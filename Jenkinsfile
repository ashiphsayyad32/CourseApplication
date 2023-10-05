pipeline{
    agent any
    
    tools{
        maven 'Maven3'
    }
    
    stages{
        
        stage('Checkout'){
            steps{
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/ashiphsayyad32/CourseApplication.git']])
            }
        }
        
        stage('Build'){
            steps{
                sh 'mvn clean install'
            }
        }
        
        stage('Test'){
            steps{
                sh 'mvn test'
            }
            
            post{
                always{
                    junit '**/target/surefire-reports/TEST-*.xml'
                }
            }
        }
    }
}
