package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;
import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e10 implements q81 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Serializable o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public e10(jx3 jx3Var, q81 q81Var, String[] strArr, int[] iArr) {
        this.n = 2;
        this.o = jx3Var;
        this.r = q81Var;
        this.p = strArr;
        this.q = iArr;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if (r4.b(r2, r5) == r10) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00aa, code lost:
    
        if (r4.b(r2, r5) == r10) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ac, code lost:
    
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(int[] iArr, vd0 vd0Var) {
        cy4 cy4Var;
        e10 e10Var = this;
        int[] iArr2 = iArr;
        String[] strArr = (String[]) e10Var.p;
        q81 q81Var = (q81) e10Var.r;
        if (vd0Var instanceof cy4) {
            cy4Var = (cy4) vd0Var;
            int i = cy4Var.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                cy4Var.r = i - Integer.MIN_VALUE;
            } else {
                cy4Var = new cy4(e10Var, vd0Var);
            }
        } else {
            cy4Var = new cy4(e10Var, vd0Var);
        }
        Object obj = cy4Var.p;
        int i2 = cy4Var.r;
        Object obj2 = null;
        if (i2 == 0) {
            kb4.X(obj);
            jx3 jx3Var = (jx3) e10Var.o;
            Object obj3 = jx3Var.n;
            xe0 xe0Var = xe0.n;
            if (obj3 == null) {
                Set setT0 = ti.t0(strArr);
                cy4Var.n = e10Var;
                cy4Var.o = iArr2;
                cy4Var.r = 1;
            } else {
                int[] iArr3 = (int[]) e10Var.q;
                ArrayList arrayList = new ArrayList();
                int length = strArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    String str = strArr[i3];
                    int i5 = i4 + 1;
                    Object obj4 = obj2;
                    Object obj5 = jx3Var.n;
                    if (obj5 == null) {
                        kf2.o("Required value was null.");
                        return obj4;
                    }
                    int i6 = iArr3[i4];
                    if (((int[]) obj5)[i6] != iArr2[i6]) {
                        arrayList.add(str);
                    }
                    i3++;
                    obj2 = obj4;
                    i4 = i5;
                }
                if (!arrayList.isEmpty()) {
                    Set setT1 = q40.T0(arrayList);
                    cy4Var.n = e10Var;
                    cy4Var.o = iArr2;
                    cy4Var.r = 2;
                }
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int[] iArr4 = cy4Var.o;
            e10 e10Var2 = cy4Var.n;
            kb4.X(obj);
            iArr2 = iArr4;
            e10Var = e10Var2;
        }
        ((jx3) e10Var.o).n = iArr2;
        return j15.a;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00af  */
    @Override // defpackage.q81
    public final Object b(Object obj, vd0 vd0Var) {
        d10 d10Var;
        int i = this.n;
        j15 j15Var = j15.a;
        boolean z = true;
        Serializable serializable = this.o;
        switch (i) {
            case 0:
                if (vd0Var instanceof d10) {
                    d10Var = (d10) vd0Var;
                    int i2 = d10Var.r;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        d10Var.r = i2 - Integer.MIN_VALUE;
                    } else {
                        d10Var = new d10(this, vd0Var);
                    }
                } else {
                    d10Var = new d10(this, vd0Var);
                }
                Object obj2 = d10Var.p;
                int i3 = d10Var.r;
                if (i3 == 0) {
                    kb4.X(obj2);
                    s22 s22Var = (s22) ((jx3) serializable).n;
                    if (s22Var != null) {
                        s22Var.f(new ChildCancelledException());
                        d10Var.n = this;
                        d10Var.o = obj;
                        d10Var.r = 1;
                        Object objR = s22Var.R(d10Var);
                        xe0 xe0Var = xe0.n;
                        if (objR == xe0Var) {
                            return xe0Var;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        kf2.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = d10Var.o;
                    this = d10Var.n;
                    kb4.X(obj2);
                }
                ((jx3) this.o).n = fu.G((we0) this.p, null, ze0.q, new c10((f10) this.q, (q81) this.r, obj, null), 1);
                return j15Var;
            case 1:
                q02 q02Var = (q02) obj;
                hx3 hx3Var = (hx3) this.q;
                hx3 hx3Var2 = (hx3) this.p;
                hx3 hx3Var3 = (hx3) serializable;
                if (q02Var instanceof bq3) {
                    hx3Var3.n++;
                } else if ((q02Var instanceof cq3) || (q02Var instanceof aq3)) {
                    hx3Var3.n--;
                } else if (q02Var instanceof wp1) {
                    hx3Var2.n++;
                } else if (q02Var instanceof xp1) {
                    hx3Var2.n--;
                } else if (q02Var instanceof p91) {
                    hx3Var.n++;
                } else if (q02Var instanceof q91) {
                    hx3Var.n--;
                }
                int i4 = hx3Var3.n;
                boolean z2 = false;
                boolean z3 = i4 > 0;
                boolean z4 = hx3Var2.n > 0;
                boolean z5 = hx3Var.n > 0;
                ck0 ck0Var = (ck0) this.r;
                if (ck0Var.C != z3) {
                    ck0Var.C = z3;
                    z2 = true;
                }
                if (ck0Var.D != z4) {
                    ck0Var.D = z4;
                    z2 = true;
                }
                if (ck0Var.E != z5) {
                    ck0Var.E = z5;
                } else {
                    z = z2;
                }
                if (z) {
                    jz4.z(ck0Var);
                }
                return j15Var;
            default:
                return a((int[]) obj, vd0Var);
        }
    }

    public /* synthetic */ e10(Serializable serializable, Object obj, Object obj2, Object obj3, int i) {
        this.n = i;
        this.o = serializable;
        this.p = obj;
        this.q = obj2;
        this.r = obj3;
    }
}
