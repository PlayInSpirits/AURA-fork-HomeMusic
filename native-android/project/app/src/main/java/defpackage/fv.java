package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface fv {
    public static final ev a = null;

    static {
        a = ev.a;
    }

    default float a(float r2, float r3, float r4) {
        a.getClass();
        float r5 = r3 + r2;
        if (r2 < 0.0f) goto L8;
        if (r5 > r4) goto L8;
    L11:
        return 0.0f;
    L8:
        if (r2 < 0.0f) goto L10;
    L12:
        float r6 = r5 - r4;
        if (Math.abs(r2) >= Math.abs(r6)) goto L15;
        return r2;
    L15:
        return r6;
    L10:
        if (r5 <= r4) goto L12;
        goto L11
    }
}
