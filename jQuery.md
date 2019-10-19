# jQuery

&emsp;

## 目录

## 第一章[jQuery使用](#第一章-jquery使用)

### &emsp;1.1[引入jQuery](#11-引入jquery)

### &emsp;1.2[jQuery与其它框架的冲突](#12-jquery与其它框架的冲突)

### &emsp;1.3[jQuery的使用](#13-jquery的使用)

### &emsp;1.4[jQuery入口函数与原生js函数的区别](#14-jquery入口函数与原生js函数的区别)

## 第二章[基础语法](#第二章-基础语法)

### &emsp;2.1[jQuery基础操作](#21-jquery基础操作)

### &emsp;2.2[jQuery对象](#22-jquery对象)

### &emsp;2.3[jQuery静态方法](#23-jquery静态方法)

#### &emsp;&emsp;2.3.1[\$each()方法](#231-each方法)

#### &emsp;&emsp;2.3.2[\$map()方法](#232-map方法)

#### &emsp;&emsp;2.3.3[\$trim()方法](#233-trim方法)

#### &emsp;&emsp;2.3.4[\$isWindow()方法](#234-isWindow方法)

#### &emsp;&emsp;2.3.5[\$isArray()方法](#235-isArray方法)

#### &emsp;&emsp;2.3.6[\$isFunction()方法](#236-isFunction方法)

#### &emsp;&emsp;2.3.7[\$holdReady()方法](#237-holdReady方法)

### &emsp;2.4[jQuery选择器](#24-jquery选择器)

#### &emsp;&emsp;2.4.1[\$("*")](#241-"*")

#### &emsp;&emsp;2.4.2[\$(this)](#242-this)

#### &emsp;&emsp;2.4.3[\$(元素名:first)](#243-元素名:first)

#### &emsp;&emsp;2.4.4[\$(元素名:last)](#244-元素名:last)

#### &emsp;&emsp;2.4.5[\$([属性名])](#245-属性名)

#### &emsp;&emsp;2.4.6[\$(":button")](#246-:"button")

#### &emsp;&emsp;2.4.7[\$(元素名:even)](#247-元素名:even)

#### &emsp;&emsp;2.4.8[\$(元素名:odd)](#248-元素名:odd)

#### &emsp;&emsp;2.4.9[\$(元素名:empty)](#249-元素名:empty)

#### &emsp;&emsp;2.4.10[\$(元素名:parent)](#2410-元素名:parent)

#### &emsp;&emsp;2.4.11[\$(元素名:contains(内容))](#2411-元素名:contains)

#### &emsp;&emsp;2.4.12[\$(元素名:has(内容))](#2412-元素名:has)

### &emsp;2.5[jQuery属性操作](#25-jquery属性操作)

#### &emsp;&emsp;2.5.1[attr()方法](#251-attr方法)

#### &emsp;&emsp;2.5.2[removeAttr()方法](#252-removeAttr方法)

#### &emsp;&emsp;2.5.3[prop()方法](#253-prop方法)

#### &emsp;&emsp;2.5.4[removeProp()方法](#254-removeProp方法)

#### &emsp;&emsp;2.5.5[addClass()方法](#255-addClass方法)

#### &emsp;&emsp;2.5.6[removeClass()方法](#256-removeClass方法)

#### &emsp;&emsp;2.5.7[toggleClass()方法](#257-toggleClass方法)

### &emsp;2.6[jQuery文本操作](#26-jquery文本操作)

#### &emsp;&emsp;2.6.1[html()方法](#261-html方法)

#### &emsp;&emsp;2.6.2[text()方法](#262-text方法)

#### &emsp;&emsp;2.6.3[val()方法](#263-val方法)

### &emsp;2.7[jQuery样式操作](#27-jquery样式操作)

#### &emsp;&emsp;2.7.1[css()方法](#271-css方法)

#### &emsp;&emsp;2.7.2[width()方法](#272-width方法)

#### &emsp;&emsp;2.7.3[height()方法](#273-height方法)

#### &emsp;&emsp;2.7.4[offset()方法](#274-offset方法)

#### &emsp;&emsp;2.7.5[offsetParent()方法](#275-offsetParent方法)

#### &emsp;&emsp;2.7.6[position()方法](#276-position方法)

#### &emsp;&emsp;2.7.7[scrollLeft()方法](#277-scrollLeft方法)

#### &emsp;&emsp;2.7.8[scrollTop()方法](#278-scrollTop方法)

### &emsp;28[jQuery事件](#28-jquery事件)

