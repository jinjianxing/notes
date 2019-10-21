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
第一章 Flask安装与配置
第二章 Flask基本结构
第三章 Vue构造
第四章 循环结构
第五章 数组
第六章 函数
第七章 指针

正文

第一章 Flask安装与配置
Pipenv是基于pip的Python包管理工具，它和pip的用法非常相似，可以看作pip的加强版。下载Pipenv：pip install pipenv，然后查看：pipenv --version
虚拟环境通常使用Virtualenv来创建，但是为了更方便地管理虚拟环境和依赖包，我们将会使用集成了Virtualenv的Pipenv。首先确保我们当前工作目录在示例程序项目的根目录，即helloflask文件夹中，然后使用pipenv install命令为当前的项目创建虚拟环境。
这会为当前项目创建一个文件夹，其中包含隔离的Python解释器环境，并且安装pip、wheel、setuptools等基本的包。因为示例程序仓库里包含Pipfile文件，所以这个文件中列出的依赖包也会一并被安装。
默认情况下，Pipenv会统一管理所有虚拟环境。在Windows系统中，虚拟环境文件夹会在C：\Users\Administrator\.virtualenvs\目录下创建。
在单独使用Virtualenv时，我们通常会显式地激活虚拟环境。在Pipenv中，可以使用pipenv shell命令显式地激活虚拟环境。
Pipenv会启动一个激活虚拟环境的子shell，现在你会发现命令行提示符前添加了虚拟环境名“（虚拟环境名称）$”，比如：(helloflask-5Pa0ZfZw) $这说明我们已经成功激活了虚拟环境，现在你的所有命令都会在虚拟环境中执行。当你需要退出虚拟环境时，使用exit命令。
Pipenv还提供了一个pipenv run命令，这个命令允许你不显式激活虚拟环境即可在当前项目的虚拟环境中执行命令，比如：$ pipenv run python hello.py
这会使用虚拟环境中的Python解释器，而不是全局的Python解释器。
使用pipenv install命令在我们刚刚创建的虚拟环境里安装Flask。
一般会伴随下载五个包：Jinja2：模板渲染引擎  MarkupSafe：HTML字符转义工具  Werkzeug：WSGI工具集，处理请求与响应，内置WSGI开发服务器、调试器与重载器。  click：命令行工具  itsdangerous：提供各种加密签名功能。
pipenv update flask更新flask。 

第二章 Flask基本结构
2.1Flask类
通过flask包的构造文件导入所有开放的类和函数。
首先从flask包导入Flask类，表示一个Flask程序。实例化这个类就得到实例程序app:
from flask import Flask
app = Flask(__name__)
传入 Flask类构造方法的第一个参数是模块或者包的名称，确定资源的路径，应该使用特殊变量__name__。Python会格局所处模块给__name__变量相应的值，对于程序来说，其值就是app。除此之外，这也会帮助Flask在相应的文件夹里找到需要的资源，比如模板和静态文件。
*Flask类是Flask的核心类，它提供了很多与程序相关的属性和方法。在后面，我们经常会直接在程序实例app上调用这些属性和方法来实现相关功能。在第一次提及Flask类中的某个方法或属性时，我们会直接以实例方法/属性的形式写出，比如存储程序名称的属性为app.name。
2.2路由与视图函数
在一个Web应用里，客户端和服务器上的Flask程序的交互可以简单概括为以下几步：1）用户在浏览器输入URL访问某个资源。2）Flask接收用户请求并分析请求的URL。3）为这个URL找到对应的处理函数。4）执行函数并生成响应，返回给浏览器。5）浏览器接收并解析响应，将信息显示在页面中。
在上面这些步骤中，大部分都由Flask完成，我们要做的只是建立处理请求的函数，并为其定义对应的URL规则。只需为函数附加app.route（）装饰器，并传入URL规则作为参数，我们就可以让URL与函数建立关联。这个过程我们称为注册路由（route），路由负责管理URL和函数之间的映射，而这个函数则被称为视图函数（view function）。
app.route（）装饰器把根地址/和index（）函数绑定起来，当用户访问这个URL时就会触发index（）函数。这个视图函数可以像其他普通函数一样执行任意操作，比如从数据库中获取信息，获取请求信息，对用户输入的数据进行计算和处理等。最后，视图函数返回的值将作为响应的主体，一般来说，响应的主体就是呈现在浏览器窗口的HTML页面。
实例：
@app.route('/')
def index():  # 定义主函数以def，函数以：包含内容
return '<h1>Hello, World!</h1>'  #return语句可以返回数值和字符串和HTML语句，但是要以引号括起来。

route（）装饰器的第一个参数是URL规则，用字符串表示，必须以斜杠（/）开始。这里的URL是相对URL（又称为内部URL），即不包含域名的URL。以域名www.helloflask.com为例，“/”对应的是根地址（即www.helloflask.com），如果把URL规则改为“/hello”，则实际的绝对地址（外部地址）是www.helloflask.com/hello。
2.2.1多URL
一个视图函数可以绑定多个URL，比如下面的代码把/hi和/hello都绑定到say_hello（）函数上，这就会为say_hello视图注册两个路由，用户访问这两个URL均会触发say_hello（）函数，获得相同的响应
实例：
hello/app.py：绑定多个URL到同一视图函数
@app.route('/hi')
@app.route('/hello')
def say_hello():
return '<h1>Hello, Flask!</h1>'
2.2.2动态URL
可以在URL规则中添加变量部分，使用“<变量名>”的形式表示。Flask处理请求时会把变量传入视图函数，所以我们可以添加参数获取这个变量值。
实例：
@app.route('/greet/<name>')
def greet(name):  # 要使用该值必须先在视图函数中导入该变量值。
return '<h1>Hello, %s!</h1>' % name  #  %s是与c语言类似的格式输入输出语法，在引号中加入%和格式控制符，在引号外加入% 和相应变量。

因为URL中可以包含变量，所以我们将传入app.route（）的字符串称为URL规则，而不是URL。Flask会解析请求并把请求的URL与视图函数的URL规则进行匹配。比如，这个greet视图的URL规则为/greet/<name>，那么类似/greet/foo、/greet/bar的请求都会触发这个视图函数。

当URL规则中包含变量时，如果用户访问的URL中没有添加变量，比如/greet，那么Flask在匹配失败后会返回一个404错误响应。一个很常见的行为是在app.route（）装饰器里使用defaults参数设置URL变量的默认值，这个参数接收字典作为输入，存储URL变量和默认值的映射。在下面的代码中，我们为greet视图新添加了一个app.route（）装饰器，为/greet设置了默认的name值：
@app.route('/greet', defaults={'name': 'Programmer'})  # 如果仅有前面的没有斜杠那么启动该函数，使用默认值
@app.route('/greet/<name>')  # 当greet后仅有一斜杠也不会报错，只是将空字符串传入函数中。
def greet(name):
return '<h1>Hello, %s!</h1>' % name
2.3启动项目
2.3.1使用flask run
Flask通过依赖包Click内置了一个CLI（Command Line Interface，命令行交互界面）系统。当我们安装Flask后，会自动添加一个flask命令脚本，我们可以通过flask命令执行内置命令、扩展提供的命令或是我们自己定义的命令。其中，flask run命令用来启动内置的开发服务器。确保执行命令前激活了虚拟环境（pipenv shell），否则需要使用
pipenv run flask run命令启动开发服务器。
*（以执行flask--help查看所有可用的命令，如果执行flask run命令后显示命令未找到提示（command notfound）或其他错误，可以尝试使用python-m flask run启动服务器，其他命令亦同。）
默认监听http://127.0.0.1:5000/即localhost，指向本地机的IP地址。Flask默认使用5000端口。也可以使用http://localhost:5000/

使用flask run命令后，Flask可以自动探测程序实例，具有以下规则：
从当前目录寻找app.py和wsgi.py模块，并从中寻找名为app或application的程序实例。
·从环境变量FLASK_APP对应的值寻找名为app或application的程序实例。
因为我们的程序主模块命名为app.py，所以flask run命令会自动在其中寻找程序实例。如果你的程序主模块是其他名称，比如hello.py，那么需要设置环境变量FLASK_APP，将包含程序实例的模块名赋值给这个变量。
在Windows系统中使用set命令：
> set FLASK_APP=hello

如果安装了python-dotenv，那么在使用flask run或其他命令时会使用它自动从.flaskenv文件和.env文件中加载环境变量。
*附注
当安装了python-dotenv时，Flask在加载环境变量的优先级是：手动设置的环境变量>.env中设置的环境变量>.flaskenv设置的环境变量。除了FLASK_APP，在后面我们还会用到其他环境变量。环境变量在新创建命令行窗口或重启电脑后就清除了，每次都要重设变量有些麻
烦。而且如果你同时开发多个Flask程序，这个FLASK_APP就需要在不同的值之间切换。为了避免频繁设置环境变量，我们可以使用pythondotenv管理项目的环境变量，首先使用Pipenv将它安装到虚拟环境：
$ pipenv install python-dotenv
我们在项目根目录下分别创建两个文件：.env和.flaskenv。.flaskenv用来存储和Flask相关的公开环境变量，比如FLASK_APP；而.env用来存储包含敏感信息的环境变量，比如后面我们会用来配置Email服务器的账户名与密码。在.flaskenv或.env文件中，环境变量使用键值对的形式定义，每行一个，以#开头的为注释，如下所示：
SOME_VAR=1
# 这是注释
FOO="BAR"
注意
.env包含敏感信息，除非是私有项目，否则绝对不能提交到Git仓库中。当你开发一个新项目时，记得把它的名称添加到.gitignore文件中，这会告诉Git忽略这个文件。gitignore文件是一个名为.gitignore的文本文件，它存储了项目中Git提交时的忽略文件规则清单。Python项目的.gitignore模板可以参考https://github.com/github/gitignore/blob/
master/Python.gitignore。使用PyCharm编写程序时会产生一些配置文件，这些文件保存在项目根目录下的.idea目录下，关于这些文件的忽略设置可以参考https://www.gitignore.io/api/pycharm。
2.3.2使用app run
if __name__ =="__main__":
app.run()

