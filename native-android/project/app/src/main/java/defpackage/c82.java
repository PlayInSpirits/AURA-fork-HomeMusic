package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c82 {
    public final u44 a;
    public final wc b;
    public final w03 c;

    public c82(u44 r1, wc r2) {
        this.a = r1;
        this.b = r2;
        long[] r3 = v54.a;
        this.c = new w03();
    }

    public final wf1 a(int r7, Object r8) {
        w03 r0 = this.c;
        b82 r1 = (b82) r0.g(r8);
        int r2 = 3;
        if (r1 != null) goto L5;
    L10:
        b82 r3 = new b82(this, r7, r8);
        r0.l(r8, r3);
        r70 r9 = r3.c;
        if (r9 != null) goto L14;
        r70 r6 = new r70(818252804, true, new ib(r2, this, r3));
        r3.c = r6;
        return r6;
    L14:
        return r9;
    L5:
        if (r1.b != r7) goto L10;
        r70 r10 = r1.c;
        if (r10 != null) goto L15;
        r70 r11 = new r70(818252804, true, new ib(r2, r1.d, r1));
        r1.c = r11;
        return r11;
    L15:
        return r10;
    }

    public final Object b(Object r3) {
        if (r3 != null) goto L6;
        return null;
    L6:
        if (((b82) this.c.g(r3)) == null) goto L8;
        return null;
    L8:
        p03 r2 = (p03) ((nc3) this.b.invoke()).c.p;
        int r4 = r2.d(r3);
        if (r4 < 0) goto L11;
        int r5 = r2.c[r4];
    L11:
        return null;
    }
}
