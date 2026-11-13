package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class hf5 {
    public final ve a;
    public final p61 b;

    public /* synthetic */ hf5(ve veVar, p61 p61Var) {
        this.a = veVar;
        this.b = p61Var;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof hf5)) {
            return false;
        }
        hf5 hf5Var = (hf5) obj;
        return au0.n(this.a, hf5Var.a) && au0.n(this.b, hf5Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        qr2 qr2Var = new qr2(this);
        qr2Var.c(this.a, "key");
        qr2Var.c(this.b, "feature");
        return qr2Var.toString();
    }
}
