package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class jl0 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ ArrayList o;
    public final /* synthetic */ pl0 p;

    public /* synthetic */ jl0(pl0 pl0Var, ArrayList arrayList, int i) {
        this.n = i;
        this.p = pl0Var;
        this.o = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c;
        int i = this.n;
        int i2 = 0;
        ArrayList arrayList = this.o;
        switch (i) {
            case 0:
                int size = arrayList.size();
                while (true) {
                    pl0 pl0Var = this.p;
                    if (i2 >= size) {
                        arrayList.clear();
                        pl0Var.m.remove(arrayList);
                        break;
                    } else {
                        Object obj = arrayList.get(i2);
                        i2++;
                        ol0 ol0Var = (ol0) obj;
                        cx3 cx3Var = ol0Var.a;
                        int i3 = ol0Var.b;
                        int i4 = ol0Var.c;
                        int i5 = ol0Var.d;
                        int i6 = ol0Var.e;
                        pl0Var.getClass();
                        View view = cx3Var.a;
                        int i7 = i5 - i3;
                        int i8 = i6 - i4;
                        if (i7 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i8 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        pl0Var.p.add(cx3Var);
                        animate.setDuration(pl0Var.e).setListener(new ll0(pl0Var, cx3Var, i7, view, i8, animate)).start();
                    }
                }
            case 1:
                int size2 = arrayList.size();
                while (true) {
                    pl0 pl0Var2 = this.p;
                    if (i2 >= size2) {
                        arrayList.clear();
                        pl0Var2.n.remove(arrayList);
                        break;
                    } else {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        nl0 nl0Var = (nl0) obj2;
                        ArrayList arrayList2 = pl0Var2.r;
                        long j = pl0Var2.f;
                        cx3 cx3Var2 = nl0Var.a;
                        View view2 = cx3Var2 == null ? null : cx3Var2.a;
                        cx3 cx3Var3 = nl0Var.b;
                        View view3 = cx3Var3 != null ? cx3Var3.a : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j);
                            arrayList2.add(nl0Var.a);
                            duration.translationX(nl0Var.e - nl0Var.c);
                            duration.translationY(nl0Var.f - nl0Var.d);
                            duration.alpha(0.0f).setListener(new ml0(pl0Var2, nl0Var, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator animate2 = view3.animate();
                            arrayList2.add(nl0Var.b);
                            c = 0;
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new ml0(pl0Var2, nl0Var, animate2, view3, 1)).start();
                        } else {
                            c = 0;
                        }
                    }
                }
            default:
                int size3 = arrayList.size();
                while (true) {
                    pl0 pl0Var3 = this.p;
                    if (i2 >= size3) {
                        arrayList.clear();
                        pl0Var3.l.remove(arrayList);
                        break;
                    } else {
                        Object obj3 = arrayList.get(i2);
                        i2++;
                        cx3 cx3Var4 = (cx3) obj3;
                        pl0Var3.getClass();
                        View view4 = cx3Var4.a;
                        ViewPropertyAnimator animate3 = view4.animate();
                        pl0Var3.o.add(cx3Var4);
                        animate3.alpha(1.0f).setDuration(pl0Var3.c).setListener(new kl0(pl0Var3, cx3Var4, view4, animate3)).start();
                    }
                }
        }
    }
}
