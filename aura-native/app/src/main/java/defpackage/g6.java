package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class g6 implements ke0 {
    public final ke0 a;
    public final float b;

    public g6(float f, ke0 ke0Var) {
        while (ke0Var instanceof g6) {
            ke0Var = ((g6) ke0Var).a;
            f += ((g6) ke0Var).b;
        }
        this.a = ke0Var;
        this.b = f;
    }

    @Override // defpackage.ke0
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6)) {
            return false;
        }
        g6 g6Var = (g6) obj;
        return this.a.equals(g6Var.a) && this.b == g6Var.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
