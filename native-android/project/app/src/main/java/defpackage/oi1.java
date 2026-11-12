package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oi1 extends c04 {
    @Override // defpackage.c04
    public final void a(g04 r1) {
        monitor-enter(this);
        super.a(r1);     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.c04
    public final vz3 f(Class r4) {
        return new ni1(this.n, this, r4, this.o);
    }

    @Override // defpackage.c04
    public final vz3 g() {
        return (ni1) super.g();
    }

    @Override // defpackage.c04
    public final vz3 o() {
        return (ni1) f(Drawable.class);
    }

    @Override // defpackage.c04
    public final vz3 p() {
        return (ni1) super.p();
    }

    @Override // defpackage.c04
    public final vz3 r(Uri r1) {
        return (ni1) super.r(r1);
    }

    @Override // defpackage.c04
    public final vz3 s(File r1) {
        return (ni1) super.s(r1);
    }

    @Override // defpackage.c04
    public final vz3 t(String r1) {
        return (ni1) super.t(r1);
    }

    @Override // defpackage.c04
    public final void w(g04 r2) {
        if ((r2 instanceof mi1) == false) goto L6;
        super.w(r2);
        return;
    L6:
        super.w(new mi1().F(r2));
    }
}
