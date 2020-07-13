def call()
{
	script 
	{
	sh "docker rmi $registry:$BUILD_NUMBER"
	}
}