# 

&emsp;

## 目录

## 第一章[]()

## 第二章[]()

### &emsp;[]()

#### &emsp;&emsp;[]()

&emsp;

## [直达底部](#回到目录)

---

&emsp;

## [第一章 ]()

&emsp;  

## [第二章 ]()

### 

#### 

目录
第一章 HTML构建
第二章 首部标签
第三章 全局属性
第四章 文本与段落
第五章 链接与图像
第六章 表格与菜单

正文

第一章 HTML构建
HTML是描述网页的语言，即超文本标记语言(Hyper Text Markup Language)，并不是编程语言而是标记语言。文件后缀以.html和.htm，没有区别。

首先开头是声明<!DOCTYPE>表明该html是H5版本。
在html中的标签大部分都是成对出现，如果是单标签
最好以/>结尾来闭合标签，一般是没有内容的空标签。
首尾都有<html></html>标签包裹。
<head></head>标签是头标签，用于说明html文档的
格式等。
<body></body>标签提供html整体内容，给我们呈现
的样式。

第二章 首部标签
<head></head>标签保存着网站元数据。控制全局属性。
2.1head的lang属性
表明显示的语言，en就是英语，zh就是中文，可以省略不写。
格式：<element lang="语言编号">
注释：lang 属性在以下标签中无效：<base>, <br>, <frame>, <frameset>, <hr>, <iframe>, <param> 以及 <script>。
2.2<title>标签
提供标题取代整个网站的名字
2.3<meta>标签
控制整个网页元数据，仅在<head></head>标签中。
2.3.1charset属性
规定html文档字符编码，一般编码为UTF-8。
charset 属性可以通过任意元素上的 lang 属性来重写。
格式：<meta charset="编码形式">
2.3.2name属性与content属性
name属性把 content 属性关联到一个名称。，而content属性定义与 http-equiv 或 name 属性相关的元信息。
格式：<meta name="name值" content="值">
eg:<meta name="keywords" content="HTML, CSS, XML, XHTML, JavaScript">

name属性值：
① application-name	规定页面所代表的 Web 应用程序的名称。
② author	规定文档的作者的名字。实例： <meta name="author" content="Hege Refsnes">
③ description	规定页面的描述。搜索引擎会把这个描述显示在搜索结果中。
实例： <meta name="description" content="Free web tutorials">
④ generator	规定用于生成文档的一个软件包（不用于手写页面）。
实例： <meta name="generator" content="FrontPage 4.0">
⑤ keywords	规定一个逗号分隔的关键词列表 - 相关的网页（告诉搜索引擎页面是与什么相关的）。
提示：总是规定关键词（对于搜索引擎进行页面分类是必要的）。
实例： <meta name="keywords" content="HTML, meta tag, tag reference">
⑥ Copyright (版权)标注版权
实例：<meta name="copyright" content="本网站版权归CSDN所有">
⑦ Generator (编辑器)编辑器的说明
实例：<meta name="generator" content="PCDATA|FrontPage|">
注意：Content="你所用编辑器"
⑧ Revisit-after (重访)通知搜索引擎多少天访问一次
实例：<meta name="revisit-after" content="7 days" >
如果没有提供 name 属性，那么名称/值对中的名称会采用 http-equiv 属性的值。
2.3.3http-equiv属性
http-equiv 属性提供了 content 属性的信息/值的 HTTP 头。可用于模拟一个 HTTP 响应头。与content属性配合使用。

