package defpackage;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l15 implements uw2 {
    public static final l15 b = null;
    public final /* synthetic */ int a;

    static {
        b = new l15(0);
    }

    public /* synthetic */ l15(int r1) {
        this.a = r1;
    }

    @Override // defpackage.uw2
    public final boolean a(Object r1) {
        switch(this.a) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        return false;
    L6:
        File r2 = (File) r1;
        return true;
    L8:
        return true;
    }

    @Override // defpackage.uw2
    public final tw2 b(Object r1, int r2, int r3, db3 r4) {
        switch(this.a) {
            case 0: goto L9;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        return null;
    L6:
        File r5 = (File) r1;
        return new tw2(new s73(r5), new pw(0, r5));
    L9:
        return new tw2(new s73(r1), new pw(1, r1));
    }
}
