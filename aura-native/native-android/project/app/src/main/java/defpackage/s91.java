package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s91 {
    public final ey a;
    public final ra b;
    public final x03 c;
    public final x03 d;
    public boolean e;

    public s91(ey eyVar, ra raVar) {
        this.a = eyVar;
        this.b = raVar;
        x03 x03Var = w54.a;
        this.c = new x03();
        this.d = new x03();
    }

    public final void a() {
        if (this.e) {
            return;
        }
        na naVar = new na(0, this, s91.class, "invalidateNodes", "invalidateNodes()V", 0, 1);
        q03 q03Var = this.b.C0;
        if (q03Var.g(naVar) < 0) {
            q03Var.a(naVar);
        }
        this.e = true;
    }
}
