package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class vl1 extends lu3 {
    public static final String d;
    public static final String e;
    public final boolean b;
    public final boolean c;

    static {
        String str = f35.a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public vl1() {
        this.b = false;
        this.c = false;
    }

    @Override // defpackage.lu3
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.lu3
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(lu3.a, 0);
        bundle.putBoolean(d, this.b);
        bundle.putBoolean(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vl1)) {
            return false;
        }
        vl1 vl1Var = (vl1) obj;
        return this.c == vl1Var.c && this.b == vl1Var.b;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.b), Boolean.valueOf(this.c));
    }

    public vl1(boolean z) {
        this.b = true;
        this.c = z;
    }
}
