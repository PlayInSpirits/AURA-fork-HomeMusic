package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fw4 {
    public final long a;
    public final long b;
    public final boolean c;

    public fw4(long r1, long r3, boolean r5) {
        this.a = r1;
        this.b = r3;
        this.c = r5;
    }

    public final fw4 a(fw4 r8) {
        long r1 = g83.e(this.a, r8.a);
        long r3 = Math.max(this.b, r8.b);
        if (this.c == false) goto L5;
    L9:
        boolean r7 = true;
    L11:
        return new fw4(r1, r3, r7);
    L5:
        if (r8.c == true) goto L9;
        r7 = false;
        goto L11
    }
}
