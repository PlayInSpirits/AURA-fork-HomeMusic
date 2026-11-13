package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class tv2 extends be5 {
    public final long l;

    public tv2(kr3 kr3Var) {
        super(kr3Var);
        Bundle bundle = kr3Var.h().d.I;
        int i = bundle != null ? bundle.getInt("duration", 0) : 0;
        this.l = i > 0 ? f35.Q(i * 1000) : -9223372036854775807L;
    }

    @Override // defpackage.be5
    public final void A(cu4 cu4Var) {
        cu4Var.getClass();
        if (cu4Var.o() == 0) {
            m(cu4Var);
            return;
        }
        bu4 m = cu4Var.m(0, new bu4(), 0L);
        m.getClass();
        long j = m.l;
        boolean z = m.j;
        long j2 = this.l;
        if (j2 != -9223372036854775807L && j == -9223372036854775807L && !z) {
            cu4Var = new sv2(0, j2, cu4Var);
        }
        m(cu4Var);
    }
}
