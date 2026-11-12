package defpackage;

import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yc extends ep4 implements wf1 {
    public final /* synthetic */ int o;

    public /* synthetic */ yc(int r1, vd0 r2, int r3) {
        this.o = r3;
        super(r1, r2);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r2, vd0 r3) {
        switch(this.o) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return new yc(2, r3, 1);
    L7:
        return new yc(2, r3, 0);
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r3, Object r4) {
        int r0 = this.o;
        j15 r1 = j15.a;
        switch(r0) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        ((yc) create((q64) r3, (vd0) r4)).invokeSuspend(r1);
        return r1;
    L7:
        return ((yc) create((we0) r3, (vd0) r4)).invokeSuspend(r1);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r1) {
        switch(this.o) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        kb4.X(r1);
        return j15.a;
    L6:
        kb4.X(r1);
        return Choreographer.getInstance();
    }
}
