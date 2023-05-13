def buildApp() {
    echo "building the application..."
}

def testApp() {
    echo "Test the application"
}

def deployApp() {
    echo "deploying the application..."
    echo "deploying version ${params.VERSION}..."
}

return this