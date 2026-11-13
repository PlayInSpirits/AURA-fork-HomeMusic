package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class aa5 {
    public aa5() {
        super();
    }

    public static int f;
    public ArrayList a;
    public int b;
    public int c;
    public ArrayList d;
    public int e;

    public final void a(ArrayList arrayList) {
        int size = this.a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                aa5 aa5Var = (aa5) arrayList.get(i);
                if (this.e == aa5Var.b) {
                    c(this.c, aa5Var);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(eb2 eb2Var, int i) {
        int n;
        int n2;
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return 0;
        }
        kc0 kc0Var = (kc0) ((jc0) arrayList.get(0)).S;
        eb2Var.t();
        kc0Var.b(eb2Var, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((jc0) arrayList.get(i2)).b(eb2Var, false);
        }
        if (i == 0 && kc0Var.y0 > 0) {
            l93.f(kc0Var, eb2Var, arrayList, 0);
        }
        if (i == 1 && kc0Var.z0 > 0) {
            l93.f(kc0Var, eb2Var, arrayList, 1);
        }
        try {
            eb2Var.p();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            jc0 jc0Var = (jc0) arrayList.get(i3);
            z45 z45Var = new z45(4);
            new WeakReference(jc0Var);
            eb2.n(jc0Var.H);
            eb2.n(jc0Var.I);
            eb2.n(jc0Var.J);
            eb2.n(jc0Var.K);
            eb2.n(jc0Var.L);
            this.d.add(z45Var);
        }
        if (i == 0) {
            n = eb2.n(kc0Var.H);
            n2 = eb2.n(kc0Var.J);
            eb2Var.t();
        } else {
            n = eb2.n(kc0Var.I);
            n2 = eb2.n(kc0Var.K);
            eb2Var.t();
        }
        return n2 - n;
    }

    public final void c(int i, aa5 aa5Var) {
        int i2 = aa5Var.b;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            jc0 jc0Var = (jc0) obj;
            ArrayList arrayList2 = aa5Var.a;
            if (!arrayList2.contains(jc0Var)) {
                arrayList2.add(jc0Var);
            }
            if (i == 0) {
                jc0Var.m0 = i2;
            } else {
                jc0Var.n0 = i2;
            }
        }
        this.e = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        String i2 = f34.i(sb, this.b, "] <");
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            StringBuilder s = b11.s(i2, " ");
            s.append(((jc0) obj).g0);
            i2 = s.toString();
        }
        return i2.concat(" >");
    }
}