http-equiv属性值：
①content-type 规定文档的字符编码。
实例：<meta http-equiv="content-type" content="text/html; charset=UTF-8">
② default-style 规定要使用的预定义的样式表。
实例：
<meta http-equiv="default-style" content="the document's preferred stylesheet">
注释：上面 content 属性的值必须匹配同一文档中的一个 link 元素上的 title 属性的值，或者必须匹配同一文档中的一个 style 元素上的 title 属性的值。
③ refresh 定义文档自动刷新的时间间隔。
实例：<meta http-equiv="refresh" content="300">
格式<meta http-equiv="refresh" content="刷新秒数" url=”指定网址”>使该网站在指定秒数后跳转到指定网址。
注释：值 "refresh" 应该慎重使用，因为它会使得页面不受用户控制。在 W3C's Web 内容可访问性指南 中使用 "refresh" 会到导致失败。
④ expires 用于设定网页的到期时间，一旦过期则必须到服务器上重新调用。需要注意的是必须使用GMT时间格式。
实例：<meta http-equiv="Expires" contect="Mon,12 May 2001 00:20:00 GMT">
⑤ page-enter page-exit 设定进入和离开页面时的特殊效果，这个功能即FrontPage中的“格式/网页过渡”，不过所加的页面不能够是一个frame页面。Duration的值为网页动态过渡的时间，单位为秒。
Transition是过渡方式，它的值为0到23，分别对应24种过渡方式。如下表：
0 盒状收缩 1 盒状放射
2 圆形收缩 3 圆形放射
4 由下往上 5 由上往下
6 从左至右 7 从右至左
8 垂直百叶窗 9 水平百叶窗
10 水平格状百叶窗 11垂直格状百叶窗
12 随意溶解 13从左右两端向中间展开
14从中间向左右两端展开 15从上下两端向中间展开
16从中间向上下两端展开 17 从右上角向左下角展开
18 从右下角向左上角展开 19 从左上角向右下角展开
20 从左下角向右上角展开 21 水平线状展开
22 垂直线状展开 23 随机产生一种过渡方式
实例：<meta http-equiv="Page-Enter" contect="revealTrans(duration=10,transtion= 50)">
<meta http-equiv="Page-Exit" contect="revealTrans(duration=20，transtion=6)">
2.4<base>标签
<base>标签为页面上的所有链接规定默认地址或默认目标。通常情况下，浏览器会从当前文档的URL中提取相应的元素来填写相对URL中的空白。
使用<base>标签可以改变这一点。浏览器随后将不再使用当前文档的URL，而使用指定的基本URL来解析所有相对URL。这其中包括<a>、<img>、<link>、<form>标签中的URL
注意：<base>标签必须位于head元素的内部。
必须的属性
href：规定页面中所有相对链接的基准URL值是一个URL
可选的属性target ：规定在何处打开页面中所有的链接，值可以是：_blank(在新的窗口中)、_parent、_self(在当前页面)、_top、framename(在名为framename的框架中)
实例：<base href="http://www.w3school.com.cn/i/" />
2.5<link>标签
<link>标签定义文档与外部资源的关系，<link>标签最常见的用途是链接样式表， link元素是空元素，它仅包含属性，link元素只能存在于head部分，不过它可以出现任何次数。
<link rel=“stylesheet” href=“s.css”> 和外部样式表的连接。rel说明html文件和url两文档之间的关系，href说明文档名。
2.6<script>标签
<script>标签用于定义客户端脚本，比如JavaScript
script元素既可以包含脚本语句，也可以通过src属性指向外部脚本文件
必需的type属性规定脚本的MIME类型
JavaScript的常见应用时图像操作、表单验证以及动态内容更新
加入此元素内部的代码没有位于某个函数中，那么这些代码会在页面被加载时被立即执行。<frameset>标签之后的脚本会被忽略
对于那些在浏览器中禁用脚本或者其浏览器不支持客户端脚本的用户来说，noscript元素就起到很重要的作用。
2.7<style>标签
<style>…</style>可以在文档中包含风格页。文档本身的内部样式。

第三章 全局属性
3.1accescckey属性
规定激活元素（使元素获得焦点）的快捷键。
格式：<元素 accesskey="激活该元素的快捷键">
以下元素支持 accesskey 属性：<a>, <area>, <button>, <input>, <label>, <legend> 以及 <textarea>。
实例：<a href="http://www.w3school.com.cn/html/" accesskey="h">HTML</a><br />
<a href="http://www.w3school.com.cn/css/" accesskey="c">CSS</a>
3.2class属性
规定元素的一个或多个类名（引用样式表中的类）。class 属性大多数时候用于指向样式表中的类（class）。不过，也可以利用它通过 JavaScript 来改变带有指定 class 的 HTML 元素。
格式：<元素 class=“类名”>如需为一个元素规定多个类，用空格分隔类名。
class 属性不能在以下 HTML 元素中使用：base, head, html, meta, param, script, style 以及 title。
提示：可以给 HTML 元素赋予多个 class，例如：<span class="left_menu important">。这么做可以把若干个 CSS 类合并到一个 HTML 元素。
提示：类名不能以数字开头！只有 Internet Explorer 支持这种做法。
实例：<h1 class="intro">
3.3contenteditable属性
规定元素内容是否可编辑.如果元素未设置 contenteditable 属性，那么元素会从其父元素继承该属性。
格式：<元素 contenteditable="true|false">
实例：<p contenteditable="true">这是一个可编辑的段落。</p>
3.4contextmenu属性
规定 <div> 元素的上下文菜单。上下文菜单会在用户右键点击元素时出现。contextmenu 属性的值是要打开的 <menu> 元素的 id。
格式：<元素 contextmenu="菜单id">
目前只有 Firefox 支持 contextmenu 属性。
实例：<div contextmenu="mymenu">
<menu type="context" id="mymenu">
  <menuitem label="Refresh"></menuitem>
  <menuitem label="Twitter"></menuitem>
