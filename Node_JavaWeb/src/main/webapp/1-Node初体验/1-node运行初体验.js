let fun = (num) => {
    for (let i = 0; i <= num; i++) {
        if (i % 3 == 0 && i % 10 == 0) {
            console.log(i);
            console.log("maxiao")
        }
    }
};
fun(50);