job('who-is-ayush-wedsite') {
    description("CI-CD pipe-line for Ayushishu portfolio website ")
    github-project{
        project-url("https://github.com/ayushishu/Ayushishu_Portfolio_website/")   
    }
    scm{
        git("https://github.com/ayushishu/Ayushishu_Portfolio_website/", main)
    }
    triggers {
        scm('* * * * *')
    }
    build {
        execute-windows-batch-command{
            cmd('docker-compose down','docker-compose up -d')
        }
    }
}