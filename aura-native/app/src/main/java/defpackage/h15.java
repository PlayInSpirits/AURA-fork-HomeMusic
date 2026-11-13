package defpackage;

import android.content.Context;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class h15 extends ep4 implements wf1 {
    public /* synthetic */ boolean o;
    public final /* synthetic */ Context p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h15(Context context, vd0 vd0Var) {
        super(2, vd0Var);
        this.p = context;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        h15 h15Var = new h15(this.p, vd0Var);
        h15Var.o = ((Boolean) obj).booleanValue();
        return h15Var;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        h15 h15Var = (h15) create(bool, (vd0) obj2);
        j15 j15Var = j15.a;
        h15Var.invokeSuspend(j15Var);
        return j15Var;
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        kb4.X(obj);
        yb3.a(this.p, RescheduleReceiver.class, this.o);
        return j15.a;
    }
}
