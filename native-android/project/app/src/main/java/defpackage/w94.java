package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w94 {
    public static final int a = 0;
    public static final f01 b = null;
    public static final f01 c = null;
    public static final f01 d = null;
    public static final f01 e = null;
    public static final int f = 0;

    static {
        a = kb4.W("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 12);
        b = new f01(1, "PERMIT");
        c = new f01(1, "TAKEN");
        d = new f01(1, "BROKEN");
        e = new f01(1, "CANCELLED");
        f = kb4.W("kotlinx.coroutines.semaphore.segmentSize", 16, 12);
    }
}
