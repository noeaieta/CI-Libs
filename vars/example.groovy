def call()
{
    writeFile([file:"$WORKSPACE/example.sh",text:libraryResource("sh/example.sh")])
    sh '''
    chmod +x example.sh
    $WORKSPACE/example.sh hola
    '''
}