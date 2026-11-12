package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class n72 implements jn4 {
    public final j03 a;
    public final /* synthetic */ o72 b;
    public final /* synthetic */ Object c;

    public n72(o72 r1, Object r2) {
        this.b = r1;
        this.c = r2;
        int[] r3 = m02.a;
        this.a = new j03();
    }

    @Override // defpackage.jn4
    public final void a() {
        o72.c(this.b, this.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [ea] */
    /* JADX WARN: Type inference failed for: r5v10, types: [cx2] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [cx2] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [f13] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [f13] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // defpackage.jn4
    public final void b(ea r12) {
        c72 r11 = (c72) this.b.w.g(this.c);
        if (r11 == null) goto L7;
        w12 r13 = r11.Q;
        if (r13 == null) goto L7;
        cx2 r14 = (cx2) r13.g;
    L8:
        if (r14 != null) goto L10;
        return;
    L10:
        if (r14.A == true) goto L12;
        return;
    L12:
        if (r14.n.A == true) goto L14;
        cz1.b("visitSubtreeIf called on an unattached node");
    L14:
        f13 r1 = new f13(new cx2[16]);
        cx2 r15 = r14.n;
        cx2 r3 = r15.s;
        if (r3 != null) goto L17;
        j51.b(r1, r15);
    L18:
        int r16 = r1.p;
        if (r16 == 0) goto L88;
        cx2 r17 = (cx2) r1.k(r16 - 1);
        if ((r17.q & 262144) == 0) goto L63;
        cx2 r4 = r17;
    L23:
        if (r4 == null) goto L63;
        if (r4.A == false) goto L63;
        if ((r4.p & 262144) == 0) goto L62;
        ?? r6 = 0;
        ?? r5 = r4;
    L29:
        if (r5 == 0) goto L62;
        if ((r5 instanceof rx4) == true) goto L32;
        if ((r5.p & 262144) == 0) goto L61;
        if ((r5 instanceof fo0) == false) goto L61;
        cx2 r7 = ((fo0) r5).C;
        int r8 = 0;
        r5 = r5;
        r6 = r6;
    L47:
        if (r7 == null) goto L59;
        if ((r7.p & 262144) == 0) goto L58;
        r8 = r8 + 1;
        r6 = r6;
        if (r8 != 1) goto L53;
        r5 = r7;
        goto L58
    L53:
        if (r6 != 0) goto L55;
        r6 = new f13(new cx2[16]);
    L55:
        if (r5 == 0) goto L57;
        r6.b(r5);
        r5 = 0;
    L57:
        r6.b(r7);
    L58:
        r7 = r7.s;
        r5 = r5;
        r6 = r6;
        goto L47
    L59:
        if (r8 == 1) goto L29;
    L61:
        r5 = j51.c(r6);
        goto L29
    L32:
        rx4 r9 = (rx4) r5;
        boolean r10 = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode".equals(r9.f());
        qx4 r18 = qx4.o;
        if (r10 == false) goto L35;
        r12.invoke(r9);
        qx4 r19 = r18;
    L37:
        if (r19 == qx4.p) goto L89;
        if (r19 == r18) goto L18;
    L89:
        return;
    L35:
        r19 = qx4.n;
    L62:
        r4 = r4.s;
    L63:
        j51.b(r1, r17);
        goto L18
    L88:
        return;
    L17:
        r1.b(r3);
    L7:
        r14 = null;
        goto L8
    }

    @Override // defpackage.jn4
    public final int c() {
        c72 r1 = (c72) this.b.w.g(this.c);
        if (r1 != null) goto L5;
        return 0;
    L5:
        return ((c13) r1.n()).n.p;
    }

    @Override // defpackage.jn4
    public final void d(int r6, long r7) {
        o72 r0 = this.b;
        c72 r1 = (c72) r0.w.g(this.c);
        if (r1 != null) goto L5;
        return;
    L5:
        if (r1.G() == false) goto L16;
        int r2 = ((c13) r1.n()).n.p;
        if (r6 < 0) goto L9;
        if (r6 >= r2) goto L9;
    L11:
        if (r1.H() == false) goto L13;
        cz1.a("Pre-measure called on node that is not placed");
    L13:
        c72 r3 = r0.n;
        r3.C = true;
        ((ra) h12.L(r1)).r((c72) ((c13) r1.n()).get(r6), r7);
        r3.C = false;
        this.a.a(r6);
        return;
    L9:
        cz1.d("Index (" + r6 + ") is out of bound of [0, " + r2 + ")");
        goto L11
    }
}
