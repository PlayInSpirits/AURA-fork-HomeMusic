package defpackage;

import android.content.Context;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h15 extends ep4 implements wf1 {
    public /* synthetic */ boolean o;
    public final /* synthetic */ Context p;

    public h15(Context r1, vd0 r2) {
        this.p = r1;
        super(2, r2);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r2, vd0 r3) {
        h15 r0 = new h15(this.p, r3);
        r0.o = ((Boolean) r2).booleanValue();
        return r0;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r1, Object r2) {
        Boolean r3 = (Boolean) r1;
        r3.booleanValue();
        h15 r0 = (h15) create(r3, (vd0) r2);
        j15 r4 = j15.a;
        r0.invokeSuspend(r4);
        return r4;
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r2) {
        kb4.X(r2);
        boolean r3 = this.o;
        yb3.a(this.p, RescheduleReceiver.class, r3);
        return j15.a;
    }
}
