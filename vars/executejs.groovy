import java.nio.file.Paths

def call(String workspace){

    if(isUnix())
	{
		sh "npm init",
		sh "npm i -D mocha chai",
		sh "npm test"
	}
	else
	{
		bat "npm init",
		bat "npm i -D mocha chai",
		bat "npm test"
	}
}
