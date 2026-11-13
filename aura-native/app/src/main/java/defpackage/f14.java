package defpackage;

import android.content.res.Resources;
import java.util.Objects;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class f14 {
    public final Resources a;
    public final Resources.Theme b;

    public f14(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f14.class == obj.getClass()) {
            f14 f14Var = (f14) obj;
            if (this.a.equals(f14Var.a) && Objects.equals(this.b, f14Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