</menu>
</div>
3.5data-*属性
使用 data-* 属性来嵌入自定义数据
data-* 属性用于存储页面或应用程序的私有自定义数据。
data-* 属性赋予我们在所有 HTML 元素上嵌入自定义 data 属性的能力。
存储的（自定义）数据能够被页面的 JavaScript 中利用，以创建更好的用户体验（不进行 Ajax 调用或服务器端数据库查询）。
data-* 属性包括两部分：属性名不应该包含任何大写字母，并且在前缀 "data-" 之后必须有至少一个字符。属性值可以是任意字符串。
用户代理会完全忽略前缀为 "data-" 的自定义属性。
格式：<元素 data-*="规定属性的值（以字符串）">
实例：<ul><li data-animal-type="鸟类">喜鹊<>
<li data-animal-type="鱼类">金枪鱼<> 
<li data-animal-type="蜘蛛">蝇虎<> 
</ul>
3.6dir属性
规定元素内容的文本方向。
格式：<元素 dir="ltr|rtl">ltr：默认。从左向右的文本方向。rtl：从右向左的文本方向。
dir 属性在以下标签中无效：<base>, <br>, <frame>, <frameset>, <hr>, <iframe>, <param> 以及 <script>。
实例：<p dir="rtl">Write this text right-to-left!</p>
3.7draggable属性
规定元素是否可以拖动，连接和图像默认是可以推动。
格式：<元素 draggable="true|false|auto"> true是可以，false是不可，auto是使用默认行为。
实例：<p draggable="true">这是一个可拖动的段落。</p>
3.8dropzone属性
拖动数据会产生被拖动数据的副本，基本不支持。
格式：<元素 dropzone="copy|move|link"> copy移动会复制，move移动会使数据移动到新位置，link移动数据会产生指向原始数据的连接。
3.9hidden属性
规定元素是否应该被显示，一般为显示。
格式：<元素 hidden> 在xhtml中必须为<元素 hidden=”hidden”>
3.10id属性
规定元素唯一的id，且id不可以重复。可以用来作为连接锚或者引入CSS样式表。
格式：<元素 id=“id值”>
3.11lang属性
规定元素显示语言。
格式：<元素 lang=”语言码”>
lang 属性在以下标签中无效：<base>, <br>, <frame>, <frameset>, <hr>, <iframe>, <param> 以及 <script>。
3.12spellcheck属性
规定是否对元素进行拼写和语法检查。可以检查：input 元素中的文本值（非密码）、<textarea> 元素中的文本、可编辑元素中的文本。
格式：<元素 spellcheck=”true|false”>
实例：<p contenteditable="true" spellcheck="true">拼写检查的段落。</p>
3.13style属性
规定元素的行内样式（inline style）style 属性将覆盖任何全局的样式设定，例如在 <style> 标签或在外部样式表中规定的样式。
格式：<元素 style=”样式值”> 不同样式由分号分隔
实例：<h1 style="color:blue; text-align:center">This is a header</h1>
3.14tabindex属性
指定元素tab键顺序的链接。（当tab键用于导航时）
格式：<元素 tabindex=”顺序”> 1是第一个
以下元素支持 tabindex 属性：<a>, <area>, <button>, <input>, <object>, <select> 以及 <textarea>。
实例：<a href="http://www.w3school.com.cn/" tabindex="2">W3School</a>
<a href="http://www.google.com/" tabindex="1">Google</a>
<a href="http://www.microsoft.com/" tabindex="3">Microsoft</a>
3.15title属性
规定关于元素的额外信息。这些信息通常会在鼠标移到元素上时显示一段工具提示文本（tooltip text）。
提示：title 属性常与 form 以及 a 元素一同使用，以提供关于输入格式和链接目标的信息。同时它也是 abbr 和 acronym 元素的必需属性。
格式：<元素 title=”值”>
实例：<abbr title="People's Republic of China">PRC</abbr> was founded in 1949.
3.16tanslate属性
规定是否应该翻译此元素内容
格式：<元素 translate=”yes|no”>
基本浏览器没有实现

第四章 文本与段落
4.1<hn>标签
<h1>~<h6>定义不同大小标题，<h1>是最大的标题，<h6>是最小的标题，浏览器自动在标题前后加空行。
格式：<h1>内容</h1>
确保将 HTML 标题标签只用于标题。不要仅仅是为了生成粗体或大号的文本而使用标题。搜索引擎使用标题为您的网页的结构和内容编制索引。因为用户可以通过标题来快速浏览您的网页，所以用标题来呈现文档结构是很重要的。
应该将 h1 用作主标题（最重要的），其后是 h2（次重要的），再其次是 h3，以此类推。
4.2<p>标签
用于定义每个段落。由于<p>是块级元素，所以会在段前段后加空行。
4.3<br/>标签
换行，是单标签。
4.4<hr/>标签
<hr/> 标签在 HTML 页面中创建水平线以分割内容。
4.5<!-- -->标签
用于注释，其中的内容不会显示
格式：<!--注释-->
4.6文本格式化标签（基本以CSS替代）
4.6.1<b>标签
定义粗体文本。
4.6.2<em>标签
定义着重文字。
4.6.3<i>标签
定义斜体字。
4.6.4<small>标签
定义小号字。
4.6.5<strong>标签
定义加重语气。
4.6.6<sub>标签
定义下标字。下标文本将会显示在当前文本流中字符高度的一半为基准线的下方，但是与当前文本流中文字的字体和字号都是一样的。下标文本能用来表示化学公式，比如 H2O。
格式：<sub>下标</sub>
4.6.7<sup>标签
定义上标字。上标文本将会显示在当前文本流中字符高度的一半为基准线的上方，但是与当前文本流中文字的字体和字号都是一样的。上标文本能用来添加脚注。
格式：<sup>上标</sup>
4.6.8<ins>标签
定义插入字。字下加下划线。
cite属性：归档一个文本被插入的原因的文档的URL
Datetime属性：以YYYY-MM-DDThh:mm:ssTZD规定文本被插入的日期和时间
4.6.9<del>标签
定义删除字，字上加横杠。
cite属性：归档一个文本被删除的原因的文档的URL
Datetime属性：以YYYY-MM-DDThh:mm:ssTZD规定文本被删除的日期和时间
4.7计算机输出标签
4.7.1<code>标签
定义计算机代码文本。
4.7.2<samp>标签
定义计算机程序的样本文本。
4.7.3<var>标签
定义变量。
4.7.4<pre>标签
定义预格式化文本，被包围在<pre>标签中的文本会保留空格和换行符，文本会呈现等宽字体。
4.8定义说明与引用标签
4.8.1<abbr>标签
<abbr> 标签用来表示一个缩写词或者首字母缩略词，如"WWW"或者"NATO"。
通过对缩写词语进行标记，您就能够为浏览器、拼写检查程序、翻译系统以及搜索引擎分度器提供有用的信息。在某些浏览器中，当您把鼠标移至带有 <abbr> 标签的缩写词/首字母缩略词上时，<abbr> 标签的 title 属性可被用来展示缩写词/首字母缩略词的完整版本。
实例：The<abbr title="World Health Organization">WHO</abbr> was founded in 1948.
4.8.2<address>标签
<address> 标签定义文档作者/所有者的联系信息。
如果 <address> 元素位于 <body> 元素内部，则它表示该文档作者/所有者的联系信息。
如果 <address> 元素位于 <article> 元素内部，则它表示该文章作者/所有者的联系信息。
<address> 元素的文本通常呈现为斜体。大多数浏览器会在该元素的前后添加换行。
不应该使用 <address> 标签来描述邮政地址，除非这些信息是联系信息的组成部分。
提示：<address> 元素通常被包含在 <footer> 元素的其他信息中。
实例：<address>
Written by <a href="mailto:webmaster@example.com">Jon Doe</a>.<br> 
Visit us at:<br>
Example.com<br>
Box 564, Disneyland<br>
USA
</address>
4.8.3<bdo>标签
bdo 指的是 bidi 覆盖（Bi-Directional Override）。<bdo> 标签用来覆盖默认的文本方向。
格式：<bdo dir=”值”></bdo> 有ltr和rtl两个值。
4.8.4<blockquote>标签
<blockquote> 标签定义摘自另一个源的块引用。浏览器通常会对 <blockquote> 元素进行缩进。如果标记是不需要段落分隔的短引用，请使用 <q>。
4.8.5<q>标签
<q> 标签定义一个短的引用。浏览器经常会在这种引用的周围插入引号。
还有cite属性，用于规定引用的源URL。
4.8.6<cite>标签
定义作品（比如书籍、歌曲、电影、电视节目、绘画、雕塑等等）的标题。
4.8.7<dfn>标签
是一个短语标签，用来定义一个定义项目。

