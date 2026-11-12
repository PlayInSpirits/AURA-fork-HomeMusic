package defpackage;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a54 implements x44, j54 {
    public final /* synthetic */ y44 n;
    public ea2 o;
    public gp3 p;

    public a54(y44 r6) {
        this.n = r6;
        Object r1 = r6.d("androidx.savedstate.SavedStateRegistry");
        if ((r1 instanceof Bundle) == false) goto L5;
        Bundle r2 = (Bundle) r1;
    L6:
        if (r2 != null) goto L8;
    L10:
        r6.a("androidx.savedstate.SavedStateRegistry", new wc(20, this));
        return;
    L8:
        if (this.p != null) goto L10;
        gp3 r3 = new gp3(new xm2(this, new wc(22, this)));
        this.p = r3;
        r3.s(r2);
        goto L10
    L5:
        r2 = null;
        goto L6
    }

    @Override // defpackage.x44
    public final c12 a(String r1, gf1 r2) {
        return this.n.a(r1, r2);
    }

    @Override // defpackage.x44
    public final boolean b(Object r1) {
        return this.n.b(r1);
    }

    @Override // defpackage.x44
    public final Map c() {
        return this.n.c();
    }

    @Override // defpackage.x44
    public final Object d(String r1) {
        return this.n.d(r1);
    }

    @Override // defpackage.j54
    public final rm3 f() {
        gp3 r0 = this.p;
        if (r0 != null) goto L6;
        gp3 r1 = new gp3(new xm2(this, new wc(22, this)));
        this.p = r1;
        r1.s(null);
        r0 = r1;
    L6:
        return (rm3) r0.p;
    }

    @Override // defpackage.ba2
    public final ea2 h() {
        ea2 r0 = this.o;
        if (r0 != null) goto L6;
        ea2 r1 = new ea2(this, false);
        this.o = r1;
        return r1;
    L6:
        return r0;
    }
}
