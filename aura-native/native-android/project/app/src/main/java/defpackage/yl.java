package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yl {
    public boolean a;
    public boolean b;
    public boolean c;

    public zl a() {
        if (this.a || !(this.b || this.c)) {
            return new zl(this);
        }
        kf2.o("Secondary offload attribute fields are true but primary isFormatSupported is false");
        return null;
    }

    public boolean b() {
        return (this.c || this.b) && this.a;
    }
}
