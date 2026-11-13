/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.hc2;

public final class qn {
    public qn() {
        super();
    }

    public int a;
    public int b;
    public float c;
    public float d;
    public long e;
    public long f;
    public long g;
    public float h;
    public int i;

    public final float a(long l16) {
        long l17 = this.e;
        if (l16 < l17) {
            return 0.0f;
        }
        long l18 = this.g;
        if (l18 >= 0L && l16 >= l18) {
            float f16 = this.h;
            return hc2.b((float)(l16 - l18) / (float)this.i, 0.0f, 1.0f) * f16 + (1.0f - f16);
        }
        return hc2.b((float)(l16 - l17) / (float)this.a, 0.0f, 1.0f) * 0.5f;
    }
}

