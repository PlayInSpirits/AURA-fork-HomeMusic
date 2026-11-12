package defpackage;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i81 implements TypeEvaluator {
    public final /* synthetic */ int a;
    public Object b;

    public i81(Rect r2) {
        this.a = 1;
        this.b = r2;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float r5, Object r6, Object r7) {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        Rect r8 = (Rect) r6;
        Rect r9 = (Rect) r7;
        int r0 = r8.left;
        int r1 = r0 + ((int) ((r9.left - r0) * r5));
        int r2 = r8.top;
        int r3 = r2 + ((int) ((r9.top - r2) * r5));
        int r4 = r8.right;
        int r10 = r4 + ((int) ((r9.right - r4) * r5));
        int r11 = r8.bottom;
        int r12 = r11 + ((int) ((r9.bottom - r11) * r5));
        Rect r13 = (Rect) this.b;
        r13.set(r1, r3, r10, r12);
        return r13;
    L6:
        float r14 = ((FloatEvaluator) this.b).evaluate(r5, (Float) r6, (Float) r7).floatValue();
        if (r14 >= 0.1f) goto L10;
        r14 = 0.0f;
    L10:
        return Float.valueOf(r14);
    }

    public /* synthetic */ i81() {
        this.a = 0;
    }
}
