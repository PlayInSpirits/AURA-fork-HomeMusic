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

    public bz2(ArrayList arrayList, io3 io3Var) {
        this.o = io3Var;
        if (arrayList.isEmpty()) {
            kf2.n("Must not be empty.");
            throw null;
        }
        this.n = arrayList;
        this.p = 0;
    }

    @Override // defpackage.sh0
    public final Class a() {
        return ((sh0) this.n.get(0)).a();
    }

    @Override // defpackage.rh0
    public final void b(Exception exc) {
        List list = this.s;
        h12.f(list, "Argument must not be null");
        list.add(exc);
        g();
    }

    @Override // defpackage.sh0
    public final void c() {
        List list = this.s;
        if (list != null) {
            this.o.a(list);
        }
        this.s = null;
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((sh0) obj).c();
        }
    }

    @Override // defpackage.sh0
    public final void cancel() {
        this.t = true;
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((sh0) obj).cancel();
        }
    }

    @Override // defpackage.sh0
    public final void d(eq3 eq3Var, rh0 rh0Var) {
        this.q = eq3Var;
        this.r = rh0Var;
        this.s = (List) this.o.b();
        ((sh0) this.n.get(this.p)).d(eq3Var, this);
        if (this.t) {
            cancel();
        }
    }

    @Override // defpackage.sh0
    public final int e() {
        return ((sh0) this.n.get(0)).e();
    }

    @Override // defpackage.rh0
    public final void f(Object obj) {
        if (obj != null) {
            this.r.f(obj);
        } else {
            g();
        }
    }

    public final void g() {
        if (this.t) {
            return;
        }
        if (this.p < this.n.size() - 1) {
            this.p++;
            d(this.q, this.r);
        } else {
            h12.e(this.s);
            this.r.b(new GlideException("Fetch failed", new ArrayList(this.s)));
        }
    }
}
