package defpackage;

import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w73 extends bz4 {
    public static final v73 c = new v73(1);
    public final nk1 a;
    public final int b;

    public w73(nk1 nk1Var, int i) {
        this.a = nk1Var;
        this.b = i;
    }

    @Override // defpackage.bz4
    public final Object a(l32 l32Var) throws IOException {
        Object arrayList;
        Serializable arrayList2;
        int iE0 = l32Var.e0();
        int iW = xa3.w(iE0);
        if (iW == 0) {
            l32Var.b();
            arrayList = new ArrayList();
        } else if (iW != 2) {
            arrayList = null;
        } else {
            l32Var.f();
            arrayList = new nb2(true);
        }
        if (arrayList == null) {
            return c(iE0, l32Var);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (l32Var.J()) {
                String strY = arrayList instanceof Map ? l32Var.Y() : null;
                int iE1 = l32Var.e0();
                int iW2 = xa3.w(iE1);
                if (iW2 == 0) {
                    l32Var.b();
                    arrayList2 = new ArrayList();
                } else if (iW2 != 2) {
                    arrayList2 = null;
                } else {
                    l32Var.f();
                    arrayList2 = new nb2(true);
                }
                boolean z = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = c(iE1, l32Var);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strY, arrayList2);
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
    public final void b(q32 q32Var, Object obj) throws IOException {
        if (obj == null) {
            q32Var.F();
            return;
        }
        bz4 bz4VarG = this.a.g(TypeToken.get((Class) obj.getClass()));
        if (!(bz4VarG instanceof w73)) {
            bz4VarG.b(q32Var, obj);
        } else {
            q32Var.j();
            q32Var.s();
        }
    }

    public final Serializable c(int i, l32 l32Var) throws IOException {
        int iW = xa3.w(i);
        if (iW == 5) {
            return l32Var.c0();
        }
        if (iW == 6) {
            return f34.b(this.b, l32Var);
        }
        if (iW == 7) {
            return Boolean.valueOf(l32Var.R());
        }
        if (iW == 8) {
            l32Var.a0();
            return null;
        }
        kf2.o("Unexpected token: ".concat(b11.x(i)));
        return null;
    }
}
