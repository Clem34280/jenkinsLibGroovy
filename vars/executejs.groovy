import java.nio.file.Paths

def call(String scriptFilename, String workspace){
    String scriptPath = [workspace, 'test', scriptFilename].join('/')

    if(isUnix())
	{
		sh "node ${scriptPath}  ${workspace}"
	}
	else
	{
		bat "node ${scriptPath}  ${workspace}"
	}
}
