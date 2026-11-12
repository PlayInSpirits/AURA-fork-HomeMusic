package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ov0 {
    public static final /* synthetic */ int a = 0;

    static {
        new nv0(3, null, 0);
        new nv0(3, null, 1);
    }

    public static final long a(long r3) {
        float r1 = 0.0f;
        if (Float.isNaN(k45.b(r3)) == false) goto L5;
        float r0 = 0.0f;
    L7:
        if (Float.isNaN(k45.c(r3)) == true) goto L11;
        r1 = k45.c(r3);
    L11:
        return e35.h(r0, r1);
    L5:
        r0 = k45.b(r3);
        goto L7
    }
}
