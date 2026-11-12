package defpackage;

import android.os.Looper;
import android.view.SurfaceHolder;
import androidx.media3.common.PlaybackException;
import com.eddyizm.tempus.homemusic.WaveRetry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qe4 extends fq {
    public final tc2 c;
    public final Looper d;
    public final yp4 e;
    public final HashSet f;
    public final zt4 g;
    public pe4 h;
    public boolean i;

    public qe4(Looper looper) {
        this.d = looper;
        vp4 vp4Var = vp4.a;
        this.e = vp4Var.a(looper, null);
        this.f = new HashSet();
        this.g = new zt4();
        this.c = new tc2(looper, vp4Var, new ss2(16, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    public static ArrayList Z0(pe4 pe4Var, zt4 zt4Var, bu4 bu4Var) {
        int r7;
        long j;
        cu4 cu4Var = pe4Var.w;
        if (cu4Var instanceof le4) {
            return new ArrayList(((le4) cu4Var).e);
        }
        ArrayList arrayList = new ArrayList(cu4Var.o());
        boolean z = false;
        int i = 0;
        while (i < cu4Var.o()) {
            int i2 = pe4Var.A;
            // Smali shows the -1 case is normalized to zero before comparing
            // the current window index. The DEX register is reused for an int,
            // not for a boolean (JADX merged two incompatible SSA versions).
            r7 = i2 == -1 ? 0 : i2;
            boolean z2 = true;
            boolean z3 = r7 == i;
            cu4Var.n(i, bu4Var);
            uw1 uw1VarJ = yw1.j();
            int i3 = bu4Var.m;
            while (true) {
                j = -9223372036854775807L;
                if (i3 > bu4Var.n) {
                    break;
                }
                cu4Var.f(i3, zt4Var, z2);
                boolean z4 = z2;
                Object obj = zt4Var.b;
                obj.getClass();
                ie4 ie4Var = new ie4();
                ie4Var.a = obj;
                ie4Var.b = 0L;
                z5 z5Var = z5.f;
                ie4Var.d = z;
                ie4Var.c = zt4Var.g;
                int i4 = i;
                long j2 = zt4Var.d;
                rr2.l((j2 == -9223372036854775807L || j2 >= 0) ? z4 : false);
                ie4Var.b = j2;
                ie4Var.d = zt4Var.f;
                uw1VarJ.c(new je4(ie4Var));
                i3++;
                z2 = z4;
                i = i4;
                z = false;
            }
            int i5 = i;
            boolean z5 = z2;
            ge4 ge4Var = new ge4(bu4Var.a);
            long j3 = bu4Var.k;
            rr2.l(j3 >= 0 ? z5 : false);
            ge4Var.l = j3;
            ge4Var.a(bu4Var.l);
            ge4Var.i = bu4Var.f;
            ge4Var.k = bu4Var.h;
            ge4Var.o = bu4Var.j;
            ge4Var.j = bu4Var.g;
            ge4Var.f = bu4Var.i;
            ge4Var.e = bu4Var.c;
            ge4Var.c = bu4Var.b;
            ge4Var.d = z3 ? pe4Var.y : null;
            gy3 gy3VarF = uw1VarJ.f();
            int i6 = gy3VarF.q;
            int i7 = 0;
            while (i7 < i6 - 1) {
                long j4 = j;
                rr2.k("Periods other than last need a duration", ((je4) gy3VarF.get(i7)).b != j4 ? z5 : false);
                int i8 = i7 + 1;
                for (int i9 = i8; i9 < i6; i9++) {
                    rr2.k("Duplicate PeriodData UIDs in period list", !((je4) gy3VarF.get(i7)).a.equals(((je4) gy3VarF.get(i9)).a));
                }
                i7 = i8;
                j = j4;
            }
            ge4Var.p = yw1.k(gy3VarF);
            long j5 = bu4Var.o;
            if (j5 < 0) {
                z5 = false;
            }
            rr2.l(z5);
            ge4Var.n = j5;
            ge4Var.g = bu4Var.d;
            ge4Var.b = z3 ? pe4Var.x : jw4.b;
            ge4Var.h = bu4Var.e;
            arrayList.add(new he4(ge4Var));
            i = i5 + 1;
            z = false;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0071  */
    public static pe4 a1(oe4 oe4Var, pe4 pe4Var, long j, cu4 cu4Var, int i, long j2, boolean z, bu4 bu4Var) {
        long jI0;
        boolean z2;
        int i2 = i;
        long jH1 = h1(j, pe4Var, bu4Var);
        if (cu4Var.p() || (i2 != -1 && i2 < cu4Var.o())) {
            jI0 = j2;
        } else {
            jI0 = -9223372036854775807L;
            i2 = 0;
        }
        if (!cu4Var.p() && jI0 == -9223372036854775807L) {
            jI0 = f35.i0(cu4Var.m(i2, bu4Var, 0L).k);
        }
        cu4 cu4Var2 = pe4Var.w;
        xm xmVar = pe4Var.F;
        boolean z3 = cu4Var2.p() || cu4Var.p();
        if (z3) {
            z2 = false;
        } else {
            cu4 cu4Var3 = pe4Var.w;
            int i3 = pe4Var.A;
            if (i3 == -1) {
                i3 = 0;
            }
            if (cu4Var3.m(i3, bu4Var, 0L).a.equals(cu4Var.m(i2, bu4Var, 0L).a)) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        if (cu4Var.p()) {
            jw4 jw4Var = jw4.b;
            oe4Var.w = null;
            oe4Var.x = cu4Var;
            oe4Var.y = jw4Var;
            oe4Var.z = null;
        } else if (cu4Var instanceof le4) {
            he4 he4Var = (he4) ((le4) cu4Var).e.get(i2);
            jw4 jw4Var2 = he4Var.b;
            do2 do2Var = he4Var.d;
            oe4Var.w = null;
            oe4Var.x = cu4Var;
            oe4Var.y = jw4Var2;
            oe4Var.z = do2Var;
        } else {
            boolean z4 = (z3 || z2) ? false : true;
            jw4 jw4Var3 = z4 ? pe4Var.x : jw4.b;
            do2 do2Var2 = z4 ? pe4Var.y : null;
            oe4Var.w = null;
            oe4Var.x = cu4Var;
            oe4Var.y = jw4Var3;
            oe4Var.z = do2Var2;
        }
        if (z3 || z2 || jI0 < jH1) {
            oe4Var.B = i2;
            oe4Var.a();
            oe4Var.E = Long.valueOf(jI0);
            oe4Var.H = new xm(jI0);
            oe4Var.J = ne4.k;
        } else if (jI0 == jH1) {
            oe4Var.B = i2;
            if (pe4Var.B == -1 || !z) {
                oe4Var.a();
                oe4Var.J = new xm(h1(xmVar.n, pe4Var, bu4Var) - jH1);
            } else {
                oe4Var.J = new xm(pe4Var.G.n - pe4Var.E.n);
            }
        } else {
            long jMax = Math.max(h1(xmVar.n, pe4Var, bu4Var), jI0);
            long jMax2 = Math.max(0L, pe4Var.H.n - (jI0 - jH1));
            oe4Var.B = i2;
            oe4Var.a();
            oe4Var.E = Long.valueOf(jI0);
            oe4Var.H = new xm(jMax);
            oe4Var.J = new xm(jMax2);
        }
        return new pe4(oe4Var);
    }

    public static int b1(pe4 pe4Var, zt4 zt4Var, bu4 bu4Var) {
        int i = pe4Var.A;
        if (i == -1) {
            i = 0;
        }
        int i2 = i;
        if (pe4Var.w.p()) {
            return i2;
        }
        cu4 cu4Var = pe4Var.w;
        return cu4Var.b(cu4Var.i(bu4Var, zt4Var, i2, f35.Q(h1(pe4Var.D.get(), pe4Var, bu4Var))).first);
    }

    public static long c1(pe4 pe4Var, Object obj, zt4 zt4Var, bu4 bu4Var) {
        return pe4Var.B != -1 ? pe4Var.E.n : h1(pe4Var.D.get(), pe4Var, bu4Var) - f35.i0(pe4Var.w.g(obj, zt4Var).e);
    }

    public static int d1(cu4 cu4Var, le4 le4Var, int i, zt4 zt4Var, bu4 bu4Var) {
        if (!cu4Var.p()) {
            Object obj = cu4Var.f(cu4Var.m(i, bu4Var, 0L).m, zt4Var, true).b;
            obj.getClass();
            if (le4Var.b(obj) != -1) {
                le4Var.g(obj, zt4Var);
                return zt4Var.c;
            }
        } else if (i < le4Var.e.size()) {
            return i;
        }
        return -1;
    }

    public static he4 e1(gn2 gn2Var) {
        ge4 ge4Var = new ge4(new ke4());
        ge4Var.c = gn2Var;
        ge4Var.k = true;
        ge4Var.o = true;
        return new he4(ge4Var);
    }

    public static pi3 g1(pe4 pe4Var, boolean z, bu4 bu4Var, zt4 zt4Var) {
        Object obj;
        gn2 gn2Var;
        Object obj2;
        long jH1;
        long j;
        int i = pe4Var.A;
        if (i == -1) {
            i = 0;
        }
        int i2 = i;
        ne4 ne4Var = pe4Var.D;
        int i3 = pe4Var.B;
        int iB1 = b1(pe4Var, zt4Var, bu4Var);
        cu4 cu4Var = pe4Var.w;
        if (cu4Var.p()) {
            obj = null;
            gn2Var = null;
            obj2 = null;
        } else {
            Object obj3 = cu4Var.f(iB1, zt4Var, true).b;
            obj = cu4Var.m(i2, bu4Var, 0L).a;
            gn2Var = bu4Var.b;
            obj2 = obj3;
        }
        if (z) {
            j = pe4Var.K;
            jH1 = i3 == -1 ? j : h1(ne4Var.get(), pe4Var, bu4Var);
        } else {
            jH1 = h1(ne4Var.get(), pe4Var, bu4Var);
            j = i3 != -1 ? pe4Var.E.n : jH1;
        }
        return new pi3(obj, i2, gn2Var, obj2, iB1, j, jH1, pe4Var.B, pe4Var.C);
    }

    public static long h1(long j, pe4 pe4Var, bu4 bu4Var) {
        if (j != -9223372036854775807L) {
            return j;
        }
        if (pe4Var.w.p()) {
            return 0L;
        }
        cu4 cu4Var = pe4Var.w;
        int i = pe4Var.A;
        if (i == -1) {
            i = 0;
        }
        return f35.i0(cu4Var.m(i, bu4Var, 0L).k);
    }

    public static pe4 j1(pe4 pe4Var, ArrayList arrayList, zt4 zt4Var, bu4 bu4Var) {
        oe4 oe4VarA = pe4Var.a();
        le4 le4Var = new le4(arrayList);
        cu4 cu4Var = pe4Var.w;
        long j = pe4Var.D.get();
        int i = pe4Var.A;
        if (i == -1) {
            i = 0;
        }
        int iD1 = d1(cu4Var, le4Var, i, zt4Var, bu4Var);
        long j2 = iD1 == -1 ? -9223372036854775807L : j;
        for (int i2 = i + 1; iD1 == -1 && i2 < cu4Var.o(); i2++) {
            iD1 = d1(cu4Var, le4Var, i2, zt4Var, bu4Var);
        }
        if (pe4Var.d != 1 && iD1 == -1) {
            oe4VarA.d = 4;
        }
        return a1(oe4VarA, pe4Var, j, le4Var, iD1, j2, true, bu4Var);
    }

    public static pe4 k1(pe4 pe4Var, ArrayList arrayList, int i, long j, bu4 bu4Var) {
        oe4 oe4VarA = pe4Var.a();
        cu4 le4Var = arrayList == null ? pe4Var.w : new le4(arrayList);
        if (pe4Var.d != 1) {
            if (le4Var.p() || (i != -1 && i >= le4Var.o())) {
                oe4VarA.d = 4;
            } else {
                oe4VarA.d = 2;
            }
        }
        return a1(oe4VarA, pe4Var, pe4Var.D.get(), le4Var, i, j, false, bu4Var);
    }

    public static boolean z1(pe4 pe4Var) {
        return pe4Var.b && pe4Var.d == 3 && pe4Var.e == 0;
    }

    @Override // defpackage.qi3
    public final void A0() {
        F1();
        pe4 pe4Var = this.h;
        if (C1(24) && this.h.o != 0.0f) {
            ic2 ic2VarX1 = x1(0.0f);
            boolean zIsDone = ic2VarX1.isDone();
            HashSet hashSet = this.f;
            if (zIsDone && hashSet.isEmpty()) {
                D1(i1(), false, false);
                return;
            }
            hashSet.add(ic2VarX1);
            oe4 oe4VarA = pe4Var.a();
            oe4VarA.c(0.0f);
            D1(f1(new pe4(oe4VarA)), false, false);
            ic2VarX1.f(new ur2(21, this, ic2VarX1), new h41(3, this));
        }
    }

    public final void A1() {
        F1();
        pe4 pe4Var = this.h;
        if (C1(32)) {
            ic2 ic2VarO1 = o1();
            boolean zIsDone = ic2VarO1.isDone();
            HashSet hashSet = this.f;
            if (zIsDone && hashSet.isEmpty()) {
                D1(i1(), false, false);
            } else {
                hashSet.add(ic2VarO1);
                D1(f1(pe4Var), false, false);
                ic2VarO1.f(new ur2(21, this, ic2VarO1), new h41(3, this));
            }
            this.i = true;
            this.c.d();
            oe4 oe4VarA = this.h.a();
            oe4VarA.d = 1;
            oe4VarA.J = ne4.k;
            oe4VarA.H = new xm(h1(pe4Var.D.get(), pe4Var, this.b));
            oe4VarA.I = pe4Var.E;
            this.h = new pe4(oe4VarA);
        }
    }

    @Override // defpackage.qi3
    public final float B() {
        F1();
        return this.h.o;
    }

    public final void B1(final List list, final int i, final long j) {
        rr2.l(i == -1 || i >= 0);
        final pe4 pe4Var = this.h;
        if (C1(20) || (list.size() == 1 && C1(31))) {
            E1(s1(list, i, j), new go4() { // from class: zd4
                @Override // defpackage.go4
                public final Object get() {
                    ArrayList arrayList = new ArrayList();
                    int i2 = 0;
                    while (true) {
                        List list2 = list;
                        if (i2 >= list2.size()) {
                            return qe4.k1(pe4Var, arrayList, i, j, this.n.b);
                        }
                        arrayList.add(qe4.e1((gn2) list2.get(i2)));
                        i2++;
                    }
                }
            }, false, false);
        }
    }

    @Override // defpackage.qi3
    public final void C0() {
        F1();
        if (C1(26)) {
            kf2.o("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
        }
    }

    public final boolean C1(int i) {
        return !this.i && this.h.a.a(i);
    }

    @Override // defpackage.qi3
    public final il D() {
        F1();
        return this.h.n;
    }

    @Override // defpackage.qi3
    public final boolean D0() {
        F1();
        return this.h.h;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x017d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0187  */
    /* JADX WARN: Code duplicated, block: B:110:0x018b  */
    /* JADX WARN: Code duplicated, block: B:113:0x0192  */
    /* JADX WARN: Code duplicated, block: B:115:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:121:0x01b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:126:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:129:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:131:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:136:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:141:0x020e  */
    /* JADX WARN: Code duplicated, block: B:143:0x0218  */
    /* JADX WARN: Code duplicated, block: B:146:0x022a  */
    /* JADX WARN: Code duplicated, block: B:149:0x0240  */
    /* JADX WARN: Code duplicated, block: B:152:0x0255  */
    /* JADX WARN: Code duplicated, block: B:155:0x0263 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:156:0x0265  */
    /* JADX WARN: Code duplicated, block: B:158:0x0270  */
    /* JADX WARN: Code duplicated, block: B:161:0x027f  */
    /* JADX WARN: Code duplicated, block: B:163:0x0285  */
    /* JADX WARN: Code duplicated, block: B:166:0x0297  */
    /* JADX WARN: Code duplicated, block: B:169:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:172:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:175:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:178:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:181:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:184:0x0309  */
    /* JADX WARN: Code duplicated, block: B:187:0x031a  */
    /* JADX WARN: Code duplicated, block: B:190:0x032c  */
    /* JADX WARN: Code duplicated, block: B:193:0x033f  */
    /* JADX WARN: Code duplicated, block: B:196:0x0353  */
    /* JADX WARN: Code duplicated, block: B:199:0x0367  */
    /* JADX WARN: Code duplicated, block: B:202:0x037b  */
    /* JADX WARN: Code duplicated, block: B:205:0x038f  */
    /* JADX WARN: Code duplicated, block: B:209:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:212:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:215:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:220:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:223:0x01bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x01b6 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:95:0x0155  */
    public final void D1(final pe4 pe4Var, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        int i;
        qv2 qv2Var;
        PlaybackException playbackException;
        int i2;
        tc2 tc2Var;
        qv2 qv2Var2;
        boolean z5;
        final int i3;
        final int i4;
        final int i5;
        PlaybackException playbackException2;
        final int i6;
        final int i7;
        final int i8;
        final int i9;
        final int i10;
        final int i11;
        final int i12;
        qv2 qv2Var3;
        gn2 gn2Var;
        int i13;
        int i14;
        Object obj;
        Object obj2;
        boolean z6;
        pe4 pe4Var2 = this.h;
        this.h = pe4Var;
        boolean z7 = pe4Var.I;
        qv2 qv2Var4 = pe4Var.v;
        PlaybackException playbackException3 = pe4Var.f;
        int i15 = pe4Var.A;
        cu4 cu4Var = pe4Var.w;
        if (z7) {
            oe4 oe4VarA = pe4Var.a();
            oe4VarA.K = false;
            this.h = new pe4(oe4VarA);
        }
        boolean z8 = pe4Var2.b;
        int i16 = pe4Var2.C;
        int i17 = pe4Var2.B;
        cu4 cu4Var2 = pe4Var2.w;
        boolean z9 = z8 != pe4Var.b;
        boolean z10 = pe4Var2.d != pe4Var.d;
        zt4 zt4Var = this.g;
        bu4 bu4Var = this.b;
        if (z7) {
            z3 = z9;
            i = pe4Var.J;
            z4 = z10;
        } else if (z) {
            z3 = z9;
            z4 = z10;
            i = 1;
        } else {
            if (cu4Var2.p()) {
                z3 = z9;
                z4 = z10;
            } else {
                if (cu4Var.p()) {
                    z3 = z9;
                    z4 = z10;
                } else {
                    Object objL = cu4Var2.l(b1(pe4Var2, zt4Var, bu4Var));
                    z3 = z9;
                    Object objL2 = cu4Var.l(b1(pe4Var, zt4Var, bu4Var));
                    z4 = z10;
                    if (!(objL instanceof ke4) || (objL2 instanceof ke4)) {
                        if (objL2.equals(objL) && i17 == pe4Var.B && i16 == pe4Var.C) {
                            long jC1 = c1(pe4Var2, objL, zt4Var, bu4Var);
                            if (Math.abs(jC1 - c1(pe4Var, objL2, zt4Var, bu4Var)) >= 1000) {
                                cu4Var2.g(objL, zt4Var);
                                long jI0 = f35.i0(i17 == -1 ? zt4Var.d : zt4Var.a(i17, i16));
                                if (jI0 == -9223372036854775807L || jC1 < jI0) {
                                    i = 5;
                                } else {
                                    i = 0;
                                }
                            }
                        } else if (cu4Var.b(objL) != -1) {
                            long jC2 = c1(pe4Var2, objL, zt4Var, bu4Var);
                            cu4Var2.g(objL, zt4Var);
                            long jI1 = f35.i0(i17 == -1 ? zt4Var.d : zt4Var.a(i17, i16));
                            if (jI1 == -9223372036854775807L || jC2 < jI1) {
                                i = 3;
                            } else {
                                i = 0;
                            }
                        }
                    }
                }
                i = 4;
            }
            i = -1;
        }
        boolean zEquals = cu4Var2.equals(cu4Var);
        if (!cu4Var.p() || !cu4Var2.p()) {
            if (cu4Var.p() == cu4Var2.p()) {
                int i18 = pe4Var2.A;
                if (i18 == -1) {
                    i18 = 0;
                }
                Object obj3 = cu4Var2.m(i18, bu4Var, 0L).a;
                qv2Var = qv2Var4;
                playbackException = playbackException3;
                Object obj4 = cu4Var.m(i15 != -1 ? i15 : 0, bu4Var, 0L).a;
                if (!(obj3 instanceof ke4) || (obj4 instanceof ke4)) {
                    if (obj3.equals(obj4)) {
                        if (i == 0 && h1(pe4Var2.D.get(), pe4Var2, bu4Var) > h1(pe4Var.D.get(), pe4Var, bu4Var)) {
                            i2 = 0;
                        } else if (i == 1 && z2) {
                            i2 = 2;
                        }
                    } else if (i == 0) {
                        i2 = 1;
                    } else if (i == 1) {
                        i2 = 2;
                    }
                }
                tc2Var = this.c;
                if (zEquals) {
                    qv2Var2 = qv2Var;
                    z5 = false;
                } else {
                    if (cu4Var2.o() != cu4Var.o()) {
                        qv2Var2 = qv2Var;
                    } else {
                        i13 = 0;
                        while (true) {
                            if (i13 >= cu4Var2.o()) {
                                qv2Var2 = qv2Var;
                                i14 = 1;
                                break;
                            }
                            obj = cu4Var2.m(i13, bu4Var, 0L).a;
                            qv2Var2 = qv2Var;
                            obj2 = cu4Var.m(i13, bu4Var, 0L).a;
                            if ((obj instanceof ke4) || (obj2 instanceof ke4)) {
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                            if (!obj.equals(obj2) || z6) {
                                i13++;
                                qv2Var = qv2Var2;
                            }
                        }
                        q31 q31Var = new q31(i14, 7, pe4Var);
                        z5 = false;
                        tc2Var.c(0, q31Var);
                    }
                    i14 = 0;
                    q31 q31Var2 = new q31(i14, 7, pe4Var);
                    z5 = false;
                    tc2Var.c(0, q31Var2);
                }
                if (i != -1) {
                    tc2Var.c(11, new z31(i, g1(pe4Var2, z5, bu4Var, zt4Var), g1(pe4Var, z7, bu4Var, zt4Var), 1));
                }
                if (i2 != -1) {
                    if (cu4Var.p()) {
                        gn2Var = null;
                    } else {
                        if (i15 == -1) {
                            i15 = 0;
                        }
                        gn2Var = cu4Var.m(i15, bu4Var, 0L).b;
                    }
                    tc2Var.c(1, new a41(gn2Var, i2, 1));
                }
                i3 = 18;
                i4 = 17;
                i5 = 10;
                playbackException2 = playbackException;
                if (pe4Var2.f != playbackException2) {
                    tc2Var.c(10, new qc2() { // from class: ae4
                        @Override // defpackage.qc2
                        public final void invoke(Object obj5) {
                            int i19 = i4;
                            pe4 pe4Var3 = pe4Var;
                            oi3 oi3Var = (oi3) obj5;
                            switch (i19) {
                                case 0:
                                    oi3Var.V(qe4.z1(pe4Var3));
                                    break;
                                case 1:
                                    oi3Var.N(pe4Var3.l);
                                    break;
                                case 2:
                                    oi3Var.f(pe4Var3.g);
                                    break;
                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                    oi3Var.x(pe4Var3.h);
                                    break;
                                case 4:
                                    oi3Var.E(pe4Var3.i);
                                    break;
                                case 5:
                                    oi3Var.H(pe4Var3.j);
                                    break;
                                case 6:
                                    oi3Var.R(pe4Var3.k);
                                    break;
                                case 7:
                                    oi3Var.n(pe4Var3.n);
                                    break;
                                case 8:
                                    oi3Var.a(pe4Var3.q);
                                    break;
                                case 9:
                                    oi3Var.Q(pe4Var3.s);
                                    break;
                                case 10:
                                    oi3Var.G(pe4Var3.z);
                                    break;
                                case 11:
                                    pf4 pf4Var = pe4Var3.u;
                                    oi3Var.T(pf4Var.a, pf4Var.b);
                                    break;
                                case 12:
                                    oi3Var.s(pe4Var3.o);
                                    break;
                                case 13:
                                    oi3Var.C(pe4Var3.t, false);
                                    break;
                                case 14:
                                    oi3Var.K(pe4Var3.r.a);
                                    oi3Var.e(pe4Var3.r);
                                    break;
                                case 15:
                                    oi3Var.h(pe4Var3.v);
                                    break;
                                case WaveRetry.MAX_FAILURES /* 16 */:
                                    oi3Var.O(pe4Var3.a);
                                    break;
                                case 17:
                                    oi3Var.P(pe4Var3.f);
                                    break;
                                case 18:
                                    PlaybackException playbackException4 = pe4Var3.f;
                                    String str = f35.a;
                                    oi3Var.S(playbackException4);
                                    break;
                                case 19:
                                    oi3Var.o(pe4Var3.m);
                                    break;
                                case 20:
                                    oi3Var.A(pe4Var3.x);
                                    break;
                                case 21:
                                    oi3Var.F(pe4Var3.y);
                                    break;
                                case 22:
                                    oi3Var.L(pe4Var3.d, pe4Var3.b);
                                    break;
                                case 23:
                                    oi3Var.v(pe4Var3.d);
                                    break;
                                case 24:
                                    oi3Var.r(pe4Var3.c, pe4Var3.b);
                                    break;
                                default:
                                    oi3Var.g(pe4Var3.e);
                                    break;
                            }
                        }
                    });
                    if (playbackException2 != null) {
                        tc2Var.c(10, new qc2() { // from class: ae4
                            @Override // defpackage.qc2
                            public final void invoke(Object obj5) {
                                int i19 = i3;
                                pe4 pe4Var3 = pe4Var;
                                oi3 oi3Var = (oi3) obj5;
                                switch (i19) {
                                    case 0:
                                        oi3Var.V(qe4.z1(pe4Var3));
                                        break;
                                    case 1:
                                        oi3Var.N(pe4Var3.l);
                                        break;
                                    case 2:
                                        oi3Var.f(pe4Var3.g);
                                        break;
                                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                        oi3Var.x(pe4Var3.h);
                                        break;
                                    case 4:
                                        oi3Var.E(pe4Var3.i);
                                        break;
                                    case 5:
                                        oi3Var.H(pe4Var3.j);
                                        break;
                                    case 6:
                                        oi3Var.R(pe4Var3.k);
                                        break;
                                    case 7:
                                        oi3Var.n(pe4Var3.n);
                                        break;
                                    case 8:
                                        oi3Var.a(pe4Var3.q);
                                        break;
                                    case 9:
                                        oi3Var.Q(pe4Var3.s);
                                        break;
                                    case 10:
                                        oi3Var.G(pe4Var3.z);
                                        break;
                                    case 11:
                                        pf4 pf4Var = pe4Var3.u;
                                        oi3Var.T(pf4Var.a, pf4Var.b);
                                        break;
                                    case 12:
                                        oi3Var.s(pe4Var3.o);
                                        break;
                                    case 13:
                                        oi3Var.C(pe4Var3.t, false);
                                        break;
                                    case 14:
                                        oi3Var.K(pe4Var3.r.a);
                                        oi3Var.e(pe4Var3.r);
                                        break;
                                    case 15:
                                        oi3Var.h(pe4Var3.v);
                                        break;
                                    case WaveRetry.MAX_FAILURES /* 16 */:
                                        oi3Var.O(pe4Var3.a);
                                        break;
                                    case 17:
                                        oi3Var.P(pe4Var3.f);
                                        break;
                                    case 18:
                                        PlaybackException playbackException4 = pe4Var3.f;
                                        String str = f35.a;
                                        oi3Var.S(playbackException4);
                                        break;
                                    case 19:
                                        oi3Var.o(pe4Var3.m);
                                        break;
                                    case 20:
                                        oi3Var.A(pe4Var3.x);
                                        break;
                                    case 21:
                                        oi3Var.F(pe4Var3.y);
                                        break;
                                    case 22:
                                        oi3Var.L(pe4Var3.d, pe4Var3.b);
                                        break;
                                    case 23:
                                        oi3Var.v(pe4Var3.d);
                                        break;
                                    case 24:
                                        oi3Var.r(pe4Var3.c, pe4Var3.b);
                                        break;
                                    default:
                                        oi3Var.g(pe4Var3.e);
                                        break;
                                }
                            }
                        });
                    }
                }
                if (!pe4Var2.m.equals(pe4Var.m)) {
                    final int i19 = 19;
                    tc2Var.c(19, new qc2() { // from class: ae4
                        @Override // defpackage.qc2
                        public final void invoke(Object obj5) {
                            int i110 = i19;
                            pe4 pe4Var3 = pe4Var;
                            oi3 oi3Var = (oi3) obj5;
                            switch (i110) {
                                case 0:
                                    oi3Var.V(qe4.z1(pe4Var3));
                                    break;
                                case 1:
                                    oi3Var.N(pe4Var3.l);
                                    break;
                                case 2:
                                    oi3Var.f(pe4Var3.g);
                                    break;
                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                    oi3Var.x(pe4Var3.h);
                                    break;
                                case 4:
                                    oi3Var.E(pe4Var3.i);
                                    break;
                                case 5:
                                    oi3Var.H(pe4Var3.j);
                                    break;
                                case 6:
                                    oi3Var.R(pe4Var3.k);
                                    break;
                                case 7:
                                    oi3Var.n(pe4Var3.n);
                                    break;
                                case 8:
                                    oi3Var.a(pe4Var3.q);
                                    break;
                                case 9:
                                    oi3Var.Q(pe4Var3.s);
                                    break;
                                case 10:
                                    oi3Var.G(pe4Var3.z);
                                    break;
                                case 11:
                                    pf4 pf4Var = pe4Var3.u;
                                    oi3Var.T(pf4Var.a, pf4Var.b);
                                    break;
                                case 12:
                                    oi3Var.s(pe4Var3.o);
                                    break;
                                case 13:
                                    oi3Var.C(pe4Var3.t, false);
                                    break;
                                case 14:
                                    oi3Var.K(pe4Var3.r.a);
                                    oi3Var.e(pe4Var3.r);
                                    break;
                                case 15:
                                    oi3Var.h(pe4Var3.v);
                                    break;
                                case WaveRetry.MAX_FAILURES /* 16 */:
                                    oi3Var.O(pe4Var3.a);
                                    break;
                                case 17:
                                    oi3Var.P(pe4Var3.f);
                                    break;
                                case 18:
                                    PlaybackException playbackException4 = pe4Var3.f;
                                    String str = f35.a;
                                    oi3Var.S(playbackException4);
                                    break;
                                case 19:
                                    oi3Var.o(pe4Var3.m);
                                    break;
                                case 20:
                                    oi3Var.A(pe4Var3.x);
                                    break;
                                case 21:
                                    oi3Var.F(pe4Var3.y);
                                    break;
                                case 22:
                                    oi3Var.L(pe4Var3.d, pe4Var3.b);
                                    break;
                                case 23:
                                    oi3Var.v(pe4Var3.d);
                                    break;
                                case 24:
                                    oi3Var.r(pe4Var3.c, pe4Var3.b);
                                    break;
                                default:
                                    oi3Var.g(pe4Var3.e);
                                    break;
                            }
                        }
                    });
                }
                i6 = 20;
                if (!pe4Var2.x.equals(pe4Var.x)) {
                    tc2Var.c(2, new qc2() { // from class: ae4
                        @Override // defpackage.qc2
                        public final void invoke(Object obj5) {
                            int i110 = i6;
                            pe4 pe4Var3 = pe4Var;
                            oi3 oi3Var = (oi3) obj5;
                            switch (i110) {
                                case 0:
                                    oi3Var.V(qe4.z1(pe4Var3));
                                    break;
                                case 1:
                                    oi3Var.N(pe4Var3.l);
                                    break;
                                case 2:
                                    oi3Var.f(pe4Var3.g);
                                    break;
                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                    oi3Var.x(pe4Var3.h);
                                    break;
                                case 4:
                                    oi3Var.E(pe4Var3.i);
                                    break;
                                case 5:
                                    oi3Var.H(pe4Var3.j);
                                    break;
                                case 6:
                                    oi3Var.R(pe4Var3.k);
                                    break;
                                case 7:
                                    oi3Var.n(pe4Var3.n);
                                    break;
                                case 8:
                                    oi3Var.a(pe4Var3.q);
                                    break;
                                case 9:
                                    oi3Var.Q(pe4Var3.s);
                                    break;
                                case 10:
                                    oi3Var.G(pe4Var3.z);
                                    break;
                                case 11:
                                    pf4 pf4Var = pe4Var3.u;
                                    oi3Var.T(pf4Var.a, pf4Var.b);
                                    break;
                                case 12:
                                    oi3Var.s(pe4Var3.o);
                                    break;
                                case 13:
                                    oi3Var.C(pe4Var3.t, false);
                                    break;
                                case 14:
                                    oi3Var.K(pe4Var3.r.a);
                                    oi3Var.e(pe4Var3.r);
                                    break;
                                case 15:
                                    oi3Var.h(pe4Var3.v);
                                    break;
                                case WaveRetry.MAX_FAILURES /* 16 */:
                                    oi3Var.O(pe4Var3.a);
                                    break;
                                case 17:
                                    oi3Var.P(pe4Var3.f);
                                    break;
                                case 18:
                                    PlaybackException playbackException4 = pe4Var3.f;
                                    String str = f35.a;
                                    oi3Var.S(playbackException4);
                                    break;
                                case 19:
                                    oi3Var.o(pe4Var3.m);
                                    break;
                                case 20:
                                    oi3Var.A(pe4Var3.x);
                                    break;
                                case 21:
                                    oi3Var.F(pe4Var3.y);
                                    break;
                                case 22:
                                    oi3Var.L(pe4Var3.d, pe4Var3.b);
                                    break;
                                case 23:
                                    oi3Var.v(pe4Var3.d);
                                    break;
                                case 24:
                                    oi3Var.r(pe4Var3.c, pe4Var3.b);
                                    break;
                                default:
                                    oi3Var.g(pe4Var3.e);
                                    break;
                            }
                        }
                    });
                }
                if (!pe4Var2.y.equals(pe4Var.y)) {
                    final int i20 = 21;
                    tc2Var.c(14, new qc2() { // from class: ae4
                        @Override // defpackage.qc2
                        public final void invoke(Object obj5) {
                            int i110 = i20;
                            pe4 pe4Var3 = pe4Var;
                            oi3 oi3Var = (oi3) obj5;
                            switch (i110) {
                                case 0:
                                    oi3Var.V(qe4.z1(pe4Var3));
                                    break;
                                case 1:
                                    oi3Var.N(pe4Var3.l);
                                    break;
                                case 2:
                                    oi3Var.f(pe4Var3.g);
                                    break;
                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                    oi3Var.x(pe4Var3.h);
                                    break;
                                case 4:
                                    oi3Var.E(pe4Var3.i);
                                    break;
                                case 5:
                                    oi3Var.H(pe4Var3.j);
                                    break;
                                case 6:
                                    oi3Var.R(pe4Var3.k);
                                    break;
                                case 7:
                                    oi3Var.n(pe4Var3.n);
                                    break;
                                case 8:
                                    oi3Var.a(pe4Var3.q);
                                    break;
                                case 9:
                                    oi3Var.Q(pe4Var3.s);
                                    break;
                                case 10:
                                    oi3Var.G(pe4Var3.z);
                                    break;
                                case 11:
                                    pf4 pf4Var = pe4Var3.u;
                                    oi3Var.T(pf4Var.a, pf4Var.b);
                                    break;
                                case 12:
                                    oi3Var.s(pe4Var3.o);
                                    break;
                                case 13:
                                    oi3Var.C(pe4Var3.t, false);
                                    break;
                                case 14:
                                    oi3Var.K(pe4Var3.r.a);
                                    oi3Var.e(pe4Var3.r);
                                    break;
                                case 15:
                                    oi3Var.h(pe4Var3.v);
                                    break;
                                case WaveRetry.MAX_FAILURES /* 16 */:
                                    oi3Var.O(pe4Var3.a);
                                    break;
                                case 17:
                                    oi3Var.P(pe4Var3.f);
                                    break;
                                case 18:
                                    PlaybackException playbackException4 = pe4Var3.f;
                                    String str = f35.a;
                                    oi3Var.S(playbackException4);
                                    break;
                                case 19:
                                    oi3Var.o(pe4Var3.m);
                                    break;
                                case 20:
                                    oi3Var.A(pe4Var3.x);
                                    break;
                                case 21:
                                    oi3Var.F(pe4Var3.y);
                                    break;
                                case 22:
                                    oi3Var.L(pe4Var3.d, pe4Var3.b);
                                    break;
                                case 23:
                                    oi3Var.v(pe4Var3.d);
                                    break;
                                case 24:
                                    oi3Var.r(pe4Var3.c, pe4Var3.b);
                                    break;
                                default:
                                    oi3Var.g(pe4Var3.e);
                                    break;
                            }
                        }
                    });
                }
                i7 = 22;
                if (z3 || z4) {
                    tc2Var.c(-1, new qc2() { // from class: ae4
                        @Override // defpackage.qc2
                        public final void invoke(Object obj5) {
                            int i110 = i7;
                            pe4 pe4Var3 = pe4Var;
                            oi3 oi3Var = (oi3) obj5;
                            switch (i110) {
                                case 0:
                                    oi3Var.V(qe4.z1(pe4Var3));
                                    break;
                                case 1:
                                    oi3Var.N(pe4Var3.l);
                                    break;
                                case 2:
                                    oi3Var.f(pe4Var3.g);
                                    break;
                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                    oi3Var.x(pe4Var3.h);
                                    break;
                                case 4:
                                    oi3Var.E(pe4Var3.i);
                                    break;
                                case 5:
                                    oi3Var.H(pe4Var3.j);
                                    break;
                                case 6:
                                    oi3Var.R(pe4Var3.k);
                                    break;
                                case 7:
                                    oi3Var.n(pe4Var3.n);
                                    break;
                                case 8:
                                    oi3Var.a(pe4Var3.q);
                                    break;
                                case 9:
                                    oi3Var.Q(pe4Var3.s);
                                    break;
                                case 10:
                                    oi3Var.G(pe4Var3.z);
                                    break;
                                case 11:
                                    pf4 pf4Var = pe4Var3.u;
                                    oi3Var.T(pf4Var.a, pf4Var.b);
                                    break;
                                case 12:
                                    oi3Var.s(pe4Var3.o);
                                    break;
                                case 13:
                                    oi3Var.C(pe4Var3.t, false);
                                    break;
                                case 14:
                                    oi3Var.K(pe4Var3.r.a);
                                    oi3Var.e(pe4Var3.r);
                                    break;
                                case 15:
                                    oi3Var.h(pe4Var3.v);
                                    break;
                                case WaveRetry.MAX_FAILURES /* 16 */:
                                    oi3Var.O(pe4Var3.a);
                                    break;
                                case 17:
                                    oi3Var.P(pe4Var3.f);
                                    break;
                                case 18:
                                    PlaybackException playbackException4 = pe4Var3.f;
                                    String str = f35.a;
                                    oi3Var.S(playbackException4);
                                    break;
                                case 19:
                                    oi3Var.o(pe4Var3.m);
                                    break;
                                case 20:
                                    oi3Var.A(pe4Var3.x);
                                    break;
                                case 21:
                                    oi3Var.F(pe4Var3.y);
                                    break;
                                case 22:
                                    oi3Var.L(pe4Var3.d, pe4Var3.b);
                                    break;
                                case 23:
                                    oi3Var.v(pe4Var3.d);
                                    break;
                                case 24:
                                    oi3Var.r(pe4Var3.c, pe4Var3.b);
                                    break;
                                default:
                                    oi3Var.g(pe4Var3.e);
                                    break;
                            }
                        }
                    });
                }
                if (z4) {
                    final int i21 = 23;
                    tc2Var.c(4, new qc2() { // from class: ae4
                        @Override // defpackage.qc2
                        public final void invoke(Object obj5) {
                            int i110 = i21;
                            pe4 pe4Var3 = pe4Var;
                            oi3 oi3Var = (oi3) obj5;
                            switch (i110) {
                                case 0:
                                    oi3Var.V(qe4.z1(pe4Var3));
                                    break;
                                case 1:
                                    oi3Var.N(pe4Var3.l);
                                    break;
                                case 2:
                                    oi3Var.f(pe4Var3.g);
                                    break;
                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                    oi3Var.x(pe4Var3.h);
                                    break;
                                case 4:
                                    oi3Var.E(pe4Var3.i);
                                    break;
                                case 5:
                                    oi3Var.H(pe4Var3.j);
                                    break;
                                case 6:
                                    oi3Var.R(pe4Var3.k);
                                    break;
                                case 7:
                                    oi3Var.n(pe4Var3.n);
                                    break;
                                case 8:
                                    oi3Var.a(pe4Var3.q);
                                    break;
                                case 9:
                                    oi3Var.Q(pe4Var3.s);
                                    break;
                                case 10:
                                    oi3Var.G(pe4Var3.z);
                                    break;
                                case 11:
                                    pf4 pf4Var = pe4Var3.u;
                                    oi3Var.T(pf4Var.a, pf4Var.b);
                                    break;
                                case 12:
                                    oi3Var.s(pe4Var3.o);
                                    break;
                                case 13:
                                    oi3Var.C(pe4Var3.t, false);
                                    break;
                                case 14:
                                    oi3Var.K(pe4Var3.r.a);
                                    oi3Var.e(pe4Var3.r);
                                    break;
                                case 15:
                                    oi3Var.h(pe4Var3.v);
                                    break;
                                case WaveRetry.MAX_FAILURES /* 16 */:
                                    oi3Var.O(pe4Var3.a);
                                    break;
                                case 17:
                                    oi3Var.P(pe4Var3.f);
                                    break;
                                case 18:
                                    PlaybackException playbackException4 = pe4Var3.f;
                                    String str = f35.a;
                                    oi3Var.S(playbackException4);
                                    break;
                                case 19:
                                    oi3Var.o(pe4Var3.m);
                                    break;
                                case 20:
                                    oi3Var.A(pe4Var3.x);
                                    break;
                                case 21:
                                    oi3Var.F(pe4Var3.y);
                                    break;
                                case 22:
                                    oi3Var.L(pe4Var3.d, pe4Var3.b);
                                    break;
                                case 23:
                                    oi3Var.v(pe4Var3.d);
                                    break;
                                case 24:
                                    oi3Var.r(pe4Var3.c, pe4Var3.b);
                                    break;
                                default:
                                    oi3Var.g(pe4Var3.e);
                                    break;
                            }
                        }
                    });
                }
                i8 = 24;
                if (z3 || pe4Var2.c != pe4Var.c) {
                    tc2Var.c(5, new qc2() { // from class: ae4
                        @Override // defpackage.qc2
                        public final void invoke(Object obj5) {
                            int i110 = i8;
                            pe4 pe4Var3 = pe4Var;
                            oi3 oi3Var = (oi3) obj5;
                            switch (i110) {
                                case 0:
                                    oi3Var.V(qe4.z1(pe4Var3));
                                    break;
                                case 1:
                                    oi3Var.N(pe4Var3.l);
                                    break;
                                case 2:
                                    oi3Var.f(pe4Var3.g);
                                    break;
                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                    oi3Var.x(pe4Var3.h);
                                    break;
                                case 4:
                                    oi3Var.E(pe4Var3.i);
                                    break;
                                case 5:
                                    oi3Var.H(pe4Var3.j);
                                    break;
                                case 6:
                                    oi3Var.R(pe4Var3.k);
                                    break;
                                case 7:
                                    oi3Var.n(pe4Var3.n);
                                    break;
                                case 8:
                                    oi3Var.a(pe4Var3.q);
                                    break;
                                case 9:
                                    oi3Var.Q(pe4Var3.s);
                                    break;
                                case 10:
                                    oi3Var.G(pe4Var3.z);
                                    break;
                                case 11:
                                    pf4 pf4Var = pe4Var3.u;
                                    oi3Var.T(pf4Var.a, pf4Var.b);
                                    break;
                                case 12:
                                    oi3Var.s(pe4Var3.o);
                                    break;
                                case 13:
                                    oi3Var.C(pe4Var3.t, false);
                                    break;
                                case 14:
                                    oi3Var.K(pe4Var3.r.a);
                                    oi3Var.e(pe4Var3.r);
                                    break;
                                case 15:
                                    oi3Var.h(pe4Var3.v);
                                    break;
                                case WaveRetry.MAX_FAILURES /* 16 */:
                                    oi3Var.O(pe4Var3.a);
                                    break;
                                case 17:
                                    oi3Var.P(pe4Var3.f);
                                    break;
                                case 18:
                                    PlaybackException playbackException4 = pe4Var3.f;
                                    String str = f35.a;
                                    oi3Var.S(playbackException4);
                                    break;
                                case 19:
                                    oi3Var.o(pe4Var3.m);
                                    break;
                                case 20:
                                    oi3Var.A(pe4Var3.x);
                                    break;
                                case 21:
                                    oi3Var.F(pe4Var3.y);
                                    break;
                                case 22:
                                    oi3Var.L(pe4Var3.d, pe4Var3.b);
                                    break;
                                case 23:
                                    oi3Var.v(pe4Var3.d);
                                    break;
                                case 24:
                                    oi3Var.r(pe4Var3.c, pe4Var3.b);
                                    break;
                                default:
                                    oi3Var.g(pe4Var3.e);
                                    break;
                            }
                        }
                    });
                }
                i9 = 25;
                i10 = 6;
                if (pe4Var2.e != pe4Var.e) {
                    tc2Var.c(6, new qc2() { // from class: ae4
                        @Override // defpackage.qc2
                        public final void invoke(Object obj5) {
                            int i110 = i9;
                            pe4 pe4Var3 = pe4Var;
                            oi3 oi3Var = (oi3) obj5;
                            switch (i110) {
                                case 0:
                                    oi3Var.V(qe4.z1(pe4Var3));
                                    break;
                                case 1:
                                    oi3Var.N(pe4Var3.l);
                                    break;
                                case 2:
                                    oi3Var.f(pe4Var3.g);
                                    break;
                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                    oi3Var.x(pe4Var3.h);
                                    break;
                                case 4:
                                    oi3Var.E(pe4Var3.i);
                                    break;
                                case 5:
                                    oi3Var.H(pe4Var3.j);
                                    break;
                                case 6:
                                    oi3Var.R(pe4Var3.k);
                                    break;
                                case 7:
                                    oi3Var.n(pe4Var3.n);
                                    break;
                                case 8:
                                    oi3Var.a(pe4Var3.q);
                                    break;
                                case 9:
                                    oi3Var.Q(pe4Var3.s);
                                    break;
                                case 10:
                                    oi3Var.G(pe4Var3.z);
                                    break;
                                case 11:
                                    pf4 pf4Var = pe4Var3.u;
                                    oi3Var.T(pf4Var.a, pf4Var.b);
                                    break;
                                case 12:
                                    oi3Var.s(pe4Var3.o);
                                    break;
                                case 13:
                                    oi3Var.C(pe4Var3.t, false);
                                    break;
                                case 14:
                                    oi3Var.K(pe4Var3.r.a);
                                    oi3Var.e(pe4Var3.r);
                                    break;
                                case 15:
                                    oi3Var.h(pe4Var3.v);
                                    break;
                                case WaveRetry.MAX_FAILURES /* 16 */:
                                    oi3Var.O(pe4Var3.a);
                                    break;
                                case 17:
                                    oi3Var.P(pe4Var3.f);
                                    break;
                                case 18:
                                    PlaybackException playbackException4 = pe4Var3.f;
                                    String str = f35.a;
                                    oi3Var.S(playbackException4);
                                    break;
                                case 19:
                                    oi3Var.o(pe4Var3.m);
                                    break;
                                case 20:
                                    oi3Var.A(pe4Var3.x);
                                    break;
                                case 21:
                                    oi3Var.F(pe4Var3.y);
                                    break;
                                case 22:
                                    oi3Var.L(pe4Var3.d, pe4Var3.b);
                                    break;
                                case 23:
                                    oi3Var.v(pe4Var3.d);
                                    break;
                                case 24:
                                    oi3Var.r(pe4Var3.c, pe4Var3.b);
                                    break;
                                default:
                                    oi3Var.g(pe4Var3.e);
                                    break;
                            }
                        }
                    });
                }
                if (z1(pe4Var2) != z1(pe4Var)) {
                    final int i22 = 0;
                    tc2Var.c(7, new qc2() { // from class: ae4
                        @Override // defpackage.qc2
                        public final void invoke(Object obj5) {
                            int i110 = i22;
                            pe4 pe4Var3 = pe4Var;
                            oi3 oi3Var = (oi3) obj5;
                            switch (i110) {
                                case 0:
                                    oi3Var.V(qe4.z1(pe4Var3));
                                    break;
                                case 1:
                                    oi3Var.N(pe4Var3.l);
                                    break;
                                case 2:
                                    oi3Var.f(pe4Var3.g);
                                    break;
                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                    oi3Var.x(pe4Var3.h);
                                    break;
                                case 4:
                                    oi3Var.E(pe4Var3.i);
                                    break;
                                case 5:
                                    oi3Var.H(pe4Var3.j);
                                    break;
                                case 6:
                                    oi3Var.R(pe4Var3.k);
                                    break;
                                case 7:
                                    oi3Var.n(pe4Var3.n);
                                    break;
                                case 8:
                                    oi3Var.a(pe4Var3.q);
                                    break;
                                case 9:
                                    oi3Var.Q(pe4Var3.s);
                                    break;
                                case 10:
                                    oi3Var.G(pe4Var3.z);
                                    break;
                                case 11:
                                    pf4 pf4Var = pe4Var3.u;
                                    oi3Var.T(pf4Var.a, pf4Var.b);
                                    break;
                                case 12:
                                    oi3Var.s(pe4Var3.o);
                                    break;
                                case 13:
                                    oi3Var.C(pe4Var3.t, false);
                                    break;
                                case 14:
                                    oi3Var.K(pe4Var3.r.a);
                                    oi3Var.e(pe4Var3.r);
                                    break;
                                case 15:
                                    oi3Var.h(pe4Var3.v);
                                    break;
                                case WaveRetry.MAX_FAILURES /* 16 */:
                                    oi3Var.O(pe4Var3.a);
                                    break;
                                case 17:
                                    oi3Var.P(pe4Var3.f);
                                    break;
                                case 18:
                                    PlaybackException playbackException4 = pe4Var3.f;
                                    String str = f35.a;
                                    oi3Var.S(playbackException4);
                                    break;
                                case 19:
                                    oi3Var.o(pe4Var3.m);
                                    break;
                                case 20:
                                    oi3Var.A(pe4Var3.x);
                                    break;
                                case 21:
                                    oi3Var.F(pe4Var3.y);
                                    break;
                                case 22:
                                    oi3Var.L(pe4Var3.d, pe4Var3.b);
                                    break;
                                case 23:
                                    oi3Var.v(pe4Var3.d);
                                    break;
                                case 24:
                                    oi3Var.r(pe4Var3.c, pe4Var3.b);
                                    break;
                                default:
                                    oi3Var.g(pe4Var3.e);
                                    break;
                            }
                        }
                    });
                }
                if (!pe4Var2.l.equals(pe4Var.l)) {
                    final int i23 = 1;
                    tc2Var.c(12, new qc2() { // from class: ae4
                        @Override // defpackage.qc2
                        public final void invoke(Object obj5) {
                            int i110 = i23;
                            pe4 pe4Var3 = pe4Var;
                            oi3 oi3Var = (oi3) obj5;
                            switch (i110) {
                                case 0:
                                    oi3Var.V(qe4.z1(pe4Var3));
                                    break;
                                case 1:
                                    oi3Var.N(pe4Var3.l);
                                    break;
                                case 2:
                                    oi3Var.f(pe4Var3.g);
                                    break;
                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                    oi3Var.x(pe4Var3.h);
                                    break;
                                case 4:
                                    oi3Var.E(pe4Var3.i);
                                    break;
                                case 5:
                                    oi3Var.H(pe4Var3.j);
                                    break;
                                case 6:
                                    oi3Var.R(pe4Var3.k);
                                    break;
                                case 7:
                                    oi3Var.n(pe4Var3.n);
                                    break;
                                case 8:
                                    oi3Var.a(pe4Var3.q);
                                    break;
                                case 9:
                                    oi3Var.Q(pe4Var3.s);
                                    break;
                                case 10:
                                    oi3Var.G(pe4Var3.z);
                                    break;
                                case 11:
                                    pf4 pf4Var = pe4Var3.u;
                                    oi3Var.T(pf4Var.a, pf4Var.b);
                                    break;
                                case 12:
                                    oi3Var.s(pe4Var3.o);
                                    break;
                                case 13:
                                    oi3Var.C(pe4Var3.t, false);
                                    break;
                                case 14:
                                    oi3Var.K(pe4Var3.r.a);
                                    oi3Var.e(pe4Var3.r);
                                    break;
                                case 15:
                                    oi3Var.h(pe4Var3.v);
                                    break;
                                case WaveRetry.MAX_FAILURES /* 16 */:
                                    oi3Var.O(pe4Var3.a);
                                    break;
                                case 17:
                                    oi3Var.P(pe4Var3.f);
                                    break;
                                case 18:
                                    PlaybackException playbackException4 = pe4Var3.f;
                                    String str = f35.a;
                                    oi3Var.S(playbackException4);
                                    break;
                                case 19:
                                    oi3Var.o(pe4Var3.m);
                                    break;
                                case 20:
                                    oi3Var.A(pe4Var3.x);
                                    break;
                                case 21:
                                    oi3Var.F(pe4Var3.y);
                                    break;
                                case 22:
                                    oi3Var.L(pe4Var3.d, pe4Var3.b);
                                    break;
                                case 23:
                                    oi3Var.v(pe4Var3.d);
                                    break;
                                case 24:
                                    oi3Var.r(pe4Var3.c, pe4Var3.b);
                                    break;
                                default:
                                    oi3Var.g(pe4Var3.e);
                                    break;
                            }
                        }
                    });
                }
                i11 = 8;
                if (pe4Var2.g != pe4Var.g) {
                    final int i24 = 2;
                    tc2Var.c(8, new qc2() { // from class: ae4
                        @Override // defpackage.qc2
                        public final void invoke(Object obj5) {
                            int i110 = i24;
                            pe4 pe4Var3 = pe4Var;
                            oi3 oi3Var = (oi3) obj5;
                            switch (i110) {
                                case 0:
                                    oi3Var.V(qe4.z1(pe4Var3));
                                    break;
                                case 1:
                                    oi3Var.N(pe4Var3.l);
                                    break;
                                case 2:
                                    oi3Var.f(pe4Var3.g);
                                    break;
                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                    oi3Var.x(pe4Var3.h);
                                    break;
                                case 4:
                                    oi3Var.E(pe4Var3.i);
                                    break;
                                case 5:
                                    oi3Var.H(pe4Var3.j);
                                    break;
                                case 6:
                                    oi3Var.R(pe4Var3.k);
                                    break;
                                case 7:
                                    oi3Var.n(pe4Var3.n);
                                    break;
                                case 8:
                                    oi3Var.a(pe4Var3.q);
                                    break;
                                case 9:
                                    oi3Var.Q(pe4Var3.s);
                                    break;
                                case 10:
                                    oi3Var.G(pe4Var3.z);
                                    break;
                                case 11:
                                    pf4 pf4Var = pe4Var3.u;
                                    oi3Var.T(pf4Var.a, pf4Var.b);
                                    break;
                                case 12:
                                    oi3Var.s(pe4Var3.o);
                                    break;
                                case 13:
                                    oi3Var.C(pe4Var3.t, false);
                                    break;
                                case 14:
                                    oi3Var.K(pe4Var3.r.a);
                                    oi3Var.e(pe4Var3.r);
                                    break;
                                case 15:
                                    oi3Var.h(pe4Var3.v);
                                    break;
                                case WaveRetry.MAX_FAILURES /* 16 */:
                                    oi3Var.O(pe4Var3.a);
                                    break;
                                case 17:
                                    oi3Var.P(pe4Var3.f);
                                    break;
                                case 18:
                                    PlaybackException playbackException4 = pe4Var3.f;
                                    String str = f35.a;
                                    oi3Var.S(playbackException4);
                                    break;
                                case 19:
                                    oi3Var.o(pe4Var3.m);
                                    break;
                                case 20:
                                    oi3Var.A(pe4Var3.x);
                                    break;
                                case 21:
                                    oi3Var.F(pe4Var3.y);
                                    break;
                                case 22:
                                    oi3Var.L(pe4Var3.d, pe4Var3.b);
                                    break;
                                case 23:
                                    oi3Var.v(pe4Var3.d);
                                    break;
                                case 24:
                                    oi3Var.r(pe4Var3.c, pe4Var3.b);
                                    break;
                                default:
                                    oi3Var.g(pe4Var3.e);
                                    break;
                            }
                        }
                    });
                }
                i12 = 9;
                if (pe4Var2.h != pe4Var.h) {
                    final int i25 = 3;
                    tc2Var.c(9, new qc2() { // from class: ae4
                        @Override // defpackage.qc2
                        public final void invoke(Object obj5) {
                            int i110 = i25;
                            pe4 pe4Var3 = pe4Var;
                            oi3 oi3Var = (oi3) obj5;
                            switch (i110) {
                                case 0:
                                    oi3Var.V(qe4.z1(pe4Var3));
                                    break;
                                case 1:
                                    oi3Var.N(pe4Var3.l);
                                    break;
                                case 2:
                                    oi3Var.f(pe4Var3.g);
                                    break;
                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                    oi3Var.x(pe4Var3.h);
                                    break;
                                case 4:
                                    oi3Var.E(pe4Var3.i);
                                    break;
                                case 5:
                                    oi3Var.H(pe4Var3.j);
                                    break;
                                case 6:
                                    oi3Var.R(pe4Var3.k);
                                    break;
                                case 7:
                                    oi3Var.n(pe4Var3.n);
                                    break;
                                case 8:
                                    oi3Var.a(pe4Var3.q);
                                    break;
                                case 9:
                                    oi3Var.Q(pe4Var3.s);
                                    break;
                                case 10:
                                    oi3Var.G(pe4Var3.z);
                                    break;
                                case 11:
                                    pf4 pf4Var = pe4Var3.u;
                                    oi3Var.T(pf4Var.a, pf4Var.b);
                                    break;
                                case 12:
                                    oi3Var.s(pe4Var3.o);
                                    break;
                                case 13:
                                    oi3Var.C(pe4Var3.t, false);
                                    break;
                                case 14:
                                    oi3Var.K(pe4Var3.r.a);
                                    oi3Var.e(pe4Var3.r);
                                    break;
                                case 15:
                                    oi3Var.h(pe4Var3.v);
                                    break;
                                case WaveRetry.MAX_FAILURES /* 16 */:
                                    oi3Var.O(pe4Var3.a);
                                    break;
                                case 17:
                                    oi3Var.P(pe4Var3.f);
                                    break;
                                case 18:
                                    PlaybackException playbackException4 = pe4Var3.f;
                                    String str = f35.a;
                                    oi3Var.S(playbackException4);
                                    break;
                                case 19:
                                    oi3Var.o(pe4Var3.m);
                                    break;
                                case 20:
                                    oi3Var.A(pe4Var3.x);
                                    break;
                                case 21:
                                    oi3Var.F(pe4Var3.y);
                                    break;
                                case 22:
                                    oi3Var.L(pe4Var3.d, pe4Var3.b);
                                    break;
                                case 23:
                                    oi3Var.v(pe4Var3.d);
                                    break;
                                case 24:
                                    oi3Var.r(pe4Var3.c, pe4Var3.b);
                                    break;
                                default:
                                    oi3Var.g(pe4Var3.e);
                                    break;
                            }
                        }
                    });
                }
                if (pe4Var2.i != pe4Var.i) {
                    final int i26 = 4;
                    tc2Var.c(16, new qc2() { // from class: ae4
                        @Override // defpackage.qc2
                        public final void invoke(Object obj5) {
                            int i110 = i26;
                            pe4 pe4Var3 = pe4Var;
                            oi3 oi3Var = (oi3) obj5;
                            switch (i110) {
                                case 0:
                                    oi3Var.V(qe4.z1(pe4Var3));
                                    break;
                                case 1:
                                    oi3Var.N(pe4Var3.l);
                                    break;
                                case 2:
                                    oi3Var.f(pe4Var3.g);
                                    break;
                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                    oi3Var.x(pe4Var3.h);
                                    break;
                                case 4:
                                    oi3Var.E(pe4Var3.i);
                                    break;
                                case 5:
                                    oi3Var.H(pe4Var3.j);
                                    break;
                                case 6:
                                    oi3Var.R(pe4Var3.k);
                                    break;
                                case 7:
                                    oi3Var.n(pe4Var3.n);
                                    break;
                                case 8:
                                    oi3Var.a(pe4Var3.q);
                                    break;
                                case 9:
                                    oi3Var.Q(pe4Var3.s);
                                    break;
                                case 10:
                                    oi3Var.G(pe4Var3.z);
                                    break;
                                case 11:
                                    pf4 pf4Var = pe4Var3.u;
                                    oi3Var.T(pf4Var.a, pf4Var.b);
                                    break;
                                case 12:
                                    oi3Var.s(pe4Var3.o);
                                    break;
                                case 13:
                                    oi3Var.C(pe4Var3.t, false);
                                    break;
                                case 14:
                                    oi3Var.K(pe4Var3.r.a);
                                    oi3Var.e(pe4Var3.r);
                                    break;
                                case 15:
                                    oi3Var.h(pe4Var3.v);
                                    break;
                                case WaveRetry.MAX_FAILURES /* 16 */:
                                    oi3Var.O(pe4Var3.a);
                                    break;
                                case 17:
                                    oi3Var.P(pe4Var3.f);
                                    break;
                                case 18:
                                    PlaybackException playbackException4 = pe4Var3.f;
                                    String str = f35.a;
                                    oi3Var.S(playbackException4);
                                    break;
                                case 19:
                                    oi3Var.o(pe4Var3.m);
                                    break;
                                case 20:
                                    oi3Var.A(pe4Var3.x);
                                    break;
                                case 21:
                                    oi3Var.F(pe4Var3.y);
                                    break;
                                case 22:
                                    oi3Var.L(pe4Var3.d, pe4Var3.b);
                                    break;
                                case 23:
                                    oi3Var.v(pe4Var3.d);
                                    break;
                                case 24:
                                    oi3Var.r(pe4Var3.c, pe4Var3.b);
                                    break;
                                default:
                                    oi3Var.g(pe4Var3.e);
                                    break;
                            }
                        }
                    });
                }
                if (pe4Var2.j != pe4Var.j) {
                    final int i27 = 5;
                    tc2Var.c(17, new qc2() { // from class: ae4
                        @Override // defpackage.qc2
                        public final void invoke(Object obj5) {
                            int i110 = i27;
                            pe4 pe4Var3 = pe4Var;
                            oi3 oi3Var = (oi3) obj5;
                            switch (i110) {
                                case 0:
                                    oi3Var.V(qe4.z1(pe4Var3));
                                    break;
                                case 1:
                                    oi3Var.N(pe4Var3.l);
                                    break;
                                case 2:
                                    oi3Var.f(pe4Var3.g);
                                    break;
                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                    oi3Var.x(pe4Var3.h);
                                    break;
                                case 4:
                                    oi3Var.E(pe4Var3.i);
                                    break;
                                case 5:
                                    oi3Var.H(pe4Var3.j);
                                    break;
                                case 6:
                                    oi3Var.R(pe4Var3.k);
                                    break;
                                case 7:
                                    oi3Var.n(pe4Var3.n);
                                    break;
                                case 8:
                                    oi3Var.a(pe4Var3.q);
                                    break;
                                case 9:
                                    oi3Var.Q(pe4Var3.s);
                                    break;
                                case 10:
                                    oi3Var.G(pe4Var3.z);
                                    break;
                                case 11:
                                    pf4 pf4Var = pe4Var3.u;
                                    oi3Var.T(pf4Var.a, pf4Var.b);
                                    break;
                                case 12:
                                    oi3Var.s(pe4Var3.o);
                                    break;
                                case 13:
                                    oi3Var.C(pe4Var3.t, false);
                                    break;
                                case 14:
                                    oi3Var.K(pe4Var3.r.a);
                                    oi3Var.e(pe4Var3.r);
                                    break;
                                case 15:
                                    oi3Var.h(pe4Var3.v);
                                    break;
                                case WaveRetry.MAX_FAILURES /* 16 */:
                                    oi3Var.O(pe4Var3.a);
                                    break;
                                case 17:
                                    oi3Var.P(pe4Var3.f);
                                    break;
                                case 18:
                                    PlaybackException playbackException4 = pe4Var3.f;
                                    String str = f35.a;
                                    oi3Var.S(playbackException4);
                                    break;
                                case 19:
                                    oi3Var.o(pe4Var3.m);
                                    break;
                                case 20:
                                    oi3Var.A(pe4Var3.x);
                                    break;
                                case 21:
                                    oi3Var.F(pe4Var3.y);
                                    break;
                                case 22:
                                    oi3Var.L(pe4Var3.d, pe4Var3.b);
                                    break;
                                case 23:
                                    oi3Var.v(pe4Var3.d);
                                    break;
                                case 24:
                                    oi3Var.r(pe4Var3.c, pe4Var3.b);
                                    break;
                                default:
                                    oi3Var.g(pe4Var3.e);
                                    break;
                            }
                        }
                    });
                }
                if (pe4Var2.k != pe4Var.k) {
                    tc2Var.c(18, new qc2() { // from class: ae4
                        @Override // defpackage.qc2
                        public final void invoke(Object obj5) {
                            int i110 = i10;
                            pe4 pe4Var3 = pe4Var;
                            oi3 oi3Var = (oi3) obj5;
                            switch (i110) {
                                case 0:
                                    oi3Var.V(qe4.z1(pe4Var3));
                                    break;
                                case 1:
                                    oi3Var.N(pe4Var3.l);
                                    break;
                                case 2:
                                    oi3Var.f(pe4Var3.g);
                                    break;
                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                    oi3Var.x(pe4Var3.h);
                                    break;
                                case 4:
                                    oi3Var.E(pe4Var3.i);
                                    break;
                                case 5:
                                    oi3Var.H(pe4Var3.j);
                                    break;
                                case 6:
                                    oi3Var.R(pe4Var3.k);
                                    break;
                                case 7:
                                    oi3Var.n(pe4Var3.n);
                                    break;
                                case 8:
                                    oi3Var.a(pe4Var3.q);
                                    break;
                                case 9:
                                    oi3Var.Q(pe4Var3.s);
                                    break;
                                case 10:
                                    oi3Var.G(pe4Var3.z);
                                    break;
                                case 11:
                                    pf4 pf4Var = pe4Var3.u;
                                    oi3Var.T(pf4Var.a, pf4Var.b);
                                    break;
                                case 12:
                                    oi3Var.s(pe4Var3.o);
                                    break;
                                case 13:
                                    oi3Var.C(pe4Var3.t, false);
                                    break;
                                case 14:
                                    oi3Var.K(pe4Var3.r.a);
                                    oi3Var.e(pe4Var3.r);
                                    break;
                                case 15:
                                    oi3Var.h(pe4Var3.v);
                                    break;
                                case WaveRetry.MAX_FAILURES /* 16 */:
                                    oi3Var.O(pe4Var3.a);
                                    break;
                                case 17:
                                    oi3Var.P(pe4Var3.f);
                                    break;
                                case 18:
                                    PlaybackException playbackException4 = pe4Var3.f;
                                    String str = f35.a;
                                    oi3Var.S(playbackException4);
                                    break;
                                case 19:
                                    oi3Var.o(pe4Var3.m);
                                    break;
                                case 20:
                                    oi3Var.A(pe4Var3.x);
                                    break;
                                case 21:
                                    oi3Var.F(pe4Var3.y);
                                    break;
                                case 22:
                                    oi3Var.L(pe4Var3.d, pe4Var3.b);
                                    break;
                                case 23:
                                    oi3Var.v(pe4Var3.d);
                                    break;
                                case 24:
                                    oi3Var.r(pe4Var3.c, pe4Var3.b);
                                    break;
                                default:
                                    oi3Var.g(pe4Var3.e);
                                    break;
                            }
                        }
                    });
                }
                if (!pe4Var2.n.equals(pe4Var.n)) {
                    final int i28 = 7;
                    tc2Var.c(20, new qc2() { // from class: ae4
                        @Override // defpackage.qc2
                        public final void invoke(Object obj5) {
                            int i110 = i28;
                            pe4 pe4Var3 = pe4Var;
                            oi3 oi3Var = (oi3) obj5;
                            switch (i110) {
                                case 0:
                                    oi3Var.V(qe4.z1(pe4Var3));
                                    break;
                                case 1:
                                    oi3Var.N(pe4Var3.l);
                                    break;
                                case 2:
                                    oi3Var.f(pe4Var3.g);
                                    break;
                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                    oi3Var.x(pe4Var3.h);
                                    break;
                                case 4:
                                    oi3Var.E(pe4Var3.i);
                                    break;
                                case 5:
                                    oi3Var.H(pe4Var3.j);
                                    break;
                                case 6:
                                    oi3Var.R(pe4Var3.k);
                                    break;
                                case 7:
                                    oi3Var.n(pe4Var3.n);
                                    break;
                                case 8:
                                    oi3Var.a(pe4Var3.q);
                                    break;
                                case 9:
                                    oi3Var.Q(pe4Var3.s);
                                    break;
                                case 10:
                                    oi3Var.G(pe4Var3.z);
                                    break;
                                case 11:
                                    pf4 pf4Var = pe4Var3.u;
                                    oi3Var.T(pf4Var.a, pf4Var.b);
                                    break;
                                case 12:
                                    oi3Var.s(pe4Var3.o);
                                    break;
                                case 13:
                                    oi3Var.C(pe4Var3.t, false);
                                    break;
                                case 14:
                                    oi3Var.K(pe4Var3.r.a);
                                    oi3Var.e(pe4Var3.r);
                                    break;
                                case 15:
                                    oi3Var.h(pe4Var3.v);
                                    break;
                                case WaveRetry.MAX_FAILURES /* 16 */:
                                    oi3Var.O(pe4Var3.a);
                                    break;
                                case 17:
                                    oi3Var.P(pe4Var3.f);
                                    break;
                                case 18:
                                    PlaybackException playbackException4 = pe4Var3.f;
                                    String str = f35.a;
                                    oi3Var.S(playbackException4);
                                    break;
                                case 19:
                                    oi3Var.o(pe4Var3.m);
                                    break;
                                case 20:
                                    oi3Var.A(pe4Var3.x);
                                    break;
                                case 21:
                                    oi3Var.F(pe4Var3.y);
                                    break;
                                case 22:
                                    oi3Var.L(pe4Var3.d, pe4Var3.b);
                                    break;
                                case 23:
                                    oi3Var.v(pe4Var3.d);
                                    break;
                                case 24:
                                    oi3Var.r(pe4Var3.c, pe4Var3.b);
                                    break;
                                default:
                                    oi3Var.g(pe4Var3.e);
                                    break;
                            }
                        }
                    });
                }
                if (!pe4Var2.q.equals(pe4Var.q)) {
                    tc2Var.c(25, new qc2() { // from class: ae4
                        @Override // defpackage.qc2
                        public final void invoke(Object obj5) {
                            int i110 = i11;
                            pe4 pe4Var3 = pe4Var;
                            oi3 oi3Var = (oi3) obj5;
                            switch (i110) {
                                case 0:
                                    oi3Var.V(qe4.z1(pe4Var3));
                                    break;
                                case 1:
                                    oi3Var.N(pe4Var3.l);
                                    break;
                                case 2:
                                    oi3Var.f(pe4Var3.g);
                                    break;
                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                    oi3Var.x(pe4Var3.h);
                                    break;
                                case 4:
                                    oi3Var.E(pe4Var3.i);
                                    break;
                                case 5:
                                    oi3Var.H(pe4Var3.j);
                                    break;
                                case 6:
                                    oi3Var.R(pe4Var3.k);
                                    break;
                                case 7:
                                    oi3Var.n(pe4Var3.n);
                                    break;
                                case 8:
                                    oi3Var.a(pe4Var3.q);
                                    break;
                                case 9:
                                    oi3Var.Q(pe4Var3.s);
                                    break;
                                case 10:
                                    oi3Var.G(pe4Var3.z);
                                    break;
                                case 11:
                                    pf4 pf4Var = pe4Var3.u;
                                    oi3Var.T(pf4Var.a, pf4Var.b);
                                    break;
                                case 12:
                                    oi3Var.s(pe4Var3.o);
                                    break;
                                case 13:
                                    oi3Var.C(pe4Var3.t, false);
                                    break;
                                case 14:
                                    oi3Var.K(pe4Var3.r.a);
                                    oi3Var.e(pe4Var3.r);
                                    break;
                                case 15:
                                    oi3Var.h(pe4Var3.v);
                                    break;
                                case WaveRetry.MAX_FAILURES /* 16 */:
                                    oi3Var.O(pe4Var3.a);
                                    break;
                                case 17:
                                    oi3Var.P(pe4Var3.f);
                                    break;
                                case 18:
                                    PlaybackException playbackException4 = pe4Var3.f;
                                    String str = f35.a;
                                    oi3Var.S(playbackException4);
                                    break;
                                case 19:
                                    oi3Var.o(pe4Var3.m);
                                    break;
                                case 20:
                                    oi3Var.A(pe4Var3.x);
                                    break;
                                case 21:
                                    oi3Var.F(pe4Var3.y);
                                    break;
                                case 22:
                                    oi3Var.L(pe4Var3.d, pe4Var3.b);
                                    break;
                                case 23:
                                    oi3Var.v(pe4Var3.d);
                                    break;
                                case 24:
                                    oi3Var.r(pe4Var3.c, pe4Var3.b);
                                    break;
                                default:
                                    oi3Var.g(pe4Var3.e);
                                    break;
                            }
                        }
                    });
                }
                if (!pe4Var2.s.equals(pe4Var.s)) {
                    tc2Var.c(29, new qc2() { // from class: ae4
                        @Override // defpackage.qc2
                        public final void invoke(Object obj5) {
                            int i110 = i12;
                            pe4 pe4Var3 = pe4Var;
                            oi3 oi3Var = (oi3) obj5;
                            switch (i110) {
                                case 0:
                                    oi3Var.V(qe4.z1(pe4Var3));
                                    break;
                                case 1:
                                    oi3Var.N(pe4Var3.l);
                                    break;
                                case 2:
                                    oi3Var.f(pe4Var3.g);
                                    break;
                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                    oi3Var.x(pe4Var3.h);
                                    break;
                                case 4:
                                    oi3Var.E(pe4Var3.i);
                                    break;
                                case 5:
                                    oi3Var.H(pe4Var3.j);
                                    break;
                                case 6:
                                    oi3Var.R(pe4Var3.k);
                                    break;
                                case 7:
                                    oi3Var.n(pe4Var3.n);
                                    break;
                                case 8:
                                    oi3Var.a(pe4Var3.q);
                                    break;
                                case 9:
                                    oi3Var.Q(pe4Var3.s);
                                    break;
                                case 10:
                                    oi3Var.G(pe4Var3.z);
                                    break;
                                case 11:
                                    pf4 pf4Var = pe4Var3.u;
                                    oi3Var.T(pf4Var.a, pf4Var.b);
                                    break;
                                case 12:
                                    oi3Var.s(pe4Var3.o);
                                    break;
                                case 13:
                                    oi3Var.C(pe4Var3.t, false);
                                    break;
                                case 14:
                                    oi3Var.K(pe4Var3.r.a);
                                    oi3Var.e(pe4Var3.r);
                                    break;
                                case 15:
                                    oi3Var.h(pe4Var3.v);
                                    break;
                                case WaveRetry.MAX_FAILURES /* 16 */:
                                    oi3Var.O(pe4Var3.a);
                                    break;
                                case 17:
                                    oi3Var.P(pe4Var3.f);
                                    break;
                                case 18:
                                    PlaybackException playbackException4 = pe4Var3.f;
                                    String str = f35.a;
                                    oi3Var.S(playbackException4);
                                    break;
                                case 19:
                                    oi3Var.o(pe4Var3.m);
                                    break;
                                case 20:
                                    oi3Var.A(pe4Var3.x);
                                    break;
                                case 21:
                                    oi3Var.F(pe4Var3.y);
                                    break;
                                case 22:
                                    oi3Var.L(pe4Var3.d, pe4Var3.b);
                                    break;
                                case 23:
                                    oi3Var.v(pe4Var3.d);
                                    break;
                                case 24:
                                    oi3Var.r(pe4Var3.c, pe4Var3.b);
                                    break;
                                default:
                                    oi3Var.g(pe4Var3.e);
                                    break;
                            }
                        }
                    });
                }
                if (!pe4Var2.z.equals(pe4Var.z)) {
                    tc2Var.c(15, new qc2() { // from class: ae4
                        @Override // defpackage.qc2
                        public final void invoke(Object obj5) {
                            int i110 = i5;
                            pe4 pe4Var3 = pe4Var;
                            oi3 oi3Var = (oi3) obj5;
                            switch (i110) {
                                case 0:
                                    oi3Var.V(qe4.z1(pe4Var3));
                                    break;
                                case 1:
                                    oi3Var.N(pe4Var3.l);
                                    break;
                                case 2:
                                    oi3Var.f(pe4Var3.g);
                                    break;
                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                    oi3Var.x(pe4Var3.h);
                                    break;
                                case 4:
                                    oi3Var.E(pe4Var3.i);
                                    break;
                                case 5:
                                    oi3Var.H(pe4Var3.j);
                                    break;
                                case 6:
                                    oi3Var.R(pe4Var3.k);
                                    break;
                                case 7:
                                    oi3Var.n(pe4Var3.n);
                                    break;
                                case 8:
                                    oi3Var.a(pe4Var3.q);
                                    break;
                                case 9:
                                    oi3Var.Q(pe4Var3.s);
                                    break;
                                case 10:
                                    oi3Var.G(pe4Var3.z);
                                    break;
                                case 11:
                                    pf4 pf4Var = pe4Var3.u;
                                    oi3Var.T(pf4Var.a, pf4Var.b);
                                    break;
                                case 12:
                                    oi3Var.s(pe4Var3.o);
                                    break;
                                case 13:
                                    oi3Var.C(pe4Var3.t, false);
                                    break;
                                case 14:
                                    oi3Var.K(pe4Var3.r.a);
                                    oi3Var.e(pe4Var3.r);
                                    break;
                                case 15:
                                    oi3Var.h(pe4Var3.v);
                                    break;
                                case WaveRetry.MAX_FAILURES /* 16 */:
                                    oi3Var.O(pe4Var3.a);
                                    break;
                                case 17:
                                    oi3Var.P(pe4Var3.f);
                                    break;
                                case 18:
                                    PlaybackException playbackException4 = pe4Var3.f;
                                    String str = f35.a;
                                    oi3Var.S(playbackException4);
                                    break;
                                case 19:
                                    oi3Var.o(pe4Var3.m);
                                    break;
                                case 20:
                                    oi3Var.A(pe4Var3.x);
                                    break;
                                case 21:
                                    oi3Var.F(pe4Var3.y);
                                    break;
                                case 22:
                                    oi3Var.L(pe4Var3.d, pe4Var3.b);
                                    break;
                                case 23:
                                    oi3Var.v(pe4Var3.d);
                                    break;
                                case 24:
                                    oi3Var.r(pe4Var3.c, pe4Var3.b);
                                    break;
                                default:
                                    oi3Var.g(pe4Var3.e);
                                    break;
                            }
                        }
                    });
                }
                if (!pe4Var2.u.equals(pe4Var.u)) {
                    final int i29 = 11;
                    tc2Var.c(24, new qc2() { // from class: ae4
                        @Override // defpackage.qc2
                        public final void invoke(Object obj5) {
                            int i110 = i29;
                            pe4 pe4Var3 = pe4Var;
                            oi3 oi3Var = (oi3) obj5;
                            switch (i110) {
                                case 0:
                                    oi3Var.V(qe4.z1(pe4Var3));
                                    break;
                                case 1:
                                    oi3Var.N(pe4Var3.l);
                                    break;
                                case 2:
                                    oi3Var.f(pe4Var3.g);
                                    break;
                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                    oi3Var.x(pe4Var3.h);
                                    break;
                                case 4:
                                    oi3Var.E(pe4Var3.i);
                                    break;
                                case 5:
                                    oi3Var.H(pe4Var3.j);
                                    break;
                                case 6:
                                    oi3Var.R(pe4Var3.k);
                                    break;
                                case 7:
                                    oi3Var.n(pe4Var3.n);
                                    break;
                                case 8:
                                    oi3Var.a(pe4Var3.q);
                                    break;
                                case 9:
                                    oi3Var.Q(pe4Var3.s);
                                    break;
                                case 10:
                                    oi3Var.G(pe4Var3.z);
                                    break;
                                case 11:
                                    pf4 pf4Var = pe4Var3.u;
                                    oi3Var.T(pf4Var.a, pf4Var.b);
                                    break;
                                case 12:
                                    oi3Var.s(pe4Var3.o);
                                    break;
                                case 13:
                                    oi3Var.C(pe4Var3.t, false);
                                    break;
                                case 14:
                                    oi3Var.K(pe4Var3.r.a);
                                    oi3Var.e(pe4Var3.r);
                                    break;
                                case 15:
                                    oi3Var.h(pe4Var3.v);
                                    break;
                                case WaveRetry.MAX_FAILURES /* 16 */:
                                    oi3Var.O(pe4Var3.a);
                                    break;
                                case 17:
                                    oi3Var.P(pe4Var3.f);
                                    break;
                                case 18:
                                    PlaybackException playbackException4 = pe4Var3.f;
                                    String str = f35.a;
                                    oi3Var.S(playbackException4);
                                    break;
                                case 19:
                                    oi3Var.o(pe4Var3.m);
                                    break;
                                case 20:
                                    oi3Var.A(pe4Var3.x);
                                    break;
                                case 21:
                                    oi3Var.F(pe4Var3.y);
                                    break;
                                case 22:
                                    oi3Var.L(pe4Var3.d, pe4Var3.b);
                                    break;
                                case 23:
                                    oi3Var.v(pe4Var3.d);
                                    break;
                                case 24:
                                    oi3Var.r(pe4Var3.c, pe4Var3.b);
                                    break;
                                default:
                                    oi3Var.g(pe4Var3.e);
                                    break;
                            }
                        }
                    });
                }
                if (pe4Var2.o != pe4Var.o) {
                    final int i30 = 12;
                    tc2Var.c(22, new qc2() { // from class: ae4
                        @Override // defpackage.qc2
                        public final void invoke(Object obj5) {
                            int i110 = i30;
                            pe4 pe4Var3 = pe4Var;
                            oi3 oi3Var = (oi3) obj5;
                            switch (i110) {
                                case 0:
                                    oi3Var.V(qe4.z1(pe4Var3));
                                    break;
                                case 1:
                                    oi3Var.N(pe4Var3.l);
                                    break;
                                case 2:
                                    oi3Var.f(pe4Var3.g);
                                    break;
                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                    oi3Var.x(pe4Var3.h);
                                    break;
                                case 4:
                                    oi3Var.E(pe4Var3.i);
                                    break;
                                case 5:
                                    oi3Var.H(pe4Var3.j);
                                    break;
                                case 6:
                                    oi3Var.R(pe4Var3.k);
                                    break;
                                case 7:
                                    oi3Var.n(pe4Var3.n);
                                    break;
                                case 8:
                                    oi3Var.a(pe4Var3.q);
                                    break;
                                case 9:
                                    oi3Var.Q(pe4Var3.s);
                                    break;
                                case 10:
                                    oi3Var.G(pe4Var3.z);
                                    break;
                                case 11:
                                    pf4 pf4Var = pe4Var3.u;
                                    oi3Var.T(pf4Var.a, pf4Var.b);
                                    break;
                                case 12:
                                    oi3Var.s(pe4Var3.o);
                                    break;
                                case 13:
                                    oi3Var.C(pe4Var3.t, false);
                                    break;
                                case 14:
                                    oi3Var.K(pe4Var3.r.a);
                                    oi3Var.e(pe4Var3.r);
                                    break;
                                case 15:
                                    oi3Var.h(pe4Var3.v);
                                    break;
                                case WaveRetry.MAX_FAILURES /* 16 */:
                                    oi3Var.O(pe4Var3.a);
                                    break;
                                case 17:
                                    oi3Var.P(pe4Var3.f);
                                    break;
                                case 18:
                                    PlaybackException playbackException4 = pe4Var3.f;
                                    String str = f35.a;
                                    oi3Var.S(playbackException4);
                                    break;
                                case 19:
                                    oi3Var.o(pe4Var3.m);
                                    break;
                                case 20:
                                    oi3Var.A(pe4Var3.x);
                                    break;
                                case 21:
                                    oi3Var.F(pe4Var3.y);
                                    break;
                                case 22:
                                    oi3Var.L(pe4Var3.d, pe4Var3.b);
                                    break;
                                case 23:
                                    oi3Var.v(pe4Var3.d);
                                    break;
                                case 24:
                                    oi3Var.r(pe4Var3.c, pe4Var3.b);
                                    break;
                                default:
                                    oi3Var.g(pe4Var3.e);
                                    break;
                            }
                        }
                    });
                }
                if (pe4Var2.t != pe4Var.t) {
                    final int i31 = 13;
                    tc2Var.c(30, new qc2() { // from class: ae4
                        @Override // defpackage.qc2
                        public final void invoke(Object obj5) {
                            int i110 = i31;
                            pe4 pe4Var3 = pe4Var;
                            oi3 oi3Var = (oi3) obj5;
                            switch (i110) {
                                case 0:
                                    oi3Var.V(qe4.z1(pe4Var3));
                                    break;
                                case 1:
                                    oi3Var.N(pe4Var3.l);
                                    break;
                                case 2:
                                    oi3Var.f(pe4Var3.g);
                                    break;
                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                    oi3Var.x(pe4Var3.h);
                                    break;
                                case 4:
                                    oi3Var.E(pe4Var3.i);
                                    break;
                                case 5:
                                    oi3Var.H(pe4Var3.j);
                                    break;
                                case 6:
                                    oi3Var.R(pe4Var3.k);
                                    break;
                                case 7:
                                    oi3Var.n(pe4Var3.n);
                                    break;
                                case 8:
                                    oi3Var.a(pe4Var3.q);
                                    break;
                                case 9:
                                    oi3Var.Q(pe4Var3.s);
                                    break;
                                case 10:
                                    oi3Var.G(pe4Var3.z);
                                    break;
                                case 11:
                                    pf4 pf4Var = pe4Var3.u;
                                    oi3Var.T(pf4Var.a, pf4Var.b);
                                    break;
                                case 12:
                                    oi3Var.s(pe4Var3.o);
                                    break;
                                case 13:
                                    oi3Var.C(pe4Var3.t, false);
                                    break;
                                case 14:
                                    oi3Var.K(pe4Var3.r.a);
                                    oi3Var.e(pe4Var3.r);
                                    break;
                                case 15:
                                    oi3Var.h(pe4Var3.v);
                                    break;
                                case WaveRetry.MAX_FAILURES /* 16 */:
                                    oi3Var.O(pe4Var3.a);
                                    break;
                                case 17:
                                    oi3Var.P(pe4Var3.f);
                                    break;
                                case 18:
                                    PlaybackException playbackException4 = pe4Var3.f;
                                    String str = f35.a;
                                    oi3Var.S(playbackException4);
                                    break;
                                case 19:
                                    oi3Var.o(pe4Var3.m);
                                    break;
                                case 20:
                                    oi3Var.A(pe4Var3.x);
                                    break;
                                case 21:
                                    oi3Var.F(pe4Var3.y);
                                    break;
                                case 22:
                                    oi3Var.L(pe4Var3.d, pe4Var3.b);
                                    break;
                                case 23:
                                    oi3Var.v(pe4Var3.d);
                                    break;
                                case 24:
                                    oi3Var.r(pe4Var3.c, pe4Var3.b);
                                    break;
                                default:
                                    oi3Var.g(pe4Var3.e);
                                    break;
                            }
                        }
                    });
                }
                if (!pe4Var2.r.equals(pe4Var.r)) {
                    final int i32 = 14;
                    tc2Var.c(27, new qc2() { // from class: ae4
                        @Override // defpackage.qc2
                        public final void invoke(Object obj5) {
                            int i110 = i32;
                            pe4 pe4Var3 = pe4Var;
                            oi3 oi3Var = (oi3) obj5;
                            switch (i110) {
                                case 0:
                                    oi3Var.V(qe4.z1(pe4Var3));
                                    break;
                                case 1:
                                    oi3Var.N(pe4Var3.l);
                                    break;
                                case 2:
                                    oi3Var.f(pe4Var3.g);
                                    break;
                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                    oi3Var.x(pe4Var3.h);
                                    break;
                                case 4:
                                    oi3Var.E(pe4Var3.i);
                                    break;
                                case 5:
                                    oi3Var.H(pe4Var3.j);
                                    break;
                                case 6:
                                    oi3Var.R(pe4Var3.k);
                                    break;
                                case 7:
                                    oi3Var.n(pe4Var3.n);
                                    break;
                                case 8:
                                    oi3Var.a(pe4Var3.q);
                                    break;
                                case 9:
                                    oi3Var.Q(pe4Var3.s);
                                    break;
                                case 10:
                                    oi3Var.G(pe4Var3.z);
                                    break;
                                case 11:
                                    pf4 pf4Var = pe4Var3.u;
                                    oi3Var.T(pf4Var.a, pf4Var.b);
                                    break;
                                case 12:
                                    oi3Var.s(pe4Var3.o);
                                    break;
                                case 13:
                                    oi3Var.C(pe4Var3.t, false);
                                    break;
                                case 14:
                                    oi3Var.K(pe4Var3.r.a);
                                    oi3Var.e(pe4Var3.r);
                                    break;
                                case 15:
                                    oi3Var.h(pe4Var3.v);
                                    break;
                                case WaveRetry.MAX_FAILURES /* 16 */:
                                    oi3Var.O(pe4Var3.a);
                                    break;
                                case 17:
                                    oi3Var.P(pe4Var3.f);
                                    break;
                                case 18:
                                    PlaybackException playbackException4 = pe4Var3.f;
                                    String str = f35.a;
                                    oi3Var.S(playbackException4);
                                    break;
                                case 19:
                                    oi3Var.o(pe4Var3.m);
                                    break;
                                case 20:
                                    oi3Var.A(pe4Var3.x);
                                    break;
                                case 21:
                                    oi3Var.F(pe4Var3.y);
                                    break;
                                case 22:
                                    oi3Var.L(pe4Var3.d, pe4Var3.b);
                                    break;
                                case 23:
                                    oi3Var.v(pe4Var3.d);
                                    break;
                                case 24:
                                    oi3Var.r(pe4Var3.c, pe4Var3.b);
                                    break;
                                default:
                                    oi3Var.g(pe4Var3.e);
                                    break;
                            }
                        }
                    });
                }
                qv2Var3 = qv2Var2;
                if (!pe4Var2.v.equals(qv2Var3) && qv2Var3.b != -9223372036854775807L) {
                    final int i33 = 15;
                    tc2Var.c(28, new qc2() { // from class: ae4
                        @Override // defpackage.qc2
                        public final void invoke(Object obj5) {
                            int i110 = i33;
                            pe4 pe4Var3 = pe4Var;
                            oi3 oi3Var = (oi3) obj5;
                            switch (i110) {
                                case 0:
                                    oi3Var.V(qe4.z1(pe4Var3));
                                    break;
                                case 1:
                                    oi3Var.N(pe4Var3.l);
                                    break;
                                case 2:
                                    oi3Var.f(pe4Var3.g);
                                    break;
                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                    oi3Var.x(pe4Var3.h);
                                    break;
                                case 4:
                                    oi3Var.E(pe4Var3.i);
                                    break;
                                case 5:
                                    oi3Var.H(pe4Var3.j);
                                    break;
                                case 6:
                                    oi3Var.R(pe4Var3.k);
                                    break;
                                case 7:
                                    oi3Var.n(pe4Var3.n);
                                    break;
                                case 8:
                                    oi3Var.a(pe4Var3.q);
                                    break;
                                case 9:
                                    oi3Var.Q(pe4Var3.s);
                                    break;
                                case 10:
                                    oi3Var.G(pe4Var3.z);
                                    break;
                                case 11:
                                    pf4 pf4Var = pe4Var3.u;
                                    oi3Var.T(pf4Var.a, pf4Var.b);
                                    break;
                                case 12:
                                    oi3Var.s(pe4Var3.o);
                                    break;
                                case 13:
                                    oi3Var.C(pe4Var3.t, false);
                                    break;
                                case 14:
                                    oi3Var.K(pe4Var3.r.a);
                                    oi3Var.e(pe4Var3.r);
                                    break;
                                case 15:
                                    oi3Var.h(pe4Var3.v);
                                    break;
                                case WaveRetry.MAX_FAILURES /* 16 */:
                                    oi3Var.O(pe4Var3.a);
                                    break;
                                case 17:
                                    oi3Var.P(pe4Var3.f);
                                    break;
                                case 18:
                                    PlaybackException playbackException4 = pe4Var3.f;
                                    String str = f35.a;
                                    oi3Var.S(playbackException4);
                                    break;
                                case 19:
                                    oi3Var.o(pe4Var3.m);
                                    break;
                                case 20:
                                    oi3Var.A(pe4Var3.x);
                                    break;
                                case 21:
                                    oi3Var.F(pe4Var3.y);
                                    break;
                                case 22:
                                    oi3Var.L(pe4Var3.d, pe4Var3.b);
                                    break;
                                case 23:
                                    oi3Var.v(pe4Var3.d);
                                    break;
                                case 24:
                                    oi3Var.r(pe4Var3.c, pe4Var3.b);
                                    break;
                                default:
                                    oi3Var.g(pe4Var3.e);
                                    break;
                            }
                        }
                    });
                }
                if (!pe4Var2.a.equals(pe4Var.a)) {
                    final int i34 = 16;
                    tc2Var.c(13, new qc2() { // from class: ae4
                        @Override // defpackage.qc2
                        public final void invoke(Object obj5) {
                            int i110 = i34;
                            pe4 pe4Var3 = pe4Var;
                            oi3 oi3Var = (oi3) obj5;
                            switch (i110) {
                                case 0:
                                    oi3Var.V(qe4.z1(pe4Var3));
                                    break;
                                case 1:
                                    oi3Var.N(pe4Var3.l);
                                    break;
                                case 2:
                                    oi3Var.f(pe4Var3.g);
                                    break;
                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                    oi3Var.x(pe4Var3.h);
                                    break;
                                case 4:
                                    oi3Var.E(pe4Var3.i);
                                    break;
                                case 5:
                                    oi3Var.H(pe4Var3.j);
                                    break;
                                case 6:
                                    oi3Var.R(pe4Var3.k);
                                    break;
                                case 7:
                                    oi3Var.n(pe4Var3.n);
                                    break;
                                case 8:
                                    oi3Var.a(pe4Var3.q);
                                    break;
                                case 9:
                                    oi3Var.Q(pe4Var3.s);
                                    break;
                                case 10:
                                    oi3Var.G(pe4Var3.z);
                                    break;
                                case 11:
                                    pf4 pf4Var = pe4Var3.u;
                                    oi3Var.T(pf4Var.a, pf4Var.b);
                                    break;
                                case 12:
                                    oi3Var.s(pe4Var3.o);
                                    break;
                                case 13:
                                    oi3Var.C(pe4Var3.t, false);
                                    break;
                                case 14:
                                    oi3Var.K(pe4Var3.r.a);
                                    oi3Var.e(pe4Var3.r);
                                    break;
                                case 15:
                                    oi3Var.h(pe4Var3.v);
                                    break;
                                case WaveRetry.MAX_FAILURES /* 16 */:
                                    oi3Var.O(pe4Var3.a);
                                    break;
                                case 17:
                                    oi3Var.P(pe4Var3.f);
                                    break;
                                case 18:
                                    PlaybackException playbackException4 = pe4Var3.f;
                                    String str = f35.a;
                                    oi3Var.S(playbackException4);
                                    break;
                                case 19:
                                    oi3Var.o(pe4Var3.m);
                                    break;
                                case 20:
                                    oi3Var.A(pe4Var3.x);
                                    break;
                                case 21:
                                    oi3Var.F(pe4Var3.y);
                                    break;
                                case 22:
                                    oi3Var.L(pe4Var3.d, pe4Var3.b);
                                    break;
                                case 23:
                                    oi3Var.v(pe4Var3.d);
                                    break;
                                case 24:
                                    oi3Var.r(pe4Var3.c, pe4Var3.b);
                                    break;
                                default:
                                    oi3Var.g(pe4Var3.e);
                                    break;
                            }
                        }
                    });
                }
                tc2Var.b();
            }
            qv2Var = qv2Var4;
            playbackException = playbackException3;
            i2 = 3;
            tc2Var = this.c;
            if (zEquals) {
                if (cu4Var2.o() != cu4Var.o()) {
                    qv2Var2 = qv2Var;
                } else {
                    i13 = 0;
                    while (true) {
                        if (i13 >= cu4Var2.o()) {
                            qv2Var2 = qv2Var;
                            i14 = 1;
                            break;
                        }
                        obj = cu4Var2.m(i13, bu4Var, 0L).a;
                        qv2Var2 = qv2Var;
                        obj2 = cu4Var.m(i13, bu4Var, 0L).a;
                        if (obj instanceof ke4) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        if (!obj.equals(obj2)) {
                        }
                        i13++;
                        qv2Var = qv2Var2;
                    }
                    q31 q31Var3 = new q31(i14, 7, pe4Var);
                    z5 = false;
                    tc2Var.c(0, q31Var3);
                }
                i14 = 0;
                q31 q31Var4 = new q31(i14, 7, pe4Var);
                z5 = false;
                tc2Var.c(0, q31Var4);
            } else {
                qv2Var2 = qv2Var;
                z5 = false;
            }
            if (i != -1) {
                tc2Var.c(11, new z31(i, g1(pe4Var2, z5, bu4Var, zt4Var), g1(pe4Var, z7, bu4Var, zt4Var), 1));
            }
            if (i2 != -1) {
                if (cu4Var.p()) {
                    gn2Var = null;
                } else {
                    if (i15 == -1) {
                        i15 = 0;
                    }
                    gn2Var = cu4Var.m(i15, bu4Var, 0L).b;
                }
                tc2Var.c(1, new a41(gn2Var, i2, 1));
            }
            i3 = 18;
            i4 = 17;
            i5 = 10;
            playbackException2 = playbackException;
            if (pe4Var2.f != playbackException2) {
                tc2Var.c(10, new qc2() { // from class: ae4
                    @Override // defpackage.qc2
                    public final void invoke(Object obj5) {
                        int i110 = i4;
                        pe4 pe4Var3 = pe4Var;
                        oi3 oi3Var = (oi3) obj5;
                        switch (i110) {
                            case 0:
                                oi3Var.V(qe4.z1(pe4Var3));
                                break;
                            case 1:
                                oi3Var.N(pe4Var3.l);
                                break;
                            case 2:
                                oi3Var.f(pe4Var3.g);
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                oi3Var.x(pe4Var3.h);
                                break;
                            case 4:
                                oi3Var.E(pe4Var3.i);
                                break;
                            case 5:
                                oi3Var.H(pe4Var3.j);
                                break;
                            case 6:
                                oi3Var.R(pe4Var3.k);
                                break;
                            case 7:
                                oi3Var.n(pe4Var3.n);
                                break;
                            case 8:
                                oi3Var.a(pe4Var3.q);
                                break;
                            case 9:
                                oi3Var.Q(pe4Var3.s);
                                break;
                            case 10:
                                oi3Var.G(pe4Var3.z);
                                break;
                            case 11:
                                pf4 pf4Var = pe4Var3.u;
                                oi3Var.T(pf4Var.a, pf4Var.b);
                                break;
                            case 12:
                                oi3Var.s(pe4Var3.o);
                                break;
                            case 13:
                                oi3Var.C(pe4Var3.t, false);
                                break;
                            case 14:
                                oi3Var.K(pe4Var3.r.a);
                                oi3Var.e(pe4Var3.r);
                                break;
                            case 15:
                                oi3Var.h(pe4Var3.v);
                                break;
                            case WaveRetry.MAX_FAILURES /* 16 */:
                                oi3Var.O(pe4Var3.a);
                                break;
                            case 17:
                                oi3Var.P(pe4Var3.f);
                                break;
                            case 18:
                                PlaybackException playbackException4 = pe4Var3.f;
                                String str = f35.a;
                                oi3Var.S(playbackException4);
                                break;
                            case 19:
                                oi3Var.o(pe4Var3.m);
                                break;
                            case 20:
                                oi3Var.A(pe4Var3.x);
                                break;
                            case 21:
                                oi3Var.F(pe4Var3.y);
                                break;
                            case 22:
                                oi3Var.L(pe4Var3.d, pe4Var3.b);
                                break;
                            case 23:
                                oi3Var.v(pe4Var3.d);
                                break;
                            case 24:
                                oi3Var.r(pe4Var3.c, pe4Var3.b);
                                break;
                            default:
                                oi3Var.g(pe4Var3.e);
                                break;
                        }
                    }
                });
                if (playbackException2 != null) {
                    tc2Var.c(10, new qc2() { // from class: ae4
                        @Override // defpackage.qc2
                        public final void invoke(Object obj5) {
                            int i110 = i3;
                            pe4 pe4Var3 = pe4Var;
                            oi3 oi3Var = (oi3) obj5;
                            switch (i110) {
                                case 0:
                                    oi3Var.V(qe4.z1(pe4Var3));
                                    break;
                                case 1:
                                    oi3Var.N(pe4Var3.l);
                                    break;
                                case 2:
                                    oi3Var.f(pe4Var3.g);
                                    break;
                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                    oi3Var.x(pe4Var3.h);
                                    break;
                                case 4:
                                    oi3Var.E(pe4Var3.i);
                                    break;
                                case 5:
                                    oi3Var.H(pe4Var3.j);
                                    break;
                                case 6:
                                    oi3Var.R(pe4Var3.k);
                                    break;
                                case 7:
                                    oi3Var.n(pe4Var3.n);
                                    break;
                                case 8:
                                    oi3Var.a(pe4Var3.q);
                                    break;
                                case 9:
                                    oi3Var.Q(pe4Var3.s);
                                    break;
                                case 10:
                                    oi3Var.G(pe4Var3.z);
                                    break;
                                case 11:
                                    pf4 pf4Var = pe4Var3.u;
                                    oi3Var.T(pf4Var.a, pf4Var.b);
                                    break;
                                case 12:
                                    oi3Var.s(pe4Var3.o);
                                    break;
                                case 13:
                                    oi3Var.C(pe4Var3.t, false);
                                    break;
                                case 14:
                                    oi3Var.K(pe4Var3.r.a);
                                    oi3Var.e(pe4Var3.r);
                                    break;
                                case 15:
                                    oi3Var.h(pe4Var3.v);
                                    break;
                                case WaveRetry.MAX_FAILURES /* 16 */:
                                    oi3Var.O(pe4Var3.a);
                                    break;
                                case 17:
                                    oi3Var.P(pe4Var3.f);
                                    break;
                                case 18:
                                    PlaybackException playbackException4 = pe4Var3.f;
                                    String str = f35.a;
                                    oi3Var.S(playbackException4);
                                    break;
                                case 19:
                                    oi3Var.o(pe4Var3.m);
                                    break;
                                case 20:
                                    oi3Var.A(pe4Var3.x);
                                    break;
                                case 21:
                                    oi3Var.F(pe4Var3.y);
                                    break;
                                case 22:
                                    oi3Var.L(pe4Var3.d, pe4Var3.b);
                                    break;
                                case 23:
                                    oi3Var.v(pe4Var3.d);
                                    break;
                                case 24:
                                    oi3Var.r(pe4Var3.c, pe4Var3.b);
                                    break;
                                default:
                                    oi3Var.g(pe4Var3.e);
                                    break;
                            }
                        }
                    });
                }
            }
            if (!pe4Var2.m.equals(pe4Var.m)) {
                final int i110 = 19;
                tc2Var.c(19, new qc2() { // from class: ae4
                    @Override // defpackage.qc2
                    public final void invoke(Object obj5) {
                        int i111 = i110;
                        pe4 pe4Var3 = pe4Var;
                        oi3 oi3Var = (oi3) obj5;
                        switch (i111) {
                            case 0:
                                oi3Var.V(qe4.z1(pe4Var3));
                                break;
                            case 1:
                                oi3Var.N(pe4Var3.l);
                                break;
                            case 2:
                                oi3Var.f(pe4Var3.g);
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                oi3Var.x(pe4Var3.h);
                                break;
                            case 4:
                                oi3Var.E(pe4Var3.i);
                                break;
                            case 5:
                                oi3Var.H(pe4Var3.j);
                                break;
                            case 6:
                                oi3Var.R(pe4Var3.k);
                                break;
                            case 7:
                                oi3Var.n(pe4Var3.n);
                                break;
                            case 8:
                                oi3Var.a(pe4Var3.q);
                                break;
                            case 9:
                                oi3Var.Q(pe4Var3.s);
                                break;
                            case 10:
                                oi3Var.G(pe4Var3.z);
                                break;
                            case 11:
                                pf4 pf4Var = pe4Var3.u;
                                oi3Var.T(pf4Var.a, pf4Var.b);
                                break;
                            case 12:
                                oi3Var.s(pe4Var3.o);
                                break;
                            case 13:
                                oi3Var.C(pe4Var3.t, false);
                                break;
                            case 14:
                                oi3Var.K(pe4Var3.r.a);
                                oi3Var.e(pe4Var3.r);
                                break;
                            case 15:
                                oi3Var.h(pe4Var3.v);
                                break;
                            case WaveRetry.MAX_FAILURES /* 16 */:
                                oi3Var.O(pe4Var3.a);
                                break;
                            case 17:
                                oi3Var.P(pe4Var3.f);
                                break;
                            case 18:
                                PlaybackException playbackException4 = pe4Var3.f;
                                String str = f35.a;
                                oi3Var.S(playbackException4);
                                break;
                            case 19:
                                oi3Var.o(pe4Var3.m);
                                break;
                            case 20:
                                oi3Var.A(pe4Var3.x);
                                break;
                            case 21:
                                oi3Var.F(pe4Var3.y);
                                break;
                            case 22:
                                oi3Var.L(pe4Var3.d, pe4Var3.b);
                                break;
                            case 23:
                                oi3Var.v(pe4Var3.d);
                                break;
                            case 24:
                                oi3Var.r(pe4Var3.c, pe4Var3.b);
                                break;
                            default:
                                oi3Var.g(pe4Var3.e);
                                break;
                        }
                    }
                });
            }
            i6 = 20;
            if (!pe4Var2.x.equals(pe4Var.x)) {
                tc2Var.c(2, new qc2() { // from class: ae4
                    @Override // defpackage.qc2
                    public final void invoke(Object obj5) {
                        int i111 = i6;
                        pe4 pe4Var3 = pe4Var;
                        oi3 oi3Var = (oi3) obj5;
                        switch (i111) {
                            case 0:
                                oi3Var.V(qe4.z1(pe4Var3));
                                break;
                            case 1:
                                oi3Var.N(pe4Var3.l);
                                break;
                            case 2:
                                oi3Var.f(pe4Var3.g);
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                oi3Var.x(pe4Var3.h);
                                break;
                            case 4:
                                oi3Var.E(pe4Var3.i);
                                break;
                            case 5:
                                oi3Var.H(pe4Var3.j);
                                break;
                            case 6:
                                oi3Var.R(pe4Var3.k);
                                break;
                            case 7:
                                oi3Var.n(pe4Var3.n);
                                break;
                            case 8:
                                oi3Var.a(pe4Var3.q);
                                break;
                            case 9:
                                oi3Var.Q(pe4Var3.s);
                                break;
                            case 10:
                                oi3Var.G(pe4Var3.z);
                                break;
                            case 11:
                                pf4 pf4Var = pe4Var3.u;
                                oi3Var.T(pf4Var.a, pf4Var.b);
                                break;
                            case 12:
                                oi3Var.s(pe4Var3.o);
                                break;
                            case 13:
                                oi3Var.C(pe4Var3.t, false);
                                break;
                            case 14:
                                oi3Var.K(pe4Var3.r.a);
                                oi3Var.e(pe4Var3.r);
                                break;
                            case 15:
                                oi3Var.h(pe4Var3.v);
                                break;
                            case WaveRetry.MAX_FAILURES /* 16 */:
                                oi3Var.O(pe4Var3.a);
                                break;
                            case 17:
                                oi3Var.P(pe4Var3.f);
                                break;
                            case 18:
                                PlaybackException playbackException4 = pe4Var3.f;
                                String str = f35.a;
                                oi3Var.S(playbackException4);
                                break;
                            case 19:
                                oi3Var.o(pe4Var3.m);
                                break;
                            case 20:
                                oi3Var.A(pe4Var3.x);
                                break;
                            case 21:
                                oi3Var.F(pe4Var3.y);
                                break;
                            case 22:
                                oi3Var.L(pe4Var3.d, pe4Var3.b);
                                break;
                            case 23:
                                oi3Var.v(pe4Var3.d);
                                break;
                            case 24:
                                oi3Var.r(pe4Var3.c, pe4Var3.b);
                                break;
                            default:
                                oi3Var.g(pe4Var3.e);
                                break;
                        }
                    }
                });
            }
            if (!pe4Var2.y.equals(pe4Var.y)) {
                final int i210 = 21;
                tc2Var.c(14, new qc2() { // from class: ae4
                    @Override // defpackage.qc2
                    public final void invoke(Object obj5) {
                        int i111 = i210;
                        pe4 pe4Var3 = pe4Var;
                        oi3 oi3Var = (oi3) obj5;
                        switch (i111) {
                            case 0:
                                oi3Var.V(qe4.z1(pe4Var3));
                                break;
                            case 1:
                                oi3Var.N(pe4Var3.l);
                                break;
                            case 2:
                                oi3Var.f(pe4Var3.g);
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                oi3Var.x(pe4Var3.h);
                                break;
                            case 4:
                                oi3Var.E(pe4Var3.i);
                                break;
                            case 5:
                                oi3Var.H(pe4Var3.j);
                                break;
                            case 6:
                                oi3Var.R(pe4Var3.k);
                                break;
                            case 7:
                                oi3Var.n(pe4Var3.n);
                                break;
                            case 8:
                                oi3Var.a(pe4Var3.q);
                                break;
                            case 9:
                                oi3Var.Q(pe4Var3.s);
                                break;
                            case 10:
                                oi3Var.G(pe4Var3.z);
                                break;
                            case 11:
                                pf4 pf4Var = pe4Var3.u;
                                oi3Var.T(pf4Var.a, pf4Var.b);
                                break;
                            case 12:
                                oi3Var.s(pe4Var3.o);
                                break;
                            case 13:
                                oi3Var.C(pe4Var3.t, false);
                                break;
                            case 14:
                                oi3Var.K(pe4Var3.r.a);
                                oi3Var.e(pe4Var3.r);
                                break;
                            case 15:
                                oi3Var.h(pe4Var3.v);
                                break;
                            case WaveRetry.MAX_FAILURES /* 16 */:
                                oi3Var.O(pe4Var3.a);
                                break;
                            case 17:
                                oi3Var.P(pe4Var3.f);
                                break;
                            case 18:
                                PlaybackException playbackException4 = pe4Var3.f;
                                String str = f35.a;
                                oi3Var.S(playbackException4);
                                break;
                            case 19:
                                oi3Var.o(pe4Var3.m);
                                break;
                            case 20:
                                oi3Var.A(pe4Var3.x);
                                break;
                            case 21:
                                oi3Var.F(pe4Var3.y);
                                break;
                            case 22:
                                oi3Var.L(pe4Var3.d, pe4Var3.b);
                                break;
                            case 23:
                                oi3Var.v(pe4Var3.d);
                                break;
                            case 24:
                                oi3Var.r(pe4Var3.c, pe4Var3.b);
                                break;
                            default:
                                oi3Var.g(pe4Var3.e);
                                break;
                        }
                    }
                });
            }
            i7 = 22;
            if (z3) {
                tc2Var.c(-1, new qc2() { // from class: ae4
                    @Override // defpackage.qc2
                    public final void invoke(Object obj5) {
                        int i111 = i7;
                        pe4 pe4Var3 = pe4Var;
                        oi3 oi3Var = (oi3) obj5;
                        switch (i111) {
                            case 0:
                                oi3Var.V(qe4.z1(pe4Var3));
                                break;
                            case 1:
                                oi3Var.N(pe4Var3.l);
                                break;
                            case 2:
                                oi3Var.f(pe4Var3.g);
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                oi3Var.x(pe4Var3.h);
                                break;
                            case 4:
                                oi3Var.E(pe4Var3.i);
                                break;
                            case 5:
                                oi3Var.H(pe4Var3.j);
                                break;
                            case 6:
                                oi3Var.R(pe4Var3.k);
                                break;
                            case 7:
                                oi3Var.n(pe4Var3.n);
                                break;
                            case 8:
                                oi3Var.a(pe4Var3.q);
                                break;
                            case 9:
                                oi3Var.Q(pe4Var3.s);
                                break;
                            case 10:
                                oi3Var.G(pe4Var3.z);
                                break;
                            case 11:
                                pf4 pf4Var = pe4Var3.u;
                                oi3Var.T(pf4Var.a, pf4Var.b);
                                break;
                            case 12:
                                oi3Var.s(pe4Var3.o);
                                break;
                            case 13:
                                oi3Var.C(pe4Var3.t, false);
                                break;
                            case 14:
                                oi3Var.K(pe4Var3.r.a);
                                oi3Var.e(pe4Var3.r);
                                break;
                            case 15:
                                oi3Var.h(pe4Var3.v);
                                break;
                            case WaveRetry.MAX_FAILURES /* 16 */:
                                oi3Var.O(pe4Var3.a);
                                break;
                            case 17:
                                oi3Var.P(pe4Var3.f);
                                break;
                            case 18:
                                PlaybackException playbackException4 = pe4Var3.f;
                                String str = f35.a;
                                oi3Var.S(playbackException4);
                                break;
                            case 19:
                                oi3Var.o(pe4Var3.m);
                                break;
                            case 20:
                                oi3Var.A(pe4Var3.x);
                                break;
                            case 21:
                                oi3Var.F(pe4Var3.y);
                                break;
                            case 22:
                                oi3Var.L(pe4Var3.d, pe4Var3.b);
                                break;
                            case 23:
                                oi3Var.v(pe4Var3.d);
                                break;
                            case 24:
                                oi3Var.r(pe4Var3.c, pe4Var3.b);
                                break;
                            default:
                                oi3Var.g(pe4Var3.e);
                                break;
                        }
                    }
                });
            } else {
                tc2Var.c(-1, new qc2() { // from class: ae4
                    @Override // defpackage.qc2
                    public final void invoke(Object obj5) {
                        int i111 = i7;
                        pe4 pe4Var3 = pe4Var;
                        oi3 oi3Var = (oi3) obj5;
                        switch (i111) {
                            case 0:
                                oi3Var.V(qe4.z1(pe4Var3));
                                break;
                            case 1:
                                oi3Var.N(pe4Var3.l);
                                break;
                            case 2:
                                oi3Var.f(pe4Var3.g);
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                oi3Var.x(pe4Var3.h);
                                break;
                            case 4:
                                oi3Var.E(pe4Var3.i);
                                break;
                            case 5:
                                oi3Var.H(pe4Var3.j);
                                break;
                            case 6:
                                oi3Var.R(pe4Var3.k);
                                break;
                            case 7:
                                oi3Var.n(pe4Var3.n);
                                break;
                            case 8:
                                oi3Var.a(pe4Var3.q);
                                break;
                            case 9:
                                oi3Var.Q(pe4Var3.s);
                                break;
                            case 10:
                                oi3Var.G(pe4Var3.z);
                                break;
                            case 11:
                                pf4 pf4Var = pe4Var3.u;
                                oi3Var.T(pf4Var.a, pf4Var.b);
                                break;
                            case 12:
                                oi3Var.s(pe4Var3.o);
                                break;
                            case 13:
                                oi3Var.C(pe4Var3.t, false);
                                break;
                            case 14:
                                oi3Var.K(pe4Var3.r.a);
                                oi3Var.e(pe4Var3.r);
                                break;
                            case 15:
                                oi3Var.h(pe4Var3.v);
                                break;
                            case WaveRetry.MAX_FAILURES /* 16 */:
                                oi3Var.O(pe4Var3.a);
                                break;
                            case 17:
                                oi3Var.P(pe4Var3.f);
                                break;
                            case 18:
                                PlaybackException playbackException4 = pe4Var3.f;
                                String str = f35.a;
                                oi3Var.S(playbackException4);
                                break;
                            case 19:
                                oi3Var.o(pe4Var3.m);
                                break;
                            case 20:
                                oi3Var.A(pe4Var3.x);
                                break;
                            case 21:
                                oi3Var.F(pe4Var3.y);
                                break;
                            case 22:
                                oi3Var.L(pe4Var3.d, pe4Var3.b);
                                break;
                            case 23:
                                oi3Var.v(pe4Var3.d);
                                break;
                            case 24:
                                oi3Var.r(pe4Var3.c, pe4Var3.b);
                                break;
                            default:
                                oi3Var.g(pe4Var3.e);
                                break;
                        }
                    }
                });
            }
            if (z4) {
                final int i211 = 23;
                tc2Var.c(4, new qc2() { // from class: ae4
                    @Override // defpackage.qc2
                    public final void invoke(Object obj5) {
                        int i111 = i211;
                        pe4 pe4Var3 = pe4Var;
                        oi3 oi3Var = (oi3) obj5;
                        switch (i111) {
                            case 0:
                                oi3Var.V(qe4.z1(pe4Var3));
                                break;
                            case 1:
                                oi3Var.N(pe4Var3.l);
                                break;
                            case 2:
                                oi3Var.f(pe4Var3.g);
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                oi3Var.x(pe4Var3.h);
                                break;
                            case 4:
                                oi3Var.E(pe4Var3.i);
                                break;
                            case 5:
                                oi3Var.H(pe4Var3.j);
                                break;
                            case 6:
                                oi3Var.R(pe4Var3.k);
                                break;
                            case 7:
                                oi3Var.n(pe4Var3.n);
                                break;
                            case 8:
                                oi3Var.a(pe4Var3.q);
                                break;
                            case 9:
                                oi3Var.Q(pe4Var3.s);
                                break;
                            case 10:
                                oi3Var.G(pe4Var3.z);
                                break;
                            case 11:
                                pf4 pf4Var = pe4Var3.u;
                                oi3Var.T(pf4Var.a, pf4Var.b);
                                break;
                            case 12:
                                oi3Var.s(pe4Var3.o);
                                break;
                            case 13:
                                oi3Var.C(pe4Var3.t, false);
                                break;
                            case 14:
                                oi3Var.K(pe4Var3.r.a);
                                oi3Var.e(pe4Var3.r);
                                break;
                            case 15:
                                oi3Var.h(pe4Var3.v);
                                break;
                            case WaveRetry.MAX_FAILURES /* 16 */:
                                oi3Var.O(pe4Var3.a);
                                break;
                            case 17:
                                oi3Var.P(pe4Var3.f);
                                break;
                            case 18:
                                PlaybackException playbackException4 = pe4Var3.f;
                                String str = f35.a;
                                oi3Var.S(playbackException4);
                                break;
                            case 19:
                                oi3Var.o(pe4Var3.m);
                                break;
                            case 20:
                                oi3Var.A(pe4Var3.x);
                                break;
                            case 21:
                                oi3Var.F(pe4Var3.y);
                                break;
                            case 22:
                                oi3Var.L(pe4Var3.d, pe4Var3.b);
                                break;
                            case 23:
                                oi3Var.v(pe4Var3.d);
                                break;
                            case 24:
                                oi3Var.r(pe4Var3.c, pe4Var3.b);
                                break;
                            default:
                                oi3Var.g(pe4Var3.e);
                                break;
                        }
                    }
                });
            }
            i8 = 24;
            if (z3) {
                tc2Var.c(5, new qc2() { // from class: ae4
                    @Override // defpackage.qc2
                    public final void invoke(Object obj5) {
                        int i111 = i8;
                        pe4 pe4Var3 = pe4Var;
                        oi3 oi3Var = (oi3) obj5;
                        switch (i111) {
                            case 0:
                                oi3Var.V(qe4.z1(pe4Var3));
                                break;
                            case 1:
                                oi3Var.N(pe4Var3.l);
                                break;
                            case 2:
                                oi3Var.f(pe4Var3.g);
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                oi3Var.x(pe4Var3.h);
                                break;
                            case 4:
                                oi3Var.E(pe4Var3.i);
                                break;
                            case 5:
                                oi3Var.H(pe4Var3.j);
                                break;
                            case 6:
                                oi3Var.R(pe4Var3.k);
                                break;
                            case 7:
                                oi3Var.n(pe4Var3.n);
                                break;
                            case 8:
                                oi3Var.a(pe4Var3.q);
                                break;
                            case 9:
                                oi3Var.Q(pe4Var3.s);
                                break;
                            case 10:
                                oi3Var.G(pe4Var3.z);
                                break;
                            case 11:
                                pf4 pf4Var = pe4Var3.u;
                                oi3Var.T(pf4Var.a, pf4Var.b);
                                break;
                            case 12:
                                oi3Var.s(pe4Var3.o);
                                break;
                            case 13:
                                oi3Var.C(pe4Var3.t, false);
                                break;
                            case 14:
                                oi3Var.K(pe4Var3.r.a);
                                oi3Var.e(pe4Var3.r);
                                break;
                            case 15:
                                oi3Var.h(pe4Var3.v);
                                break;
                            case WaveRetry.MAX_FAILURES /* 16 */:
                                oi3Var.O(pe4Var3.a);
                                break;
                            case 17:
                                oi3Var.P(pe4Var3.f);
                                break;
                            case 18:
                                PlaybackException playbackException4 = pe4Var3.f;
                                String str = f35.a;
                                oi3Var.S(playbackException4);
                                break;
                            case 19:
                                oi3Var.o(pe4Var3.m);
                                break;
                            case 20:
                                oi3Var.A(pe4Var3.x);
                                break;
                            case 21:
                                oi3Var.F(pe4Var3.y);
                                break;
                            case 22:
                                oi3Var.L(pe4Var3.d, pe4Var3.b);
                                break;
                            case 23:
                                oi3Var.v(pe4Var3.d);
                                break;
                            case 24:
                                oi3Var.r(pe4Var3.c, pe4Var3.b);
                                break;
                            default:
                                oi3Var.g(pe4Var3.e);
                                break;
                        }
                    }
                });
            } else {
                tc2Var.c(5, new qc2() { // from class: ae4
                    @Override // defpackage.qc2
                    public final void invoke(Object obj5) {
                        int i111 = i8;
                        pe4 pe4Var3 = pe4Var;
                        oi3 oi3Var = (oi3) obj5;
                        switch (i111) {
                            case 0:
                                oi3Var.V(qe4.z1(pe4Var3));
                                break;
                            case 1:
                                oi3Var.N(pe4Var3.l);
                                break;
                            case 2:
                                oi3Var.f(pe4Var3.g);
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                oi3Var.x(pe4Var3.h);
                                break;
                            case 4:
                                oi3Var.E(pe4Var3.i);
                                break;
                            case 5:
                                oi3Var.H(pe4Var3.j);
                                break;
                            case 6:
                                oi3Var.R(pe4Var3.k);
                                break;
                            case 7:
                                oi3Var.n(pe4Var3.n);
                                break;
                            case 8:
                                oi3Var.a(pe4Var3.q);
                                break;
                            case 9:
                                oi3Var.Q(pe4Var3.s);
                                break;
                            case 10:
                                oi3Var.G(pe4Var3.z);
                                break;
                            case 11:
                                pf4 pf4Var = pe4Var3.u;
                                oi3Var.T(pf4Var.a, pf4Var.b);
                                break;
                            case 12:
                                oi3Var.s(pe4Var3.o);
                                break;
                            case 13:
                                oi3Var.C(pe4Var3.t, false);
                                break;
                            case 14:
                                oi3Var.K(pe4Var3.r.a);
                                oi3Var.e(pe4Var3.r);
                                break;
                            case 15:
                                oi3Var.h(pe4Var3.v);
                                break;
                            case WaveRetry.MAX_FAILURES /* 16 */:
                                oi3Var.O(pe4Var3.a);
                                break;
                            case 17:
                                oi3Var.P(pe4Var3.f);
                                break;
                            case 18:
                                PlaybackException playbackException4 = pe4Var3.f;
                                String str = f35.a;
                                oi3Var.S(playbackException4);
                                break;
                            case 19:
                                oi3Var.o(pe4Var3.m);
                                break;
                            case 20:
                                oi3Var.A(pe4Var3.x);
                                break;
                            case 21:
                                oi3Var.F(pe4Var3.y);
                                break;
                            case 22:
                                oi3Var.L(pe4Var3.d, pe4Var3.b);
                                break;
                            case 23:
                                oi3Var.v(pe4Var3.d);
                                break;
                            case 24:
                                oi3Var.r(pe4Var3.c, pe4Var3.b);
                                break;
                            default:
                                oi3Var.g(pe4Var3.e);
                                break;
                        }
                    }
                });
            }
            i9 = 25;
            i10 = 6;
            if (pe4Var2.e != pe4Var.e) {
                tc2Var.c(6, new qc2() { // from class: ae4
                    @Override // defpackage.qc2
                    public final void invoke(Object obj5) {
                        int i111 = i9;
                        pe4 pe4Var3 = pe4Var;
                        oi3 oi3Var = (oi3) obj5;
                        switch (i111) {
                            case 0:
                                oi3Var.V(qe4.z1(pe4Var3));
                                break;
                            case 1:
                                oi3Var.N(pe4Var3.l);
                                break;
                            case 2:
                                oi3Var.f(pe4Var3.g);
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                oi3Var.x(pe4Var3.h);
                                break;
                            case 4:
                                oi3Var.E(pe4Var3.i);
                                break;
                            case 5:
                                oi3Var.H(pe4Var3.j);
                                break;
                            case 6:
                                oi3Var.R(pe4Var3.k);
                                break;
                            case 7:
                                oi3Var.n(pe4Var3.n);
                                break;
                            case 8:
                                oi3Var.a(pe4Var3.q);
                                break;
                            case 9:
                                oi3Var.Q(pe4Var3.s);
                                break;
                            case 10:
                                oi3Var.G(pe4Var3.z);
                                break;
                            case 11:
                                pf4 pf4Var = pe4Var3.u;
                                oi3Var.T(pf4Var.a, pf4Var.b);
                                break;
                            case 12:
                                oi3Var.s(pe4Var3.o);
                                break;
                            case 13:
                                oi3Var.C(pe4Var3.t, false);
                                break;
                            case 14:
                                oi3Var.K(pe4Var3.r.a);
                                oi3Var.e(pe4Var3.r);
                                break;
                            case 15:
                                oi3Var.h(pe4Var3.v);
                                break;
                            case WaveRetry.MAX_FAILURES /* 16 */:
                                oi3Var.O(pe4Var3.a);
                                break;
                            case 17:
                                oi3Var.P(pe4Var3.f);
                                break;
                            case 18:
                                PlaybackException playbackException4 = pe4Var3.f;
                                String str = f35.a;
                                oi3Var.S(playbackException4);
                                break;
                            case 19:
                                oi3Var.o(pe4Var3.m);
                                break;
                            case 20:
                                oi3Var.A(pe4Var3.x);
                                break;
                            case 21:
                                oi3Var.F(pe4Var3.y);
                                break;
                            case 22:
                                oi3Var.L(pe4Var3.d, pe4Var3.b);
                                break;
                            case 23:
                                oi3Var.v(pe4Var3.d);
                                break;
                            case 24:
                                oi3Var.r(pe4Var3.c, pe4Var3.b);
                                break;
                            default:
                                oi3Var.g(pe4Var3.e);
                                break;
                        }
                    }
                });
            }
            if (z1(pe4Var2) != z1(pe4Var)) {
                final int i212 = 0;
                tc2Var.c(7, new qc2() { // from class: ae4
                    @Override // defpackage.qc2
                    public final void invoke(Object obj5) {
                        int i111 = i212;
                        pe4 pe4Var3 = pe4Var;
                        oi3 oi3Var = (oi3) obj5;
                        switch (i111) {
                            case 0:
                                oi3Var.V(qe4.z1(pe4Var3));
                                break;
                            case 1:
                                oi3Var.N(pe4Var3.l);
                                break;
                            case 2:
                                oi3Var.f(pe4Var3.g);
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                oi3Var.x(pe4Var3.h);
                                break;
                            case 4:
                                oi3Var.E(pe4Var3.i);
                                break;
                            case 5:
                                oi3Var.H(pe4Var3.j);
                                break;
                            case 6:
                                oi3Var.R(pe4Var3.k);
                                break;
                            case 7:
                                oi3Var.n(pe4Var3.n);
                                break;
                            case 8:
                                oi3Var.a(pe4Var3.q);
                                break;
                            case 9:
                                oi3Var.Q(pe4Var3.s);
                                break;
                            case 10:
                                oi3Var.G(pe4Var3.z);
                                break;
                            case 11:
                                pf4 pf4Var = pe4Var3.u;
                                oi3Var.T(pf4Var.a, pf4Var.b);
                                break;
                            case 12:
                                oi3Var.s(pe4Var3.o);
                                break;
                            case 13:
                                oi3Var.C(pe4Var3.t, false);
                                break;
                            case 14:
                                oi3Var.K(pe4Var3.r.a);
                                oi3Var.e(pe4Var3.r);
                                break;
                            case 15:
                                oi3Var.h(pe4Var3.v);
                                break;
                            case WaveRetry.MAX_FAILURES /* 16 */:
                                oi3Var.O(pe4Var3.a);
                                break;
                            case 17:
                                oi3Var.P(pe4Var3.f);
                                break;
                            case 18:
                                PlaybackException playbackException4 = pe4Var3.f;
                                String str = f35.a;
                                oi3Var.S(playbackException4);
                                break;
                            case 19:
                                oi3Var.o(pe4Var3.m);
                                break;
                            case 20:
                                oi3Var.A(pe4Var3.x);
                                break;
                            case 21:
                                oi3Var.F(pe4Var3.y);
                                break;
                            case 22:
                                oi3Var.L(pe4Var3.d, pe4Var3.b);
                                break;
                            case 23:
                                oi3Var.v(pe4Var3.d);
                                break;
                            case 24:
                                oi3Var.r(pe4Var3.c, pe4Var3.b);
                                break;
                            default:
                                oi3Var.g(pe4Var3.e);
                                break;
                        }
                    }
                });
            }
            if (!pe4Var2.l.equals(pe4Var.l)) {
                final int i213 = 1;
                tc2Var.c(12, new qc2() { // from class: ae4
                    @Override // defpackage.qc2
                    public final void invoke(Object obj5) {
                        int i111 = i213;
                        pe4 pe4Var3 = pe4Var;
                        oi3 oi3Var = (oi3) obj5;
                        switch (i111) {
                            case 0:
                                oi3Var.V(qe4.z1(pe4Var3));
                                break;
                            case 1:
                                oi3Var.N(pe4Var3.l);
                                break;
                            case 2:
                                oi3Var.f(pe4Var3.g);
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                oi3Var.x(pe4Var3.h);
                                break;
                            case 4:
                                oi3Var.E(pe4Var3.i);
                                break;
                            case 5:
                                oi3Var.H(pe4Var3.j);
                                break;
                            case 6:
                                oi3Var.R(pe4Var3.k);
                                break;
                            case 7:
                                oi3Var.n(pe4Var3.n);
                                break;
                            case 8:
                                oi3Var.a(pe4Var3.q);
                                break;
                            case 9:
                                oi3Var.Q(pe4Var3.s);
                                break;
                            case 10:
                                oi3Var.G(pe4Var3.z);
                                break;
                            case 11:
                                pf4 pf4Var = pe4Var3.u;
                                oi3Var.T(pf4Var.a, pf4Var.b);
                                break;
                            case 12:
                                oi3Var.s(pe4Var3.o);
                                break;
                            case 13:
                                oi3Var.C(pe4Var3.t, false);
                                break;
                            case 14:
                                oi3Var.K(pe4Var3.r.a);
                                oi3Var.e(pe4Var3.r);
                                break;
                            case 15:
                                oi3Var.h(pe4Var3.v);
                                break;
                            case WaveRetry.MAX_FAILURES /* 16 */:
                                oi3Var.O(pe4Var3.a);
                                break;
                            case 17:
                                oi3Var.P(pe4Var3.f);
                                break;
                            case 18:
                                PlaybackException playbackException4 = pe4Var3.f;
                                String str = f35.a;
                                oi3Var.S(playbackException4);
                                break;
                            case 19:
                                oi3Var.o(pe4Var3.m);
                                break;
                            case 20:
                                oi3Var.A(pe4Var3.x);
                                break;
                            case 21:
                                oi3Var.F(pe4Var3.y);
                                break;
                            case 22:
                                oi3Var.L(pe4Var3.d, pe4Var3.b);
                                break;
                            case 23:
                                oi3Var.v(pe4Var3.d);
                                break;
                            case 24:
                                oi3Var.r(pe4Var3.c, pe4Var3.b);
                                break;
                            default:
                                oi3Var.g(pe4Var3.e);
                                break;
                        }
                    }
                });
            }
            i11 = 8;
            if (pe4Var2.g != pe4Var.g) {
                final int i214 = 2;
                tc2Var.c(8, new qc2() { // from class: ae4
                    @Override // defpackage.qc2
                    public final void invoke(Object obj5) {
                        int i111 = i214;
                        pe4 pe4Var3 = pe4Var;
                        oi3 oi3Var = (oi3) obj5;
                        switch (i111) {
                            case 0:
                                oi3Var.V(qe4.z1(pe4Var3));
                                break;
                            case 1:
                                oi3Var.N(pe4Var3.l);
                                break;
                            case 2:
                                oi3Var.f(pe4Var3.g);
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                oi3Var.x(pe4Var3.h);
                                break;
                            case 4:
                                oi3Var.E(pe4Var3.i);
                                break;
                            case 5:
                                oi3Var.H(pe4Var3.j);
                                break;
                            case 6:
                                oi3Var.R(pe4Var3.k);
                                break;
                            case 7:
                                oi3Var.n(pe4Var3.n);
                                break;
                            case 8:
                                oi3Var.a(pe4Var3.q);
                                break;
                            case 9:
                                oi3Var.Q(pe4Var3.s);
                                break;
                            case 10:
                                oi3Var.G(pe4Var3.z);
                                break;
                            case 11:
                                pf4 pf4Var = pe4Var3.u;
                                oi3Var.T(pf4Var.a, pf4Var.b);
                                break;
                            case 12:
                                oi3Var.s(pe4Var3.o);
                                break;
                            case 13:
                                oi3Var.C(pe4Var3.t, false);
                                break;
                            case 14:
                                oi3Var.K(pe4Var3.r.a);
                                oi3Var.e(pe4Var3.r);
                                break;
                            case 15:
                                oi3Var.h(pe4Var3.v);
                                break;
                            case WaveRetry.MAX_FAILURES /* 16 */:
                                oi3Var.O(pe4Var3.a);
                                break;
                            case 17:
                                oi3Var.P(pe4Var3.f);
                                break;
                            case 18:
                                PlaybackException playbackException4 = pe4Var3.f;
                                String str = f35.a;
                                oi3Var.S(playbackException4);
                                break;
                            case 19:
                                oi3Var.o(pe4Var3.m);
                                break;
                            case 20:
                                oi3Var.A(pe4Var3.x);
                                break;
                            case 21:
                                oi3Var.F(pe4Var3.y);
                                break;
                            case 22:
                                oi3Var.L(pe4Var3.d, pe4Var3.b);
                                break;
                            case 23:
                                oi3Var.v(pe4Var3.d);
                                break;
                            case 24:
                                oi3Var.r(pe4Var3.c, pe4Var3.b);
                                break;
                            default:
                                oi3Var.g(pe4Var3.e);
                                break;
                        }
                    }
                });
            }
            i12 = 9;
            if (pe4Var2.h != pe4Var.h) {
                final int i215 = 3;
                tc2Var.c(9, new qc2() { // from class: ae4
                    @Override // defpackage.qc2
                    public final void invoke(Object obj5) {
                        int i111 = i215;
                        pe4 pe4Var3 = pe4Var;
                        oi3 oi3Var = (oi3) obj5;
                        switch (i111) {
                            case 0:
                                oi3Var.V(qe4.z1(pe4Var3));
                                break;
                            case 1:
                                oi3Var.N(pe4Var3.l);
                                break;
                            case 2:
                                oi3Var.f(pe4Var3.g);
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                oi3Var.x(pe4Var3.h);
                                break;
                            case 4:
                                oi3Var.E(pe4Var3.i);
                                break;
                            case 5:
                                oi3Var.H(pe4Var3.j);
                                break;
                            case 6:
                                oi3Var.R(pe4Var3.k);
                                break;
                            case 7:
                                oi3Var.n(pe4Var3.n);
                                break;
                            case 8:
                                oi3Var.a(pe4Var3.q);
                                break;
                            case 9:
                                oi3Var.Q(pe4Var3.s);
                                break;
                            case 10:
                                oi3Var.G(pe4Var3.z);
                                break;
                            case 11:
                                pf4 pf4Var = pe4Var3.u;
                                oi3Var.T(pf4Var.a, pf4Var.b);
                                break;
                            case 12:
                                oi3Var.s(pe4Var3.o);
                                break;
                            case 13:
                                oi3Var.C(pe4Var3.t, false);
                                break;
                            case 14:
                                oi3Var.K(pe4Var3.r.a);
                                oi3Var.e(pe4Var3.r);
                                break;
                            case 15:
                                oi3Var.h(pe4Var3.v);
                                break;
                            case WaveRetry.MAX_FAILURES /* 16 */:
                                oi3Var.O(pe4Var3.a);
                                break;
                            case 17:
                                oi3Var.P(pe4Var3.f);
                                break;
                            case 18:
                                PlaybackException playbackException4 = pe4Var3.f;
                                String str = f35.a;
                                oi3Var.S(playbackException4);
                                break;
                            case 19:
                                oi3Var.o(pe4Var3.m);
                                break;
                            case 20:
                                oi3Var.A(pe4Var3.x);
                                break;
                            case 21:
                                oi3Var.F(pe4Var3.y);
                                break;
                            case 22:
                                oi3Var.L(pe4Var3.d, pe4Var3.b);
                                break;
                            case 23:
                                oi3Var.v(pe4Var3.d);
                                break;
                            case 24:
                                oi3Var.r(pe4Var3.c, pe4Var3.b);
                                break;
                            default:
                                oi3Var.g(pe4Var3.e);
                                break;
                        }
                    }
                });
            }
            if (pe4Var2.i != pe4Var.i) {
                final int i216 = 4;
                tc2Var.c(16, new qc2() { // from class: ae4
                    @Override // defpackage.qc2
                    public final void invoke(Object obj5) {
                        int i111 = i216;
                        pe4 pe4Var3 = pe4Var;
                        oi3 oi3Var = (oi3) obj5;
                        switch (i111) {
                            case 0:
                                oi3Var.V(qe4.z1(pe4Var3));
                                break;
                            case 1:
                                oi3Var.N(pe4Var3.l);
                                break;
                            case 2:
                                oi3Var.f(pe4Var3.g);
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                oi3Var.x(pe4Var3.h);
                                break;
                            case 4:
                                oi3Var.E(pe4Var3.i);
                                break;
                            case 5:
                                oi3Var.H(pe4Var3.j);
                                break;
                            case 6:
                                oi3Var.R(pe4Var3.k);
                                break;
                            case 7:
                                oi3Var.n(pe4Var3.n);
                                break;
                            case 8:
                                oi3Var.a(pe4Var3.q);
                                break;
                            case 9:
                                oi3Var.Q(pe4Var3.s);
                                break;
                            case 10:
                                oi3Var.G(pe4Var3.z);
                                break;
                            case 11:
                                pf4 pf4Var = pe4Var3.u;
                                oi3Var.T(pf4Var.a, pf4Var.b);
                                break;
                            case 12:
                                oi3Var.s(pe4Var3.o);
                                break;
                            case 13:
                                oi3Var.C(pe4Var3.t, false);
                                break;
                            case 14:
                                oi3Var.K(pe4Var3.r.a);
                                oi3Var.e(pe4Var3.r);
                                break;
                            case 15:
                                oi3Var.h(pe4Var3.v);
                                break;
                            case WaveRetry.MAX_FAILURES /* 16 */:
                                oi3Var.O(pe4Var3.a);
                                break;
                            case 17:
                                oi3Var.P(pe4Var3.f);
                                break;
                            case 18:
                                PlaybackException playbackException4 = pe4Var3.f;
                                String str = f35.a;
                                oi3Var.S(playbackException4);
                                break;
                            case 19:
                                oi3Var.o(pe4Var3.m);
                                break;
                            case 20:
                                oi3Var.A(pe4Var3.x);
                                break;
                            case 21:
                                oi3Var.F(pe4Var3.y);
                                break;
                            case 22:
                                oi3Var.L(pe4Var3.d, pe4Var3.b);
                                break;
                            case 23:
                                oi3Var.v(pe4Var3.d);
                                break;
                            case 24:
                                oi3Var.r(pe4Var3.c, pe4Var3.b);
                                break;
                            default:
                                oi3Var.g(pe4Var3.e);
                                break;
                        }
                    }
                });
            }
            if (pe4Var2.j != pe4Var.j) {
                final int i217 = 5;
                tc2Var.c(17, new qc2() { // from class: ae4
                    @Override // defpackage.qc2
                    public final void invoke(Object obj5) {
                        int i111 = i217;
                        pe4 pe4Var3 = pe4Var;
                        oi3 oi3Var = (oi3) obj5;
                        switch (i111) {
                            case 0:
                                oi3Var.V(qe4.z1(pe4Var3));
                                break;
                            case 1:
                                oi3Var.N(pe4Var3.l);
                                break;
                            case 2:
                                oi3Var.f(pe4Var3.g);
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                oi3Var.x(pe4Var3.h);
                                break;
                            case 4:
                                oi3Var.E(pe4Var3.i);
                                break;
                            case 5:
                                oi3Var.H(pe4Var3.j);
                                break;
                            case 6:
                                oi3Var.R(pe4Var3.k);
                                break;
                            case 7:
                                oi3Var.n(pe4Var3.n);
                                break;
                            case 8:
                                oi3Var.a(pe4Var3.q);
                                break;
                            case 9:
                                oi3Var.Q(pe4Var3.s);
                                break;
                            case 10:
                                oi3Var.G(pe4Var3.z);
                                break;
                            case 11:
                                pf4 pf4Var = pe4Var3.u;
                                oi3Var.T(pf4Var.a, pf4Var.b);
                                break;
                            case 12:
                                oi3Var.s(pe4Var3.o);
                                break;
                            case 13:
                                oi3Var.C(pe4Var3.t, false);
                                break;
                            case 14:
                                oi3Var.K(pe4Var3.r.a);
                                oi3Var.e(pe4Var3.r);
                                break;
                            case 15:
                                oi3Var.h(pe4Var3.v);
                                break;
                            case WaveRetry.MAX_FAILURES /* 16 */:
                                oi3Var.O(pe4Var3.a);
                                break;
                            case 17:
                                oi3Var.P(pe4Var3.f);
                                break;
                            case 18:
                                PlaybackException playbackException4 = pe4Var3.f;
                                String str = f35.a;
                                oi3Var.S(playbackException4);
                                break;
                            case 19:
                                oi3Var.o(pe4Var3.m);
                                break;
                            case 20:
                                oi3Var.A(pe4Var3.x);
                                break;
                            case 21:
                                oi3Var.F(pe4Var3.y);
                                break;
                            case 22:
                                oi3Var.L(pe4Var3.d, pe4Var3.b);
                                break;
                            case 23:
                                oi3Var.v(pe4Var3.d);
                                break;
                            case 24:
                                oi3Var.r(pe4Var3.c, pe4Var3.b);
                                break;
                            default:
                                oi3Var.g(pe4Var3.e);
                                break;
                        }
                    }
                });
            }
            if (pe4Var2.k != pe4Var.k) {
                tc2Var.c(18, new qc2() { // from class: ae4
                    @Override // defpackage.qc2
                    public final void invoke(Object obj5) {
                        int i111 = i10;
                        pe4 pe4Var3 = pe4Var;
                        oi3 oi3Var = (oi3) obj5;
                        switch (i111) {
                            case 0:
                                oi3Var.V(qe4.z1(pe4Var3));
                                break;
                            case 1:
                                oi3Var.N(pe4Var3.l);
                                break;
                            case 2:
                                oi3Var.f(pe4Var3.g);
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                oi3Var.x(pe4Var3.h);
                                break;
                            case 4:
                                oi3Var.E(pe4Var3.i);
                                break;
                            case 5:
                                oi3Var.H(pe4Var3.j);
                                break;
                            case 6:
                                oi3Var.R(pe4Var3.k);
                                break;
                            case 7:
                                oi3Var.n(pe4Var3.n);
                                break;
                            case 8:
                                oi3Var.a(pe4Var3.q);
                                break;
                            case 9:
                                oi3Var.Q(pe4Var3.s);
                                break;
                            case 10:
                                oi3Var.G(pe4Var3.z);
                                break;
                            case 11:
                                pf4 pf4Var = pe4Var3.u;
                                oi3Var.T(pf4Var.a, pf4Var.b);
                                break;
                            case 12:
                                oi3Var.s(pe4Var3.o);
                                break;
                            case 13:
                                oi3Var.C(pe4Var3.t, false);
                                break;
                            case 14:
                                oi3Var.K(pe4Var3.r.a);
                                oi3Var.e(pe4Var3.r);
                                break;
                            case 15:
                                oi3Var.h(pe4Var3.v);
                                break;
                            case WaveRetry.MAX_FAILURES /* 16 */:
                                oi3Var.O(pe4Var3.a);
                                break;
                            case 17:
                                oi3Var.P(pe4Var3.f);
                                break;
                            case 18:
                                PlaybackException playbackException4 = pe4Var3.f;
                                String str = f35.a;
                                oi3Var.S(playbackException4);
                                break;
                            case 19:
                                oi3Var.o(pe4Var3.m);
                                break;
                            case 20:
                                oi3Var.A(pe4Var3.x);
                                break;
                            case 21:
                                oi3Var.F(pe4Var3.y);
                                break;
                            case 22:
                                oi3Var.L(pe4Var3.d, pe4Var3.b);
                                break;
                            case 23:
                                oi3Var.v(pe4Var3.d);
                                break;
                            case 24:
                                oi3Var.r(pe4Var3.c, pe4Var3.b);
                                break;
                            default:
                                oi3Var.g(pe4Var3.e);
                                break;
                        }
                    }
                });
            }
            if (!pe4Var2.n.equals(pe4Var.n)) {
                final int i218 = 7;
                tc2Var.c(20, new qc2() { // from class: ae4
                    @Override // defpackage.qc2
                    public final void invoke(Object obj5) {
                        int i111 = i218;
                        pe4 pe4Var3 = pe4Var;
                        oi3 oi3Var = (oi3) obj5;
                        switch (i111) {
                            case 0:
                                oi3Var.V(qe4.z1(pe4Var3));
                                break;
                            case 1:
                                oi3Var.N(pe4Var3.l);
                                break;
                            case 2:
                                oi3Var.f(pe4Var3.g);
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                oi3Var.x(pe4Var3.h);
                                break;
                            case 4:
                                oi3Var.E(pe4Var3.i);
                                break;
                            case 5:
                                oi3Var.H(pe4Var3.j);
                                break;
                            case 6:
                                oi3Var.R(pe4Var3.k);
                                break;
                            case 7:
                                oi3Var.n(pe4Var3.n);
                                break;
                            case 8:
                                oi3Var.a(pe4Var3.q);
                                break;
                            case 9:
                                oi3Var.Q(pe4Var3.s);
                                break;
                            case 10:
                                oi3Var.G(pe4Var3.z);
                                break;
                            case 11:
                                pf4 pf4Var = pe4Var3.u;
                                oi3Var.T(pf4Var.a, pf4Var.b);
                                break;
                            case 12:
                                oi3Var.s(pe4Var3.o);
                                break;
                            case 13:
                                oi3Var.C(pe4Var3.t, false);
                                break;
                            case 14:
                                oi3Var.K(pe4Var3.r.a);
                                oi3Var.e(pe4Var3.r);
                                break;
                            case 15:
                                oi3Var.h(pe4Var3.v);
                                break;
                            case WaveRetry.MAX_FAILURES /* 16 */:
                                oi3Var.O(pe4Var3.a);
                                break;
                            case 17:
                                oi3Var.P(pe4Var3.f);
                                break;
                            case 18:
                                PlaybackException playbackException4 = pe4Var3.f;
                                String str = f35.a;
                                oi3Var.S(playbackException4);
                                break;
                            case 19:
                                oi3Var.o(pe4Var3.m);
                                break;
                            case 20:
                                oi3Var.A(pe4Var3.x);
                                break;
                            case 21:
                                oi3Var.F(pe4Var3.y);
                                break;
                            case 22:
                                oi3Var.L(pe4Var3.d, pe4Var3.b);
                                break;
                            case 23:
                                oi3Var.v(pe4Var3.d);
                                break;
                            case 24:
                                oi3Var.r(pe4Var3.c, pe4Var3.b);
                                break;
                            default:
                                oi3Var.g(pe4Var3.e);
                                break;
                        }
                    }
                });
            }
            if (!pe4Var2.q.equals(pe4Var.q)) {
                tc2Var.c(25, new qc2() { // from class: ae4
                    @Override // defpackage.qc2
                    public final void invoke(Object obj5) {
                        int i111 = i11;
                        pe4 pe4Var3 = pe4Var;
                        oi3 oi3Var = (oi3) obj5;
                        switch (i111) {
                            case 0:
                                oi3Var.V(qe4.z1(pe4Var3));
                                break;
                            case 1:
                                oi3Var.N(pe4Var3.l);
                                break;
                            case 2:
                                oi3Var.f(pe4Var3.g);
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                oi3Var.x(pe4Var3.h);
                                break;
                            case 4:
                                oi3Var.E(pe4Var3.i);
                                break;
                            case 5:
                                oi3Var.H(pe4Var3.j);
                                break;
                            case 6:
                                oi3Var.R(pe4Var3.k);
                                break;
                            case 7:
                                oi3Var.n(pe4Var3.n);
                                break;
                            case 8:
                                oi3Var.a(pe4Var3.q);
                                break;
                            case 9:
                                oi3Var.Q(pe4Var3.s);
                                break;
                            case 10:
                                oi3Var.G(pe4Var3.z);
                                break;
                            case 11:
                                pf4 pf4Var = pe4Var3.u;
                                oi3Var.T(pf4Var.a, pf4Var.b);
                                break;
                            case 12:
                                oi3Var.s(pe4Var3.o);
                                break;
                            case 13:
                                oi3Var.C(pe4Var3.t, false);
                                break;
                            case 14:
                                oi3Var.K(pe4Var3.r.a);
                                oi3Var.e(pe4Var3.r);
                                break;
                            case 15:
                                oi3Var.h(pe4Var3.v);
                                break;
                            case WaveRetry.MAX_FAILURES /* 16 */:
                                oi3Var.O(pe4Var3.a);
                                break;
                            case 17:
                                oi3Var.P(pe4Var3.f);
                                break;
                            case 18:
                                PlaybackException playbackException4 = pe4Var3.f;
                                String str = f35.a;
                                oi3Var.S(playbackException4);
                                break;
                            case 19:
                                oi3Var.o(pe4Var3.m);
                                break;
                            case 20:
                                oi3Var.A(pe4Var3.x);
                                break;
                            case 21:
                                oi3Var.F(pe4Var3.y);
                                break;
                            case 22:
                                oi3Var.L(pe4Var3.d, pe4Var3.b);
                                break;
                            case 23:
                                oi3Var.v(pe4Var3.d);
                                break;
                            case 24:
                                oi3Var.r(pe4Var3.c, pe4Var3.b);
                                break;
                            default:
                                oi3Var.g(pe4Var3.e);
                                break;
                        }
                    }
                });
            }
            if (!pe4Var2.s.equals(pe4Var.s)) {
                tc2Var.c(29, new qc2() { // from class: ae4
                    @Override // defpackage.qc2
                    public final void invoke(Object obj5) {
                        int i111 = i12;
                        pe4 pe4Var3 = pe4Var;
                        oi3 oi3Var = (oi3) obj5;
                        switch (i111) {
                            case 0:
                                oi3Var.V(qe4.z1(pe4Var3));
                                break;
                            case 1:
                                oi3Var.N(pe4Var3.l);
                                break;
                            case 2:
                                oi3Var.f(pe4Var3.g);
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                oi3Var.x(pe4Var3.h);
                                break;
                            case 4:
                                oi3Var.E(pe4Var3.i);
                                break;
                            case 5:
                                oi3Var.H(pe4Var3.j);
                                break;
                            case 6:
                                oi3Var.R(pe4Var3.k);
                                break;
                            case 7:
                                oi3Var.n(pe4Var3.n);
                                break;
                            case 8:
                                oi3Var.a(pe4Var3.q);
                                break;
                            case 9:
                                oi3Var.Q(pe4Var3.s);
                                break;
                            case 10:
                                oi3Var.G(pe4Var3.z);
                                break;
                            case 11:
                                pf4 pf4Var = pe4Var3.u;
                                oi3Var.T(pf4Var.a, pf4Var.b);
                                break;
                            case 12:
                                oi3Var.s(pe4Var3.o);
                                break;
                            case 13:
                                oi3Var.C(pe4Var3.t, false);
                                break;
                            case 14:
                                oi3Var.K(pe4Var3.r.a);
                                oi3Var.e(pe4Var3.r);
                                break;
                            case 15:
                                oi3Var.h(pe4Var3.v);
                                break;
                            case WaveRetry.MAX_FAILURES /* 16 */:
                                oi3Var.O(pe4Var3.a);
                                break;
                            case 17:
                                oi3Var.P(pe4Var3.f);
                                break;
                            case 18:
                                PlaybackException playbackException4 = pe4Var3.f;
                                String str = f35.a;
                                oi3Var.S(playbackException4);
                                break;
                            case 19:
                                oi3Var.o(pe4Var3.m);
                                break;
                            case 20:
                                oi3Var.A(pe4Var3.x);
                                break;
                            case 21:
                                oi3Var.F(pe4Var3.y);
                                break;
                            case 22:
                                oi3Var.L(pe4Var3.d, pe4Var3.b);
                                break;
                            case 23:
                                oi3Var.v(pe4Var3.d);
                                break;
                            case 24:
                                oi3Var.r(pe4Var3.c, pe4Var3.b);
                                break;
                            default:
                                oi3Var.g(pe4Var3.e);
                                break;
                        }
                    }
                });
            }
            if (!pe4Var2.z.equals(pe4Var.z)) {
                tc2Var.c(15, new qc2() { // from class: ae4
                    @Override // defpackage.qc2
                    public final void invoke(Object obj5) {
                        int i111 = i5;
                        pe4 pe4Var3 = pe4Var;
                        oi3 oi3Var = (oi3) obj5;
                        switch (i111) {
                            case 0:
                                oi3Var.V(qe4.z1(pe4Var3));
                                break;
                            case 1:
                                oi3Var.N(pe4Var3.l);
                                break;
                            case 2:
                                oi3Var.f(pe4Var3.g);
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                oi3Var.x(pe4Var3.h);
                                break;
                            case 4:
                                oi3Var.E(pe4Var3.i);
                                break;
                            case 5:
                                oi3Var.H(pe4Var3.j);
                                break;
                            case 6:
                                oi3Var.R(pe4Var3.k);
                                break;
                            case 7:
                                oi3Var.n(pe4Var3.n);
                                break;
                            case 8:
                                oi3Var.a(pe4Var3.q);
                                break;
                            case 9:
                                oi3Var.Q(pe4Var3.s);
                                break;
                            case 10:
                                oi3Var.G(pe4Var3.z);
                                break;
                            case 11:
                                pf4 pf4Var = pe4Var3.u;
                                oi3Var.T(pf4Var.a, pf4Var.b);
                                break;
                            case 12:
                                oi3Var.s(pe4Var3.o);
                                break;
                            case 13:
                                oi3Var.C(pe4Var3.t, false);
                                break;
                            case 14:
                                oi3Var.K(pe4Var3.r.a);
                                oi3Var.e(pe4Var3.r);
                                break;
                            case 15:
                                oi3Var.h(pe4Var3.v);
                                break;
                            case WaveRetry.MAX_FAILURES /* 16 */:
                                oi3Var.O(pe4Var3.a);
                                break;
                            case 17:
                                oi3Var.P(pe4Var3.f);
                                break;
                            case 18:
                                PlaybackException playbackException4 = pe4Var3.f;
                                String str = f35.a;
                                oi3Var.S(playbackException4);
                                break;
                            case 19:
                                oi3Var.o(pe4Var3.m);
                                break;
                            case 20:
                                oi3Var.A(pe4Var3.x);
                                break;
                            case 21:
                                oi3Var.F(pe4Var3.y);
                                break;
                            case 22:
                                oi3Var.L(pe4Var3.d, pe4Var3.b);
                                break;
                            case 23:
                                oi3Var.v(pe4Var3.d);
                                break;
                            case 24:
                                oi3Var.r(pe4Var3.c, pe4Var3.b);
                                break;
                            default:
                                oi3Var.g(pe4Var3.e);
                                break;
                        }
                    }
                });
            }
            if (!pe4Var2.u.equals(pe4Var.u)) {
                final int i219 = 11;
                tc2Var.c(24, new qc2() { // from class: ae4
                    @Override // defpackage.qc2
                    public final void invoke(Object obj5) {
                        int i111 = i219;
                        pe4 pe4Var3 = pe4Var;
                        oi3 oi3Var = (oi3) obj5;
                        switch (i111) {
                            case 0:
                                oi3Var.V(qe4.z1(pe4Var3));
                                break;
                            case 1:
                                oi3Var.N(pe4Var3.l);
                                break;
                            case 2:
                                oi3Var.f(pe4Var3.g);
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                oi3Var.x(pe4Var3.h);
                                break;
                            case 4:
                                oi3Var.E(pe4Var3.i);
                                break;
                            case 5:
                                oi3Var.H(pe4Var3.j);
                                break;
                            case 6:
                                oi3Var.R(pe4Var3.k);
                                break;
                            case 7:
                                oi3Var.n(pe4Var3.n);
                                break;
                            case 8:
                                oi3Var.a(pe4Var3.q);
                                break;
                            case 9:
                                oi3Var.Q(pe4Var3.s);
                                break;
                            case 10:
                                oi3Var.G(pe4Var3.z);
                                break;
                            case 11:
                                pf4 pf4Var = pe4Var3.u;
                                oi3Var.T(pf4Var.a, pf4Var.b);
                                break;
                            case 12:
                                oi3Var.s(pe4Var3.o);
                                break;
                            case 13:
                                oi3Var.C(pe4Var3.t, false);
                                break;
                            case 14:
                                oi3Var.K(pe4Var3.r.a);
                                oi3Var.e(pe4Var3.r);
                                break;
                            case 15:
                                oi3Var.h(pe4Var3.v);
                                break;
                            case WaveRetry.MAX_FAILURES /* 16 */:
                                oi3Var.O(pe4Var3.a);
                                break;
                            case 17:
                                oi3Var.P(pe4Var3.f);
                                break;
                            case 18:
                                PlaybackException playbackException4 = pe4Var3.f;
                                String str = f35.a;
                                oi3Var.S(playbackException4);
                                break;
                            case 19:
                                oi3Var.o(pe4Var3.m);
                                break;
                            case 20:
                                oi3Var.A(pe4Var3.x);
                                break;
                            case 21:
                                oi3Var.F(pe4Var3.y);
                                break;
                            case 22:
                                oi3Var.L(pe4Var3.d, pe4Var3.b);
                                break;
                            case 23:
                                oi3Var.v(pe4Var3.d);
                                break;
                            case 24:
                                oi3Var.r(pe4Var3.c, pe4Var3.b);
                                break;
                            default:
                                oi3Var.g(pe4Var3.e);
                                break;
                        }
                    }
                });
            }
            if (pe4Var2.o != pe4Var.o) {
                final int i35 = 12;
                tc2Var.c(22, new qc2() { // from class: ae4
                    @Override // defpackage.qc2
                    public final void invoke(Object obj5) {
                        int i111 = i35;
                        pe4 pe4Var3 = pe4Var;
                        oi3 oi3Var = (oi3) obj5;
                        switch (i111) {
                            case 0:
                                oi3Var.V(qe4.z1(pe4Var3));
                                break;
                            case 1:
                                oi3Var.N(pe4Var3.l);
                                break;
                            case 2:
                                oi3Var.f(pe4Var3.g);
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                oi3Var.x(pe4Var3.h);
                                break;
                            case 4:
                                oi3Var.E(pe4Var3.i);
                                break;
                            case 5:
                                oi3Var.H(pe4Var3.j);
                                break;
                            case 6:
                                oi3Var.R(pe4Var3.k);
                                break;
                            case 7:
                                oi3Var.n(pe4Var3.n);
                                break;
                            case 8:
                                oi3Var.a(pe4Var3.q);
                                break;
                            case 9:
                                oi3Var.Q(pe4Var3.s);
                                break;
                            case 10:
                                oi3Var.G(pe4Var3.z);
                                break;
                            case 11:
                                pf4 pf4Var = pe4Var3.u;
                                oi3Var.T(pf4Var.a, pf4Var.b);
                                break;
                            case 12:
                                oi3Var.s(pe4Var3.o);
                                break;
                            case 13:
                                oi3Var.C(pe4Var3.t, false);
                                break;
                            case 14:
                                oi3Var.K(pe4Var3.r.a);
                                oi3Var.e(pe4Var3.r);
                                break;
                            case 15:
                                oi3Var.h(pe4Var3.v);
                                break;
                            case WaveRetry.MAX_FAILURES /* 16 */:
                                oi3Var.O(pe4Var3.a);
                                break;
                            case 17:
                                oi3Var.P(pe4Var3.f);
                                break;
                            case 18:
                                PlaybackException playbackException4 = pe4Var3.f;
                                String str = f35.a;
                                oi3Var.S(playbackException4);
                                break;
                            case 19:
                                oi3Var.o(pe4Var3.m);
                                break;
                            case 20:
                                oi3Var.A(pe4Var3.x);
                                break;
                            case 21:
                                oi3Var.F(pe4Var3.y);
                                break;
                            case 22:
                                oi3Var.L(pe4Var3.d, pe4Var3.b);
                                break;
                            case 23:
                                oi3Var.v(pe4Var3.d);
                                break;
                            case 24:
                                oi3Var.r(pe4Var3.c, pe4Var3.b);
                                break;
                            default:
                                oi3Var.g(pe4Var3.e);
                                break;
                        }
                    }
                });
            }
            if (pe4Var2.t != pe4Var.t) {
                final int i36 = 13;
                tc2Var.c(30, new qc2() { // from class: ae4
                    @Override // defpackage.qc2
                    public final void invoke(Object obj5) {
                        int i111 = i36;
                        pe4 pe4Var3 = pe4Var;
                        oi3 oi3Var = (oi3) obj5;
                        switch (i111) {
                            case 0:
                                oi3Var.V(qe4.z1(pe4Var3));
                                break;
                            case 1:
                                oi3Var.N(pe4Var3.l);
                                break;
                            case 2:
                                oi3Var.f(pe4Var3.g);
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                oi3Var.x(pe4Var3.h);
                                break;
                            case 4:
                                oi3Var.E(pe4Var3.i);
                                break;
                            case 5:
                                oi3Var.H(pe4Var3.j);
                                break;
                            case 6:
                                oi3Var.R(pe4Var3.k);
                                break;
                            case 7:
                                oi3Var.n(pe4Var3.n);
                                break;
                            case 8:
                                oi3Var.a(pe4Var3.q);
                                break;
                            case 9:
                                oi3Var.Q(pe4Var3.s);
                                break;
                            case 10:
                                oi3Var.G(pe4Var3.z);
                                break;
                            case 11:
                                pf4 pf4Var = pe4Var3.u;
                                oi3Var.T(pf4Var.a, pf4Var.b);
                                break;
                            case 12:
                                oi3Var.s(pe4Var3.o);
                                break;
                            case 13:
                                oi3Var.C(pe4Var3.t, false);
                                break;
                            case 14:
                                oi3Var.K(pe4Var3.r.a);
                                oi3Var.e(pe4Var3.r);
                                break;
                            case 15:
                                oi3Var.h(pe4Var3.v);
                                break;
                            case WaveRetry.MAX_FAILURES /* 16 */:
                                oi3Var.O(pe4Var3.a);
                                break;
                            case 17:
                                oi3Var.P(pe4Var3.f);
                                break;
                            case 18:
                                PlaybackException playbackException4 = pe4Var3.f;
                                String str = f35.a;
                                oi3Var.S(playbackException4);
                                break;
                            case 19:
                                oi3Var.o(pe4Var3.m);
                                break;
                            case 20:
                                oi3Var.A(pe4Var3.x);
                                break;
                            case 21:
                                oi3Var.F(pe4Var3.y);
                                break;
                            case 22:
                                oi3Var.L(pe4Var3.d, pe4Var3.b);
                                break;
                            case 23:
                                oi3Var.v(pe4Var3.d);
                                break;
                            case 24:
                                oi3Var.r(pe4Var3.c, pe4Var3.b);
                                break;
                            default:
                                oi3Var.g(pe4Var3.e);
                                break;
                        }
                    }
                });
            }
            if (!pe4Var2.r.equals(pe4Var.r)) {
                final int i37 = 14;
                tc2Var.c(27, new qc2() { // from class: ae4
                    @Override // defpackage.qc2
                    public final void invoke(Object obj5) {
                        int i111 = i37;
                        pe4 pe4Var3 = pe4Var;
                        oi3 oi3Var = (oi3) obj5;
                        switch (i111) {
                            case 0:
                                oi3Var.V(qe4.z1(pe4Var3));
                                break;
                            case 1:
                                oi3Var.N(pe4Var3.l);
                                break;
                            case 2:
                                oi3Var.f(pe4Var3.g);
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                oi3Var.x(pe4Var3.h);
                                break;
                            case 4:
                                oi3Var.E(pe4Var3.i);
                                break;
                            case 5:
                                oi3Var.H(pe4Var3.j);
                                break;
                            case 6:
                                oi3Var.R(pe4Var3.k);
                                break;
                            case 7:
                                oi3Var.n(pe4Var3.n);
                                break;
                            case 8:
                                oi3Var.a(pe4Var3.q);
                                break;
                            case 9:
                                oi3Var.Q(pe4Var3.s);
                                break;
                            case 10:
                                oi3Var.G(pe4Var3.z);
                                break;
                            case 11:
                                pf4 pf4Var = pe4Var3.u;
                                oi3Var.T(pf4Var.a, pf4Var.b);
                                break;
                            case 12:
                                oi3Var.s(pe4Var3.o);
                                break;
                            case 13:
                                oi3Var.C(pe4Var3.t, false);
                                break;
                            case 14:
                                oi3Var.K(pe4Var3.r.a);
                                oi3Var.e(pe4Var3.r);
                                break;
                            case 15:
                                oi3Var.h(pe4Var3.v);
                                break;
                            case WaveRetry.MAX_FAILURES /* 16 */:
                                oi3Var.O(pe4Var3.a);
                                break;
                            case 17:
                                oi3Var.P(pe4Var3.f);
                                break;
                            case 18:
                                PlaybackException playbackException4 = pe4Var3.f;
                                String str = f35.a;
                                oi3Var.S(playbackException4);
                                break;
                            case 19:
                                oi3Var.o(pe4Var3.m);
                                break;
                            case 20:
                                oi3Var.A(pe4Var3.x);
                                break;
                            case 21:
                                oi3Var.F(pe4Var3.y);
                                break;
                            case 22:
                                oi3Var.L(pe4Var3.d, pe4Var3.b);
                                break;
                            case 23:
                                oi3Var.v(pe4Var3.d);
                                break;
                            case 24:
                                oi3Var.r(pe4Var3.c, pe4Var3.b);
                                break;
                            default:
                                oi3Var.g(pe4Var3.e);
                                break;
                        }
                    }
                });
            }
            qv2Var3 = qv2Var2;
            if (!pe4Var2.v.equals(qv2Var3)) {
                final int i38 = 15;
                tc2Var.c(28, new qc2() { // from class: ae4
                    @Override // defpackage.qc2
                    public final void invoke(Object obj5) {
                        int i111 = i38;
                        pe4 pe4Var3 = pe4Var;
                        oi3 oi3Var = (oi3) obj5;
                        switch (i111) {
                            case 0:
                                oi3Var.V(qe4.z1(pe4Var3));
                                break;
                            case 1:
                                oi3Var.N(pe4Var3.l);
                                break;
                            case 2:
                                oi3Var.f(pe4Var3.g);
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                oi3Var.x(pe4Var3.h);
                                break;
                            case 4:
                                oi3Var.E(pe4Var3.i);
                                break;
                            case 5:
                                oi3Var.H(pe4Var3.j);
                                break;
                            case 6:
                                oi3Var.R(pe4Var3.k);
                                break;
                            case 7:
                                oi3Var.n(pe4Var3.n);
                                break;
                            case 8:
                                oi3Var.a(pe4Var3.q);
                                break;
                            case 9:
                                oi3Var.Q(pe4Var3.s);
                                break;
                            case 10:
                                oi3Var.G(pe4Var3.z);
                                break;
                            case 11:
                                pf4 pf4Var = pe4Var3.u;
                                oi3Var.T(pf4Var.a, pf4Var.b);
                                break;
                            case 12:
                                oi3Var.s(pe4Var3.o);
                                break;
                            case 13:
                                oi3Var.C(pe4Var3.t, false);
                                break;
                            case 14:
                                oi3Var.K(pe4Var3.r.a);
                                oi3Var.e(pe4Var3.r);
                                break;
                            case 15:
                                oi3Var.h(pe4Var3.v);
                                break;
                            case WaveRetry.MAX_FAILURES /* 16 */:
                                oi3Var.O(pe4Var3.a);
                                break;
                            case 17:
                                oi3Var.P(pe4Var3.f);
                                break;
                            case 18:
                                PlaybackException playbackException4 = pe4Var3.f;
                                String str = f35.a;
                                oi3Var.S(playbackException4);
                                break;
                            case 19:
                                oi3Var.o(pe4Var3.m);
                                break;
                            case 20:
                                oi3Var.A(pe4Var3.x);
                                break;
                            case 21:
                                oi3Var.F(pe4Var3.y);
                                break;
                            case 22:
                                oi3Var.L(pe4Var3.d, pe4Var3.b);
                                break;
                            case 23:
                                oi3Var.v(pe4Var3.d);
                                break;
                            case 24:
                                oi3Var.r(pe4Var3.c, pe4Var3.b);
                                break;
                            default:
                                oi3Var.g(pe4Var3.e);
                                break;
                        }
                    }
                });
            }
            if (!pe4Var2.a.equals(pe4Var.a)) {
                final int i39 = 16;
                tc2Var.c(13, new qc2() { // from class: ae4
                    @Override // defpackage.qc2
                    public final void invoke(Object obj5) {
                        int i111 = i39;
                        pe4 pe4Var3 = pe4Var;
                        oi3 oi3Var = (oi3) obj5;
                        switch (i111) {
                            case 0:
                                oi3Var.V(qe4.z1(pe4Var3));
                                break;
                            case 1:
                                oi3Var.N(pe4Var3.l);
                                break;
                            case 2:
                                oi3Var.f(pe4Var3.g);
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                oi3Var.x(pe4Var3.h);
                                break;
                            case 4:
                                oi3Var.E(pe4Var3.i);
                                break;
                            case 5:
                                oi3Var.H(pe4Var3.j);
                                break;
                            case 6:
                                oi3Var.R(pe4Var3.k);
                                break;
                            case 7:
                                oi3Var.n(pe4Var3.n);
                                break;
                            case 8:
                                oi3Var.a(pe4Var3.q);
                                break;
                            case 9:
                                oi3Var.Q(pe4Var3.s);
                                break;
                            case 10:
                                oi3Var.G(pe4Var3.z);
                                break;
                            case 11:
                                pf4 pf4Var = pe4Var3.u;
                                oi3Var.T(pf4Var.a, pf4Var.b);
                                break;
                            case 12:
                                oi3Var.s(pe4Var3.o);
                                break;
                            case 13:
                                oi3Var.C(pe4Var3.t, false);
                                break;
                            case 14:
                                oi3Var.K(pe4Var3.r.a);
                                oi3Var.e(pe4Var3.r);
                                break;
                            case 15:
                                oi3Var.h(pe4Var3.v);
                                break;
                            case WaveRetry.MAX_FAILURES /* 16 */:
                                oi3Var.O(pe4Var3.a);
                                break;
                            case 17:
                                oi3Var.P(pe4Var3.f);
                                break;
                            case 18:
                                PlaybackException playbackException4 = pe4Var3.f;
                                String str = f35.a;
                                oi3Var.S(playbackException4);
                                break;
                            case 19:
                                oi3Var.o(pe4Var3.m);
                                break;
                            case 20:
                                oi3Var.A(pe4Var3.x);
                                break;
                            case 21:
                                oi3Var.F(pe4Var3.y);
                                break;
                            case 22:
                                oi3Var.L(pe4Var3.d, pe4Var3.b);
                                break;
                            case 23:
                                oi3Var.v(pe4Var3.d);
                                break;
                            case 24:
                                oi3Var.r(pe4Var3.c, pe4Var3.b);
                                break;
                            default:
                                oi3Var.g(pe4Var3.e);
                                break;
                        }
                    }
                });
            }
            tc2Var.b();
        }
        qv2Var = qv2Var4;
        playbackException = playbackException3;
        i2 = -1;
        tc2Var = this.c;
        if (zEquals) {
            if (cu4Var2.o() != cu4Var.o()) {
                qv2Var2 = qv2Var;
            } else {
                i13 = 0;
                while (true) {
                    if (i13 >= cu4Var2.o()) {
                        qv2Var2 = qv2Var;
                        i14 = 1;
                        break;
                    }
                    obj = cu4Var2.m(i13, bu4Var, 0L).a;
                    qv2Var2 = qv2Var;
                    obj2 = cu4Var.m(i13, bu4Var, 0L).a;
                    if (obj instanceof ke4) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    if (!obj.equals(obj2)) {
                    }
                    i13++;
                    qv2Var = qv2Var2;
                }
                q31 q31Var5 = new q31(i14, 7, pe4Var);
                z5 = false;
                tc2Var.c(0, q31Var5);
            }
            i14 = 0;
            q31 q31Var6 = new q31(i14, 7, pe4Var);
            z5 = false;
            tc2Var.c(0, q31Var6);
        } else {
            qv2Var2 = qv2Var;
            z5 = false;
        }
        if (i != -1) {
            tc2Var.c(11, new z31(i, g1(pe4Var2, z5, bu4Var, zt4Var), g1(pe4Var, z7, bu4Var, zt4Var), 1));
        }
        if (i2 != -1) {
            if (cu4Var.p()) {
                gn2Var = null;
            } else {
                if (i15 == -1) {
                    i15 = 0;
                }
                gn2Var = cu4Var.m(i15, bu4Var, 0L).b;
            }
            tc2Var.c(1, new a41(gn2Var, i2, 1));
        }
        i3 = 18;
        i4 = 17;
        i5 = 10;
        playbackException2 = playbackException;
        if (pe4Var2.f != playbackException2) {
            tc2Var.c(10, new qc2() { // from class: ae4
                @Override // defpackage.qc2
                public final void invoke(Object obj5) {
                    int i111 = i4;
                    pe4 pe4Var3 = pe4Var;
                    oi3 oi3Var = (oi3) obj5;
                    switch (i111) {
                        case 0:
                            oi3Var.V(qe4.z1(pe4Var3));
                            break;
                        case 1:
                            oi3Var.N(pe4Var3.l);
                            break;
                        case 2:
                            oi3Var.f(pe4Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.x(pe4Var3.h);
                            break;
                        case 4:
                            oi3Var.E(pe4Var3.i);
                            break;
                        case 5:
                            oi3Var.H(pe4Var3.j);
                            break;
                        case 6:
                            oi3Var.R(pe4Var3.k);
                            break;
                        case 7:
                            oi3Var.n(pe4Var3.n);
                            break;
                        case 8:
                            oi3Var.a(pe4Var3.q);
                            break;
                        case 9:
                            oi3Var.Q(pe4Var3.s);
                            break;
                        case 10:
                            oi3Var.G(pe4Var3.z);
                            break;
                        case 11:
                            pf4 pf4Var = pe4Var3.u;
                            oi3Var.T(pf4Var.a, pf4Var.b);
                            break;
                        case 12:
                            oi3Var.s(pe4Var3.o);
                            break;
                        case 13:
                            oi3Var.C(pe4Var3.t, false);
                            break;
                        case 14:
                            oi3Var.K(pe4Var3.r.a);
                            oi3Var.e(pe4Var3.r);
                            break;
                        case 15:
                            oi3Var.h(pe4Var3.v);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.O(pe4Var3.a);
                            break;
                        case 17:
                            oi3Var.P(pe4Var3.f);
                            break;
                        case 18:
                            PlaybackException playbackException4 = pe4Var3.f;
                            String str = f35.a;
                            oi3Var.S(playbackException4);
                            break;
                        case 19:
                            oi3Var.o(pe4Var3.m);
                            break;
                        case 20:
                            oi3Var.A(pe4Var3.x);
                            break;
                        case 21:
                            oi3Var.F(pe4Var3.y);
                            break;
                        case 22:
                            oi3Var.L(pe4Var3.d, pe4Var3.b);
                            break;
                        case 23:
                            oi3Var.v(pe4Var3.d);
                            break;
                        case 24:
                            oi3Var.r(pe4Var3.c, pe4Var3.b);
                            break;
                        default:
                            oi3Var.g(pe4Var3.e);
                            break;
                    }
                }
            });
            if (playbackException2 != null) {
                tc2Var.c(10, new qc2() { // from class: ae4
                    @Override // defpackage.qc2
                    public final void invoke(Object obj5) {
                        int i111 = i3;
                        pe4 pe4Var3 = pe4Var;
                        oi3 oi3Var = (oi3) obj5;
                        switch (i111) {
                            case 0:
                                oi3Var.V(qe4.z1(pe4Var3));
                                break;
                            case 1:
                                oi3Var.N(pe4Var3.l);
                                break;
                            case 2:
                                oi3Var.f(pe4Var3.g);
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                oi3Var.x(pe4Var3.h);
                                break;
                            case 4:
                                oi3Var.E(pe4Var3.i);
                                break;
                            case 5:
                                oi3Var.H(pe4Var3.j);
                                break;
                            case 6:
                                oi3Var.R(pe4Var3.k);
                                break;
                            case 7:
                                oi3Var.n(pe4Var3.n);
                                break;
                            case 8:
                                oi3Var.a(pe4Var3.q);
                                break;
                            case 9:
                                oi3Var.Q(pe4Var3.s);
                                break;
                            case 10:
                                oi3Var.G(pe4Var3.z);
                                break;
                            case 11:
                                pf4 pf4Var = pe4Var3.u;
                                oi3Var.T(pf4Var.a, pf4Var.b);
                                break;
                            case 12:
                                oi3Var.s(pe4Var3.o);
                                break;
                            case 13:
                                oi3Var.C(pe4Var3.t, false);
                                break;
                            case 14:
                                oi3Var.K(pe4Var3.r.a);
                                oi3Var.e(pe4Var3.r);
                                break;
                            case 15:
                                oi3Var.h(pe4Var3.v);
                                break;
                            case WaveRetry.MAX_FAILURES /* 16 */:
                                oi3Var.O(pe4Var3.a);
                                break;
                            case 17:
                                oi3Var.P(pe4Var3.f);
                                break;
                            case 18:
                                PlaybackException playbackException4 = pe4Var3.f;
                                String str = f35.a;
                                oi3Var.S(playbackException4);
                                break;
                            case 19:
                                oi3Var.o(pe4Var3.m);
                                break;
                            case 20:
                                oi3Var.A(pe4Var3.x);
                                break;
                            case 21:
                                oi3Var.F(pe4Var3.y);
                                break;
                            case 22:
                                oi3Var.L(pe4Var3.d, pe4Var3.b);
                                break;
                            case 23:
                                oi3Var.v(pe4Var3.d);
                                break;
                            case 24:
                                oi3Var.r(pe4Var3.c, pe4Var3.b);
                                break;
                            default:
                                oi3Var.g(pe4Var3.e);
                                break;
                        }
                    }
                });
            }
        }
        if (!pe4Var2.m.equals(pe4Var.m)) {
            final int i111 = 19;
            tc2Var.c(19, new qc2() { // from class: ae4
                @Override // defpackage.qc2
                public final void invoke(Object obj5) {
                    int i112 = i111;
                    pe4 pe4Var3 = pe4Var;
                    oi3 oi3Var = (oi3) obj5;
                    switch (i112) {
                        case 0:
                            oi3Var.V(qe4.z1(pe4Var3));
                            break;
                        case 1:
                            oi3Var.N(pe4Var3.l);
                            break;
                        case 2:
                            oi3Var.f(pe4Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.x(pe4Var3.h);
                            break;
                        case 4:
                            oi3Var.E(pe4Var3.i);
                            break;
                        case 5:
                            oi3Var.H(pe4Var3.j);
                            break;
                        case 6:
                            oi3Var.R(pe4Var3.k);
                            break;
                        case 7:
                            oi3Var.n(pe4Var3.n);
                            break;
                        case 8:
                            oi3Var.a(pe4Var3.q);
                            break;
                        case 9:
                            oi3Var.Q(pe4Var3.s);
                            break;
                        case 10:
                            oi3Var.G(pe4Var3.z);
                            break;
                        case 11:
                            pf4 pf4Var = pe4Var3.u;
                            oi3Var.T(pf4Var.a, pf4Var.b);
                            break;
                        case 12:
                            oi3Var.s(pe4Var3.o);
                            break;
                        case 13:
                            oi3Var.C(pe4Var3.t, false);
                            break;
                        case 14:
                            oi3Var.K(pe4Var3.r.a);
                            oi3Var.e(pe4Var3.r);
                            break;
                        case 15:
                            oi3Var.h(pe4Var3.v);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.O(pe4Var3.a);
                            break;
                        case 17:
                            oi3Var.P(pe4Var3.f);
                            break;
                        case 18:
                            PlaybackException playbackException4 = pe4Var3.f;
                            String str = f35.a;
                            oi3Var.S(playbackException4);
                            break;
                        case 19:
                            oi3Var.o(pe4Var3.m);
                            break;
                        case 20:
                            oi3Var.A(pe4Var3.x);
                            break;
                        case 21:
                            oi3Var.F(pe4Var3.y);
                            break;
                        case 22:
                            oi3Var.L(pe4Var3.d, pe4Var3.b);
                            break;
                        case 23:
                            oi3Var.v(pe4Var3.d);
                            break;
                        case 24:
                            oi3Var.r(pe4Var3.c, pe4Var3.b);
                            break;
                        default:
                            oi3Var.g(pe4Var3.e);
                            break;
                    }
                }
            });
        }
        i6 = 20;
        if (!pe4Var2.x.equals(pe4Var.x)) {
            tc2Var.c(2, new qc2() { // from class: ae4
                @Override // defpackage.qc2
                public final void invoke(Object obj5) {
                    int i112 = i6;
                    pe4 pe4Var3 = pe4Var;
                    oi3 oi3Var = (oi3) obj5;
                    switch (i112) {
                        case 0:
                            oi3Var.V(qe4.z1(pe4Var3));
                            break;
                        case 1:
                            oi3Var.N(pe4Var3.l);
                            break;
                        case 2:
                            oi3Var.f(pe4Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.x(pe4Var3.h);
                            break;
                        case 4:
                            oi3Var.E(pe4Var3.i);
                            break;
                        case 5:
                            oi3Var.H(pe4Var3.j);
                            break;
                        case 6:
                            oi3Var.R(pe4Var3.k);
                            break;
                        case 7:
                            oi3Var.n(pe4Var3.n);
                            break;
                        case 8:
                            oi3Var.a(pe4Var3.q);
                            break;
                        case 9:
                            oi3Var.Q(pe4Var3.s);
                            break;
                        case 10:
                            oi3Var.G(pe4Var3.z);
                            break;
                        case 11:
                            pf4 pf4Var = pe4Var3.u;
                            oi3Var.T(pf4Var.a, pf4Var.b);
                            break;
                        case 12:
                            oi3Var.s(pe4Var3.o);
                            break;
                        case 13:
                            oi3Var.C(pe4Var3.t, false);
                            break;
                        case 14:
                            oi3Var.K(pe4Var3.r.a);
                            oi3Var.e(pe4Var3.r);
                            break;
                        case 15:
                            oi3Var.h(pe4Var3.v);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.O(pe4Var3.a);
                            break;
                        case 17:
                            oi3Var.P(pe4Var3.f);
                            break;
                        case 18:
                            PlaybackException playbackException4 = pe4Var3.f;
                            String str = f35.a;
                            oi3Var.S(playbackException4);
                            break;
                        case 19:
                            oi3Var.o(pe4Var3.m);
                            break;
                        case 20:
                            oi3Var.A(pe4Var3.x);
                            break;
                        case 21:
                            oi3Var.F(pe4Var3.y);
                            break;
                        case 22:
                            oi3Var.L(pe4Var3.d, pe4Var3.b);
                            break;
                        case 23:
                            oi3Var.v(pe4Var3.d);
                            break;
                        case 24:
                            oi3Var.r(pe4Var3.c, pe4Var3.b);
                            break;
                        default:
                            oi3Var.g(pe4Var3.e);
                            break;
                    }
                }
            });
        }
        if (!pe4Var2.y.equals(pe4Var.y)) {
            final int i2110 = 21;
            tc2Var.c(14, new qc2() { // from class: ae4
                @Override // defpackage.qc2
                public final void invoke(Object obj5) {
                    int i112 = i2110;
                    pe4 pe4Var3 = pe4Var;
                    oi3 oi3Var = (oi3) obj5;
                    switch (i112) {
                        case 0:
                            oi3Var.V(qe4.z1(pe4Var3));
                            break;
                        case 1:
                            oi3Var.N(pe4Var3.l);
                            break;
                        case 2:
                            oi3Var.f(pe4Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.x(pe4Var3.h);
                            break;
                        case 4:
                            oi3Var.E(pe4Var3.i);
                            break;
                        case 5:
                            oi3Var.H(pe4Var3.j);
                            break;
                        case 6:
                            oi3Var.R(pe4Var3.k);
                            break;
                        case 7:
                            oi3Var.n(pe4Var3.n);
                            break;
                        case 8:
                            oi3Var.a(pe4Var3.q);
                            break;
                        case 9:
                            oi3Var.Q(pe4Var3.s);
                            break;
                        case 10:
                            oi3Var.G(pe4Var3.z);
                            break;
                        case 11:
                            pf4 pf4Var = pe4Var3.u;
                            oi3Var.T(pf4Var.a, pf4Var.b);
                            break;
                        case 12:
                            oi3Var.s(pe4Var3.o);
                            break;
                        case 13:
                            oi3Var.C(pe4Var3.t, false);
                            break;
                        case 14:
                            oi3Var.K(pe4Var3.r.a);
                            oi3Var.e(pe4Var3.r);
                            break;
                        case 15:
                            oi3Var.h(pe4Var3.v);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.O(pe4Var3.a);
                            break;
                        case 17:
                            oi3Var.P(pe4Var3.f);
                            break;
                        case 18:
                            PlaybackException playbackException4 = pe4Var3.f;
                            String str = f35.a;
                            oi3Var.S(playbackException4);
                            break;
                        case 19:
                            oi3Var.o(pe4Var3.m);
                            break;
                        case 20:
                            oi3Var.A(pe4Var3.x);
                            break;
                        case 21:
                            oi3Var.F(pe4Var3.y);
                            break;
                        case 22:
                            oi3Var.L(pe4Var3.d, pe4Var3.b);
                            break;
                        case 23:
                            oi3Var.v(pe4Var3.d);
                            break;
                        case 24:
                            oi3Var.r(pe4Var3.c, pe4Var3.b);
                            break;
                        default:
                            oi3Var.g(pe4Var3.e);
                            break;
                    }
                }
            });
        }
        i7 = 22;
        if (z3) {
            tc2Var.c(-1, new qc2() { // from class: ae4
                @Override // defpackage.qc2
                public final void invoke(Object obj5) {
                    int i112 = i7;
                    pe4 pe4Var3 = pe4Var;
                    oi3 oi3Var = (oi3) obj5;
                    switch (i112) {
                        case 0:
                            oi3Var.V(qe4.z1(pe4Var3));
                            break;
                        case 1:
                            oi3Var.N(pe4Var3.l);
                            break;
                        case 2:
                            oi3Var.f(pe4Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.x(pe4Var3.h);
                            break;
                        case 4:
                            oi3Var.E(pe4Var3.i);
                            break;
                        case 5:
                            oi3Var.H(pe4Var3.j);
                            break;
                        case 6:
                            oi3Var.R(pe4Var3.k);
                            break;
                        case 7:
                            oi3Var.n(pe4Var3.n);
                            break;
                        case 8:
                            oi3Var.a(pe4Var3.q);
                            break;
                        case 9:
                            oi3Var.Q(pe4Var3.s);
                            break;
                        case 10:
                            oi3Var.G(pe4Var3.z);
                            break;
                        case 11:
                            pf4 pf4Var = pe4Var3.u;
                            oi3Var.T(pf4Var.a, pf4Var.b);
                            break;
                        case 12:
                            oi3Var.s(pe4Var3.o);
                            break;
                        case 13:
                            oi3Var.C(pe4Var3.t, false);
                            break;
                        case 14:
                            oi3Var.K(pe4Var3.r.a);
                            oi3Var.e(pe4Var3.r);
                            break;
                        case 15:
                            oi3Var.h(pe4Var3.v);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.O(pe4Var3.a);
                            break;
                        case 17:
                            oi3Var.P(pe4Var3.f);
                            break;
                        case 18:
                            PlaybackException playbackException4 = pe4Var3.f;
                            String str = f35.a;
                            oi3Var.S(playbackException4);
                            break;
                        case 19:
                            oi3Var.o(pe4Var3.m);
                            break;
                        case 20:
                            oi3Var.A(pe4Var3.x);
                            break;
                        case 21:
                            oi3Var.F(pe4Var3.y);
                            break;
                        case 22:
                            oi3Var.L(pe4Var3.d, pe4Var3.b);
                            break;
                        case 23:
                            oi3Var.v(pe4Var3.d);
                            break;
                        case 24:
                            oi3Var.r(pe4Var3.c, pe4Var3.b);
                            break;
                        default:
                            oi3Var.g(pe4Var3.e);
                            break;
                    }
                }
            });
        } else {
            tc2Var.c(-1, new qc2() { // from class: ae4
                @Override // defpackage.qc2
                public final void invoke(Object obj5) {
                    int i112 = i7;
                    pe4 pe4Var3 = pe4Var;
                    oi3 oi3Var = (oi3) obj5;
                    switch (i112) {
                        case 0:
                            oi3Var.V(qe4.z1(pe4Var3));
                            break;
                        case 1:
                            oi3Var.N(pe4Var3.l);
                            break;
                        case 2:
                            oi3Var.f(pe4Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.x(pe4Var3.h);
                            break;
                        case 4:
                            oi3Var.E(pe4Var3.i);
                            break;
                        case 5:
                            oi3Var.H(pe4Var3.j);
                            break;
                        case 6:
                            oi3Var.R(pe4Var3.k);
                            break;
                        case 7:
                            oi3Var.n(pe4Var3.n);
                            break;
                        case 8:
                            oi3Var.a(pe4Var3.q);
                            break;
                        case 9:
                            oi3Var.Q(pe4Var3.s);
                            break;
                        case 10:
                            oi3Var.G(pe4Var3.z);
                            break;
                        case 11:
                            pf4 pf4Var = pe4Var3.u;
                            oi3Var.T(pf4Var.a, pf4Var.b);
                            break;
                        case 12:
                            oi3Var.s(pe4Var3.o);
                            break;
                        case 13:
                            oi3Var.C(pe4Var3.t, false);
                            break;
                        case 14:
                            oi3Var.K(pe4Var3.r.a);
                            oi3Var.e(pe4Var3.r);
                            break;
                        case 15:
                            oi3Var.h(pe4Var3.v);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.O(pe4Var3.a);
                            break;
                        case 17:
                            oi3Var.P(pe4Var3.f);
                            break;
                        case 18:
                            PlaybackException playbackException4 = pe4Var3.f;
                            String str = f35.a;
                            oi3Var.S(playbackException4);
                            break;
                        case 19:
                            oi3Var.o(pe4Var3.m);
                            break;
                        case 20:
                            oi3Var.A(pe4Var3.x);
                            break;
                        case 21:
                            oi3Var.F(pe4Var3.y);
                            break;
                        case 22:
                            oi3Var.L(pe4Var3.d, pe4Var3.b);
                            break;
                        case 23:
                            oi3Var.v(pe4Var3.d);
                            break;
                        case 24:
                            oi3Var.r(pe4Var3.c, pe4Var3.b);
                            break;
                        default:
                            oi3Var.g(pe4Var3.e);
                            break;
                    }
                }
            });
        }
        if (z4) {
            final int i2111 = 23;
            tc2Var.c(4, new qc2() { // from class: ae4
                @Override // defpackage.qc2
                public final void invoke(Object obj5) {
                    int i112 = i2111;
                    pe4 pe4Var3 = pe4Var;
                    oi3 oi3Var = (oi3) obj5;
                    switch (i112) {
                        case 0:
                            oi3Var.V(qe4.z1(pe4Var3));
                            break;
                        case 1:
                            oi3Var.N(pe4Var3.l);
                            break;
                        case 2:
                            oi3Var.f(pe4Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.x(pe4Var3.h);
                            break;
                        case 4:
                            oi3Var.E(pe4Var3.i);
                            break;
                        case 5:
                            oi3Var.H(pe4Var3.j);
                            break;
                        case 6:
                            oi3Var.R(pe4Var3.k);
                            break;
                        case 7:
                            oi3Var.n(pe4Var3.n);
                            break;
                        case 8:
                            oi3Var.a(pe4Var3.q);
                            break;
                        case 9:
                            oi3Var.Q(pe4Var3.s);
                            break;
                        case 10:
                            oi3Var.G(pe4Var3.z);
                            break;
                        case 11:
                            pf4 pf4Var = pe4Var3.u;
                            oi3Var.T(pf4Var.a, pf4Var.b);
                            break;
                        case 12:
                            oi3Var.s(pe4Var3.o);
                            break;
                        case 13:
                            oi3Var.C(pe4Var3.t, false);
                            break;
                        case 14:
                            oi3Var.K(pe4Var3.r.a);
                            oi3Var.e(pe4Var3.r);
                            break;
                        case 15:
                            oi3Var.h(pe4Var3.v);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.O(pe4Var3.a);
                            break;
                        case 17:
                            oi3Var.P(pe4Var3.f);
                            break;
                        case 18:
                            PlaybackException playbackException4 = pe4Var3.f;
                            String str = f35.a;
                            oi3Var.S(playbackException4);
                            break;
                        case 19:
                            oi3Var.o(pe4Var3.m);
                            break;
                        case 20:
                            oi3Var.A(pe4Var3.x);
                            break;
                        case 21:
                            oi3Var.F(pe4Var3.y);
                            break;
                        case 22:
                            oi3Var.L(pe4Var3.d, pe4Var3.b);
                            break;
                        case 23:
                            oi3Var.v(pe4Var3.d);
                            break;
                        case 24:
                            oi3Var.r(pe4Var3.c, pe4Var3.b);
                            break;
                        default:
                            oi3Var.g(pe4Var3.e);
                            break;
                    }
                }
            });
        }
        i8 = 24;
        if (z3) {
            tc2Var.c(5, new qc2() { // from class: ae4
                @Override // defpackage.qc2
                public final void invoke(Object obj5) {
                    int i112 = i8;
                    pe4 pe4Var3 = pe4Var;
                    oi3 oi3Var = (oi3) obj5;
                    switch (i112) {
                        case 0:
                            oi3Var.V(qe4.z1(pe4Var3));
                            break;
                        case 1:
                            oi3Var.N(pe4Var3.l);
                            break;
                        case 2:
                            oi3Var.f(pe4Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.x(pe4Var3.h);
                            break;
                        case 4:
                            oi3Var.E(pe4Var3.i);
                            break;
                        case 5:
                            oi3Var.H(pe4Var3.j);
                            break;
                        case 6:
                            oi3Var.R(pe4Var3.k);
                            break;
                        case 7:
                            oi3Var.n(pe4Var3.n);
                            break;
                        case 8:
                            oi3Var.a(pe4Var3.q);
                            break;
                        case 9:
                            oi3Var.Q(pe4Var3.s);
                            break;
                        case 10:
                            oi3Var.G(pe4Var3.z);
                            break;
                        case 11:
                            pf4 pf4Var = pe4Var3.u;
                            oi3Var.T(pf4Var.a, pf4Var.b);
                            break;
                        case 12:
                            oi3Var.s(pe4Var3.o);
                            break;
                        case 13:
                            oi3Var.C(pe4Var3.t, false);
                            break;
                        case 14:
                            oi3Var.K(pe4Var3.r.a);
                            oi3Var.e(pe4Var3.r);
                            break;
                        case 15:
                            oi3Var.h(pe4Var3.v);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.O(pe4Var3.a);
                            break;
                        case 17:
                            oi3Var.P(pe4Var3.f);
                            break;
                        case 18:
                            PlaybackException playbackException4 = pe4Var3.f;
                            String str = f35.a;
                            oi3Var.S(playbackException4);
                            break;
                        case 19:
                            oi3Var.o(pe4Var3.m);
                            break;
                        case 20:
                            oi3Var.A(pe4Var3.x);
                            break;
                        case 21:
                            oi3Var.F(pe4Var3.y);
                            break;
                        case 22:
                            oi3Var.L(pe4Var3.d, pe4Var3.b);
                            break;
                        case 23:
                            oi3Var.v(pe4Var3.d);
                            break;
                        case 24:
                            oi3Var.r(pe4Var3.c, pe4Var3.b);
                            break;
                        default:
                            oi3Var.g(pe4Var3.e);
                            break;
                    }
                }
            });
        } else {
            tc2Var.c(5, new qc2() { // from class: ae4
                @Override // defpackage.qc2
                public final void invoke(Object obj5) {
                    int i112 = i8;
                    pe4 pe4Var3 = pe4Var;
                    oi3 oi3Var = (oi3) obj5;
                    switch (i112) {
                        case 0:
                            oi3Var.V(qe4.z1(pe4Var3));
                            break;
                        case 1:
                            oi3Var.N(pe4Var3.l);
                            break;
                        case 2:
                            oi3Var.f(pe4Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.x(pe4Var3.h);
                            break;
                        case 4:
                            oi3Var.E(pe4Var3.i);
                            break;
                        case 5:
                            oi3Var.H(pe4Var3.j);
                            break;
                        case 6:
                            oi3Var.R(pe4Var3.k);
                            break;
                        case 7:
                            oi3Var.n(pe4Var3.n);
                            break;
                        case 8:
                            oi3Var.a(pe4Var3.q);
                            break;
                        case 9:
                            oi3Var.Q(pe4Var3.s);
                            break;
                        case 10:
                            oi3Var.G(pe4Var3.z);
                            break;
                        case 11:
                            pf4 pf4Var = pe4Var3.u;
                            oi3Var.T(pf4Var.a, pf4Var.b);
                            break;
                        case 12:
                            oi3Var.s(pe4Var3.o);
                            break;
                        case 13:
                            oi3Var.C(pe4Var3.t, false);
                            break;
                        case 14:
                            oi3Var.K(pe4Var3.r.a);
                            oi3Var.e(pe4Var3.r);
                            break;
                        case 15:
                            oi3Var.h(pe4Var3.v);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.O(pe4Var3.a);
                            break;
                        case 17:
                            oi3Var.P(pe4Var3.f);
                            break;
                        case 18:
                            PlaybackException playbackException4 = pe4Var3.f;
                            String str = f35.a;
                            oi3Var.S(playbackException4);
                            break;
                        case 19:
                            oi3Var.o(pe4Var3.m);
                            break;
                        case 20:
                            oi3Var.A(pe4Var3.x);
                            break;
                        case 21:
                            oi3Var.F(pe4Var3.y);
                            break;
                        case 22:
                            oi3Var.L(pe4Var3.d, pe4Var3.b);
                            break;
                        case 23:
                            oi3Var.v(pe4Var3.d);
                            break;
                        case 24:
                            oi3Var.r(pe4Var3.c, pe4Var3.b);
                            break;
                        default:
                            oi3Var.g(pe4Var3.e);
                            break;
                    }
                }
            });
        }
        i9 = 25;
        i10 = 6;
        if (pe4Var2.e != pe4Var.e) {
            tc2Var.c(6, new qc2() { // from class: ae4
                @Override // defpackage.qc2
                public final void invoke(Object obj5) {
                    int i112 = i9;
                    pe4 pe4Var3 = pe4Var;
                    oi3 oi3Var = (oi3) obj5;
                    switch (i112) {
                        case 0:
                            oi3Var.V(qe4.z1(pe4Var3));
                            break;
                        case 1:
                            oi3Var.N(pe4Var3.l);
                            break;
                        case 2:
                            oi3Var.f(pe4Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.x(pe4Var3.h);
                            break;
                        case 4:
                            oi3Var.E(pe4Var3.i);
                            break;
                        case 5:
                            oi3Var.H(pe4Var3.j);
                            break;
                        case 6:
                            oi3Var.R(pe4Var3.k);
                            break;
                        case 7:
                            oi3Var.n(pe4Var3.n);
                            break;
                        case 8:
                            oi3Var.a(pe4Var3.q);
                            break;
                        case 9:
                            oi3Var.Q(pe4Var3.s);
                            break;
                        case 10:
                            oi3Var.G(pe4Var3.z);
                            break;
                        case 11:
                            pf4 pf4Var = pe4Var3.u;
                            oi3Var.T(pf4Var.a, pf4Var.b);
                            break;
                        case 12:
                            oi3Var.s(pe4Var3.o);
                            break;
                        case 13:
                            oi3Var.C(pe4Var3.t, false);
                            break;
                        case 14:
                            oi3Var.K(pe4Var3.r.a);
                            oi3Var.e(pe4Var3.r);
                            break;
                        case 15:
                            oi3Var.h(pe4Var3.v);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.O(pe4Var3.a);
                            break;
                        case 17:
                            oi3Var.P(pe4Var3.f);
                            break;
                        case 18:
                            PlaybackException playbackException4 = pe4Var3.f;
                            String str = f35.a;
                            oi3Var.S(playbackException4);
                            break;
                        case 19:
                            oi3Var.o(pe4Var3.m);
                            break;
                        case 20:
                            oi3Var.A(pe4Var3.x);
                            break;
                        case 21:
                            oi3Var.F(pe4Var3.y);
                            break;
                        case 22:
                            oi3Var.L(pe4Var3.d, pe4Var3.b);
                            break;
                        case 23:
                            oi3Var.v(pe4Var3.d);
                            break;
                        case 24:
                            oi3Var.r(pe4Var3.c, pe4Var3.b);
                            break;
                        default:
                            oi3Var.g(pe4Var3.e);
                            break;
                    }
                }
            });
        }
        if (z1(pe4Var2) != z1(pe4Var)) {
            final int i2112 = 0;
            tc2Var.c(7, new qc2() { // from class: ae4
                @Override // defpackage.qc2
                public final void invoke(Object obj5) {
                    int i112 = i2112;
                    pe4 pe4Var3 = pe4Var;
                    oi3 oi3Var = (oi3) obj5;
                    switch (i112) {
                        case 0:
                            oi3Var.V(qe4.z1(pe4Var3));
                            break;
                        case 1:
                            oi3Var.N(pe4Var3.l);
                            break;
                        case 2:
                            oi3Var.f(pe4Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.x(pe4Var3.h);
                            break;
                        case 4:
                            oi3Var.E(pe4Var3.i);
                            break;
                        case 5:
                            oi3Var.H(pe4Var3.j);
                            break;
                        case 6:
                            oi3Var.R(pe4Var3.k);
                            break;
                        case 7:
                            oi3Var.n(pe4Var3.n);
                            break;
                        case 8:
                            oi3Var.a(pe4Var3.q);
                            break;
                        case 9:
                            oi3Var.Q(pe4Var3.s);
                            break;
                        case 10:
                            oi3Var.G(pe4Var3.z);
                            break;
                        case 11:
                            pf4 pf4Var = pe4Var3.u;
                            oi3Var.T(pf4Var.a, pf4Var.b);
                            break;
                        case 12:
                            oi3Var.s(pe4Var3.o);
                            break;
                        case 13:
                            oi3Var.C(pe4Var3.t, false);
                            break;
                        case 14:
                            oi3Var.K(pe4Var3.r.a);
                            oi3Var.e(pe4Var3.r);
                            break;
                        case 15:
                            oi3Var.h(pe4Var3.v);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.O(pe4Var3.a);
                            break;
                        case 17:
                            oi3Var.P(pe4Var3.f);
                            break;
                        case 18:
                            PlaybackException playbackException4 = pe4Var3.f;
                            String str = f35.a;
                            oi3Var.S(playbackException4);
                            break;
                        case 19:
                            oi3Var.o(pe4Var3.m);
                            break;
                        case 20:
                            oi3Var.A(pe4Var3.x);
                            break;
                        case 21:
                            oi3Var.F(pe4Var3.y);
                            break;
                        case 22:
                            oi3Var.L(pe4Var3.d, pe4Var3.b);
                            break;
                        case 23:
                            oi3Var.v(pe4Var3.d);
                            break;
                        case 24:
                            oi3Var.r(pe4Var3.c, pe4Var3.b);
                            break;
                        default:
                            oi3Var.g(pe4Var3.e);
                            break;
                    }
                }
            });
        }
        if (!pe4Var2.l.equals(pe4Var.l)) {
            final int i2113 = 1;
            tc2Var.c(12, new qc2() { // from class: ae4
                @Override // defpackage.qc2
                public final void invoke(Object obj5) {
                    int i112 = i2113;
                    pe4 pe4Var3 = pe4Var;
                    oi3 oi3Var = (oi3) obj5;
                    switch (i112) {
                        case 0:
                            oi3Var.V(qe4.z1(pe4Var3));
                            break;
                        case 1:
                            oi3Var.N(pe4Var3.l);
                            break;
                        case 2:
                            oi3Var.f(pe4Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.x(pe4Var3.h);
                            break;
                        case 4:
                            oi3Var.E(pe4Var3.i);
                            break;
                        case 5:
                            oi3Var.H(pe4Var3.j);
                            break;
                        case 6:
                            oi3Var.R(pe4Var3.k);
                            break;
                        case 7:
                            oi3Var.n(pe4Var3.n);
                            break;
                        case 8:
                            oi3Var.a(pe4Var3.q);
                            break;
                        case 9:
                            oi3Var.Q(pe4Var3.s);
                            break;
                        case 10:
                            oi3Var.G(pe4Var3.z);
                            break;
                        case 11:
                            pf4 pf4Var = pe4Var3.u;
                            oi3Var.T(pf4Var.a, pf4Var.b);
                            break;
                        case 12:
                            oi3Var.s(pe4Var3.o);
                            break;
                        case 13:
                            oi3Var.C(pe4Var3.t, false);
                            break;
                        case 14:
                            oi3Var.K(pe4Var3.r.a);
                            oi3Var.e(pe4Var3.r);
                            break;
                        case 15:
                            oi3Var.h(pe4Var3.v);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.O(pe4Var3.a);
                            break;
                        case 17:
                            oi3Var.P(pe4Var3.f);
                            break;
                        case 18:
                            PlaybackException playbackException4 = pe4Var3.f;
                            String str = f35.a;
                            oi3Var.S(playbackException4);
                            break;
                        case 19:
                            oi3Var.o(pe4Var3.m);
                            break;
                        case 20:
                            oi3Var.A(pe4Var3.x);
                            break;
                        case 21:
                            oi3Var.F(pe4Var3.y);
                            break;
                        case 22:
                            oi3Var.L(pe4Var3.d, pe4Var3.b);
                            break;
                        case 23:
                            oi3Var.v(pe4Var3.d);
                            break;
                        case 24:
                            oi3Var.r(pe4Var3.c, pe4Var3.b);
                            break;
                        default:
                            oi3Var.g(pe4Var3.e);
                            break;
                    }
                }
            });
        }
        i11 = 8;
        if (pe4Var2.g != pe4Var.g) {
            final int i2114 = 2;
            tc2Var.c(8, new qc2() { // from class: ae4
                @Override // defpackage.qc2
                public final void invoke(Object obj5) {
                    int i112 = i2114;
                    pe4 pe4Var3 = pe4Var;
                    oi3 oi3Var = (oi3) obj5;
                    switch (i112) {
                        case 0:
                            oi3Var.V(qe4.z1(pe4Var3));
                            break;
                        case 1:
                            oi3Var.N(pe4Var3.l);
                            break;
                        case 2:
                            oi3Var.f(pe4Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.x(pe4Var3.h);
                            break;
                        case 4:
                            oi3Var.E(pe4Var3.i);
                            break;
                        case 5:
                            oi3Var.H(pe4Var3.j);
                            break;
                        case 6:
                            oi3Var.R(pe4Var3.k);
                            break;
                        case 7:
                            oi3Var.n(pe4Var3.n);
                            break;
                        case 8:
                            oi3Var.a(pe4Var3.q);
                            break;
                        case 9:
                            oi3Var.Q(pe4Var3.s);
                            break;
                        case 10:
                            oi3Var.G(pe4Var3.z);
                            break;
                        case 11:
                            pf4 pf4Var = pe4Var3.u;
                            oi3Var.T(pf4Var.a, pf4Var.b);
                            break;
                        case 12:
                            oi3Var.s(pe4Var3.o);
                            break;
                        case 13:
                            oi3Var.C(pe4Var3.t, false);
                            break;
                        case 14:
                            oi3Var.K(pe4Var3.r.a);
                            oi3Var.e(pe4Var3.r);
                            break;
                        case 15:
                            oi3Var.h(pe4Var3.v);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.O(pe4Var3.a);
                            break;
                        case 17:
                            oi3Var.P(pe4Var3.f);
                            break;
                        case 18:
                            PlaybackException playbackException4 = pe4Var3.f;
                            String str = f35.a;
                            oi3Var.S(playbackException4);
                            break;
                        case 19:
                            oi3Var.o(pe4Var3.m);
                            break;
                        case 20:
                            oi3Var.A(pe4Var3.x);
                            break;
                        case 21:
                            oi3Var.F(pe4Var3.y);
                            break;
                        case 22:
                            oi3Var.L(pe4Var3.d, pe4Var3.b);
                            break;
                        case 23:
                            oi3Var.v(pe4Var3.d);
                            break;
                        case 24:
                            oi3Var.r(pe4Var3.c, pe4Var3.b);
                            break;
                        default:
                            oi3Var.g(pe4Var3.e);
                            break;
                    }
                }
            });
        }
        i12 = 9;
        if (pe4Var2.h != pe4Var.h) {
            final int i2115 = 3;
            tc2Var.c(9, new qc2() { // from class: ae4
                @Override // defpackage.qc2
                public final void invoke(Object obj5) {
                    int i112 = i2115;
                    pe4 pe4Var3 = pe4Var;
                    oi3 oi3Var = (oi3) obj5;
                    switch (i112) {
                        case 0:
                            oi3Var.V(qe4.z1(pe4Var3));
                            break;
                        case 1:
                            oi3Var.N(pe4Var3.l);
                            break;
                        case 2:
                            oi3Var.f(pe4Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.x(pe4Var3.h);
                            break;
                        case 4:
                            oi3Var.E(pe4Var3.i);
                            break;
                        case 5:
                            oi3Var.H(pe4Var3.j);
                            break;
                        case 6:
                            oi3Var.R(pe4Var3.k);
                            break;
                        case 7:
                            oi3Var.n(pe4Var3.n);
                            break;
                        case 8:
                            oi3Var.a(pe4Var3.q);
                            break;
                        case 9:
                            oi3Var.Q(pe4Var3.s);
                            break;
                        case 10:
                            oi3Var.G(pe4Var3.z);
                            break;
                        case 11:
                            pf4 pf4Var = pe4Var3.u;
                            oi3Var.T(pf4Var.a, pf4Var.b);
                            break;
                        case 12:
                            oi3Var.s(pe4Var3.o);
                            break;
                        case 13:
                            oi3Var.C(pe4Var3.t, false);
                            break;
                        case 14:
                            oi3Var.K(pe4Var3.r.a);
                            oi3Var.e(pe4Var3.r);
                            break;
                        case 15:
                            oi3Var.h(pe4Var3.v);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.O(pe4Var3.a);
                            break;
                        case 17:
                            oi3Var.P(pe4Var3.f);
                            break;
                        case 18:
                            PlaybackException playbackException4 = pe4Var3.f;
                            String str = f35.a;
                            oi3Var.S(playbackException4);
                            break;
                        case 19:
                            oi3Var.o(pe4Var3.m);
                            break;
                        case 20:
                            oi3Var.A(pe4Var3.x);
                            break;
                        case 21:
                            oi3Var.F(pe4Var3.y);
                            break;
                        case 22:
                            oi3Var.L(pe4Var3.d, pe4Var3.b);
                            break;
                        case 23:
                            oi3Var.v(pe4Var3.d);
                            break;
                        case 24:
                            oi3Var.r(pe4Var3.c, pe4Var3.b);
                            break;
                        default:
                            oi3Var.g(pe4Var3.e);
                            break;
                    }
                }
            });
        }
        if (pe4Var2.i != pe4Var.i) {
            final int i2116 = 4;
            tc2Var.c(16, new qc2() { // from class: ae4
                @Override // defpackage.qc2
                public final void invoke(Object obj5) {
                    int i112 = i2116;
                    pe4 pe4Var3 = pe4Var;
                    oi3 oi3Var = (oi3) obj5;
                    switch (i112) {
                        case 0:
                            oi3Var.V(qe4.z1(pe4Var3));
                            break;
                        case 1:
                            oi3Var.N(pe4Var3.l);
                            break;
                        case 2:
                            oi3Var.f(pe4Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.x(pe4Var3.h);
                            break;
                        case 4:
                            oi3Var.E(pe4Var3.i);
                            break;
                        case 5:
                            oi3Var.H(pe4Var3.j);
                            break;
                        case 6:
                            oi3Var.R(pe4Var3.k);
                            break;
                        case 7:
                            oi3Var.n(pe4Var3.n);
                            break;
                        case 8:
                            oi3Var.a(pe4Var3.q);
                            break;
                        case 9:
                            oi3Var.Q(pe4Var3.s);
                            break;
                        case 10:
                            oi3Var.G(pe4Var3.z);
                            break;
                        case 11:
                            pf4 pf4Var = pe4Var3.u;
                            oi3Var.T(pf4Var.a, pf4Var.b);
                            break;
                        case 12:
                            oi3Var.s(pe4Var3.o);
                            break;
                        case 13:
                            oi3Var.C(pe4Var3.t, false);
                            break;
                        case 14:
                            oi3Var.K(pe4Var3.r.a);
                            oi3Var.e(pe4Var3.r);
                            break;
                        case 15:
                            oi3Var.h(pe4Var3.v);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.O(pe4Var3.a);
                            break;
                        case 17:
                            oi3Var.P(pe4Var3.f);
                            break;
                        case 18:
                            PlaybackException playbackException4 = pe4Var3.f;
                            String str = f35.a;
                            oi3Var.S(playbackException4);
                            break;
                        case 19:
                            oi3Var.o(pe4Var3.m);
                            break;
                        case 20:
                            oi3Var.A(pe4Var3.x);
                            break;
                        case 21:
                            oi3Var.F(pe4Var3.y);
                            break;
                        case 22:
                            oi3Var.L(pe4Var3.d, pe4Var3.b);
                            break;
                        case 23:
                            oi3Var.v(pe4Var3.d);
                            break;
                        case 24:
                            oi3Var.r(pe4Var3.c, pe4Var3.b);
                            break;
                        default:
                            oi3Var.g(pe4Var3.e);
                            break;
                    }
                }
            });
        }
        if (pe4Var2.j != pe4Var.j) {
            final int i2117 = 5;
            tc2Var.c(17, new qc2() { // from class: ae4
                @Override // defpackage.qc2
                public final void invoke(Object obj5) {
                    int i112 = i2117;
                    pe4 pe4Var3 = pe4Var;
                    oi3 oi3Var = (oi3) obj5;
                    switch (i112) {
                        case 0:
                            oi3Var.V(qe4.z1(pe4Var3));
                            break;
                        case 1:
                            oi3Var.N(pe4Var3.l);
                            break;
                        case 2:
                            oi3Var.f(pe4Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.x(pe4Var3.h);
                            break;
                        case 4:
                            oi3Var.E(pe4Var3.i);
                            break;
                        case 5:
                            oi3Var.H(pe4Var3.j);
                            break;
                        case 6:
                            oi3Var.R(pe4Var3.k);
                            break;
                        case 7:
                            oi3Var.n(pe4Var3.n);
                            break;
                        case 8:
                            oi3Var.a(pe4Var3.q);
                            break;
                        case 9:
                            oi3Var.Q(pe4Var3.s);
                            break;
                        case 10:
                            oi3Var.G(pe4Var3.z);
                            break;
                        case 11:
                            pf4 pf4Var = pe4Var3.u;
                            oi3Var.T(pf4Var.a, pf4Var.b);
                            break;
                        case 12:
                            oi3Var.s(pe4Var3.o);
                            break;
                        case 13:
                            oi3Var.C(pe4Var3.t, false);
                            break;
                        case 14:
                            oi3Var.K(pe4Var3.r.a);
                            oi3Var.e(pe4Var3.r);
                            break;
                        case 15:
                            oi3Var.h(pe4Var3.v);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.O(pe4Var3.a);
                            break;
                        case 17:
                            oi3Var.P(pe4Var3.f);
                            break;
                        case 18:
                            PlaybackException playbackException4 = pe4Var3.f;
                            String str = f35.a;
                            oi3Var.S(playbackException4);
                            break;
                        case 19:
                            oi3Var.o(pe4Var3.m);
                            break;
                        case 20:
                            oi3Var.A(pe4Var3.x);
                            break;
                        case 21:
                            oi3Var.F(pe4Var3.y);
                            break;
                        case 22:
                            oi3Var.L(pe4Var3.d, pe4Var3.b);
                            break;
                        case 23:
                            oi3Var.v(pe4Var3.d);
                            break;
                        case 24:
                            oi3Var.r(pe4Var3.c, pe4Var3.b);
                            break;
                        default:
                            oi3Var.g(pe4Var3.e);
                            break;
                    }
                }
            });
        }
        if (pe4Var2.k != pe4Var.k) {
            tc2Var.c(18, new qc2() { // from class: ae4
                @Override // defpackage.qc2
                public final void invoke(Object obj5) {
                    int i112 = i10;
                    pe4 pe4Var3 = pe4Var;
                    oi3 oi3Var = (oi3) obj5;
                    switch (i112) {
                        case 0:
                            oi3Var.V(qe4.z1(pe4Var3));
                            break;
                        case 1:
                            oi3Var.N(pe4Var3.l);
                            break;
                        case 2:
                            oi3Var.f(pe4Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.x(pe4Var3.h);
                            break;
                        case 4:
                            oi3Var.E(pe4Var3.i);
                            break;
                        case 5:
                            oi3Var.H(pe4Var3.j);
                            break;
                        case 6:
                            oi3Var.R(pe4Var3.k);
                            break;
                        case 7:
                            oi3Var.n(pe4Var3.n);
                            break;
                        case 8:
                            oi3Var.a(pe4Var3.q);
                            break;
                        case 9:
                            oi3Var.Q(pe4Var3.s);
                            break;
                        case 10:
                            oi3Var.G(pe4Var3.z);
                            break;
                        case 11:
                            pf4 pf4Var = pe4Var3.u;
                            oi3Var.T(pf4Var.a, pf4Var.b);
                            break;
                        case 12:
                            oi3Var.s(pe4Var3.o);
                            break;
                        case 13:
                            oi3Var.C(pe4Var3.t, false);
                            break;
                        case 14:
                            oi3Var.K(pe4Var3.r.a);
                            oi3Var.e(pe4Var3.r);
                            break;
                        case 15:
                            oi3Var.h(pe4Var3.v);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.O(pe4Var3.a);
                            break;
                        case 17:
                            oi3Var.P(pe4Var3.f);
                            break;
                        case 18:
                            PlaybackException playbackException4 = pe4Var3.f;
                            String str = f35.a;
                            oi3Var.S(playbackException4);
                            break;
                        case 19:
                            oi3Var.o(pe4Var3.m);
                            break;
                        case 20:
                            oi3Var.A(pe4Var3.x);
                            break;
                        case 21:
                            oi3Var.F(pe4Var3.y);
                            break;
                        case 22:
                            oi3Var.L(pe4Var3.d, pe4Var3.b);
                            break;
                        case 23:
                            oi3Var.v(pe4Var3.d);
                            break;
                        case 24:
                            oi3Var.r(pe4Var3.c, pe4Var3.b);
                            break;
                        default:
                            oi3Var.g(pe4Var3.e);
                            break;
                    }
                }
            });
        }
        if (!pe4Var2.n.equals(pe4Var.n)) {
            final int i2118 = 7;
            tc2Var.c(20, new qc2() { // from class: ae4
                @Override // defpackage.qc2
                public final void invoke(Object obj5) {
                    int i112 = i2118;
                    pe4 pe4Var3 = pe4Var;
                    oi3 oi3Var = (oi3) obj5;
                    switch (i112) {
                        case 0:
                            oi3Var.V(qe4.z1(pe4Var3));
                            break;
                        case 1:
                            oi3Var.N(pe4Var3.l);
                            break;
                        case 2:
                            oi3Var.f(pe4Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.x(pe4Var3.h);
                            break;
                        case 4:
                            oi3Var.E(pe4Var3.i);
                            break;
                        case 5:
                            oi3Var.H(pe4Var3.j);
                            break;
                        case 6:
                            oi3Var.R(pe4Var3.k);
                            break;
                        case 7:
                            oi3Var.n(pe4Var3.n);
                            break;
                        case 8:
                            oi3Var.a(pe4Var3.q);
                            break;
                        case 9:
                            oi3Var.Q(pe4Var3.s);
                            break;
                        case 10:
                            oi3Var.G(pe4Var3.z);
                            break;
                        case 11:
                            pf4 pf4Var = pe4Var3.u;
                            oi3Var.T(pf4Var.a, pf4Var.b);
                            break;
                        case 12:
                            oi3Var.s(pe4Var3.o);
                            break;
                        case 13:
                            oi3Var.C(pe4Var3.t, false);
                            break;
                        case 14:
                            oi3Var.K(pe4Var3.r.a);
                            oi3Var.e(pe4Var3.r);
                            break;
                        case 15:
                            oi3Var.h(pe4Var3.v);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.O(pe4Var3.a);
                            break;
                        case 17:
                            oi3Var.P(pe4Var3.f);
                            break;
                        case 18:
                            PlaybackException playbackException4 = pe4Var3.f;
                            String str = f35.a;
                            oi3Var.S(playbackException4);
                            break;
                        case 19:
                            oi3Var.o(pe4Var3.m);
                            break;
                        case 20:
                            oi3Var.A(pe4Var3.x);
                            break;
                        case 21:
                            oi3Var.F(pe4Var3.y);
                            break;
                        case 22:
                            oi3Var.L(pe4Var3.d, pe4Var3.b);
                            break;
                        case 23:
                            oi3Var.v(pe4Var3.d);
                            break;
                        case 24:
                            oi3Var.r(pe4Var3.c, pe4Var3.b);
                            break;
                        default:
                            oi3Var.g(pe4Var3.e);
                            break;
                    }
                }
            });
        }
        if (!pe4Var2.q.equals(pe4Var.q)) {
            tc2Var.c(25, new qc2() { // from class: ae4
                @Override // defpackage.qc2
                public final void invoke(Object obj5) {
                    int i112 = i11;
                    pe4 pe4Var3 = pe4Var;
                    oi3 oi3Var = (oi3) obj5;
                    switch (i112) {
                        case 0:
                            oi3Var.V(qe4.z1(pe4Var3));
                            break;
                        case 1:
                            oi3Var.N(pe4Var3.l);
                            break;
                        case 2:
                            oi3Var.f(pe4Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.x(pe4Var3.h);
                            break;
                        case 4:
                            oi3Var.E(pe4Var3.i);
                            break;
                        case 5:
                            oi3Var.H(pe4Var3.j);
                            break;
                        case 6:
                            oi3Var.R(pe4Var3.k);
                            break;
                        case 7:
                            oi3Var.n(pe4Var3.n);
                            break;
                        case 8:
                            oi3Var.a(pe4Var3.q);
                            break;
                        case 9:
                            oi3Var.Q(pe4Var3.s);
                            break;
                        case 10:
                            oi3Var.G(pe4Var3.z);
                            break;
                        case 11:
                            pf4 pf4Var = pe4Var3.u;
                            oi3Var.T(pf4Var.a, pf4Var.b);
                            break;
                        case 12:
                            oi3Var.s(pe4Var3.o);
                            break;
                        case 13:
                            oi3Var.C(pe4Var3.t, false);
                            break;
                        case 14:
                            oi3Var.K(pe4Var3.r.a);
                            oi3Var.e(pe4Var3.r);
                            break;
                        case 15:
                            oi3Var.h(pe4Var3.v);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.O(pe4Var3.a);
                            break;
                        case 17:
                            oi3Var.P(pe4Var3.f);
                            break;
                        case 18:
                            PlaybackException playbackException4 = pe4Var3.f;
                            String str = f35.a;
                            oi3Var.S(playbackException4);
                            break;
                        case 19:
                            oi3Var.o(pe4Var3.m);
                            break;
                        case 20:
                            oi3Var.A(pe4Var3.x);
                            break;
                        case 21:
                            oi3Var.F(pe4Var3.y);
                            break;
                        case 22:
                            oi3Var.L(pe4Var3.d, pe4Var3.b);
                            break;
                        case 23:
                            oi3Var.v(pe4Var3.d);
                            break;
                        case 24:
                            oi3Var.r(pe4Var3.c, pe4Var3.b);
                            break;
                        default:
                            oi3Var.g(pe4Var3.e);
                            break;
                    }
                }
            });
        }
        if (!pe4Var2.s.equals(pe4Var.s)) {
            tc2Var.c(29, new qc2() { // from class: ae4
                @Override // defpackage.qc2
                public final void invoke(Object obj5) {
                    int i112 = i12;
                    pe4 pe4Var3 = pe4Var;
                    oi3 oi3Var = (oi3) obj5;
                    switch (i112) {
                        case 0:
                            oi3Var.V(qe4.z1(pe4Var3));
                            break;
                        case 1:
                            oi3Var.N(pe4Var3.l);
                            break;
                        case 2:
                            oi3Var.f(pe4Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.x(pe4Var3.h);
                            break;
                        case 4:
                            oi3Var.E(pe4Var3.i);
                            break;
                        case 5:
                            oi3Var.H(pe4Var3.j);
                            break;
                        case 6:
                            oi3Var.R(pe4Var3.k);
                            break;
                        case 7:
                            oi3Var.n(pe4Var3.n);
                            break;
                        case 8:
                            oi3Var.a(pe4Var3.q);
                            break;
                        case 9:
                            oi3Var.Q(pe4Var3.s);
                            break;
                        case 10:
                            oi3Var.G(pe4Var3.z);
                            break;
                        case 11:
                            pf4 pf4Var = pe4Var3.u;
                            oi3Var.T(pf4Var.a, pf4Var.b);
                            break;
                        case 12:
                            oi3Var.s(pe4Var3.o);
                            break;
                        case 13:
                            oi3Var.C(pe4Var3.t, false);
                            break;
                        case 14:
                            oi3Var.K(pe4Var3.r.a);
                            oi3Var.e(pe4Var3.r);
                            break;
                        case 15:
                            oi3Var.h(pe4Var3.v);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.O(pe4Var3.a);
                            break;
                        case 17:
                            oi3Var.P(pe4Var3.f);
                            break;
                        case 18:
                            PlaybackException playbackException4 = pe4Var3.f;
                            String str = f35.a;
                            oi3Var.S(playbackException4);
                            break;
                        case 19:
                            oi3Var.o(pe4Var3.m);
                            break;
                        case 20:
                            oi3Var.A(pe4Var3.x);
                            break;
                        case 21:
                            oi3Var.F(pe4Var3.y);
                            break;
                        case 22:
                            oi3Var.L(pe4Var3.d, pe4Var3.b);
                            break;
                        case 23:
                            oi3Var.v(pe4Var3.d);
                            break;
                        case 24:
                            oi3Var.r(pe4Var3.c, pe4Var3.b);
                            break;
                        default:
                            oi3Var.g(pe4Var3.e);
                            break;
                    }
                }
            });
        }
        if (!pe4Var2.z.equals(pe4Var.z)) {
            tc2Var.c(15, new qc2() { // from class: ae4
                @Override // defpackage.qc2
                public final void invoke(Object obj5) {
                    int i112 = i5;
                    pe4 pe4Var3 = pe4Var;
                    oi3 oi3Var = (oi3) obj5;
                    switch (i112) {
                        case 0:
                            oi3Var.V(qe4.z1(pe4Var3));
                            break;
                        case 1:
                            oi3Var.N(pe4Var3.l);
                            break;
                        case 2:
                            oi3Var.f(pe4Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.x(pe4Var3.h);
                            break;
                        case 4:
                            oi3Var.E(pe4Var3.i);
                            break;
                        case 5:
                            oi3Var.H(pe4Var3.j);
                            break;
                        case 6:
                            oi3Var.R(pe4Var3.k);
                            break;
                        case 7:
                            oi3Var.n(pe4Var3.n);
                            break;
                        case 8:
                            oi3Var.a(pe4Var3.q);
                            break;
                        case 9:
                            oi3Var.Q(pe4Var3.s);
                            break;
                        case 10:
                            oi3Var.G(pe4Var3.z);
                            break;
                        case 11:
                            pf4 pf4Var = pe4Var3.u;
                            oi3Var.T(pf4Var.a, pf4Var.b);
                            break;
                        case 12:
                            oi3Var.s(pe4Var3.o);
                            break;
                        case 13:
                            oi3Var.C(pe4Var3.t, false);
                            break;
                        case 14:
                            oi3Var.K(pe4Var3.r.a);
                            oi3Var.e(pe4Var3.r);
                            break;
                        case 15:
                            oi3Var.h(pe4Var3.v);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.O(pe4Var3.a);
                            break;
                        case 17:
                            oi3Var.P(pe4Var3.f);
                            break;
                        case 18:
                            PlaybackException playbackException4 = pe4Var3.f;
                            String str = f35.a;
                            oi3Var.S(playbackException4);
                            break;
                        case 19:
                            oi3Var.o(pe4Var3.m);
                            break;
                        case 20:
                            oi3Var.A(pe4Var3.x);
                            break;
                        case 21:
                            oi3Var.F(pe4Var3.y);
                            break;
                        case 22:
                            oi3Var.L(pe4Var3.d, pe4Var3.b);
                            break;
                        case 23:
                            oi3Var.v(pe4Var3.d);
                            break;
                        case 24:
                            oi3Var.r(pe4Var3.c, pe4Var3.b);
                            break;
                        default:
                            oi3Var.g(pe4Var3.e);
                            break;
                    }
                }
            });
        }
        if (!pe4Var2.u.equals(pe4Var.u)) {
            final int i2119 = 11;
            tc2Var.c(24, new qc2() { // from class: ae4
                @Override // defpackage.qc2
                public final void invoke(Object obj5) {
                    int i112 = i2119;
                    pe4 pe4Var3 = pe4Var;
                    oi3 oi3Var = (oi3) obj5;
                    switch (i112) {
                        case 0:
                            oi3Var.V(qe4.z1(pe4Var3));
                            break;
                        case 1:
                            oi3Var.N(pe4Var3.l);
                            break;
                        case 2:
                            oi3Var.f(pe4Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.x(pe4Var3.h);
                            break;
                        case 4:
                            oi3Var.E(pe4Var3.i);
                            break;
                        case 5:
                            oi3Var.H(pe4Var3.j);
                            break;
                        case 6:
                            oi3Var.R(pe4Var3.k);
                            break;
                        case 7:
                            oi3Var.n(pe4Var3.n);
                            break;
                        case 8:
                            oi3Var.a(pe4Var3.q);
                            break;
                        case 9:
                            oi3Var.Q(pe4Var3.s);
                            break;
                        case 10:
                            oi3Var.G(pe4Var3.z);
                            break;
                        case 11:
                            pf4 pf4Var = pe4Var3.u;
                            oi3Var.T(pf4Var.a, pf4Var.b);
                            break;
                        case 12:
                            oi3Var.s(pe4Var3.o);
                            break;
                        case 13:
                            oi3Var.C(pe4Var3.t, false);
                            break;
                        case 14:
                            oi3Var.K(pe4Var3.r.a);
                            oi3Var.e(pe4Var3.r);
                            break;
                        case 15:
                            oi3Var.h(pe4Var3.v);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.O(pe4Var3.a);
                            break;
                        case 17:
                            oi3Var.P(pe4Var3.f);
                            break;
                        case 18:
                            PlaybackException playbackException4 = pe4Var3.f;
                            String str = f35.a;
                            oi3Var.S(playbackException4);
                            break;
                        case 19:
                            oi3Var.o(pe4Var3.m);
                            break;
                        case 20:
                            oi3Var.A(pe4Var3.x);
                            break;
                        case 21:
                            oi3Var.F(pe4Var3.y);
                            break;
                        case 22:
                            oi3Var.L(pe4Var3.d, pe4Var3.b);
                            break;
                        case 23:
                            oi3Var.v(pe4Var3.d);
                            break;
                        case 24:
                            oi3Var.r(pe4Var3.c, pe4Var3.b);
                            break;
                        default:
                            oi3Var.g(pe4Var3.e);
                            break;
                    }
                }
            });
        }
        if (pe4Var2.o != pe4Var.o) {
            final int i310 = 12;
            tc2Var.c(22, new qc2() { // from class: ae4
                @Override // defpackage.qc2
                public final void invoke(Object obj5) {
                    int i112 = i310;
                    pe4 pe4Var3 = pe4Var;
                    oi3 oi3Var = (oi3) obj5;
                    switch (i112) {
                        case 0:
                            oi3Var.V(qe4.z1(pe4Var3));
                            break;
                        case 1:
                            oi3Var.N(pe4Var3.l);
                            break;
                        case 2:
                            oi3Var.f(pe4Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.x(pe4Var3.h);
                            break;
                        case 4:
                            oi3Var.E(pe4Var3.i);
                            break;
                        case 5:
                            oi3Var.H(pe4Var3.j);
                            break;
                        case 6:
                            oi3Var.R(pe4Var3.k);
                            break;
                        case 7:
                            oi3Var.n(pe4Var3.n);
                            break;
                        case 8:
                            oi3Var.a(pe4Var3.q);
                            break;
                        case 9:
                            oi3Var.Q(pe4Var3.s);
                            break;
                        case 10:
                            oi3Var.G(pe4Var3.z);
                            break;
                        case 11:
                            pf4 pf4Var = pe4Var3.u;
                            oi3Var.T(pf4Var.a, pf4Var.b);
                            break;
                        case 12:
                            oi3Var.s(pe4Var3.o);
                            break;
                        case 13:
                            oi3Var.C(pe4Var3.t, false);
                            break;
                        case 14:
                            oi3Var.K(pe4Var3.r.a);
                            oi3Var.e(pe4Var3.r);
                            break;
                        case 15:
                            oi3Var.h(pe4Var3.v);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.O(pe4Var3.a);
                            break;
                        case 17:
                            oi3Var.P(pe4Var3.f);
                            break;
                        case 18:
                            PlaybackException playbackException4 = pe4Var3.f;
                            String str = f35.a;
                            oi3Var.S(playbackException4);
                            break;
                        case 19:
                            oi3Var.o(pe4Var3.m);
                            break;
                        case 20:
                            oi3Var.A(pe4Var3.x);
                            break;
                        case 21:
                            oi3Var.F(pe4Var3.y);
                            break;
                        case 22:
                            oi3Var.L(pe4Var3.d, pe4Var3.b);
                            break;
                        case 23:
                            oi3Var.v(pe4Var3.d);
                            break;
                        case 24:
                            oi3Var.r(pe4Var3.c, pe4Var3.b);
                            break;
                        default:
                            oi3Var.g(pe4Var3.e);
                            break;
                    }
                }
            });
        }
        if (pe4Var2.t != pe4Var.t) {
            final int i311 = 13;
            tc2Var.c(30, new qc2() { // from class: ae4
                @Override // defpackage.qc2
                public final void invoke(Object obj5) {
                    int i112 = i311;
                    pe4 pe4Var3 = pe4Var;
                    oi3 oi3Var = (oi3) obj5;
                    switch (i112) {
                        case 0:
                            oi3Var.V(qe4.z1(pe4Var3));
                            break;
                        case 1:
                            oi3Var.N(pe4Var3.l);
                            break;
                        case 2:
                            oi3Var.f(pe4Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.x(pe4Var3.h);
                            break;
                        case 4:
                            oi3Var.E(pe4Var3.i);
                            break;
                        case 5:
                            oi3Var.H(pe4Var3.j);
                            break;
                        case 6:
                            oi3Var.R(pe4Var3.k);
                            break;
                        case 7:
                            oi3Var.n(pe4Var3.n);
                            break;
                        case 8:
                            oi3Var.a(pe4Var3.q);
                            break;
                        case 9:
                            oi3Var.Q(pe4Var3.s);
                            break;
                        case 10:
                            oi3Var.G(pe4Var3.z);
                            break;
                        case 11:
                            pf4 pf4Var = pe4Var3.u;
                            oi3Var.T(pf4Var.a, pf4Var.b);
                            break;
                        case 12:
                            oi3Var.s(pe4Var3.o);
                            break;
                        case 13:
                            oi3Var.C(pe4Var3.t, false);
                            break;
                        case 14:
                            oi3Var.K(pe4Var3.r.a);
                            oi3Var.e(pe4Var3.r);
                            break;
                        case 15:
                            oi3Var.h(pe4Var3.v);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.O(pe4Var3.a);
                            break;
                        case 17:
                            oi3Var.P(pe4Var3.f);
                            break;
                        case 18:
                            PlaybackException playbackException4 = pe4Var3.f;
                            String str = f35.a;
                            oi3Var.S(playbackException4);
                            break;
                        case 19:
                            oi3Var.o(pe4Var3.m);
                            break;
                        case 20:
                            oi3Var.A(pe4Var3.x);
                            break;
                        case 21:
                            oi3Var.F(pe4Var3.y);
                            break;
                        case 22:
                            oi3Var.L(pe4Var3.d, pe4Var3.b);
                            break;
                        case 23:
                            oi3Var.v(pe4Var3.d);
                            break;
                        case 24:
                            oi3Var.r(pe4Var3.c, pe4Var3.b);
                            break;
                        default:
                            oi3Var.g(pe4Var3.e);
                            break;
                    }
                }
            });
        }
        if (!pe4Var2.r.equals(pe4Var.r)) {
            final int i312 = 14;
            tc2Var.c(27, new qc2() { // from class: ae4
                @Override // defpackage.qc2
                public final void invoke(Object obj5) {
                    int i112 = i312;
                    pe4 pe4Var3 = pe4Var;
                    oi3 oi3Var = (oi3) obj5;
                    switch (i112) {
                        case 0:
                            oi3Var.V(qe4.z1(pe4Var3));
                            break;
                        case 1:
                            oi3Var.N(pe4Var3.l);
                            break;
                        case 2:
                            oi3Var.f(pe4Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.x(pe4Var3.h);
                            break;
                        case 4:
                            oi3Var.E(pe4Var3.i);
                            break;
                        case 5:
                            oi3Var.H(pe4Var3.j);
                            break;
                        case 6:
                            oi3Var.R(pe4Var3.k);
                            break;
                        case 7:
                            oi3Var.n(pe4Var3.n);
                            break;
                        case 8:
                            oi3Var.a(pe4Var3.q);
                            break;
                        case 9:
                            oi3Var.Q(pe4Var3.s);
                            break;
                        case 10:
                            oi3Var.G(pe4Var3.z);
                            break;
                        case 11:
                            pf4 pf4Var = pe4Var3.u;
                            oi3Var.T(pf4Var.a, pf4Var.b);
                            break;
                        case 12:
                            oi3Var.s(pe4Var3.o);
                            break;
                        case 13:
                            oi3Var.C(pe4Var3.t, false);
                            break;
                        case 14:
                            oi3Var.K(pe4Var3.r.a);
                            oi3Var.e(pe4Var3.r);
                            break;
                        case 15:
                            oi3Var.h(pe4Var3.v);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.O(pe4Var3.a);
                            break;
                        case 17:
                            oi3Var.P(pe4Var3.f);
                            break;
                        case 18:
                            PlaybackException playbackException4 = pe4Var3.f;
                            String str = f35.a;
                            oi3Var.S(playbackException4);
                            break;
                        case 19:
                            oi3Var.o(pe4Var3.m);
                            break;
                        case 20:
                            oi3Var.A(pe4Var3.x);
                            break;
                        case 21:
                            oi3Var.F(pe4Var3.y);
                            break;
                        case 22:
                            oi3Var.L(pe4Var3.d, pe4Var3.b);
                            break;
                        case 23:
                            oi3Var.v(pe4Var3.d);
                            break;
                        case 24:
                            oi3Var.r(pe4Var3.c, pe4Var3.b);
                            break;
                        default:
                            oi3Var.g(pe4Var3.e);
                            break;
                    }
                }
            });
        }
        qv2Var3 = qv2Var2;
        if (!pe4Var2.v.equals(qv2Var3)) {
            final int i313 = 15;
            tc2Var.c(28, new qc2() { // from class: ae4
                @Override // defpackage.qc2
                public final void invoke(Object obj5) {
                    int i112 = i313;
                    pe4 pe4Var3 = pe4Var;
                    oi3 oi3Var = (oi3) obj5;
                    switch (i112) {
                        case 0:
                            oi3Var.V(qe4.z1(pe4Var3));
                            break;
                        case 1:
                            oi3Var.N(pe4Var3.l);
                            break;
                        case 2:
                            oi3Var.f(pe4Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.x(pe4Var3.h);
                            break;
                        case 4:
                            oi3Var.E(pe4Var3.i);
                            break;
                        case 5:
                            oi3Var.H(pe4Var3.j);
                            break;
                        case 6:
                            oi3Var.R(pe4Var3.k);
                            break;
                        case 7:
                            oi3Var.n(pe4Var3.n);
                            break;
                        case 8:
                            oi3Var.a(pe4Var3.q);
                            break;
                        case 9:
                            oi3Var.Q(pe4Var3.s);
                            break;
                        case 10:
                            oi3Var.G(pe4Var3.z);
                            break;
                        case 11:
                            pf4 pf4Var = pe4Var3.u;
                            oi3Var.T(pf4Var.a, pf4Var.b);
                            break;
                        case 12:
                            oi3Var.s(pe4Var3.o);
                            break;
                        case 13:
                            oi3Var.C(pe4Var3.t, false);
                            break;
                        case 14:
                            oi3Var.K(pe4Var3.r.a);
                            oi3Var.e(pe4Var3.r);
                            break;
                        case 15:
                            oi3Var.h(pe4Var3.v);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.O(pe4Var3.a);
                            break;
                        case 17:
                            oi3Var.P(pe4Var3.f);
                            break;
                        case 18:
                            PlaybackException playbackException4 = pe4Var3.f;
                            String str = f35.a;
                            oi3Var.S(playbackException4);
                            break;
                        case 19:
                            oi3Var.o(pe4Var3.m);
                            break;
                        case 20:
                            oi3Var.A(pe4Var3.x);
                            break;
                        case 21:
                            oi3Var.F(pe4Var3.y);
                            break;
                        case 22:
                            oi3Var.L(pe4Var3.d, pe4Var3.b);
                            break;
                        case 23:
                            oi3Var.v(pe4Var3.d);
                            break;
                        case 24:
                            oi3Var.r(pe4Var3.c, pe4Var3.b);
                            break;
                        default:
                            oi3Var.g(pe4Var3.e);
                            break;
                    }
                }
            });
        }
        if (!pe4Var2.a.equals(pe4Var.a)) {
            final int i314 = 16;
            tc2Var.c(13, new qc2() { // from class: ae4
                @Override // defpackage.qc2
                public final void invoke(Object obj5) {
                    int i112 = i314;
                    pe4 pe4Var3 = pe4Var;
                    oi3 oi3Var = (oi3) obj5;
                    switch (i112) {
                        case 0:
                            oi3Var.V(qe4.z1(pe4Var3));
                            break;
                        case 1:
                            oi3Var.N(pe4Var3.l);
                            break;
                        case 2:
                            oi3Var.f(pe4Var3.g);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.x(pe4Var3.h);
                            break;
                        case 4:
                            oi3Var.E(pe4Var3.i);
                            break;
                        case 5:
                            oi3Var.H(pe4Var3.j);
                            break;
                        case 6:
                            oi3Var.R(pe4Var3.k);
                            break;
                        case 7:
                            oi3Var.n(pe4Var3.n);
                            break;
                        case 8:
                            oi3Var.a(pe4Var3.q);
                            break;
                        case 9:
                            oi3Var.Q(pe4Var3.s);
                            break;
                        case 10:
                            oi3Var.G(pe4Var3.z);
                            break;
                        case 11:
                            pf4 pf4Var = pe4Var3.u;
                            oi3Var.T(pf4Var.a, pf4Var.b);
                            break;
                        case 12:
                            oi3Var.s(pe4Var3.o);
                            break;
                        case 13:
                            oi3Var.C(pe4Var3.t, false);
                            break;
                        case 14:
                            oi3Var.K(pe4Var3.r.a);
                            oi3Var.e(pe4Var3.r);
                            break;
                        case 15:
                            oi3Var.h(pe4Var3.v);
                            break;
                        case WaveRetry.MAX_FAILURES /* 16 */:
                            oi3Var.O(pe4Var3.a);
                            break;
                        case 17:
                            oi3Var.P(pe4Var3.f);
                            break;
                        case 18:
                            PlaybackException playbackException4 = pe4Var3.f;
                            String str = f35.a;
                            oi3Var.S(playbackException4);
                            break;
                        case 19:
                            oi3Var.o(pe4Var3.m);
                            break;
                        case 20:
                            oi3Var.A(pe4Var3.x);
                            break;
                        case 21:
                            oi3Var.F(pe4Var3.y);
                            break;
                        case 22:
                            oi3Var.L(pe4Var3.d, pe4Var3.b);
                            break;
                        case 23:
                            oi3Var.v(pe4Var3.d);
                            break;
                        case 24:
                            oi3Var.r(pe4Var3.c, pe4Var3.b);
                            break;
                        default:
                            oi3Var.g(pe4Var3.e);
                            break;
                    }
                }
            });
        }
        tc2Var.b();
    }

    @Override // defpackage.qi3
    public final void E(int i, boolean z) {
        F1();
        if (C1(34)) {
            kf2.o("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
        }
    }

    @Override // defpackage.qi3
    public final cw4 E0() {
        F1();
        return this.h.m;
    }

    public final void E1(ic2 ic2Var, go4 go4Var, boolean z, boolean z2) {
        boolean zIsDone = ic2Var.isDone();
        HashSet hashSet = this.f;
        if (zIsDone && hashSet.isEmpty()) {
            D1(i1(), z, z2);
            return;
        }
        hashSet.add(ic2Var);
        D1(f1((pe4) go4Var.get()), z, z2);
        ic2Var.f(new ur2(21, this, ic2Var), new h41(3, this));
    }

    @Override // defpackage.qi3
    public final hp0 F() {
        F1();
        return this.h.s;
    }

    @Override // defpackage.qi3
    public final long F0() {
        F1();
        pe4 pe4Var = this.h;
        long j = pe4Var.F.n;
        bu4 bu4Var = this.b;
        long jH1 = h1(j, pe4Var, bu4Var);
        pe4 pe4Var2 = this.h;
        return Math.max(jH1, h1(pe4Var2.D.get(), pe4Var2, bu4Var));
    }

    public final void F1() {
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.d;
        if (threadCurrentThread == looper.getThread()) {
            if (this.h == null) {
                this.h = i1();
            }
        } else {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = f35.a;
            Locale locale = Locale.US;
            kf2.o(f34.h("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\n"));
        }
    }

    @Override // defpackage.qi3
    public final void G() {
        F1();
        if (C1(26)) {
            kf2.o("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
        }
    }

    @Override // defpackage.qi3
    public final void G0(int i) {
        F1();
        if (C1(25)) {
            kf2.o("Missing implementation to handle COMMAND_SET_DEVICE_VOLUME or COMMAND_SET_DEVICE_VOLUME_WITH_FLAGS");
        }
    }

    @Override // defpackage.qi3
    public final void H(int i, int i2) {
        F1();
        if (C1(33)) {
            kf2.o("Missing implementation to handle COMMAND_SET_DEVICE_VOLUME or COMMAND_SET_DEVICE_VOLUME_WITH_FLAGS");
        }
    }

    @Override // defpackage.qi3
    public final void J(int i) {
        F1();
        if (C1(34)) {
            kf2.o("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
        }
    }

    @Override // defpackage.qi3
    public final int K() {
        F1();
        return this.h.C;
    }

    @Override // defpackage.qi3
    public final do2 K0() {
        F1();
        return this.h.y;
    }

    @Override // defpackage.qi3
    public final void L(final int i, int i2, final List list) {
        F1();
        rr2.l(i >= 0 && i <= i2);
        final pe4 pe4Var = this.h;
        int iO = pe4Var.w.o();
        if (!C1(20) || i > iO) {
            return;
        }
        final int iMin = Math.min(i2, iO);
        E1(q1(i, iMin, list), new go4() { // from class: be4
            @Override // defpackage.go4
            public final Object get() {
                int i3;
                qe4 qe4Var = this.n;
                zt4 zt4Var = qe4Var.g;
                bu4 bu4Var = qe4Var.b;
                pe4 pe4Var2 = pe4Var;
                ArrayList arrayListZ0 = qe4.Z0(pe4Var2, zt4Var, bu4Var);
                int i4 = 0;
                while (true) {
                    List list2 = list;
                    int size = list2.size();
                    i3 = iMin;
                    if (i4 >= size) {
                        break;
                    }
                    arrayListZ0.add(i3 + i4, qe4.e1((gn2) list2.get(i4)));
                    i4++;
                }
                pe4 pe4VarJ1 = !pe4Var2.w.p() ? qe4.j1(pe4Var2, arrayListZ0, zt4Var, bu4Var) : qe4.k1(pe4Var2, arrayListZ0, pe4Var2.A, pe4Var2.D.get(), qe4Var.b);
                int i5 = i;
                if (i5 >= i3) {
                    return pe4VarJ1;
                }
                f35.X(arrayListZ0, i5, i3);
                return qe4.j1(pe4VarJ1, arrayListZ0, zt4Var, bu4Var);
            }
        }, false, false);
    }

    @Override // defpackage.qi3
    public final void L0(List list) {
        F1();
        B1(list, -1, -9223372036854775807L);
    }

    @Override // defpackage.qi3
    public final void M(cw4 cw4Var) {
        F1();
        if (C1(29)) {
            kf2.o("Missing implementation to handle COMMAND_SET_TRACK_SELECTION_PARAMETERS");
        }
    }

    @Override // defpackage.qi3
    public final long M0() {
        F1();
        return k() ? this.h.E.n : Z();
    }

    @Override // defpackage.qi3
    public final void N0(final List list, int i) {
        F1();
        rr2.l(i >= 0);
        final pe4 pe4Var = this.h;
        int iO = pe4Var.w.o();
        if (!C1(20) || list.isEmpty()) {
            return;
        }
        final int iMin = Math.min(i, iO);
        E1(l1(list, iMin), new go4() { // from class: ce4
            @Override // defpackage.go4
            public final Object get() {
                qe4 qe4Var = this.n;
                zt4 zt4Var = qe4Var.g;
                bu4 bu4Var = qe4Var.b;
                pe4 pe4Var2 = pe4Var;
                ArrayList arrayListZ0 = qe4.Z0(pe4Var2, zt4Var, bu4Var);
                int i2 = 0;
                while (true) {
                    List list2 = list;
                    if (i2 >= list2.size()) {
                        break;
                    }
                    arrayListZ0.add(iMin + i2, qe4.e1((gn2) list2.get(i2)));
                    i2++;
                }
                return !pe4Var2.w.p() ? qe4.j1(pe4Var2, arrayListZ0, zt4Var, bu4Var) : qe4.k1(pe4Var2, arrayListZ0, pe4Var2.A, pe4Var2.D.get(), qe4Var.b);
            }
        }, false, false);
    }

    @Override // defpackage.qi3
    public final long O0() {
        F1();
        return this.h.i;
    }

    @Override // defpackage.qi3
    public final void P(final int i, int i2) {
        final int iMin;
        F1();
        rr2.l(i >= 0 && i2 >= i);
        final pe4 pe4Var = this.h;
        int iO = pe4Var.w.o();
        if (!C1(20) || iO == 0 || i >= iO || i == (iMin = Math.min(i2, iO))) {
            return;
        }
        E1(p1(i, iMin), new go4() { // from class: fe4
            @Override // defpackage.go4
            public final Object get() {
                qe4 qe4Var = this.n;
                zt4 zt4Var = qe4Var.g;
                bu4 bu4Var = qe4Var.b;
                pe4 pe4Var2 = pe4Var;
                ArrayList arrayListZ0 = qe4.Z0(pe4Var2, zt4Var, bu4Var);
                f35.X(arrayListZ0, i, iMin);
                return qe4.j1(pe4Var2, arrayListZ0, zt4Var, bu4Var);
            }
        }, false, false);
    }

    @Override // defpackage.qi3
    public final void Q(SurfaceHolder surfaceHolder) {
        F1();
        if (C1(27)) {
            if (surfaceHolder != null) {
                kf2.o("Missing implementation to handle COMMAND_SET_VIDEO_SURFACE");
                return;
            }
            F1();
            if (C1(27)) {
                kf2.o("Missing implementation to handle COMMAND_SET_VIDEO_SURFACE");
            }
        }
    }

    @Override // defpackage.qi3
    public final void R(float f) {
        F1();
        pe4 pe4Var = this.h;
        if (C1(24)) {
            ic2 ic2VarX1 = x1(f);
            boolean zIsDone = ic2VarX1.isDone();
            HashSet hashSet = this.f;
            if (zIsDone && hashSet.isEmpty()) {
                D1(i1(), false, false);
                return;
            }
            hashSet.add(ic2VarX1);
            oe4 oe4VarA = pe4Var.a();
            oe4VarA.c(f);
            D1(f1(new pe4(oe4VarA)), false, false);
            ic2VarX1.f(new ur2(21, this, ic2VarX1), new h41(3, this));
        }
    }

    @Override // defpackage.qi3
    public final void T(List list, int i, long j) {
        F1();
        if (i == -1) {
            pe4 pe4Var = this.h;
            int i2 = pe4Var.A;
            long j2 = pe4Var.D.get();
            i = i2;
            j = j2;
        }
        B1(list, i, j);
    }

    @Override // defpackage.qi3
    public final PlaybackException U() {
        F1();
        return this.h.f;
    }

    @Override // defpackage.qi3
    public final Looper U0() {
        return this.d;
    }

    @Override // defpackage.qi3
    public final void V(boolean z) {
        F1();
        pe4 pe4Var = this.h;
        if (C1(1)) {
            ic2 ic2VarT1 = t1(z);
            boolean zIsDone = ic2VarT1.isDone();
            HashSet hashSet = this.f;
            if (zIsDone && hashSet.isEmpty()) {
                D1(i1(), false, false);
                return;
            }
            hashSet.add(ic2VarT1);
            oe4 oe4VarA = pe4Var.a();
            oe4VarA.b = z;
            oe4VarA.c = 1;
            D1(f1(new pe4(oe4VarA)), false, false);
            ic2VarT1.f(new ur2(21, this, ic2VarT1), new h41(3, this));
        }
    }

    @Override // defpackage.qi3
    public final long X() {
        F1();
        return this.h.j;
    }

    @Override // defpackage.fq
    public final void X0(final int i, int i2, final long j, boolean z) {
        F1();
        rr2.l(i == -1 || i >= 0);
        final pe4 pe4Var = this.h;
        if (C1(i2)) {
            final boolean z2 = i == -1 || k() || (!pe4Var.w.p() && i >= pe4Var.w.o());
            E1(r1(i, i2, j), new go4() { // from class: ee4
                @Override // defpackage.go4
                public final Object get() {
                    boolean z3 = z2;
                    pe4 pe4Var2 = pe4Var;
                    if (z3) {
                        return pe4Var2;
                    }
                    return qe4.k1(pe4Var2, null, i, j, this.n.b);
                }
            }, !z2, z);
        }
    }

    @Override // defpackage.qi3
    public final long Z() {
        F1();
        pe4 pe4Var = this.h;
        return h1(pe4Var.D.get(), pe4Var, this.b);
    }

    @Override // defpackage.qi3
    public final void a0() {
        F1();
        pe4 pe4Var = this.h;
        if (C1(24) && this.h.o == 0.0f) {
            ic2 ic2VarX1 = x1(pe4Var.p);
            boolean zIsDone = ic2VarX1.isDone();
            HashSet hashSet = this.f;
            if (zIsDone && hashSet.isEmpty()) {
                D1(i1(), false, false);
                return;
            }
            hashSet.add(ic2VarX1);
            oe4 oe4VarA = pe4Var.a();
            oe4VarA.c(pe4Var.p);
            D1(f1(new pe4(oe4VarA)), false, false);
            ic2VarX1.f(new ur2(21, this, ic2VarX1), new h41(3, this));
        }
    }

    @Override // defpackage.qi3
    public final void b() {
        F1();
        pe4 pe4Var = this.h;
        if (C1(2)) {
            E1(n1(), new sl(5, pe4Var), false, false);
        }
    }

    @Override // defpackage.qi3
    public final long b0() {
        F1();
        if (!k()) {
            return F0();
        }
        pe4 pe4Var = this.h;
        return Math.max(pe4Var.G.n, pe4Var.E.n);
    }

    @Override // defpackage.qi3
    public final void d(qh3 qh3Var) {
        F1();
        pe4 pe4Var = this.h;
        if (C1(13)) {
            ic2 ic2VarU1 = u1(qh3Var);
            boolean zIsDone = ic2VarU1.isDone();
            HashSet hashSet = this.f;
            if (zIsDone && hashSet.isEmpty()) {
                D1(i1(), false, false);
                return;
            }
            hashSet.add(ic2VarU1);
            oe4 oe4VarA = pe4Var.a();
            oe4VarA.l = qh3Var;
            D1(f1(new pe4(oe4VarA)), false, false);
            ic2VarU1.f(new ur2(21, this, ic2VarU1), new h41(3, this));
        }
    }

    @Override // defpackage.qi3
    public final void d0(int i) {
        F1();
        if (C1(34)) {
            kf2.o("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
        }
    }

    @Override // defpackage.qi3
    public final jw4 e0() {
        F1();
        return this.h.x;
    }

    @Override // defpackage.qi3
    public final boolean f() {
        F1();
        this.h.getClass();
        return false;
    }

    public pe4 f1(pe4 pe4Var) {
        return pe4Var;
    }

    @Override // defpackage.qi3
    public final int g() {
        F1();
        return this.h.d;
    }

    @Override // defpackage.qi3
    public final do2 g0() {
        F1();
        return this.h.z;
    }

    @Override // defpackage.qi3
    public final long getDuration() {
        F1();
        if (!k()) {
            return x();
        }
        cu4 cu4Var = this.h.w;
        int iY = y();
        zt4 zt4Var = this.g;
        cu4Var.f(iY, zt4Var, false);
        pe4 pe4Var = this.h;
        return f35.i0(zt4Var.a(pe4Var.B, pe4Var.C));
    }

    @Override // defpackage.qi3
    public final int h() {
        F1();
        return this.h.g;
    }

    @Override // defpackage.qi3
    public final qh3 i() {
        F1();
        return this.h.l;
    }

    @Override // defpackage.qi3
    public final jg0 i0() {
        F1();
        return this.h.r;
    }

    public abstract pe4 i1();

    @Override // defpackage.qi3
    public final int j() {
        F1();
        return this.h.t;
    }

    @Override // defpackage.qi3
    public final boolean k() {
        F1();
        return this.h.B != -1;
    }

    @Override // defpackage.qi3
    public final void k0(il ilVar, boolean z) {
        F1();
        if (C1(35)) {
            kf2.o("Missing implementation to handle COMMAND_SET_AUDIO_ATTRIBUTES");
        }
    }

    @Override // defpackage.qi3
    public final void l0(do2 do2Var) {
        F1();
        if (C1(19)) {
            kf2.o("Missing implementation to handle COMMAND_SET_PLAYLIST_METADATA");
        }
    }

    public ic2 l1(List list, int i) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    @Override // defpackage.qi3
    public final long m() {
        F1();
        return this.h.H.n;
    }

    public ic2 m1(int i, int i2, int i3) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    @Override // defpackage.qi3
    public final int n0() {
        F1();
        return this.h.B;
    }

    public ic2 n1() {
        throw new IllegalStateException("Missing implementation to handle COMMAND_PREPARE");
    }

    @Override // defpackage.qi3
    public final mi3 o() {
        F1();
        return this.h.a;
    }

    @Override // defpackage.qi3
    public final int o0() {
        F1();
        int i = this.h.A;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    public ic2 o1() {
        throw new IllegalStateException("Missing implementation to handle COMMAND_RELEASE");
    }

    @Override // defpackage.qi3
    public final void p0(int i) {
        F1();
        pe4 pe4Var = this.h;
        if (C1(15)) {
            ic2 ic2VarV1 = v1(i);
            boolean zIsDone = ic2VarV1.isDone();
            HashSet hashSet = this.f;
            if (zIsDone && hashSet.isEmpty()) {
                D1(i1(), false, false);
                return;
            }
            hashSet.add(ic2VarV1);
            oe4 oe4VarA = pe4Var.a();
            oe4VarA.g = i;
            D1(f1(new pe4(oe4VarA)), false, false);
            ic2VarV1.f(new ur2(21, this, ic2VarV1), new h41(3, this));
        }
    }

    public ic2 p1(int i, int i2) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    @Override // defpackage.qi3
    public final boolean q() {
        F1();
        return this.h.b;
    }

    @Override // defpackage.qi3
    public final void q0(boolean z) {
        F1();
        if (C1(26)) {
            kf2.o("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
        }
    }

    public ic2 q1(int i, int i2, List list) {
        ic2 ic2VarL1 = l1(list, i2);
        return i == i2 ? ic2VarL1 : f35.h0(ic2VarL1, new ss2(15, p1(i, i2)));
    }

    @Override // defpackage.qi3
    public final void r0(oi3 oi3Var) {
        F1();
        this.c.e(oi3Var);
    }

    public abstract ic2 r1(int i, int i2, long j);

    @Override // defpackage.qi3
    public final void s(boolean z) {
        F1();
        pe4 pe4Var = this.h;
        if (C1(14)) {
            ic2 ic2VarW1 = w1(z);
            boolean zIsDone = ic2VarW1.isDone();
            HashSet hashSet = this.f;
            if (zIsDone && hashSet.isEmpty()) {
                D1(i1(), false, false);
                return;
            }
            hashSet.add(ic2VarW1);
            oe4 oe4VarA = pe4Var.a();
            oe4VarA.h = z;
            D1(f1(new pe4(oe4VarA)), false, false);
            ic2VarW1.f(new ur2(21, this, ic2VarW1), new h41(3, this));
        }
    }

    public ic2 s1(List list, int i, long j) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_MEDIA_ITEM(S)");
    }

    @Override // defpackage.qi3
    public final void stop() {
        F1();
        pe4 pe4Var = this.h;
        if (C1(3)) {
            E1(y1(), new bm0(1, this, pe4Var), false, false);
        }
    }

    public abstract ic2 t1(boolean z);

    @Override // defpackage.qi3
    public final long u() {
        F1();
        return this.h.k;
    }

    @Override // defpackage.qi3
    public final void u0(final int i, int i2, int i3) {
        F1();
        rr2.l(i >= 0 && i2 >= i && i3 >= 0);
        final pe4 pe4Var = this.h;
        int iO = pe4Var.w.o();
        if (!C1(20) || iO == 0 || i >= iO) {
            return;
        }
        final int iMin = Math.min(i2, iO);
        final int iMin2 = Math.min(i3, iO - (iMin - i));
        if (i == iMin || iMin2 == i) {
            return;
        }
        E1(m1(i, iMin, iMin2), new go4() { // from class: de4
            @Override // defpackage.go4
            public final Object get() {
                qe4 qe4Var = this.n;
                zt4 zt4Var = qe4Var.g;
                bu4 bu4Var = qe4Var.b;
                pe4 pe4Var2 = pe4Var;
                ArrayList arrayListZ0 = qe4.Z0(pe4Var2, zt4Var, bu4Var);
                f35.P(arrayListZ0, i, iMin, iMin2);
                return qe4.j1(pe4Var2, arrayListZ0, zt4Var, bu4Var);
            }
        }, false, false);
    }

    public ic2 u1(qh3 qh3Var) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_SPEED_AND_PITCH");
    }

    @Override // defpackage.qi3
    public final void v(oi3 oi3Var) {
        oi3Var.getClass();
        this.c.a(oi3Var);
    }

    @Override // defpackage.qi3
    public final int v0() {
        F1();
        return this.h.e;
    }

    public ic2 v1(int i) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_REPEAT_MODE");
    }

    public ic2 w1(boolean z) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_SHUFFLE_MODE");
    }

    @Override // defpackage.qi3
    public final cu4 x0() {
        F1();
        return this.h.w;
    }

    public ic2 x1(float f) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_VOLUME");
    }

    @Override // defpackage.qi3
    public final int y() {
        F1();
        return b1(this.h, this.g, this.b);
    }

    @Override // defpackage.qi3
    public final boolean y0() {
        F1();
        this.h.getClass();
        return false;
    }

    public ic2 y1() {
        throw new IllegalStateException("Missing implementation to handle COMMAND_STOP");
    }

    @Override // defpackage.qi3
    public final s55 z() {
        F1();
        return this.h.q;
    }
}
