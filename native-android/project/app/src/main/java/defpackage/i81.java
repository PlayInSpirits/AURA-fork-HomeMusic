package defpackage;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i81 implements TypeEvaluator {
    public final /* synthetic */ int a = 0;
    public Object b;

    public i81(Rect rect) {
        this.b = rect;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                float fFloatValue = ((FloatEvaluator) this.b).evaluate(f, (Number) obj, (Number) obj2).floatValue();
                if (fFloatValue < 0.1f) {
                    fFloatValue = 0.0f;
                }
                return Float.valueOf(fFloatValue);
            default:
                Rect rect = (Rect) obj;
                Rect rect2 = (Rect) obj2;
                int i = rect.left;
                int i2 = i + ((int) ((rect2.left - i) * f));
                int i3 = rect.top;
                int i4 = i3 + ((int) ((rect2.top - i3) * f));
                int i5 = rect.right;
                int i6 = i5 + ((int) ((rect2.right - i5) * f));
                int i7 = rect.bottom;
                int i8 = i7 + ((int) ((rect2.bottom - i7) * f));
                Rect rect3 = (Rect) this.b;
                rect3.set(i2, i4, i6, i8);
                return rect3;
        }
    }

    public /* synthetic */ i81() {
    }
}
