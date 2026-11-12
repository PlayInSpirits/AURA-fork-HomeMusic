package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dp0 extends sl4 implements kl4 {
    public final gf1 o;
    public final rv2 p;
    public cp0 q = new cp0(jh4.j().g());

    public dp0(gf1 gf1Var, rv2 rv2Var) {
        this.o = gf1Var;
        this.p = rv2Var;
    }

    @Override // defpackage.rl4
    public final tl4 a() {
        return this.q;
    }

    @Override // defpackage.rl4
    public final void d(tl4 tl4Var) {
        tl4Var.getClass();
        this.q = (cp0) tl4Var;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x009c A[EDGE_INSN: B:101:0x009c->B:31:0x009c BREAK  A[LOOP:1: B:16:0x0049->B:30:0x0099], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0099 A[Catch: all -> 0x0038, LOOP:1: B:16:0x0049->B:30:0x0099, LOOP_END, TryCatch #3 {all -> 0x0038, blocks: (B:8:0x0023, B:10:0x002f, B:13:0x003b, B:16:0x0049, B:18:0x0059, B:20:0x0065, B:22:0x006f, B:24:0x0087, B:26:0x008d, B:30:0x0099, B:31:0x009c), top: B:96:0x0023 }] */
    /* JADX WARN: Type inference failed for: r6v2, types: [bp0] */
    public final cp0 g(cp0 cp0Var, ch4 ch4Var, boolean z, gf1 gf1Var) {
        rv2 rv2Var;
        int i;
        cp0 cp0Var2 = cp0Var;
        if (cp0Var2.c(this, ch4Var)) {
            if (z) {
                f13 f13VarN = uc5.n();
                Object[] objArr = f13VarN.n;
                int i2 = f13VarN.p;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((qg1) objArr[i3]).b();
                }
                try {
                    p03 p03Var = cp0Var2.e;
                    z05 z05Var = ph4.a;
                    l02 l02Var = (l02) z05Var.f();
                    if (l02Var == null) {
                        l02Var = new l02();
                        z05Var.n(l02Var);
                    }
                    int i4 = l02Var.a;
                    Object[] objArr2 = p03Var.b;
                    int[] iArr = p03Var.c;
                    long[] jArr = p03Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i5 != length) {
                                    break;
                                    break;
                                }
                                i5++;
                            } else {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j & 255) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        rl4 rl4Var = (rl4) objArr2[i9];
                                        i = i6;
                                        l02Var.a = i4 + iArr[i9];
                                        if1 if1VarE = ch4Var.e();
                                        if (if1VarE != null) {
                                            if1VarE.invoke(rl4Var);
                                        }
                                    } else {
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                                if (i5 != length) {
                                    break;
                                }
                                i5++;
                            }
                        }
                    }
                    l02Var.a = i4;
                } finally {
                    Object[] objArr3 = f13VarN.n;
                    int i10 = f13VarN.p;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((qg1) objArr3[i11]).a();
                    }
                }
            }
            return cp0Var2;
        }
        final p03 p03Var2 = new p03();
        z05 z05Var2 = ph4.a;
        final l02 l02Var2 = (l02) z05Var2.f();
        if (l02Var2 == null) {
            l02Var2 = new l02();
            z05Var2.n(l02Var2);
        }
        final int i12 = l02Var2.a;
        f13 f13VarN2 = uc5.n();
        Object[] objArr4 = f13VarN2.n;
        int i13 = f13VarN2.p;
        for (int i14 = 0; i14 < i13; i14++) {
            ((qg1) objArr4[i14]).b();
        }
        try {
            l02Var2.a = i12 + 1;
            Object objD = ya4.D(new if1() { // from class: bp0
                @Override // defpackage.if1
                public final Object invoke(Object obj) {
                    if (obj == this.n) {
                        kf2.o("A derived state calculation cannot read itself");
                        return null;
                    }
                    if (obj instanceof rl4) {
                        int i15 = l02Var2.a - i12;
                        p03 p03Var3 = p03Var2;
                        int iD = p03Var3.d(obj);
                        p03Var3.g(Math.min(i15, iD >= 0 ? p03Var3.c[iD] : Integer.MAX_VALUE), obj);
                    }
                    return j15.a;
                }
            }, gf1Var);
            l02Var2.a = i12;
            Object[] objArr5 = f13VarN2.n;
            int i15 = f13VarN2.p;
            for (int i16 = 0; i16 < i15; i16++) {
                ((qg1) objArr5[i16]).a();
            }
            Object obj = jh4.c;
            synchronized (obj) {
                try {
                    ch4 ch4VarJ = jh4.j();
                    Object obj2 = cp0Var2.f;
                    if (obj2 == cp0.h || (rv2Var = this.p) == null || !rv2Var.i(objD, obj2)) {
                        cp0 cp0Var3 = this.q;
                        synchronized (obj) {
                            tl4 tl4VarM = jh4.m(cp0Var3, this);
                            tl4VarM.a(cp0Var3);
                            tl4VarM.a = ch4VarJ.g();
                            cp0Var2 = (cp0) tl4VarM;
                            cp0Var2.e = p03Var2;
                            cp0Var2.g = cp0Var2.d(this, ch4VarJ);
                            cp0Var2.f = objD;
                        }
                        return cp0Var2;
                    }
                    cp0Var2.e = p03Var2;
                    cp0Var2.g = cp0Var2.d(this, ch4VarJ);
                } catch (Throwable th) {
                    throw th;
                }
            }
            l02 l02Var3 = (l02) ph4.a.f();
            if (l02Var3 == null || l02Var3.a != 0) {
                return cp0Var2;
            }
            jh4.j().m();
            synchronized (obj) {
                ch4 ch4VarJ2 = jh4.j();
                cp0Var2.c = ch4VarJ2.g();
                cp0Var2.d = ch4VarJ2.h();
                return cp0Var2;
            }
        } catch (Throwable th2) {
            Object[] objArr6 = f13VarN2.n;
            int i17 = f13VarN2.p;
            for (int i18 = 0; i18 < i17; i18++) {
                ((qg1) objArr6[i18]).a();
            }
            throw th2;
        }
    }

    @Override // defpackage.kl4
    public final Object getValue() {
        if1 if1VarE = jh4.j().e();
        if (if1VarE != null) {
            if1VarE.invoke(this);
        }
        ch4 ch4VarJ = jh4.j();
        return g((cp0) jh4.i(this.q, ch4VarJ), ch4VarJ, true, this.o).f;
    }

    public final cp0 h() {
        ch4 ch4VarJ = jh4.j();
        return g((cp0) jh4.i(this.q, ch4VarJ), ch4VarJ, false, this.o);
    }

    public final String toString() {
        cp0 cp0Var = (cp0) jh4.h(this.q);
        return "DerivedState(value=" + (cp0Var.c(this, jh4.j()) ? String.valueOf(cp0Var.f) : "<Not calculated>") + ")@" + hashCode();
    }
}
