package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vf4 extends cx2 implements u62 {
    public float B;
    public float C;
    public float D;
    public float E;
    public boolean F;

    @Override // defpackage.u62
    public final vi2 r(cf2 r7, pi2 r8, long r9) {
        int r2 = 0;
        if (Float.isNaN(this.D) == true) goto L7;
        int r0 = r7.V(this.D);
        if (r0 >= 0) goto L9;
        r0 = 0;
    L9:
        if (Float.isNaN(this.E) == true) goto L13;
        int r3 = r7.V(this.E);
        if (r3 >= 0) goto L15;
        r3 = 0;
    L15:
        if (Float.isNaN(this.B) == true) goto L23;
        int r4 = r7.V(this.B);
        if (r4 >= 0) goto L19;
        r4 = 0;
    L19:
        if (r4 <= r0) goto L21;
        r4 = r0;
    L21:
        if (r4 == Integer.MAX_VALUE) goto L23;
    L25:
        if (Float.isNaN(this.C) == true) goto L33;
        int r5 = r7.V(this.C);
        if (r5 >= 0) goto L29;
        r5 = 0;
    L29:
        if (r5 <= r3) goto L31;
        r5 = r3;
    L31:
        if (r5 == Integer.MAX_VALUE) goto L33;
        r2 = r5;
    L33:
        long r1 = qc0.a(r4, r0, r2, r3);
        if (this.F == false) goto L61;
        int r6 = nc0.j(r9);
        int r10 = nc0.h(r9);
        int r11 = nc0.i(r9);
        int r12 = nc0.g(r9);
        int r13 = nc0.j(r1);
        if (r13 >= r6) goto L38;
        r13 = r6;
    L38:
        if (r13 <= r10) goto L40;
        r13 = r10;
    L40:
        int r14 = nc0.h(r1);
        if (r14 < r6) goto L44;
        r6 = r14;
    L44:
        if (r6 > r10) goto L47;
        r10 = r6;
    L47:
        int r15 = nc0.i(r1);
        if (r15 >= r11) goto L50;
        r15 = r11;
    L50:
        if (r15 <= r12) goto L52;
        r15 = r12;
    L52:
        int r16 = nc0.g(r1);
        if (r16 < r11) goto L56;
        r11 = r16;
    L56:
        if (r11 > r12) goto L59;
        r12 = r11;
    L59:
        long r17 = qc0.a(r13, r10, r15, r12);
    L85:
        jg3 r18 = r8.r(r17);
        return r7.v(r18.n, r18.o, v01.n, new la(r18, 5));
    L61:
        if (Float.isNaN(this.B) == true) goto L63;
        int r19 = nc0.j(r1);
    L67:
        if (Float.isNaN(this.D) == true) goto L69;
        int r20 = nc0.h(r1);
    L73:
        if (Float.isNaN(this.C) == true) goto L75;
        int r21 = nc0.i(r1);
    L79:
        if (Float.isNaN(this.E) == true) goto L81;
        int r22 = nc0.g(r1);
    L84:
        r17 = qc0.a(r19, r20, r21, r22);
        goto L85
    L81:
        r22 = nc0.g(r9);
        int r23 = nc0.i(r1);
        if (r22 >= r23) goto L84;
        r22 = r23;
        goto L84
    L75:
        r21 = nc0.i(r9);
        int r24 = nc0.g(r1);
        if (r21 <= r24) goto L79;
        r21 = r24;
        goto L79
    L69:
        r20 = nc0.h(r9);
        int r25 = nc0.j(r1);
        if (r20 >= r25) goto L73;
        r20 = r25;
        goto L73
    L63:
        r19 = nc0.j(r9);
        int r26 = nc0.h(r1);
        if (r19 <= r26) goto L67;
        r19 = r26;
    L23:
        r4 = 0;
        goto L25
    L13:
        r3 = Integer.MAX_VALUE;
        goto L15
    L7:
        r0 = Integer.MAX_VALUE;
        goto L9
    }
}
