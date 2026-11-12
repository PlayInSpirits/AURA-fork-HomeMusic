package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zh4 extends uo {
    public final long u;

    public zh4(long r2) {
        super(6);
        this.u = r2;
    }

    @Override // defpackage.uo
    public final void d(long r3, gc r5, float r6) {
        r5.d(1.0f);
        long r0 = this.u;
        if (r6 == 1.0f) goto L6;
        r0 = x40.b(r0, x40.d(r0) * r6);
    L6:
        r5.f(r0);
        if (((Shader) r5.c) == null) goto L10;
        r5.c = null;
        ((Paint) r5.b).setShader(null);
        return;
    }

    public final boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof zh4) == true) goto L8;
        return false;
    L8:
        long r3 = ((zh4) r6).u;
        if (x40.c(this.u, r3) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        int r0 = x40.h;
        return Long.hashCode(this.u);
    }

    @Override // defpackage.uo
    public final String toString() {
        return xa3.h("SolidColor(value=", x40.h(this.u), ")");
    }
}
