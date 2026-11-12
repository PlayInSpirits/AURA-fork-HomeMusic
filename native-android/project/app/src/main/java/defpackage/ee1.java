package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ee1 extends dw3 {
    public final ea2 q;
    public final ld1 r;
    public final xe2 s;
    public final xe2 t;
    public final xe2 u;
    public de1 v;
    public final zh0 w;
    public boolean x;
    public boolean y;

    public ee1(ld1 ld1Var, ea2 ea2Var) {
        Object obj = null;
        this.s = new xe2(obj);
        this.t = new xe2(obj);
        this.u = new xe2(obj);
        zh0 zh0Var = new zh0(26);
        zh0Var.o = new CopyOnWriteArrayList();
        this.w = zh0Var;
        this.x = false;
        this.y = false;
        this.r = ld1Var;
        this.q = ea2Var;
        o(true);
    }

    public static void p(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            kf2.o("Design assumption violated.");
            return;
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    @Override // defpackage.dw3
    public final long b(int i) {
        return i;
    }

    @Override // defpackage.dw3
    public final void f(RecyclerView recyclerView) {
        if (this.v != null) {
            nz2.c();
            return;
        }
        de1 de1Var = new de1(this);
        this.v = de1Var;
        ViewPager2 viewPager2A = de1.a(recyclerView);
        de1Var.d = viewPager2A;
        q80 q80Var = new q80(1, de1Var);
        de1Var.a = q80Var;
        ((ArrayList) viewPager2A.p.b).add(q80Var);
        ce1 ce1Var = new ce1(0, de1Var);
        de1Var.b = ce1Var;
        this.n.registerObserver(ce1Var);
        vv3 vv3Var = new vv3(5, de1Var);
        de1Var.c = vv3Var;
        this.q.a(vv3Var);
    }

    @Override // defpackage.dw3
    public final void g(cx3 cx3Var, int i) {
        Bundle bundle;
        ke1 ke1Var = (ke1) cx3Var;
        long j = ke1Var.e;
        FrameLayout frameLayout = (FrameLayout) ke1Var.a;
        int id = frameLayout.getId();
        Long lT = t(id);
        xe2 xe2Var = this.u;
        if (lT != null && lT.longValue() != j) {
            v(lT.longValue());
            xe2Var.g(lT.longValue());
        }
        xe2Var.f(j, Integer.valueOf(id));
        long j2 = i;
        xe2 xe2Var2 = this.s;
        if (xe2Var2.c(j2) < 0) {
            kc1 kc1VarR = r(i);
            jc1 jc1Var = (jc1) this.t.b(j2);
            if (kc1VarR.F != null) {
                kf2.o("Fragment already added");
                return;
            }
            if (jc1Var == null || (bundle = jc1Var.n) == null) {
                bundle = null;
            }
            kc1VarR.o = bundle;
            xe2Var2.f(j2, kc1VarR);
        }
        WeakHashMap weakHashMap = j65.a;
        if (frameLayout.isAttachedToWindow()) {
            u(ke1Var);
        }
        s();
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup viewGroup, int i) {
        int i2 = ke1.u;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WeakHashMap weakHashMap = j65.a;
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new ke1(frameLayout);
    }

    @Override // defpackage.dw3
    public final void j(RecyclerView recyclerView) {
        de1 de1Var = this.v;
        de1Var.getClass();
        ViewPager2 viewPager2A = de1.a(recyclerView);
        ((ArrayList) viewPager2A.p.b).remove(de1Var.a);
        ee1 ee1Var = de1Var.f;
        ee1Var.n.unregisterObserver(de1Var.b);
        ee1Var.q.f(de1Var.c);
        de1Var.d = null;
        this.v = null;
    }

    @Override // defpackage.dw3
    public final /* bridge */ /* synthetic */ boolean k(cx3 cx3Var) {
        return true;
    }

    @Override // defpackage.dw3
    public final void l(cx3 cx3Var) {
        u((ke1) cx3Var);
        s();
    }

    @Override // defpackage.dw3
    public final void n(cx3 cx3Var) {
        Long lT = t(((FrameLayout) ((ke1) cx3Var).a).getId());
        if (lT != null) {
            v(lT.longValue());
            this.u.g(lT.longValue());
        }
    }

    public final boolean q(long j) {
        return j >= 0 && j < ((long) a());
    }

    public abstract kc1 r(int i);

    public final void s() {
        xe2 xe2Var;
        xe2 xe2Var2;
        kc1 kc1Var;
        View view;
        if (!this.y || this.r.N()) {
            return;
        }
        qi qiVar = new qi(0);
        int i = 0;
        while (true) {
            xe2Var = this.s;
            int iH = xe2Var.h();
            xe2Var2 = this.u;
            if (i >= iH) {
                break;
            }
            long jE = xe2Var.e(i);
            if (!q(jE)) {
                qiVar.add(Long.valueOf(jE));
                xe2Var2.g(jE);
            }
            i++;
        }
        if (!this.x) {
            this.y = false;
            for (int i2 = 0; i2 < xe2Var.h(); i2++) {
                long jE2 = xe2Var.e(i2);
                if (xe2Var2.c(jE2) < 0 && ((kc1Var = (kc1) xe2Var.b(jE2)) == null || (view = kc1Var.T) == null || view.getParent() == null)) {
                    qiVar.add(Long.valueOf(jE2));
                }
            }
        }
        ki kiVar = new ki(qiVar);
        while (kiVar.hasNext()) {
            v(((Long) kiVar.next()).longValue());
        }
    }

    public final Long t(int i) {
        int i2 = 0;
        Long lValueOf = null;
        while (true) {
            xe2 xe2Var = this.u;
            if (i2 >= xe2Var.h()) {
                return lValueOf;
            }
            if (((Integer) xe2Var.i(i2)).intValue() == i) {
                if (lValueOf != null) {
                    kf2.o("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                    return null;
                }
                lValueOf = Long.valueOf(xe2Var.e(i2));
            }
            i2++;
        }
    }

    public final void u(ke1 ke1Var) {
        kc1 kc1Var = (kc1) this.s.b(ke1Var.e);
        if (kc1Var == null) {
            kf2.o("Design assumption violated.");
            return;
        }
        FrameLayout frameLayout = (FrameLayout) ke1Var.a;
        View view = kc1Var.T;
        if (!kc1Var.y() && view != null) {
            kf2.o("Design assumption violated.");
            return;
        }
        boolean zY = kc1Var.y();
        ld1 ld1Var = this.r;
        if (zY && view == null) {
            ((CopyOnWriteArrayList) ld1Var.n.n).add(new yc1(new rf2(this, kc1Var, frameLayout)));
            return;
        }
        if (kc1Var.y() && view.getParent() != null) {
            if (view.getParent() != frameLayout) {
                p(view, frameLayout);
                return;
            }
            return;
        }
        if (kc1Var.y()) {
            p(view, frameLayout);
            return;
        }
        if (ld1Var.N()) {
            if (ld1Var.I) {
                return;
            }
            this.q.a(new tl0(this, ke1Var));
            return;
        }
        ((CopyOnWriteArrayList) ld1Var.n.n).add(new yc1(new rf2(this, kc1Var, frameLayout)));
        zh0 zh0Var = this.w;
        zh0Var.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((CopyOnWriteArrayList) zh0Var.o).iterator();
        if (it.hasNext()) {
            throw xa3.d(it);
        }
        try {
            kc1Var.e0(false);
            po poVar = new po(ld1Var);
            poVar.g(0, kc1Var, "f" + ke1Var.e, 1);
            poVar.k(kc1Var, r92.q);
            poVar.f();
            this.v.b(false);
        } finally {
            zh0.B(arrayList);
        }
    }

    public final void v(long j) {
        ViewParent parent;
        xe2 xe2Var = this.s;
        kc1 kc1Var = (kc1) xe2Var.b(j);
        if (kc1Var == null) {
            return;
        }
        View view = kc1Var.T;
        if (view != null && (parent = view.getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        boolean zQ = q(j);
        xe2 xe2Var2 = this.t;
        if (!zQ) {
            xe2Var2.g(j);
        }
        if (!kc1Var.y()) {
            xe2Var.g(j);
            return;
        }
        ld1 ld1Var = this.r;
        if (ld1Var.N()) {
            this.y = true;
            return;
        }
        boolean zY = kc1Var.y();
        zh0 zh0Var = this.w;
        if (zY && q(j)) {
            zh0Var.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = ((CopyOnWriteArrayList) zh0Var.o).iterator();
            if (it.hasNext()) {
                throw xa3.d(it);
            }
            fe1 fe1Var = (fe1) ((HashMap) ld1Var.c.o).get(kc1Var.r);
            if (fe1Var != null) {
                kc1 kc1Var2 = fe1Var.c;
                kc1Var2.getClass();
                if (kc1Var2 == kc1Var) {
                    jc1 jc1Var = kc1Var2.n > -1 ? new jc1(fe1Var.o()) : null;
                    zh0.B(arrayList);
                    xe2Var2.f(j, jc1Var);
                }
            }
            ld1Var.g0(new IllegalStateException(b11.l("Fragment ", kc1Var, " is not currently in the FragmentManager")));
            throw null;
        }
        zh0Var.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ((CopyOnWriteArrayList) zh0Var.o).iterator();
        if (it2.hasNext()) {
            throw xa3.d(it2);
        }
        try {
            po poVar = new po(ld1Var);
            poVar.i(kc1Var);
            poVar.f();
            xe2Var.g(j);
        } finally {
            zh0.B(arrayList2);
        }
    }
}
