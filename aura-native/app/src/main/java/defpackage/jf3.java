package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class jf3 extends lu3 {
    public static final String c;
    public final float b;

    static {
        String str = f35.a;
        c = Integer.toString(1, 36);
    }

    public jf3(float f) {
        rr2.k("percent must be in the range of [0, 100]", f >= 0.0f && f <= 100.0f);
        this.b = f;
    }

    @Override // defpackage.lu3
    public final boolean b() {
        return this.b != -1.0f;
    }

    @Override // defpackage.lu3
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(lu3.a, 1);
        bundle.putFloat(c, this.b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jf3) {
            return this.b == ((jf3) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.b));
    }

    public jf3() {
        this.b = -1.0f;
    }
}
