package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class pd2 {
    public final long a;
    public final float b;
    public final long c;

    public pd2(od2 od2Var) {
        this.a = od2Var.a;
        this.b = od2Var.b;
        this.c = od2Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pd2)) {
            return false;
        }
        pd2 pd2Var = (pd2) obj;
        return this.a == pd2Var.a && this.b == pd2Var.b && this.c == pd2Var.c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c));
    }
}
