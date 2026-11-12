package kotlinx.coroutines;

import defpackage.a32;
import defpackage.h12;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class JobCancellationException extends CancellationException {
    public final transient a32 n;

    public JobCancellationException(String r1, Throwable r2, a32 r3) {
        super(r1);
        this.n = r3;
        if (r2 == null) goto L6;
        initCause(r2);
        return;
    }

    public final boolean equals(Object r3) {
        if (r3 != this) goto L4;
        return true;
    L4:
        if ((r3 instanceof JobCancellationException) == false) goto L12;
        JobCancellationException r4 = (JobCancellationException) r3;
        if (h12.c(r4.getMessage(), getMessage()) == true) goto L8;
        return false;
    L8:
        if (h12.c(r4.n, this.n) == true) goto L10;
        return false;
    L10:
        if (h12.c(r4.getCause(), getCause()) == true) goto L19;
        return false;
    L19:
        return true;
    L12:
        return false;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String r0 = getMessage();
        r0.getClass();
        int r1 = r0.hashCode() * 31;
        int r2 = (this.n.hashCode() + r1) * 31;
        Throwable r3 = getCause();
        if (r3 == null) goto L5;
        int r4 = r3.hashCode();
    L7:
        return r2 + r4;
    L5:
        r4 = 0;
        goto L7
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.n;
    }
}
