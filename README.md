## 定时任务工程
注意：
目前项目中

``
com.cfca.license.check.LicensePKCS.loadLicenseFromInputStream
``
该方法截取时会抛出StringIndexOutOfBounds,原因是：

```
com.cfca.util.pki.cipher.JCrypto.initialize

fs = this.getClass().getClassLoader().getResourceAsStream("pkilicense.dat");
```
获取文件读取不到；

目前解决办法：
把源码中的文件拷贝到resources目录下；

所以当升级：
```
        <dependency>
            <groupId>com.cfca</groupId>
            <artifactId>PKIBaseRRTX</artifactId>
        </dependency>
```
该依赖时，将resources目录下的**pkilicenase.dat**文件替换成源码中的文件；
