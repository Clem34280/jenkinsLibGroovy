import java.nio.file.Paths

def call(String scriptFilename, String workspace){
    String scriptPath = [workspace, 'test', scriptFilename].join('/')

    bat "mocha ${scriptPath}  ${workspace}"
}
