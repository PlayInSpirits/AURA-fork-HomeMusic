package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class g6 implements ke0 {
    public final ke0 a;
    public final float b;

    public g6(float r2, ke0 r3) {
    L4:
        if ((r3 instanceof g6) == false) goto L6;
        r3 = ((g6) r3).a;
        r2 = r2 + ((g6) r3).b;
        goto L4
    L6:
        this.a = r3;
        this.b = r2;
    }

    @Override // defpackage.ke0
    public final float a(RectF r2) {
        return Math.max(0.0f, this.a.a(r2) + this.b);
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g6) == true) goto L8;
        return false;
    L8:
        g6 r6 = (g6) r5;
        if (this.a.equals(r6.a) == true) goto L11;
    L13:
        return false;
    L11:
        if (this.b != r6.b) goto L13;
        return true;
    }

    public final int hashCode() {
        Float r0 = Float.valueOf(this.b);
        return Arrays.hashCode(new Object[]{this.a, r0});
    }
}