第五章 链接与图像
5.1<a>标签
用于设置超文本链接。
超链接可以是一个字，一个词，或者一组词，也可以是一幅图像，您可以点击这些内容来跳转到新的文档或者当前文档中的某个部分。当您把鼠标指针移动到网页中的某个链接上时，箭头会变为一只小手。
默认情况下，链接将以以下形式出现在浏览器中：

一个未访问过的链接显示为蓝色字体并带有下划线。
访问过的链接显示为紫色并带有下划线。
点击链接时，链接显示为红色并带有下划线。
语法：<a>链接元素（可以为文本，图片或其他元素）</a>
5.1.1href属性
href 属性描述了链接的目标。
格式：<a href="url">链接元素</a>
实例：<a href=”www.baidu.com”>百度</a>
5.1.2mailto属性
在<a>中与href配合使用
一般格式：<a href=mailto:收信人（邮箱）>send email</a>
*<form action=”mailto:收信人“></form>
参数列表： 
to	 收信人
subject	 主题
cc	 抄送
bcc	 暗送
body	 内容
实例：querystring方式：
<a href="mailto:sample@163.com?subject=test&cc=sample@hotmail.com
&body=use mailto sample">send mail</a>
*单词之间的空格使用 %20 代替，以确保浏览器可以正常显示文本
form方式：
<form name='sendmail' action='mailto:sample@163.com'>
    <input name='cc' type='text' value='sample@hotmail.com'>
    <input name='subject' type='text' value='test'>
    <input name='body' type='text' value='use mailto sample'>
</form>
5.1.3target属性
使用 target 属性，你可以定义被链接的文档在何处显示。
_self在本页面打开，覆盖原有页面（默认）
_blank在新的页面打开
_top这个目标使得文档载入包含这个超链接的窗口，用 _top 目标将会清除所有被包含的框架并将文档载入整个浏览器窗口。
_parent针对框架：这个目标使得文档载入父窗口或者包含来超链接引用的框架的框架集。如果这个引用是在窗口或者在顶级框架中，那么它与目标 _self 等效。
框架名：在指定的框架中打开被链接文档。
5.1.4id属性
可以给链接指定id，然后在别的链接的href以#id的形式指向该链接。
5.1.5name属性
与Id作用类似，也是以#name方式跳转。
5.2<img/>标签
<img> 是空标签，意思是说，它只包含属性，并且没有闭合标签。
5.2.1src属性
要在页面上显示图像，你需要使用源属性（src）。src 指 "source"。源属性的值是图像的 URL 地址。
格式：<img src=”URL地址”>
5.2.2alt属性
alt 属性用来为图像定义一串预备的可替换的文本。在浏览器无法载入图像时，替换文本属性告诉读者她们失去的信息。此时，浏览器将显示这个替代性的文本而不是图像。为页面上的图像都加上替换文本属性是个好习惯，这样有助于更好的显示信息，并且对于那些使用纯文本浏览器的人来说是非常有用的。
格式：<img alt=”注释”>
5.2.3width与height属性
设置图像高度和宽度，默认单位为像素
5.2.4float属性（一般使用CSS样式）
控制图片浮动在文字哪里。
格式：<img style=”float:right|left”>
清除浮动：<img style=”clear:both”>
5.2.5usemap属性
usemap 属性将图像定义为客户端图像映射。
图像映射指的是带有可点击区域的图像。
usemap 属性与 <map> 元素的 name 或 id 属性相关联，以建立 <img> 与 <map> 之间的关系。
格式：<img usemap=”# + 要使用的 <map> 元素的 name 或 id 属性”>
5.3<map>标签
定义一个客户端图像映射。图像映射（image-map）指带有可点击区域的一幅图像。
格式：<map id=”map标签唯一的名称” name=”image-map规定的名字”></map>
area 元素永远嵌套在 map 元素内部。area 元素可定义图像映射中的区域。
<img>中的 usemap 属性可引用 <map> 中的 id 或 name 属性（取决于浏览器），所以我们应同时向 <map> 添加 id 和 name 属性。
5.4<area>标签
<area> 标签定义图像映射内部的区域（图像映射指的是带有可点击区域的图像）。是一个单标签。最好关闭。

