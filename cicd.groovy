node('linux')
{
  stage('Build') {
    build job: 'Port-Pipeline', parameters: [string(name: 'PORT_GITHUB_REPO', value: 'https://github.com/ZOSOpenTools/fzfport.git'), string(name: 'PORT_DESCRIPTION', value: 'A command-line fuzzy finder' )]
  }
}
