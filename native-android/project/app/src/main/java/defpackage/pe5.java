package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pe5 extends q42 implements wf1 {
    public final /* synthetic */ int n = 0;
    public final /* synthetic */ xu3 o;
    public final /* synthetic */ jx3 p;
    public final /* synthetic */ jx3 q;
    public final /* synthetic */ jx3 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe5(xu3 xu3Var, jx3 jx3Var, jx3 jx3Var2, jx3 jx3Var3) {
        super(2);
        this.o = xu3Var;
        this.p = jx3Var;
        this.q = jx3Var2;
        this.r = jx3Var3;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i = this.n;
        j15 j15Var = j15.a;
        jx3 jx3Var = this.r;
        jx3 jx3Var2 = this.q;
        jx3 jx3Var3 = this.p;
        xu3 xu3Var = this.o;
        switch (i) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                long jLongValue = ((Number) obj2).longValue();
                if (iIntValue != 1) {
                    return j15Var;
                }
                if (jx3Var3.n != null) {
                    mj0.i("bad zip: NTFS extra attribute tag 0x0001 repeated");
                } else {
                    if (jLongValue == 24) {
                        jx3Var3.n = Long.valueOf(xu3Var.j());
                        jx3Var2.n = Long.valueOf(xu3Var.j());
                        jx3Var.n = Long.valueOf(xu3Var.j());
                        return j15Var;
                    }
                    mj0.i("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                }
                return null;
            default:
                int iIntValue2 = ((Number) obj).intValue();
                long jLongValue2 = ((Number) obj2).longValue();
                if (iIntValue2 != 21589) {
                    return j15Var;
                }
                if (jLongValue2 >= 1) {
                    byte b = xu3Var.readByte();
                    boolean z = (b & 1) == 1;
                    boolean z2 = (b & 2) == 2;
                    boolean z3 = (b & 4) == 4;
                    long j = z ? 5L : 1L;
                    if (z2) {
                        j += 4;
                    }
                    if (z3) {
                        j += 4;
                    }
                    if (jLongValue2 >= j) {
                        if (z) {
                            jx3Var3.n = Integer.valueOf(xu3Var.f());
                        }
                        if (z2) {
                            jx3Var2.n = Integer.valueOf(xu3Var.f());
                        }
                        if (!z3) {
                            return j15Var;
                        }
                        jx3Var.n = Integer.valueOf(xu3Var.f());
                        return j15Var;
                    }
                    mj0.i("bad zip: extended timestamp extra too short");
                } else {
                    mj0.i("bad zip: extended timestamp extra too short");
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe5(jx3 jx3Var, xu3 xu3Var, jx3 jx3Var2, jx3 jx3Var3) {
        super(2);
        this.p = jx3Var;
        this.o = xu3Var;
        this.q = jx3Var2;
        this.r = jx3Var3;
    }
}
