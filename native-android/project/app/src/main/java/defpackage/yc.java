package defpackage;

import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yc extends ep4 implements wf1 {
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yc(int i, vd0 vd0Var, int i2) {
        super(i, vd0Var);
        this.o = i2;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        switch (this.o) {
            case 0:
                return new yc(2, vd0Var, 0);
            default:
                return new yc(2, vd0Var, 1);
        }
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.o;
        j15 j15Var = j15.a;
        switch (i) {
            case 0:
                return ((yc) create((we0) obj, (vd0) obj2)).invokeSuspend(j15Var);
            default:
                ((yc) create((q64) obj, (vd0) obj2)).invokeSuspend(j15Var);
                return j15Var;
        }
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        switch (this.o) {
            case 0:
                kb4.X(obj);
                return Choreographer.getInstance();
            default:
                kb4.X(obj);
                return j15.a;
        }
    }
}
