package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pv extends uo {
    public rm2 u;
    public long v;
    public final /* synthetic */ Shader w;

    public pv(Shader shader) {
        super(6);
        this.w = shader;
        this.v = 9205357640488583168L;
    }

    @Override // defpackage.uo
    public final void d(long j, gc gcVar, float f) {
        Paint paint = (Paint) gcVar.b;
        rm2 rm2Var = this.u;
        if (rm2Var == null || !qf4.a(this.v, j)) {
            if (qf4.b(j)) {
                this.u = null;
                this.v = 9205357640488583168L;
                rm2Var = null;
            } else {
                rm2Var = this.u;
                if (rm2Var == null) {
                    rm2Var = new rm2(26, false);
                    this.u = rm2Var;
                }
                rm2Var.o = this.w;
                this.u = rm2Var;
                this.v = j;
            }
        }
        long jA = gcVar.a();
        long j2 = x40.b;
        if (!x40.c(jA, j2)) {
            gcVar.f(j2);
        }
        if (!h12.c((Shader) gcVar.c, rm2Var != null ? (Shader) rm2Var.o : null)) {
            Shader shader = rm2Var != null ? (Shader) rm2Var.o : null;
            gcVar.c = shader;
            paint.setShader(shader);
        }
        if (paint.getAlpha() / 255.0f == f) {
            return;
        }
        gcVar.d(f);
    }
}
