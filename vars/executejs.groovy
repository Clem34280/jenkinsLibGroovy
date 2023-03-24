import java.nio.file.Paths

def call(String scriptFilename, String workspace, String optionalArgs){
    String scriptPath = [workspace, 'test', scriptFilename].join('/')

    if(isUnix())
	{
		sh "node ${scriptPath}  ${workspace} ${optionalArgs}"
	}
	else
	{
		bat "node ${scriptPath}  ${workspace} ${optionalArgs}"
	}
}
