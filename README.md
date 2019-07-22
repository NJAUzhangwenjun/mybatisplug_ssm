# 这是ssm整合mybatisplus的简单项目




## 用法
    
    1.  将项目下载下来或者克伦下来，删除我已经生成的main/java中的以及main/resources类（注意：
        配置文件和test/java下的CodeGenerator类不要删除！！！），修改test中的CodeGenerator类，
        修改成自己需要的属性（如数据库连接，要生成的用的表明等）
        
    2.  修改jdbc数据库的相关信息，如果上面修改了包名，则在配置文件里也将相应的包名修改
    
    3.  如果请求返回类型不全是json格式，则将Controller类上的注解ResController修改为Controller
    
    4.  pom文件中只有最基础的ssm的依赖，如需要其他的，则要自行导入
    
    5.  如何使用生成的代码，请到mybatisplus官网自行查看 https://mp.baomidou.com/guide/
    
## 现在就可以轻松使用了
