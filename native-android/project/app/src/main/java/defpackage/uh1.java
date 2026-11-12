package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uh1 extends nh1 {
    public final String d;

    public uh1(String r4) {
        r4.getClass();
        super(au0.V(r4), au0.V(r4), z01.n);
        this.d = r4;
        if (r4.length() <= 0) goto L5;
        return;
    L5:
        kf2.n("serverClientId should not be empty");
        throw null;
    }
}
