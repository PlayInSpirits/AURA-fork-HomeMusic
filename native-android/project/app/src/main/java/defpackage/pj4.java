package defpackage;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
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

    public pj4(int r3, int r4, fe1 r5, gz r6) {
        if (r3 == 0) goto L13;
        if (r4 == 0) goto L12;
        kc1 r1 = r5.c;
        r1.getClass();
        if (r3 == 0) goto L11;
        if (r4 == 0) goto L10;
        r1.getClass();
        this.a = r3;
        this.b = r4;
        this.c = r1;
        this.d = new ArrayList();
        this.e = new LinkedHashSet();
        r6.a(new ss2(20, this));
        this.h = r5;
        return;
    L10:
        throw null;
    L11:
        throw null;
    L12:
        throw null;
    L13:
        throw null;
    }

    public final void a() {
        LinkedHashSet r0 = this.e;
        if (this.f == true) goto L43;
        this.f = true;
        if (r0.isEmpty() == false) goto L9;
        b();
        return;
    L9:
        Iterator r4 = new LinkedHashSet(r0).iterator();
    L11:
        if (r4.hasNext() == false) goto L58;
        gz r1 = (gz) r4.next();
        monitor-enter(r1);
        if (r1.a == true) goto L16;
        r1.a = true;     // Catch: Throwable -> L18
        r1.c = true;     // Catch: Throwable -> L18
        fz r2 = r1.b;     // Catch: Throwable -> L18
        monitor-exit(r1);     // Catch: Throwable -> L18
        if (r2 != null) goto L44;
    L34:
        monitor-enter(r1);
        r1.c = false;     // Catch: Throwable -> L38
        r1.notifyAll();     // Catch: Throwable -> L38
        monitor-exit(r1);     // Catch: Throwable -> L38
    L38:
        th = move-exception;
        throw th;
    L44:
        r2.onCancel();     // Catch: Throwable -> L26
    L26:
        th = move-exception;
        monitor-enter(r1);
        r1.c = false;     // Catch: Throwable -> L31
        r1.notifyAll();     // Catch: Throwable -> L31
        throw th;
    L31:
        th = move-exception;
        throw th;
    L16:
        monitor-exit(r1);     // Catch: Throwable -> L18
    L18:
        th = move-exception;
        throw th;
    L58:
        return;
    }

    public final void b() {
        if (this.g == false) goto L6;
    L11:
        this.h.k();
        return;
    L6:
        if (ld1.I(2) == false) goto L8;
        Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
    L8:
        this.g = true;
        ArrayList r0 = this.d;
        int r1 = r0.size();
        int r2 = 0;
    L9:
        if (r2 >= r1) goto L11;
        Object r3 = r0.get(r2);
        r2 = r2 + 1;
        ((Runnable) r3).run();
        goto L9
    }

    public final void c(int r7, int r8) {
        if (r7 == 0) goto L30;
        if (r8 == 0) goto L29;
        int r9 = xa3.w(r8);
        kc1 r1 = this.c;
        if (r9 == 0) goto L23;
        if (r9 == 1) goto L16;
        if (r9 == 2) goto L11;
        return;
    L11:
        if (ld1.I(2) == false) goto L13;
        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + r1 + " mFinalState = " + f34.p(this.a) + " -> REMOVED. mLifecycleImpact  = " + f34.o(this.b) + " to REMOVING.");
    L13:
        this.a = 1;
        this.b = 3;
        return;
    L16:
        if (this.a == 1) goto L18;
        return;
    L18:
        if (ld1.I(2) == false) goto L20;
        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + r1 + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + f34.o(this.b) + " to ADDING.");
    L20:
        this.a = 2;
        this.b = 2;
        return;
    L23:
        if (this.a != 1) goto L25;
        return;
    L25:
        if (ld1.I(2) == false) goto L27;
        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + r1 + " mFinalState = " + f34.p(this.a) + " -> " + f34.p(r7) + '.');
    L27:
        this.a = r7;
        return;
    L29:
        throw null;
    L30:
        throw null;
    }

    public final void d() {
        int r0 = this.b;
        fe1 r4 = this.h;
        if (r0 != 2) goto L24;
        kc1 r1 = r4.c;
        r1.getClass();
        View r5 = r1.T.findFocus();
        if (r5 == null) goto L9;
        r1.k().k = r5;
        if (ld1.I(2) == false) goto L9;
        Log.v("FragmentManager", "requestFocus: Saved focused view " + r5 + " for Fragment " + r1);
    L9:
        View r7 = this.c.a0();
        if (r7.getParent() != null) goto L13;
        r4.b();
        r7.setAlpha(0.0f);
    L13:
        if (r7.getAlpha() == 0.0f) goto L15;
    L17:
        hc1 r2 = r1.W;
        if (r2 != null) goto L20;
        float r3 = 1.0f;
    L21:
        r7.setAlpha(r3);
        return;
    L20:
        r3 = r2.j;
        goto L21
    L15:
        if (r7.getVisibility() != 0) goto L17;
        r7.setVisibility(4);
        goto L17
    L24:
        if (r0 != 3) goto L30;
        kc1 r8 = r4.c;
        r8.getClass();
        View r6 = r8.a0();
        if (ld1.I(2) == false) goto L28;
        Log.v("FragmentManager", "Clearing focus " + r6.findFocus() + " on view " + r6 + " for Fragment " + r8);
    L28:
        r6.clearFocus();
        return;
    }

    public final String toString() {
        StringBuilder r0 = xa3.j("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        r0.append(f34.p(this.a));
        r0.append(" lifecycleImpact = ");
        r0.append(f34.o(this.b));
        r0.append(" fragment = ");
        r0.append(this.c);
        r0.append('}');
        return r0.toString();
    }
}
