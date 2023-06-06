import org.slf4j.Logger
import org.slf4j.LoggerFactory

/**
 *  HTTP 요청을 받는 웹 서버
 *  싱글톤으로 작성
 *  @author 김정민
 */
object WebServer {

    val log: Logger = LoggerFactory.getLogger(WebServer::class.java)
}