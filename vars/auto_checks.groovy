def call() {
    node {
      sh '''
         git --version
         mvn --version
         echo "hello"
         '''
  }
}
