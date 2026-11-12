package defpackage;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pj4 {
    public int a;
    public int b;
    public final kc1 c;
    public final ArrayList d;
    public final LinkedHashSet e;
    public boolean f;
    public boolean g;
    public final fe1 h;

    public pj4(int i, int i2, fe1 fe1Var, gz gzVar) {
        if (i == 0 || i2 == 0) {
            throw null;
        }
        kc1 kc1Var = fe1Var.c;
        kc1Var.getClass();
        if (i == 0 || i2 == 0) {
            throw null;
        }
        kc1Var.getClass();
        this.a = i;
        this.b = i2;
        this.c = kc1Var;
        this.d = new ArrayList();
        this.e = new LinkedHashSet();
        gzVar.a(new ss2(20, this));
        this.h = fe1Var;
    }

    public final void a() {
        LinkedHashSet linkedHashSet = this.e;
        if (this.f) {
            return;
        }
        this.f = true;
        if (linkedHashSet.isEmpty()) {
            b();
            return;
        }
        for (gz gzVar : new LinkedHashSet(linkedHashSet)) {
            synchronized (gzVar) {
                try {
                    if (!gzVar.a) {
                        gzVar.a = true;
                        gzVar.c = true;
                        fz fzVar = gzVar.b;
                        if (fzVar != null) {
                            try {
                                fzVar.onCancel();
                            } catch (Throwable th) {
                                synchronized (gzVar) {
                                    gzVar.c = false;
                                    gzVar.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (gzVar) {
                            gzVar.c = false;
                            gzVar.notifyAll();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void b() {
        if (!this.g) {
            if (ld1.I(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.g = true;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((Runnable) obj).run();
            }
        }
        this.h.k();
    }

    public final void c(int i, int i2) {
        if (i == 0 || i2 == 0) {
            throw null;
        }
        int iW = xa3.w(i2);
        kc1 kc1Var = this.c;
        if (iW == 0) {
            if (this.a != 1) {
                if (ld1.I(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + kc1Var + " mFinalState = " + f34.p(this.a) + " -> " + f34.p(i) + '.');
                }
                this.a = i;
                return;
            }
            return;
        }
        if (iW == 1) {
            if (this.a == 1) {
                if (ld1.I(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + kc1Var + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + f34.o(this.b) + " to ADDING.");
                }
                this.a = 2;
                this.b = 2;
                return;
            }
            return;
        }
        if (iW != 2) {
            return;
        }
        if (ld1.I(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + kc1Var + " mFinalState = " + f34.p(this.a) + " -> REMOVED. mLifecycleImpact  = " + f34.o(this.b) + " to REMOVING.");
        }
        this.a = 1;
        this.b = 3;
    }

    public final void d() {
        int i = this.b;
        fe1 fe1Var = this.h;
        if (i != 2) {
            if (i == 3) {
                kc1 kc1Var = fe1Var.c;
                kc1Var.getClass();
                View viewA0 = kc1Var.a0();
                if (ld1.I(2)) {
                    Log.v("FragmentManager", "Clearing focus " + viewA0.findFocus() + " on view " + viewA0 + " for Fragment " + kc1Var);
                }
                viewA0.clearFocus();
                return;
            }
            return;
        }
        kc1 kc1Var2 = fe1Var.c;
        kc1Var2.getClass();
        View viewFindFocus = kc1Var2.T.findFocus();
        if (viewFindFocus != null) {
            kc1Var2.k().k = viewFindFocus;
            if (ld1.I(2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + kc1Var2);
            }
        }
        View viewA1 = this.c.a0();
        if (viewA1.getParent() == null) {
            fe1Var.b();
            viewA1.setAlpha(0.0f);
        }
        if (viewA1.getAlpha() == 0.0f && viewA1.getVisibility() == 0) {
            viewA1.setVisibility(4);
        }
        hc1 hc1Var = kc1Var2.W;
        viewA1.setAlpha(hc1Var == null ? 1.0f : hc1Var.j);
    }

    public final String toString() {
        StringBuilder sbJ = xa3.j("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        sbJ.append(f34.p(this.a));
        sbJ.append(" lifecycleImpact = ");
        sbJ.append(f34.o(this.b));
        sbJ.append(" fragment = ");
        sbJ.append(this.c);
        sbJ.append('}');
        return sbJ.toString();
    }
}