python文件有两种使用的方法：
1、直接作为脚本执行，
这时一般用来测试程序
2、import到其他的python脚本中被调用（模块重用）执行。
if __name__ == '__main__': 的作用就是控制这两种情况执行代码的过程，在 if __name__ == 'main': 下的代码只有在第一种情况下（即文件作为脚本直接执行）才会被执行，而import到其他脚本中是不会被执行的。
每个python模块（python文件）都包含内置的变量__name__，
当运行模块被直接执行的时候，__name__等于文件名即__main__（包含了后缀.py）；
如果import到其他模块中，则__name__等于模块名称（不包含后缀.py）。
而“__main__”等于当前执行文件的名称（包含了后缀.py），进而当模块被直接执行时，__name__ == '__main__'结果为真。
实例：test.py:
print "I'm the first."
if __name__=="__main__":
     print "I'm the second."
执行：=>
I’m the first.
I’m the second 
在同一文件夹新建import_test.py的脚本：
Import test  # 引入test作为库
运行该文件：=>
I’m the first.
只输入了第一行字符串，即__name__=”__main__”不成立，后面的语句被省略了。

运行app.run()表示监听指定的端口, 对收到的request运行app生成response并返回。
2.3.3使服务器外部可见
一般WEB服务器默认对外使不可见的，可以使用flask run --host=0.0.0.0将主机地址设为0.0.0.0使其对外可见，使服务器监听所有外部请求。或者使用app.run(host=0.0.0.0)来可见，运行后再在URL中改为地址：127.0.0.0.1。
个人计算机一般没有公网IP（公有地址），所以你的程序只能被局域网内的其他用户通过你的个人计算机的内网IP（私有地址）访问，比如你的内网IP为192.168.191.1。当局域网内的其他用户访问http://192.168.191.1:5000时，也会看到浏览器里显示一行“Hello，Flask！”。
2.3.4改变端口号
Flask提供的Web服务器默认监听5000端口，你可以在启动时传入参数来改变它：
$ flask run --port=8000
这时服务器会监听来自8000端口的请求，程序的主页地址也相应变
成了http://localhost:8000/。
2.4设置运行环境
开发环境是指我们在本地编写和测试程序时的计算机环境
生产环境与开发环境相对，它指的是网站部署上线供用户访问时的服务器环境。

根据运行环境的不同，Flask程序、扩展以及其他程序会改变相应的行为和设置。为了区分程序运行环境，Flask提供了一个FLASK_ENV环境变量用来设置环境，默认为production（生产）。在开发时，我们可以将其设为development（开发），这会开启所有支持开发的特性。为了方便管理，我们将把环境变量FLASK_ENV的值写入.flaskenv文件中：
FLASK_ENV=development

在开发环境下，调试模式（Debug Mode）将被开启，这时执行flaskrun启动程序会自动激活Werkzeug内置的调试器（debugger）和重载器（reloader），它们会为开发带来很大的帮助。
如果你想单独控制调试模式的开关，可以通过FLASK_DEBUG环境变量设置，设为1则开启，设为0则关闭

*在生产环境中部署程序时，绝不能开启调试模式。尽管PIN码可以避免用户任意执行代码，提高攻击者利用调试器的难度，但并不能确保调试器完全安全，会带来巨大的安全隐患。而且攻击者可能会通过调试信息获取你的数据库结构等容易带来安全问题的信息。另一方面，调试界面显示的错误信息也会让普通用户感到困惑。

1.调试器
Werkzeug提供的调试器非常强大，当程序出错时，我们可以在网页上看到详细的错误追踪信息，这在调试错误时非常有用。调试器允许你在错误页面上执行Python代码。单击错误信息右侧的命令行图标，会弹出窗口要求输入PIN码，也就是在启动服务器时命令行窗口打印出的调试器PIN码（Debugger PIN）。输入PIN码后，我们可以单击错误堆栈的某个节点右侧的命令行界面图标，这会打开一个包含代码执行上下文信息的Python Shell，我们可以利用它来进行调试。
2.重载器
当我们对代码做了修改后，期望的行为是这些改动立刻作用到程序上。重载器的作用就是监测文件变动，然后重新启动开发服务器。当我们修改了脚本内容并保存后，会在命令行看到下面的输出：
Detected change in '/path/to/app.py', reloading
* Restarting with stat

默认会使用Werkzeug内置的stat重载器，它的缺点是耗电较严重，而且准确性一般。为了获得更优秀的体验，我们可以安装另一个用于监测文件变动的Python库Watchdog：
pipenv install watchdog --dev
因为这个包只在开发时才会用到，所以我们在安装命令后添加了一个--dev选项，这用来把这个包声明为开发依赖。在Pipfile文件中，这个包会被添加到dev-packages部分。
不过，如果项目中使用了单独的CSS或JavaScript文件时，那么浏览器可能会缓存这些文件，从而导致对文件做出的修改不能立刻生效。在浏览器中，我们可以按下Crtl+F5或Shift+F5执行硬重载（hard reload），即忽略缓存并重载（刷新）页面。当在一个新电脑创建运行环境时，使用pipenv install命令时需要添加额外的--dev选项才会安装dev-packages部分定义的开发依赖包。

上下文（context）可以理解为环境。为了正常运行程序，一些操作相关的状态和数据需要被临时保存下来，这些状态和数据被统称为上下文。
2.5Flask扩展
扩展（extension）即使用Flask提供的API接口编写的Python库，可以为Flask程序添加各种各样的功能。大部分Flask扩展用来集成其他库，作为Flask和其他库之间的薄薄一层胶水。因为Flask扩展的编写有一些约定，所以初始化的过程大致相似。大部分扩展都会提供一个扩展类，实例化这个类，并传入我们创建的程序实例app作为参数，即可完成初始化过程。通常，扩展会在传入的程序实例上注册一些处理函数，并加载一些配置。以某扩展实现了Foo功能为例，这个扩展的名称将是Flask-Foo或Foo-Flask；程序包或模块的命名使用小写加下划线，即flask_foo（即导入时的名称）；用于初始化的类一般为Foo，实例化的类实例一般使用小写，即foo。
2.6项目配置（app.config)
配置变量都通过Flask对象的app.config属性作为统一的接口来设置和获取，它指向的Config类实际上是字典的子类，所以你可以像操作其他字典一样操作它。
配置的名称必须是全大写形式，小写的变量将不会被读取。
使用update（）方法则可以一次加载多个值：
app.config.update(
TESTING=True,
SECRET_KEY='_5#yF4Q8z\n\xec]/'
)
还可以把配置变量存储在单独的Python脚本、JSON格式的文件或是Python类中，config对象提供了相应的方法来导入配置，具体我们会在后面了解。
和操作字典一样，读取一个配置就是从config字典里通过将配置变量的名称作为键读取对应的值：
value = app.config['ADMIN_NAME']
2.7URL与端点（url_for()）
使用Flask提供的url_for（）函数获取URL，当路由中定义的URL规则被修改时，这个函数总会返回正确的URL。
一种是接函数名，一种是接静态文件名。
2.7.1转到路由
调用url_for（）函数时，第一个参数为端点（endpoint）值。在Flask中，端点用来标记一个视图函数以及对应的URL规则。端点的默认值为视图函数的名称。
实例：
@app.route('/')
def index():
return 'Hello Flask!'
这个路由的端点即视图函数的名称index，调用url_for（'index'）即可获取对应的URL，即“/”
在app.route（）装饰器中使用endpoint参数可以自定义端点值。
如果URL含有动态部分，那么我们需要在url_for（）函数里传入相应的参数
实例：
@app.route('/hello/<name>')
def greet(name):
return 'Hello %s!' % name
这时使用url_for（'greet'，name='Jack'）得到的URL为“/hello/Jack”。
我们使用url_for（）函数生成的URL是相对URL（即内部URL），即URL中的path部分，比如“/hello”，不包含根URL。相对URL只能在程序内部使用。如果你想要生成供外部使用的绝对URL，可以在使用url_for（）函数时，将_external参数设为True，这会生成完整的URL。实例：
url_for('index', _external=True) 
使用url_for() 生成动态地址时， 将动态部分作为关键字参数传入。例如，url_for
('user', name='john', _external=True) 的返回结果是http://localhost:5000/user/john。
传入url_for() 的关键字参数不仅限于动态路由中的参数。函数能将任何额外参数添加到
查询字符串中。例如，url_for('index', page=2) 的返回结果是/?page=2。
2.7.2转到静态文件
还可以用作加载静态文件，如
<link rel="stylesheet" href="{{url_for('static',filename='css/index.css')}}">
该条语句就是在模版中加载css静态文件.
| url rule | endpoint | view_function |<---------对应关系-------->| /static | static | Flask.send_static_file
它的默认URL规则为/static/<path：filename>，URL变量filename是相对于static文件夹根目录的文件路径。
如果静态文件不是放在static中，你可以自定义路径来访问他
实例：将应用下的assets文件夹注册为静态目录/assets：
app = Flask(name,static_folder='assets',static_url_path='/assets')
2.8Flask命令
通过创建任意一个函数，并为其添加app.cli.command（）装饰器，我们就可以注册一个flask命令。
hello()命令函数：
@app.cli.command()
def hello():
click.echo('Hello, Human!')
函数的名称即为命令名称，这里注册的命令即hello，你可以使用flask hello命令来触发函数。作为替代，你也可以在app.cli.command（）装饰器中传入参数来设置命令名称，比如app.cli.command（'say-hello'）会把命令名称设置为say-hello，完整的命令即flask say-hello。
借助click模块的echo（）函数，我们可以在命令行界面输出字符。命令函数的文档字符串则会作为帮助信息显示（flask hello--help）。在命令行下执行flask hello命令就会触发这个hello（）函数：
$ flask hello
Hello, Human!
2.9模板与静态文件
模板即包含程序页面的HTML文件，静态文件则是需要在HTML文件中加载的CSS和JavaScript文件，以及图片、字体文件等资源文件。默认情况下，模板文件存放在项目根目录中的templates文件夹中，静态文件存放在static文件夹下，这两个文件夹需要和包含程序实例的模块处于同一个目录下，对应的项目结构示例如下所示：
hello/
- templates/
- static/
- app.py
2.10MVC框架
MVC架构最初是用来设计桌面程序的，后来也被用于Web程序，应用了这种架构的Web框架有Django、Ruby on Rails等。在MVC架构中，
程序被分为三个组件：数据处理（Model）、用户界面（View）、交互逻辑（Controller）。如果套用MVC架构的内容，那么Flask中视图函数的名称其实并不严谨，使用控制器函数（Controller Function）似乎更合适些，虽然它也附带处理用户界面。严格来说，Flask并不是MVC架构的框架，因为它没有内置数据模型支持。
在Flask中，视图函数可以作为控制器（Controller），视图（View）则是使用Jinja2渲染的HTML模板，而模型（Model）可以使用其他库来实现，如使用SQLAlchemy来创建数据库模型。

