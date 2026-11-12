package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cp0 extends tl4 {
    public static final Object h = new Object();
    public long c;
    public int d;
    public p03 e;
    public Object f;
    public int g;

    public cp0(long j) {
        super(j);
        p03 p03Var = r73.a;
        p03Var.getClass();
        this.e = p03Var;
        this.f = h;
    }

    @Override // defpackage.tl4
    public final void a(tl4 tl4Var) {
        tl4Var.getClass();
        cp0 cp0Var = (cp0) tl4Var;
        this.e = cp0Var.e;
        this.f = cp0Var.f;
        this.g = cp0Var.g;
    }

    @Override // defpackage.tl4
    public final tl4 b(long j) {
        return new cp0(j);
    }

    public final boolean c(dp0 dp0Var, ch4 ch4Var) {
        boolean z;
        boolean z2;
        Object obj = jh4.c;
        synchronized (obj) {
            z = true;
            z2 = (this.c == ch4Var.g() && this.d == ch4Var.h()) ? false : true;
        }
        if (this.f == h || (z2 && this.g != d(dp0Var, ch4Var))) {
            z = false;
        }
        if (!z || !z2) {
            return z;
        }
        synchronized (obj) {
            this.c = ch4Var.g();
            this.d = ch4Var.h();
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d8 A[PHI: r11
  0x00d8: PHI (r11v1 int) = (r11v0 int), (r11v2 int) binds: [B:30:0x00a9, B:40:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00de A[Catch: all -> 0x00cc, LOOP:3: B:29:0x009c->B:44:0x00de, LOOP_END, TryCatch #0 {all -> 0x00cc, blocks: (B:12:0x0025, B:15:0x0032, B:17:0x0041, B:19:0x004f, B:21:0x0059, B:24:0x0076, B:26:0x007a, B:29:0x009c, B:31:0x00ab, B:33:0x00b5, B:35:0x00bb, B:38:0x00cf, B:47:0x00f8, B:44:0x00de, B:46:0x00e8), top: B:74:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x014c A[LOOP:5: B:62:0x014a->B:63:0x014c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x00f8 A[EDGE_INSN: B:84:0x00f8->B:47:0x00f8 BREAK  A[LOOP:3: B:29:0x009c->B:44:0x00de], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [cp0] */
    /* JADX WARN: Type inference failed for: r13v5, types: [tl4] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, tl4] */
    /* JADX WARN: Type inference failed for: r18v3, types: [int] */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [int] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [int] */
    public final int d(dp0 dp0Var, ch4 ch4Var) {
        p03 p03Var;
        int iIdentityHashCode;
        Object[] objArr;
        int i;
        int i2;
        long[] jArr;
        int i3;
        Object[] objArr2;
        long[] jArr2;
        ?? r25;
        Object[] objArr3;
        long j;
        long j2;
        int i4;
        ?? r26;
        ?? I;
        synchronized (jh4.c) {
            p03Var = this.e;
        }
        int i5 = 7;
        if (p03Var.e == 0) {
            return 7;
        }
        f13 f13VarN = uc5.n();
        Object[] objArr4 = f13VarN.n;
        int i6 = f13VarN.p;
        boolean z = false;
        for (int i7 = 0; i7 < i6; i7++) {
            ((qg1) objArr4[i7]).b();
        }
        try {
            Object[] objArr5 = p03Var.b;
            int[] iArr = p03Var.c;
            long[] jArr3 = p03Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                iIdentityHashCode = 7;
                int i8 = 0;
                while (true) {
                    long j3 = jArr3[i8];
                    long j4 = -9187201950435737472L;
                    if ((((~j3) << i5) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8;
                        int i10 = 8 - ((~(i8 - length)) >>> 31);
                        i3 = i5;
                        ?? r3 = z;
                        while (r3 < i10) {
                            if ((j3 & 255) < 128) {
                                ?? r18 = (i8 << 3) + r3;
                                j2 = j4;
                                rl4 rl4Var = (rl4) objArr5[r18];
                                int i11 = i9;
                                if (iArr[r18] != 1) {
                                    jArr2 = jArr3;
                                    r25 = r3;
                                    objArr3 = objArr5;
                                    j = j3;
                                } else {
                                    if (rl4Var instanceof dp0) {
                                        dp0 dp0Var2 = (dp0) rl4Var;
                                        I = dp0Var2.g((cp0) jh4.i(dp0Var2.q, ch4Var), ch4Var, z, dp0Var2.o);
                                        p03 p03Var2 = I.e;
                                        Object[] objArr6 = p03Var2.b;
                                        long[] jArr4 = p03Var2.a;
                                        int length2 = jArr4.length - 2;
                                        jArr2 = jArr3;
                                        r26 = r3;
                                        objArr3 = objArr5;
                                        if (length2 >= 0) {
                                            int i12 = 0;
                                            while (true) {
                                                long j5 = jArr4[i12];
                                                j = j3;
                                                int iIdentityHashCode2 = iIdentityHashCode;
                                                if ((((~j5) << i3) & j5 & j2) == j2) {
                                                    iIdentityHashCode = iIdentityHashCode2;
                                                    if (i12 != length2) {
                                                        break;
                                                        break;
                                                    }
                                                    i12++;
                                                    j3 = j;
                                                    i11 = 8;
                                                } else {
                                                    int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                                    for (int i14 = 0; i14 < i13; i14++) {
                                                        if ((j5 & 255) < 128) {
                                                            iIdentityHashCode2 = (iIdentityHashCode2 * 31) + System.identityHashCode((rl4) objArr6[(i12 << 3) + i14]);
                                                        }
                                                        j5 >>= i11;
                                                    }
                                                    if (i13 != i11) {
                                                        iIdentityHashCode = iIdentityHashCode2;
                                                        break;
                                                    }
                                                    iIdentityHashCode = iIdentityHashCode2;
                                                    if (i12 != length2) {
                                                        break;
                                                    }
                                                    i12++;
                                                    j3 = j;
                                                    i11 = 8;
                                                }
                                            }
                                        } else {
                                            j = j3;
                                        }
                                    } else {
                                        jArr2 = jArr3;
                                        r26 = r3;
                                        objArr3 = objArr5;
                                        j = j3;
                                        I = jh4.i(rl4Var.a(), ch4Var);
                                    }
                                    iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(I)) * 31) + Long.hashCode(I.a);
                                    r25 = r26;
                                }
                                i4 = 8;
                            } else {
                                jArr2 = jArr3;
                                r25 = r3;
                                objArr3 = objArr5;
                                j = j3;
                                j2 = j4;
                                i4 = i9;
                            }
                            j3 = j >> i4;
                            i9 = i4;
                            j4 = j2;
                            objArr5 = objArr3;
                            z = false;
                            r3 = r25 + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        objArr2 = objArr5;
                        if (i10 != i9) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i3 = i5;
                        objArr2 = objArr5;
                    }
                    if (i8 != length) {
                        i8++;
                        i5 = i3;
                        jArr3 = jArr;
                        objArr5 = objArr2;
                        z = false;
                    } else {
                        i5 = iIdentityHashCode;
                    }
                }
                objArr = f13VarN.n;
                i = f13VarN.p;
                for (i2 = 0; i2 < i; i2++) {
                    ((qg1) objArr[i2]).a();
                }
                return iIdentityHashCode;
            }
            iIdentityHashCode = i5;
            objArr = f13VarN.n;
            i = f13VarN.p;
            while (i2 < i) {
                ((qg1) objArr[i2]).a();
            }
            return iIdentityHashCode;
        } catch (Throwable th) {
            Object[] objArr7 = f13VarN.n;
            int i15 = f13VarN.p;
            for (int i16 = 0; i16 < i15; i16++) {
                ((qg1) objArr7[i16]).a();
            }
            throw th;
        }
    }
}
