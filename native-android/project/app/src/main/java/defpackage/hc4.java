package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hc4 extends ic4 {
    public float b;
    public float c;

    @Override // defpackage.ic4
    public final void a(Matrix r2, Path r3) {
        Matrix r0 = this.a;
        r2.invert(r0);
        r3.transform(r0);
        r3.lineTo(this.b, this.c);
        r3.transform(r2);
    }
}
