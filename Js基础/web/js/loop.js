//1-while循环
let i = 0;
while (i<10){
    console.log(i+"-helloworld");
    i++;
}
console.log("----------------------");

//2-while常规用法
let j = 0;
while (true){
    console.log(j+"-helloworld");
    if (j==5) {
        break;
    }
    j++;
}
console.log("----------------------");

//3-do while用法
let z = 1;
do {
    console.log("循环体第一遍我肯定执行");
}while (z>2);
console.log("----------------------");

//4-for循环
for (let k = 0; k < 5; k++) {
    console.log(k+"-helloworld");
}