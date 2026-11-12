package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cw {
    public static final k10 a = null;
    public static final int b = 0;
    public static final int c = 0;
    public static final f01 d = null;
    public static final f01 e = null;
    public static final f01 f = null;
    public static final f01 g = null;
    public static final f01 h = null;
    public static final f01 i = null;
    public static final f01 j = null;
    public static final f01 k = null;
    public static final f01 l = null;
    public static final f01 m = null;
    public static final f01 n = null;
    public static final f01 o = null;
    public static final f01 p = null;
    public static final f01 q = null;
    public static final f01 r = null;
    public static final f01 s = null;

    static {
        a = new k10(-1, null, null, 0);
        b = kb4.W("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 12);
        c = kb4.W("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 12);
        d = new f01(1, "BUFFERED");
        e = new f01(1, "SHOULD_BUFFER");
        f = new f01(1, "S_RESUMING_BY_RCV");
        g = new f01(1, "RESUMING_BY_EB");
        h = new f01(1, "POISONED");
        i = new f01(1, "DONE_RCV");
        j = new f01(1, "INTERRUPTED_SEND");
        k = new f01(1, "INTERRUPTED_RCV");
        l = new f01(1, "CHANNEL_CLOSED");
        m = new f01(1, "SUSPEND");
        n = new f01(1, "SUSPEND_NO_WAITER");
        o = new f01(1, "FAILED");
        p = new f01(1, "NO_RECEIVE_RESULT");
        q = new f01(1, "CLOSE_HANDLER_CLOSED");
        r = new f01(1, "CLOSE_HANDLER_INVOKED");
        s = new f01(1, "NO_CLOSE_CAUSE");
    }

    public static final boolean a(az r0, Object r1, xf1 r2) {
        f01 r3 = r0.c(r1, r2);
        if (r3 == null) goto L6;
        r0.t(r3);
        return true;
    L6:
        return false;
    }
}
