package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i35 {
    public if1 a;

    public abstract void a(sv0 r1);

    public if1 b() {
        return this.a;
    }

    public final void c() {
        if1 r0 = b();
        if (r0 == null) goto L6;
        r0.invoke(this);
        return;
    }

    public void d(x r1) {
        this.a = r1;
    }
}
