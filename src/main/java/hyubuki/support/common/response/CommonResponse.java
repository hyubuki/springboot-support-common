package hyubuki.support.common.response;

import hyubuki.support.common.error.ErrorContent;
import hyubuki.support.common.error.ErrorType;

public class CommonResponse<T> {

  private final ApiResult apiResult;
  private final T data;
  private final ErrorContent errorContent;

  public CommonResponse(final ApiResult apiResult, final T data, final ErrorContent errorContent) {
    this.apiResult = apiResult;
    this.data = data;
    this.errorContent = errorContent;
  }

  public T getData() {
    return this.data;
  }

  public ErrorContent getErrorContent() {
    return this.errorContent;
  }

  public ApiResult getApiResult() {
    return this.apiResult;
  }

  public static CommonResponse<?> success() {
    return new CommonResponse<>(ApiResult.SUCCESS, null, null);
  }

  public static <T> CommonResponse<?> success(T data) {
    return new CommonResponse<>(ApiResult.SUCCESS, data, null);
  }

  public static CommonResponse<?> fail(final ErrorType errorType) {
    return new CommonResponse<>(ApiResult.FAIL, null, new ErrorContent(errorType, null));
  }

  public static CommonResponse<?> fail(final ErrorType errorType, final Object data) {
    return new CommonResponse<>(ApiResult.FAIL, null, new ErrorContent(errorType, data));
  }
}
