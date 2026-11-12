package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dp0 extends sl4 implements kl4 {
    public final gf1 o;
    public final rv2 p;
    public cp0 q;

    public dp0(gf1 r3, rv2 r4) {
        this.o = r3;
        this.p = r4;
        this.q = new cp0(jh4.j().g());
    }

    @Override // defpackage.rl4
    public final tl4 a() {
        return this.q;
    }

    @Override // defpackage.rl4
    public final void d(tl4 r1) {
        r1.getClass();
        this.q = (cp0) r1;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [bp0] */
    public final cp0 g(cp0 r21, ch4 r22, boolean r23, gf1 r24) {
        cp0 r1 = r21;
        if (r1.c(this, r22) == false) goto L40;
        if (r23 == false) goto L39;
        f13 r3 = uc5.n();
        Object[] r0 = r3.n;
        int r5 = r3.p;
        int r6 = 0;
    L6:
        if (r6 >= r5) goto L96;
        ((qg1) r0[r6]).b();
        r6 = r6 + 1;
        goto L6
    L96:
        p03 r2 = r1.e;     // Catch: Throwable -> L11
        z05 r7 = ph4.a;     // Catch: Throwable -> L11
        l02 r8 = (l02) r7.f();     // Catch: Throwable -> L11
        if (r8 != null) goto L13;
        r8 = new l02();     // Catch: Throwable -> L11
        r7.n(r8);     // Catch: Throwable -> L11
    L13:
        int r9 = r8.a;     // Catch: Throwable -> L11
        Object[] r10 = r2.b;     // Catch: Throwable -> L11
        int[] r11 = r2.c;     // Catch: Throwable -> L11
        long[] r4 = r2.a;     // Catch: Throwable -> L11
        int r12 = r4.length - 2;     // Catch: Throwable -> L11
        if (r12 < 0) goto L31;
        int r13 = 0;
    L16:
        long r14 = r4[r13];     // Catch: Throwable -> L11
        if (((((~r14) << 7) & r14) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L29;
        int r15 = 8;
        int r16 = 8 - ((~(r13 - r12)) >>> 31);     // Catch: Throwable -> L11
        int r17 = 0;
    L19:
        if (r17 >= r16) goto L28;
        if ((r14 & 255) >= 128) goto L25;
        int r18 = (r13 << 3) + r17;     // Catch: Throwable -> L11
        rl4 r19 = (rl4) r10[r18];     // Catch: Throwable -> L11
        int r20 = r15;
        r8.a = r9 + r11[r18];     // Catch: Throwable -> L11
        if1 r110 = r22.e();     // Catch: Throwable -> L11
        if (r110 == null) goto L26;
        r110.invoke(r19);     // Catch: Throwable -> L11
    L26:
        r14 = r14 >> r20;     // Catch: Throwable -> L11
        r17 = r17 + 1;     // Catch: Throwable -> L11
        r15 = r20;
        goto L19
    L25:
        r20 = r15;
        goto L26
    L28:
        if (r16 != r15) goto L31;
    L29:
        if (r13 == r12) goto L31;
        r13 = r13 + 1;     // Catch: Throwable -> L11
    L31:
        r8.a = r9;     // Catch: Throwable -> L11
        Object[] r25 = r3.n;
        int r26 = r3.p;
        int r27 = 0;
    L33:
        if (r27 >= r26) goto L39;
        ((qg1) r25[r27]).a();
        r27 = r27 + 1;
    L11:
        th = move-exception;
        Object[] r28 = r3.n;
        int r29 = r3.p;
        int r30 = 0;
    L36:
        if (r30 >= r29) goto L38;
        ((qg1) r28[r30]).a();
        r30 = r30 + 1;
        goto L36
    L38:
        throw th;
    L39:
        return r1;
    L40:
        final p03 r31 = new p03();
        z05 r32 = ph4.a;
        final l02 r33 = (l02) r32.f();
        if (r33 != null) goto L43;
        r33 = new l02();
        r32.n(r33);
    L43:
        final int r34 = r33.a;
        f13 r35 = uc5.n();
        Object[] r36 = r35.n;
        int r37 = r35.p;
        int r38 = 0;
    L44:
        if (r38 >= r37) goto L94;
        ((qg1) r36[r38]).b();
        r38 = r38 + 1;
        goto L44
    L94:
        r33.a = r34 + 1;     // Catch: Throwable -> L86
        Object r39 = ya4.D(new bp0(this, r33, r31, r34), r24);     // Catch: Throwable -> L86
        r33.a = r34;     // Catch: Throwable -> L86
        Object[] r40 = r35.n;
        int r41 = r35.p;
        int r42 = 0;
    L49:
        if (r42 >= r41) goto L51;
        ((qg1) r40[r42]).a();
        r42 = r42 + 1;
        goto L49
    L51:
        Object r43 = jh4.c;
        monitor-enter(r43);
        ch4 r44 = jh4.j();     // Catch: Throwable -> L60
        Object r45 = r1.f;     // Catch: Throwable -> L60
        if (r45 == cp0.h) goto L62;
        rv2 r46 = this.p;     // Catch: Throwable -> L60
        if (r46 == null) goto L62;
        if (r46.i(r39, r45) != true) goto L62;
        r1.e = r31;     // Catch: Throwable -> L60
        r1.g = r1.d(this, r44);     // Catch: Throwable -> L60
    L67:
        monitor-exit(r43);
        l02 r47 = (l02) ph4.a.f();
        if (r47 != null) goto L71;
    L80:
        return r1;
    L71:
        if (r47.a != 0) goto L80;
        jh4.j().m();
        monitor-enter(r43);
        ch4 r48 = jh4.j();     // Catch: Throwable -> L77
        r1.c = r48.g();     // Catch: Throwable -> L77
        r1.d = r48.h();     // Catch: Throwable -> L77
        monitor-exit(r43);
        return r1;
    L77:
        th = move-exception;
        throw th;
    L62:
        cp0 r49 = this.q;     // Catch: Throwable -> L60
        monitor-enter(r43);     // Catch: Throwable -> L60
        tl4 r50 = jh4.m(r49, this);     // Catch: Throwable -> L81
        r50.a(r49);     // Catch: Throwable -> L81
        r50.a = r44.g();     // Catch: Throwable -> L81
        monitor-exit(r43);     // Catch: Throwable -> L60
        r1 = (cp0) r50;     // Catch: Throwable -> L60
        r1.e = r31;     // Catch: Throwable -> L60
        r1.g = r1.d(this, r44);     // Catch: Throwable -> L60
        r1.f = r39;     // Catch: Throwable -> L60
        goto L67
    L81:
        th = move-exception;
        throw th;     // Catch: Throwable -> L60
    L60:
        th = move-exception;
        throw th;
    L86:
        th = move-exception;
        Object[] r51 = r35.n;
        int r52 = r35.p;
        int r53 = 0;
    L88:
        if (r53 >= r52) goto L90;
        ((qg1) r51[r53]).a();
        r53 = r53 + 1;
        goto L88
    L90:
        throw th;
    }

    @Override // defpackage.kl4
    public final Object getValue() {
        if1 r0 = jh4.j().e();
        if (r0 == null) goto L5;
        r0.invoke(this);
    L5:
        ch4 r1 = jh4.j();
        return g((cp0) jh4.i(this.q, r1), r1, true, this.o).f;
    }

    public final cp0 h() {
        ch4 r0 = jh4.j();
        return g((cp0) jh4.i(this.q, r0), r0, false, this.o);
    }

    public final String toString() {
        cp0 r0 = (cp0) jh4.h(this.q);
        cp0 r1 = (cp0) jh4.h(this.q);
        if (r1.c(this, jh4.j()) == false) goto L5;
        String r2 = String.valueOf(r1.f);
    L7:
        return "DerivedState(value=" + r2 + ")@" + hashCode();
    L5:
        r2 = "<Not calculated>";
        goto L7
    }
}
