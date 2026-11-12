package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pl0 extends jw3 {
    public static TimeInterpolator s;
    public boolean g;
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;
    public ArrayList k;
    public ArrayList l;
    public ArrayList m;
    public ArrayList n;
    public ArrayList o;
    public ArrayList p;
    public ArrayList q;
    public ArrayList r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((cx3) arrayList.get(size)).a.animate().cancel();
        }
    }

    @Override // defpackage.jw3
    public final boolean a(cx3 cx3Var, cx3 cx3Var2, n50 n50Var, n50 n50Var2) {
        int i;
        int i2;
        int i3 = n50Var.a;
        int i4 = n50Var.b;
        if (cx3Var2.q()) {
            int i5 = n50Var.a;
            i2 = n50Var.b;
            i = i5;
        } else {
            i = n50Var2.a;
            i2 = n50Var2.b;
        }
        if (cx3Var == cx3Var2) {
            return g(cx3Var, i3, i4, i, i2);
        }
        View view = cx3Var.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(cx3Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = cx3Var2.a;
        l(cx3Var2);
        view2.setTranslationX(-((int) ((i - i3) - translationX)));
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.k;
        nl0 nl0Var = new nl0();
        nl0Var.a = cx3Var;
        nl0Var.b = cx3Var2;
        nl0Var.c = i3;
        nl0Var.d = i4;
        nl0Var.e = i;
        nl0Var.f = i2;
        arrayList.add(nl0Var);
        return true;
    }

    @Override // defpackage.jw3
    public final void d(cx3 cx3Var) {
        ArrayList arrayList = this.l;
        ArrayList arrayList2 = this.m;
        ArrayList arrayList3 = this.n;
        View view = cx3Var.a;
        view.animate().cancel();
        ArrayList arrayList4 = this.j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((ol0) arrayList4.get(size)).a == cx3Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(cx3Var);
                arrayList4.remove(size);
            }
        }
        j(this.k, cx3Var);
        if (this.h.remove(cx3Var)) {
            view.setAlpha(1.0f);
            c(cx3Var);
        }
        if (this.i.remove(cx3Var)) {
            view.setAlpha(1.0f);
            c(cx3Var);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            j(arrayList5, cx3Var);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            for (int size4 = arrayList6.size() - 1; size4 >= 0; size4--) {
                if (((ol0) arrayList6.get(size4)).a == cx3Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(cx3Var);
                    arrayList6.remove(size4);
                    if (!arrayList6.isEmpty()) {
                        break;
                    }
                    arrayList2.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(cx3Var)) {
                view.setAlpha(1.0f);
                c(cx3Var);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.q.remove(cx3Var);
        this.o.remove(cx3Var);
        this.r.remove(cx3Var);
        this.p.remove(cx3Var);
        i();
    }

    @Override // defpackage.jw3
    public final void e() {
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.n;
        ArrayList arrayList3 = this.l;
        ArrayList arrayList4 = this.m;
        ArrayList arrayList5 = this.i;
        ArrayList arrayList6 = this.h;
        ArrayList arrayList7 = this.j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ol0 ol0Var = (ol0) arrayList7.get(size);
            View view = ol0Var.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(ol0Var.a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c((cx3) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            cx3 cx3Var = (cx3) arrayList5.get(size3);
            cx3Var.a.setAlpha(1.0f);
            c(cx3Var);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList.size() - 1; size4 >= 0; size4--) {
            nl0 nl0Var = (nl0) arrayList.get(size4);
            cx3 cx3Var2 = nl0Var.a;
            if (cx3Var2 != null) {
                k(nl0Var, cx3Var2);
            }
            cx3 cx3Var3 = nl0Var.b;
            if (cx3Var3 != null) {
                k(nl0Var, cx3Var3);
            }
        }
        arrayList.clear();
        if (f()) {
            for (int size5 = arrayList4.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList4.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    ol0 ol0Var2 = (ol0) arrayList8.get(size6);
                    View view2 = ol0Var2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(ol0Var2.a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList4.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList3.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList3.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    cx3 cx3Var4 = (cx3) arrayList9.get(size8);
                    cx3Var4.a.setAlpha(1.0f);
                    c(cx3Var4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList3.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList2.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList2.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    nl0 nl0Var2 = (nl0) arrayList10.get(size10);
                    cx3 cx3Var5 = nl0Var2.a;
                    if (cx3Var5 != null) {
                        k(nl0Var2, cx3Var5);
                    }
                    cx3 cx3Var6 = nl0Var2.b;
                    if (cx3Var6 != null) {
                        k(nl0Var2, cx3Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList2.remove(arrayList10);
                    }
                }
            }
            h(this.q);
            h(this.p);
            h(this.o);
            h(this.r);
            ArrayList arrayList11 = this.b;
            if (arrayList11.size() <= 0) {
                arrayList11.clear();
            } else {
                arrayList11.get(0).getClass();
                kf2.k();
            }
        }
    }

    @Override // defpackage.jw3
    public final boolean f() {
        return (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    public final boolean g(cx3 cx3Var, int i, int i2, int i3, int i4) {
        View view = cx3Var.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) cx3Var.a.getTranslationY());
        l(cx3Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(cx3Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.j;
        ol0 ol0Var = new ol0();
        ol0Var.a = cx3Var;
        ol0Var.b = translationX;
        ol0Var.c = translationY;
        ol0Var.d = i3;
        ol0Var.e = i4;
        arrayList.add(ol0Var);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            kf2.k();
        }
    }

    public final void j(ArrayList arrayList, cx3 cx3Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            nl0 nl0Var = (nl0) arrayList.get(size);
            if (k(nl0Var, cx3Var) && nl0Var.a == null && nl0Var.b == null) {
                arrayList.remove(nl0Var);
            }
        }
    }

    public final boolean k(nl0 nl0Var, cx3 cx3Var) {
        if (nl0Var.b == cx3Var) {
            nl0Var.b = null;
        } else {
            if (nl0Var.a != cx3Var) {
                return false;
            }
            nl0Var.a = null;
        }
        View view = cx3Var.a;
        View view2 = cx3Var.a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        c(cx3Var);
        return true;
    }

    public final void l(cx3 cx3Var) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        cx3Var.a.animate().setInterpolator(s);
        d(cx3Var);
    }
}