<area> 元素始终嵌套在 <map> 标签内部。
格式：<area></area>
5.4.1alt属性
显示图片备注。
5.4.2href属性
href 属性规定区域中连接的目标。在 HTML5 中, <area> 标签已经不再使用 href 属性， 使用 placeholder来指定链接。
5.4.3hreflang属性
用于指定被链接文档的语言。
仅在使用 href 属性时才可以指定 hreflang 属性。

5.4.4media属性
规定目标URL将显示在什么设备上。默认all
该属性使用与指定的URL显示在指定的设备上 (如 iPhone) , 音频或者打印媒介。
该attribute可以接受多个值。
仅在使用了href属性才需要media 属性。
逻辑操作符：and or ,
设备值：
all	默认 适应所有设备。
aural	语音合成器
braille	  盲文反馈设备
handheld	手持设备（小屏幕，有限的带宽）
projection	投影仪
print	打印预览模式/打印页数
screen	电脑屏幕
tty	电传打字机和类似使用固定间距字符网格的介质
tv	电视类型设备（分辨率低，滚动能力有限）
控制值：
width	指定的显示区域的宽度。
通常使用 "min-" 和 "max-" 前缀。
实例: media="screen and (min-width:500px)"
height	指定的显示区域的高度。
通常使用 "min-" 和 "max-" 前缀。
实例: media="screen and (max-height:700px)"
device-width	指定目标显示/打印纸的宽度
通常使用 "min-" 和 "max-" 前缀。
实例: media="screen and (device-width:500px)"
device-height	指定目标显示/打印纸的高度
通常使用 "min-" 和 "max-" 前缀。
实例: media="screen and (device-height:500px)"
方向	指定目标显示/纸的方向。
可能值: "portrait" 或 "landscape"
实例: media="all and (orientation: landscape)"
aspect-ratio	指定的目标的显示区域的宽度/高度比例。
通常使用 "min-" 和 "max-" 前缀。
实例: media="screen and (aspect-ratio:16/9)"
device-aspect-ratio	指定的目标的显示区域的设备宽度/设备高度比例。
通常使用 "min-" 和 "max-" 前缀。
实例: media="screen and (aspect-ratio:16/9)"
color	指定目标显示每个像素颜色的位数。
通常使用 "min-" 和 "max-" 前缀。
实例: media="screen and (color:3)"
color-index	Specifies the number of colors the target display can handle.
通常使用 "min-" 和 "max-" 前缀。
实例: media="screen and (min-color-index:256)"
monochrome	指定在一个单色的帧缓冲器的像素位数。
通常使用 "min-" 和 "max-" 前缀。
实例: media="screen and (monochrome:2)"
resolution	指定目标显示/纸的像素密度（DPI或DPCM）。
通常使用 "min-" 和 "max-" 前缀。
实例: media="print and (resolution:300dpi)"
scan	指定一个电视显示屏的扫描方法。
可能值是 "progressive" 和 "interlace".
实例: media="tv and (scan:interlace)"
grid	指定输出设备是电网或位图
grid的值为 "1", 其他的为 "0" 
实例: media="handheld and (grid:1)"
5.4.5rel属性
rel 属性规定当前文档与被链接文档之间的关系
值：
alternate	文档的替代版本（比如打印页、翻译或镜像）。
author	 链接到文档的作者。
bookmark	用于书签的永久网址
help	 链接到帮助文档
license	  链接到文档的版权信息。
next	  选项中的下一个文档
nofollow	nofollow 是一个HTML标签的属性值。这个标签的意义是告诉搜索引擎"不要追踪此网页上的链接"或"不要追踪此特定链接。
noreferrer	如果用户点击链接指定浏览不要发送 HTTP referer 头部信息。
prefetch	指定的目标文件应该被缓存
prev	选项中的前一个文档
search	 文档链接到搜索工具
tag	  当前文档的标签(关键词)
5.4.6target属性
target 属性规定区域中连接的目标。
5.4.7type属性
type 属性指定了目标 URL 的 MIME 类型。
该属性仅在 href 属性设置后才使用type属性。
格式：<area type="链接文档的 MIME 类型。"></area> MIME= Multipurpose Internet Mail Extensions。
5.4.8coords属性
规定选定区域坐标。以x，y为基准，图像左上角的坐标为0.0，与shape属性配合使用。
格式：<area cooords=”坐标”></area>
属性值：		
x1,y1,x2,y2	如果 shape 属性设置为 "rect"，则该值规定矩形左上角和右下角的坐标。
x,y,radius	如果 shape 属性设置为 "circ"，则该值规定圆心的坐标和半径。
x1,y1,..,xn,yn	如果 shape 属性设置为 "poly"，则该值规定多边形各顶点的值。如果第一个坐标和最后一个坐标不一致，那么为了关闭多边形，浏览器必须添加最后一对坐标。
5.4.9shapes属性
指定了区域的形状。
格式：<area shape="default|rect|circle|poly">
属性值：
default	规定全部区域
rect	定义矩形区域
circ	定义圆形
poly	定义多边形区域

