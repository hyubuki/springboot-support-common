package hyubuki.support.common.error;

import org.springframework.boot.logging.LogLevel;
import org.springframework.http.HttpStatus;

public enum EmbeddedErrorType implements ErrorType {

  DEFAULT_ERROR(
      HttpStatus.INTERNAL_SERVER_ERROR,
      ErrorCode.S500,
      "An unexpected error has occurred.",
      LogLevel.ERROR
  ),
  ;

  private final HttpStatus httpStatus;
  private final ErrorCode errorCode;
  private final String message;
  private final LogLevel logLevel;

  EmbeddedErrorType(HttpStatus httpStatus, ErrorCode errorCode, String message, LogLevel logLevel) {
    this.httpStatus = httpStatus;
    this.errorCode = errorCode;
    this.message = message;
    this.logLevel = logLevel;
  }

  @Override
  public HttpStatus getHttpStatus() {
    return this.httpStatus;
  }

  @Override
  public ErrorCode getErrorCode() {
    return this.errorCode;
  }

  @Override
  public String getMessage() {
    return this.message;
  }

  @Override
  public LogLevel getLogLevel() {
    return this.logLevel;
  }
}
