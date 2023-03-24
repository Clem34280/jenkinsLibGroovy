import java.nio.file.Paths

def call(String scriptFilename, String workspace){
    String scriptPath = [workspace, 'test', scriptFilename].join('/')

    if(isUnix())
	{
		sh "npm test"
	}
	else
	{
		bat "npm test"
	}
}
