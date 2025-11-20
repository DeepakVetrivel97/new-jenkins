def call() {
    node {
      sh '''
         git --version
         echo "hello"
         '''
  }
}
