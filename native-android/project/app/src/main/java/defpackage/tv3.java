package defpackage;

import android.util.Log;
import androidx.compose.runtime.ComposeRuntimeError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tv3 extends u80 {
    public final ed a;
    public final jv3 b;
    public final Object c;
    public s22 d;
    public Throwable e;
    public final ArrayList f;
    public List g;
    public x03 h;
    public final f13 i;
    public final ArrayList j;
    public final ArrayList k;
    public final w03 l;
    public final rf2 m;
    public final w03 n;
    public final w03 o;
    public ArrayList p;
    public x03 q;
    public cz r;
    public final nl4 s;
    public boolean t;
    public final nl4 u;
    public final z05 v;
    public final t22 w;
    public final ne0 x;
    public final hh3 y;
    public static final nl4 z = ya4.a(vf3.q);
    public static final AtomicReference A = new AtomicReference(Boolean.FALSE);

    public tv3(ne0 ne0Var) {
        ed edVar = new ed(new mv3(this, 0));
        this.a = edVar;
        mv3 mv3Var = new mv3(this, 1);
        jv3 jv3Var = new jv3();
        jv3Var.n = new fl(0);
        jv3Var.o = new z40();
        jv3Var.p = new fa(14, jv3Var, mv3Var);
        this.b = jv3Var;
        this.c = new Object();
        this.f = new ArrayList();
        this.h = new x03();
        this.i = new f13(new z80[16]);
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new w03();
        this.m = new rf2(16);
        this.n = new w03();
        this.o = new w03();
        this.s = ya4.a(null);
        this.u = ya4.a(ov3.p);
        this.v = new z05(9);
        t22 t22Var = new t22((s22) ne0Var.K(fz0.h0));
        t22Var.M(new kl3(2, this));
        this.w = t22Var;
        this.x = ne0Var.J(edVar).J(t22Var);
        this.y = new hh3(12);
    }

    public static final void G(ArrayList arrayList, tv3 tv3Var, z80 z80Var) {
        arrayList.clear();
        synchronized (tv3Var.c) {
            Iterator it = tv3Var.k.iterator();
            if (it.hasNext()) {
                ((jy2) it.next()).getClass();
                throw null;
            }
        }
    }

    public static void w(a13 a13Var) {
        try {
            if (a13Var.w() instanceof dh4) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
            a13Var.c();
        } catch (Throwable th) {
            a13Var.c();
            throw th;
        }
    }

    public final boolean A() {
        return this.i.p != 0 || z() || B() || this.l.e != 0;
    }

    public final boolean B() {
        return !this.t && (((fl) ((z40) this.b.o).p).get() & 134217727) > 0;
    }

    public final boolean C() {
        boolean z2;
        synchronized (this.c) {
            z2 = this.h.h() || this.i.p != 0 || z() || B();
        }
        return z2;
    }

    public final List D() {
        List list = this.g;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = this.f;
        List arrayList2 = arrayList.isEmpty() ? u01.n : new ArrayList(arrayList);
        this.g = arrayList2;
        return arrayList2;
    }

    public final void E() {
        az azVarY;
        synchronized (this.c) {
            azVarY = y();
            if (((ov3) this.u.getValue()).compareTo(ov3.o) <= 0) {
                Throwable th = this.e;
                CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                cancellationException.initCause(th);
                throw cancellationException;
            }
        }
        if (azVarY != null) {
            ((cz) azVarY).resumeWith(j15.a);
        }
    }

    public final void F(z80 z80Var) {
        synchronized (this.c) {
            ArrayList arrayList = this.k;
            if (arrayList.size() > 0) {
                ((jy2) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    public final List H(List list, x03 x03Var) {
        a13 a13VarC;
        ArrayList arrayList;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            ((jy2) obj).getClass();
            Object arrayList2 = map.get(null);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(null, arrayList2);
            }
            ((ArrayList) arrayList2).add(obj);
        }
        for (Map.Entry entry : map.entrySet()) {
            z80 z80Var = (z80) entry.getKey();
            List list2 = (List) entry.getValue();
            if (z80Var.I.F) {
                l80.a("Check failed");
            }
            kl3 kl3Var = new kl3(1, z80Var);
            o oVar = new o(25, z80Var, x03Var);
            ch4 ch4VarJ = jh4.j();
            a13 a13Var = ch4VarJ instanceof a13 ? (a13) ch4VarJ : null;
            if (a13Var == null || (a13VarC = a13Var.C(kl3Var, oVar)) == null) {
                kf2.o("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                ch4 ch4VarJ2 = a13VarC.j();
                try {
                    synchronized (this.c) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                jy2 jy2Var = (jy2) list2.get(i2);
                                w03 w03Var = this.l;
                                jy2Var.getClass();
                                Object objA = mz2.a(w03Var);
                                arrayList.add(new kd3(jy2Var, objA));
                            }
                            int size3 = arrayList.size();
                            for (int i3 = 0; i3 < size3; i3++) {
                                kd3 kd3Var = (kd3) arrayList.get(i3);
                                if (kd3Var.o == null) {
                                    rf2 rf2Var = this.m;
                                    ((jy2) kd3Var.n).getClass();
                                    if (((w03) rf2Var.n).b(null)) {
                                        ArrayList arrayList3 = new ArrayList(arrayList.size());
                                        int size4 = arrayList.size();
                                        for (int i4 = 0; i4 < size4; i4++) {
                                            kd3 kd3Var2 = (kd3) arrayList.get(i4);
                                            if (kd3Var2.o == null) {
                                                rf2 rf2Var2 = this.m;
                                                ((jy2) kd3Var2.n).getClass();
                                                w03 w03Var2 = (w03) rf2Var2.n;
                                                if (w03Var2.i()) {
                                                    ((w03) rf2Var2.o).a();
                                                }
                                            }
                                            arrayList3.add(kd3Var2);
                                        }
                                        arrayList = arrayList3;
                                        break;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    int size5 = arrayList.size();
                    for (int i5 = 0; i5 < size5; i5++) {
                        if (((kd3) arrayList.get(i5)).o != null) {
                            int size6 = arrayList.size();
                            for (int i6 = 0; i6 < size6; i6++) {
                                if (((kd3) arrayList.get(i6)).o == null) {
                                    ArrayList arrayList4 = new ArrayList(arrayList.size());
                                    int size7 = arrayList.size();
                                    for (int i7 = 0; i7 < size7; i7++) {
                                        kd3 kd3Var3 = (kd3) arrayList.get(i7);
                                        if (kd3Var3.o == null) {
                                        }
                                    }
                                    synchronized (this.c) {
                                        v40.n0(arrayList4, this.k);
                                    }
                                    ArrayList arrayList5 = new ArrayList(arrayList.size());
                                    int size8 = arrayList.size();
                                    for (int i8 = 0; i8 < size8; i8++) {
                                        Object obj2 = arrayList.get(i8);
                                        if (((kd3) obj2).o != null) {
                                            arrayList5.add(obj2);
                                        }
                                    }
                                    arrayList = arrayList5;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    z80Var.r(arrayList);
                    ch4.q(ch4VarJ2);
                    w(a13VarC);
                } catch (Throwable th2) {
                    ch4.q(ch4VarJ2);
                    throw th2;
                }
            } catch (Throwable th3) {
                w(a13VarC);
                throw th3;
            }
        }
        return q40.Q0(map.keySet());
    }

    public final z80 I(z80 z80Var, x03 x03Var) {
        a13 a13VarC;
        if (z80Var.I.F || z80Var.J == 3) {
            return null;
        }
        x03 x03Var2 = this.q;
        int i = 1;
        if (x03Var2 == null || !x03Var2.c(z80Var)) {
            kl3 kl3Var = new kl3(i, z80Var);
            o oVar = new o(25, z80Var, x03Var);
            ch4 ch4VarJ = jh4.j();
            a13 a13Var = ch4VarJ instanceof a13 ? (a13) ch4VarJ : null;
            if (a13Var == null || (a13VarC = a13Var.C(kl3Var, oVar)) == null) {
                kf2.o("Cannot create a mutable snapshot of an read-only snapshot");
            } else {
                try {
                    ch4 ch4VarJ2 = a13VarC.j();
                    if (x03Var != null) {
                        try {
                            if (x03Var.h()) {
                                fa faVar = new fa(15, x03Var, z80Var);
                                rg1 rg1Var = z80Var.I;
                                if (rg1Var.F) {
                                    l80.a("Preparing a composition while composing is not supported");
                                }
                                rg1Var.F = true;
                                try {
                                    faVar.invoke();
                                    rg1Var.F = false;
                                } catch (Throwable th) {
                                    rg1Var.F = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            ch4.q(ch4VarJ2);
                            throw th2;
                        }
                    }
                    boolean zW = z80Var.w();
                    ch4.q(ch4VarJ2);
                    w(a13VarC);
                    if (zW) {
                        return z80Var;
                    }
                } catch (Throwable th3) {
                    w(a13VarC);
                    throw th3;
                }
            }
        }
        return null;
    }

    public final void J(Throwable th, z80 z80Var) throws Throwable {
        if (!((Boolean) A.get()).booleanValue() || (th instanceof ComposeRuntimeError)) {
            synchronized (this.c) {
                Log.e("ComposeInternal", "Error was captured in composition.", th);
                nv3 nv3Var = (nv3) this.s.getValue();
                if (nv3Var != null) {
                    throw nv3Var.a;
                }
                nl4 nl4Var = this.s;
                nv3 nv3Var2 = new nv3(th);
                nl4Var.getClass();
                nl4Var.j(null, nv3Var2);
            }
            throw th;
        }
        synchronized (this.c) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.j.clear();
                this.i.g();
                this.h = new x03();
                this.k.clear();
                this.l.a();
                this.n.a();
                nl4 nl4Var2 = this.s;
                nv3 nv3Var3 = new nv3(th);
                nl4Var2.getClass();
                nl4Var2.j(null, nv3Var3);
                if (z80Var != null) {
                    L(z80Var);
                }
                if (y() != null) {
                    l80.a("expected to go to inactive state due to composition error");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean K() {
        boolean zA;
        synchronized (this.c) {
            if (this.h.g()) {
                return A();
            }
            List listD = D();
            x54 x54Var = new x54(this.h);
            this.h = new x03();
            try {
                int size = listD.size();
                for (int i = 0; i < size; i++) {
                    ((z80) listD.get(i)).x(x54Var);
                    if (((ov3) this.u.getValue()).compareTo(ov3.o) <= 0) {
                        break;
                    }
                }
                synchronized (this.c) {
                    if (y() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zA = A();
                }
                return zA;
            } catch (Throwable th) {
                synchronized (this.c) {
                    x03 x03Var = this.h;
                    x03Var.getClass();
                    Iterator<E> it = x54Var.iterator();
                    while (it.hasNext()) {
                        x03Var.k(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void L(z80 z80Var) {
        ArrayList arrayList = this.p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.p = arrayList;
        }
        if (!arrayList.contains(z80Var)) {
            arrayList.add(z80Var);
        }
        if (this.f.remove(z80Var)) {
            this.g = null;
        }
    }

    @Override // defpackage.u80
    public final void a(z80 z80Var, wf1 wf1Var) throws Throwable {
        ov3 ov3Var;
        int i;
        boolean z2;
        a13 a13VarC;
        boolean z3 = z80Var.I.F;
        synchronized (this.c) {
            ov3 ov3Var2 = (ov3) this.u.getValue();
            ov3Var = ov3.o;
            i = 1;
            z2 = ov3Var2.compareTo(ov3Var) > 0 ? !D().contains(z80Var) : true;
        }
        try {
            kl3 kl3Var = new kl3(i, z80Var);
            o oVar = new o(25, z80Var, null);
            ch4 ch4VarJ = jh4.j();
            a13 a13Var = ch4VarJ instanceof a13 ? (a13) ch4VarJ : null;
            if (a13Var == null || (a13VarC = a13Var.C(kl3Var, oVar)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                ch4 ch4VarJ2 = a13VarC.j();
                try {
                    z80Var.j(wf1Var);
                    ch4.q(ch4VarJ2);
                    w(a13VarC);
                    synchronized (this.c) {
                        if (((ov3) this.u.getValue()).compareTo(ov3Var) > 0 && !D().contains(z80Var)) {
                            this.f.add(z80Var);
                            this.g = null;
                        }
                    }
                    if (!z3) {
                        jh4.j().m();
                    }
                    try {
                        F(z80Var);
                        try {
                            z80Var.d();
                            z80Var.f();
                            if (z3) {
                                return;
                            }
                            jh4.j().m();
                        } catch (Throwable th) {
                            J(th, null);
                        }
                    } catch (Throwable th2) {
                        J(th2, z80Var);
                    }
                } catch (Throwable th3) {
                    ch4.q(ch4VarJ2);
                    throw th3;
                }
            } catch (Throwable th4) {
                w(a13VarC);
                throw th4;
            }
        } catch (Throwable th5) {
            if (z2) {
                synchronized (this.c) {
                }
            }
            J(th5, z80Var);
        }
    }

    @Override // defpackage.u80
    public final x03 b(z80 z80Var, md4 md4Var, wf1 wf1Var) {
        z05 z05Var = this.v;
        try {
            md4 md4Var2 = z80Var.C;
            z80Var.C = md4Var;
            try {
                a(z80Var, wf1Var);
                x03 x03Var = (x03) z05Var.f();
                if (x03Var == null) {
                    x03Var = w54.a;
                    x03Var.getClass();
                }
                z80Var.C = md4Var2;
                z05Var.n(null);
                return x03Var;
            } catch (Throwable th) {
                z80Var.C = md4Var2;
                throw th;
            }
        } catch (Throwable th2) {
            z05Var.n(null);
            throw th2;
        }
    }

    @Override // defpackage.u80
    public final boolean d() {
        return ((Boolean) A.get()).booleanValue();
    }

    @Override // defpackage.u80
    public final boolean e() {
        return false;
    }

    @Override // defpackage.u80
    public final boolean f() {
        return false;
    }

    @Override // defpackage.u80
    public final long g() {
        return 1000L;
    }

    @Override // defpackage.u80
    public final t80 h() {
        return null;
    }

    @Override // defpackage.u80
    public final ne0 j() {
        return this.x;
    }

    @Override // defpackage.u80
    public final boolean k() {
        return false;
    }

    @Override // defpackage.u80
    public final void l(z80 z80Var) {
        az azVarY;
        synchronized (this.c) {
            if (this.i.h(z80Var)) {
                azVarY = null;
            } else {
                this.i.b(z80Var);
                azVarY = y();
            }
        }
        if (azVarY != null) {
            ((cz) azVarY).resumeWith(j15.a);
        }
    }

    @Override // defpackage.u80
    public final iy2 m(jy2 jy2Var) {
        iy2 iy2Var;
        synchronized (this.c) {
            iy2Var = (iy2) this.n.j(jy2Var);
        }
        return iy2Var;
    }

    @Override // defpackage.u80
    public final x03 n(z80 z80Var, md4 md4Var, x03 x03Var) {
        z05 z05Var = this.v;
        try {
            K();
            z80Var.x(new x54(x03Var));
            md4 md4Var2 = z80Var.C;
            z80Var.C = md4Var;
            try {
                z80 z80VarI = I(z80Var, null);
                if (z80VarI != null) {
                    F(z80Var);
                    z80VarI.d();
                    z80VarI.f();
                }
                x03 x03Var2 = (x03) z05Var.f();
                if (x03Var2 == null) {
                    x03Var2 = w54.a;
                    x03Var2.getClass();
                }
                z80Var.C = md4Var2;
                z05Var.n(null);
                return x03Var2;
            } catch (Throwable th) {
                z80Var.C = md4Var2;
                throw th;
            }
        } catch (Throwable th2) {
            z05Var.n(null);
            throw th2;
        }
    }

    @Override // defpackage.u80
    public final void o(Set set) {
    }

    @Override // defpackage.u80
    public final void q(lv3 lv3Var) {
        z05 z05Var = this.v;
        x03 x03Var = (x03) z05Var.f();
        if (x03Var == null) {
            x03 x03Var2 = w54.a;
            x03Var = new x03();
            z05Var.n(x03Var);
        }
        x03Var.a(lv3Var);
    }

    @Override // defpackage.u80
    public final void r(z80 z80Var) {
        synchronized (this.c) {
            try {
                x03 x03Var = this.q;
                if (x03Var == null) {
                    x03 x03Var2 = w54.a;
                    x03Var = new x03();
                    this.q = x03Var;
                }
                x03Var.a(z80Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.u80
    public final ez s(wc wcVar) {
        jv3 jv3Var = this.b;
        z40 z40Var = (z40) jv3Var.o;
        w53 w53Var = new w53();
        w53Var.a = wcVar;
        return z40Var.a(w53Var, (fa) jv3Var.p);
    }

    @Override // defpackage.u80
    public final void v(z80 z80Var) {
        synchronized (this.c) {
            if (this.f.remove(z80Var)) {
                this.g = null;
            }
            this.i.j(z80Var);
            this.j.remove(z80Var);
        }
    }

    public final void x() {
        synchronized (this.c) {
            if (((ov3) this.u.getValue()).compareTo(ov3.r) >= 0) {
                nl4 nl4Var = this.u;
                ov3 ov3Var = ov3.o;
                nl4Var.getClass();
                nl4Var.j(null, ov3Var);
            }
        }
        this.w.f(null);
    }

    public final az y() {
        nl4 nl4Var = this.u;
        int iCompareTo = ((ov3) nl4Var.getValue()).compareTo(ov3.o);
        nl4 nl4Var2 = this.s;
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.j;
        f13 f13Var = this.i;
        if (iCompareTo > 0) {
            Object value = nl4Var2.getValue();
            ov3 ov3Var = ov3.s;
            ov3 ov3Var2 = ov3.p;
            if (value == null) {
                if (this.d == null) {
                    this.h = new x03();
                    f13Var.g();
                    if (z() || B()) {
                        ov3Var2 = ov3.q;
                    }
                } else {
                    ov3Var2 = (f13Var.p == 0 && !this.h.h() && arrayList2.isEmpty() && arrayList.isEmpty() && !z() && !B() && this.l.e == 0) ? ov3.r : ov3Var;
                }
            }
            nl4Var.j(null, ov3Var2);
            if (ov3Var2 != ov3Var) {
                return null;
            }
            cz czVar = this.r;
            this.r = null;
            return czVar;
        }
        List listD = D();
        int size = listD.size();
        for (int i = 0; i < size; i++) {
        }
        this.f.clear();
        this.g = u01.n;
        this.h = new x03();
        f13Var.g();
        arrayList2.clear();
        arrayList.clear();
        this.p = null;
        cz czVar2 = this.r;
        if (czVar2 != null) {
            czVar2.r(null);
        }
        this.r = null;
        nl4Var2.i(null);
        return null;
    }

    public final boolean z() {
        return !this.t && (((fl) ((z40) this.a.p).p).get() & 134217727) > 0;
    }
}