实例：
<img src="planets.gif" alt="Planets" usemap="#planetmap" />
<map name="planetmap">
  <area href="sun.htm" shape="rect" coords="0,0,110,260">Sun</area>
  <area href="mercur.htm" shape="circle" coords="129,161,10">Mercury</area>
  <area href="venus.htm" shape="circle" coords="180,139,14">Venus</area>
</map> 

第六章 表格与菜单
6.1<table>标签（表格）
表格由 <table> 标签来定义。每个表格均有若干行（由 <tr> 标签定义），每行被分割为若干单元格（由 <td> 标签定义）。字母 td 指表格数据（table data），即数据单元格的内容。数据单元格可以包含文本、图片、列表、段落、表单、水平线、表格等等。
6.1.1border属性
border 属性规定表格单元周围是否显示边框。且只允许属性值 "" 或 "1"。（无和有）
值 "1" 指示应该显示边框，且表格不用于布局目的。
格式：<table border="1"></table>
6.1.2<th>标签
<th> 标签定义 HTML 表格中的表头单元格。
*HTML 表格有两种单元格类型：
表头单元格 - 包含头部信息（由 <th> 元素创建）
标准单元格 - 包含数据（由 <td> 元素创建）
<th> 元素中的文本通常呈现为粗体并且居中。
<td> 元素中的文本通常是普通的左对齐文本。
6.1.2.1headers属性
规定与表头单元格相关联的一个或多个表头单元格。
格式：<th headers="规定表头单元格关联的一个或多个表头单元格的 id 列表，以空格间隔。">内容</th>
6.1.2.2scope属性
规定某个表头单元格是否是列、行、列组或行组的表头。
格式：<th scope="col|row|colgroup|rowgroup">
col	规定单元格是列的表头。
row	规定单元格是行的表头。
colgroup	规定单元格是列组的表头。
rowgroup	规定单元格是行组的表头。
实例：<table border="1">
  <tr>
    <th></th>
    <th scope="col">Month</th>
    <th scope="col">Savings</th>
  </tr>
  <tr>
    <td>1</td>
    <td>January</td>
    <td>$100</td>
  </tr>
  <tr>
    <td>2</td>
    <td>February</td>
    <td>$80</td>
  </tr>
</table>
6.1.2.3colspan属性
定义表头单元格应该横跨的列数。
格式：<th colspan="规定表头单元格应该横跨的列数。注意： colspan="0" 告知浏览器使单元格横跨到列组 (colgroup) 的最后一列。目前仅firefox支持">内容</th>
6.1.2.4rowspan属性
定义表头单元格应该横跨的行数。
<th rowspan="规定表头单元格应该横跨的行数。注意： rowspan="0" 告知浏览器使单元格横跨到表格组件中的最后一个行（thead、tbody 或 tfoot）。仅firefox与opera支持">
6.1.3<tr>标签
<tr> 标签定义 HTML 表格中的行。
一个 <tr> 元素包含一个或多个 <th> 或 <td> 元素。
6.1.4<td>标签
定义 HTML 表格中的标准单元格。
6.1.4.1headers属性
规定与表格单元格相关联的一个或多个表头单元格。
6.1.4.2colspan属性
定义单元格应该横跨的列数。
6.1.4.3rowspan属性
定义单元格应该横跨的行数。
6.1.5<caption>标签
定义表格的标题。
<caption> 标签必须直接放置到 <table> 标签之后。只能对每个表格定义一个标题。
通常这个标题会被居中于表格之上。然而，CSS 属性 "text-align" 和 "caption-side" 能用来设置标题的对齐方式和显示位置。
格式：<caption>标题</caption>
6.1.6<colgroup>标签
用于对表格中的列进行组合，以便对其进行格式化。
通过使用 <colgroup> 标签，可以向整个列应用样式，而不需要重复为每个单元格或每一行设置样式。
注释：只能在 <table> 元素之内，在任何一个 <caption> 元素之后，在任何一个 <thead>、<tbody>、<tfoot>、<tr> 元素之前使用 <colgroup> 标签。
提示：如果想对 <colgroup> 中的某列定义不同的属性，请在 <colgroup> 标签内使用 <col> 标签。
6.1.6.1span属性
span 属性定义了 <colgroup> 元素应该横跨的列数。
要为 <colgroup> 内的列定义不同的属性，请在 <colgroup> 标签内使用 <col> 标签
格式：<colgroup span="列数">
实例；
<table border="1">
  <colgroup span="2" style="background:red"></colgroup>
  <tr>
    <th>ISBN</th>
    <th>Title</th>
    <th>Price</th>
  </tr>
  <tr>
    <td>3476896</td>
    <td>My first HTML</td>
    <td>$53</td>
  </tr>
  <tr>
    <td>5869207</td>
    <td>My first CSS</td>
    <td>$49</td>
  </tr>
