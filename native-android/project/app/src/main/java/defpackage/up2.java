package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class up2 {
    public final Bundle a;
    public rq2 b;

    public up2(rq2 rq2Var, boolean z) {
        if (rq2Var == null) {
            kf2.n("selector must not be null");
            throw null;
        }
        Bundle bundle = new Bundle();
        this.a = bundle;
        this.b = rq2Var;
        bundle.putBundle("selector", rq2Var.a);
        bundle.putBoolean("activeScan", z);
    }

    public final void a() {
        if (this.b == null) {
            Bundle bundle = this.a.getBundle("selector");
            rq2 rq2Var = null;
            if (bundle != null) {
                rq2Var = new rq2(bundle, null);
            } else {
                rq2 rq2Var2 = rq2.c;
            }
            this.b = rq2Var;
            if (rq2Var == null) {
                this.b = rq2.c;
            }
        }
    }

    public final boolean b() {
        return this.a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof up2) {
            up2 up2Var = (up2) obj;
            a();
            rq2 rq2Var = this.b;
            up2Var.a();
            if (rq2Var.equals(up2Var.b) && b() == up2Var.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return (b() ? 1 : 0) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb.append(this.b);
        sb.append(", activeScan=");
        sb.append(b());
        sb.append(", isValid=");
        a();
        rq2 rq2Var = this.b;
        rq2Var.a();
        sb.append(!rq2Var.b.contains(null));
        sb.append(" }");
        return sb.toString();
    }
}