第三章 HTTP
3.1HTTP工作原理
HTTP（Hypertext Transfer Protocol，超文本传输协议）定义了服务器和客户端之间信息交流的格式和传递方式，它是万维网（World Wide Web）中数据交换的基础。
*WSGI的全称是Web Server Gateway Interface，翻译过来就是Web服务器网关接口。 具体的来说，WSGI是一个规范，定义了Web服务器如何与Python应用程序进行交互，使得使用Python写的Web应用程序可以和Web服务器对接起来。
当用户访问一个URL，浏览器便生成对应的HTTP请求，经由互联网发送到对应的Web服务器。Web服务器接收请求，通过WSGI将HTTP格式的请求数据转换成我们的Flask程序能够使用的Python数据。在程序中，Flask根据请求的URL执行对应的视图函数，获取返回值生成响应。响应依次经过WSGI转换生成HTTP响应，再经由Web服务器传递，最终被发出请求的客户端接收。浏览器渲染响应中包含的HTML和CSS代码，并执行JavaScript代码，最终把解析后的页面呈现在用户浏览器的窗口中。
3.2HTTP请求
比如http://helloflask.com/hello?name=Grey
URL分为三部分①http://协议字符串，指定要使用的协议②helloflask.com服务器的地址（域名）③/hello?Name=Gray要获取的资源路径，类似UNIX的文件目录结构。
URL后面的?Name=Grey部分是查询字符串，用来向指定的资源传递参数，从?开始，以键值对的形式写出，多个键值对之间以&分隔。
3.2.1请求报文
当我们在浏览器中访问这个URL时，随之产生的是一个发向http://helloflask.com所在服务器的请求。请求的实质是发送到服务器上的一些数据，这种浏览器与服务器之间交互的数据被称为报文（message），请求时浏览器发送的数据被称为请求报文（request message），而服务器返回的数据被称为响应报文（response message）。
一个HTTP请求报文由请求行（request line）、请求头部（header）、空行和请求数据4个部分组成





3.2HTTP状态码



当浏览者访问一个网页时，浏览者的浏览器会向网页所在服务器发出请求。当浏览器接收并显示网页前，此网页所在的服务器会返回一个包含HTTP状态码的信息头（server header）用以响应浏览器的请求。

HTTP状态码的英文为HTTP Status Code。

下面是常见的HTTP状态码：

200 - 请求成功
301 - 资源（网页等）被永久转移到其它URL
404 - 请求的资源（网页等）不存在
500 - 内部服务器错误
HTTP状态码分类
HTTP状态码由三个十进制数字组成，第一个十进制数字定义了状态码的类型，后两个数字没有分类的作用。HTTP状态码共分为5种类型：

HTTP状态码分类
分类	分类描述
1**	信息，服务器收到请求，需要请求者继续执行操作
2**	成功，操作被成功接收并处理
3**	重定向，需要进一步的操作以完成请求
4**	客户端错误，请求包含语法错误或无法完成请求
5**	服务器错误，服务器在处理请求的过程中发生了错误
HTTP状态码列表:

HTTP状态码列表
状态码	状态码英文名称	中文描述
100	Continue	继续。客户端应继续其请求
101	Switching Protocols	切换协议。服务器根据客户端的请求切换协议。只能切换到更高级的协议，例如，切换到HTTP的新版本协议
200	OK	请求成功。一般用于GET与POST请求
201	Created	已创建。成功请求并创建了新的资源
202	Accepted	已接受。已经接受请求，但未处理完成
203	Non-Authoritative Information	非授权信息。请求成功。但返回的meta信息不在原始的服务器，而是一个副本
204	No Content	无内容。服务器成功处理，但未返回内容。在未更新网页的情况下，可确保浏览器继续显示当前文档
205	Reset Content	重置内容。服务器处理成功，用户终端（例如：浏览器）应重置文档视图。可通过此返回码清除浏览器的表单域
206	Partial Content	部分内容。服务器成功处理了部分GET请求
300	Multiple Choices	多种选择。请求的资源可包括多个位置，相应可返回一个资源特征与地址的列表用于用户终端（例如：浏览器）选择
301	Moved Permanently	永久移动。请求的资源已被永久的移动到新URI，返回信息会包括新的URI，浏览器会自动定向到新URI。今后任何新的请求都应使用新的URI代替
302	Found	临时移动。与301类似。但资源只是临时被移动。客户端应继续使用原有URI
303	See Other	查看其它地址。与301类似。使用GET和POST请求查看
304	Not Modified	未修改。所请求的资源未修改，服务器返回此状态码时，不会返回任何资源。客户端通常会缓存访问过的资源，通过提供一个头信息指出客户端希望只返回在指定日期之后修改的资源
305	Use Proxy	使用代理。所请求的资源必须通过代理访问
306	Unused	已经被废弃的HTTP状态码
307	Temporary Redirect	临时重定向。与302类似。使用GET请求重定向
400	Bad Request	客户端请求的语法错误，服务器无法理解
401	Unauthorized	请求要求用户的身份认证
402	Payment Required	保留，将来使用
403	Forbidden	服务器理解请求客户端的请求，但是拒绝执行此请求
404	Not Found	服务器无法根据客户端的请求找到资源（网页）。通过此代码，网站设计人员可设置"您所请求的资源无法找到"的个性页面
405	Method Not Allowed	客户端请求中的方法被禁止
406	Not Acceptable	服务器无法根据客户端请求的内容特性完成请求
407	Proxy Authentication Required	请求要求代理的身份认证，与401类似，但请求者应当使用代理进行授权
408	Request Time-out	服务器等待客户端发送的请求时间过长，超时
409	Conflict	服务器完成客户端的 PUT 请求时可能返回此代码，服务器处理请求时发生了冲突
410	Gone	客户端请求的资源已经不存在。410不同于404，如果资源以前有现在被永久删除了可使用410代码，网站设计人员可通过301代码指定资源的新位置
411	Length Required	服务器无法处理客户端发送的不带Content-Length的请求信息
412	Precondition Failed	客户端请求信息的先决条件错误
413	Request Entity Too Large	由于请求的实体过大，服务器无法处理，因此拒绝请求。为防止客户端的连续请求，服务器可能会关闭连接。如果只是服务器暂时无法处理，则会包含一个Retry-After的响应信息
414	Request-URI Too Large	请求的URI过长（URI通常为网址），服务器无法处理
415	Unsupported Media Type	服务器无法处理请求附带的媒体格式
416	Requested range not satisfiable	客户端请求的范围无效
417	Expectation Failed	服务器无法满足Expect的请求头信息
429 Too Many Requests 请求过多
500	Internal Server Error	服务器内部错误，无法完成请求
501	Not Implemented	服务器不支持请求的功能，无法完成请求
502	Bad Gateway	作为网关或者代理工作的服务器尝试执行请求时，从远程服务器接收到了一个无效的响应
503	Service Unavailable	由于超载或系统维护，服务器暂时的无法处理客户端的请求。延时的长度可包含在服务器的Retry-After头信息中
504	Gateway Time-out	充当网关或代理的服务器，未及时从远端服务器获取请求
505	HTTP Version not supported	服务器不支持请求的HTTP协议的版本，无法完成处理
