</table>
6.1.7<col>标签
规定了 <colgroup> 元素内部的每一列的列属性。
通过使用 <col> 标签，可以向整个列应用样式，而不需要重复为每个单元格或每一行设置样式。
6.1.7.1<span>属性
规定 col 元素应该横跨的列数。
实例：<table border="1">
  <colgroup>
    <col span="2" style="background-color:red" />
    <col style="background-color:yellow" />
  </colgroup>
  <tr>
    <th>ISBN</th>
    <th>Title</th>
    <th>Price</th>
  </tr>
  <tr>
    <td>3476896</td>
    <td>My first HTML</td>
    <td>$53</td>
  </tr>
</table>
6.1.8<thead>标签
用于组合 HTML 表格的表头内容。
<thead> 元素应该与 <tbody> 和 <tfoot> 元素结合起来使用，用来规定表格的各个部分（表头、主体、页脚）。
通过使用这些元素，使浏览器有能力支持独立于表格表头和表格页脚的表格主体滚动。当包含多个页面的长的表格被打印时，表格的表头和页脚可被打印在包含表格数据的每张页面上。
<thead> 标签必须被用在以下情境中：作为 <table> 元素的子元素，出现在 <caption>、<colgroup> 元素之后，<tbody>、 <tfoot> 和 <tr> 元素之前。
<thead> 元素内部必须包含一个或者多个 <tr> 标签。
6.1.9<tbody>标签
用于组合 HTML 表格的主体内容。<tbody> 标签必须被用在以下情境中：作为 <table> 元素的子元素，出现在 <caption>、<colgroup> 和 <thead> 元素之后。<tbody> 标签必须被用在以下情境中：作为 <table> 元素的子元素，出现在 <caption>、<colgroup> 和 <thead> 元素之后。
6.1.10<tfoot>标签
用于组合 HTML 表格的页脚内容。<tfoot> 标签必须被用在以下情境中：作为 <table> 元素的子元素，出现在 <caption>、<colgroup> 和 <thead> 元素之后，<tbody> 和 <tr> 元素之前。
实例：<table border="1">
  <thead>
    <tr>
      <th>Month</th>
      <th>Savings</th>
    </tr>
  </thead>
  <tfoot>
    <tr>
      <td>Sum</td>
      <td>$180</td>
    </tr>
  </tfoot>
  <tbody>
    <tr>
      <td>January</td>
      <td>$100</td>
    </tr>
    <tr>
      <td>February</td>
      <td>$80</td>
    </tr>
  </tbody>
</table>
6.1.11cellpadding属性
cellpadding 属性规定单元边沿与其内容之间的空白。
格式：<body cellpadding="规定单元边沿与其内容之间的空白。"></body>
6.1.12cellspacing属性（H5不支持）
6.2<ul><ol>与<dl>标签（列表）
6.2.1<ul>（无序列表）
<ul> 标签定义无序列表。前面仅有图案。
将 <ul> 标签与 <li> 标签一起使用，创建无序列表。
实例:<ul>
<li>Coffee</li>
<li>Tea</li>
<li>Milk</li>
</ul>
6.2.2<ol>（有序列表）
<ol> 标签定义了一个有序列表. 列表排序以数字来显示。
使用<li> 标签来定义列表选项
6.2.2.1reversed属性
reversed 属性是一个布尔属性。
reversed 属性规定列表顺序为降序 (9, 8, 7...)，而不是升序 (1, 2, 3...)。
格式：<ol reversed="reversed"></ol>
目前只有 Chrome 和 Safari 6 支持 reversed 属性
实例：
<ol reversed>
<li>Coffee</li>
<li>Tea</li>
<li>Milk</li>
</ol>
6.2.3<dl>（自定义列表）
<dl> 标签定义一个描述列表。
<dl> 标签与 <dt> （定义项目/名字）和 <dd> （描述每一个项目/名字）一起使用。
实例：
<dl>
  <dt>Coffee</dt>
    <dd>Black hot drink</dd>
  <dt>Milk</dt>
    <dd>White cold drink</dd>
