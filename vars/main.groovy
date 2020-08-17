import org.devops.*;

def call() {
    try {
        sh "echo 1 "
    } catch(Exception e) {
        echo "does not work"
        echo "The build is failed"
        currentBuild.result = 'FAILURE'
    }
}
