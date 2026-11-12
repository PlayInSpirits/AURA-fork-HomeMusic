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
    public ea2 r;
    public gp3 s;

    public le1(kc1 r2, e75 r3, qa1 r4) {
        this.r = null;
        this.s = null;
        this.n = r2;
        this.o = r3;
        this.p = r4;
    }

    @Override // defpackage.ml1
    public final b75 a() {
        kc1 r0 = this.n;
        b75 r1 = r0.a();
        if (r1.equals(r0.f0) == true) goto L7;
        this.q = r1;
        return r1;
    L7:
        if (this.q != null) goto L18;
        Context r2 = r0.Z().getApplicationContext();
    L10:
        if ((r2 instanceof ContextWrapper) == false) goto L15;
        if ((r2 instanceof Application) == true) goto L13;
        r2 = ((ContextWrapper) r2).getBaseContext();
        goto L10
    L13:
        Application r3 = (Application) r2;
    L16:
        this.q = new k54(r3, r0, r0.s);
        goto L18
    L15:
        r3 = null;
    L18:
        return this.q;
    }

    @Override // defpackage.ml1
    public final f03 b() {
        kc1 r0 = this.n;
        Context r1 = r0.Z().getApplicationContext();
    L4:
        if ((r1 instanceof ContextWrapper) == false) goto L9;
        if ((r1 instanceof Application) == true) goto L7;
        r1 = ((ContextWrapper) r1).getBaseContext();
        goto L4
    L7:
        Application r2 = (Application) r1;
    L10:
        f03 r3 = new f03(0);
        LinkedHashMap r4 = r3.a;
        if (r2 == null) goto L13;
        r4.put(a75.d, r2);
    L13:
        r4.put(e54.a, r0);
        r4.put(e54.b, this);
        Bundle r5 = r0.s;
        if (r5 == null) goto L16;
        r4.put(e54.c, r5);
    L16:
        return r3;
    L9:
        r2 = null;
        goto L10
    }

    public final void c(q92 r1) {
        this.r.d(r1);
    }

    @Override // defpackage.f75
    public final e75 d() {
        e();
        return this.o;
    }

    public final void e() {
        if (this.r != null) goto L6;
        this.r = new ea2(this, true);
        xm2 r0 = new xm2(this, new wc(22, this));
        this.s = new gp3(r0);
        r0.a();
        this.p.run();
        return;
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
