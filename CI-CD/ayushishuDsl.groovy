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