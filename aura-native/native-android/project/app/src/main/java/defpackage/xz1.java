package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xz1 extends ma5 implements Runnable, r83, View.OnAttachStateChangeListener {
    public boolean p;
    public int q;
    public pb5 r;
    public final w03 s;
    public final wd3 t;
    public final q03 u;
    public final rh4 v;

    public xz1() {
        super(1);
        w03 w03Var = new w03(9);
        wb5.a.getClass();
        w03Var.l(vb5.b, new jc5("caption bar"));
        w03Var.l(vb5.c, new jc5("display cutout"));
        w03Var.l(vb5.d, new jc5("ime"));
        w03Var.l(vb5.e, new jc5("mandatory system gestures"));
        w03Var.l(vb5.f, new jc5("navigation bars"));
        w03Var.l(vb5.g, new jc5("status bars"));
        w03Var.l(vb5.h, new jc5("system gestures"));
        w03Var.l(vb5.i, new jc5("tappable element"));
        w03Var.l(vb5.j, new jc5("waterfall"));
        this.s = w03Var;
        this.t = new wd3(0);
        this.u = new q03(4);
        this.v = new rh4();
    }

    @Override // defpackage.ma5
    public final void a(ta5 ta5Var) {
        boolean z = false;
        this.p = false;
        int iD = ta5Var.a.d();
        this.q &= ~iD;
        this.r = null;
        wb5 wb5Var = (wb5) yb5.a.b(iD);
        if (wb5Var != null) {
            Object objG = this.s.g(wb5Var);
            objG.getClass();
            jc5 jc5Var = (jc5) objG;
            jc5Var.c.h(0.0f);
            jc5Var.e.h(1.0f);
            jc5Var.d.g(0L);
            jc5Var.c.h(0.0f);
            jc5Var.b.setValue(Boolean.FALSE);
            jc5Var.j = -1L;
            jc5Var.k = -1L;
            wd3 wd3Var = this.t;
            wd3Var.h(wd3Var.g() + 1);
            synchronized (jh4.c) {
                x03 x03Var = jh4.j.h;
                if (x03Var != null && x03Var.h()) {
                    z = true;
                }
            }
            if (z) {
                jh4.a();
            }
        }
    }

    @Override // defpackage.ma5
    public final void b(ta5 ta5Var) {
        this.p = true;
    }

    @Override // defpackage.ma5
    public final pb5 c(pb5 pb5Var, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ta5 ta5Var = (ta5) list.get(i);
            wb5 wb5Var = (wb5) yb5.a.b(ta5Var.a.d());
            if (wb5Var != null) {
                Object objG = this.s.g(wb5Var);
                objG.getClass();
                jc5 jc5Var = (jc5) objG;
                if (((Boolean) jc5Var.b.getValue()).booleanValue()) {
                    sa5 sa5Var = ta5Var.a;
                    jc5Var.c.h(sa5Var.c());
                    jc5Var.e.h(sa5Var.a());
                    jc5Var.d.g(sa5Var.b());
                }
            }
        }
        e(pb5Var);
        return pb5Var;
    }

    @Override // defpackage.ma5
    public final qr2 d(ta5 ta5Var, qr2 qr2Var) {
        pb5 pb5Var = this.r;
        boolean z = false;
        this.p = false;
        this.r = null;
        if (ta5Var.a.b() > 0 && pb5Var != null) {
            int iD = ta5Var.a.d();
            this.q |= iD;
            wb5 wb5Var = (wb5) yb5.a.b(iD);
            if (wb5Var != null) {
                Object objG = this.s.g(wb5Var);
                objG.getClass();
                jc5 jc5Var = (jc5) objG;
                vz1 vz1VarH = pb5Var.a.h(iD);
                long j = (((long) vz1VarH.a) << 48) | (((long) vz1VarH.b) << 32) | (((long) vz1VarH.c) << 16) | ((long) vz1VarH.d);
                long j2 = jc5Var.h;
                if (!te5.o(j, j2)) {
                    jc5Var.j = j2;
                    jc5Var.k = j;
                    jc5Var.b.setValue(Boolean.TRUE);
                    sa5 sa5Var = ta5Var.a;
                    jc5Var.c.h(sa5Var.c());
                    jc5Var.e.h(sa5Var.a());
                    jc5Var.d.g(sa5Var.b());
                    wd3 wd3Var = this.t;
                    wd3Var.h(wd3Var.g() + 1);
                    synchronized (jh4.c) {
                        x03 x03Var = jh4.j.h;
                        if (x03Var != null && x03Var.h()) {
                            z = true;
                        }
                    }
                    if (z) {
                        jh4.a();
                        return qr2Var;
                    }
                }
            }
        }
        return qr2Var;
    }

    public final void e(pb5 pb5Var) {
        char c;
        char c2;
        boolean z;
        char c3;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        boolean z5;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        Object[] objArr2;
        int i;
        i03 i03Var = yb5.a;
        int[] iArr2 = i03Var.b;
        Object[] objArr3 = i03Var.c;
        long[] jArr2 = i03Var.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            z2 = false;
            z3 = false;
            c = 16;
            c2 = ' ';
            while (true) {
                long j2 = jArr2[i2];
                z = true;
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    c3 = '0';
                    while (i5 < i4) {
                        if ((j2 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr2[i6];
                            wb5 wb5Var = (wb5) objArr3[i6];
                            vz1 vz1VarH = pb5Var.a.h(i7);
                            long j3 = (((long) vz1VarH.a) << 48) | (((long) vz1VarH.b) << 32) | (((long) vz1VarH.c) << 16) | ((long) vz1VarH.d);
                            Object objG = this.s.g(wb5Var);
                            objG.getClass();
                            jc5 jc5Var = (jc5) objG;
                            if (!te5.o(j3, jc5Var.h)) {
                                jc5Var.h = j3;
                                z2 = true;
                                if (!te5.o(j3, 0L)) {
                                    z3 = true;
                                }
                            }
                            if (i7 != 8) {
                                vz1 vz1VarI = pb5Var.a.i(i7);
                                objArr2 = objArr3;
                                long j4 = (((long) vz1VarI.b) << 32) | (((long) vz1VarI.a) << 48) | (((long) vz1VarI.c) << 16) | ((long) vz1VarI.d);
                                if (!te5.o(jc5Var.i, j4)) {
                                    jc5Var.i = j4;
                                    z2 = true;
                                    if (!te5.o(j4, 0L)) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            jc5Var.a.setValue(Boolean.valueOf(pb5Var.a.t(i7)));
                            i = 8;
                        } else {
                            objArr2 = objArr3;
                            i = i3;
                        }
                        j2 >>= i;
                        i5++;
                        i3 = i;
                        objArr3 = objArr2;
                        jArr2 = jArr2;
                        iArr2 = iArr2;
                    }
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr3;
                    c3 = '0';
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                objArr3 = objArr;
                jArr2 = jArr;
                iArr2 = iArr;
            }
        } else {
            c = 16;
            c2 = ' ';
            z = true;
            c3 = '0';
            z2 = false;
            z3 = false;
        }
        tr0 tr0VarG = pb5Var.a.g();
        if (tr0VarG == null) {
            j = 0;
        } else {
            vz1 vz1VarC = Build.VERSION.SDK_INT >= 30 ? vz1.c(p3.d(tr0VarG.a)) : vz1.e;
            j = (((long) vz1VarC.a) << c3) | (((long) vz1VarC.b) << c2) | (((long) vz1VarC.c) << c) | ((long) vz1VarC.d);
        }
        w03 w03Var = this.s;
        wb5.a.getClass();
        Object objG2 = w03Var.g(vb5.j);
        objG2.getClass();
        jc5 jc5Var2 = (jc5) objG2;
        jc5Var2.a.setValue(Boolean.valueOf(!te5.o(j, 0L)));
        if (!te5.o(jc5Var2.h, j)) {
            jc5Var2.h = j;
            jc5Var2.i = j;
            z2 = z;
            if (!te5.o(j, 0L)) {
                z3 = z2;
            }
        }
        if (tr0VarG == null) {
            q03 q03Var = this.u;
            if (q03Var.b > 0) {
                q03Var.d();
                this.v.clear();
                z2 = z;
            }
        } else {
            List listC = Build.VERSION.SDK_INT >= 28 ? ne.c(tr0VarG.a) : Collections.EMPTY_LIST;
            int size = listC.size();
            q03 q03Var2 = this.u;
            if (size < q03Var2.b) {
                q03Var2.l(listC.size(), this.u.b);
                this.v.e(listC.size(), this.v.size());
                z2 = z;
            } else {
                int size2 = listC.size() - this.u.b;
                int i8 = 0;
                while (i8 < size2) {
                    q03 q03Var3 = this.u;
                    q03Var3.a(uc5.B(listC.get(q03Var3.b)));
                    this.v.add(new jz1(f34.f(this.u.b, "display cutout rect ")));
                    i8++;
                    z2 = z;
                }
            }
            int size3 = listC.size();
            for (int i9 = 0; i9 < size3; i9++) {
                Rect rect = (Rect) listC.get(i9);
                b13 b13Var = (b13) this.u.f(i9);
                if (!h12.c(b13Var.getValue(), rect)) {
                    b13Var.setValue(rect);
                    z2 = z;
                }
            }
            if (!listC.isEmpty()) {
                z3 = z;
            }
        }
        if ((z3 || this.t.g() != 0) && z2) {
            wd3 wd3Var = this.t;
            wd3Var.h(wd3Var.g() + 1);
            synchronized (jh4.c) {
                x03 x03Var = jh4.j.h;
                z4 = (x03Var == null || x03Var.h() != (z5 = z)) ? false : z5;
            }
            if (z4) {
                jh4.a();
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = j65.a;
        a65.c(view, this);
        j65.q(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = j65.a;
        a65.c(view, null);
        j65.q(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.p) {
            this.q = 0;
            this.p = false;
            pb5 pb5Var = this.r;
            if (pb5Var != null) {
                e(pb5Var);
                this.r = null;
            }
        }
    }

    @Override // defpackage.r83
    public final pb5 x(View view, pb5 pb5Var) {
        if (this.p) {
            this.r = pb5Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return pb5Var;
            }
        } else if (this.q == 0) {
            e(pb5Var);
        }
        return pb5Var;
    }
}
