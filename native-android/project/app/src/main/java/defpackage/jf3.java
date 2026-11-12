package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jf3 extends lu3 {
    public static final String c = null;
    public final float b;

    static {
        String r0 = f35.a;
        c = Integer.toString(1, 36);
    }

    public jf3(float r3) {
        if (r3 >= 0.0f) goto L5;
    L7:
        boolean r0 = false;
    L8:
        rr2.k("percent must be in the range of [0, 100]", r0);
        this.b = r3;
        return;
    L5:
        if (r3 > 100.0f) goto L7;
        r0 = true;
        goto L8
    }

    @Override // defpackage.lu3
    public final boolean b() {
        if (this.b == (-1.0f)) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // defpackage.lu3
    public final Bundle c() {
        Bundle r0 = new Bundle();
        r0.putInt(lu3.a, 1);
        r0.putFloat(c, this.b);
        return r0;
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof jf3) == true) goto L5;
        return false;
    L5:
        float r4 = ((jf3) r3).b;
        if (this.b != r4) goto L9;
        return true;
    L9:
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Float.valueOf(this.b)});
    }

    public jf3() {
        this.b = -1.0f;
    }
}
