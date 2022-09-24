//YOU DOES NOT NEED THIS FILE , YOU CAN CREATE THE PIPELINE BY USING JenkinsFile 
//THIS FILE IS ONLY USE TO CREATE THE FREE STYLE JOB 
//TO CREATE THE CI - CD PIPELINE YOU CAN USE JenkinsFile 
job('who-is-ayush-wedsite-dev-branch') {
    description("dev-branch-CI-CD pipe-line for Ayushishu portfolio website ")
    
    scm {
        git("https://github.com/ayushishu/Ayushishu_Portfolio_website/", 'dev')
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        batchFile('docker-compose up -d')
    }
}
