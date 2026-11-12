package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ob1 implements Comparable {
    public final int n;
    public final int o;
    public final String p;
    public final String q;

    public ob1(int r1, int r2, String r3, String r4) {
        r3.getClass();
        r4.getClass();
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r3) {
        ob1 r4 = (ob1) r3;
        r4.getClass();
        int r0 = this.n - r4.n;
        if (r0 == 0) goto L5;
        return r0;
    L5:
        return this.o - r4.o;
    }
}
