## JavaScript入门

### var 和 let 的区别

***var（ES5） let（ES6）***

![image-20230930232039978](C:\Users\Ma\AppData\Roaming\Typora\typora-user-images\image-20230930232039978.png)

*let会产生块级作用域*



### Javascript数组

```javascript
const myArray = ["dog",3,2,1,"foot"];

myArray.pop();//移除最后一个元素
myArray.shift();//移除第一个元素
myArray.push("today");//添加元素至末尾
myArray.unshift("Happy");//添加元素至首部
```



### Javascript对象

如果对象中的属性含有空格，必须使用方括号获取对象的属性值

如果想获取的值的名称为一个变量，也应用方括号

![image-20231001232414270](C:\Users\Ma\AppData\Roaming\Typora\typora-user-images\image-20231001232414270.png)



```js
const ourDog = {
  "name": "Camper",
  "legs": 4,
  "tails": 1,
  "friends": ["everything!"],
};
ourDog.bark = "woof";//直接给对象添加属性
deltet ourDog.legs;  //删除对象属性


//检查某个对象是否含有某属性obj.hasOwnProperty()
function checkObj(obj, checkProp) {
	return obj.hasOwnProperty(checkProp) ? obj[checkProp] : "Not Found";
}
console.log(checkObj({gift: "pony", pet: "kitten", bed: "sleigh"}, "gift"));


```



![image-20231002145941693](C:\Users\Ma\AppData\Roaming\Typora\typora-user-images\image-20231002145941693.png)

解题注意：如果prop没有tracks属性如5439，需要新开一个数组，在push进去，如何判断对象是否含有某属性，hasOwnProperty（）

```javascript
const recordCollection = {
 2548: {
  albumTitle: 'Slippery When Wet',
  artist: 'Bon Jovi',
  tracks: ['Let It Rock', 'You Give Love a Bad Name']
 },
 2468: {
  albumTitle: '1999',
  artist: 'Prince',
  tracks: ['1999', 'Little Red Corvette']
 },
 1245: {
  artist: 'Robert Palmer',
  tracks: []
 },
 5439: {
  albumTitle: 'ABBA Gold'
 }
};
function updateRecords(records, id, prop, value) {
 if(value == "")
 {
  delete records[id][prop];
 }
 else{
  if(prop != 'tracks')
  {
   records[id][prop] = value;
  }
  else{
   if(records[id].hasOwnProperty("tracks"))
   {
  records[id].tracks.push(value);
   }
   else{
    records[id].tracks = [];
    records[id].tracks.push(value);
   }
  }
 }
 return records;
}
updateRecords(recordCollection, 2548, "artist", "")
console.log(updateRecords(recordCollection, 5439, "tracks", "Take a Chance on Me"))
```

### JavaScript循环

![image-20231002153608574](C:\Users\Ma\AppData\Roaming\Typora\typora-user-images\image-20231002153608574.png)

在Javascript中for循环尽量使用let代替var因为var会变量提升，产生全局变量，而let是块级作用域



![image-20231002160546418](C:\Users\Ma\AppData\Roaming\Typora\typora-user-images\image-20231002160546418.png)

Math.random()生成的区间为[0,1)

Math.floor()向下取整



####   parseInt函数

![image-20231002160743469](C:\Users\Ma\AppData\Roaming\Typora\typora-user-images\image-20231002160743469.png)

![image-20231002161110630](C:\Users\Ma\AppData\Roaming\Typora\typora-user-images\image-20231002161110630.png)

#### 递归创建连续序列

注意unshift和push的使用，以及递归的过程，退出条件

![image-20231002163612362](C:\Users\Ma\AppData\Roaming\Typora\typora-user-images\image-20231002163612362.png)

![image-20231002164317151](C:\Users\Ma\AppData\Roaming\Typora\typora-user-images\image-20231002164317151.png)



## ES6

### var和let的区别2

使用 `var` 关键字声明变量时，它是全局声明的，如果在函数内部声明则是局部声明的。

`let` 关键字的行为类似，但有一些额外的功能。 在代码块、语句或表达式中使用 `let` 关键字声明变量时，其作用域仅限于该代码块、语句或表达式。

![image-20231002172716424](C:\Users\Ma\AppData\Roaming\Typora\typora-user-images\image-20231002172716424.png)

###  防止对象改变

![image-20231002173611477](C:\Users\Ma\AppData\Roaming\Typora\typora-user-images\image-20231002173611477.png)

### 匿名函数和箭头函数

箭头函数是一种语法糖，能够不改变编译运行效果的前提下简化代码的方法

![image-20231002173945311](C:\Users\Ma\AppData\Roaming\Typora\typora-user-images\image-20231002173945311.png)



![image-20231002174436315](C:\Users\Ma\AppData\Roaming\Typora\typora-user-images\image-20231002174436315.png)

含有默认参数的箭头函数

![image-20231002174722273](C:\Users\Ma\AppData\Roaming\Typora\typora-user-images\image-20231002174722273.png)

### rest操作符和spread操作符

![image-20231002200455752](C:\Users\Ma\AppData\Roaming\Typora\typora-user-images\image-20231002200455752.png)





