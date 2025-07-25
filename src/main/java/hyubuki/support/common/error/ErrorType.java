package hyubuki.support.common.error;

import org.springframework.boot.logging.LogLevel;
import org.springframework.http.HttpStatus;

public interface ErrorType {

  HttpStatus getHttpStatus();
  ErrorCode getErrorCode();
  String getMessage();
  LogLevel getLogLevel();

}
