package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cw {
    public static final k10 a = new k10(-1, null, null, 0);
    public static final int b = kb4.W("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 12);
    public static final int c = kb4.W("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 12);
    public static final f01 d = new f01(1, "BUFFERED");
    public static final f01 e = new f01(1, "SHOULD_BUFFER");
    public static final f01 f = new f01(1, "S_RESUMING_BY_RCV");
    public static final f01 g = new f01(1, "RESUMING_BY_EB");
    public static final f01 h = new f01(1, "POISONED");
    public static final f01 i = new f01(1, "DONE_RCV");
    public static final f01 j = new f01(1, "INTERRUPTED_SEND");
    public static final f01 k = new f01(1, "INTERRUPTED_RCV");
    public static final f01 l = new f01(1, "CHANNEL_CLOSED");
    public static final f01 m = new f01(1, "SUSPEND");
    public static final f01 n = new f01(1, "SUSPEND_NO_WAITER");
    public static final f01 o = new f01(1, "FAILED");
    public static final f01 p = new f01(1, "NO_RECEIVE_RESULT");
    public static final f01 q = new f01(1, "CLOSE_HANDLER_CLOSED");
    public static final f01 r = new f01(1, "CLOSE_HANDLER_INVOKED");
    public static final f01 s = new f01(1, "NO_CLOSE_CAUSE");

    public static final boolean a(az azVar, Object obj, xf1 xf1Var) {
        f01 f01VarC = azVar.c(obj, xf1Var);
        if (f01VarC == null) {
            return false;
        }
        azVar.t(f01VarC);
        return true;
    }
}
