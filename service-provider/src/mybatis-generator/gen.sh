#!/bin/bash -x
CLASSPATH=mysql-connector-java-6.0.6.jar:mapper-3.4.0.jar:mybatis-generator-core-1.3.5.jar
mainClassName=org.mybatis.generator.api.ShellRunner
java -classpath "$CLASSPATH" "$mainClassName" -configfile generatorConfig.xml -overwrite