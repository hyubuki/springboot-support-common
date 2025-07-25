package hyubuki.support.common.error;

public class ErrorContent {

  private final String errorCode;
  private final String message;
  private final Object data;

  public ErrorContent(final ErrorType type) {
    this.errorCode = type.getErrorCode().name();
    this.message = type.getMessage();
    this.data = null;
  }

  public ErrorContent(final ErrorType type, final Object data) {
    this.errorCode = type.getErrorCode().name();
    this.message = type.getMessage();
    this.data = data;
  }

  public Object getData() {
    return this.data;
  }

  public String getErrorCode() {
    return this.errorCode;
  }

  public String getMessage() {
    return this.message;
  }
}
