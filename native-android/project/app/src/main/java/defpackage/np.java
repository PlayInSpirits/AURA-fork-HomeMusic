package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class np extends op {
    public np(String r2, String r3) {
        char[] r4 = r3.toCharArray();
        super(new lp(r2, r4), '=');
        if (r4.length != 64) goto L5;
        boolean r1 = true;
    L6:
        rr2.l(r1);
        return;
    L5:
        r1 = false;
        goto L6
    }

    @Override // defpackage.op
    public final void b(StringBuilder r7, byte[] r8, int r9) {
        int r1 = 0;
        rr2.u(0, r9, r8.length);
        int r0 = r9;
    L4:
        if (r0 < 3) goto L6;
        int r4 = r1 + 2;
        int r2 = ((r8[r1 + 1] & 255) << 8) | ((r8[r1] & 255) << 16);
        r1 = r1 + 3;
        int r3 = r2 | (r8[r4] & 255);
        lp r5 = this.a;
        char[] r6 = r5.b;
        char[] r10 = r5.b;
        r7.append(r6[r3 >>> 18]);
        r7.append(r10[(r3 >>> 12) & 63]);
        r7.append(r10[(r3 >>> 6) & 63]);
        r7.append(r10[r3 & 63]);
        r0 = r0 - 3;
        goto L4
    L6:
        if (r1 >= r9) goto L10;
        a(r7, r8, r1, r9 - r1);
        return;
    }
}
