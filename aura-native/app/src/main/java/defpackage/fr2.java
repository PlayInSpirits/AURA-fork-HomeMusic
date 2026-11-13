package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class fr2 {
    public final ms2 a;
    public final int b;
    public final int c;
    public final er2 d;
    public final Bundle e;

    public fr2(ms2 ms2Var, int i, int i2, boolean z, er2 er2Var, Bundle bundle) {
        this.a = ms2Var;
        this.b = i;
        this.c = i2;
        this.d = er2Var;
        this.e = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fr2)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        fr2 fr2Var = (fr2) obj;
        er2 er2Var = fr2Var.d;
        er2 er2Var2 = this.d;
        return (er2Var2 == null && er2Var == null) ? this.a.equals(fr2Var.a) : Objects.equals(er2Var2, er2Var);
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ControllerInfo {pkg=");
        ms2 ms2Var = this.a;
        sb.append(ms2Var.a.a);
        sb.append(", uid=");
        return f34.i(sb, ms2Var.a.c, "}");
    }
}
