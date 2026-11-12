package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c32 extends uc0 {
    public final /* synthetic */ uc0 p;

    public c32(uc0 r1, uc0 r2) {
        this.p = r1;
        super(r2);
    }

    @Override // defpackage.uc0
    public final CharSequence c(Object r1) {
        if (r1 != null) goto L6;
        return "null";
    L6:
        return this.p.c(r1);
    }
}
