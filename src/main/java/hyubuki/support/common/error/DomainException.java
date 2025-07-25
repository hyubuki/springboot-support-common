package hyubuki.support.common.error;


public class DomainException extends RuntimeException {
  private final ErrorType errorType;
  private final Object data;

  public DomainException(ErrorType errorType) {
    super(errorType.getMessage());
    this.errorType = errorType;
    this.data = null;
  }

  public DomainException(ErrorType errorType, Object data) {
    super(errorType.getMessage());
    this.errorType = errorType;
    this.data = data;
  }

  public ErrorType getErrorType() {
    return this.errorType;
  }

  public Object getData() {
    return this.data;
  }
}
