const fs = require('fs')
let filePath = "./file/为学1.md"


new Promise((resolve, reject) => {
    fs.readFile(filePath, (err, data) => {
        if (err) {
            reject(err)
        }
        else {
            resolve(data)
        }
    });
}).then(val => {
    console.log(val)
    console.log(val.toString());
}, res => {
    console.log(res)
})
