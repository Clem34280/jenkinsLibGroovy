import java.nio.file.Paths

def call(String workspace){

    if(isUnix())
	{
		sh "npm init"
		sh "npm i"
		sh "npm test"
	}
	else
	{
		bat "npm init"
		bat "npm i"
		bat "npm test"
	}
}
