package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class xk4 extends lu3 {
    public static final String d;
    public static final String e;
    public final int b;
    public final float c;

    static {
        String str = f35.a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public xk4(int i, float f) {
        boolean z = false;
        rr2.k("maxStars must be a positive integer", i > 0);
        if (f >= 0.0f && f <= i) {
            z = true;
        }
        rr2.k("starRating is out of range [0, maxStars]", z);
        this.b = i;
        this.c = f;
    }

    @Override // defpackage.lu3
    public final boolean b() {
        return this.c != -1.0f;
    }

    @Override // defpackage.lu3
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(lu3.a, 2);
        bundle.putInt(d, this.b);
        bundle.putFloat(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xk4)) {
            return false;
        }
        xk4 xk4Var = (xk4) obj;
        return this.b == xk4Var.b && this.c == xk4Var.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), Float.valueOf(this.c));
    }

    public xk4(int i) {
        rr2.k("maxStars must be a positive integer", i > 0);
        this.b = i;
        this.c = -1.0f;
    }
}
