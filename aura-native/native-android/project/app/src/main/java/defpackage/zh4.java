package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zh4 extends uo {
    public final long u;

    public zh4(long j) {
        super(6);
        this.u = j;
    }

    @Override // defpackage.uo
    public final void d(long j, gc gcVar, float f) {
        gcVar.d(1.0f);
        long jB = this.u;
        if (f != 1.0f) {
            jB = x40.b(jB, x40.d(jB) * f);
        }
        gcVar.f(jB);
        if (((Shader) gcVar.c) != null) {
            gcVar.c = null;
            ((Paint) gcVar.b).setShader(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zh4) {
            return x40.c(this.u, ((zh4) obj).u);
        }
        return false;
    }

    public final int hashCode() {
        int i = x40.h;
        return Long.hashCode(this.u);
    }

    @Override // defpackage.uo
    public final String toString() {
        return xa3.h("SolidColor(value=", x40.h(this.u), ")");
    }
}
