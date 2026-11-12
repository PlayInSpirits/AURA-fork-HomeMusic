package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ad3 implements a74 {
    public final b13 A;
    public final b13 B;
    public final zd3 C;
    public final zd3 D;
    public final zd3 E;
    public final zd3 F;
    public boolean a;
    public qc3 b;
    public final zd3 c;
    public final nq d;
    public int e;
    public int f;
    public long g;
    public long h;
    public float i;
    public float j;
    public final ml3 k;
    public final boolean l;
    public final zd3 m;
    public oo0 n;
    public int o;
    public final rm2 p;
    public final wd3 q;
    public final wd3 r;
    public final dp0 s;
    public final q82 t;
    public final fc3 u;
    public final hg3 v;
    public final io w;
    public final zd3 x;
    public final yc3 y;
    public final n82 z;

    public ad3(int i, float f) {
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            fz1.a("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        this.c = uc5.B(new g83(0L));
        this.d = new nq(i, f, this);
        this.e = i;
        this.g = Long.MAX_VALUE;
        int i2 = 0;
        this.k = new ml3(new uc3(this, i2));
        int i3 = 1;
        this.l = true;
        qc3 qc3Var = ed3.b;
        rv2 rv2Var = rv2.s;
        this.m = new zd3(qc3Var, rv2Var);
        this.n = ed3.a;
        this.p = new rm2(4);
        this.q = new wd3(-1);
        this.r = new wd3(i);
        rv2 rv2Var2 = rv2.D;
        z05 z05Var = ph4.a;
        new fl(0);
        new cp0(jh4.j().g());
        this.s = new dp0(new vc3(this, i2), rv2Var2);
        q82 q82Var = new q82(new uc3(this, i3));
        this.t = q82Var;
        this.u = new fc3(new om1(15, this), q82Var, new vc3(this, i3));
        this.v = new hg3(25);
        this.w = new io();
        this.x = uc5.B(null);
        this.y = new yc3(this);
        qc0.b(0, 0, 15);
        this.z = new n82();
        j15 j15Var = j15.a;
        this.A = new zd3(j15Var, rv2Var);
        this.B = new zd3(j15Var, rv2Var);
        Boolean bool = Boolean.FALSE;
        this.C = uc5.B(bool);
        this.D = uc5.B(bool);
        this.E = uc5.B(bool);
        this.F = uc5.B(bool);
    }

    public static /* synthetic */ Object g(lm0 lm0Var, int i, yy4 yy4Var, ep4 ep4Var, int i2) {
        wd wdVarS = yy4Var;
        if ((i2 & 4) != 0) {
            wdVarS = au0.S(7);
        }
        return lm0Var.f(i, wdVarS, ep4Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r9.e(r7, r8, r0) == r5) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object s(ad3 ad3Var, h13 h13Var, wf1 wf1Var, wd0 wd0Var) {
        zc3 zc3Var;
        wf1 wf1Var2;
        if (wd0Var instanceof zc3) {
            zc3Var = (zc3) wd0Var;
            int i = zc3Var.s;
            if ((i & Integer.MIN_VALUE) != 0) {
                zc3Var.s = i - Integer.MIN_VALUE;
            } else {
                zc3Var = new zc3(ad3Var, wd0Var);
            }
        } else {
            zc3Var = new zc3(ad3Var, wd0Var);
        }
        Object obj = zc3Var.q;
        int i2 = zc3Var.s;
        Object obj2 = xe0.n;
        if (i2 == 0) {
            kb4.X(obj);
            zc3Var.n = ad3Var;
            zc3Var.o = h13Var;
            zc3Var.p = (ep4) wf1Var;
            zc3Var.s = 1;
            if (ad3Var.i(zc3Var) != obj2) {
            }
            wf1Var2 = wf1Var;
            return obj2;
        }
        if (i2 == 1) {
            wf1 wf1Var3 = (wf1) zc3Var.p;
            h13Var = zc3Var.o;
            ad3Var = zc3Var.n;
            kb4.X(obj);
            wf1Var2 = wf1Var3;
        } else {
            if (i2 != 2) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ad3Var = zc3Var.n;
            kb4.X(obj);
        }
        ad3Var.q.h(-1);
        return j15.a;
        wf1Var2 = wf1Var;
        if (!ad3Var.k.a()) {
            ad3Var.r.h(ad3Var.k());
        }
        ml3 ml3Var = ad3Var.k;
        zc3Var.n = ad3Var;
        zc3Var.o = null;
        zc3Var.p = null;
        zc3Var.s = 2;
    }

    @Override // defpackage.a74
    public final boolean a() {
        return this.k.a();
    }

    @Override // defpackage.a74
    public final boolean b() {
        return ((Boolean) this.D.getValue()).booleanValue();
    }

    @Override // defpackage.a74
    public final boolean c() {
        return ((Boolean) this.C.getValue()).booleanValue();
    }

    @Override // defpackage.a74
    public final float d(float f) {
        return this.k.d(f);
    }

    @Override // defpackage.a74
    public final Object e(h13 h13Var, wf1 wf1Var, wd0 wd0Var) {
        return s(this, h13Var, wf1Var, wd0Var);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object f(int i, wd wdVar, wd0 wd0Var) {
        wc3 wc3Var;
        int i2;
        wd wdVar2;
        if (wd0Var instanceof wc3) {
            wc3Var = (wc3) wd0Var;
            int i3 = wc3Var.r;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                wc3Var.r = i3 - Integer.MIN_VALUE;
            } else {
                wc3Var = new wc3(this, wd0Var);
            }
        } else {
            wc3Var = new wc3(this, wd0Var);
        }
        wc3 wc3Var2 = wc3Var;
        Object obj = wc3Var2.p;
        int i4 = wc3Var2.r;
        j15 j15Var = j15.a;
        Object obj2 = xe0.n;
        if (i4 == 0) {
            kb4.X(obj);
            if ((i != k() || l() != 0.0f) && n() != 0) {
                wc3Var2.o = wdVar;
                wc3Var2.n = i;
                wc3Var2.r = 1;
                if (i(wc3Var2) != obj2) {
                    i2 = i;
                    wdVar2 = wdVar;
                }
            }
        }
        if (i4 != 1) {
            if (i4 == 2) {
                kb4.X(obj);
                return j15Var;
            }
            kf2.o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i2 = wc3Var2.n;
        wd wdVar3 = wc3Var2.o;
        kb4.X(obj);
        wdVar2 = wdVar3;
        xc3 xc3Var = new xc3(this, j(i2), p() * 0.0f, wdVar2, null);
        wc3Var2.o = null;
        wc3Var2.r = 2;
        return s(this, h13.n, xc3Var, wc3Var2) == obj2 ? obj2 : j15Var;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:125:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:130:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:133:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:136:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:148:0x031c A[Catch: all -> 0x0358, TryCatch #0 {all -> 0x0358, blocks: (B:140:0x02fa, B:143:0x0303, B:146:0x0310, B:148:0x031c, B:156:0x0352, B:154:0x034c, B:151:0x0334), top: B:172:0x02fa }] */
    /* JADX WARN: Code duplicated, block: B:150:0x0333  */
    /* JADX WARN: Code duplicated, block: B:151:0x0334 A[Catch: all -> 0x0358, TryCatch #0 {all -> 0x0358, blocks: (B:140:0x02fa, B:143:0x0303, B:146:0x0310, B:148:0x031c, B:156:0x0352, B:154:0x034c, B:151:0x0334), top: B:172:0x02fa }] */
    /* JADX WARN: Code duplicated, block: B:153:0x034b  */
    /* JADX WARN: Code duplicated, block: B:154:0x034c A[Catch: all -> 0x0358, TryCatch #0 {all -> 0x0358, blocks: (B:140:0x02fa, B:143:0x0303, B:146:0x0310, B:148:0x031c, B:156:0x0352, B:154:0x034c, B:151:0x0334), top: B:172:0x02fa }] */
    /* JADX WARN: Code duplicated, block: B:162:0x036d  */
    /* JADX WARN: Code duplicated, block: B:164:0x0374  */
    /* JADX WARN: Code duplicated, block: B:167:0x038a  */
    /* JADX WARN: Code duplicated, block: B:172:0x02fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x01f7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r2v18, types: [int] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void h(qc3 qc3Var, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        float f;
        int i;
        Object obj;
        boolean z7;
        ?? r2;
        ?? r10;
        ?? r7;
        float f2;
        long jI;
        long jM;
        long j;
        int i2;
        List list = qc3Var.a;
        int i3 = qc3Var.l;
        xi2 xi2Var = qc3Var.i;
        xi2 xi2Var2 = qc3Var.j;
        float f3 = qc3Var.k;
        this.t.d = list.size();
        this.o = qc3Var.b + qc3Var.c;
        if (!z && this.a) {
            this.b = qc3Var;
            return;
        }
        boolean z8 = true;
        if (z) {
            this.a = true;
        }
        fc3 fc3Var = this.u;
        boolean z9 = this.l;
        nq nqVar = this.d;
        if (!z2) {
            nqVar.getClass();
            nqVar.r = xi2Var2 != null ? xi2Var2.d : null;
            if (nqVar.n || !list.isEmpty()) {
                nqVar.n = true;
                int i4 = xi2Var2 != null ? xi2Var2.a : 0;
                ((wd3) nqVar.p).h(i4);
                g82 g82Var = (g82) nqVar.s;
                if (i4 != g82Var.o) {
                    g82Var.o = i4;
                    int i5 = (i4 / 30) * 30;
                    g82Var.n.setValue(gb.g0(Math.max(i5 - 100, 0), i5 + 130));
                }
                ((vd3) nqVar.q).h(f3);
            }
            if (z9) {
                z3 = z9;
                qp4 qp4Var = fc3Var.o;
                i03 i03Var = fc3Var.e;
                qp4Var.b = qc3Var;
                qp4Var.c = fc3Var.n;
                om1 om1Var = fc3Var.a;
                int i6 = fc3Var.g;
                float f4 = 0.0f;
                int i7 = -1;
                if (i6 != -1 && i6 != qp4Var.h()) {
                    fc3Var.l = true;
                    if (qp4Var.c()) {
                        int i8 = fc3Var.h;
                        if (i8 < 0) {
                            i8 = 0;
                        }
                        fc3Var.h = i8;
                        int iH = qp4Var.e().a.isEmpty() ? -1 : qp4Var.h() - 1;
                        if (iH != -1) {
                            int i9 = fc3Var.i;
                            if (i9 <= iH) {
                                iH = i9;
                            }
                            fc3Var.i = iH;
                        }
                        if (fc3Var.f <= 0.0f) {
                            fc3Var.e(qp4Var.d(), fc3Var.m - 1);
                        } else {
                            fc3Var.e(0, qp4Var.b());
                        }
                    }
                }
                fc3Var.m = qp4Var.h();
                if (qp4Var.c()) {
                    int size = qp4Var.e().r.size() + qp4Var.e().a.size() + qp4Var.e().q.size();
                    int i10 = 0;
                    while (i10 < size) {
                        int size2 = qp4Var.e().q.size();
                        int size3 = qp4Var.e().a.size();
                        if (i10 < size2) {
                            i = ((xi2) qp4Var.e().q.get(i10)).a;
                            f = f4;
                        } else {
                            f = f4;
                            i = (i10 < size2 || i10 >= size2 + size3) ? i10 >= size2 + size3 ? ((xi2) qp4Var.e().r.get((i10 - size2) - size3)).a : i7 : ((xi2) qp4Var.e().a.get(i10 - size2)).a;
                        }
                        int size4 = qp4Var.e().q.size();
                        int size5 = qp4Var.e().a.size();
                        if (i10 < size4) {
                            obj = ((xi2) qp4Var.e().q.get(i10)).d;
                        } else if (i10 < size4 || i10 >= size4 + size5) {
                            obj = i10 >= size4 + size5 ? ((xi2) qp4Var.e().r.get((i10 - size4) - size5)).d : zx.c;
                        } else {
                            obj = ((xi2) qp4Var.e().a.get(i10 - size4)).d;
                        }
                        int i11 = qp4Var.e().b;
                        if (i != i7) {
                            if (i03Var.a(i)) {
                                Object objB = i03Var.b(i);
                                objB.getClass();
                                int i12 = ((zx) objB).b;
                                Object objB2 = i03Var.b(i);
                                objB2.getClass();
                                Object obj2 = ((zx) objB2).a;
                                if (i12 == i11 && h12.c(obj2, obj)) {
                                    z7 = true;
                                } else {
                                    z7 = true;
                                    fc3Var.l = true;
                                }
                            } else {
                                z7 = true;
                            }
                            zx zxVar = (zx) i03Var.b(i);
                            if (zxVar != null) {
                                zxVar.b = i11;
                                zxVar.a = obj;
                            } else {
                                zxVar = new zx();
                                zxVar.a = obj;
                                zxVar.b = i11;
                            }
                            i03Var.i(i, zxVar);
                            fc3Var.h = Math.min(fc3Var.h, i);
                            fc3Var.i = Math.max(fc3Var.i, i);
                            List list2 = (List) fc3Var.b.g(i);
                            if (list2 != null) {
                                int size6 = list2.size();
                                for (int i13 = 0; i13 < size6; i13++) {
                                    ((p82) list2.get(i13)).cancel();
                                }
                            }
                        } else {
                            z7 = true;
                        }
                        i10++;
                        f4 = f;
                        z8 = z7;
                        i7 = -1;
                    }
                    z4 = z8;
                    float f5 = f4;
                    if (fc3Var.l) {
                        boolean z10 = fc3Var.f <= f5 ? z4 : false;
                        if (qp4Var.c()) {
                            te5.x(qp4Var.e());
                            z6 = false;
                            fc3Var.c(qp4Var, qp4Var.b(), qp4Var.d(), qp4Var.e().t != null ? ((ad3) om1Var.o).o : 0, qp4Var.f(), qp4Var.g(), 0.0f, z10);
                        } else {
                            z6 = false;
                        }
                        fc3Var.l = z6;
                        z5 = z6;
                    } else {
                        z3 = z3;
                        z4 = z4;
                        z5 = false;
                    }
                } else {
                    z3 = z3;
                    z4 = true;
                    z5 = false;
                    fc3Var.f();
                }
                fc3Var.g = qp4Var.h();
                r2 = z5;
            }
            this.m.setValue(qc3Var);
            this.C.setValue(Boolean.valueOf(qc3Var.m));
            if (xi2Var != null) {
                i2 = xi2Var.a;
            } else {
                r10 = r2;
            }
            if (r10 == 0 || i3 != 0) {
                r10 = i2;
                r7 = z4;
            } else {
                r7 = r2;
            }
            this.D.setValue(Boolean.valueOf((boolean) r7));
            if (xi2Var != null) {
                this.e = xi2Var.a;
            }
            this.f = i3;
            ch4 ch4VarT = ya4.t();
            if1 if1VarE = ch4VarT != null ? ch4VarT.e() : null;
            ch4 ch4VarZ = ya4.z(ch4VarT);
            if (z3) {
                try {
                    if (qc3Var.h < n() && Math.abs(this.j) > 0.5f) {
                        f2 = this.j;
                        if (m().e == hb3.n) {
                            if (Math.signum(f2) == Math.signum(-Float.intBitsToFloat((int) (q() & 4294967295L)))) {
                                if (r()) {
                                }
                            }
                        } else if (Math.signum(f2) == Math.signum(-Float.intBitsToFloat((int) (q() >> 32)))) {
                            if (r()) {
                            }
                        }
                        fc3Var.d(this.j, qc3Var);
                    }
                } catch (Throwable th) {
                    ya4.H(ch4VarT, ch4VarZ, if1VarE);
                    throw th;
                }
            }
            ya4.H(ch4VarT, ch4VarZ, if1VarE);
            this.g = ed3.a(qc3Var, n());
            n();
            if (qc3Var.e == hb3.o) {
                jI = qc3Var.i() >> 32;
            } else {
                jI = qc3Var.i() & 4294967295L;
            }
            int i14 = (int) jI;
            qc3Var.n.getClass();
            jM = gb.m(r2, r2, i14);
            j = this.g;
            if (jM > j) {
                jM = j;
            }
            this.h = jM;
        }
        ((vd3) nqVar.q).h(f3);
        z4 = true;
        z3 = z9;
        r2 = 0;
        this.m.setValue(qc3Var);
        this.C.setValue(Boolean.valueOf(qc3Var.m));
        if (xi2Var != null) {
            i2 = xi2Var.a;
        } else {
            r10 = r2;
        }
        if (r10 == 0) {
            r10 = i2;
            r7 = z4;
        } else {
            r10 = i2;
            r7 = z4;
        }
        this.D.setValue(Boolean.valueOf((boolean) r7));
        if (xi2Var != null) {
            this.e = xi2Var.a;
        }
        this.f = i3;
        ch4 ch4VarT2 = ya4.t();
        if1 if1VarE2 = ch4VarT2 != null ? ch4VarT2.e() : null;
        ch4 ch4VarZ2 = ya4.z(ch4VarT2);
        if (z3) {
            if (qc3Var.h < n()) {
                f2 = this.j;
                if (m().e == hb3.n) {
                    if (Math.signum(f2) == Math.signum(-Float.intBitsToFloat((int) (q() & 4294967295L)))) {
                        if (r()) {
                        }
                    }
                } else if (Math.signum(f2) == Math.signum(-Float.intBitsToFloat((int) (q() >> 32)))) {
                    if (r()) {
                    }
                }
                fc3Var.d(this.j, qc3Var);
            }
        }
        ya4.H(ch4VarT2, ch4VarZ2, if1VarE2);
        this.g = ed3.a(qc3Var, n());
        n();
        if (qc3Var.e == hb3.o) {
            jI = qc3Var.i() >> 32;
        } else {
            jI = qc3Var.i() & 4294967295L;
        }
        int i15 = (int) jI;
        qc3Var.n.getClass();
        jM = gb.m(r2, r2, i15);
        j = this.g;
        if (jM > j) {
            jM = j;
        }
        this.h = jM;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object i(wd0 wd0Var) {
        Object value = this.m.getValue();
        qc3 qc3Var = ed3.b;
        j15 j15Var = j15.a;
        if (value == qc3Var) {
            io ioVar = this.w;
            x60 x60Var = ioVar.b;
            if (x60Var == null) {
                int i = 1;
                x60Var = new x60(true);
                x60Var.N(null);
                ioVar.b = x60Var;
                ho hoVar = ioVar.a;
                if (hoVar != null && hoVar.A) {
                    o oVar = new o(i, hoVar, hoVar.C);
                    c72 c72VarO = j51.O(hoVar);
                    int i2 = c72VarO.o;
                    yv3 rectManager = ((ra) h12.L(c72VarO)).getRectManager();
                    pt4 pt4Var = rectManager.d;
                    pt4Var.getClass();
                    i03 i03Var = pt4Var.a;
                    ot4 ot4Var = new ot4(pt4Var, i2, hoVar, oVar);
                    Object objB = i03Var.b(i2);
                    if (objB == null) {
                        i03Var.i(i2, ot4Var);
                        objB = ot4Var;
                    }
                    ot4 ot4Var2 = (ot4) objB;
                    if (ot4Var2 != ot4Var) {
                        while (true) {
                            ot4 ot4Var3 = ot4Var2.d;
                            if (ot4Var3 == null) {
                                break;
                            }
                            ot4Var2 = ot4Var3;
                        }
                        ot4Var2.d = ot4Var;
                    }
                    c72 c72VarO2 = j51.O(hoVar.n);
                    if (yv3.d(c72VarO2)) {
                        ue1 ue1Var = rectManager.c;
                        int iE = rectManager.e(c72VarO2);
                        long[] jArr = (long[]) ue1Var.p;
                        int i3 = iE + 2;
                        jArr[i3] = (jArr[i3] & 8070450532247928831L) | (-8070450532247928832L);
                    }
                    rectManager.f = true;
                    rectManager.k();
                    hoVar.B = ot4Var;
                }
            }
            Object objJ0 = x60Var.j0(wd0Var);
            xe0 xe0Var = xe0.n;
            if (objJ0 != xe0Var) {
                objJ0 = j15Var;
            }
            if (objJ0 == xe0Var) {
                return objJ0;
            }
        }
        return j15Var;
    }

    public final int j(int i) {
        if (n() > 0) {
            return gb.m(i, 0, n() - 1);
        }
        return 0;
    }

    public final int k() {
        return ((wd3) this.d.p).g();
    }

    public final float l() {
        return ((vd3) this.d.q).g();
    }

    public final qc3 m() {
        return (qc3) this.m.getValue();
    }

    public abstract int n();

    public final int o() {
        return ((qc3) this.m.getValue()).b;
    }

    public final int p() {
        return ((qc3) this.m.getValue()).c + o();
    }

    public final long q() {
        return ((g83) this.c.getValue()).a;
    }

    public final boolean r() {
        return ((int) Float.intBitsToFloat((int) (q() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (q() & 4294967295L))) == 0;
    }

    public final void t(float f, int i, boolean z) {
        nq nqVar = this.d;
        wd3 wd3Var = (wd3) nqVar.p;
        vd3 vd3Var = (vd3) nqVar.q;
        if (wd3Var.g() != i || vd3Var.g() != f) {
            this.u.f();
        }
        ((wd3) nqVar.p).h(i);
        g82 g82Var = (g82) nqVar.s;
        if (i != g82Var.o) {
            g82Var.o = i;
            int i2 = (i / 30) * 30;
            g82Var.n.setValue(gb.g0(Math.max(i2 - 100, 0), i2 + 130));
        }
        vd3Var.h(f);
        nqVar.r = null;
        if (!z) {
            this.B.setValue(j15.a);
            return;
        }
        c72 c72Var = (c72) this.x.getValue();
        if (c72Var != null) {
            c72Var.l();
        }
    }
}
