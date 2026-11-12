package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jj5 extends kj5 {
    public jj5(String r2, String r3) {
        char[] r4 = r3.toCharArray();
        super(new hj5(r2, r4), '=');
        if (r4.length != 64) goto L5;
        return;
    L5:
        nz2.c();
        throw null;
    }

    @Override // defpackage.kj5
    public final void a(StringBuilder r7, byte[] r8, int r9) {
        int r1 = 0;
        fu.R(0, r9, r8.length);
        int r0 = r9;
    L4:
        if (r0 < 3) goto L6;
        int r3 = r8[r1] & 255;
        int r2 = (((r8[r1 + 1] & 255) << 8) | (r3 << 16)) | (r8[r1 + 2] & 255);
        hj5 r4 = this.a;
        char[] r5 = r4.b;
        char[] r6 = r4.b;
        r7.append(r5[r2 >>> 18]);
        r7.append(r6[(r2 >>> 12) & 63]);
        r7.append(r6[(r2 >>> 6) & 63]);
        r7.append(r6[r2 & 63]);
        r1 = r1 + 3;
        r0 = r0 - 3;
        goto L4
    L6:
        if (r1 >= r9) goto L10;
        b(r7, r8, r1, r9 - r1);
        return;
    }
}
