package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bf3 {
    public final boolean a;
    public final boolean b;

    public bf3(int r4) {
        boolean r1 = true;
        if ((r4 & 1) == 0) goto L5;
        boolean r0 = false;
    L7:
        if ((r4 & 2) == 0) goto L9;
        r1 = false;
    L9:
        this.a = r0;
        this.b = r1;
        return;
    L5:
        r0 = true;
        goto L7
    }
}
