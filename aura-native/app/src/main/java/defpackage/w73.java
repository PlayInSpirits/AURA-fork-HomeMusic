package defpackage;

import com.google.gson.reflect.TypeToken;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class w73 extends bz4 {
    public static final v73 c = new v73(1);
    public final nk1 a;
    public final int b;

    public w73(nk1 nk1Var, int i) {
        this.a = nk1Var;
        this.b = i;
    }

    @Override // defpackage.bz4
    public final Object a(l32 l32Var) {
        Object arrayList;
        Serializable arrayList2;
        int e0 = l32Var.e0();
        int w = xa3.w(e0);
        if (w == 0) {
            l32Var.b();
            arrayList = new ArrayList();
        } else if (w != 2) {
            arrayList = null;
        } else {
            l32Var.f();
            arrayList = new nb2(true);
        }
        if (arrayList == null) {
            return c(e0, l32Var);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (l32Var.J()) {
                String Y = arrayList instanceof Map ? l32Var.Y() : null;
                int e02 = l32Var.e0();
                int w2 = xa3.w(e02);
                if (w2 == 0) {
                    l32Var.b();
                    arrayList2 = new ArrayList();
                } else if (w2 != 2) {
                    arrayList2 = null;
                } else {
                    l32Var.f();
                    arrayList2 = new nb2(true);
                }
                boolean z = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = c(e02, l32Var);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(Y, arrayList2);
                }
                if (z) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    l32Var.q();
                } else {
                    l32Var.s();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // defpackage.bz4
    public final void b(q32 q32Var, Object obj) {
        if (obj == null) {
            q32Var.F();
            return;
        }
        bz4 g = this.a.g(TypeToken.get((Class) obj.getClass()));
        if (!(g instanceof w73)) {
            g.b(q32Var, obj);
        } else {
            q32Var.j();
            q32Var.s();
        }
    }

    public final Serializable c(int i, l32 l32Var) {
        int w = xa3.w(i);
        if (w == 5) {
            return l32Var.c0();
        }
        if (w == 6) {
            return f34.b(this.b, l32Var);
        }
        if (w == 7) {
            return Boolean.valueOf(l32Var.R());
        }
        if (w == 8) {
            l32Var.a0();
            return null;
        }
        kf2.o("Unexpected token: ".concat(b11.x(i)));
        return null;
    }
}