第四章 模板
当用户访问程序的根地址时，我们的视图函数会向客户端返回一行HTML代码。然而，一个完整的HTML页面往往需要几十行甚至上百行代码，不应该全部写在视图函数中，正确的做法是把HTML代码存储在单独的文件中，以便让程序的业务逻辑和表现逻辑分离，即控制器和用户界面的分离。
在动态Web程序中，视图函数返回的HTML数据往往需要根据相应的变量（比如查询参数）动态生成。当HTML代码保存到单独的文件中时，我们没法再使用字符串格式化或拼接字符串的方式来在HTML代码中插入变量，这时我们需要使用模板引擎（template engine）。借助模板引擎，我们可以在HTML文件中使用特殊的语法来标记出变量，这类包含固定内容和动态部分的可重用文件称为模板（template）。模板引擎的作用就是读取并执行模板中的特殊语法标记，并根据传入的数据将变量替换为实际值，输出最终的HTML页面，这个过程被称为渲染（rendering）。Flask默认使用的模板引擎是Jinja2，它是一个功能齐全的Python模板引擎，除了设置变量，还允许我们在模板中添加if判断，执行for迭代，调用函数等，以各种方式控制模板的输出。对于Jinja2来说，模板可以是任何格式的纯文本文件，比如HTML、XML、CSV、LaTeX等。
4.1创建模板
在templates目录下创建html文件作为模板文件。
在jinja2模板引擎中含有其自己的语法，有三种定界符：①语句如if判断for循环{% %}②表达式如函数字符串变量{{ }}③注释{# #}
Jinja2属性取法有两种，一种是.键，另一种是[‘键’]
但是查找方式不一样，如
bar.per  # 先查找bar对象是否有per属性，再查找是否有per对象（如字典中的键值对）；
bar['per'] # 先查找是否有per对象（如字典中的键值对），再查找bar对象是否有per属性；
# 如果没有找到，则返回未定义对象，默认用空字符串替代；
4.2模板语法（判断与迭代语句）
可以在模板中使用Python语句和表达式来操作数据的输出，但是并不是全部支持。

判断语句：
{% if 判断语句 %}
执行语句1
{% else %}
执行语句2
{% endif %}

迭代语句：
{% for 项目 in 项目组 %}
迭代语句
{% endfor %}

与else结合：
{% for in %}
迭代语句
{% else %}
结束迭代语句
{% endfor %}

循环变量：
变量	内容
loop.index	循环迭代计数（从1开始）
loop.index0	循环迭代计数（从0开始）
loop.revindex	循环迭代倒序计数（从len开始，到1结束）
loop.revindex0	循环迭代倒序计数（从len－1开始，到0结束）
loop.first	是否为循环的第一个元素
loop.last	是否为循环的最后一个元素
loop.length	循环序列中元素的个数
loop.cycle	在给定的序列中轮循，如上例在”odd”和”even”两个值间轮循
loop.depth	当前循环在递归中的层级（从1开始）
loop.depth0	当前循环在递归中的层级（从0开始）
4.3渲染模板（render_template()）
渲染一个模板，就是执行模板中的代码，并传入所有在模板中使用的变量，渲染后的结果就是我们要返回给客户端的HTML响应。在视图函数中渲染模板时，我们并不直接使用Jinja2提供的函数，而是使用Flask提供的渲染函数render_template（）。
还可以以关键字参数的形式传入模板中使用的变量值，左边值为传入模板的变量名称，中间为等号，右边为要传入的对象。
还有一个render_template_string()函数用来渲染模板字符串。

如果想传入函数在模板中调用，那么需要传入函数对象本身，而不是函数调用（函数的返回值），所以仅写出函数名称即可。当把函数传入模板后，我们可以像在Python脚本中一样通过添加括号的方式调用，而且你也可以在括号中传入参数。
4.4上下文
4.4.1内置上下文变量（全局）
config 当前的配置对象
request 当前的请求对象，在已激活的请求环境下可用
session 当前的会话对象，在已激活的请求环境下可用
g 与请求绑定的全局变量，在已激活的请求环境下可用
4.4.2自定义模板变量（set与endset标签）
可以在模板中定义变量，使用set标签：{% set 定义变量 %}
实例：{% set navigation = [('/', 'Home'), ('/about', 'About')] %}
使用一部分模板数据定义为变量，使用set与endset标签声明开始与结束：{% set 变量名 %}数据{% endset %}
实例：
{% set navigation %}
<li><a href="/">Home</a>
<li><a href="/about">About</a>
{% endset %}
4.4.3自定义上下文变量（app.context_processor）
如果多个模板都需要使用同一变量，那么比起在多个视图函数中重复传入，更好的方法是能够设置一个模板全局变量。Flask提供了一个app.context_processor装饰器，可以用来注册模板上下文处理函数，它可以帮我们完成统一传入变量的工作。模板上下文处理函数需要返回一个包含变量键值对的字典。
实例：
@app.context_processor
def inject_foo():
foo = 'I am foo.'
return dict(foo=foo) # 等同于return {'foo': foo}
当我们调用render_template（）函数渲染任意一个模板时，所有使用app.context_processor装饰器注册的模板上下文处理函数（包括Flask内置的上下文处理函数）都会被执行，这些函数的返回值会被添加到模板中，因此我们可以在模板中直接使用foo变量。
和在render_template（）函数中传入变量类似，除了字符串、列表等数据结构，你也可以传入函数、类或类实例。

除了使用app.context_processor装饰器，也可以直接将其作为方法调用，传入模板上下文处理函数：
def inject_foo():
foo = 'I am foo.'
return dict(foo=foo)
app.context_processor(inject_foo)
使用lambda可以简化为：
app.context_processor(lambda: dict(foo='I am foo.'))
4.5全局对象
4.5.1内置全局函数
Jinja2内置函数
①range([起始值,]结束值[,步长])
python range() 函数可创建一个整数列表，一般用在 for 循环中。
起始值：默认是从 0 开始。例如range（5）等价于range（0， 5）;
结束值：但不包括。例如：range（0， 5） 是[0, 1, 2, 3, 4]没有5
步长：默认为1。例如：range（0， 5） 等价于 range(0, 5, 1)
②lipsum(n=生成HTML文本数量,html=True,min=文本最小值,max=文本最大值)
用于生成随机文本，可以在测试时用来填充页面，默认生成5段HTML文本，每段包含20~100个单词。
③dict()
用于创建一个字典。
格式：
dict(键=‘值’，……）
dict(zip([‘键’……],[值……])）
dict([(‘键’,‘值’，……）])
实例：
>>>dict()                        # 创建空字典
{}
>>> dict(a='a', b='b', t='t')     # 传入关键字
{'a': 'a', 'b': 'b', 't': 't'}
>>> dict(zip(['one', 'two', 'three'], [1, 2, 3]))   # 映射函数方式来构造字典
{'three': 3, 'two': 2, 'one': 1} 
>>> dict([('one', 1), ('two', 2), ('three', 3)])    # 可迭代对象方式来构造字典
{'three': 3, 'two': 2, 'one': 1}

Flask内置函数：
①url_for() 用于生成URL的函数
②get_flashed_messages()用于获取flash消息的函数

全局上下文变量也是全局变量。
4.5.2自定义全局函数（app.context_processor）
除了使用app.context_processor注册模板上下文处理函数来传入函数，我们也可以使用app.template_global装饰器直接将函数注册为模板全局函数。
实例：
@app.template_global()
def bar():
return 'I am bar.'
默认使用函数的原名称传入模板，在app.template_global（）装饰器中使用name参数可以指定一个自定义名称。如app.add_template_global（your_global_function）
4.6过滤器
在Jinja2中，过滤器（filter）是一些可以用来修改和过滤变量值的特殊函数，过滤器和变量用一个竖线（管道符号）隔开，需要参数的过滤器可以像函数一样使用括号传递。
滤器可以像函数一样使用括号传递。
4.6.1过滤器的用法（filer与endfilter标签）
①类似与函数与方法，直接在后面调用
格式:{{ 变量值 | 过滤器 }}
实例{{ movies|length}}==len(movies)
②将过滤器用于一部分的模板数据，使用fileter与endfilter标签声明开始与结束。
格式：
{% filter 过滤器 %}
模板数据
{% endfilter %}
实例：
{% filter upper %}
This text becomes uppercase.
{% endfilter %}
③链式调用
可以同时调用多个过滤器，只需要以|分隔。
4.6.2内置过滤器
(1) 字符串进行操作:

{# 当变量未定义时，显示默认字符串 #}
<p>{{ name | default('None', true) }}</p>
 
{# 单词首字母大写 Yes#}
<p>{{ 'yes' | capitalize }}</p>
 
{# 单词全小写 xml#}
<p>{{ 'XML' | lower }}</p>
 
{# 去除字符串前后的空白字符  like#}
<p>{{ '  like  ' | trim }}</p>
 
{# 字符串反转，返回"olleh" #}
<p>{{ 'hello' | reverse }}</p>
 
{# format格式化 #}
{{ '我叫%s 我今年%d岁了 我的存款为%.2f'|format('小胖子',38,1.00002) }}
    
{# var|replace 替换 #}
{{ data.html|replace('h','x') }}
    
{# 关闭HTML自动转义 #}
<p>{{ '<em>name</em>' | safe }}</p>
 
{% autoescape false %}
{# HTML转义，即autoescape关了也转义，可以缩写为e #}
<p>{{ '<em>name</em>' | escape }}</p>
{% endautoescape %}
(2) 对列表进行操作

{# 取第一个元素12 #}
<p>{{ [12,21,33,44] | first }}</p>
 
{# 取最后一个元素44 #}
<p>{{ [12,21,33,44] | last }}</p>
 
{# 返回列表长度，可以写为count #}
<p>{{ [1,2,3,4,5] | length }}</p>
 
{# 列表求和 #}
<p>{{ [12,21,33,44] | sum }}</p>
 
{# 列表排序，默认为升序 #}
<p>{{ [12,21,33,44] | sort }}</p>
 
{# 合并为字符串，返回"1 | 2 | 3 | 4 | 5" #}
<p>{{ [1,2,3,4,5] | join(' | ') }}</p>
 
{# 列表中所有元素都全大写。这里可以用upper,lower #}
<p>{{ ['good','nice','handsome'] | upper }}</p>
    
(3) 对数值进行操作: 取证

{# 四舍五入取整，返回3 #}
<p>{{ 3.14169 | round }}</p>
 
{# 向下截取到小数点后2位，返回3.14 #}
<p>{{ 3.14169 | round(2, 'floor') }}</p>
 
{# 绝对值，返回15 #}
<p>{{ -15 | abs }}</p>
    
{# var|list 将var值转换为列表 #}
(4) 类型转换

{# var|int  将var值转换为整形 #}
{# var|string  将var值转换为字符串类型 #}
{# var|float   将var值转换为浮点形 #}
{# var|list    将var值转换为列表 #}
(5) 变量输出JSON格式字符串:一般结合javescript使用

<script type="text/javascript">
var arg = {{ args | tojson | safe }};
console.log(arg[1].name);
</script>
4.6.3自定义过滤器（app.template_filter()）
app.template_filter()装饰器可以注册自定义过滤器。
实例：
from flask import Markup
@app.template_filter()
def musical(s):
return s + Markup(' &#9835;')
可以使用name关键字来设置过滤器的名称，默认会是那个函数名。
或者使用app.add_template_filter()方法注册自定义过滤器，传入函数对象或name属性。
4.7测试器
用来测试变量或表达式，返回布尔值的特殊函数。使用is来链接变量与测试器。
实例：number测试器用来判断一个变量或表达式是否为数字
{% if age is number %}
{{ age * 365 }}
{% else %}
无效的数字。
{% endif %}
4.7.1内置测试器
{# 检查变量是否被定义，也可以用undefined检查是否未被定义 #}
{% if name is defined %}
    <p>Name is: {{ name }}</p>
{% endif %}
 
{# 检查是否所有字符都是大写 #}
{% if name is upper %}
  <h2>"{{ name }}" are all upper case.</h2>
{% endif %}
 
{# 检查变量是否为空 #}
{% if name is none %}
  <h2>Variable is none</h2>
{% endif %}
 
{# 检查变量是否为字符串，也可以用number检查是否为数值 #}
{% if name is string %}
  <h2>{{ name }} is a string.</h2>
{% endif %}


{# 检查变量是否可被迭代循环，也可以用sequence检查是否是序列 #}
{% if [1,2,3] is iterable %}
  <h2>Variable is iterable.</h2>
{% endif %}
 
{# 检查变量是否是字典 #}
{% if {'name':'test'} is mapping %}
  <h2>Variable is dict.</h2>
{% endif %}

{# 检查变量是否与other指向相同内存地址 #}
{% if foo is sameas（bar） %}
4.7.2自定义测试器（app.template_test()）
可以使用app.template_test()装饰器来注册一个自定义测试器。
实例：用来测试值是否为baz：
@app.template_test()
def baz(n):
if n == 'baz':
return True
return False
测试器名称默认为函数名，也可以用name关键字传入自定义名称。返回的是布尔值。
也可以使用app.add_template_test()方法注册自定义测试器，传入函数对象和name属性。
4.8模板环境对象
Jinja2里渲染行为由jinja2.Environment类控制，所有配置选项，上下文变量，全局函数，过滤器，测试器都存储在Environment实例上。
当与Flask结合后，我们并不单独创建Enviroment对象，而是使用Flask创建的Enviroment对象，它存储在app.jinja_env属性上。在程序中，我们可以使用app.jinja_env更改Jinja2设置。比如，你可以自定义所有的定界符。下面使用variable_start_string和variable_end_string分别自定义变量定界符的开始和结束符号：
app = Flask(__name__)
app.jinja_env.variable_start_string = '[['
app.jinja_env.variable_end_string = ']]'

模板环境中的全局函数、过滤器和测试器分别存储在Enviroment对象的globals、filters和tests属性中，这三个属性都是字典对象。除了使用Flask提供的装饰器和方法注册自定义函数，我们也可以直接操作这三个字典来添加相应的函数或变量，这通过向对应的字典属性中添加一个键值对实现，传入模板的名称作为键，对应的函数对象或变量作为值。
4.8.1添加自定义全局对象（app.jinjia_env.globals）
和app.template_global（）装饰器不同，直接操作globals字典允许我们传入任意Python对象，而不仅仅是函数，类似于上下文处理函数的作用。下面的代码使用app.jinja_env.globals分别向模板中添加全局函数bar和全局变量foo：
def bar():
return 'I am bar.'
foo = 'I am foo.'
app.jinja_env.globals['bar'] = bar
app.jinja_env.globals['foo'] = foo
4.8.2添加自定义过滤器（app.jinjia_env.filters）
下面的代码使用app.jinja_env.filters向模板中添加自定义过滤器smiling：
def smiling(s):
return s + ' :)'
app.jinja_env.filters['smiling'] = smiling
4.8.3添加自定义测试器（app.jinjia_env.tests）
下面的代码使用app.jinja_env.tests向模板中添加自定义测试器baz：
def baz(n):
if n == 'baz':
return True
return False
app.jinja_env.tests['baz'] = baz
4.9局部模板（include标签）
在Web程序中，我们通常会为每一类页面编写一个独立的模板。比如主页模板、用户资料页模板、设置页模板等。这些模板可以直接在视图函数中渲染并作为HTML响应主体。除了这类模板，我们还会用到另一类非独立模板，这类模板通常被称为局部模板或次模板，因为它们仅包含部分代码，所以我们不会在视图函数中直接渲染它，而是插入到其他独立模板中。
当程序中的某个视图用来处理AJAX请求时，返回的数据不需要包含完整的HTML结构，这时就可以返回渲染后的局部模板。当多个独立模板中都会使用同一块HTML代码时，我们可以把这部分代码抽离出来，存储到局部模板中。这样一方面可以避免重复，另一方面也可以方便统一管理。比如，多个页面中都要在页面顶部显示一个提示条，这个横幅可以定义在局部模板_banner.html中。
我们使用include标签来插入一个局部模板，这会把局部模板的全部内容插在使用include标签的位置。比如，在其他模板中，我们可以在任意位置使用下面的代码插入_banner.html的内容：
{% include '_banner.html' %}
为了和普通模板区分开，局部模板的命名通常以一个下划线开始。
4.10宏（macro和endmacro标签）
类似Python中的函数。使用宏可以把一部分模板代码封装到宏里，使用传递的参数来
构建内容，最后返回构建后的内容。在功能上，它和局部模板类似，都是为了方便代码块的重用。
为了便于管理，我们可以把宏存储在单独的文件中，这个文件通常命名为macros.html或_macors.html。在创建宏时，我们使用macro和endmacro标签声明宏的开始和结束。在开始标签中定义宏的名称和接收的参数
实例：
{% macro qux(amount=1) %}
{% if amount == 1 %}
I am qux.
{% elif amount > 1 %}
We are quxs.
{% endif %}
{% endmacro %}
使用时，需要像从Python模块中导入函数一样使用import语句导入它，然后作为函数调用，传入必要的参数，如下所示：
{% from 'macros.html' import qux %}
...
{{ qux(amount=5) }}
另外，在使用宏时我们需要注意上下文问题。在Jinja2中，出于性能的考虑，并且为了让这一切保持显式，默认情况下包含（include）一个局部模板会传递当前上下文到局部模板中，但导入（import）却不会。具体来说，当我们使用render_template（）函数渲染一个foo.html模板时，这个foo.html的模板上下文中包含下列对象：
·Flask使用内置的模板上下文处理函数提供的g、session、config、request。
·扩展使用内置的模板上下文处理函数提供的变量。
·自定义模板上下文处理器传入的变量。
·使用render_template（）函数传入的变量。
·Jinja2和Flask内置及自定义全局对象。
·Jinja2内置及自定义过滤器。
·Jinja2内置及自定义测试器。
使用include标签插入的局部模板（比如_banner.html）同样可以使用上述上下文中的变量和函数。而导入另一个并非被直接渲染的模板（比如macros.html）时，这个模板仅包含下列这些对象：
·Jinja2和Flask内置的全局函数和自定义全局函数。
·Jinja2内置及自定义过滤器。
·Jinja2内置及自定义测试器。
因此，如果我们想在导入的宏中使用第一个列表中的2、3、4项，就需要在导入时显式地使用with context声明传入当前模板的上下文：
{% from "macros.html" import foo with context %}
虽然Flask使用内置的模板上下文处理函数传入session、g、request和config，但它同时也使用app.jinja_env.globals字典将这几个变量设置为全局变量，所以我们仍然可以在不显示声明传入上下文的情况下，直接在导入的宏中使用它们。
4.11模板继承
Jinja2的模板继承允许你定义一个基模板，把网页上的导航栏、页脚等通用内容放在基模板中，而每一个继承基模板的子模板在被渲染时都会自动包含这些部分。使用这种方式可以避免在多个模板中编写重复的代码。
4.11.1基模板（block和endblock标签）
基模板存储了程序页面的固定部分，通常被命名为base.html或layout.html。示例程序中的基模板base.html中包含了一个基本的HTML结构，我们还添加了一个简单的导航条和页脚。
实例：
<!DOCTYPE html>
<html>
<head>
{% block head %}
<meta charset="utf-8">
<title>{% block title %}Template - HelloFlask{% endblock %}</title>
{% block styles %}{% endblock %}
{% endblock %}
</head>
<body>
<nav>
<ul><li><a href="{{ url_for('index') }}">Home</a></li></ul>
</nav>
<main>
{% block content %}{% endblock %}
</main>
<footer>
{% block footer %}
...
{% endblock %}
</footer>
{% block scripts %}{% endblock %}
</body>
</html>
当子模板继承基模板后，子模板会自动包含基模板的内容和结构。为了能够让子模板方便地覆盖或插入内容到基模板中，我们需要在基模板中定义块（block），在子模板中可以通过定义同名的块来执行继承操作。块的开始和结束分别使用block和endblock标签声明，而且块之间可以嵌套。
格式：
{% block 基模块名 %}
模块内容
{% endblock 基模块名 %}
4.11.2子模板（extends标签）
实例：
{% extends 'base.html' %}
{% from 'macros.html' import qux %}
{% block content %}
{% set name='baz' %}
<h1>Template</h1>
<ul>
<li><a href="{{ url_for('watchlist') }}">Watchlist</a></li>
<li>Filter: {{ foo|musical }}</li>
<li>Global: {{ bar() }}</li>
<li>Test: {% if name is baz %}I am baz.{% endif %}</li>
<li>Macro: {{ qux(amount=5) }}</li>
</ul>
{% endblock %}
我们使用extends标签声明扩展基模板，它告诉模板引擎当前模板派生自base.html。
extends必须是子模板的第一个标签。
我们在基模板中定义了四个块，在子模板中，我们可以对父模板中的块执行两种操作：
（1）覆盖内容
当在子模板里创建同名的块时，会使用子块的内容覆盖父块的内容。比如我们在子模板index.html中定义了title块，内容为Home，这会把块中的内容填充到基模板里的title块的位置，最终渲染为<title>Home</title>，content块的效果同理。
（2）追加内容
如果想要向基模板中的块追加内容，需要使用Jinja2提供的super（）函数进行声明，这会向父块添加内容。
实例：
{% block styles %}
{{ super() }}
<style>
.foo {
color: red;
}
</style>
{% endblock %}
当子模板被渲染时，它会继承基模板的所有内容，然后根据我们定义的块进行覆盖或追加操作，渲染子模板index.html的结果如下所示：
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Template - HelloFlask</title>
</head>
<body>
<nav>
<ul><li><a href="/">Home</a></li></ul>
</nav>
<main>
<h1>Template</h1>
<ul>
<li><a href="/watchlist">Watchlist</a></li>
<li>Filter: I am foo. &#9835;</li>
<li>Global: I am bar.</li>
<li>Test: I am baz.</li>
<li>Macro: We are quxs.</li>
</ul>
</main>
<footer>
...
</footer>
</body>
</html>
4.12空白控制（减号运算符与trim_blocks lstrip_blocks属性）
在实际输出的HTML文件中，模板中的Jinja2语句、表达式和注释会保留移除后的空行。
{% if user.bio %}
<i>{{ user.bio }}</i>
{% else %}
<i>This user has not provided a bio.</i>
{% endif %}
会变成：
<i>{{ user.bio }}</i>

<i>This user has not provided a bio.</i>
如果你想在渲染时自动去掉这些空行，可以在定界符内侧添加减号。比如，{%-endfor%}会移除该语句前的空白，同理，在右边的定界符内侧添加减号将移除该语句后的空白：
{% if user.bio -%}
<i>{{ user.bio }}</i>
{% else -%}
<i>This user has not provided a bio.</i>
{%- endif %}
现在输出的HTML代码如下所示：
<i>{{ user.bio }}</i>
<i>This user has not provided a bio.</i>
除了在模板中使用减号来控制空白外，我们也可以使用模板环境对象提供的trim_blocks和lstrip_blocks属性设置，前者用来删除Jinja2语句后的第一个空行，后者则用来删除Jinja2语句所在行之前的空格和制表符（tabs）：
app.jinja_env.trim_blocks = True
app.jinja_env.lstrip_blocks = True
trim_blocks中的block指的是使用{%...%}定界符的代码块，与我们前面介绍模板继承中的块无关。
需要注意的是，宏内的空白控制行为不受trim_blocks和lstrip_blocks属性控制，我们需要手动设置，比如：
{% macro qux(amount=1) %}
{% if amount == 1 -%}
4.13加载静态文件
4.13.1添加Favicon
favicon.ico指Favicon（favorite icon，收藏夹头像/网站头像），又称为shortcut icon、tab icon、website icon或是bookmark icon。顾名思义，这是一个在浏览器标签页、地址栏和书签收藏夹等处显示的小图标，作为网站的特殊标记。浏览器在发起请求时，会自动向根目录请求这个文件，我们没有提供这个文件，所以产生：127.0.0.1 - - [时间] "GET /favicon.ico HTTP/1.1" 404 -
除了ICO格式，PNG和（无动画的）GIF格式也被所有主流浏览器支持。
Flask中静态文件的默认路径为/static/filename，为了正确返回Favicon，我们可以显式地在HTML页面中声明Favicon的路径。首先可以在<head>部分添加一个<link>元素，然后将rel属性设置为icon，如下所示：
<link rel="icon"type="image/x-icon"
href="{{ url_for('static',filename='favicon.ico') }}">
大部分教程将rel属性设置为shortcut icon，事实上，shortcut是多余的，可以省略掉。
4.13.2添加CSS
在编写Web程序时，手动编写CSS比较麻烦，更常见的做法是使用CSS框架来为程序添加样式。CSS框架内置了大量可以直接使用的CSS样式类和JavaScript函数，使用它们可以非常快速地让程序页面变得美观和易用，同时我们也可以定义自己的CSS文件来进行补充和调整。以Bootstrap（http://getbootstrap.com/）为例，我们需要访问Bootstrap的下载页面（http://getbootstrap.com/docs/4.0/getting-started/download/）下载相应的资源文件，然后分类别放到static目录下。
通常情况下，CSS和JavaScript的资源引用会在基模板中定义，具体方式和加载我们自定义的styles.css文件相同：
...
{% block styles %}
<link rel="stylesheet" 
href="{{ url_for('static', filename='css/bootstrap.min.css') }}">
{% endblock %}
...
{% block scripts %}
<script src="{{ url_for('static', filename='js/jquery.min.js') }}"></script>
<script src="{{ url_for('static', filename='js/popper.min.js') }}"></script>
<script src="{{ url_for('static', filename='js/bootstrap.min.js') }}"></script>
{% endblock %}
...

如果不使用Bootstrap提供的JavaScript功能，那么也可以不加载。另外，Bootstrap所依赖的jQuery（https://jquery.com/）和Popper.js（https://popper.js.org/）需要单独下载，这三个JavaScript文件在引入时要按照jQuery→Popper.js→Boostrap的顺序引入。虽然我建议在开发时统一管理静态资源，如果你想简化开发过程，那么从CDN加载是更方便的做法。从CND加载时，只需要将相应的URL替换为CDN提供的资源URL，比如：
...
{% block styles %}
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
{% endblock %}
...
{% block scripts %}
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
{% endblock %}
4.13.3使用宏加载静态资源
可以创建一个专门用于加载静态资源的宏
{% macro static_file(type, filename_or_url, local=True) %}
{% if local %}
{% set filename_or_url = url_for('static', filename=filename_or_url) %}
{% endif %}
{% if type == 'css' %}
<link rel="stylesheet" href="{{ filename_or_url }}" type="text/css">
{% elif type == 'js' %<script type="text/javascript" src="{{ filename_or_url }}"></script>
{% elif type == 'icon' %}
<link rel="icon" href="{{ filename_or_url }}">
{% endif %}
{% endmacro %}
在模板中导入宏后，只需在调用时传入静态资源的类别和文件路径就会获得完整的资源加载语句。使用它加载CSS文件的示例如下：
static_file('css', 'css/bootstrap.min.css')
使用它也可以从CDN加载资源，只需要将关键字参数local设为False，然后传入资源的URL即可：
static_file('css', 'https://maxcdn.../css/bootstrap.min.css', local=False)
4.14消息闪现（flash()与get_flashed_messages()）
可以用来“闪现”需要显示给用户的消息，比如当用户登录成功后显示“欢迎回来！”。在视图函数调用flash（）函数，传入消息内容即可“闪现”一条消息。当然，它并不是我们想象的，能够立刻在用户的浏览器弹出一条消息。实际上，使用功能flash（）函数发送的消息会存储在session中，我们需要在模板中使用全局函数get_flashed_messages（）获取消息并将其显示出来。
通过flash（）函数发送的消息会存储在session对象中，所以我们需要为程序设置密钥。可以通过app.secret_key属性或配置变量SECRET_KEY设置。
你可以在任意视图函数中调用flash（）函数发送消息。为了测试消息闪现，我们添加了一个just_flash视图，在函数中发送了一条消息，最后重定向到index视图
from flask import Flask, render_template, flash
app = Flask(__name__)
app.secret_key = 'secret string'
@app.route('/flash')
def just_flash():
flash('I am flash, who is looking for me?')
return redirect(url_for('index'))
在Python 3.x中，字符串默认类型为Unicode。如果你使用Python3，那么包含中文的字符串前的u前缀可以省略掉，同时也不用在脚本开头添加编码声明。尽管如此，还是建议保留编码声明以便让某些编辑器自动切换设置的编码类型。
Flask提供了get_flashed_message（）函数用来在模板里获取消息，因为程序的每一个页面都有可能需要显示消息，我们把获取并显示消息的代码放在基模板中content块的上面，这样就可以在页面主体内容的上面显示消息
<main>
{% for message in get_flashed_messages() %}
<div class="alert">{{ message }}</div>
{% endfor %}
{% block content %}{% endblock %}
</main>
当get_flashed_message（）函数被调用时，session中存储的所有消息都会被移除。如果你这时刷新页面，会发现重载后的页面不再出现这条消息。
综上来说要写两个方面的内容：
第一在py文件中使用flash函数，用来传入参数
if not all([username, password1, password2]):
    flash("不能为空")
elif password1 != password2:
    flash("两次密码不相同")
else:
return 'success'
第二是在html模板中使用jinja2语法循环展示message对象。
4.15自定义错误页面（app.errorhandler）
当程序返回错误响应时，会渲染一个默认的错误页面。
错误处理函数和视图函数很相似，返回值将会作为响应的主体，因此我们首先要创建错误页面的模板文件。为了和普通模板区分开来，我们在模板文件夹templates里为错误页面创建了一个errors子文件夹，并在其中为最常见的404和500错误创建了模板文件。
404错误模板：
{% extends 'base.html' %}
{% block title %}404 - Page Not Found{% endblock %}
{% block content %}
<h1>Page Not Found</h1>
<p>You are lost...</p>
{% endblock %}
错误处理函数需要附加app.errorhandler（）装饰器，并传入错误状态码作为参数。错误处理函数本身则需要接收异常类作为参数，并在返回值中注明对应的HTTP状态码。当发生错误时，对应的错误处理函数会被调用，它的返回值会作为错误响应的主体。
from flask import Flask, render_template
...
@app.errorhandler(404)
def page_not_found(e):
return render_template('errors/404.html'), 404
错误处理函数接收异常对象作为参数，内置的异常对象提供了下列常用属性
code:状态码
name:原因短语
description:错误描述，可以使用get_description()方法获取HTML格式的错误描述代码。
Flask通过抛出Werkzeug中定义的HTTP异常类来表示HTTP错误，错误处理函数接收的参数就是对应的异常类。基于这个原理，你也可以使用app.errorhandler（）装饰器为其他异常注册处理函数，并返回自定义响应，只需要在app.errorhandler（）装饰器中传入对应的异常类即可。比如，使用app.errorhandler（NameError）可以注册处理NameError异常的函数。
4.16JavaScript与CSS中使用Jinja2
4.16.1行内/嵌入式JavaScript与CSS
就在HTML中使用<style>和<script>标签定义这部分CSS和JavaScript代码。在这部分CSS和JavaScript代码中加入Jinja2时，不用考虑编写时的语法错误，比如引号错误，因为Jinja2会在渲染后被替换掉，所以只需要确保渲染后的代码正确即可。但是并不推荐
4.16.2定义JavaScript与CSS变量
对于想要在JavaScript中获取的数据，如果是元素特定的数据，比如某个文章条目对应的id值，可以通过HTML元素的data-*属性存储。你可以自定义横线后的名称，作为元素上的自定义数据变量，比如data-id，data-username等，比如：
<span data-id="{{ user.id }}" data-username="{{ user.username }}">
在JavaScript中，我们可以使用DOM元素的dataset属性获取data-*属性值，比如element.dataset.username，或是使用getAttribute（）方法，比如element.getAttribute（'data-username'）；使用jQuery时，可以直接对jQuery对象调用data方法获取，比如$element.data（'username'）
在HTML中，“data-*”被称为自定义数据属性（custom data attribute），我们可以用它来存储自定义的数据供JavaScript获取。在后面的其他程序中，我们也会频繁使用这种方式来传递数据。
对于需要全局使用的数据，则可以在页面中使用嵌入式JavaScript定义变量，如果没法定义为JavaScript变量，那就考虑定义为函数，比如：
<script type="text/javascript">
var foo = '{{ foo_variable }}';
</script>
当你在JavaScript中插入了太多Jinja2语法时，或许这时你该考虑将程序转变为Web API，然后专心使用JavaScript来编写客户端。

CSS同理，有些时候你会需要将Jinja2变量值传入CSS文件，比如我们希望将用户设置的主题颜色设置到对应的CSS规则中，或是需要将static目录下某个图片的URL传入CSS来设置为背景图片，除了将这部分CSS定义直接写到HTML中外，我们可以将这些值定义为CSS变量，如
下所示：
<style>
:root {
--theme-color: {{ theme_color }};
--background-url: {{ url_for('static', filename='background.jpg') }}
}
</style>
在CSS文件中，使用var（）函数并传入变量名即可获取对应的变量值：
#foo {
color: var(--theme-color);
}
#bar {
background: var(--background-url);
}
4.17重定向（redirect())
一般余url_for一同使用，功能是跳转到指定的URL。
一般格式：redirect(url_for(URL地址)）
redirect就是一个相应函数，它总共有三个参数,这三个参数都是用来实例化响应的.
第一个参数:location是响应应该重定向到的位置。第二个参数code是重定向状态代码,默认302，表示找到页面,最后一个参数是实例化响应时要使用的响应类.所以说redirect本身是不能像render_template那样来传递参数的.但是如果你要传递的参数只是像string,int这样的数据,你可以用url_for来作为location参数,而url_for是可以做到传递这些简单数据。

第五章 表单
<form>标签创建表单，<input>创建表单中的字段。
5.1Flask-WTF处理表单
5.1.1CSRF密匙生成（app.secret_key)
Flask-WTF默认为每个表单启用CSRF保护，它会为我们自动生成和验证CSRF令牌。默认情况下，Flask-WTF使用程序密钥来对CSRF令牌进行签名，所以我们需要为程序设置密钥：
app.secret_key = 'secret string'
5.1.2定义WTFroms表单类
当使用WTForms创建表单时，表单由Python类表示，这个类继承从WTForms导入的Form基类。一个表单由若干个输入字段组成，这些字段分别用表单类的类属性来表示（字段即Field，你可以简单理解为表单内的输入框、按钮等部件）。

所以首先在Python文件中导入包：
第一是导入FlaskFrom：
from flask-wtf import FlaskForm
第二是各种需要的表单控件，如文本输入框，密码输入框，提交按钮,Field即文本域的意思：
from wtforms import StringField, PasswordField, SubmitField
第三是导入验证器，用来验证输入的内容，在wtforms.validators中。
from wtforms.validators import DataRequired, equal_to
再在下面定义一个表单类，在括号中传入FlaskForm基类：
class Form1(FlaskForm):
然后是一行行地定义每一行的控件的类型，变量名，显示文字，验证器，由于验证器是函数，所以后面有圆括号。验证器由方括号括起来，逗号分隔。提交等按钮没有控制器。StringField是文本输入框，其他的依次类推，validators后接验证器，DataRequired是必填字段，equal_to是验证是否与某字段相等，后面字符串是如果不相等显示的提示文本。
定义的格式是：

变量名=控键函数名（‘控件显示文本’，validators=[验证器函数……]）：

username = StringField('用户名', validators=[DataRequired()])
password1 = PasswordField('密码', validators=[DataRequired()])
password2 = PasswordField('确认密码', validators=[DataRequired(), 		equal_to('password1', '两次信息不一致')])
submit = SubmitField('提交')

定义了类，再在Python文件中要使用表单的函数下将表单的变量传入html文件中来渲染。
首先定义视图函数，再定义表单变量使用刚刚定义的表单类：
@app.route('/form', methods=['POST', 'GET'])
def login():
form = Form1()
然后判断请求的方式是不是提交，如果是就构建form对象并存放数据。因为我们的表单使用POST方法提交，如果单纯使用WTForms，我们在实例化表单类时需要首先把request.form传入表单类，而使用Flask_WTF时，表单类继承的FlaskForm基类默认会从request.form获取表单数据，所以不需要手动传入。
    if request.method == 'POST':
        username = request.form.get('username')
        password1 = request.form.get('password1')
        password2 = request.form.get('password2')
*也可以使用表单类的data属性，表单类的data属性是一个匹配所有字段与对应数据的字典，我们一般直接通过“form.字段属性名.data”的形式来获取对应字段的数据。例如，form.username.data返回username字段的值。
*这里变量名取什么无所谓，在传入表单时这些变量名不会传入html文件，它们仅在py的逻辑层使用。
判断是不是数据满足全部的验证条件，form.validate_on_submit是验证所有的条件，不用一个个去验证，成功就打印，否则flash错误：
        if form.validate_on_submit():  # 提交全验证
            print(username, password1, password2)
        else:
            flash('参数有误')
最后视图函数渲染，并传入form表单对象。
return render_template('main1.html', form=form)

既然我们已经定义了类，然后就要在要写表单的渲染模板中使用WTF替换原本的标签。在html文件中，首先还是写一对<form></form>标签：
<form method="post">
</form>
然后在<form>标签中写Jinja2代码，首先开启CSRF保护：
    {{ form.csrf_token() }}
{# csrf保护 #}
再使用表单定义的类，label属性就是构造时引号中写的控件显示名，后面没有该属性的就表示时该控件，即文本框等，提交等按钮控件不需要写label属性：
    {{ form.username.label }}{{ form.username }}
    {{ form.password1.label }}{{ form.password1 }}
    {{ form.password2.label }}{{ form.password2 }}
    {{ form.submit }}

综上代码为：
py：
class Form1(FlaskForm):
    username = StringField('用户名', validators=[DataRequired()])
    password1 = PasswordField('密码', validators=[DataRequired()])
    password2 = PasswordField('确认密码', validators=[DataRequired(), equal_to('password1', '两次信息不一致')])
    submit = SubmitField('提交')

@app.route('/form', methods=['POST', 'GET'])
def login():
    form = Form1()
    if request.method == 'POST':
        username = request.form.get('username')
        password1 = request.form.get('password1')
        password2 = request.form.get('password2')
        if form.validate_on_submit():  # 提交全验证
            print(username, password1, password2)
            flash('成功')
        else:
            flash('参数有误')
    return render_template('main1.html', form=form)

html：
<form method="post">
    {{ form.csrf_token() }}
    {# csrf保护 #}
    {{ form.username.label }}{{ form.username }}
    {{ form.password1.label }}{{ form.password1 }}
    {{ form.password2.label }}{{ form.password2 }}
    {{ form.submit }}
</form>
所以综合来说，先在Python文件中定义一个类，再在一个视图函数中引用类，将实例化的对象传入html文件。html使用Jinja2语言一行行使用实例的变量构造表格。

WTForms支持的HTML标准字段
StringField	文本字段
TextAreaField	多行文本字段
PasswordField	密码文本字段
HiddenField	隐藏文件字段
DateField	文本字段，值为 datetime.date 文本格式
DateTimeField	文本字段，值为 datetime.datetime 文本格式
IntegerField	文本字段，值为整数
DecimalField	文本字段，值为decimal.Decimal
FloatField	文本字段，值为浮点数
BooleanField	复选框，值为True 和 False
RadioField	一组单选框
SelectField	下拉列表
SelectMutipleField	下拉列表，可选择多个值
FileField	文件上传字段
SubmitField	表单提交按钮
FormField	把表单作为字段嵌入另一个表单
FieldList	一组指定类型的字段

WTForms常用验证函数
验证函数	说明
DataRequired	确保字段中有数据
EqualTo	比较两个字段的值，常用于比较两次密码输入
Length	验证输入的字符串长度
NumberRange	验证输入的值在数字范围内
URL	验证URL
AnyOf	验证输入值在可选列表中
NoneOf	验证输入值不在可选列表中
5.2处理表单数据
表单数据的处理涉及很多内容，除去表单提交不说，从获取数据到保存数据大致会经历以下步骤：
1）解析请求，获取表单数据。
2）对数据进行必要的转换，比如将勾选框的值转换成Python的布尔值。
3）验证数据是否符合要求，同时验证CSRF令牌。
4）如果验证未通过则需要生成错误消息，并在模板中显示错误消息。
5）如果通过验证，就把数据保存到数据库或做进一步处理。
5.2.1提交表单数据
在HTML中，当<form>标签声明的表单中类型为submit的提交字段被单击时，就会创建一个提交表单的HTTP请求，请求中包含表单各个字段的数据。表单的提交行为主要由三个属性控制。
action：是表单提交时发送请求的目标URL，默认值为当前URL，即渲染该模板的页面的路由对应URL。如果想发送到其他URL，需要自行定义
method：提交表单的HTTP请求方法，目前仅支持使用GET和POST方法，默认为get。当使用GET方法提交表单数据时，表单的数据会以查询字符串的形式附加在请求的URL里，比如：
http://localhost:5000/basic?username=greyli&password=12345
GET方式仅适用于长度不超过3000个字符，且不包含敏感信息的表单。因为这种方式会直接将用户提交的表单数据暴露在URL中，容易被攻击者截获，示例中的情况明显是危险的。因此，出于安全的考虑，我们一般使用POST方法提交表单。使用POST方法时，按照默认的编码类型，表单数据会被存储在请求主体中，比如：
POST /basic HTTP/1.0
...
Content-Type: application/x-www-form-urlencoded
Content-Length: 30
username=greyli&password=12345
Flask为路由设置默认监听的HTTP方法为GET。为了支持接收表单提交发送的POST请求，我们必须在app.route（）装饰器里使用methods关键字为路由指定HTTP方法。
enctype：表单数据的编码烈性，当表单中包含文件上传字段时需要设为multipart/form-data，也可以是纯文本类型text/plain，默认是application/X-WWW-form-urlencoded
5.2.2验证表单数据
5.2.2.1客户端验证
指在客户端（比如Web浏览器）本地设置的对用户的输入值进行验证。比如，使用HTML5内置的验证属性即可实现基本的客户端验证（type、required、min、max、accept等）。比如，下面的username字段添加了required标志：
<input type="text" name="username" required>
如果用户没有输入内容而按下提交按钮，会弹出浏览器内置的错误提示。和其他附加HTML属性相同，我们可以在定义表单时通过render_kw传入这些属性，或是在渲染表单时传入。像required这类布尔值属性，值可以为空或是任意ASCII字符，比如：{{ form.username(required='') }}。除了使用HTML5提供的属性实现基本的客户端验证，我们通常会使用JavaScript实现完善的验证机制。可以考虑使用各种JavaScript表单验证库，比如jQuery Validation Plugin（https://jqueryvalidation.org/）、Parsley.js（http://parsleyjs.org/）以及可与Bootstrap集成的BootstrapValidator（http://1000hz.github.io/bootstrap-validator/，目前仅支持Bootstrap3版本）等。
客户端方式可以实时动态提示用户输入是否正确，只有用户输入正确后才会将表单数据发送到服务器。客户端验证可以增强用户体验，降低服务器负载。
5.2.2.2服务器端验证
服务器端验证（server side validation）是指用户把输入的数据提交到服务器端，在服务器端对数据进行验证。如果验证出错，就在返回的响应中加入错误信息。用户修改后再次提交表单，直到通过验证。我们在Flask程序中使用WTForms实现的就是服务器端验证。
5.2.2.3WTFroms验证
WTForms验证表单字段的方式是在实例化表单类时传入表单数据，然后对表单实例调用validate（）方法。这会逐个对字段调用字段实例化时定义的验证器，返回表示验证结果的布尔值。如果验证失败，就把错误消息存储到表单实例的errors属性对应的字典中。
实例：
>>> from wtforms import Form, StringField, PasswordField, BooleanField
>>> from wtforms.validators import DataRequired, Length
>>> class LoginForm(Form):
... username = StringField('Username', validators=[DataRequired()])
... password = PasswordField('Password', validators=[DataRequired()
, Length(8, 128)])
>>> form = LoginForm(username='', password='123')
>>> form.data # 表单数据字典
{'username': '', 'password': '123'}
>>> form.validate()
False
>>> form.errors # 错误消息字典
{'username': [u'This field is required.'], 'password': [u'Field must be
at least 6 characters long.']}
>>> form2 = LoginForm(username='greyli', password='123456')
>>> form2.data
{'username': 'greyli', 'password': '123456'}
>>> form2.validate()
True
>>> form2.errors
{}
因为我们的表单使用POST方法提交，如果单纯使用WTForms，我们在实例化表单类时需要首先把request.form传入表单类，而使用Flask_WTF时，表单类继承的FlaskForm基类默认会从request.form获取表单数据，所以不需要手动传入。
使用POST方法提交的表单，其数据会被Flask解析为一个字典，可以通过请求对象的form属性获取（request.form）；使用GET方法提交的表单的数据同样会被解析为字典，不过要通过请求对象的args属性获取（request.args）。
5.2.2.4视图函数验证
因为现在的basic_form视图同时接收两种类型的请求：GET请求和POST请求。所以我们要根据请求方法的不同执行不同的代码。具体来说：首先是实例化表单，如果是GET请求，那么就渲染模板；如果是POST请求，就调用validate（）方法验证表单数据。请求的HTTP方法可以通过request.method属性获取：
from flask import request
...
@app.route('/basic', methods=['GET', 'POST'])
def basic():
form = LoginForm() # GET + POST
if request.method == 'POST' and form.validate()://if form.validate_on_submit():
... # 处理POST请求
return render_template('forms/basic.html', form=form) # 处理GET请求
当请求方法是GET时，会跳过这个if语句，渲染basic.html模板，由于一般默认请求方式是get，所以一般首先显示是填写表单的模板；当请求的方法是POST时（说明用户提交了表单，点击了提交按钮），则验证表单数据。这会逐个字段（包括CSRF令牌字段）调用附加的验证器进行验证。如果通过验证就执行对应操作。如果form.validate_on_submit（）返回True，则表示用户提交了表单，且表单通过验证，那么我们就可以在这个if语句内获取表单数据。
表单类的data属性是一个匹配所有字段与对应数据的字典，我们一般直接通过“form.字段属性名.data”的形式来获取对应字段的数据。例如，form.username.data返回username字段的值。
实例：
from flask import Flask, render_template, redirect, url_for, flash
...
@app.route('/basic', methods=['GET', 'POST'])
def basic():
form = LoginForm()
if form.validate_on_submit():
username = form.username.data
flash('Welcome home, %s!' % username)
return redirect(url_for('index'))
return render_template('basic.html', form=form)
在这个if语句内，如果不使用重定向的话，当if语句执行完毕后会继续执行最后的render_template（）函数渲染模板，最后像往常一样返回一个常规的200响应，但这会造成一个问题：
在浏览器中，当单击F5刷新/重载时的默认行为是发送上一个请求。如果上一个请求是POST请求，那么就会弹出一个确认窗口，询问用户是否再次提交表单。为了避免出现这个容易让人产生困惑的提示，我们尽量不要让提交表单的POST请求作为最后一个请求。这就是为什么我们在处理表单后返回一个重定向响应，这会让浏览器重新发送一个新的GET请求到重定向的目标URL。最终，最后一个请求就变成了GET请求。这种用来防止重复提交表单的技术称为PRG（Post/Redirect/Get）模式，即通过对提交表单的POST请求返回重定向响应将最后一个请求转换为GET请求。

因为WTForms会自动对CSRF令牌字段进行验证，如果没有渲染该字段会导致验证出错，错误消息为“CSRF token is missing”。
除了POST方法，如果请求的方法是PUT、PATCH和DELETE方法，form.validate_on_submit（）也会验证表单数据。
5.3模板渲染错误信息





5.2.2.1验证


---

## [回到目录](#目录) &emsp; &emsp;[查询更多](https://github.com/Didnelpsun/notes)

### 参考

1. 
