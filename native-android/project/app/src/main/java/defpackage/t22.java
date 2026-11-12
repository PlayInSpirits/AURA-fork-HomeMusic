package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class t22 extends a32 {
    public final boolean r;

    public t22(s22 r5) {
        boolean r0 = true;
        super(true);
        N(r5);
        c20 r6 = G();
        if ((r6 instanceof d20) == false) goto L5;
        d20 r7 = (d20) r6;
    L7:
        if (r7 == null) goto L18;
        a32 r8 = r7.q();
    L10:
        if (r8.D() == true) goto L19;
        c20 r9 = r8.G();
        if ((r9 instanceof d20) == false) goto L15;
        d20 r10 = (d20) r9;
    L16:
        if (r10 == null) goto L18;
        r8 = r10.q();
        goto L10
    L15:
        r10 = null;
    L19:
        this.r = r0;
        return;
    L18:
        r0 = false;
        goto L19
    L5:
        r7 = null;
        goto L7
    }

    @Override // defpackage.a32
    public final boolean D() {
        return this.r;
    }

    @Override // defpackage.a32
    public final boolean E() {
        return true;
    }
}
