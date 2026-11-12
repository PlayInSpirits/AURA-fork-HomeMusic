package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class il1 extends q42 implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ gf1 o;

    public /* synthetic */ il1(int r1, gf1 r2) {
        this.n = r1;
        this.o = r2;
        super(0);
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        int r0 = this.n;
        gf1 r1 = this.o;
        switch(r0) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        r1.invoke();
        return j15.a;
    L10:
        return (List) r1.invoke();
    L9:
        return u01.n;
    }
}
