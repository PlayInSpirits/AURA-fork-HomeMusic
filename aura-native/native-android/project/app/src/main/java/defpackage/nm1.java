package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nm1 extends s20 {
    public static final AtomicInteger M = new AtomicInteger();
    public final boolean A;
    public final boolean B;
    public jw C;
    public ln1 D;
    public int E;
    public boolean F;
    public volatile boolean G;
    public boolean H;
    public yw1 I;
    public boolean J;
    public long K;
    public boolean L;
    public final long j;
    public final int k;
    public final int l;
    public final Uri m;
    public final boolean n;
    public final int o;
    public final ci0 p;
    public final ii0 q;
    public final jw r;
    public final boolean s;
    public final boolean t;
    public final iu4 u;
    public final xk0 v;
    public final List w;
    public final ow0 x;
    public final mv1 y;
    public final be3 z;

    public nm1(xk0 xk0Var, ci0 ci0Var, ii0 ii0Var, tb1 tb1Var, boolean z, ci0 ci0Var2, ii0 ii0Var2, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, iu4 iu4Var, ow0 ow0Var, jw jwVar, mv1 mv1Var, be3 be3Var, boolean z6, boolean z7, ik3 ik3Var) {
        super(ci0Var, ii0Var, 1, tb1Var, i, obj, j, j2);
        tb1Var.getClass();
        this.j = j3;
        this.A = z;
        this.o = i2;
        this.K = z3 ? j2 - j : -9223372036854775807L;
        this.l = i3;
        this.q = ii0Var2;
        this.p = ci0Var2;
        this.F = ii0Var2 != null;
        this.B = z2;
        this.m = uri;
        this.s = z5;
        this.u = iu4Var;
        this.t = z4;
        this.v = xk0Var;
        this.w = list;
        this.x = ow0Var;
        this.r = jwVar;
        this.y = mv1Var;
        this.z = be3Var;
        this.L = z6;
        this.n = z7;
        vw1 vw1Var = yw1.o;
        this.I = gy3.r;
        this.k = M.getAndIncrement();
    }

    public static byte[] d(String str) {
        if (rr2.U(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // defpackage.jd2
    public final void a() {
        jw jwVar;
        this.D.getClass();
        if (this.C == null && (jwVar = this.r) != null) {
            k51 k51Var = (k51) jwVar.o;
            if ((k51Var instanceof qy4) || (k51Var instanceof oe1)) {
                this.C = jwVar;
                this.F = false;
            }
        }
        ii0 ii0Var = this.q;
        ci0 ci0Var = this.p;
        if (this.F) {
            ci0Var.getClass();
            ii0Var.getClass();
            c(ci0Var, ii0Var, this.B, false);
            this.E = 0;
            this.F = false;
        }
        if (this.G) {
            return;
        }
        if (!this.t) {
            c(this.i, this.b, this.A, true);
        }
        this.H = !this.G;
    }

    @Override // defpackage.jd2
    public final void b() {
        this.G = true;
    }

    public final void c(ci0 ci0Var, ii0 ii0Var, boolean z, boolean z2) {
        ii0 ii0VarB;
        boolean z3;
        long j;
        int i = this.E;
        if (z) {
            z3 = i != 0;
            ii0VarB = ii0Var;
        } else {
            long j2 = i;
            long j3 = ii0Var.g;
            ii0VarB = ii0Var.b(j2, j3 != -1 ? j3 - j2 : -1L);
            z3 = false;
        }
        try {
            rk0 rk0VarG = g(ci0Var, ii0VarB, z2);
            if (z3) {
                rk0VarG.d(this.E, false);
            }
            while (!this.G && ((k51) this.C.o).b(rk0VarG, jw.s) == 0) {
                try {
                    try {
                    } catch (EOFException e) {
                        if ((this.d.f & 16384) == 0) {
                            throw e;
                        }
                        ((k51) this.C.o).d(0L, 0L);
                        j = rk0VarG.q;
                    }
                } catch (Throwable th) {
                    this.E = (int) (rk0VarG.q - ii0Var.f);
                    throw th;
                }
            }
            j = rk0VarG.q;
            this.E = (int) (j - ii0Var.f);
            fu.k(ci0Var);
        } catch (Throwable th2) {
            fu.k(ci0Var);
            throw th2;
        }
    }

    public final int e(int i) {
        rr2.w(!this.L);
        if (i >= this.I.size()) {
            return 0;
        }
        return ((Integer) this.I.get(i)).intValue();
    }

    public final boolean f() {
        return this.K != -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:137:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:138:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:141:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:142:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:23:0x0084 A[PHI: r16 r36
  0x0084: PHI (r16v1 long) = (r16v0 long), (r16v3 long), (r16v3 long) binds: [B:40:0x00d6, B:22:0x0082, B:37:0x00bb] A[DONT_GENERATE, DONT_INLINE]
  0x0084: PHI (r36v2 rk0) = (r36v1 rk0), (r36v4 rk0), (r36v4 rk0) binds: [B:40:0x00d6, B:22:0x0082, B:37:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00af  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [java.lang.Object, k51] */
    /* JADX WARN: Type inference failed for: r19v2, types: [k51] */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, k51] */
    public final rk0 g(ci0 ci0Var, ii0 ii0Var, boolean z) throws IOException {
        int i;
        rk0 rk0Var;
        long j;
        long jU;
        jw jwVar;
        iu4 iu4Var;
        k51 oe1Var;
        boolean zC;
        om0 om0Var;
        boolean z2;
        Object obj;
        pv2 pv2Var;
        int i2;
        xn4 xn4Var;
        List list;
        List listSingletonList;
        int i3;
        k51 ky2Var;
        pv2 pv2Var2;
        long jB = ci0Var.b(ii0Var);
        long j2 = this.g;
        iu4 iu4Var2 = this.u;
        if (z) {
            try {
                iu4Var2.g(this.s, j2);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e) {
                throw new IOException(e);
            }
        }
        rk0 rk0Var2 = new rk0(ci0Var, ii0Var.f, jB);
        if (this.C == null) {
            be3 be3Var = this.z;
            rk0Var2.s = 0;
            try {
                be3Var.K(10);
                rk0Var2.e(be3Var.a, 0, 10, false);
                if (be3Var.D() != 4801587) {
                    rk0Var = null;
                    jU = -9223372036854775807L;
                    j = -9223372036854775807L;
                } else {
                    be3Var.O(3);
                    int iZ = be3Var.z();
                    int i4 = iZ + 10;
                    rk0Var = null;
                    byte[] bArr = be3Var.a;
                    j = -9223372036854775807L;
                    if (i4 > bArr.length) {
                        be3Var.K(i4);
                        System.arraycopy(bArr, 0, be3Var.a, 0, 10);
                    }
                    rk0Var2.e(be3Var.a, 10, iZ, false);
                    qv2 qv2VarO = this.y.O(iZ, be3Var.a);
                    if (qv2VarO == null) {
                        jU = j;
                    } else {
                        pv2[] pv2VarArr = qv2VarO.a;
                        int length = pv2VarArr.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                pv2Var2 = null;
                                break;
                            }
                            pv2 pv2Var3 = pv2VarArr[i5];
                            if (hq3.class.isAssignableFrom(pv2Var3.getClass())) {
                                pv2Var2 = (pv2) hq3.class.cast(pv2Var3);
                                if (!((hq3) pv2Var2).b.equals("com.apple.streaming.transportStreamTimestamp")) {
                                    pv2Var2 = null;
                                }
                            } else {
                                pv2Var2 = null;
                            }
                            if (pv2Var2 != null) {
                                break;
                            }
                            i5++;
                        }
                        hq3 hq3Var = (hq3) pv2Var2;
                        if (hq3Var == null) {
                            jU = j;
                        } else {
                            System.arraycopy(hq3Var.c, 0, be3Var.a, 0, 8);
                            be3Var.N(0);
                            be3Var.M(8);
                            jU = be3Var.u() & 8589934591L;
                        }
                    }
                }
            } catch (EOFException unused2) {
                rk0Var = null;
                j = -9223372036854775807L;
            }
            rk0Var2.s = 0;
            jw jwVar2 = this.r;
            if (jwVar2 == null) {
                Uri uri = ii0Var.a;
                Map mapJ = ci0Var.j();
                xk0 xk0Var = this.v;
                xk0Var.getClass();
                tb1 tb1Var = this.d;
                int iX = h12.x(tb1Var.n);
                List list2 = (List) mapJ.get("Content-Type");
                int iX2 = h12.x((list2 == null || list2.isEmpty()) ? rk0Var : (String) list2.get(0));
                int iY = h12.y(uri);
                ArrayList arrayList = new ArrayList(7);
                xk0.e(iX, arrayList);
                xk0.e(iX2, arrayList);
                xk0.e(iY, arrayList);
                int i6 = 0;
                for (int i7 = 7; i6 < i7; i7 = 7) {
                    xk0.e(xk0.q[i6], arrayList);
                    i6++;
                }
                rk0Var2.s = 0;
                k51 r19 = null;
                int i8 = 0;
                while (true) {
                    int size = arrayList.size();
                    iu4 iu4Var3 = this.u;
                    if (i8 >= size) {
                        j2 = j2;
                        i = 0;
                        r19.getClass();
                        jwVar = new jw(r19, tb1Var, iu4Var3, (om0) xk0Var.p, xk0Var.o);
                        break;
                    }
                    int iIntValue = ((Integer) arrayList.get(i8)).intValue();
                    int i9 = i8;
                    if (iIntValue == 0) {
                        iu4Var = iu4Var3;
                        oe1Var = new r2();
                    } else if (iIntValue == 1) {
                        iu4Var = iu4Var3;
                        oe1Var = new t2();
                    } else if (iIntValue == 2) {
                        iu4Var = iu4Var3;
                        oe1Var = new h6(0);
                    } else if (iIntValue != 7) {
                        List list3 = this.w;
                        xi4 xi4Var = xn4.m;
                        if (iIntValue == 8) {
                            iu4Var = iu4Var3;
                            om0 om0Var2 = (om0) xk0Var.p;
                            boolean z3 = xk0Var.o;
                            qv2 qv2Var = tb1Var.l;
                            if (qv2Var == null) {
                                om0Var = om0Var2;
                                z2 = z3;
                            } else {
                                pv2[] pv2VarArr2 = qv2Var.a;
                                int length2 = pv2VarArr2.length;
                                om0Var = om0Var2;
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= length2) {
                                        z2 = z3;
                                        obj = rk0Var;
                                        break;
                                    }
                                    int i11 = i10;
                                    pv2 pv2Var4 = pv2VarArr2[i11];
                                    z2 = z3;
                                    pv2[] pv2VarArr3 = pv2VarArr2;
                                    if (nn1.class.isAssignableFrom(pv2Var4.getClass())) {
                                        pv2Var = (pv2) nn1.class.cast(pv2Var4);
                                        if (((nn1) pv2Var).c.isEmpty()) {
                                            obj = pv2Var;
                                            obj = rk0Var;
                                        }
                                    } else {
                                        obj = pv2Var;
                                        obj = rk0Var;
                                    }
                                    if (obj != null) {
                                        break;
                                    }
                                    i10 = i11 + 1;
                                    z3 = z2;
                                    pv2VarArr2 = pv2VarArr3;
                                }
                                i2 = obj != null ? 4 : 0;
                                if (z2) {
                                    xn4Var = om0Var;
                                } else {
                                    i2 |= 32;
                                    xn4Var = xi4Var;
                                }
                                if (list3 != null) {
                                    list = list3;
                                } else {
                                    list = gy3.r;
                                }
                                oe1Var = new oe1(xn4Var, i2, iu4Var, list);
                            }
                            if (z2) {
                                i2 |= 32;
                                xn4Var = xi4Var;
                            } else {
                                xn4Var = om0Var;
                            }
                            if (list3 != null) {
                                list = list3;
                            } else {
                                list = gy3.r;
                            }
                            oe1Var = new oe1(xn4Var, i2, iu4Var, list);
                        } else if (iIntValue == 11) {
                            om0 om0Var3 = (om0) xk0Var.p;
                            boolean z4 = xk0Var.o;
                            if (list3 != null) {
                                i3 = 48;
                                listSingletonList = list3;
                            } else {
                                sb1 sb1Var = new sb1();
                                sb1Var.m = lw2.m("application/cea-608");
                                listSingletonList = Collections.singletonList(new tb1(sb1Var));
                                i3 = 16;
                            }
                            String str = tb1Var.k;
                            if (!TextUtils.isEmpty(str)) {
                                if (lw2.b(str, "audio/mp4a-latm") == null) {
                                    i3 |= 2;
                                }
                                if (lw2.b(str, "video/avc") == null) {
                                    i3 |= 4;
                                }
                            }
                            iu4Var = iu4Var3;
                            oe1Var = new qy4(2, !z4 ? 1 : 0, !z4 ? xi4Var : om0Var3, iu4Var3, new qn0(listSingletonList, i3));
                        } else if (iIntValue != 13) {
                            iu4Var = iu4Var3;
                            oe1Var = rk0Var;
                        } else {
                            oe1Var = new x95(tb1Var.d, iu4Var3, (om0) xk0Var.p, xk0Var.o);
                            iu4Var = iu4Var3;
                        }
                    } else {
                        iu4Var = iu4Var3;
                        oe1Var = new ky2(0L);
                    }
                    oe1Var.getClass();
                    try {
                        zC = oe1Var.c(rk0Var2);
                        i = 0;
                        rk0Var2.s = 0;
                    } catch (EOFException unused3) {
                        i = 0;
                        rk0Var2.s = 0;
                        zC = false;
                    } catch (Throwable th) {
                        rk0Var2.s = 0;
                        throw th;
                    }
                    if (zC) {
                        jwVar = new jw(oe1Var, tb1Var, iu4Var, (om0) xk0Var.p, xk0Var.o);
                        break;
                    }
                    tb1 tb1Var2 = tb1Var;
                    if (r19 == 0 && (iIntValue == iX || iIntValue == iX2 || iIntValue == iY || iIntValue == 11)) {
                        r19 = oe1Var;
                    }
                    i8 = i9 + 1;
                    tb1Var = tb1Var2;
                    arrayList = arrayList;
                    j2 = j2;
                    r19 = r19;
                }
            } else {
                k51 k51Var = (k51) jwVar2.o;
                rr2.w(!((k51Var instanceof qy4) || (k51Var instanceof oe1)));
                if (k51Var instanceof x95) {
                    ky2Var = new x95(((tb1) jwVar2.p).d, (iu4) jwVar2.q, (xn4) jwVar2.r, jwVar2.n);
                } else if (k51Var instanceof h6) {
                    ky2Var = new h6(0);
                } else if (k51Var instanceof r2) {
                    ky2Var = new r2();
                } else if (k51Var instanceof t2) {
                    ky2Var = new t2();
                } else {
                    if (!(k51Var instanceof ky2)) {
                        kf2.o("Unexpected extractor type for recreation: ".concat(k51Var.getClass().getSimpleName()));
                        return rk0Var;
                    }
                    ky2Var = new ky2(0);
                }
                jwVar = new jw(ky2Var, (tb1) jwVar2.p, (iu4) jwVar2.q, (xn4) jwVar2.r, jwVar2.n);
                j2 = j2;
                i = 0;
            }
            jw jwVar3 = jwVar;
            this.C = jwVar3;
            k51 k51Var2 = (k51) jwVar3.o;
            if ((k51Var2 instanceof h6) || (k51Var2 instanceof r2) || (k51Var2 instanceof t2) || (k51Var2 instanceof ky2)) {
                ln1 ln1Var = this.D;
                long jB2 = jU != j ? iu4Var2.b(jU) : j2;
                if (ln1Var.i0 != jB2) {
                    ln1Var.i0 = jB2;
                    kn1[] kn1VarArr = ln1Var.I;
                    int length3 = kn1VarArr.length;
                    for (int i12 = i; i12 < length3; i12++) {
                        kn1 kn1Var = kn1VarArr[i12];
                        if (kn1Var.F != jB2) {
                            kn1Var.F = jB2;
                            kn1Var.z = true;
                        }
                    }
                }
            } else {
                ln1 ln1Var2 = this.D;
                if (ln1Var2.i0 != 0) {
                    ln1Var2.i0 = 0L;
                    kn1[] kn1VarArr2 = ln1Var2.I;
                    int length4 = kn1VarArr2.length;
                    for (int i13 = i; i13 < length4; i13++) {
                        kn1 kn1Var2 = kn1VarArr2[i13];
                        if (kn1Var2.F != 0) {
                            kn1Var2.F = 0L;
                            kn1Var2.z = true;
                        }
                    }
                }
            }
            this.D.K.clear();
            ((k51) this.C.o).f(this.D);
        } else {
            i = 0;
        }
        ln1 ln1Var3 = this.D;
        ow0 ow0Var = ln1Var3.j0;
        ow0 ow0Var2 = this.x;
        if (!Objects.equals(ow0Var, ow0Var2)) {
            ln1Var3.j0 = ow0Var2;
            int i14 = i;
            while (true) {
                kn1[] kn1VarArr3 = ln1Var3.I;
                if (i14 >= kn1VarArr3.length) {
                    break;
                }
                if (ln1Var3.b0[i14]) {
                    kn1 kn1Var3 = kn1VarArr3[i14];
                    kn1Var3.I = ow0Var2;
                    kn1Var3.z = true;
                }
                i14++;
            }
        }
        return rk0Var2;
    }
}
