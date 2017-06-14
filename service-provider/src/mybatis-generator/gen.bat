set CLASSPATH=mysql-connector-java-5.1.37.jar;mapper-3.3.9.jar;mybatis-generator-core-1.3.5.jar
set mainClassName=org.mybatis.generator.api.ShellRunner
java -classpath "%CLASSPATH%" "%mainClassName%" -configfile generatorConfig.xml -overwrite
pause