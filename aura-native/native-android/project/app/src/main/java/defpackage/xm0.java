package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import app.homemusic.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xm0 {
    public final ViewGroup a;
    public final ArrayList b;
    public final ArrayList c;
    public boolean d;
    public boolean e;

    public xm0(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.a = viewGroup;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public static final xm0 f(ViewGroup viewGroup, ld1 ld1Var) {
        viewGroup.getClass();
        ld1Var.getClass();
        ld1Var.G().getClass();
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof xm0) {
            return (xm0) tag;
        }
        xm0 xm0Var = new xm0(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, xm0Var);
        return xm0Var;
    }

    public final void a(int i, int i2, fe1 fe1Var) {
        synchronized (this.b) {
            gz gzVar = new gz();
            kc1 kc1Var = fe1Var.c;
            kc1Var.getClass();
            pj4 pj4VarD = d(kc1Var);
            if (pj4VarD != null) {
                pj4VarD.c(i, i2);
                return;
            }
            final pj4 pj4Var = new pj4(i, i2, fe1Var, gzVar);
            this.b.add(pj4Var);
            final int i3 = 0;
            pj4Var.d.add(new Runnable(this) { // from class: oj4
                public final /* synthetic */ xm0 o;

                {
                    this.o = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = i3;
                    pj4 pj4Var2 = pj4Var;
                    xm0 xm0Var = this.o;
                    switch (i4) {
                        case 0:
                            if (xm0Var.b.contains(pj4Var2)) {
                                int i5 = pj4Var2.a;
                                View view = pj4Var2.c.T;
                                view.getClass();
                                f34.a(view, i5);
                            }
                            break;
                        default:
                            xm0Var.b.remove(pj4Var2);
                            xm0Var.c.remove(pj4Var2);
                            break;
                    }
                }
            });
            final int i4 = 1;
            pj4Var.d.add(new Runnable(this) { // from class: oj4
                public final /* synthetic */ xm0 o;

                {
                    this.o = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i5 = i4;
                    pj4 pj4Var2 = pj4Var;
                    xm0 xm0Var = this.o;
                    switch (i5) {
                        case 0:
                            if (xm0Var.b.contains(pj4Var2)) {
                                int i6 = pj4Var2.a;
                                View view = pj4Var2.c.T;
                                view.getClass();
                                f34.a(view, i6);
                            }
                            break;
                        default:
                            xm0Var.b.remove(pj4Var2);
                            xm0Var.c.remove(pj4Var2);
                            break;
                    }
                }
            });
        }
    }

    public final void b(ArrayList arrayList, boolean z) {
        Object obj;
        Object obj2;
        ArrayList arrayList2;
        int i;
        xm0 xm0Var = this;
        ArrayList arrayList3 = arrayList;
        int size = arrayList3.size();
        int i2 = 0;
        while (true) {
            obj = null;
            if (i2 >= size) {
                obj2 = null;
                break;
            }
            obj2 = arrayList3.get(i2);
            i2++;
            pj4 pj4Var = (pj4) obj2;
            View view = pj4Var.c.T;
            view.getClass();
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility != 0) {
                    if (visibility != 4 && visibility != 8) {
                        kf2.n(f34.f(visibility, "Unknown visibility "));
                        return;
                    }
                } else if (pj4Var.a != 2) {
                    break;
                }
            }
        }
        pj4 pj4Var2 = (pj4) obj2;
        ListIterator listIterator = arrayList3.listIterator(arrayList3.size());
        while (listIterator.hasPrevious()) {
            Object objPrevious = listIterator.previous();
            pj4 pj4Var3 = (pj4) objPrevious;
            View view2 = pj4Var3.c.T;
            view2.getClass();
            if (view2.getAlpha() != 0.0f || view2.getVisibility() != 0) {
                int visibility2 = view2.getVisibility();
                if (visibility2 == 0) {
                    continue;
                } else if (visibility2 != 4 && visibility2 != 8) {
                    kf2.n(f34.f(visibility2, "Unknown visibility "));
                    return;
                }
            }
            if (pj4Var3.a == 2) {
                obj = objPrevious;
                break;
            }
        }
        pj4 pj4Var4 = (pj4) obj;
        if (ld1.I(2)) {
            Log.v("FragmentManager", "Executing operations from " + pj4Var2 + " to " + pj4Var4);
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList(arrayList3);
        kc1 kc1Var = ((pj4) q40.C0(arrayList3)).c;
        int size2 = arrayList3.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj3 = arrayList3.get(i3);
            i3++;
            hc1 hc1Var = ((pj4) obj3).c.W;
            hc1 hc1Var2 = kc1Var.W;
            hc1Var.b = hc1Var2.b;
            hc1Var.c = hc1Var2.c;
            hc1Var.d = hc1Var2.d;
            hc1Var.e = hc1Var2.e;
        }
        int size3 = arrayList3.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj4 = arrayList3.get(i4);
            i4++;
            pj4 pj4Var5 = (pj4) obj4;
            gz gzVar = new gz();
            pj4Var5.d();
            LinkedHashSet linkedHashSet = pj4Var5.e;
            linkedHashSet.add(gzVar);
            arrayList4.add(new tm0(pj4Var5, gzVar, z));
            gz gzVar2 = new gz();
            pj4Var5.d();
            linkedHashSet.add(gzVar2);
            boolean z2 = !z ? pj4Var5 != pj4Var4 : pj4Var5 != pj4Var2;
            kc1 kc1Var2 = pj4Var5.c;
            um0 um0Var = new um0(pj4Var5, gzVar2);
            if (pj4Var5.a == 2) {
                if (z) {
                    hc1 hc1Var3 = kc1Var2.W;
                } else {
                    kc1Var2.getClass();
                }
            } else if (z) {
                hc1 hc1Var4 = kc1Var2.W;
            } else {
                kc1Var2.getClass();
            }
            if (pj4Var5.a == 2) {
                if (z) {
                    hc1 hc1Var5 = kc1Var2.W;
                } else {
                    hc1 hc1Var6 = kc1Var2.W;
                }
            }
            if (z2) {
                if (z) {
                    hc1 hc1Var7 = kc1Var2.W;
                } else {
                    kc1Var2.getClass();
                }
            }
            arrayList5.add(um0Var);
            pj4Var5.d.add(new k6(arrayList6, pj4Var5, xm0Var));
            arrayList3 = arrayList;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList7 = new ArrayList();
        int size4 = arrayList5.size();
        int i5 = 0;
        while (i5 < size4) {
            Object obj5 = arrayList5.get(i5);
            i5++;
            if (!((um0) obj5).k()) {
                arrayList7.add(obj5);
            }
        }
        ArrayList arrayList8 = new ArrayList();
        int size5 = arrayList7.size();
        int i6 = 0;
        while (i6 < size5) {
            Object obj6 = arrayList7.get(i6);
            i6++;
            ((um0) obj6).getClass();
        }
        int size6 = arrayList8.size();
        int i7 = 0;
        while (i7 < size6) {
            Object obj7 = arrayList8.get(i7);
            i7++;
            ((um0) obj7).getClass();
        }
        int size7 = arrayList5.size();
        int i8 = 0;
        while (i8 < size7) {
            Object obj8 = arrayList5.get(i8);
            i8++;
            um0 um0Var2 = (um0) obj8;
            linkedHashMap.put((pj4) um0Var2.a, Boolean.FALSE);
            um0Var2.d();
        }
        boolean zContainsValue = linkedHashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup = xm0Var.a;
        Context context = viewGroup.getContext();
        ArrayList arrayList9 = new ArrayList();
        int size8 = arrayList4.size();
        int i9 = 0;
        boolean z3 = false;
        while (i9 < size8) {
            i9++;
            tm0 tm0Var = (tm0) arrayList4.get(i9);
            if (tm0Var.k()) {
                tm0Var.d();
            } else {
                context.getClass();
                xc5 xc5VarO = tm0Var.o(context);
                if (xc5VarO == null) {
                    tm0Var.d();
                } else {
                    Animator animator = (Animator) xc5VarO.p;
                    if (animator == null) {
                        arrayList9.add(tm0Var);
                    } else {
                        arrayList2 = arrayList9;
                        pj4 pj4Var6 = (pj4) tm0Var.a;
                        kc1 kc1Var3 = pj4Var6.c;
                        i = size8;
                        if (h12.c(linkedHashMap.get(pj4Var6), Boolean.TRUE)) {
                            if (ld1.I(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + kc1Var3 + " as this Fragment was involved in a Transition.");
                            }
                            tm0Var.d();
                            xm0Var = this;
                            arrayList9 = arrayList2;
                            size8 = i;
                        } else {
                            boolean z4 = pj4Var6.a == 3;
                            if (z4) {
                                arrayList6.remove(pj4Var6);
                            }
                            View view3 = kc1Var3.T;
                            viewGroup.startViewTransition(view3);
                            LinkedHashMap linkedHashMap2 = linkedHashMap;
                            ArrayList arrayList10 = arrayList4;
                            xm0Var = this;
                            animator.addListener(new vm0(xm0Var, view3, z4, pj4Var6, tm0Var));
                            animator.setTarget(view3);
                            animator.start();
                            if (ld1.I(2)) {
                                Log.v("FragmentManager", "Animator from operation " + pj4Var6 + " has started.");
                            }
                            ((gz) tm0Var.b).a(new ef0(3, animator, pj4Var6));
                            linkedHashMap = linkedHashMap2;
                            size8 = i;
                            arrayList9 = arrayList2;
                            arrayList4 = arrayList10;
                            z3 = true;
                        }
                    }
                }
            }
            arrayList2 = arrayList9;
            i = size8;
            xm0Var = this;
            arrayList9 = arrayList2;
            size8 = i;
        }
        ArrayList arrayList11 = arrayList9;
        int size9 = arrayList11.size();
        int i10 = 0;
        while (i10 < size9) {
            ArrayList arrayList12 = arrayList11;
            int i11 = i10 + 1;
            tm0 tm0Var2 = (tm0) arrayList12.get(i10);
            pj4 pj4Var7 = (pj4) tm0Var2.a;
            kc1 kc1Var4 = pj4Var7.c;
            if (zContainsValue) {
                if (ld1.I(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + kc1Var4 + " as Animations cannot run alongside Transitions.");
                }
                tm0Var2.d();
            } else {
                if (z3) {
                    if (ld1.I(2)) {
                        Log.v("FragmentManager", "Ignoring Animation set on " + kc1Var4 + " as Animations cannot run alongside Animators.");
                    }
                    tm0Var2.d();
                } else {
                    View view4 = kc1Var4.T;
                    context.getClass();
                    xc5 xc5VarO2 = tm0Var2.o(context);
                    if (xc5VarO2 == null) {
                        kf2.o("Required value was null.");
                        return;
                    }
                    Animation animation = (Animation) xc5VarO2.o;
                    if (animation == null) {
                        kf2.o("Required value was null.");
                        return;
                    }
                    int i12 = size9;
                    if (pj4Var7.a != 1) {
                        view4.startAnimation(animation);
                        tm0Var2.d();
                    } else {
                        viewGroup.startViewTransition(view4);
                        qc1 qc1Var = new qc1(animation, viewGroup, view4);
                        qc1Var.setAnimationListener(new wm0(pj4Var7, xm0Var, view4, tm0Var2));
                        view4.startAnimation(qc1Var);
                        if (ld1.I(2)) {
                            Log.v("FragmentManager", "Animation from operation " + pj4Var7 + " has started.");
                        }
                    }
                    arrayList11 = arrayList12;
                    ((gz) tm0Var2.b).a(new dg0(view4, this, tm0Var2, pj4Var7, 1));
                    xm0Var = this;
                    size9 = i12;
                }
                i10 = i11;
            }
            arrayList11 = arrayList12;
            i10 = i11;
        }
        int size10 = arrayList6.size();
        int i13 = 0;
        while (i13 < size10) {
            Object obj9 = arrayList6.get(i13);
            i13++;
            pj4 pj4Var8 = (pj4) obj9;
            View view5 = pj4Var8.c.T;
            int i14 = pj4Var8.a;
            view5.getClass();
            f34.a(view5, i14);
        }
        arrayList6.clear();
        if (ld1.I(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + pj4Var2 + " to " + pj4Var4);
        }
    }

    public final void c() {
        if (this.e) {
            return;
        }
        ViewGroup viewGroup = this.a;
        WeakHashMap weakHashMap = j65.a;
        if (!viewGroup.isAttachedToWindow()) {
            e();
            this.d = false;
            return;
        }
        synchronized (this.b) {
            try {
                if (!this.b.isEmpty()) {
                    ArrayList arrayListR0 = q40.R0(this.c);
                    this.c.clear();
                    int size = arrayListR0.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayListR0.get(i);
                        i++;
                        pj4 pj4Var = (pj4) obj;
                        if (ld1.I(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + pj4Var);
                        }
                        pj4Var.a();
                        if (!pj4Var.g) {
                            this.c.add(pj4Var);
                        }
                    }
                    g();
                    ArrayList arrayListR1 = q40.R0(this.b);
                    this.b.clear();
                    this.c.addAll(arrayListR1);
                    if (ld1.I(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    int size2 = arrayListR1.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = arrayListR1.get(i2);
                        i2++;
                        ((pj4) obj2).d();
                    }
                    b(arrayListR1, this.d);
                    this.d = false;
                    if (ld1.I(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final pj4 d(kc1 kc1Var) {
        Object obj;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            obj = arrayList.get(i);
            i++;
            pj4 pj4Var = (pj4) obj;
            if (h12.c(pj4Var.c, kc1Var) && !pj4Var.f) {
                return (pj4) obj;
            }
        }
        obj = null;
        return (pj4) obj;
    }

    public final void e() {
        String str;
        String str2;
        if (ld1.I(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.a;
        WeakHashMap weakHashMap = j65.a;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.b) {
            try {
                g();
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((pj4) obj).d();
                }
                ArrayList arrayListR0 = q40.R0(this.c);
                int size2 = arrayListR0.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayListR0.get(i3);
                    i3++;
                    pj4 pj4Var = (pj4) obj2;
                    if (ld1.I(2)) {
                        if (zIsAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + pj4Var);
                    }
                    pj4Var.a();
                }
                ArrayList arrayListR1 = q40.R0(this.b);
                int size3 = arrayListR1.size();
                while (i < size3) {
                    Object obj3 = arrayListR1.get(i);
                    i++;
                    pj4 pj4Var2 = (pj4) obj3;
                    if (ld1.I(2)) {
                        if (zIsAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + pj4Var2);
                    }
                    pj4Var2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            pj4 pj4Var = (pj4) obj;
            int i2 = 2;
            if (pj4Var.b == 2) {
                int visibility = pj4Var.c.a0().getVisibility();
                if (visibility != 0) {
                    i2 = 4;
                    if (visibility != 4) {
                        if (visibility != 8) {
                            kf2.n(f34.f(visibility, "Unknown visibility "));
                            return;
                        }
                        i2 = 3;
                    }
                }
                pj4Var.c(i2, 1);
            }
        }
    }
}
