package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d63 implements e63 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [f13] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [f13] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r7v0, types: [cx2] */
    /* JADX WARN: Type inference failed for: r7v1, types: [cx2] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [cx2] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // defpackage.e63
    public final boolean a(cx2 r7) {
        ?? r0 = 0;
    L3:
        int r1 = 0;
        if (r7 == 0) goto L30;
        if ((r7 instanceof rn3) == true) goto L8;
        if ((r7.p & 16) == 0) goto L29;
        if ((r7 instanceof fo0) == false) goto L29;
        cx2 r2 = ((fo0) r7).C;
        r0 = r0;
        r7 = r7;
    L15:
        if (r2 == null) goto L27;
        if ((r2.p & 16) == 0) goto L26;
        r1 = r1 + 1;
        r0 = r0;
        if (r1 != 1) goto L21;
        r7 = r2;
        goto L26
    L21:
        if (r0 != 0) goto L23;
        r0 = new f13(new cx2[16]);
    L23:
        if (r7 == 0) goto L25;
        r0.b(r7);
        r7 = 0;
    L25:
        r0.b(r2);
    L26:
        r2 = r2.s;
        r0 = r0;
        r7 = r7;
        goto L15
    L27:
        if (r1 == 1) goto L3;
    L29:
        r7 = j51.c(r0);
        goto L3
    L8:
        if (((rn3) r7).z() == false) goto L29;
        return true;
    L30:
        return false;
    }

    @Override // defpackage.e63
    public final int d() {
        return 16;
    }

    @Override // defpackage.e63
    public final void i(c72 r1, long r2, fm1 r4, int r5, boolean r6) {
        r1.z(r2, r4, r5, r6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [cx2] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [cx2] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [f13] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [f13] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // defpackage.e63
    public final boolean k(fm1 r9, c72 r10) {
        f63 r8 = (f63) r10.Q.e;
        r8.getClass();
        cx2 r11 = r8.D0(g63.f(16));
        if (r11 != null) goto L6;
    L44:
        return false;
    L6:
        if (r11.A == false) goto L44;
        if (r11.n.A == true) goto L10;
        cz1.b("visitLocalDescendants called on an unattached node");
    L10:
        cx2 r12 = r11.n;
        if ((r12.q & 16) == 0) goto L44;
    L12:
        if (r12 == null) goto L44;
        if ((r12.p & 16) == 0) goto L43;
        ?? r2 = r12;
        ?? r3 = 0;
    L16:
        if (r2 == 0) goto L43;
        if ((r2 instanceof rn3) == true) goto L20;
        if ((r2.p & 16) == 0) goto L42;
        if ((r2 instanceof fo0) == false) goto L42;
        cx2 r4 = ((fo0) r2).C;
        int r6 = 0;
        r2 = r2;
        r3 = r3;
    L28:
        if (r4 == null) goto L40;
        if ((r4.p & 16) == 0) goto L39;
        r6 = r6 + 1;
        r3 = r3;
        if (r6 != 1) goto L34;
        r2 = r4;
        goto L39
    L34:
        if (r3 != 0) goto L36;
        r3 = new f13(new cx2[16]);
    L36:
        if (r2 == 0) goto L38;
        r3.b(r2);
        r2 = 0;
    L38:
        r3.b(r4);
    L39:
        r4 = r4.s;
        r2 = r2;
        r3 = r3;
        goto L28
    L40:
        if (r6 == 1) goto L16;
    L42:
        r2 = j51.c(r3);
        goto L16
    L20:
        if (((rn3) r2).X() == false) goto L42;
        r9.p = r9.n.b - 1;
        return true;
    L43:
        r12 = r12.s;
        goto L12
    }

    @Override // defpackage.e63
    public final boolean m(c72 r1) {
        return true;
    }
}
