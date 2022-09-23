job('who-is-ayush-wedsite') {
    description("CI-CD pipe-line for Ayushishu portfolio website ")
    
    scm {
        git("https://github.com/ayushishu/Ayushishu_Portfolio_website/", 'dev')
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        batch('docker-compose up -d)
    }
}