package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class r04 implements uh0, rh0 {
    public final xi0 n;
    public final wi0 o;
    public int p;
    public int q = -1;
    public f42 r;
    public List s;
    public int t;
    public volatile tw2 u;
    public File v;
    public s04 w;

    public r04(wi0 wi0Var, xi0 xi0Var) {
        this.o = wi0Var;
        this.n = xi0Var;
    }

    @Override // defpackage.rh0
    public final void b(Exception exc) {
        this.n.b(this.w, exc, this.u.c, 4);
    }

    @Override // defpackage.uh0
    public final boolean c() {
        List list;
        boolean z;
        List list2;
        boolean z2;
        ArrayList y;
        ArrayList a = this.o.a();
        if (a.isEmpty()) {
            return false;
        }
        wi0 wi0Var = this.o;
        ey3 a2 = wi0Var.c.a();
        Class<?> cls = wi0Var.d.getClass();
        Class cls2 = wi0Var.g;
        Class cls3 = wi0Var.k;
        qr2 qr2Var = a2.h;
        yy2 yy2Var = (yy2) ((AtomicReference) qr2Var.o).getAndSet(null);
        if (yy2Var == null) {
            yy2Var = new yy2(cls, cls2, cls3);
        } else {
            yy2Var.a = cls;
            yy2Var.b = cls2;
            yy2Var.c = cls3;
        }
        synchronized (((oi) qr2Var.p)) {
            list = (List) ((oi) qr2Var.p).get(yy2Var);
        }
        ((AtomicReference) qr2Var.o).set(yy2Var);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            rf2 rf2Var = a2.a;
            synchronized (rf2Var) {
                y = ((na4) rf2Var.n).y(cls);
            }
            int size = y.size();
            int i = 0;
            while (i < size) {
                Object obj = y.get(i);
                i++;
                ArrayList f = a2.c.f((Class) obj, cls2);
                int size2 = f.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = f.get(i2);
                    i2++;
                    Class cls4 = (Class) obj2;
                    if (!a2.f.e(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            z = false;
            qr2 qr2Var2 = a2.h;
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            synchronized (((oi) qr2Var2.p)) {
                ((oi) qr2Var2.p).put(new yy2(cls, cls2, cls3), unmodifiableList);
            }
            list2 = arrayList;
        } else {
            z = false;
            list2 = list;
        }
        if (list2.isEmpty()) {
            if (File.class.equals(this.o.k)) {
                return z;
            }
            StringBuilder sb = new StringBuilder("Failed to find any load path from ");
            sb.append(this.o.d.getClass());
            Class cls5 = this.o.k;
            sb.append(" to ");
            sb.append(cls5);
            throw new IllegalStateException(sb.toString());
        }
        while (true) {
            List list3 = this.s;
            if (list3 != null && this.t < list3.size()) {
                this.u = null;
                boolean z3 = z;
                while (!z3 && this.t < this.s.size()) {
                    List list4 = this.s;
                    int i3 = this.t;
                    this.t = i3 + 1;
                    uw2 uw2Var = (uw2) list4.get(i3);
                    File file = this.v;
                    wi0 wi0Var2 = this.o;
                    this.u = uw2Var.b(file, wi0Var2.e, wi0Var2.f, wi0Var2.i);
                    if (this.u != null && this.o.c(this.u.c.a()) != null) {
                        this.u.c.d(this.o.o, this);
                        z3 = true;
                    }
                }
                return z3;
            }
            int i4 = this.q + 1;
            this.q = i4;
            if (i4 >= list2.size()) {
                int i5 = this.p + 1;
                this.p = i5;
                if (i5 >= a.size()) {
                    return z;
                }
                this.q = z ? 1 : 0;
            }
            f42 f42Var = (f42) a.get(this.p);
            Class cls6 = (Class) list2.get(this.q);
            uw4 e = this.o.e(cls6);
            wi0 wi0Var3 = this.o;
            this.w = new s04(wi0Var3.c.a, f42Var, wi0Var3.n, wi0Var3.e, wi0Var3.f, e, cls6, wi0Var3.i);
            File m = wi0Var3.h.a().m(this.w);
            this.v = m;
            if (m != null) {
                this.r = f42Var;
                this.s = this.o.c.a().f(m);
                z2 = false;
                this.t = 0;
            } else {
                z2 = false;
            }
            z = z2;
        }
    }

    @Override // defpackage.uh0
    public final void cancel() {
        tw2 tw2Var = this.u;
        if (tw2Var != null) {
            tw2Var.c.cancel();
        }
    }

    @Override // defpackage.rh0
    public final void f(Object obj) {
        this.n.a(this.r, obj, this.u.c, 4, this.w);
    }
}
