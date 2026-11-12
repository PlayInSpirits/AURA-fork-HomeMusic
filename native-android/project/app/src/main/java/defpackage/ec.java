package defpackage;

import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ec extends Handler {
    public static final ec a = null;

    static {
        a = new ec();
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord r4) {
        r4.getClass();
        CopyOnWriteArraySet r3 = dc.a;
        String r5 = r4.getLoggerName();
        r5.getClass();
        int r0 = r4.getLevel().intValue();
        Level r1 = Level.INFO;
        if (r0 <= r1.intValue()) goto L6;
        int r2 = 5;
    L9:
        String r6 = r4.getMessage();
        r6.getClass();
        dc.a(r5, r2, r6, r4.getThrown());
        return;
    L6:
        if (r4.getLevel().intValue() != r1.intValue()) goto L8;
        r2 = 4;
        goto L9
    L8:
        r2 = 3;
        goto L9
    }
}
