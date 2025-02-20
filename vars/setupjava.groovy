def call(cmd) {
    echo " installing  ${cmd}"
    sh "sudo apt update"
    echo " ${cmd}"
      sh "sudo apt install -y ${cmd}"
}
