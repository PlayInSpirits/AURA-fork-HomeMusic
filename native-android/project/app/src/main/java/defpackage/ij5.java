package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ij5 extends kj5 {
    public final char[] e;

    public ij5(hj5 r5) {
        super(r5, null);
        this.e = new char[512];
        char[] r6 = r5.b;
        if (r6.length != 16) goto L9;
        int r0 = 0;
    L6:
        if (r0 >= 256) goto L8;
        char[] r1 = this.e;
        r1[r0] = r6[r0 >>> 4];
        r1[r0 | 256] = r6[r0 & 15];
        r0 = r0 + 1;
        goto L6
    L8:
        return;
    L9:
        nz2.c();
        throw null;
    }

    @Override // defpackage.kj5
    public final void a(StringBuilder r5, byte[] r6, int r7) {
        int r1 = 0;
        fu.R(0, r7, r6.length);
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
