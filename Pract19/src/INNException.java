public class INNException extends RuntimeException {
    INNException(String errorMessage, Throwable error) {
        super(errorMessage, error);
    }
}
