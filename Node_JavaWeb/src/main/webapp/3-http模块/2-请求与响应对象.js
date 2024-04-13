//1-导入http模块
const http = require('http');

const server = http.createServer((request, response) => {
    console.log(request.method)
    console.log(request.url)
    console.log(request.headers.host)
    const url = new URL(request.url, 'http://localhost:9000')
    console.log(url.pathname)
    console.log(url.searchParams.get("username"))

});

server.listen(9000, () => {
    console.log("9000端口，服务已经启动");
})