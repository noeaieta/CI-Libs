def call()
{
	script 
	{
	dockerImage = docker.build registry + ":$BUILD_NUMBER"
	}
}