package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cy {
    public static final long f = a35.a(ix2.b(1900, 0).s);
    public static final long g = a35.a(ix2.b(2100, 11).s);
    public long a;
    public long b;
    public Long c;
    public int d;
    public pi0 e;

    public final dy a() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.e);
        ix2 ix2VarC = ix2.c(this.a);
        ix2 ix2VarC2 = ix2.c(this.b);
        pi0 pi0Var = (pi0) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = this.c;
        return new dy(ix2VarC, ix2VarC2, pi0Var, l == null ? null : ix2.c(l.longValue()), this.d);
    }
}
