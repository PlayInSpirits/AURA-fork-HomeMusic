/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;
import android.graphics.Rect;

public final class i81
implements TypeEvaluator {
    public final int a;
    public Object b;

    public i81() {
        this.a = 0;
    }

    public i81(Rect rect) {
        this.a = 1;
        this.b = rect;
    }

    public final Object evaluate(float f16, Object object, Object object2) {
        float f17;
        switch (this.a) {
            default: {
                object = (Rect)object;
                object2 = (Rect)object2;
                int n16 = ((Rect)object).left;
                int n17 = (int)((float)(((Rect)object2).left - n16) * f16);
                int n18 = ((Rect)object).top;
                int n19 = (int)((float)(((Rect)object2).top - n18) * f16);
                int n26 = ((Rect)object).right;
                int n27 = (int)((float)(((Rect)object2).right - n26) * f16);
                int n28 = ((Rect)object).bottom;
                int n29 = (int)((float)(((Rect)object2).bottom - n28) * f16);
                object = (Rect)this.b;
                ((Rect)object).set(n16 + n17, n18 + n19, n26 + n27, n28 + n29);
                return object;
            }
            case 0: 
        }
        object = (Float)object;
        object2 = (Float)object2;
        f16 = f17 = ((FloatEvaluator)this.b).evaluate(f16, (Number)object, (Number)object2).floatValue();
        if (f17 < 0.1f) {
            f16 = 0.0f;
        }
        return Float.valueOf(f16);
    }
}

