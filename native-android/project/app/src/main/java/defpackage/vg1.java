package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vg1 {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final i03 e;
    public final rp4 f;

    public vg1(int r6, ArrayList r7) {
        this.a = r7;
        this.b = r6;
        if (r6 >= 0) goto L6;
        oo3.a("Invalid start index");
    L6:
        this.d = new ArrayList();
        i03 r8 = new i03();
        int r9 = r7.size();
        int r0 = 0;
        int r1 = 0;
    L7:
        if (r0 >= r9) goto L9;
        i42 r2 = (i42) this.a.get(r0);
        int r3 = r2.c;
        int r4 = r2.d;
        r8.i(r3, new hk1(r0, r1, r4));
        r1 = r1 + r4;
        r0 = r0 + 1;
        goto L7
    L9:
        this.e = r8;
        this.f = new rp4(new ug1(this));
    }

    public final boolean a(int r18, int r19) {
        i03 r0 = this.e;
        hk1 r2 = (hk1) r0.b(r18);
        if (r2 == null) goto L27;
        int r4 = r2.b;
        int r5 = r19 - r2.c;
        r2.c = r19;
        if (r5 == 0) goto L25;
        Object[] r1 = r0.c;
        long[] r3 = r0.a;
        int r6 = r3.length - 2;
        if (r6 < 0) goto L36;
        int r7 = 0;
    L9:
        long r8 = r3[r7];
        if (((((~r8) << 7) & r8) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L23;
        int r10 = 8 - ((~(r7 - r6)) >>> 31);
        int r12 = 0;
    L12:
        if (r12 >= r10) goto L22;
        if ((255 & r8) >= 128) goto L21;
        hk1 r13 = (hk1) r1[(r7 << 3) + r12];
        int r14 = r13.b;
        if (r14 < r4) goto L21;
        if (r13 == r2) goto L21;
        int r15 = r14 + r5;
        if (r15 < 0) goto L21;
        r13.b = r15;
    L21:
        r8 = r8 >> 8;
        r12 = r12 + 1;
        goto L12
    L22:
        if (r10 == 8) goto L23;
        return true;
    L23:
        if (r7 == r6) goto L38;
        r7 = r7 + 1;
        goto L9
    L38:
        return true;
    L36:
        return true;
    L25:
        return true;
    L27:
        return false;
    }
}
