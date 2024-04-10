
let fs = require('fs')
fs.writeFile("../2-文件操作/file/ma.txt", "hhh", err => {
    if (err) {
        console.log(err);
    }
    else {
        console.log("写入成功")
    }
})

// fs.appendFile("./file/name.txt", "maxiao", err => {
//     if (err) {
//         console.log(err);
//     }
//     else {
//         console.log("写入成功")
//     }
// })
