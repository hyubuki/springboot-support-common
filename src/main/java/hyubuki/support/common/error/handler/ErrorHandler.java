package hyubuki.support.common.error.handler;

import hyubuki.support.common.error.DomainException;
import hyubuki.support.common.response.CommonResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorHandler {

  //  @Autowired
//  private SlackApiHandler slackApiHandler;
  private final Logger log = LoggerFactory.getLogger(getClass());

  @org.springframework.web.bind.annotation.ExceptionHandler(exception = DomainException.class)
  public ResponseEntity<CommonResponse<?>> handleException(DomainException e) {

    switch (e.getErrorType().getLogLevel()) {
      case ERROR -> log.error("DomainException : {}", e.getMessage(), e);
      case WARN -> log.warn("DomainException : {}", e.getMessage(), e);
    }

    return new ResponseEntity<>(CommonResponse.fail(e.getErrorType(), e.getData()), e.getErrorType().getHttpStatus());
  }
}
