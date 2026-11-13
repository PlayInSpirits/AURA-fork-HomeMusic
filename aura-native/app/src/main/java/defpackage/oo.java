/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.os.Build;
import android.window.BackEvent;
import defpackage.bn;
import defpackage.no;

public final class oo {
    public final float a;
    public final float b;
    public final float c;
    public final int d;
    public final long e;

    public oo(BackEvent backEvent) {
        backEvent.getClass();
        float f16 = bn.b(backEvent);
        float f17 = bn.z(backEvent);
        float f18 = bn.D(backEvent);
        int n16 = bn.d(backEvent);
        long l16 = Build.VERSION.SDK_INT >= 36 ? no.b(backEvent) : 0L;
        this.a = f16;
        this.b = f17;
        this.c = f18;
        this.d = n16;
        this.e = l16;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BackEventCompat(touchX=");
        stringBuilder.append(this.a);
        stringBuilder.append(", touchY=");
        stringBuilder.append(this.b);
        stringBuilder.append(", progress=");
        stringBuilder.append(this.c);
        stringBuilder.append(", swipeEdge=");
        stringBuilder.append(this.d);
        stringBuilder.append(", frameTimeMillis=");
        stringBuilder.append(this.e);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

