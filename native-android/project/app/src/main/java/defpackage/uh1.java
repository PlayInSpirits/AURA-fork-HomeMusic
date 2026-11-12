package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uh1 extends nh1 {
    public final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh1(String str) {
        super(au0.V(str), au0.V(str), z01.n);
        str.getClass();
        this.d = str;
        if (str.length() > 0) {
            return;
        }
        kf2.n("serverClientId should not be empty");
        throw null;
    }
}
