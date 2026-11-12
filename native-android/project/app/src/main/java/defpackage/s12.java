package defpackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s12 {
    public final s24 a;
    public final jy4 b;
    public final LinkedHashMap c;
    public final ReentrantLock d;
    public final e90 e;
    public final e90 f;
    public final hd5 g;
    public final Object h;

    public s12(s24 s24Var, HashMap map, HashMap map2, String... strArr) {
        this.a = s24Var;
        jy4 jy4Var = new jy4(s24Var, map, map2, strArr, s24Var.j, new q(1, this, s12.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 6));
        this.b = jy4Var;
        this.c = new LinkedHashMap();
        this.d = new ReentrantLock();
        this.e = new e90(this, 22);
        this.f = new e90(this, 23);
        this.g = new hd5(s24Var);
        this.h = new Object();
        jy4Var.k = new wc(9, this);
    }

    public final t24 a(String[] strArr, if1 if1Var) {
        this.b.g(strArr);
        hd5 hd5Var = this.g;
        hd5Var.getClass();
        return new t24((s24) hd5Var.o, hd5Var, strArr, if1Var);
    }

    public final Object b(ep4 ep4Var) {
        Object objF;
        s24 s24Var = this.a;
        return ((!s24Var.m() || s24Var.q()) && (objF = this.b.f(ep4Var)) == xe0.n) ? objF : j15.a;
    }
}
