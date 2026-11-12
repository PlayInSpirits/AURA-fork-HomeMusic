package defpackage;

import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bz2 implements sh0, rh0 {
    public final ArrayList n;
    public final io3 o;
    public int p;
    public eq3 q;
    public rh0 r;
    public List s;
    public boolean t;

    public bz2(ArrayList r1, io3 r2) {
        this.o = r2;
        if (r1.isEmpty() == true) goto L6;
        this.n = r1;
        this.p = 0;
        return;
    L6:
        kf2.n("Must not be empty.");
        throw null;
    }

    @Override // defpackage.sh0
    public final Class a() {
        return ((sh0) this.n.get(0)).a();
    }

    @Override // defpackage.rh0
    public final void b(Exception r3) {
        List r0 = this.s;
        h12.f(r0, "Argument must not be null");
        r0.add(r3);
        g();
    }

    @Override // defpackage.sh0
    public final void c() {
        List r0 = this.s;
        if (r0 == null) goto L5;
        this.o.a(r0);
    L5:
        this.s = null;
        ArrayList r3 = this.n;
        int r1 = r3.size();
        int r2 = 0;
    L6:
        if (r2 >= r1) goto L8;
        Object r4 = r3.get(r2);
        r2 = r2 + 1;
        ((sh0) r4).c();
        goto L6
    }

    @Override // defpackage.sh0
    public final void cancel() {
        this.t = true;
        ArrayList r3 = this.n;
        int r0 = r3.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        Object r2 = r3.get(r1);
        r1 = r1 + 1;
        ((sh0) r2).cancel();
        goto L3
    }

    @Override // defpackage.sh0
    public final void d(eq3 r2, rh0 r3) {
        this.q = r2;
        this.r = r3;
        this.s = (List) this.o.b();
        ((sh0) this.n.get(this.p)).d(r2, this);
        if (this.t == false) goto L6;
        cancel();
        return;
    }

    @Override // defpackage.sh0
    public final int e() {
        return ((sh0) this.n.get(0)).e();
    }

    @Override // defpackage.rh0
    public final void f(Object r1) {
        if (r1 == null) goto L5;
        this.r.f(r1);
        return;
    L5:
        g();
    }

    public final void g() {
        if (this.t == false) goto L6;
        return;
    L6:
        if (this.p >= (this.n.size() - 1)) goto L9;
        this.p++;
        d(this.q, this.r);
        return;
    L9:
        h12.e(this.s);
        this.r.b(new GlideException("Fetch failed", new ArrayList(this.s)));
    }
}
