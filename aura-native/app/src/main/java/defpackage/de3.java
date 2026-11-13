package defpackage;

import android.net.Uri;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class de3 implements jd2 {
    public final ii0 b;
    public final yl4 d;
    public final ce3 e;
    public volatile Object f;
    public final int c = 4;
    public final long a = ed2.g.getAndIncrement();

    public de3(ci0 ci0Var, ii0 ii0Var, ce3 ce3Var) {
        this.d = new yl4(ci0Var);
        this.b = ii0Var;
        this.e = ce3Var;
    }

    @Override // defpackage.jd2
    public final void a() {
        this.d.o = 0L;
        gi0 gi0Var = new gi0(this.d, this.b);
        try {
            gi0Var.b();
            Uri m = this.d.n.m();
            m.getClass();
            this.f = this.e.a(m, gi0Var);
        } finally {
            f35.h(gi0Var);
        }
    }

    @Override // defpackage.jd2
    public final void b() {
    }
}
