package defpackage;

import java.io.Serializable;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xm2 {
    public boolean a;
    public boolean b;
    public boolean c;
    public Object d;
    public Object e;
    public Object f;
    public Serializable g;
    public Cloneable h;

    public xm2(j54 r1, wc r2) {
        this.d = r1;
        this.e = r2;
        this.f = new xi4(14);
        this.g = new LinkedHashMap();
        this.c = true;
    }

    public void a() {
        j54 r0 = (j54) this.d;
        if (r0.h().h == r92.o) goto L5;
        kf2.o("Restarter must be created only during owner's initialization stage");
        return;
    L5:
        if (this.a == true) goto L8;
        ((wc) this.e).invoke();
        r0.h().a(new pd1(2, this));
        this.a = true;
        return;
    L8:
        kf2.o("SavedStateRegistry was already attached.");
    }

    public xm2() {
        this.f = ly3.t;
        this.b = true;
        vw1 r0 = yw1.o;
        this.g = gy3.r;
    }
}
