allprojects {
    repositories {
        // Official: As a general advice, you should avoid adding mavenLocal() as a repository.
        // mavenLocal()
        add(maven {
            url = uri("https://maven.aliyun.com/repository/public")
        })
        add(maven {
            url = uri("https://maven.aliyun.com/repository/spring")
        })
        add(maven {
            url = uri("https://maven.aliyun.com/repository/spring-plugin")
        })
        add(maven {
            url = uri("https://maven.aliyun.com/repository/gradle-plugin")
        })
        add(maven {
            url = uri("https://maven.aliyun.com/repository/google")
        })
        add(maven {
            url = uri("https://maven.aliyun.com/repository/grails-core")
        })
        add(maven {
            url = uri("https://maven.aliyun.com/repository/apache-snapshots")
        })
        mavenLocal()
        mavenCentral()
    }
}
