package defpackage;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.a;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ry1 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ ry1(gx3 gx3Var, hy2 hy2Var, e74 e74Var, ey2 ey2Var) {
        this.n = 2;
        this.q = gx3Var;
        this.o = hy2Var;
        this.p = e74Var;
        this.r = ey2Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x009c  */
    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        int i = this.n;
        j15 j15Var = j15.a;
        Object obj2 = this.o;
        Object obj3 = this.r;
        Object obj4 = this.q;
        Object obj5 = this.p;
        switch (i) {
            case 0:
                ty1 ty1Var = (ty1) obj5;
                gx3 gx3Var = (gx3) obj4;
                we0 we0Var = (we0) obj3;
                long jLongValue = ((Long) obj).longValue();
                kl4 kl4Var = (kl4) ((b13) obj2).getValue();
                long jLongValue2 = kl4Var != null ? ((Number) kl4Var.getValue()).longValue() : jLongValue;
                long j = ty1Var.c;
                f13 f13Var = ty1Var.a;
                if (j == Long.MIN_VALUE || gx3Var.n != j51.v(we0Var.e())) {
                    ty1Var.c = jLongValue;
                    Object[] objArr = f13Var.n;
                    int i2 = f13Var.p;
                    for (int i3 = 0; i3 < i2; i3++) {
                        ((qy1) objArr[i3]).s = true;
                    }
                    gx3Var.n = j51.v(we0Var.e());
                }
                float f = gx3Var.n;
                if (f == 0.0f) {
                    Object[] objArr2 = f13Var.n;
                    int i4 = f13Var.p;
                    for (int i5 = 0; i5 < i4; i5++) {
                        qy1 qy1Var = (qy1) objArr2[i5];
                        qy1Var.p.setValue(qy1Var.q.c);
                        qy1Var.s = true;
                    }
                } else {
                    long j2 = (long) ((jLongValue2 - ty1Var.c) / f);
                    Object[] objArr3 = f13Var.n;
                    int i6 = f13Var.p;
                    boolean z = true;
                    for (int i7 = 0; i7 < i6; i7++) {
                        qy1 qy1Var2 = (qy1) objArr3[i7];
                        if (!qy1Var2.r) {
                            qy1Var2.u.b.setValue(Boolean.FALSE);
                            if (qy1Var2.s) {
                                qy1Var2.s = false;
                                qy1Var2.t = j2;
                            }
                            long j3 = j2 - qy1Var2.t;
                            qy1Var2.p.setValue(qy1Var2.q.f(j3));
                            qy1Var2.r = qy1Var2.q.e(j3);
                        }
                        if (!qy1Var2.r) {
                            z = false;
                        }
                    }
                    ty1Var.d.setValue(Boolean.valueOf(!z));
                }
                return j15Var;
            case 1:
                q82 q82Var = (q82) obj2;
                q82Var.c = new ll((c82) obj5, (kn4) obj4, (wp3) obj3);
                return new a82(1, q82Var);
            case 2:
                gx3 gx3Var2 = (gx3) obj4;
                hy2 hy2Var = (hy2) obj2;
                e74 e74Var = (e74) obj5;
                ey2 ey2Var = (ey2) obj3;
                vd vdVar = (vd) obj;
                float fFloatValue = ((Number) vdVar.e.getValue()).floatValue() - gx3Var2.n;
                if (h12.b(fFloatValue)) {
                    if (((Boolean) ey2Var.invoke(Float.valueOf(gx3Var2.n))).booleanValue()) {
                        vdVar.a();
                    }
                } else if (h12.b(fFloatValue - hy2Var.G(e74Var, fFloatValue))) {
                    gx3Var2.n += fFloatValue;
                    if (((Boolean) ey2Var.invoke(Float.valueOf(gx3Var2.n))).booleanValue()) {
                        vdVar.a();
                    }
                } else {
                    vdVar.a();
                }
                return j15Var;
            default:
                Context context = (Context) obj5;
                Uri uri = (Uri) obj4;
                ((yr0) obj).getClass();
                wq4 i73Var = new i73((b13) obj2, 0);
                vz3 vz3VarA = a.c(context).g().N(uri).a(wg0.a(8, context, (String) obj3));
                vz3VarA.getClass();
                vz3 vz3VarA2 = xt3.a(vz3VarA, uri);
                vz3VarA2.getClass();
                vz3VarA2.J(i73Var, null, vz3VarA2, fh0.g);
                return new vy1(2, context, i73Var);
        }
    }

    public /* synthetic */ ry1(Context context, Uri uri, String str, b13 b13Var) {
        this.n = 3;
        this.p = context;
        this.q = uri;
        this.r = str;
        this.o = b13Var;
    }

    public /* synthetic */ ry1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
        this.q = obj3;
        this.r = obj4;
    }
}
