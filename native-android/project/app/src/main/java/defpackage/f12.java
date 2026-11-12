package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f12 {
    public final int a;
    public final int b;
    public final wo0 c;

    public f12(int r1, int r2, wo0 r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        if (r1 >= 0) goto L6;
        fz1.a("startIndex should be >= 0");
    L6:
        if (r2 <= 0) goto L8;
        return;
    L8:
        fz1.a("size should be > 0");
    }
}
