def call()
{
    if (env.debug_mode != null)
    {
        if(env.debug_mode  == 'true')
        {
        	sh "echo debug mode activado"
            sh "echo 1 > $WORKSPACE/debug_mode.txt"
        }
    else
        {
        	sh "echo debug mode desactivado"
            sh "echo 0 > $WORKSPACE/debug_mode.txt"
        }
    }
    
}