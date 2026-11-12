package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ku3 {
    public static final ju3 n = null;
    public static final z1 o = null;

    static {
        n = new ju3();
        Integer r0 = n22.a;
        if (r0 != null) goto L5;
    L8:
        z1 r1 = new fh3();
    L9:
        o = r1;
        return;
    L5:
        if (r0.intValue() >= 34) goto L8;
        r1 = new y51();
        goto L9
    }

    public ku3() {
    }

    public abstract int a(int r1);
}
