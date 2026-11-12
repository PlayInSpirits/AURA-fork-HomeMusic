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

    public xm2(j54 j54Var, wc wcVar) {
        this.d = j54Var;
        this.e = wcVar;
        this.f = new xi4(14);
        this.g = new LinkedHashMap();
        this.c = true;
    }

    public void a() {
        j54 j54Var = (j54) this.d;
        if (j54Var.h().h != r92.o) {
            kf2.o("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.a) {
                kf2.o("SavedStateRegistry was already attached.");
                return;
            }
            ((wc) this.e).invoke();
            j54Var.h().a(new pd1(2, this));
            this.a = true;
        }
    }

    public xm2() {
        this.f = ly3.t;
        this.b = true;
        vw1 vw1Var = yw1.o;
        this.g = gy3.r;
    }
}
