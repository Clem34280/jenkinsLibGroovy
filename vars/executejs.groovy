import java.nio.file.Paths

def call(String workspace){

    if(isUnix())
	{
		sh "npm test"
	}
	else
	{
		bat "npm test"
	}
}
