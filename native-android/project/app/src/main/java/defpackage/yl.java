package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yl {
    public boolean a;
    public boolean b;
    public boolean c;

    public zl a() {
        if (this.a == true) goto L12;
        if (this.b == false) goto L7;
    L9:
        kf2.o("Secondary offload attribute fields are true but primary isFormatSupported is false");
        return null;
    L7:
        if (this.c == true) goto L9;
    L12:
        return new zl(this);
    }

    public boolean b() {
        if (this.c == true) goto L7;
        if (this.b == true) goto L7;
        return false;
    L7:
        if (this.a == false) goto L12;
        return true;
    L12:
        return false;
    }
}
