package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class zh extends gx2 {
    public final if1 a;

    public zh(if1 if1Var) {
        this.a = if1Var;
    }

    @Override // defpackage.gx2
    public final cx2 d() {
        je0 je0Var = new je0();
        je0Var.B = this.a;
        return je0Var;
    }

    @Override // defpackage.gx2
    public final void e(cx2 cx2Var) {
        je0 je0Var = (je0) cx2Var;
        je0Var.getClass();
        je0Var.B = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zh) && this.a == ((zh) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode() + (Boolean.hashCode(false) * 31);
    }
}
