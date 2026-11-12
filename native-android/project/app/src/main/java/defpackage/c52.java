package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c52 implements kk1 {
    public ArrayList a;

    public c52(z40 z40Var) {
        p53 p53Var;
        z40Var.getClass();
        rr rrVar = new rr((xb0) z40Var.o, 0);
        rr rrVar2 = new rr((sr) z40Var.p);
        rr rrVar3 = new rr((xb0) z40Var.r, 4);
        xb0 xb0Var = (xb0) z40Var.q;
        rr rrVar4 = new rr(xb0Var, 2);
        rr rrVar5 = new rr(xb0Var, 3);
        n53 n53Var = new n53(xb0Var);
        m53 m53Var = new m53(xb0Var);
        if (Build.VERSION.SDK_INT >= 28) {
            Context context = (Context) z40Var.n;
            String str = lc5.a;
            context.getClass();
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            p53Var = new p53((ConnectivityManager) systemService);
        } else {
            p53Var = null;
        }
        this.a = ti.i0(new jb0[]{rrVar, rrVar2, rrVar3, rrVar4, rrVar5, n53Var, m53Var, p53Var});
    }

    public void a(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            b((String) obj);
        }
    }

    public void b(String str) {
        if (str == null) {
            kf2.n("category must not be null");
            return;
        }
        if (this.a == null) {
            this.a = new ArrayList();
        }
        if (this.a.contains(str)) {
            return;
        }
        this.a.add(str);
    }

    public boolean c(dd5 dd5Var) {
        ArrayList arrayList = this.a;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((jb0) obj).a(dd5Var)) {
                arrayList2.add(obj);
            }
        }
        if (!arrayList2.isEmpty()) {
            cx.f().b(lc5.a, "Work " + dd5Var.a + " constrained by " + q40.B0(arrayList2, null, null, null, k5.C, 31));
        }
        return arrayList2.isEmpty();
    }

    public rq2 d() {
        if (this.a == null) {
            return rq2.c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.a);
        return new rq2(bundle, this.a);
    }

    public synchronized ArrayList e(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            nw4 nw4Var = (nw4) obj;
            if ((nw4Var.a.isAssignableFrom(cls) && cls2.isAssignableFrom(nw4Var.b)) && !arrayList.contains(nw4Var.b)) {
                arrayList.add(nw4Var.b);
            }
        }
        return arrayList;
    }

    public p81 f(dd5 dd5Var) {
        dd5Var.getClass();
        ArrayList arrayList = this.a;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((jb0) obj).c(dd5Var)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(r40.k0(arrayList2, 10));
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            arrayList3.add(((jb0) obj2).b(dd5Var.j));
        }
        return ya4.m(new gc0(2, (p81[]) q40.Q0(arrayList3).toArray(new p81[0])));
    }

    @Override // defpackage.kk1
    public Object keyOf(Object obj) {
        return (String) obj;
    }

    @Override // defpackage.kk1
    public Iterator sourceIterator() {
        return this.a.iterator();
    }
}
