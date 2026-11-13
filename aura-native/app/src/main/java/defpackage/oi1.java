package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class oi1 extends c04 {
    public oi1(com.bumptech.glide.a a0, defpackage.s92 a1, defpackage.f04 a2, android.content.Context a3) {
        super(a0, a1, a2, a3);
    }

    @Override // defpackage.c04
    public final void a(g04 g04Var) {
        synchronized (this) {
            super.a(g04Var);
        }
    }

    @Override // defpackage.c04
    public final vz3 f(Class cls) {
        return new ni1(this.n, this, cls, this.o);
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
    public final vz3 r(Uri uri) {
        return (ni1) super.r(uri);
    }

    @Override // defpackage.c04
    public final vz3 s(File file) {
        return (ni1) super.s(file);
    }

    @Override // defpackage.c04
    public final vz3 t(String str) {
        return (ni1) super.t(str);
    }

    @Override // defpackage.c04
    public final void w(g04 g04Var) {
        if (g04Var instanceof mi1) {
            super.w(g04Var);
        } else {
            super.w(new mi1().F(g04Var));
        }
    }
}
