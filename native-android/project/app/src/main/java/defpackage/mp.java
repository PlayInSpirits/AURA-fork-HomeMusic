package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mp extends op {
    public final char[] e;

    public mp(lp r5) {
        super(r5, null);
        this.e = new char[512];
        char[] r6 = r5.b;
        int r2 = 0;
        if (r6.length != 16) goto L5;
        boolean r0 = true;
    L6:
        rr2.l(r0);
    L8:
        if (r2 >= 256) goto L10;
        char[] r1 = this.e;
        r1[r2] = r6[r2 >>> 4];
        r1[r2 | 256] = r6[r2 & 15];
        r2 = r2 + 1;
        goto L8
    L10:
        return;
    L5:
        r0 = false;
        goto L6
    }

    @Override // defpackage.op
    public final void b(StringBuilder r5, byte[] r6, int r7) {
        int r1 = 0;
        rr2.u(0, r7, r6.length);
    L3:
        if (r1 >= r7) goto L5;
        int r0 = r6[r1] & 255;
        char[] r2 = this.e;
        r5.append(r2[r0]);
        r5.append(r2[r0 | 256]);
        r1 = r1 + 1;
        goto L3
    }
}
