package defpackage;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rx1 {
    public Object a;
    public Object b;
    public final Serializable c;

    public rx1(Class cls) {
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        this.a = uuidRandomUUID;
        String string = ((UUID) this.a).toString();
        string.getClass();
        this.b = new dd5(string, 0, cls.getName(), (String) null, (oh0) null, (oh0) null, 0L, 0L, 0L, (mc0) null, 0, 0, 0L, 0L, 0L, 0L, false, 0, 0, 0L, 0, 0, (String) null, 16777210);
        String[] strArr = {cls.getName()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(lg2.W(1));
        linkedHashSet.add(strArr[0]);
        this.c = linkedHashSet;
    }

    public df1 a() {
        s24 s24Var = (s24) this.a;
        s24Var.a();
        if (((AtomicBoolean) this.b).compareAndSet(false, true)) {
            return (df1) ((rp4) this.c).getValue();
        }
        String strE = e();
        s24Var.getClass();
        s24Var.a();
        s24Var.b();
        return s24Var.j().z().j(strE);
    }

    public bd5 b() {
        bd5 bd5VarC = c();
        mc0 mc0Var = ((dd5) this.b).j;
        boolean z = !mc0Var.i.isEmpty() || mc0Var.e || mc0Var.c || mc0Var.d;
        dd5 dd5Var = (dd5) this.b;
        if (dd5Var.q) {
            if (z) {
                kf2.n("Expedited jobs only support network and storage constraints");
                return null;
            }
            if (dd5Var.g > 0) {
                kf2.n("Expedited jobs cannot be delayed");
                return null;
            }
        }
        if (dd5Var.x == null) {
            List listC0 = qm4.C0(dd5Var.c, new String[]{"."}, 6);
            String strJ0 = listC0.size() == 1 ? (String) listC0.get(0) : (String) q40.C0(listC0);
            if (strJ0.length() > 127) {
                strJ0 = qm4.J0(127, strJ0);
            }
            dd5Var.x = strJ0;
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        this.a = uuidRandomUUID;
        String string = uuidRandomUUID.toString();
        string.getClass();
        dd5 dd5Var2 = (dd5) this.b;
        dd5Var2.getClass();
        this.b = new dd5(string, dd5Var2.b, dd5Var2.c, dd5Var2.d, new oh0(dd5Var2.e), new oh0(dd5Var2.f), dd5Var2.g, dd5Var2.h, dd5Var2.i, new mc0(dd5Var2.j), dd5Var2.k, dd5Var2.l, dd5Var2.m, dd5Var2.n, dd5Var2.o, dd5Var2.p, dd5Var2.q, dd5Var2.r, dd5Var2.s, dd5Var2.u, dd5Var2.v, dd5Var2.w, dd5Var2.x, 524288);
        return bd5VarC;
    }

    public abstract bd5 c();

    public abstract void d();

    public abstract String e();

    public abstract void f();

    public abstract void g(hq hqVar);

    public void h(df1 df1Var) {
        df1Var.getClass();
        if (df1Var == ((df1) ((rp4) this.c).getValue())) {
            ((AtomicBoolean) this.b).set(false);
        }
    }

    public abstract void i();

    public abstract void j();

    public abstract void k();

    /* JADX WARN: Type inference failed for: r2v1, types: [int[], java.io.Serializable] */
    public rx1(int i) {
        this.b = new float[i * 2];
        this.c = new int[i];
    }

    public rx1(s24 s24Var) {
        s24Var.getClass();
        this.a = s24Var;
        this.b = new AtomicBoolean(false);
        this.c = new rp4(new wc(25, this));
    }
}