#### &emsp;&emsp;2.8.1[事件绑定方法](#281-事件绑定方法)

#### &emsp;&emsp;2.8.2[事件移除方法](#282-事件移除方法)

#### &emsp;&emsp;2.8.3[阻止事件冒泡和默认行为](#283-阻止事件冒泡和默认行为)

#### &emsp;&emsp;2.8.4[事件自动触发](#284-事件自动触发)

##### &emsp;&emsp;&emsp;2.8.4.1[trigger()方法](#2841-trigger方法)

##### &emsp;&emsp;&emsp;2.8.4.2[triggerHandle()方法](#2842-triggerhandle方法)

#### &emsp;&emsp;2.8.5[自定义事件](#285-自定义事件)

#### &emsp;&emsp;2.8.6[jQuery事件命名空间](#286-jQuery事件命名空间)

#### &emsp;&emsp;2.8.7[事件委托](#287-事件委托)

&emsp;

## [直达底部](#回到目录)

---

&emsp;

## [第一章 jQuery使用](#第一章jquery使用)

### [1.1 引入jQuery](#11引入jquery)

可以通过多种方法在网页中添加 jQuery。 可以使用以下方法：

+ 从 [jQuer官网](https://jquery.com "jQuery")下载 jQuery 库。  
+ 从 CDN 中载入 jQuery, 如从 Google 中加载 jQuery以严格模式和非严格模式所得到的结果可能不同。  
有两个版本的 jQuery 可供下载：
  + Production version - 用于实际的网站中，已被精简和压缩。
  + Development version - 用于测试和开发（未压缩，是可读的代码）
以上两个版本都可以从 [jQuer官网](https://jquery.com "jQuery")中下载。

jQuery 库是一个 JavaScript 文件，您可以使用HTML的`<script>`标签引用它：

``` js
<head>
    <script src="jquery-1.10.2.min.js"></script>
</head>
```

$\color{yellow}{提示：}$将下载的文件放在网页的同一目录下，就可以使用jQuery。  
&emsp;  

或者使用cdn:
&nbsp;&nbsp;&nbsp;

Staticfile CDN:

```js
<head><scriptsrc="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js"></script></head>
```

百度 CDN:

```js
<head><scriptsrc="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script></head>
```

又拍云 CDN:

```js
<head><scriptsrc="https://upcdn.b0.upaiyun.com/libs/jquery/jquery-2.0.2.min.js"></script></head>
```

新浪 CDN:

```js
<head><scriptsrc="https://lib.sinaapp.com/js/jquery/2.0.2/jquery-2.0.2.min.js"></script></head>
```

Google CDN:

```js
<head><scriptsrc="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script></head>
```

$\color{orange}{注意：}$不大推荐使用Google CDN来获取版本，因为Google产品在中国很不稳定。

Microsoft CDN:

```js
<head><scriptsrc="https://ajax.aspnetcdn.com/ajax/jquery/jquery-1.9.0.min.js"></script></head>
```

可以在浏览器的Console窗口中使用`$.fn.jquery`命令查看当前jQuery使用的版本。
一般都是1.xx版本。

### [1.2 jQuery与其它框架的冲突](#12jquery与其它框架的冲突)

jQuery选择器都使用`$`作为标识，如果其他框架需要使用$就释放$的使用权：jQuery.noConflict();
就可以使用$，否则后面的引入框架会覆盖jQuery或者它覆盖其他的框架。

或者自定义一个访问符号来取代`$`：  

```js
const 符号 = jQuery.noConflict();
```

也可以使用jQuery来取代所有的$，而不用使用jQuery.noConflict();语句。

### [1.3 jQuery的使用](#13jquery的使用)

jQuery入口函数（一共有四种方式）：

```js
$(document).ready(function(){
});

jQuery(document).ready(function(){
});

jQuery(function(){
});

$(function(){
});
```

第四种是最简单的，推荐使用。

### [1.4 jQuery入口函数与原生js函数的区别](#14jquery入口函数与原生js函数的区别)

1. jQuery 的入口函数是在html所有标签(DOM)都加载之后，就会去执行，而JavaScript的window.onload事件是等到所有内容，包括外部图片之类的文件加载完后，才会执行，其实就是ready和onload的生命周期的区别。
2. js入口函数只能有一个，即如果有两个window.onload，后一个会覆盖前一个入口函数，而jQuery允许多个入口函数，会按顺序编译。

&nbsp;  

## [第二章 基础语法](#第二章基础语法)

### [2.1 jQuery基础操作](#21jquery基础操作)

jQuery 语法是通过选取 HTML 元素，并对选取的元素执行某些操作。
基础语法： $(选择器).方法名() /jQuery(选择器).方法名()

美元符号定义 jQuery，表明使用的是jQuery库。
选择符（selector）"查询"和"查找" HTML 元素
jQuery 的 action() 执行对元素的操作

一般`$()`中的值有三种：

1. 函数：

```js
$(fuction(){
alert("你好");
})
```

2. 字符串：

可以是字符串选择器，如`let box1 = $(".box");`又或者是代码片段:  

```js
let p = $("<p>段落</p>");
console.log(p);
```

jQuery会根据相应的js片段创建相对应的DOM元素。

简单来说无论括号中的代码或字符串是什么，`$()`就代表一个DOM元素。

3. DOM元素：

可以将DOM元素传入jQuery中，使其DOM元素被包装成一个jQuery对象。

请注意jQuery是一个库，在jQuery中除了使用jQuery的`$()`方法获取元素，仍可以使用DOM的`document.getElementById`等DOM操作获取元素，不过值得关注的是他们实际上的作用一样，但是本质不一样，一个是DOM元素，一个是经过jQuery包装过的jQuery对象,在对象中保存着创建或查询到的DOM元素，所以在jQuery中定义变量和使用变量时一般原生js的元素变量都是obj的命名方式，而jQuery的元素变量命名一般是$+名字来区别类型，当然一般的元素不加也无伤大雅。

如：

```js
let span = documentl.getElementByTagName(“span”)[0];
let $span = $(span);
console.log($span);
```

### [2.2 jQuery对象](#22jquery对象)

已知使用jQuery选择的元素都将返回一个jQuery对象。
其实jQuery对象是一个伪数组，将选取的元素放到0，1，2……对应的属性下，并有length属性记录选取到元素的个数。

为什么说jQuery对象是一个伪数组，因为它长得像数组，由数字作为属性保存值，但是它是不可使用js的Array对象所拥有的方法，即jQuery对象和Array对象的__proto__所指向的原型是不同的，它并不是继承数组原型的类。

那么如何定义伪数组？首先拥有0到length-1的属性，并且具有length属性。  
如`{0:1,1:3,2:4,3:6,length=4}`

### [2.3 jQuery静态方法](#23jquery静态方法)

静态方法是构造类后添加到类上面的方法，是类独有的，不被实例继承的方法，可以也只能通过类直接调用，而实例方法就是通过类的prototype定义的（且在ES6前都无法使用访问prototype上的属性和方法），其方法在类创建的空对象上，只能通过创建类的实例，在实例上调用。因为实例可以通过__proto__链寻找到该原型从而可以使用其方法。

jQuery静态方法就是定义在jQuery对象上这个类的方法，可以通过jQuery这个类调用。

后面的一些方法是针对jQuery对象是一个伪数组无法使用原生js方法而产生的静态方法，很多方法与原生Array对象的方法类似。

#### &emsp;[2.3.1 $.each()方法](#231each方法)

`$.each(遍历对象，回调函数)`用于遍历数组，js对象，dom对象，json对象，回调函数第一个参数是遍历到的元素的索引，如果为json对象或对象属性，则此值为对应的key值或属性；第二个是遍历到的元素的值。
对应原生forEach()方法。
如：

```js
$.each(array,function(index.value){
    console.log(index,value);
});
```

`$(选择器).each(function(选择器的index位置,当前的元素（也可使用 "this" 选择器）))`可用于为符合选择器的元素绑定相应的函数。
在回调函数中可以使用return false；代表break，跳出循环，return true;代表continue，进行下一个循环。  
如：

```js
$("button").click(function(){
  $("li").each(function(){
    alert($(this).text())
  });
});
```

#### &emsp;[2.3.2 $.map()方法](#232map方法)

`$.map(遍历对象，回调函数)`用于使用指定函数处理数组或者对象中的每个元素(或对象的每个属性)，并将处理结果封装为新的jQuery对象返回。map()还会为函数传入两个参数：其一是当前迭代的元素或属性值，其二是当前迭代项的数组索引或对象属性名，当只有一个参数时默认为元素或值。与each()方法正好相反。
该函数返回值将作为结果数组中的一个元素，如果返回值为null或undefined，则不会被添加到结果数组中。  
对应原生map()方法。

循环数组，如：

```js
var arr =$.map( [4,7,20], function(value){
        return [ value, value * 2 ];
    });
$("span").text(arr.join(","));

>>>>><span>4,8,7,14,20,40</span>
```

移除元素，如：  

```js
var keys =$.map( [0, 1, 52, 97], function (a) {
        return (a > 50 ? a - 45 : null);
    });
$("span").text(keys.join(", "));

>>>>><span>7,52</span>
```

map方法与each方法的区别：

1. `$.map(array,function)`  
语法分析：为包装集中的每一个元素调用回调函数，并将返回值收集到jQuery对象的实例中，在回调函数中，this指向每次迭代中的当前DOM元素。

2. `$.each(array,function)`  
语法分析：对数组array中的每一个元素，调用function函数处理，但没有返回值（因此不管在callback里面加不加return，效果都是一样的）。
`$.each()`函数可用于迭代任何集合，无论是名/值对象（JavaScript对象）或数组。

（1）遍历数组(有附件参数)

```js
$.each(Array, function(p1, p2){
    this;    //这里的this指向每次遍历中Array的当前元素
    p1; p2;  //访问附加参数
}, ['参数1', '参数2']);
```

（2）遍历对象(没有附加参数)  

```js
$.each(Object, function(name, value) {
    this;    //this指向当前属性的值
    name;    //name表示Object当前属性的名称
    value;   //value表示Object当前属性的值
});
```

两者的区别：
map()方法主要用来遍历操作数组和对象，each()主要用于遍历jquery对象。
each()返回的是原来的数组，并不会新创建一个数组。无论有没有return语句都不会发生改变。
map()方法默认会返回一个新的数组。没有return语句就返回空数组。如果在没有必要的情况下使用map，则有可能造成内存浪费。

#### &emsp;[2.3.3 $.trim()方法](#233trim方法)

`$.trim(字符串)`用于去除字符串两端的空格，返回一个新的去掉空格的字符串。
如：

```js
$.trim("   jinjianxing  ");

>>>>>jinjianxing
```

多用于处理用户输入用户名和密码等需要去除空格的字符串。

#### &emsp;[2.3.4 $.isWindow()方法](#234iswindow方法)

`$.isWindow(对象)`用于判断传入对象是否是window对象。是就返回true，否就返回false。

#### &emsp;[2.3.5 $.isArray()方法](#235isarray方法)

`$.isArray(对象)`用于判断传入对象是否是数组对象。是就返回true，否就返回false。

#### &emsp;[2.3.6 $.isFunction()方法](#236isfunction方法)

`$.isFunction(对象)`用于判断传入对象是否是函数对象。是就返回true，否就返回false。

使用`isFunction()`方法验证，jQuery是一个函数。

#### &emsp;[2.3.7 $.holdReady()方法](#237holdready方法)

`$.holdReady(boolean)`用于暂停和回复`$.ready()`事件，当传入true就暂停，传入false就解除暂停。
我们在开发中想控制入口函数，即jQuery库的执行时间，想等图片或者其他框架加载完毕之后再执行。

如：

```js
<script>
    $.holdReady(true);
    $(document).ready (function(){
        alert("ready");
    });
</script>

</head>
<body>
<button>ready</button>
<script>
    var btn  = document.getElementsByTagName("button")[0];
    btn.onclick = function(){
        $.holdReady(false);
        alert("btn");
    }
</script>
```

### [2.4 jQuery选择器](#24jquery选择器)

jQuery选择器允许您对 HTML 元素组或单个元素进行操作。  
jQuery选择器基于元素的 id、类、类型、属性、属性值等"查找"（或选择）HTML 元素。 它基于已经存在的 CSS 选择器，除此之外，它还有一些自定义的选择器。  
jQuery 中所有选择器都以美元符号开头：`$()`。
一般是`$(选择器)`格式。  

一般css中的选择器都可以使用，jQuery还有自己的选择器。

如`$("p")`;选择所有p元素  
`$("p.intro")`;选取 class 为 intro 的 `<p>` 元素

还有独有的选择器

#### &emsp;[2.4.1 \$("*")](#241"*")

选取所有元素

#### &emsp;[2.4.2 \$(this)](#242this)

选取当前 HTML 元素

#### &emsp;[2.4.3 \$(元素名:first)](#243元素名first)

选取第一个元素。这个选择器只用于选取单个元素。使用 :first-child 选择器选取多个元素（每个父元素一个）。（这是伪类选择器）

区别：

```js
$("ul li:first") 选取第一个 <ul> 元素的第一个 <li> 元素
$("ul li:first-child") 选取每个 <ul> 元素的第一个 <li> 元素
```

#### &emsp;[2.4.4 \$(元素名:last)](#244元素名last)

选取最后一个元素。这个选择器只用于选取单个元素。使用 :last-child 选择器选取多个元素（每个父元素一个）。

#### &emsp;[2.4.5 \$([属性名])](#245\$([属性名]))

属性选择器，方括号中是要查找的属性。

`$("a[target='_blank']")`选取所有target属性值等于 "_blank" 的`<a>`元素。
`$("a[target!='_blank']")`选取所有target属性值不等于 "_blank"的`<a>`元素。

#### &emsp;[2.4.6 \$(":button")](#246":button")

选取所有 type="button" 的`<input>`元素和`<button>`元素。

#### &emsp;[2.4.7 \$(元素名:even)](#247元素名even)

选取偶数位置的元素。
如：`$("tr:even");`选取偶数位置的`<tr>`元素。

#### &emsp;[2.4.8 \$(元素名:odd)](#248元素名odd)

选取奇数位置的元素。
如：`$("tr:odd");`选取奇数位置的`<tr>`元素。

#### &emsp;[2.4.9 \$(元素名:empty)](#249元素名empty)

选取既没有文本元素也没有子元素的指定元素。

#### &emsp;[2.4.10 \$(元素名:parent)](#2410元素名parent)

选取有文本元素或者子元素的指定元素。

```js
var $div = $(div:parent);
console.log($div); //选取的就是有文本内容或者子元素的div元素。
```

#### &emsp;[2.4.11 \$(元素名:contains)](#2411元素名contains内容)

选取包含文本内容的指定元素。请注意是包含相关内容，而不是等于。  
`var $div = $(div:contains('这是文本'));//就会获取文本内容为这是文本的div元素。`

#### &emsp;[2.4.12 \$(元素名:has)](#2412元素名has内容)

选取包含相关子元素的指定元素。  
`var $div = $(div:has('span'));//将获取子元素有span元素的div元素。`

### [2.5 jQuery属性操作](#25jquery属性操作)

属性是对象上的值，而属性节点是html标签上的属性。（也就是说任何对象都有属性，但是仅有DOM元素才有属性节点）  
属性保存在DOM对象上面，如`<div>`元素等，而属性节点保存在DOM元素的attributes属性中。

#### &emsp;[2.5.1 attr()方法](#252removeattr方法)

与原生js的setAttribute()方法类似。
用来获取或者设置属性节点的值。如果传递一个参数就是获取属性节点的值，如果传递两个参数就是设置属性节点的值。  
`$(选择器).attr("属性节点名");/$(选择器).attr("属性节点名","新属性节点值");`

也可以使用函数：`$(选择器).attr(属性节点名称,function(索引,旧当前属性节点值){})`

为一个元素设定多对属性节点值：`$(选择器).attr({属性节点1:值1,属性节点2:值2 ...})`

值得注意的是如果是只有一个参数，即寻找属性节点，无论该方法找到多少个DOM元素属性节点的值都只会返回第一个属性节点的值。  
而如果是两个参数，即设定属性节点的值，那么所有符合要求的元素的属性节点的值都会被更改。如果在元素中没有找到所要找的属性节点值，则会自动新增节点。

#### &emsp;[2.5.2 removeAttr()方法](#252removeattr方法)

用来删除对应元素的属性节点与其节点值，所有的属性节点值都会被删除。  
`$(选择器).removeAttr("属性节点名");`

当你需要删除同一元素的多个属性节点时，在字符串中以逗号隔开，写入属性节点名。
`$(选择器).removeAttr("属性节点名1,属性节点名2,属性节点名3……");`

#### &emsp;[2.5.3 prop()方法](#253prop方法)

与attr()方法类似，用来设置或者获取属性值，且特性与其一致。如果传递一个参数就是获取属性的值，如果传递两个参数就是设置属性的值。  
`$(选择器).prop("属性名");/$(选择器).prop("属性名","新属性值");`

也可以使用函数：`$(选择器).prop(属性名称,function(索引,旧当前属性值){})`

为一个元素设定多对属性值：`$(选择器).attr({属性1:值1,属性2:值2 ...})`

值得注意的是如果是只有一个参数，即寻找属性，无论该方法找到多少个DOM元素属性的值都只会返回第一个属性的值。  
而如果是两个参数，即设定属性的值，那么所有符合要求的元素的属性的值都会被更改。如果在元素中没有找到所要找的属性值，则会自动新增属性。

#### &emsp;[2.5.4 removeProp()方法](#254removeprop方法)

用来删除对应元素的属性与其属性值，所有的属性都会被删除。  
`$(选择器).removeProp("属性名");`

`attr()`函数主要依赖的是Element对象的`getAttribute()`和`setAttribute()`两个方法。即其方法是针对html文档，而`prop()`函数主要依赖的则是JS中原生的对象属性获取和设置方式，即依赖DOM对象。
所以如果要操纵style、id或checked之类的HTML属性，需要使用`attr()`方法，如果是自定义属性或其他对象属性则应该使用`prop()`方法。

由于属性节点是DOM元素对象attributes属性下保存的，所以`prop()`方法也可以操纵属性节点的值。

那`attr()`方法具体和`prop()`方法有什么区别呢？就比如`<checkbox`>标签，选中attr就是checked值，而prop是true，未选中attr就是undefined值，而prop是false值。所以相对来说以布尔值判断是否选中更简单，所以官方文档中推荐在操作属性节点时，具有true和false两个属性的属性节点，如checked，selected，disabled的时候用`prop()`，而其他情况使用`attr()`。

#### &emsp;[2.5.5 addClass()方法](#255addclass方法)

添加类。  
`$(选择器).addClass("类名");`  
如果要添加多个，字符串中以逗号隔开。

#### &emsp;[2.5.6 removeClass()方法](#256removeclass方法)

删除类。  
`$(选择器).removeClass("类名");`  
如果要删除多个，字符串中以逗号隔开。

#### &emsp;[2.5.7 toggleClass()方法](#257toggleclass方法)

切换类。
`$(选择器).toggleClass("类名");`
有就删除，没有就添加
如果要切换多个，字符串中以逗号隔开。

### [2.6 jQuery文本操作](#26jquery文本操作)

#### &emsp;[2.6.1 html()方法](#261html方法)

类似于原生js的`innerHtml()`方法，将html代码传入相对应的元素中并创建相关子元素。
`$(选择器).html(代码片段);`  
如`$("div").html("<p>段落</p>");//将该代码传入div元素中。`

也可以获取相对应的元素中的代码内容。  
`$(选择器).html();`

#### &emsp;[2.6.2 text()方法](#262text方法)

类似于原生js的innerText()方法，将文本内容传入相对应的元素中，不会创建元素。  
`$(选择器).text(文本片段);`  

也可以获取相对应的元素中的文本内容。  
`$(选择器).text();`

#### &emsp;[2.6.3 val()方法](#263val方法)

设置元素的value值。  
`$(选择器).val(文本片段);`  
如：`$("input").val("默认值");`

也可以获取相对应的元素中的value值。  
`$(选择器).val();`

### [2.7 jQuery样式操作](#27jquery样式操作)

#### &emsp;[2.7.1 css()方法](#271css方法)

用于给元素添加css样式。
`$(选择器).css(样式1).css(样式2).……`  
或者：  
`$(选择器).css({样式对象})`  
也可以获取元素属性。  
`$(选择器).css("样式属性名")`  

#### &emsp;[2.7.2 width()方法](#272width方法)

用于返回或设置匹配元素的宽度。如果不设置参数，那么返回以像素计的匹配元素的宽度。  
`$(选择器).width();/$(选择器).width(length);`  
或者使用函数：  `$(选择器).width(function(索引,当前宽度){});`  
$\color{orange}{注意：}$仅返回第一个匹配元素的宽度。

#### &emsp;[2.7.3 height()方法](#273height方法)

用于返回或设置匹配元素的高度。如果不设置参数，那么返回以像素计的匹配元素的高度。  
`$(选择器).width();/$(选择器).height(length);`
或者使用函数：`$(选择器).height(function(索引,当前宽度){});`  
$\color{orange}{注意：}$仅返回第一个匹配元素的高度。

#### &emsp;[2.7.4 offset()方法](#274offset方法)

用于返回或设置匹配元素相对于文档的偏移（位置）。返回第一个匹配元素的偏移坐标。  
该方法返回的对象包含两个整型属性：top和left，以像素计。此方法只对可见元素有效。  
`$(选择器).offset();/$(选择器).offset(值);`
值可以为值对，比如 `{top:100,left:0}`，或者带有top和left属性的对象。  
或者使用函数：`$(选择器).offset(function(索引,当前偏移量){});`  
$\color{orange}{注意：}$仅返回第一个匹配元素的偏移量。

如：

```js
newPos=new Object();
newPos.left="0";
newPos.top="100";

$(document).ready(function(){
  $("button").click(function(){
    $("p").offset(newPos);
  });
});
```

#### &emsp;[2.7.5 offsetParent()方法](#275offsetparent方法)

`offsetParent()`方法返回最近的祖先定位元素。
定位元素指的是元素的CSS position属性被设置为relative、absolute或fixed的元素。  
可以通过jQuery设置position，或者通过CSS的position属性。
`$(selector).offsetParent()`;

如：

```js
$("button").click(function(){
  $("p").offsetParent().css("background-color","red");
});
```

#### &emsp;[2.7.6 position()方法](#276position方法)

返回匹配元素相对于父元素的位置（偏移）。  
该方法返回的对象包含两个整型属性：top和left，以像素计。
此方法只对可见元素有效。  
`$(选择器).position();`  
该方法是只读的，也就是说无法通过该方法修改元素的偏移量。

#### &emsp;[2.7.7 scrollLeft()方法](#277scrollleft方法)

返回或设置匹配元素的滚动条的水平位置。  
滚动条的水平位置指的是从其左侧滚动过的像素数。当滚动条位于最左侧时，位置是 0。  
这个方法也只返回第一个匹配元素的水平滚动条位置。但是可以设置所有匹配元素的水平滚动条位置。  
`$(选择器).scrollLeft();/$(选择器).scrollLeft(位置);`  
以像素为单位。

#### &emsp;[2.7.8 scrollTop()方法](#278scrolltop方法)

返回或设置匹配元素的滚动条的垂直位置。  
scroll top offset 指的是滚动条相对于其顶部的偏移。  
如果该方法未设置参数，则返回以像素计的相对滚动条顶部的偏移。  
`$(选择器).scrollTop();/$(选择器).scrollTop(位置);`  
以像素为单位。  
该方法对于可见元素和不可见元素均有效。当用于获取值时，该方法只返回第一个匹配元素的scroll top offset。当用于设置值时，该方法设置所有匹配元素的scroll top offset。

### [2.8 jQuery事件](#28jquery事件)

#### &emsp;[2.8.1 事件绑定方法](#281事件绑定方法)

1. 第一种：`$(选择器).事件名(function(){};`事件名都不用加on。  
部分事件jQuery没有实现，不能添加，且事件名会有高亮，减少错误。

2. 第二种：`$(选择器).on(事件名,function(){});`  
所有的事件都可以实现，但是事件名以字符串显示，IDE不会高亮，可能出错。

如：

```js
$("button").click(function(){ alert("hello");};
$("button").on("click",function(){alert("hello");};
```

注意的是这两个方法和原生的事件绑定方法不同，可以在同一元素上加不同类型的事件，也可以加上同一类型的不同事件，不会被覆盖。  
并且在jQuery中，如果通过核心函数找到的元素不止一个，那么绑定事件的时候jQuery会遍历所有的元素，给所有的元素都绑定相对应的事件，但在原生js中需要将得到的元素组手动遍历添加。

#### &emsp;[2.8.2 事件移除方法](#282事件移除方法)

`$(选择器).off();`  
如果不传入参数就代表移除对应元素所有事件。若是传入参数，就是移除所有该类型的事件。

#### &emsp;[2.8.3 阻止事件冒泡与默认行为](#283阻止事件冒泡和默认行为)

如果想阻止冒泡，和原生js一样，函数最后return false。或者是在函数中引入event参数，并在最后使用`event.stopPropagation()`;  
如果想阻止默认行为，可以return false，也可以引入event参数，并使用`event.preventDefault()`方法。

#### &emsp;[2.8.4 事件自动触发](#284事件自动触发)

##### &emsp;&emsp;[2.8.4.1 trigger()方法](#2841trigger方法)

`$(选择器).trigger(事件名);`  
将自动触发该元素的选择的事件。  
如：

```js
function hello (){ alert ("hello");};
$(div).click(hello());
$(div).trigger("click");
```

##### &emsp;&emsp;[2.8.4.2 triggerHandle()方法](#2842triggerhandle方法)

`$(选择器).triggerHandle(事件名);`  
将自动触发该元素的选择的事件。

trigger和triggerHandle方法的不同是，trigger会触发事件并触发事件冒泡和默认行为，而triggerHandle不会触发事件冒泡与默认行为。

注意：如果想在`<a>`标签自动触发并触发其默认行为，单纯的在`<a>`使用trigger是不能触发默认行为即跳转页面的，必须在`<a>`标签中加上子元素，把内容放在子元素中并在子元素中使用trigger方法才能自动触发事件和默认行为。
如：

```js
<a href="http://www.baidu.com" id="test"><span>click test</span></a>
$(function(){
        $("#test span").trigger("click");
    });
```

因为`<a>`标签跳转的原理是点击`<a>`标签中的内容才触发点击默认行为，才能跳转，而若如果是在`<a>`标签中加上trigger方法，就相当于触发的是`<a>`本身的点击事件，是无法跳转的。

#### &emsp;[2.8.5 自定义事件](#285自定义事件)

由于事件触发的方式的`$(选择器).事件名(function(){};`方式只能调用jQuery已经定义好的事件，所以如果我们想自定义事件就需要使用`$(选择器).on(事件名,function(){});`的方式。且必须使用trigger来触发。
如：

```js
$("div").on("myClick",function(){
    alert("这是提示");
)};
$("div").trigger("myClick");
```

#### &emsp;[2.8.6 jQuery事件命名空间](#286jquery事件命名空间)

由于同一个项目一般都是多人去完成，所以事件的命名与绑定可能会出现混淆，所以可以在事件名后加上.备注以区分事件绑定的身份，且这种事件命名空间只能通过on的事件绑定方法来使用：  
`$(选择器).on("事件名.备注名",function(){});`  
如果直接调用都是不会产生影响，如果你想调用某一个绑定的事件，可以通过：  
`$(选择器).trigger("事件名.备注名");`  
如：

```js
$(div).on("click.one",function(){ alert("点击事件1");});
$(div).on("click.two",function(){ alert("点击事件2");});
/*如果这样使用命名空间并不会有什么影响
如果想调用one*/
$(div).trigger("click.one");
```

$\color{orange}{注意：}$利用trigger触发子元素带命名空间的事件，由于trigger会发生事件冒泡和触发默认行为，所以父元素带相同命名空间的事件也会被触发，而没有相同命名空间的父元素则不会被触发。利用trigger触发子元素不带命名空间的事件，那么子元素所有相同类型的事件以及父元素相同类型的事件都会被触发。

#### &emsp;[2.8.7 事件委托](#287事件委托)

事件委托就是将一个元素需要绑定的事件绑定到另一个元素中以达到同样的效果。就是动态变为静态。
为什么需要事件委托？因为无论是原生js的事件的onload还是jQuery的事件的ready，其所有的元素和事件或属性在页面加载完成后就停止自动添加或绑定，所以需要DOM操作去一个个执行（而vue和react等框架采用了动态绑定机制，如果产生一个就改变一个，数据变化会重新渲染页面，所以不存在这种问题），为了减少一个个绑定事件的麻烦，就将相同或相似事件的方法绑定到另一个元素上（通常是父元素）通过触发其他元素来带动该元素的事件的触发。
如：

```js
<script>
    $(document).ready(function(){
        $("button").click(function(){
        $("ul").append("<li>新增的li</li>");
    });
    $("ul>li").click(function(){
        console.log($(this).html());
    });
});
</script>
<body>
    <ul>
        <li>第一个</li>
        <li>第二个</li>
        <li>第三个</li>
    </ul>
    <button>新增li</button>
</body>
```

这样的代码首先页面有三个`<li>`标签，点击`<li>`会打印其中内容，点击按钮会新增`<li>`标签，但是点击新增的`<li>`不会打印其内容，因为事件在生命周期ready的时候绑定，当时只有三个`<li>`元素，所以只会绑定这三个，后来多加的`<li>`元素是加载完毕的产生的元素，js和jQuery都不会重新渲染页面所以他们新增的`<li>`元素不会有打印的方法。  
所以需要将该方法委派给`<li>`的父元素`<ul>`，这样后面添加的`<li>`元素也能产生这样的方法，是由`<ul>`监听到`<li>`的事件。  
在原生js中可以直接将函数绑定到`<ul>`上。  

而在jQuery中可以使用delegate()方法。  
`$(监听元素).delegate("目标触发元素","事件名",function(){});`  
触发函数中的this是目标触发元素，但是点击的元素通过事件冒泡传递到监听元素，所以可以触发监听元素的方法。  
所以上面可以将事件绑定改为：  

```js
$("ul").delegate("li","click",function(){
console.log($(this.html());
});
```

---

## [回到目录](#目录)

## [查询更多](https://github.com/jinjianxing/notebooks)
