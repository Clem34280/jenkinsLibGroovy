import java.nio.Paths

def call(String scriptFilename, String workspace, String optionalArgs){
    String scriptPath = [workspace, 'Test', scriptFilename].join('/')

    if(isUnix())
	{
		sh "node ${scriptPath}  ${workspace} ${optionalArgs}"
	}
	else
	{
		bat "node ${scriptPath}  ${workspace} ${optionalArgs}"
	}
}
