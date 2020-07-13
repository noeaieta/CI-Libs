def call()
{
    pipeline
    {
        agent any
        environment
        {
            registry = "eltano84/docker-test"
            registryCredential = 'dockerhub'
            dockerImage = ''
        }
        stages
        {
            stage('Building and send image')
            {
                steps
                {
                    build_docker()
                }
            }
            stage('Remove Unused docker image')
            {
                steps
                {
                    remove_old_image()
                }
            }
        }
    }
}
