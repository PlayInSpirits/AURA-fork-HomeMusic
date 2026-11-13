package androidx.media3.exoplayer.source;

import androidx.media3.common.ParserException;
import defpackage.gy3;
import defpackage.yw1;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class UnrecognizedInputFormatException extends ParserException {
    public final yw1 p;

    public UnrecognizedInputFormatException(String str, gy3 gy3Var) {
        super(str, null, false, 1);
        this.p = yw1.k(gy3Var);
    }

    @Override // androidx.media3.common.ParserException, java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        yw1 yw1Var = this.p;
        if (yw1Var.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + yw1Var;
    }
}