</dl>
6.3<select>标签（下拉选框）
<select> 元素用来创建下拉列表。
<select> 元素中的 <option> 标签定义了列表中的可用选项。
<select> 元素是一种表单控件，可用于在表单中接受用户输入。
实例：<select>
<option value="volvo">Volvo</option>
<option value="saab">Saab</option>
<option value="mercedes">Mercedes</option>
<option value="audi">Audi</option>
</select>
6.3.1<option>标签
The <option> 标签定义下拉列表中的一个选项（一个条目）。
<option> 标签中的内容作为 <select> 或者<datalist> 一个元素使用。
<option> 标签可以在不带有任何属性的情况下使用，但是您通常需要使用 value 属性，此属性会指示出被送往服务器的内容。
6.3.1.1disabled属性
disabled 属性是一个布尔属性。
disabled 属性规定某个选项应该被禁用。
被禁用的选项既不可用，也不可点击。
可以设置 disabled 属性，直到满足某些条件（比如选择一个复选框），才恢复用户对该选项的使用。然后，可以使用 JavaScript 来清除 disabled 属性，以使选项变为可用状态。格式：<option disabled="disabled">内容</option>
6.3.1.2label属性
label 属性规定更短版本的选项。下拉列表中会显示出所规定的更短版本。原来在<option></option>标签中的文本就失效了。
格式：<option label="选项的更短的版本。">内容</option>
除了 Firefox，其他主流浏览器都支持 label 属性。
实例：
<select>
<option label="Volvo">Volvo (Latin for "I roll")</option>
<option label="Saab">Saab (Swedish Aeroplane AB)</option>
<option label="Mercedes">Mercedes (Mercedes-Benz)</option>
<option label="Audi">Audi (Auto Union Deutschland Ingolstadt)</option>
</select>
6.3.1.3selected属性
规定在页面加载时预先选定该选项。即默认选项。selected 属性是一个布尔属性。
被预选的选项会显示在下拉列表最前面的位置。
格式：<option selected="selected">内容</option>
6.3.1.4value属性
value 属性规定在表单被提交时被发送到服务器的值。
开始标签 <option> 与结束标签 </option> 之间的内容是浏览器显示在下拉列表中的内容，而 value 属性中的值是表单提交时被发送到服务器的值。
注意：如果没有规定 value 属性，选项的值将设置为 <option> 标签中的内容。
格式：<option value=”传送值”>选项</option>
6.3.2<optgroup>标签
<optgroup> 标签经常用于把相关的选项组合在一起。
如果你有很多的选项组合, 你可以使用<optgroup> 标签能够很简单的将相关选项组合在一起。
格式：<optgroup>
<option>
</option>
</optgdroup>
6.3.2.1disabled属性
disabled 属性是一个布尔属性。disabled 属性规定选项组应该被禁用。被禁用的选项组既不可用，也不可点击。
可以设置 disabled 属性，直到满足某些条件（比如选择一个复选框），才恢复用户对该选项组的使用。然后，可以使用 JavaScript 来移除 disabled 属性的值，以使选项组变为可用状态。
格式：<optgroup disabled="disabled"></optgroup>
实例：
<select>
<optgroup label="German Cars" disabled>  <!--该组下的所有选项都不可选-->
<option value="mercedes">Mercedes</option>
<option value="audi">Audi</option>
</optgroup>
</select>
6.3.2.2label属性
label 属性为选项组规定描述标签。该描述不可选，仅仅是作为描述作用。
格式：<optgroup label=”标签名”></optgroup>
6.3.3autofocus属性
autofocus 属性是一个布尔属性。
autofocus 属性规定下拉列表在页面加载时自动获得焦点。就是打开页面时默认选择该下拉选框。（选框默认变蓝）
格式：<select autofocus="autofocus"></select>
Internet Explorer 10、Opera、Chrome 和 Safari 支持 autofocus 属性。
6.3.4disabled属性
disabled 属性是一个布尔属性。
disabled 属性规定下拉列表应该被禁用。
被禁用的下拉列表既不可用，也不可点击。
可以设置 disabled 属性，直到满足某些条件（比如选择一个复选框），才恢复用户对该下拉列表的使用。然后，可以使用 JavaScript 来移除 disabled 属性的值，以使下拉列表变为可用状态。
格式：<select disabled="disabled"></select>
6.3.5form属性
规定下拉列表所属的一个或多个表单。将下拉列表与一些表单相连，一同传输数据。
格式：<select form="规定下拉列表所属的一个或多个表单的 id 列表，以空格分隔。">
Firefox、Opera、Chrome 和 Safari 支持 form 属性。
实例：
<form action="http://w3schools.com/tags/demo_form.asp" id="carform">
  Firstname:<input type="text" name="fname">
  <input type="submit">
</form>
<br>
<select name="carlist" form="carform">
  <option value="volvo">Volvo</option>
  <option value="saab">Saab</option>
  <option value="opel">Opel</option>
  <option value="audi">Audi</option>
</select>
<p>下拉列表超出了表单元素,但仍是表单的一部分。</p>
6.3.6multiple属性
规定可同时选择多个选项。multiple 属性是一个布尔属性。
在不同操作系统和浏览器中，选择多个选项的差异：
对于 windows：按住 Ctrl 按钮来选择多个选项
对于 Mac：按住 command 按钮来选择多个选项
由于上述差异的存在，同时由于需要告知用户可以使用多项选择，对用户更友好的方式是使用复选框。
格式：<select multiple="multiple"></select>
实例：<select multiple="multiple">
  <option value ="volvo">Volvo</option>
  <option value ="saab">Saab</option>
  <option value="opel">Opel</option>
  <option value="audi">Audi</option>
</select>
6.3.7name属性
name 属性规定 select 元素的名称。用于对提交到服务器后的表单数据进行标识，或者在客户端通过 JavaScript 引用表单数据。
格式：<select name="下拉列表的名称">



6.4<textarea>标签（文本域）

6.5<form>标签（表单）

6.6<button>标签（按钮）



---

## [回到目录](#目录) &emsp; &emsp;[查询更多](https://github.com/Didnelpsun/notes)

### 参考

1. 
