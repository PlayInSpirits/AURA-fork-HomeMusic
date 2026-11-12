package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface rd {
    boolean a();

    long b();

    hd5 c();

    ce d(long r1);

    default boolean e(long r3) {
        if (r3 < b()) goto L6;
        return true;
    L6:
        return false;
    }

    Object f(long r1);

    Object g();
}
