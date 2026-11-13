package retrofit2;

import defpackage.ri0;
import defpackage.vd0;
import defpackage.wd0;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
@ri0(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", l = {119}, m = "suspendAndThrow")
/* loaded from: classes.dex */
public final class KotlinExtensions$suspendAndThrow$1 extends wd0 {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public KotlinExtensions$suspendAndThrow$1(vd0<? super KotlinExtensions$suspendAndThrow$1> vd0Var) {
        super(vd0Var);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return KotlinExtensions.suspendAndThrow(null, this);
    }
}
