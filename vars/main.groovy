def call(Map params)
{
  pipeline{
    agent any
    stages{
      stage("build")
      {
        steps{
        }
      }
      
      stage("test")
      {
        steps{
        }
      }
      
      stage("deploy")
      {
        steps{
        }
      }
    }
  }
}
