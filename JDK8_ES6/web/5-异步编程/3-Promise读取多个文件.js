//1. 引入 fs 模块
const fs = require('fs');

const { promiseHooks } = require('v8');

let filePath1 = "./file/为学.md"
let filePath2 = "./file/观书有感.md"

let p1 = new Promise((resolve, reject) => {
    fs.readFile(filePath1, (err, data) => {
        if (err) {
            reject(err)
        } else {
            resolve(data)
        }
    })
})

let p2 = new Promise((resolve, reject) => {
    fs.readFile(filePath2, (err, data) => {
        if (err) {
            reject(err)
        } else {
            resolve(data)
        }
    })
})

// async function test() {
//     try {
//         let file1 = await p1;
//         console.log(file1.toString())
//         let file2 = await p2;
//         console.log(file2.toString())

//     }
//     catch (e) {
//         console.log(e)
//     }
// }
// test()

async function readFile1() {
    let data = await new Promise((resolve, reject) => {
        fs.readFile(filePath1, (err, data) => {
            if (err) {
                reject(err);
            } else {
                resolve(data)
            }
        })
    })
    console.log(data.toString());
    console.log("ma")
}

readFile1()




