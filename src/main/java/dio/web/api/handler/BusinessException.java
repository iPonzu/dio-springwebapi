package dio.web.api.handler;

public class BusinessException extends RuntimeException {
    public BusinessException(String messagem) {
        super(messagem);
    }
    public BusinessException(String messagem, Object... params) {
        super(String.format(messagem, params));
    }
}
