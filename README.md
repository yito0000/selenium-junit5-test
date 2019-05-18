# selenium-junit5-test

### 実行環境
* docker
* java8

### 実行方法
アプリをビルド、適当なサーバへデプロイしてAPサーバを用意

dockerを使ってselenium hub, selenium gridを用意
```$xslt
docker-compose up -d
``` 

com.example.seleniumjunit5test.controllerのtestAppメソッドを修正
```$xslt
driver.get("http://xxxxx/input");
```
ドメインを設定

テスト実行



