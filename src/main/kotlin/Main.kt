import org.apache.catalina.startup.Tomcat
import java.io.File

fun main() {
    val webAppDirection = "webapps/"
    val tomcat = Tomcat()
    tomcat.setPort(8080)
    tomcat.addWebapp("/", File(webAppDirection).absolutePath)
    WebServer.log.info("configuring app with base dir: {}",
        File("./${webAppDirection}").absolutePath)
    tomcat.start()
    tomcat.server.await()


}