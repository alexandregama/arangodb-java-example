# ArangoDB Java Example

### Downloading ArangoDB

[The main page](https://www.arangodb.com/download-major/)

**From homebrew**

```bash
$ brew install arangodb
```

### Starting the Server

Just run the following:

```bash
$ /usr/local/sbin/arangod
```

You will see something like the following output:

```bash
2017-09-12T01:52:54Z [11730] INFO ArangoDB 3.2.3 [darwin] 64bit, using jemalloc, VPack 0.1.30, RocksDB 5.6.0, ICU 58.1, V8 5.7.0.0, OpenSSL 1.0.2l  25 May 2017
2017-09-12T01:52:54Z [11730] INFO using storage engine mmfiles
2017-09-12T01:52:54Z [11730] INFO {cluster} Starting up with role SINGLE
2017-09-12T01:52:54Z [11730] INFO {syscall} file-descriptors (nofiles) hard limit is unlimited, soft limit is 8192
2017-09-12T01:52:54Z [11730] INFO Authentication is turned on (system only), authentication for unix sockets is turned on
2017-09-12T01:52:54Z [11730] INFO created base application directory '/usr/local/var/lib/arangodb3-apps/_db'
2017-09-12T01:52:54Z [11730] INFO WAL directory '/usr/local/var/lib/arangodb3/journals' does not exist. creating it...
2017-09-12T01:52:56Z [11730] INFO using endpoint 'http+tcp://127.0.0.1:8529' for non-encrypted requests
2017-09-12T01:53:00Z [11730] INFO ArangoDB (version 3.2.3 [darwin]) is ready for business. Have fun!
```

As you can see, have fun! =D

### Accessing the Console

Just type

```
http://localhost:8529/
```

- The default user is **root**
- Select the **_system** database

### Maven Dependency

```xml
    <dependency>
      <groupId>com.arangodb</groupId>
      <artifactId>arangodb-java-driver</artifactId>
      <version>4.2.2</version>
    </dependency>
```
