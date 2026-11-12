package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class le1 implements ml1, j54, f75 {
    public final kc1 n;
    public final e75 o;
    public final qa1 p;
    public b75 q;
    public ea2 r = null;
    public gp3 s = null;

    public le1(kc1 kc1Var, e75 e75Var, qa1 qa1Var) {
        this.n = kc1Var;
        this.o = e75Var;
        this.p = qa1Var;
    }

    @Override // defpackage.ml1
    public final b75 a() {
        Application application;
        kc1 kc1Var = this.n;
        b75 b75VarA = kc1Var.a();
        if (!b75VarA.equals(kc1Var.f0)) {
            this.q = b75VarA;
            return b75VarA;
        }
        if (this.q == null) {
            Context applicationContext = kc1Var.Z().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.q = new k54(application, kc1Var, kc1Var.s);
        }
        return this.q;
    }

    @Override // defpackage.ml1
    public final f03 b() {
        Application application;
        kc1 kc1Var = this.n;
        Context applicationContext = kc1Var.Z().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        f03 f03Var = new f03(0);
        LinkedHashMap linkedHashMap = f03Var.a;
        if (application != null) {
            linkedHashMap.put(a75.d, application);
        }
        linkedHashMap.put(e54.a, kc1Var);
        linkedHashMap.put(e54.b, this);
        Bundle bundle = kc1Var.s;
        if (bundle != null) {
            linkedHashMap.put(e54.c, bundle);
        }
        return f03Var;
    }

    public final void c(q92 q92Var) {
        this.r.d(q92Var);
    }

    @Override // defpackage.f75
    public final e75 d() {
        e();
        return this.o;
    }

    public final void e() {
        if (this.r == null) {
            this.r = new ea2(this, true);
            xm2 xm2Var = new xm2(this, new wc(22, this));
            this.s = new gp3(xm2Var);
            xm2Var.a();
            this.p.run();
        }
    }

    @Override // defpackage.j54
    public final rm3 f() {
        e();
        return (rm3) this.s.p;
    }

    @Override // defpackage.ba2
    public final ea2 h() {
        e();
        return this.r;
    }
}
