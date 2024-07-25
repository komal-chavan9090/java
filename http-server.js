const http=require('http');

const server=http.createServer((req,res)=>{
    if(req.url=='/')
    {
        res.end("welcomeeeeeeeeeeeee")
    }
    if(req.url=='/about')
    {
        res.end("about page");
    }
    if(req.url=='/home')
    {
        res.end("home page");
    }
    // res.write("welcome to home page");
    res.end();
})

server.listen(5000);