package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xk4 extends lu3 {
    public static final String d = null;
    public static final String e = null;
    public final int b;
    public final float c;

    static {
        String r0 = f35.a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public xk4(int r5, float r6) {
        boolean r0 = false;
        if (r5 <= 0) goto L5;
        boolean r2 = true;
    L6:
        rr2.k("maxStars must be a positive integer", r2);
        if (r6 >= 0.0f) goto L9;
    L11:
        rr2.k("starRating is out of range [0, maxStars]", r0);
        this.b = r5;
        this.c = r6;
        return;
    L9:
        if (r6 > r5) goto L11;
        r0 = true;
        goto L11
    L5:
        r2 = false;
        goto L6
    }

    @Override // defpackage.lu3
    public final boolean b() {
        if (this.c == (-1.0f)) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // defpackage.lu3
    public final Bundle c() {
        Bundle r0 = new Bundle();
        r0.putInt(lu3.a, 2);
        r0.putInt(d, this.b);
        r0.putFloat(e, this.c);
        return r0;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof xk4) == true) goto L5;
        return false;
    L5:
        xk4 r5 = (xk4) r4;
        if (this.b == r5.b) goto L8;
    L11:
        return false;
    L8:
        if (this.c != r5.c) goto L11;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.b), Float.valueOf(this.c)});
    }

    public xk4(int r3) {
        if (r3 <= 0) goto L5;
        boolean r0 = true;
    L6:
        rr2.k("maxStars must be a positive integer", r0);
        this.b = r3;
        this.c = -1.0f;
        return;
    L5:
        r0 = false;
        goto L6
    }
}
