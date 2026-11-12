package retrofit2;

import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class HttpException extends RuntimeException {
    private final int code;
    private final String message;
    private final transient Response<?> response;

    public HttpException(Response<?> r2) {
        super(getMessage(r2));
        this.code = r2.code();
        this.message = r2.message();
        this.response = r2;
    }

    private static String getMessage(Response<?> r2) {
        Objects.requireNonNull(r2, "response == null");
        return "HTTP " + r2.code() + " " + r2.message();
    }

    public int code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    @Nullable
    public Response<?> response() {
        return this.response;
    }
}
