package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kc0 extends jc0 {
    public p00[] A0;
    public p00[] B0;
    public int C0;
    public boolean D0;
    public boolean E0;
    public WeakReference F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public final HashSet J0;
    public final kr K0;
    public ArrayList p0 = new ArrayList();
    public final qp4 q0 = new qp4(this);
    public final xo0 r0;
    public int s0;
    public nr3 t0;
    public boolean u0;
    public final eb2 v0;
    public int w0;
    public int x0;
    public int y0;
    public int z0;

    public kc0() {
        xo0 xo0Var = new xo0();
        xo0Var.b = true;
        xo0Var.c = true;
        xo0Var.f = new ArrayList();
        new ArrayList();
        xo0Var.h = null;
        xo0Var.i = new kr();
        xo0Var.g = new ArrayList();
        xo0Var.d = this;
        xo0Var.e = this;
        this.r0 = xo0Var;
        this.t0 = null;
        this.u0 = false;
        this.v0 = new eb2();
        this.y0 = 0;
        this.z0 = 0;
        this.A0 = new p00[4];
        this.B0 = new p00[4];
        this.C0 = 257;
        this.D0 = false;
        this.E0 = false;
        this.F0 = null;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = new HashSet();
        this.K0 = new kr();
    }

    public static void R(jc0 jc0Var, nr3 nr3Var, kr krVar) {
        int i;
        int i2;
        if (nr3Var == null) {
            return;
        }
        int i3 = jc0Var.f0;
        int[] iArr = jc0Var.t;
        if (i3 == 8 || (jc0Var instanceof pk1) || (jc0Var instanceof ep)) {
            krVar.e = 0;
            krVar.f = 0;
            return;
        }
        int[] iArr2 = jc0Var.o0;
        krVar.a = iArr2[0];
        krVar.b = iArr2[1];
        krVar.c = jc0Var.o();
        krVar.d = jc0Var.i();
        krVar.i = false;
        krVar.j = 0;
        boolean z = krVar.a == 3;
        boolean z2 = krVar.b == 3;
        boolean z3 = z && jc0Var.V > 0.0f;
        boolean z4 = z2 && jc0Var.V > 0.0f;
        if (z && jc0Var.r(0) && jc0Var.r == 0 && !z3) {
            krVar.a = 2;
            if (z2 && jc0Var.s == 0) {
                krVar.a = 1;
            }
            z = false;
        }
        if (z2 && jc0Var.r(1) && jc0Var.s == 0 && !z4) {
            krVar.b = 2;
            if (z && jc0Var.r == 0) {
                krVar.b = 1;
            }
            z2 = false;
        }
        if (jc0Var.y()) {
            krVar.a = 1;
            z = false;
        }
        if (jc0Var.z()) {
            krVar.b = 1;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                krVar.a = 1;
            } else if (!z2) {
                if (krVar.b == 1) {
                    i2 = krVar.d;
                } else {
                    krVar.a = 2;
                    nr3Var.d(jc0Var, krVar);
                    i2 = krVar.f;
                }
                krVar.a = 1;
                krVar.c = (int) (jc0Var.V * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                krVar.b = 1;
            } else if (!z) {
                if (krVar.a == 1) {
                    i = krVar.c;
                } else {
                    krVar.b = 2;
                    nr3Var.d(jc0Var, krVar);
                    i = krVar.e;
                }
                krVar.b = 1;
                int i4 = jc0Var.W;
                float f = jc0Var.V;
                if (i4 == -1) {
                    krVar.d = (int) (i / f);
                } else {
                    krVar.d = (int) (f * i);
                }
            }
        }
        nr3Var.d(jc0Var, krVar);
        jc0Var.K(krVar.e);
        jc0Var.H(krVar.f);
        jc0Var.E = krVar.h;
        int i5 = krVar.g;
        jc0Var.Z = i5;
        jc0Var.E = i5 > 0;
        krVar.j = 0;
    }

    @Override // defpackage.jc0
    public final void A() {
        this.v0.t();
        this.w0 = 0;
        this.x0 = 0;
        this.p0.clear();
        super.A();
    }

    @Override // defpackage.jc0
    public final void C(yc5 yc5Var) {
        super.C(yc5Var);
        int size = this.p0.size();
        for (int i = 0; i < size; i++) {
            ((jc0) this.p0.get(i)).C(yc5Var);
        }
    }

    @Override // defpackage.jc0
    public final void L(boolean z, boolean z2) {
        super.L(z, z2);
        int size = this.p0.size();
        for (int i = 0; i < size; i++) {
            ((jc0) this.p0.get(i)).L(z, z2);
        }
    }

    public final void N(jc0 jc0Var, int i) {
        if (i == 0) {
            int i2 = this.y0 + 1;
            p00[] p00VarArr = this.B0;
            if (i2 >= p00VarArr.length) {
                this.B0 = (p00[]) Arrays.copyOf(p00VarArr, p00VarArr.length * 2);
            }
            p00[] p00VarArr2 = this.B0;
            int i3 = this.y0;
            p00VarArr2[i3] = new p00(jc0Var, 0, this.u0);
            this.y0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.z0 + 1;
            p00[] p00VarArr3 = this.A0;
            if (i4 >= p00VarArr3.length) {
                this.A0 = (p00[]) Arrays.copyOf(p00VarArr3, p00VarArr3.length * 2);
            }
            p00[] p00VarArr4 = this.A0;
            int i5 = this.z0;
            p00VarArr4[i5] = new p00(jc0Var, 1, this.u0);
            this.z0 = i5 + 1;
        }
    }

    public final void O(eb2 eb2Var) {
        kc0 kc0Var;
        eb2 eb2Var2;
        boolean zS = S(64);
        b(eb2Var, zS);
        int size = this.p0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            jc0 jc0Var = (jc0) this.p0.get(i);
            boolean[] zArr = jc0Var.R;
            zArr[0] = false;
            zArr[1] = false;
            if (jc0Var instanceof ep) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                jc0 jc0Var2 = (jc0) this.p0.get(i2);
                if (jc0Var2 instanceof ep) {
                    ep epVar = (ep) jc0Var2;
                    for (int i3 = 0; i3 < epVar.q0; i3++) {
                        jc0 jc0Var3 = epVar.p0[i3];
                        if (epVar.s0 || jc0Var3.c()) {
                            int i4 = epVar.r0;
                            if (i4 == 0 || i4 == 1) {
                                jc0Var3.R[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                jc0Var3.R[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.J0;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            jc0 jc0Var4 = (jc0) this.p0.get(i5);
            jc0Var4.getClass();
            if (jc0Var4 instanceof pk1) {
                jc0Var4.b(eb2Var, zS);
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            if (it.hasNext()) {
                ((jc0) it.next()).getClass();
                kf2.k();
                return;
            } else if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((jc0) it2.next()).b(eb2Var, zS);
                }
                hashSet.clear();
            }
        }
        if (eb2.q) {
            HashSet<jc0> hashSet2 = new HashSet();
            for (int i6 = 0; i6 < size; i6++) {
                jc0 jc0Var5 = (jc0) this.p0.get(i6);
                jc0Var5.getClass();
                if (!(jc0Var5 instanceof pk1)) {
                    hashSet2.add(jc0Var5);
                }
            }
            kc0Var = this;
            eb2Var2 = eb2Var;
            kc0Var.a(this, eb2Var2, hashSet2, this.o0[0] == 2 ? 0 : 1, false);
            for (jc0 jc0Var6 : hashSet2) {
                uo.h(kc0Var, eb2Var2, jc0Var6);
                jc0Var6.b(eb2Var2, zS);
            }
        } else {
            kc0Var = this;
            eb2Var2 = eb2Var;
            for (int i7 = 0; i7 < size; i7++) {
                jc0 jc0Var7 = (jc0) kc0Var.p0.get(i7);
                if (jc0Var7 instanceof kc0) {
                    int[] iArr = jc0Var7.o0;
                    int i8 = iArr[0];
                    int i9 = iArr[1];
                    if (i8 == 2) {
                        jc0Var7.I(1);
                    }
                    if (i9 == 2) {
                        jc0Var7.J(1);
                    }
                    jc0Var7.b(eb2Var2, zS);
                    if (i8 == 2) {
                        jc0Var7.I(i8);
                    }
                    if (i9 == 2) {
                        jc0Var7.J(i9);
                    }
                } else {
                    uo.h(kc0Var, eb2Var2, jc0Var7);
                    if (!(jc0Var7 instanceof pk1)) {
                        jc0Var7.b(eb2Var2, zS);
                    }
                }
            }
        }
        if (kc0Var.y0 > 0) {
            l93.f(kc0Var, eb2Var2, null, 0);
        }
        if (kc0Var.z0 > 0) {
            l93.f(kc0Var, eb2Var2, null, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009a  */
    public final boolean P(int i, boolean z) {
        boolean z2;
        xo0 xo0Var = this.r0;
        ArrayList arrayList = (ArrayList) xo0Var.f;
        kc0 kc0Var = (kc0) xo0Var.d;
        boolean z3 = false;
        int iH = kc0Var.h(0);
        int iH2 = kc0Var.h(1);
        int iP = kc0Var.p();
        int iQ = kc0Var.q();
        if (z && (iH == 2 || iH2 == 2)) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ba5 ba5Var = (ba5) obj;
                if (ba5Var.f == i && !ba5Var.k()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && iH == 2) {
                    kc0Var.I(1);
                    kc0Var.K(xo0Var.d(kc0Var, 0));
                    kc0Var.d.e.d(kc0Var.o());
                }
            } else if (z && iH2 == 2) {
                kc0Var.J(1);
                kc0Var.H(xo0Var.d(kc0Var, 1));
                kc0Var.e.e.d(kc0Var.i());
            }
        }
        int[] iArr = kc0Var.o0;
        if (i == 0) {
            int i3 = iArr[0];
            if (i3 == 1 || i3 == 4) {
                int iO = kc0Var.o() + iP;
                kc0Var.d.i.d(iO);
                kc0Var.d.e.d(iO - iP);
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            int i4 = iArr[1];
            if (i4 == 1 || i4 == 4) {
                int i5 = kc0Var.i() + iQ;
                kc0Var.e.i.d(i5);
                kc0Var.e.e.d(i5 - iQ);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        xo0Var.g();
        int size2 = arrayList.size();
        int i6 = 0;
        while (i6 < size2) {
            Object obj2 = arrayList.get(i6);
            i6++;
            ba5 ba5Var2 = (ba5) obj2;
            if (ba5Var2.f == i && (ba5Var2.b != kc0Var || ba5Var2.g)) {
                ba5Var2.e();
            }
        }
        int size3 = arrayList.size();
        int i7 = 0;
        while (i7 < size3) {
            Object obj3 = arrayList.get(i7);
            i7++;
            ba5 ba5Var3 = (ba5) obj3;
            if (ba5Var3.f == i && (z2 || ba5Var3.b != kc0Var)) {
                if (!ba5Var3.h.j || !ba5Var3.i.j || (!(ba5Var3 instanceof q00) && !ba5Var3.e.j)) {
                    kc0Var.I(iH);
                    kc0Var.J(iH2);
                    return z3;
                }
            }
        }
        z3 = true;
        kc0Var.I(iH);
        kc0Var.J(iH2);
        return z3;
    }

    /* JADX WARN: Code duplicated, block: B:332:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:334:0x05da  */
    /* JADX WARN: Code duplicated, block: B:342:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:343:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:349:0x060f  */
    /* JADX WARN: Code duplicated, block: B:355:0x0628  */
    /* JADX WARN: Code duplicated, block: B:358:0x062e  */
    /* JADX WARN: Code duplicated, block: B:360:0x0636 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:362:0x063f  */
    /* JADX WARN: Code duplicated, block: B:363:0x0644  */
    /* JADX WARN: Code duplicated, block: B:368:0x0652  */
    /* JADX WARN: Code duplicated, block: B:372:0x065d  */
    /* JADX WARN: Code duplicated, block: B:375:0x0668 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:377:0x066e  */
    /* JADX WARN: Code duplicated, block: B:380:0x0676  */
    /* JADX WARN: Code duplicated, block: B:384:0x067d  */
    /* JADX WARN: Code duplicated, block: B:387:0x0687  */
    /* JADX WARN: Code duplicated, block: B:389:0x0693  */
    /* JADX WARN: Code duplicated, block: B:393:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:396:0x06b6 A[Catch: Exception -> 0x06c4, LOOP:12: B:395:0x06b4->B:396:0x06b6, LOOP_END, TryCatch #6 {Exception -> 0x06c4, blocks: (B:394:0x06a8, B:396:0x06b6, B:399:0x06cd), top: B:533:0x06a8 }] */
    /* JADX WARN: Code duplicated, block: B:404:0x06da A[Catch: Exception -> 0x0703, TRY_LEAVE, TryCatch #7 {Exception -> 0x0703, blocks: (B:402:0x06d4, B:404:0x06da), top: B:535:0x06d4 }] */
    /* JADX WARN: Code duplicated, block: B:420:0x0707  */
    /* JADX WARN: Code duplicated, block: B:423:0x070f A[Catch: Exception -> 0x06f7, TryCatch #3 {Exception -> 0x06f7, blocks: (B:409:0x06f0, B:421:0x070b, B:423:0x070f, B:425:0x0715, B:426:0x072f, B:428:0x0733, B:430:0x0739, B:434:0x074f, B:437:0x075a, B:439:0x075e, B:441:0x0764), top: B:527:0x06f0 }] */
    /* JADX WARN: Code duplicated, block: B:428:0x0733 A[Catch: Exception -> 0x06f7, TryCatch #3 {Exception -> 0x06f7, blocks: (B:409:0x06f0, B:421:0x070b, B:423:0x070f, B:425:0x0715, B:426:0x072f, B:428:0x0733, B:430:0x0739, B:434:0x074f, B:437:0x075a, B:439:0x075e, B:441:0x0764), top: B:527:0x06f0 }] */
    /* JADX WARN: Code duplicated, block: B:439:0x075e A[Catch: Exception -> 0x06f7, TryCatch #3 {Exception -> 0x06f7, blocks: (B:409:0x06f0, B:421:0x070b, B:423:0x070f, B:425:0x0715, B:426:0x072f, B:428:0x0733, B:430:0x0739, B:434:0x074f, B:437:0x075a, B:439:0x075e, B:441:0x0764), top: B:527:0x06f0 }] */
    /* JADX WARN: Code duplicated, block: B:453:0x0789  */
    /* JADX WARN: Code duplicated, block: B:460:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:462:0x07cd  */
    /* JADX WARN: Code duplicated, block: B:464:0x07e1  */
    /* JADX WARN: Code duplicated, block: B:466:0x07e5  */
    /* JADX WARN: Code duplicated, block: B:469:0x07f1  */
    /* JADX WARN: Code duplicated, block: B:471:0x07f8 A[LOOP:15: B:470:0x07f6->B:471:0x07f8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:475:0x080b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:480:0x0818 A[LOOP:14: B:479:0x0816->B:480:0x0818, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:483:0x084d  */
    /* JADX WARN: Code duplicated, block: B:487:0x085f  */
    /* JADX WARN: Code duplicated, block: B:492:0x087f  */
    /* JADX WARN: Code duplicated, block: B:493:0x088b  */
    /* JADX WARN: Code duplicated, block: B:496:0x089e  */
    /* JADX WARN: Code duplicated, block: B:497:0x08a6  */
    /* JADX WARN: Code duplicated, block: B:499:0x08aa  */
    /* JADX WARN: Code duplicated, block: B:501:0x08b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:504:0x08b9  */
    /* JADX WARN: Code duplicated, block: B:507:0x08c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:512:0x08de  */
    /* JADX WARN: Code duplicated, block: B:514:0x08e2  */
    /* JADX WARN: Code duplicated, block: B:518:0x08f3  */
    /* JADX WARN: Code duplicated, block: B:535:0x06d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:582:0x0698 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:585:0x08e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x012c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100 */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v102 */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v106 */
    /* JADX WARN: Type inference failed for: r0v107 */
    /* JADX WARN: Type inference failed for: r0v108 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r32v0, types: [jc0, kc0] */
    /* JADX WARN: Type inference failed for: r3v67, types: [int] */
    /* JADX WARN: Type inference failed for: r5v53, types: [int] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v74, types: [int] */
    /* JADX WARN: Type inference failed for: r8v22, types: [int] */
    /* JADX WARN: Type inference failed for: r9v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final void Q() {
        ?? r21;
        int i;
        int i2;
        int i3;
        int i4;
        hb0 hb0Var;
        hb0 hb0Var2;
        boolean z;
        boolean z2;
        char c;
        boolean z3;
        int i5;
        int i6;
        boolean zS;
        ?? r12;
        int i7;
        boolean z4;
        boolean z5;
        int i8;
        hb0 hb0Var3;
        boolean z6;
        boolean z7;
        int i9;
        boolean z8;
        int iMax;
        ?? r9;
        ?? r17;
        boolean z9;
        int iMax2;
        ?? r0;
        boolean z10;
        boolean z11;
        ?? r1;
        int i10;
        boolean z12;
        ?? r2;
        boolean z13;
        ?? r3;
        ?? r4;
        int i11;
        int iMax3;
        int iMax4;
        int iMax5;
        int iMax6;
        boolean zS2;
        int size;
        int i12;
        boolean z14;
        jc0 jc0Var;
        boolean z15;
        int i13;
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        hb0 hb0Var4;
        jc0 jc0Var2;
        int i14;
        int i15;
        int i16;
        int i17;
        char c2;
        aa5 aa5Var;
        aa5 aa5Var2;
        int i18;
        int iO;
        int size2;
        int i19;
        int i20;
        aa5 aa5Var3;
        int iB;
        int iB2;
        aa5 aa5Var4;
        aa5 aa5Var5;
        int i21;
        boolean z16;
        boolean[] zArr = uo.r;
        this.X = 0;
        this.Y = 0;
        this.D0 = false;
        this.E0 = false;
        int size3 = this.p0.size();
        int iMax7 = Math.max(0, o());
        int iMax8 = Math.max(0, i());
        int[] iArr = this.o0;
        int i22 = iArr[1];
        int i23 = iArr[0];
        int i24 = this.s0;
        hb0 hb0Var5 = this.I;
        hb0 hb0Var6 = this.H;
        if (i24 == 0 && uo.q(this.C0, 1)) {
            nr3 nr3Var = this.t0;
            int i25 = iArr[0];
            int i26 = iArr[1];
            B();
            ArrayList arrayList = this.p0;
            int size4 = arrayList.size();
            for (int i27 = 0; i27 < size4; i27++) {
                ((jc0) arrayList.get(i27)).B();
            }
            boolean z17 = this.u0;
            if (i25 == 1) {
                F(0, o());
            } else {
                hb0Var6.i(0);
                this.X = 0;
            }
            int i28 = 0;
            boolean z18 = false;
            boolean z19 = false;
            while (i28 < size4) {
                int i29 = i28;
                jc0 jc0Var3 = (jc0) arrayList.get(i28);
                int[] iArr2 = iArr;
                if (jc0Var3 instanceof pk1) {
                    pk1 pk1Var = (pk1) jc0Var3;
                    z16 = z18;
                    if (pk1Var.t0 == 1) {
                        int i30 = pk1Var.q0;
                        if (i30 != -1) {
                            pk1Var.N(i30);
                        } else if (pk1Var.r0 != -1 && y()) {
                            pk1Var.N(o() - pk1Var.r0);
                        } else if (y()) {
                            pk1Var.N((int) ((pk1Var.p0 * o()) + 0.5f));
                        }
                        z16 = true;
                    }
                } else {
                    z16 = z18;
                    if ((jc0Var3 instanceof ep) && ((ep) jc0Var3).P() == 0) {
                        z18 = z16;
                        z19 = true;
                    }
                    i28 = i29 + 1;
                    iArr = iArr2;
                }
                z18 = z16;
                i28 = i29 + 1;
                iArr = iArr2;
            }
            r21 = iArr;
            if (z18) {
                for (int i31 = 0; i31 < size4; i31 = i21 + 1) {
                    jc0 jc0Var4 = (jc0) arrayList.get(i31);
                    if (jc0Var4 instanceof pk1) {
                        pk1 pk1Var2 = (pk1) jc0Var4;
                        i21 = i31;
                        if (pk1Var2.t0 == 1) {
                            q05.p(0, pk1Var2, nr3Var, z17);
                        }
                    } else {
                        i21 = i31;
                    }
                }
            }
            q05.p(0, this, nr3Var, z17);
            if (z19) {
                for (int i32 = 0; i32 < size4; i32++) {
                    jc0 jc0Var5 = (jc0) arrayList.get(i32);
                    if (jc0Var5 instanceof ep) {
                        ep epVar = (ep) jc0Var5;
                        if (epVar.P() == 0 && epVar.O()) {
                            q05.p(1, epVar, nr3Var, z17);
                        }
                    }
                }
            }
            if (i26 == 1) {
                G(0, i());
            } else {
                hb0Var5.i(0);
                this.Y = 0;
            }
            int i33 = 0;
            boolean z20 = false;
            boolean z21 = false;
            while (i33 < size4) {
                jc0 jc0Var6 = (jc0) arrayList.get(i33);
                int i34 = i33;
                if (jc0Var6 instanceof pk1) {
                    pk1 pk1Var3 = (pk1) jc0Var6;
                    if (pk1Var3.t0 == 0) {
                        int i35 = pk1Var3.q0;
                        if (i35 != -1) {
                            pk1Var3.N(i35);
                        } else if (pk1Var3.r0 != -1 && z()) {
                            pk1Var3.N(i() - pk1Var3.r0);
                        } else if (z()) {
                            pk1Var3.N((int) ((pk1Var3.p0 * i()) + 0.5f));
                        }
                        z20 = true;
                    }
                } else if ((jc0Var6 instanceof ep) && ((ep) jc0Var6).P() == 1) {
                    z21 = true;
                }
                i33 = i34 + 1;
            }
            if (z20) {
                for (int i36 = 0; i36 < size4; i36++) {
                    jc0 jc0Var7 = (jc0) arrayList.get(i36);
                    if (jc0Var7 instanceof pk1) {
                        pk1 pk1Var4 = (pk1) jc0Var7;
                        if (pk1Var4.t0 == 0) {
                            q05.C(1, pk1Var4, nr3Var);
                        }
                    }
                }
            }
            q05.C(0, this, nr3Var);
            if (z21) {
                for (int i37 = 0; i37 < size4; i37++) {
                    jc0 jc0Var8 = (jc0) arrayList.get(i37);
                    if (jc0Var8 instanceof ep) {
                        ep epVar2 = (ep) jc0Var8;
                        if (epVar2.P() == 1 && epVar2.O()) {
                            q05.C(1, epVar2, nr3Var);
                        }
                    }
                }
            }
            for (int i38 = 0; i38 < size4; i38++) {
                jc0 jc0Var9 = (jc0) arrayList.get(i38);
                if (jc0Var9.x() && q05.g(jc0Var9)) {
                    R(jc0Var9, nr3Var, q05.a);
                    if (!(jc0Var9 instanceof pk1)) {
                        q05.p(0, jc0Var9, nr3Var, z17);
                        q05.C(0, jc0Var9, nr3Var);
                    } else if (((pk1) jc0Var9).t0 == 0) {
                        q05.C(0, jc0Var9, nr3Var);
                    } else {
                        q05.p(0, jc0Var9, nr3Var, z17);
                    }
                }
            }
            for (int i39 = 0; i39 < size3; i39++) {
                jc0 jc0Var10 = (jc0) this.p0.get(i39);
                if (jc0Var10.x() && !(jc0Var10 instanceof pk1) && !(jc0Var10 instanceof ep)) {
                    int iH = jc0Var10.h(0);
                    int iH2 = jc0Var10.h(1);
                    if (iH != 3 || jc0Var10.r == 1 || iH2 != 3 || jc0Var10.s == 1) {
                        R(jc0Var10, this.t0, new kr());
                    }
                }
            }
        } else {
            r21 = iArr;
        }
        eb2 eb2Var = this.v0;
        if (size3 <= 2 || !((i23 == 2 || i22 == 2) && uo.q(this.C0, 1024))) {
            i = iMax7;
            i2 = size3;
            i3 = i22;
            i4 = i23;
            hb0Var = hb0Var5;
            hb0Var2 = hb0Var6;
        } else {
            nr3 nr3Var2 = this.t0;
            ArrayList arrayList2 = this.p0;
            int size5 = arrayList2.size();
            int i40 = 0;
            while (true) {
                if (i40 < size5) {
                    jc0 jc0Var11 = (jc0) arrayList2.get(i40);
                    ?? r5 = r21[0];
                    ?? r6 = r21[1];
                    int[] iArr3 = jc0Var11.o0;
                    int i41 = i40;
                    if (gi1.a0(r5, r6, iArr3[0], iArr3[1])) {
                        i40 = i41 + 1;
                    } else {
                        i14 = iMax7;
                        i2 = size3;
                        i15 = iMax8;
                        i16 = i22;
                        i17 = i23;
                        hb0Var = hb0Var5;
                        hb0Var2 = hb0Var6;
                    }
                } else {
                    i2 = size3;
                    hb0Var = hb0Var5;
                    hb0Var2 = hb0Var6;
                    int i42 = 0;
                    ArrayList arrayList3 = null;
                    ArrayList arrayList4 = null;
                    ArrayList arrayList5 = null;
                    ArrayList arrayList6 = null;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    while (i42 < size5) {
                        int i43 = i42;
                        jc0 jc0Var12 = (jc0) arrayList2.get(i42);
                        int i44 = iMax8;
                        ?? r7 = r21[0];
                        int i45 = i22;
                        ?? r8 = r21[1];
                        int i46 = iMax7;
                        int[] iArr4 = jc0Var12.o0;
                        int i47 = i23;
                        if (!gi1.a0(r7, r8, iArr4[0], iArr4[1])) {
                            R(jc0Var12, nr3Var2, this.K0);
                        }
                        boolean z22 = jc0Var12 instanceof pk1;
                        if (z22) {
                            pk1 pk1Var5 = (pk1) jc0Var12;
                            if (pk1Var5.t0 == 0) {
                                if (arrayList8 == null) {
                                    arrayList8 = new ArrayList();
                                }
                                arrayList8.add(pk1Var5);
                            }
                            if (pk1Var5.t0 == 1) {
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(pk1Var5);
                            }
                        }
                        if (jc0Var12 instanceof ep) {
                            if (jc0Var12 instanceof ep) {
                                ep epVar3 = (ep) jc0Var12;
                                if (epVar3.P() == 0) {
                                    if (arrayList5 == null) {
                                        arrayList5 = new ArrayList();
                                    }
                                    arrayList5.add(epVar3);
                                }
                                if (epVar3.P() == 1) {
                                    if (arrayList7 == null) {
                                        arrayList7 = new ArrayList();
                                    }
                                    arrayList7.add(epVar3);
                                }
                            } else {
                                ep epVar4 = (ep) jc0Var12;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                }
                                arrayList5.add(epVar4);
                                if (arrayList7 == null) {
                                    arrayList7 = new ArrayList();
                                }
                                arrayList7.add(epVar4);
                            }
                        }
                        if (jc0Var12.H.f == null && jc0Var12.J.f == null && !z22 && !(jc0Var12 instanceof ep)) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList6.add(jc0Var12);
                        }
                        if (jc0Var12.I.f == null && jc0Var12.K.f == null && jc0Var12.L.f == null && !z22 && !(jc0Var12 instanceof ep)) {
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList4.add(jc0Var12);
                        }
                        i42 = i43 + 1;
                        iMax8 = i44;
                        i22 = i45;
                        iMax7 = i46;
                        i23 = i47;
                    }
                    i14 = iMax7;
                    i15 = iMax8;
                    i16 = i22;
                    i17 = i23;
                    ArrayList arrayList9 = new ArrayList();
                    if (arrayList3 != null) {
                        int size6 = arrayList3.size();
                        int i48 = 0;
                        while (i48 < size6) {
                            Object obj = arrayList3.get(i48);
                            i48++;
                            gi1.n((pk1) obj, 0, arrayList9, null);
                        }
                    }
                    if (arrayList5 != null) {
                        int size7 = arrayList5.size();
                        int i49 = 0;
                        while (i49 < size7) {
                            Object obj2 = arrayList5.get(i49);
                            i49++;
                            ep epVar5 = (ep) obj2;
                            aa5 aa5VarN = gi1.n(epVar5, 0, arrayList9, null);
                            epVar5.N(0, aa5VarN, arrayList9);
                            aa5VarN.a(arrayList9);
                        }
                    }
                    HashSet hashSet = g(2).a;
                    if (hashSet != null) {
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            gi1.n(((hb0) it.next()).d, 0, arrayList9, null);
                        }
                    }
                    HashSet hashSet2 = g(4).a;
                    if (hashSet2 != null) {
                        Iterator it2 = hashSet2.iterator();
                        while (it2.hasNext()) {
                            gi1.n(((hb0) it2.next()).d, 0, arrayList9, null);
                        }
                    }
                    HashSet hashSet3 = g(7).a;
                    if (hashSet3 != null) {
                        Iterator it3 = hashSet3.iterator();
                        while (it3.hasNext()) {
                            gi1.n(((hb0) it3.next()).d, 0, arrayList9, null);
                        }
                    }
                    if (arrayList6 != null) {
                        int size8 = arrayList6.size();
                        int i50 = 0;
                        while (i50 < size8) {
                            Object obj3 = arrayList6.get(i50);
                            i50++;
                            gi1.n((jc0) obj3, 0, arrayList9, null);
                        }
                    }
                    if (arrayList8 != null) {
                        int size9 = arrayList8.size();
                        int i51 = 0;
                        while (i51 < size9) {
                            Object obj4 = arrayList8.get(i51);
                            i51++;
                            gi1.n((pk1) obj4, 1, arrayList9, null);
                        }
                    }
                    if (arrayList7 != null) {
                        int size10 = arrayList7.size();
                        int i52 = 0;
                        while (i52 < size10) {
                            Object obj5 = arrayList7.get(i52);
                            i52++;
                            ep epVar6 = (ep) obj5;
                            aa5 aa5VarN2 = gi1.n(epVar6, 1, arrayList9, null);
                            epVar6.N(1, aa5VarN2, arrayList9);
                            aa5VarN2.a(arrayList9);
                        }
                    }
                    HashSet hashSet4 = g(3).a;
                    if (hashSet4 != null) {
                        Iterator it4 = hashSet4.iterator();
                        while (it4.hasNext()) {
                            gi1.n(((hb0) it4.next()).d, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet5 = g(6).a;
                    if (hashSet5 != null) {
                        Iterator it5 = hashSet5.iterator();
                        while (it5.hasNext()) {
                            gi1.n(((hb0) it5.next()).d, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet6 = g(5).a;
                    if (hashSet6 != null) {
                        Iterator it6 = hashSet6.iterator();
                        while (it6.hasNext()) {
                            gi1.n(((hb0) it6.next()).d, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet7 = g(7).a;
                    if (hashSet7 != null) {
                        Iterator it7 = hashSet7.iterator();
                        while (it7.hasNext()) {
                            gi1.n(((hb0) it7.next()).d, 1, arrayList9, null);
                        }
                    }
                    if (arrayList4 != null) {
                        int size11 = arrayList4.size();
                        int i53 = 0;
                        while (i53 < size11) {
                            Object obj6 = arrayList4.get(i53);
                            i53++;
                            gi1.n((jc0) obj6, 1, arrayList9, null);
                        }
                    }
                    char c3 = 1;
                    int i54 = 0;
                    while (i54 < size5) {
                        jc0 jc0Var13 = (jc0) arrayList2.get(i54);
                        int[] iArr5 = jc0Var13.o0;
                        if (iArr5[0] == 3 && iArr5[c3] == 3) {
                            int i55 = jc0Var13.m0;
                            int size12 = arrayList9.size();
                            int i56 = 0;
                            while (true) {
                                if (i56 >= size12) {
                                    aa5Var4 = null;
                                    break;
                                }
                                aa5Var4 = (aa5) arrayList9.get(i56);
                                if (i55 == aa5Var4.b) {
                                    break;
                                } else {
                                    i56++;
                                }
                            }
                            int i57 = jc0Var13.n0;
                            int size13 = arrayList9.size();
                            int i58 = 0;
                            while (true) {
                                if (i58 >= size13) {
                                    aa5Var5 = null;
                                    break;
                                }
                                aa5Var5 = (aa5) arrayList9.get(i58);
                                if (i57 == aa5Var5.b) {
                                    break;
                                } else {
                                    i58++;
                                }
                            }
                            if (aa5Var4 != null && aa5Var5 != null) {
                                aa5Var4.c(0, aa5Var5);
                                aa5Var5.c = 2;
                                arrayList9.remove(aa5Var4);
                            }
                        }
                        i54++;
                        c3 = 1;
                    }
                    if (arrayList9.size() > 1) {
                        if (r21[0] == 2) {
                            int size14 = arrayList9.size();
                            int i59 = 0;
                            int i60 = 0;
                            aa5Var = null;
                            while (i60 < size14) {
                                Object obj7 = arrayList9.get(i60);
                                i60++;
                                aa5 aa5Var6 = (aa5) obj7;
                                if (aa5Var6.c != 1 && (iB2 = aa5Var6.b(eb2Var, 0)) > i59) {
                                    aa5Var = aa5Var6;
                                    i59 = iB2;
                                }
                            }
                            c2 = 1;
                            if (aa5Var != null) {
                                I(1);
                                K(i59);
                            }
                            if (r21[c2] == 2) {
                                size2 = arrayList9.size();
                                i19 = 0;
                                i20 = 0;
                                aa5Var2 = null;
                                while (i20 < size2) {
                                    Object obj8 = arrayList9.get(i20);
                                    i20++;
                                    aa5Var3 = (aa5) obj8;
                                    if (aa5Var3.c != 0 && (iB = aa5Var3.b(eb2Var, 1)) > i19) {
                                        aa5Var2 = aa5Var3;
                                        i19 = iB;
                                    }
                                }
                                if (aa5Var2 != null) {
                                    J(1);
                                    H(i19);
                                } else {
                                    aa5Var2 = null;
                                }
                            } else {
                                aa5Var2 = null;
                            }
                            if (aa5Var == null || aa5Var2 != null) {
                                i4 = i17;
                                if (i4 == 2) {
                                    i18 = i14;
                                    if (i18 < o() || i18 <= 0) {
                                        iO = o();
                                    } else {
                                        K(i18);
                                        this.D0 = true;
                                    }
                                    i3 = i16;
                                    if (i3 == 2) {
                                        iMax8 = i15;
                                        if (iMax8 < i() || iMax8 <= 0) {
                                            iMax8 = i();
                                        } else {
                                            H(iMax8);
                                            this.E0 = true;
                                        }
                                    } else {
                                        iMax8 = i15;
                                    }
                                    i = iO;
                                    z = true;
                                } else {
                                    i18 = i14;
                                }
                                iO = i18;
                                i3 = i16;
                                if (i3 == 2) {
                                    iMax8 = i15;
                                    if (iMax8 < i()) {
                                        iMax8 = i();
                                    } else {
                                        iMax8 = i();
                                    }
                                } else {
                                    iMax8 = i15;
                                }
                                i = iO;
                                z = true;
                            }
                            if (!S(64) || S(128)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            eb2Var.getClass();
                            eb2Var.h = false;
                            if (this.C0 == 0 && z2) {
                                c = 1;
                                eb2Var.h = true;
                            } else {
                                c = 1;
                            }
                            ArrayList arrayList10 = this.p0;
                            if (r21[0] != 2 || r21[c] == 2) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            this.y0 = 0;
                            this.z0 = 0;
                            i5 = i2;
                            for (i6 = 0; i6 < i5; i6++) {
                                jc0Var2 = (jc0) this.p0.get(i6);
                                if (jc0Var2 instanceof kc0) {
                                    ((kc0) jc0Var2).Q();
                                }
                            }
                            zS = S(64);
                            r12 = z;
                            i7 = 0;
                            z4 = true;
                            while (z4) {
                                i8 = i7 + 1;
                                try {
                                    eb2Var.t();
                                    this.y0 = 0;
                                    this.z0 = 0;
                                    e(eb2Var);
                                    for (i13 = 0; i13 < i5; i13++) {
                                        ((jc0) this.p0.get(i13)).e(eb2Var);
                                    }
                                    O(eb2Var);
                                    try {
                                        weakReference = this.F0;
                                        if (weakReference != null) {
                                            try {
                                                if (weakReference.get() != null) {
                                                    hb0Var3 = hb0Var;
                                                    try {
                                                        try {
                                                            z6 = z3;
                                                            try {
                                                                eb2Var.f(eb2Var.k((hb0) this.F0.get()), eb2Var.k(hb0Var3), 0, 5);
                                                                this.F0 = null;
                                                            } catch (Exception e) {
                                                                e = e;
                                                                z15 = true;
                                                                e.printStackTrace();
                                                                System.out.println("EXCEPTION : " + e);
                                                                z7 = z15;
                                                                if (z7) {
                                                                    zArr[2] = false;
                                                                    zS2 = S(64);
                                                                    M(eb2Var, zS2);
                                                                    size = this.p0.size();
                                                                    i12 = 0;
                                                                    z14 = false;
                                                                    while (i12 < size) {
                                                                        jc0Var = (jc0) this.p0.get(i12);
                                                                        jc0Var.M(eb2Var, zS2);
                                                                        boolean z23 = zS2;
                                                                        int i61 = size;
                                                                        if (jc0Var.h == -1) {
                                                                            z14 = true;
                                                                        } else {
                                                                            z14 = true;
                                                                        }
                                                                        i12++;
                                                                        zS2 = z23;
                                                                        size = i61;
                                                                        z14 = z14;
                                                                    }
                                                                    z8 = z14;
                                                                } else {
                                                                    M(eb2Var, zS);
                                                                    for (i9 = 0; i9 < i5; i9++) {
                                                                        ((jc0) this.p0.get(i9)).M(eb2Var, zS);
                                                                    }
                                                                    z8 = false;
                                                                }
                                                                if (z6) {
                                                                    iMax3 = 0;
                                                                    iMax4 = 0;
                                                                    for (i11 = 0; i11 < i5; i11++) {
                                                                        jc0 jc0Var14 = (jc0) this.p0.get(i11);
                                                                        iMax4 = Math.max(iMax4, jc0Var14.o() + jc0Var14.X);
                                                                        iMax3 = Math.max(iMax3, jc0Var14.i() + jc0Var14.Y);
                                                                    }
                                                                    iMax5 = Math.max(this.a0, iMax4);
                                                                    iMax6 = Math.max(this.b0, iMax3);
                                                                    z8 = z8;
                                                                    r12 = r12;
                                                                    if (i4 == 2) {
                                                                        z8 = z8;
                                                                        r12 = r12;
                                                                        K(iMax5);
                                                                        r21[0] = 2;
                                                                        z8 = true;
                                                                        r12 = 1;
                                                                    }
                                                                    if (i3 == 2) {
                                                                        H(iMax6);
                                                                        r21[1] = 2;
                                                                        z8 = true;
                                                                        r12 = 1;
                                                                    }
                                                                }
                                                                iMax = Math.max(this.a0, o());
                                                                if (iMax > o()) {
                                                                    K(iMax);
                                                                    r9 = 1;
                                                                    r21[0] = 1;
                                                                    z9 = true;
                                                                    r17 = 1;
                                                                } else {
                                                                    r9 = 1;
                                                                    r17 = r12;
                                                                    z9 = z8;
                                                                }
                                                                iMax2 = Math.max(this.b0, i());
                                                                if (iMax2 > i()) {
                                                                    H(iMax2);
                                                                    r21[r9] = r9;
                                                                    r4 = r9;
                                                                    z10 = r4 == true ? 1 : 0;
                                                                } else {
                                                                    r0 = r17;
                                                                }
                                                                if (r0 == 0) {
                                                                    z10 = z9;
                                                                    if (r21[0] == 2) {
                                                                        r3 = r0;
                                                                        z13 = z10;
                                                                        if (o() > i) {
                                                                            this.D0 = r9;
                                                                            r21[0] = r9;
                                                                            K(i);
                                                                            ?? r10 = r9;
                                                                            z13 = r10 == true ? 1 : 0;
                                                                            r3 = r10;
                                                                        }
                                                                    }
                                                                    r0 = r4;
                                                                    r3 = r0;
                                                                    r3 = r0;
                                                                    z13 = z10;
                                                                    z13 = z10;
                                                                    r1 = r3;
                                                                    r1 = r3;
                                                                    z11 = z13;
                                                                    z11 = z13;
                                                                    if (r21[r9] != 2) {
                                                                    }
                                                                    if (i8 > i10) {
                                                                        r1 = r3;
                                                                        z11 = z13;
                                                                        z12 = false;
                                                                    } else {
                                                                        r1 = r3;
                                                                        z11 = z13;
                                                                    }
                                                                    r12 = r2;
                                                                    i7 = i8;
                                                                    z3 = z6;
                                                                    hb0Var = hb0Var3;
                                                                    z4 = z12;
                                                                } else {
                                                                    z10 = z9;
                                                                    r0 = r4;
                                                                    r1 = r0;
                                                                    z11 = z10;
                                                                }
                                                                r1 = r3;
                                                                z11 = z13;
                                                                i10 = 8;
                                                                r2 = r1;
                                                                z12 = z11;
                                                                if (i8 > i10) {
                                                                    r1 = r3;
                                                                    z11 = z13;
                                                                    z12 = false;
                                                                } else {
                                                                    r1 = r3;
                                                                    z11 = z13;
                                                                }
                                                                r12 = r2;
                                                                i7 = i8;
                                                                z3 = z6;
                                                                hb0Var = hb0Var3;
                                                                z4 = z12;
                                                            }
                                                        } catch (Exception e2) {
                                                            e = e2;
                                                            z6 = z3;
                                                            z15 = true;
                                                            e.printStackTrace();
                                                            System.out.println("EXCEPTION : " + e);
                                                            z7 = z15;
                                                            if (z7) {
                                                                zArr[2] = false;
                                                                zS2 = S(64);
                                                                M(eb2Var, zS2);
                                                                size = this.p0.size();
                                                                i12 = 0;
                                                                z14 = false;
                                                                while (i12 < size) {
                                                                    jc0Var = (jc0) this.p0.get(i12);
                                                                    jc0Var.M(eb2Var, zS2);
                                                                    boolean z24 = zS2;
                                                                    int i62 = size;
                                                                    if (jc0Var.h == -1) {
                                                                        z14 = true;
                                                                    } else {
                                                                        z14 = true;
                                                                    }
                                                                    i12++;
                                                                    zS2 = z24;
                                                                    size = i62;
                                                                    z14 = z14;
                                                                }
                                                                z8 = z14;
                                                            } else {
                                                                M(eb2Var, zS);
                                                                while (i9 < i5) {
                                                                    ((jc0) this.p0.get(i9)).M(eb2Var, zS);
                                                                }
                                                                z8 = false;
                                                            }
                                                            if (z6) {
                                                                iMax3 = 0;
                                                                iMax4 = 0;
                                                                while (i11 < i5) {
                                                                    jc0 jc0Var15 = (jc0) this.p0.get(i11);
                                                                    iMax4 = Math.max(iMax4, jc0Var15.o() + jc0Var15.X);
                                                                    iMax3 = Math.max(iMax3, jc0Var15.i() + jc0Var15.Y);
                                                                }
                                                                iMax5 = Math.max(this.a0, iMax4);
                                                                iMax6 = Math.max(this.b0, iMax3);
                                                                z8 = z8;
                                                                r12 = r12;
                                                                if (i4 == 2) {
                                                                    z8 = z8;
                                                                    r12 = r12;
                                                                    K(iMax5);
                                                                    r21[0] = 2;
                                                                    z8 = true;
                                                                    r12 = 1;
                                                                }
                                                                if (i3 == 2) {
                                                                    H(iMax6);
                                                                    r21[1] = 2;
                                                                    z8 = true;
                                                                    r12 = 1;
                                                                }
                                                            }
                                                            iMax = Math.max(this.a0, o());
                                                            if (iMax > o()) {
                                                                K(iMax);
                                                                r9 = 1;
                                                                r21[0] = 1;
                                                                z9 = true;
                                                                r17 = 1;
                                                            } else {
                                                                r9 = 1;
                                                                r17 = r12;
                                                                z9 = z8;
                                                            }
                                                            iMax2 = Math.max(this.b0, i());
                                                            if (iMax2 > i()) {
                                                                H(iMax2);
                                                                r21[r9] = r9;
                                                                r4 = r9;
                                                                z10 = r4 == true ? 1 : 0;
                                                            } else {
                                                                r0 = r17;
                                                            }
                                                            if (r0 == 0) {
                                                                z10 = z9;
                                                                if (r21[0] == 2) {
                                                                    r3 = r0;
                                                                    z13 = z10;
                                                                    if (o() > i) {
                                                                        this.D0 = r9;
                                                                        r21[0] = r9;
                                                                        K(i);
                                                                        ?? r11 = r9;
                                                                        z13 = r11 == true ? 1 : 0;
                                                                        r3 = r11;
                                                                    }
                                                                }
                                                                r0 = r4;
                                                                r3 = r0;
                                                                r3 = r0;
                                                                z13 = z10;
                                                                z13 = z10;
                                                                r1 = r3;
                                                                r1 = r3;
                                                                z11 = z13;
                                                                z11 = z13;
                                                                if (r21[r9] != 2) {
                                                                }
                                                                if (i8 > i10) {
                                                                    r1 = r3;
                                                                    z11 = z13;
                                                                    z12 = false;
                                                                } else {
                                                                    r1 = r3;
                                                                    z11 = z13;
                                                                }
                                                                r12 = r2;
                                                                i7 = i8;
                                                                z3 = z6;
                                                                hb0Var = hb0Var3;
                                                                z4 = z12;
                                                            } else {
                                                                z10 = z9;
                                                                r0 = r4;
                                                                r1 = r0;
                                                                z11 = z10;
                                                            }
                                                            r1 = r3;
                                                            z11 = z13;
                                                            i10 = 8;
                                                            r2 = r1;
                                                            z12 = z11;
                                                            if (i8 > i10) {
                                                                r1 = r3;
                                                                z11 = z13;
                                                                z12 = false;
                                                            } else {
                                                                r1 = r3;
                                                                z11 = z13;
                                                            }
                                                            r12 = r2;
                                                            i7 = i8;
                                                            z3 = z6;
                                                            hb0Var = hb0Var3;
                                                            z4 = z12;
                                                        }
                                                    } catch (Exception e3) {
                                                        e = e3;
                                                    }
                                                } else {
                                                    hb0Var3 = hb0Var;
                                                    z6 = z3;
                                                }
                                                weakReference2 = this.H0;
                                                if (weakReference2 != null && weakReference2.get() != null) {
                                                    eb2Var.f(eb2Var.k(this.K), eb2Var.k((hb0) this.H0.get()), 0, 5);
                                                    this.H0 = null;
                                                }
                                                weakReference3 = this.G0;
                                                if (weakReference3 != null && weakReference3.get() != null) {
                                                    hb0Var4 = hb0Var2;
                                                    try {
                                                        hb0Var2 = hb0Var4;
                                                        eb2Var.f(eb2Var.k((hb0) this.G0.get()), eb2Var.k(hb0Var4), 0, 5);
                                                        this.G0 = null;
                                                    } catch (Exception e4) {
                                                        e = e4;
                                                        hb0Var2 = hb0Var4;
                                                        z15 = true;
                                                        e.printStackTrace();
                                                        System.out.println("EXCEPTION : " + e);
                                                        z7 = z15;
                                                        if (z7) {
                                                            zArr[2] = false;
                                                            zS2 = S(64);
                                                            M(eb2Var, zS2);
                                                            size = this.p0.size();
                                                            i12 = 0;
                                                            z14 = false;
                                                            while (i12 < size) {
                                                                jc0Var = (jc0) this.p0.get(i12);
                                                                jc0Var.M(eb2Var, zS2);
                                                                boolean z25 = zS2;
                                                                int i63 = size;
                                                                if (jc0Var.h == -1) {
                                                                    z14 = true;
                                                                } else {
                                                                    z14 = true;
                                                                }
                                                                i12++;
                                                                zS2 = z25;
                                                                size = i63;
                                                                z14 = z14;
                                                            }
                                                            z8 = z14;
                                                        } else {
                                                            M(eb2Var, zS);
                                                            while (i9 < i5) {
                                                                ((jc0) this.p0.get(i9)).M(eb2Var, zS);
                                                            }
                                                            z8 = false;
                                                        }
                                                        if (z6) {
                                                            iMax3 = 0;
                                                            iMax4 = 0;
                                                            while (i11 < i5) {
                                                                jc0 jc0Var16 = (jc0) this.p0.get(i11);
                                                                iMax4 = Math.max(iMax4, jc0Var16.o() + jc0Var16.X);
                                                                iMax3 = Math.max(iMax3, jc0Var16.i() + jc0Var16.Y);
                                                            }
                                                            iMax5 = Math.max(this.a0, iMax4);
                                                            iMax6 = Math.max(this.b0, iMax3);
                                                            z8 = z8;
                                                            r12 = r12;
                                                            if (i4 == 2) {
                                                                z8 = z8;
                                                                r12 = r12;
                                                                K(iMax5);
                                                                r21[0] = 2;
                                                                z8 = true;
                                                                r12 = 1;
                                                            }
                                                            if (i3 == 2) {
                                                                H(iMax6);
                                                                r21[1] = 2;
                                                                z8 = true;
                                                                r12 = 1;
                                                            }
                                                        }
                                                        iMax = Math.max(this.a0, o());
                                                        if (iMax > o()) {
                                                            K(iMax);
                                                            r9 = 1;
                                                            r21[0] = 1;
                                                            z9 = true;
                                                            r17 = 1;
                                                        } else {
                                                            r9 = 1;
                                                            r17 = r12;
                                                            z9 = z8;
                                                        }
                                                        iMax2 = Math.max(this.b0, i());
                                                        if (iMax2 > i()) {
                                                            H(iMax2);
                                                            r21[r9] = r9;
                                                            r4 = r9;
                                                            z10 = r4 == true ? 1 : 0;
                                                        } else {
                                                            r0 = r17;
                                                        }
                                                        if (r0 == 0) {
                                                            z10 = z9;
                                                            if (r21[0] == 2) {
                                                                r3 = r0;
                                                                z13 = z10;
                                                                if (o() > i) {
                                                                    this.D0 = r9;
                                                                    r21[0] = r9;
                                                                    K(i);
                                                                    ?? r13 = r9;
                                                                    z13 = r13 == true ? 1 : 0;
                                                                    r3 = r13;
                                                                }
                                                            }
                                                            r0 = r4;
                                                            r3 = r0;
                                                            r3 = r0;
                                                            z13 = z10;
                                                            z13 = z10;
                                                            r1 = r3;
                                                            r1 = r3;
                                                            z11 = z13;
                                                            z11 = z13;
                                                            if (r21[r9] != 2) {
                                                            }
                                                            if (i8 > i10) {
                                                                r1 = r3;
                                                                z11 = z13;
                                                                z12 = false;
                                                            } else {
                                                                r1 = r3;
                                                                z11 = z13;
                                                            }
                                                            r12 = r2;
                                                            i7 = i8;
                                                            z3 = z6;
                                                            hb0Var = hb0Var3;
                                                            z4 = z12;
                                                        } else {
                                                            z10 = z9;
                                                            r0 = r4;
                                                            r1 = r0;
                                                            z11 = z10;
                                                        }
                                                        r1 = r3;
                                                        z11 = z13;
                                                        i10 = 8;
                                                        r2 = r1;
                                                        z12 = z11;
                                                        if (i8 > i10) {
                                                            r1 = r3;
                                                            z11 = z13;
                                                            z12 = false;
                                                        } else {
                                                            r1 = r3;
                                                            z11 = z13;
                                                        }
                                                        r12 = r2;
                                                        i7 = i8;
                                                        z3 = z6;
                                                        hb0Var = hb0Var3;
                                                        z4 = z12;
                                                    }
                                                }
                                                weakReference4 = this.I0;
                                                if (weakReference4 == null && weakReference4.get() != null) {
                                                    try {
                                                        try {
                                                            eb2Var.f(eb2Var.k(this.J), eb2Var.k((hb0) this.I0.get()), 0, 5);
                                                            try {
                                                                this.I0 = null;
                                                            } catch (Exception e5) {
                                                                e = e5;
                                                                z15 = true;
                                                                e.printStackTrace();
                                                                System.out.println("EXCEPTION : " + e);
                                                                z7 = z15;
                                                            }
                                                        } catch (Exception e6) {
                                                            e = e6;
                                                            z15 = true;
                                                            e.printStackTrace();
                                                            System.out.println("EXCEPTION : " + e);
                                                            z7 = z15;
                                                            if (z7) {
                                                                zArr[2] = false;
                                                                zS2 = S(64);
                                                                M(eb2Var, zS2);
                                                                size = this.p0.size();
                                                                i12 = 0;
                                                                z14 = false;
                                                                while (i12 < size) {
                                                                    jc0Var = (jc0) this.p0.get(i12);
                                                                    jc0Var.M(eb2Var, zS2);
                                                                    boolean z26 = zS2;
                                                                    int i64 = size;
                                                                    if (jc0Var.h == -1) {
                                                                        z14 = true;
                                                                    } else {
                                                                        z14 = true;
                                                                    }
                                                                    i12++;
                                                                    zS2 = z26;
                                                                    size = i64;
                                                                    z14 = z14;
                                                                }
                                                                z8 = z14;
                                                            } else {
                                                                M(eb2Var, zS);
                                                                while (i9 < i5) {
                                                                    ((jc0) this.p0.get(i9)).M(eb2Var, zS);
                                                                }
                                                                z8 = false;
                                                            }
                                                            if (z6) {
                                                                iMax3 = 0;
                                                                iMax4 = 0;
                                                                while (i11 < i5) {
                                                                    jc0 jc0Var17 = (jc0) this.p0.get(i11);
                                                                    iMax4 = Math.max(iMax4, jc0Var17.o() + jc0Var17.X);
                                                                    iMax3 = Math.max(iMax3, jc0Var17.i() + jc0Var17.Y);
                                                                }
                                                                iMax5 = Math.max(this.a0, iMax4);
                                                                iMax6 = Math.max(this.b0, iMax3);
                                                                z8 = z8;
                                                                r12 = r12;
                                                                if (i4 == 2) {
                                                                    z8 = z8;
                                                                    r12 = r12;
                                                                    K(iMax5);
                                                                    r21[0] = 2;
                                                                    z8 = true;
                                                                    r12 = 1;
                                                                }
                                                                if (i3 == 2) {
                                                                    H(iMax6);
                                                                    r21[1] = 2;
                                                                    z8 = true;
                                                                    r12 = 1;
                                                                }
                                                            }
                                                            iMax = Math.max(this.a0, o());
                                                            if (iMax > o()) {
                                                                K(iMax);
                                                                r9 = 1;
                                                                r21[0] = 1;
                                                                z9 = true;
                                                                r17 = 1;
                                                            } else {
                                                                r9 = 1;
                                                                r17 = r12;
                                                                z9 = z8;
                                                            }
                                                            iMax2 = Math.max(this.b0, i());
                                                            if (iMax2 > i()) {
                                                                H(iMax2);
                                                                r21[r9] = r9;
                                                                r4 = r9;
                                                                z10 = r4 == true ? 1 : 0;
                                                            } else {
                                                                r0 = r17;
                                                            }
                                                            if (r0 == 0) {
                                                                z10 = z9;
                                                                if (r21[0] == 2) {
                                                                    r3 = r0;
                                                                    z13 = z10;
                                                                    if (o() > i) {
                                                                        this.D0 = r9;
                                                                        r21[0] = r9;
                                                                        K(i);
                                                                        ?? r14 = r9;
                                                                        z13 = r14 == true ? 1 : 0;
                                                                        r3 = r14;
                                                                    }
                                                                }
                                                                r0 = r4;
                                                                r3 = r0;
                                                                r3 = r0;
                                                                z13 = z10;
                                                                z13 = z10;
                                                                r1 = r3;
                                                                r1 = r3;
                                                                z11 = z13;
                                                                z11 = z13;
                                                                if (r21[r9] != 2) {
                                                                }
                                                                if (i8 > i10) {
                                                                    r1 = r3;
                                                                    z11 = z13;
                                                                    z12 = false;
                                                                } else {
                                                                    r1 = r3;
                                                                    z11 = z13;
                                                                }
                                                                r12 = r2;
                                                                i7 = i8;
                                                                z3 = z6;
                                                                hb0Var = hb0Var3;
                                                                z4 = z12;
                                                            } else {
                                                                z10 = z9;
                                                                r0 = r4;
                                                                r1 = r0;
                                                                z11 = z10;
                                                            }
                                                            r1 = r3;
                                                            z11 = z13;
                                                            i10 = 8;
                                                            r2 = r1;
                                                            z12 = z11;
                                                            if (i8 > i10) {
                                                                r1 = r3;
                                                                z11 = z13;
                                                                z12 = false;
                                                            } else {
                                                                r1 = r3;
                                                                z11 = z13;
                                                            }
                                                            r12 = r2;
                                                            i7 = i8;
                                                            z3 = z6;
                                                            hb0Var = hb0Var3;
                                                            z4 = z12;
                                                        }
                                                    } catch (Exception e7) {
                                                        e = e7;
                                                    }
                                                }
                                                eb2Var.p();
                                                z7 = true;
                                            } catch (Exception e8) {
                                                e = e8;
                                                hb0Var3 = hb0Var;
                                            }
                                        } else {
                                            hb0Var3 = hb0Var;
                                            z6 = z3;
                                            weakReference2 = this.H0;
                                            if (weakReference2 != null) {
                                                eb2Var.f(eb2Var.k(this.K), eb2Var.k((hb0) this.H0.get()), 0, 5);
                                                this.H0 = null;
                                            }
                                            weakReference3 = this.G0;
                                            if (weakReference3 != null) {
                                                hb0Var4 = hb0Var2;
                                                hb0Var2 = hb0Var4;
                                                eb2Var.f(eb2Var.k((hb0) this.G0.get()), eb2Var.k(hb0Var4), 0, 5);
                                                this.G0 = null;
                                            }
                                            weakReference4 = this.I0;
                                            if (weakReference4 == null) {
                                            }
                                            eb2Var.p();
                                            z7 = true;
                                        }
                                    } catch (Exception e9) {
                                        e = e9;
                                        hb0Var3 = hb0Var;
                                        z6 = z3;
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    hb0Var3 = hb0Var;
                                    z6 = z3;
                                    z15 = z4;
                                }
                                if (z7) {
                                    zArr[2] = false;
                                    zS2 = S(64);
                                    M(eb2Var, zS2);
                                    size = this.p0.size();
                                    i12 = 0;
                                    z14 = false;
                                    while (i12 < size) {
                                        jc0Var = (jc0) this.p0.get(i12);
                                        jc0Var.M(eb2Var, zS2);
                                        boolean z27 = zS2;
                                        int i65 = size;
                                        if (jc0Var.h == -1 || jc0Var.i != -1) {
                                            z14 = true;
                                        }
                                        i12++;
                                        zS2 = z27;
                                        size = i65;
                                        z14 = z14;
                                    }
                                    z8 = z14;
                                } else {
                                    M(eb2Var, zS);
                                    while (i9 < i5) {
                                        ((jc0) this.p0.get(i9)).M(eb2Var, zS);
                                    }
                                    z8 = false;
                                }
                                if (z6 && i8 < 8 && zArr[2]) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    while (i11 < i5) {
                                        jc0 jc0Var18 = (jc0) this.p0.get(i11);
                                        iMax4 = Math.max(iMax4, jc0Var18.o() + jc0Var18.X);
                                        iMax3 = Math.max(iMax3, jc0Var18.i() + jc0Var18.Y);
                                    }
                                    iMax5 = Math.max(this.a0, iMax4);
                                    iMax6 = Math.max(this.b0, iMax3);
                                    z8 = z8;
                                    r12 = r12;
                                    if (i4 == 2 && o() < iMax5) {
                                        z8 = z8;
                                        r12 = r12;
                                        K(iMax5);
                                        r21[0] = 2;
                                        z8 = true;
                                        r12 = 1;
                                    }
                                    if (i3 == 2 && i() < iMax6) {
                                        H(iMax6);
                                        r21[1] = 2;
                                        z8 = true;
                                        r12 = 1;
                                    }
                                }
                                iMax = Math.max(this.a0, o());
                                if (iMax > o()) {
                                    K(iMax);
                                    r9 = 1;
                                    r21[0] = 1;
                                    z9 = true;
                                    r17 = 1;
                                } else {
                                    r9 = 1;
                                    r17 = r12;
                                    z9 = z8;
                                }
                                iMax2 = Math.max(this.b0, i());
                                if (iMax2 > i()) {
                                    H(iMax2);
                                    r21[r9] = r9;
                                    r4 = r9;
                                    z10 = r4 == true ? 1 : 0;
                                } else {
                                    r0 = r17;
                                }
                                if (r0 == 0) {
                                    z10 = z9;
                                    if (r21[0] == 2 && i > 0) {
                                        r3 = r0;
                                        z13 = z10;
                                        if (o() > i) {
                                            this.D0 = r9;
                                            r21[0] = r9;
                                            K(i);
                                            ?? r15 = r9;
                                            z13 = r15 == true ? 1 : 0;
                                            r3 = r15;
                                        }
                                    }
                                    r0 = r4;
                                    r3 = r0;
                                    r3 = r0;
                                    z13 = z10;
                                    z13 = z10;
                                    r1 = r3;
                                    r1 = r3;
                                    z11 = z13;
                                    z11 = z13;
                                    if (r21[r9] != 2 && iMax8 > 0 && i() > iMax8) {
                                        this.E0 = r9;
                                        r21[r9] = r9;
                                        H(iMax8);
                                        r2 = 1;
                                        i10 = 8;
                                        z12 = true;
                                    }
                                    if (i8 > i10) {
                                        r1 = r3;
                                        z11 = z13;
                                        z12 = false;
                                    } else {
                                        r1 = r3;
                                        z11 = z13;
                                    }
                                    r12 = r2;
                                    i7 = i8;
                                    z3 = z6;
                                    hb0Var = hb0Var3;
                                    z4 = z12;
                                } else {
                                    z10 = z9;
                                    r0 = r4;
                                    r1 = r0;
                                    z11 = z10;
                                }
                                r1 = r3;
                                z11 = z13;
                                i10 = 8;
                                r2 = r1;
                                z12 = z11;
                                if (i8 > i10) {
                                    r1 = r3;
                                    z11 = z13;
                                    z12 = false;
                                } else {
                                    r1 = r3;
                                    z11 = z13;
                                }
                                r12 = r2;
                                i7 = i8;
                                z3 = z6;
                                hb0Var = hb0Var3;
                                z4 = z12;
                            }
                            z5 = r12 == true ? 1 : 0;
                            this.p0 = arrayList10;
                            if (z5) {
                                r21[0] = i4;
                                r21[1] = i3;
                            }
                            C(eb2Var.m);
                        }
                        c2 = 1;
                        aa5Var = null;
                        if (r21[c2] == 2) {
                            size2 = arrayList9.size();
                            i19 = 0;
                            i20 = 0;
                            aa5Var2 = null;
                            while (i20 < size2) {
                                Object obj9 = arrayList9.get(i20);
                                i20++;
                                aa5Var3 = (aa5) obj9;
                                if (aa5Var3.c != 0) {
                                    aa5Var2 = aa5Var3;
                                    i19 = iB;
                                }
                            }
                            if (aa5Var2 != null) {
                                J(1);
                                H(i19);
                            } else {
                                aa5Var2 = null;
                            }
                        } else {
                            aa5Var2 = null;
                        }
                        if (aa5Var == null) {
                        }
                        i4 = i17;
                        if (i4 == 2) {
                            i18 = i14;
                            if (i18 < o()) {
                            }
                            iO = o();
                            i3 = i16;
                            if (i3 == 2) {
                                iMax8 = i15;
                                if (iMax8 < i()) {
                                    iMax8 = i();
                                } else {
                                    iMax8 = i();
                                }
                            } else {
                                iMax8 = i15;
                            }
                            i = iO;
                            z = true;
                            if (S(64)) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            eb2Var.getClass();
                            eb2Var.h = false;
                            if (this.C0 == 0) {
                                c = 1;
                            } else {
                                c = 1;
                            }
                            ArrayList arrayList11 = this.p0;
                            if (r21[0] != 2) {
                                z3 = true;
                            } else {
                                z3 = true;
                            }
                            this.y0 = 0;
                            this.z0 = 0;
                            i5 = i2;
                            while (i6 < i5) {
                                jc0Var2 = (jc0) this.p0.get(i6);
                                if (jc0Var2 instanceof kc0) {
                                    ((kc0) jc0Var2).Q();
                                }
                            }
                            zS = S(64);
                            r12 = z;
                            i7 = 0;
                            z4 = true;
                            while (z4) {
                                i8 = i7 + 1;
                                eb2Var.t();
                                this.y0 = 0;
                                this.z0 = 0;
                                e(eb2Var);
                                while (i13 < i5) {
                                    ((jc0) this.p0.get(i13)).e(eb2Var);
                                }
                                O(eb2Var);
                                weakReference = this.F0;
                                if (weakReference != null) {
                                    if (weakReference.get() != null) {
                                        hb0Var3 = hb0Var;
                                        z6 = z3;
                                        eb2Var.f(eb2Var.k((hb0) this.F0.get()), eb2Var.k(hb0Var3), 0, 5);
                                        this.F0 = null;
                                    } else {
                                        hb0Var3 = hb0Var;
                                        z6 = z3;
                                    }
                                    weakReference2 = this.H0;
                                    if (weakReference2 != null) {
                                        eb2Var.f(eb2Var.k(this.K), eb2Var.k((hb0) this.H0.get()), 0, 5);
                                        this.H0 = null;
                                    }
                                    weakReference3 = this.G0;
                                    if (weakReference3 != null) {
                                        hb0Var4 = hb0Var2;
                                        hb0Var2 = hb0Var4;
                                        eb2Var.f(eb2Var.k((hb0) this.G0.get()), eb2Var.k(hb0Var4), 0, 5);
                                        this.G0 = null;
                                    }
                                    weakReference4 = this.I0;
                                    if (weakReference4 == null) {
                                    }
                                    eb2Var.p();
                                    z7 = true;
                                } else {
                                    hb0Var3 = hb0Var;
                                    z6 = z3;
                                    weakReference2 = this.H0;
                                    if (weakReference2 != null) {
                                        eb2Var.f(eb2Var.k(this.K), eb2Var.k((hb0) this.H0.get()), 0, 5);
                                        this.H0 = null;
                                    }
                                    weakReference3 = this.G0;
                                    if (weakReference3 != null) {
                                        hb0Var4 = hb0Var2;
                                        hb0Var2 = hb0Var4;
                                        eb2Var.f(eb2Var.k((hb0) this.G0.get()), eb2Var.k(hb0Var4), 0, 5);
                                        this.G0 = null;
                                    }
                                    weakReference4 = this.I0;
                                    if (weakReference4 == null) {
                                    }
                                    eb2Var.p();
                                    z7 = true;
                                }
                                if (z7) {
                                    zArr[2] = false;
                                    zS2 = S(64);
                                    M(eb2Var, zS2);
                                    size = this.p0.size();
                                    i12 = 0;
                                    z14 = false;
                                    while (i12 < size) {
                                        jc0Var = (jc0) this.p0.get(i12);
                                        jc0Var.M(eb2Var, zS2);
                                        boolean z28 = zS2;
                                        int i66 = size;
                                        if (jc0Var.h == -1) {
                                            z14 = true;
                                        } else {
                                            z14 = true;
                                        }
                                        i12++;
                                        zS2 = z28;
                                        size = i66;
                                        z14 = z14;
                                    }
                                    z8 = z14;
                                } else {
                                    M(eb2Var, zS);
                                    while (i9 < i5) {
                                        ((jc0) this.p0.get(i9)).M(eb2Var, zS);
                                    }
                                    z8 = false;
                                }
                                if (z6) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    while (i11 < i5) {
                                        jc0 jc0Var19 = (jc0) this.p0.get(i11);
                                        iMax4 = Math.max(iMax4, jc0Var19.o() + jc0Var19.X);
                                        iMax3 = Math.max(iMax3, jc0Var19.i() + jc0Var19.Y);
                                    }
                                    iMax5 = Math.max(this.a0, iMax4);
                                    iMax6 = Math.max(this.b0, iMax3);
                                    z8 = z8;
                                    r12 = r12;
                                    if (i4 == 2) {
                                        z8 = z8;
                                        r12 = r12;
                                        K(iMax5);
                                        r21[0] = 2;
                                        z8 = true;
                                        r12 = 1;
                                    }
                                    if (i3 == 2) {
                                        H(iMax6);
                                        r21[1] = 2;
                                        z8 = true;
                                        r12 = 1;
                                    }
                                }
                                iMax = Math.max(this.a0, o());
                                if (iMax > o()) {
                                    K(iMax);
                                    r9 = 1;
                                    r21[0] = 1;
                                    z9 = true;
                                    r17 = 1;
                                } else {
                                    r9 = 1;
                                    r17 = r12;
                                    z9 = z8;
                                }
                                iMax2 = Math.max(this.b0, i());
                                if (iMax2 > i()) {
                                    H(iMax2);
                                    r21[r9] = r9;
                                    r4 = r9;
                                    z10 = r4 == true ? 1 : 0;
                                } else {
                                    r0 = r17;
                                }
                                if (r0 == 0) {
                                    z10 = z9;
                                    if (r21[0] == 2) {
                                        r3 = r0;
                                        z13 = z10;
                                        if (o() > i) {
                                            this.D0 = r9;
                                            r21[0] = r9;
                                            K(i);
                                            ?? r16 = r9;
                                            z13 = r16 == true ? 1 : 0;
                                            r3 = r16;
                                        }
                                    }
                                    r0 = r4;
                                    r3 = r0;
                                    r3 = r0;
                                    z13 = z10;
                                    z13 = z10;
                                    r1 = r3;
                                    r1 = r3;
                                    z11 = z13;
                                    z11 = z13;
                                    if (r21[r9] != 2) {
                                    }
                                    if (i8 > i10) {
                                        r1 = r3;
                                        z11 = z13;
                                        z12 = false;
                                    } else {
                                        r1 = r3;
                                        z11 = z13;
                                    }
                                    r12 = r2;
                                    i7 = i8;
                                    z3 = z6;
                                    hb0Var = hb0Var3;
                                    z4 = z12;
                                } else {
                                    z10 = z9;
                                    r0 = r4;
                                    r1 = r0;
                                    z11 = z10;
                                }
                                r1 = r3;
                                z11 = z13;
                                i10 = 8;
                                r2 = r1;
                                z12 = z11;
                                if (i8 > i10) {
                                    r1 = r3;
                                    z11 = z13;
                                    z12 = false;
                                } else {
                                    r1 = r3;
                                    z11 = z13;
                                }
                                r12 = r2;
                                i7 = i8;
                                z3 = z6;
                                hb0Var = hb0Var3;
                                z4 = z12;
                            }
                            z5 = r12 == true ? 1 : 0;
                            this.p0 = arrayList11;
                            if (z5) {
                                r21[0] = i4;
                                r21[1] = i3;
                            }
                            C(eb2Var.m);
                        }
                        i18 = i14;
                        iO = i18;
                        i3 = i16;
                        if (i3 == 2) {
                            iMax8 = i15;
                            if (iMax8 < i()) {
                                iMax8 = i();
                            } else {
                                iMax8 = i();
                            }
                        } else {
                            iMax8 = i15;
                        }
                        i = iO;
                        z = true;
                        if (S(64)) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        eb2Var.getClass();
                        eb2Var.h = false;
                        if (this.C0 == 0) {
                            c = 1;
                        } else {
                            c = 1;
                        }
                        ArrayList arrayList12 = this.p0;
                        if (r21[0] != 2) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        this.y0 = 0;
                        this.z0 = 0;
                        i5 = i2;
                        while (i6 < i5) {
                            jc0Var2 = (jc0) this.p0.get(i6);
                            if (jc0Var2 instanceof kc0) {
                                ((kc0) jc0Var2).Q();
                            }
                        }
                        zS = S(64);
                        r12 = z;
                        i7 = 0;
                        z4 = true;
                        while (z4) {
                            i8 = i7 + 1;
                            eb2Var.t();
                            this.y0 = 0;
                            this.z0 = 0;
                            e(eb2Var);
                            while (i13 < i5) {
                                ((jc0) this.p0.get(i13)).e(eb2Var);
                            }
                            O(eb2Var);
                            weakReference = this.F0;
                            if (weakReference != null) {
                                if (weakReference.get() != null) {
                                    hb0Var3 = hb0Var;
                                    z6 = z3;
                                    eb2Var.f(eb2Var.k((hb0) this.F0.get()), eb2Var.k(hb0Var3), 0, 5);
                                    this.F0 = null;
                                } else {
                                    hb0Var3 = hb0Var;
                                    z6 = z3;
                                }
                                weakReference2 = this.H0;
                                if (weakReference2 != null) {
                                    eb2Var.f(eb2Var.k(this.K), eb2Var.k((hb0) this.H0.get()), 0, 5);
                                    this.H0 = null;
                                }
                                weakReference3 = this.G0;
                                if (weakReference3 != null) {
                                    hb0Var4 = hb0Var2;
                                    hb0Var2 = hb0Var4;
                                    eb2Var.f(eb2Var.k((hb0) this.G0.get()), eb2Var.k(hb0Var4), 0, 5);
                                    this.G0 = null;
                                }
                                weakReference4 = this.I0;
                                if (weakReference4 == null) {
                                }
                                eb2Var.p();
                                z7 = true;
                            } else {
                                hb0Var3 = hb0Var;
                                z6 = z3;
                                weakReference2 = this.H0;
                                if (weakReference2 != null) {
                                    eb2Var.f(eb2Var.k(this.K), eb2Var.k((hb0) this.H0.get()), 0, 5);
                                    this.H0 = null;
                                }
                                weakReference3 = this.G0;
                                if (weakReference3 != null) {
                                    hb0Var4 = hb0Var2;
                                    hb0Var2 = hb0Var4;
                                    eb2Var.f(eb2Var.k((hb0) this.G0.get()), eb2Var.k(hb0Var4), 0, 5);
                                    this.G0 = null;
                                }
                                weakReference4 = this.I0;
                                if (weakReference4 == null) {
                                }
                                eb2Var.p();
                                z7 = true;
                            }
                            if (z7) {
                                zArr[2] = false;
                                zS2 = S(64);
                                M(eb2Var, zS2);
                                size = this.p0.size();
                                i12 = 0;
                                z14 = false;
                                while (i12 < size) {
                                    jc0Var = (jc0) this.p0.get(i12);
                                    jc0Var.M(eb2Var, zS2);
                                    boolean z29 = zS2;
                                    int i67 = size;
                                    if (jc0Var.h == -1) {
                                        z14 = true;
                                    } else {
                                        z14 = true;
                                    }
                                    i12++;
                                    zS2 = z29;
                                    size = i67;
                                    z14 = z14;
                                }
                                z8 = z14;
                            } else {
                                M(eb2Var, zS);
                                while (i9 < i5) {
                                    ((jc0) this.p0.get(i9)).M(eb2Var, zS);
                                }
                                z8 = false;
                            }
                            if (z6) {
                                iMax3 = 0;
                                iMax4 = 0;
                                while (i11 < i5) {
                                    jc0 jc0Var110 = (jc0) this.p0.get(i11);
                                    iMax4 = Math.max(iMax4, jc0Var110.o() + jc0Var110.X);
                                    iMax3 = Math.max(iMax3, jc0Var110.i() + jc0Var110.Y);
                                }
                                iMax5 = Math.max(this.a0, iMax4);
                                iMax6 = Math.max(this.b0, iMax3);
                                z8 = z8;
                                r12 = r12;
                                if (i4 == 2) {
                                    z8 = z8;
                                    r12 = r12;
                                    K(iMax5);
                                    r21[0] = 2;
                                    z8 = true;
                                    r12 = 1;
                                }
                                if (i3 == 2) {
                                    H(iMax6);
                                    r21[1] = 2;
                                    z8 = true;
                                    r12 = 1;
                                }
                            }
                            iMax = Math.max(this.a0, o());
                            if (iMax > o()) {
                                K(iMax);
                                r9 = 1;
                                r21[0] = 1;
                                z9 = true;
                                r17 = 1;
                            } else {
                                r9 = 1;
                                r17 = r12;
                                z9 = z8;
                            }
                            iMax2 = Math.max(this.b0, i());
                            if (iMax2 > i()) {
                                H(iMax2);
                                r21[r9] = r9;
                                r4 = r9;
                                z10 = r4 == true ? 1 : 0;
                            } else {
                                r0 = r17;
                            }
                            if (r0 == 0) {
                                z10 = z9;
                                if (r21[0] == 2) {
                                    r3 = r0;
                                    z13 = z10;
                                    if (o() > i) {
                                        this.D0 = r9;
                                        r21[0] = r9;
                                        K(i);
                                        ?? r18 = r9;
                                        z13 = r18 == true ? 1 : 0;
                                        r3 = r18;
                                    }
                                }
                                r0 = r4;
                                r3 = r0;
                                r3 = r0;
                                z13 = z10;
                                z13 = z10;
                                r1 = r3;
                                r1 = r3;
                                z11 = z13;
                                z11 = z13;
                                if (r21[r9] != 2) {
                                }
                                if (i8 > i10) {
                                    r1 = r3;
                                    z11 = z13;
                                    z12 = false;
                                } else {
                                    r1 = r3;
                                    z11 = z13;
                                }
                                r12 = r2;
                                i7 = i8;
                                z3 = z6;
                                hb0Var = hb0Var3;
                                z4 = z12;
                            } else {
                                z10 = z9;
                                r0 = r4;
                                r1 = r0;
                                z11 = z10;
                            }
                            r1 = r3;
                            z11 = z13;
                            i10 = 8;
                            r2 = r1;
                            z12 = z11;
                            if (i8 > i10) {
                                r1 = r3;
                                z11 = z13;
                                z12 = false;
                            } else {
                                r1 = r3;
                                z11 = z13;
                            }
                            r12 = r2;
                            i7 = i8;
                            z3 = z6;
                            hb0Var = hb0Var3;
                            z4 = z12;
                        }
                        z5 = r12 == true ? 1 : 0;
                        this.p0 = arrayList12;
                        if (z5) {
                            r21[0] = i4;
                            r21[1] = i3;
                        }
                        C(eb2Var.m);
                    }
                }
                iMax8 = i15;
                i3 = i16;
                i = i14;
                i4 = i17;
            }
        }
        z = false;
        if (S(64)) {
            z2 = true;
        } else {
            z2 = true;
        }
        eb2Var.getClass();
        eb2Var.h = false;
        if (this.C0 == 0) {
            c = 1;
        } else {
            c = 1;
        }
        ArrayList arrayList13 = this.p0;
        if (r21[0] != 2) {
            z3 = true;
        } else {
            z3 = true;
        }
        this.y0 = 0;
        this.z0 = 0;
        i5 = i2;
        while (i6 < i5) {
            jc0Var2 = (jc0) this.p0.get(i6);
            if (jc0Var2 instanceof kc0) {
                ((kc0) jc0Var2).Q();
            }
        }
        zS = S(64);
        r12 = z;
        i7 = 0;
        z4 = true;
        while (z4) {
            i8 = i7 + 1;
            eb2Var.t();
            this.y0 = 0;
            this.z0 = 0;
            e(eb2Var);
            while (i13 < i5) {
                ((jc0) this.p0.get(i13)).e(eb2Var);
            }
            O(eb2Var);
            weakReference = this.F0;
            if (weakReference != null) {
                if (weakReference.get() != null) {
                    hb0Var3 = hb0Var;
                    z6 = z3;
                    eb2Var.f(eb2Var.k((hb0) this.F0.get()), eb2Var.k(hb0Var3), 0, 5);
                    this.F0 = null;
                } else {
                    hb0Var3 = hb0Var;
                    z6 = z3;
                }
                weakReference2 = this.H0;
                if (weakReference2 != null) {
                    eb2Var.f(eb2Var.k(this.K), eb2Var.k((hb0) this.H0.get()), 0, 5);
                    this.H0 = null;
                }
                weakReference3 = this.G0;
                if (weakReference3 != null) {
                    hb0Var4 = hb0Var2;
                    hb0Var2 = hb0Var4;
                    eb2Var.f(eb2Var.k((hb0) this.G0.get()), eb2Var.k(hb0Var4), 0, 5);
                    this.G0 = null;
                }
                weakReference4 = this.I0;
                if (weakReference4 == null) {
                }
                eb2Var.p();
                z7 = true;
            } else {
                hb0Var3 = hb0Var;
                z6 = z3;
                weakReference2 = this.H0;
                if (weakReference2 != null) {
                    eb2Var.f(eb2Var.k(this.K), eb2Var.k((hb0) this.H0.get()), 0, 5);
                    this.H0 = null;
                }
                weakReference3 = this.G0;
                if (weakReference3 != null) {
                    hb0Var4 = hb0Var2;
                    hb0Var2 = hb0Var4;
                    eb2Var.f(eb2Var.k((hb0) this.G0.get()), eb2Var.k(hb0Var4), 0, 5);
                    this.G0 = null;
                }
                weakReference4 = this.I0;
                if (weakReference4 == null) {
                }
                eb2Var.p();
                z7 = true;
            }
            if (z7) {
                zArr[2] = false;
                zS2 = S(64);
                M(eb2Var, zS2);
                size = this.p0.size();
                i12 = 0;
                z14 = false;
                while (i12 < size) {
                    jc0Var = (jc0) this.p0.get(i12);
                    jc0Var.M(eb2Var, zS2);
                    boolean z210 = zS2;
                    int i68 = size;
                    if (jc0Var.h == -1) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    i12++;
                    zS2 = z210;
                    size = i68;
                    z14 = z14;
                }
                z8 = z14;
            } else {
                M(eb2Var, zS);
                while (i9 < i5) {
                    ((jc0) this.p0.get(i9)).M(eb2Var, zS);
                }
                z8 = false;
            }
            if (z6) {
                iMax3 = 0;
                iMax4 = 0;
                while (i11 < i5) {
                    jc0 jc0Var111 = (jc0) this.p0.get(i11);
                    iMax4 = Math.max(iMax4, jc0Var111.o() + jc0Var111.X);
                    iMax3 = Math.max(iMax3, jc0Var111.i() + jc0Var111.Y);
                }
                iMax5 = Math.max(this.a0, iMax4);
                iMax6 = Math.max(this.b0, iMax3);
                z8 = z8;
                r12 = r12;
                if (i4 == 2) {
                    z8 = z8;
                    r12 = r12;
                    K(iMax5);
                    r21[0] = 2;
                    z8 = true;
                    r12 = 1;
                }
                if (i3 == 2) {
                    H(iMax6);
                    r21[1] = 2;
                    z8 = true;
                    r12 = 1;
                }
            }
            iMax = Math.max(this.a0, o());
            if (iMax > o()) {
                K(iMax);
                r9 = 1;
                r21[0] = 1;
                z9 = true;
                r17 = 1;
            } else {
                r9 = 1;
                r17 = r12;
                z9 = z8;
            }
            iMax2 = Math.max(this.b0, i());
            if (iMax2 > i()) {
                H(iMax2);
                r21[r9] = r9;
                r4 = r9;
                z10 = r4 == true ? 1 : 0;
            } else {
                r0 = r17;
            }
            if (r0 == 0) {
                z10 = z9;
                if (r21[0] == 2) {
                    r3 = r0;
                    z13 = z10;
                    if (o() > i) {
                        this.D0 = r9;
                        r21[0] = r9;
                        K(i);
                        ?? r19 = r9;
                        z13 = r19 == true ? 1 : 0;
                        r3 = r19;
                    }
                }
                r0 = r4;
                r3 = r0;
                r3 = r0;
                z13 = z10;
                z13 = z10;
                r1 = r3;
                r1 = r3;
                z11 = z13;
                z11 = z13;
                if (r21[r9] != 2) {
                }
                if (i8 > i10) {
                    r1 = r3;
                    z11 = z13;
                    z12 = false;
                } else {
                    r1 = r3;
                    z11 = z13;
                }
                r12 = r2;
                i7 = i8;
                z3 = z6;
                hb0Var = hb0Var3;
                z4 = z12;
            } else {
                z10 = z9;
                r0 = r4;
                r1 = r0;
                z11 = z10;
            }
            r1 = r3;
            z11 = z13;
            i10 = 8;
            r2 = r1;
            z12 = z11;
            if (i8 > i10) {
                r1 = r3;
                z11 = z13;
                z12 = false;
            } else {
                r1 = r3;
                z11 = z13;
            }
            r12 = r2;
            i7 = i8;
            z3 = z6;
            hb0Var = hb0Var3;
            z4 = z12;
        }
        z5 = r12 == true ? 1 : 0;
        this.p0 = arrayList13;
        if (z5) {
            r21[0] = i4;
            r21[1] = i3;
        }
        C(eb2Var.m);
    }

    public final boolean S(int i) {
        return (this.C0 & i) == i;
    }

    @Override // defpackage.jc0
    public final void l(StringBuilder sb) {
        sb.append(this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.T);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.U);
        sb.append("\n");
        ArrayList arrayList = this.p0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((jc0) obj).l(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
