package defpackage;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class g81 implements TypeEvaluator {
    public final float[] a;
    public final float[] b;
    public final Matrix c;
    public final /* synthetic */ m81 d;

    public g81(m81 r2) {
        this.d = r2;
        this.a = new float[9];
        this.b = new float[9];
        this.c = new Matrix();
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float r4, Object r5, Object r6) {
        this.d.o = r4;
        float[] r0 = this.a;
        ((Matrix) r5).getValues(r0);
        float[] r7 = this.b;
        ((Matrix) r6).getValues(r7);
        int r8 = 0;
    L4:
        if (r8 >= 9) goto L6;
        float r1 = r7[r8];
        float r2 = r0[r8];
        r7[r8] = xa3.a(r1, r2, r4, r2);
        r8 = r8 + 1;
        goto L4
    L6:
        Matrix r3 = this.c;
        r3.setValues(r7);
        return r3;
    }
}
