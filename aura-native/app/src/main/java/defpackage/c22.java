/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.view.animation.Interpolator;

public final class c22
implements Interpolator {
    public final int a;

    public c22(int n16) {
        this.a = n16;
    }

    @Override
    public final float getInterpolation(float f16) {
        switch (this.a) {
            default: {
                return (f16 -= 1.0f) * f16 * f16 * f16 * f16 + 1.0f;
            }
            case 0: 
        }
        return f16 * f16 * f16 * f16 * f16;
    }
}

