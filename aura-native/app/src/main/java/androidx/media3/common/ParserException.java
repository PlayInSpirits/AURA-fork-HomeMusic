package androidx.media3.common;

import defpackage.f34;
import java.io.IOException;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class ParserException extends IOException {
    public final boolean n;
    public final int o;

    public ParserException(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.n = z;
        this.o = i;
    }

    public static ParserException a(RuntimeException runtimeException, String str) {
        return new ParserException(str, runtimeException, true, 1);
    }

    public static ParserException b(String str) {
        return new ParserException(str, null, true, 4);
    }

    public static ParserException c(String str) {
        return new ParserException(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append(message != null ? message.concat(" ") : "");
        sb.append("{contentIsMalformed=");
        sb.append(this.n);
        sb.append(", dataType=");
        return f34.i(sb, this.o, "}");
    }
}
