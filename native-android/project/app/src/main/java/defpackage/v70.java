package defpackage;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class v70 extends r14 implements wf1 {
    public int o;
    public int p;
    public int q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ w70 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v70(w70 w70Var, vd0 vd0Var) {
        super(vd0Var);
        this.t = w70Var;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        v70 v70Var = new v70(this.t, vd0Var);
        v70Var.s = obj;
        return v70Var;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        return ((v70) create((ba4) obj, (vd0) obj2)).invokeSuspend(j15.a);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        ba4 ba4Var;
        int i;
        int i2;
        int i3;
        String strE;
        int i4;
        int i5;
        String str;
        w70 w70Var = this.t;
        q03 q03Var = w70Var.n;
        h03 h03Var = w70Var.p;
        int i6 = this.r;
        if (i6 == 0) {
            kb4.X(obj);
            ba4Var = (ba4) this.s;
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            if (i6 != 1) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.q;
            i2 = this.p;
            i3 = this.o;
            ba4Var = (ba4) this.s;
            kb4.X(obj);
        }
        if (i3 >= Math.min(w70Var.q + 10, h03Var.b)) {
            return j15.a;
        }
        int i7 = i3 + 1;
        int iB = h03Var.b(i3);
        switch (iB) {
            case 0:
                strE = "up";
                break;
            case 1:
                Object objF = q03Var.f(i2);
                i2++;
                strE = "down " + objF;
                break;
            case 2:
                strE = xa3.e(h03Var.b(i7), h03Var.b(i3 + 2), "remove ", " ");
                i7 = i3 + 3;
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                int iB2 = h03Var.b(i7);
                int iB3 = h03Var.b(i3 + 2);
                int iB4 = h03Var.b(i3 + 3);
                StringBuilder sbT = b11.t("move ", " ", iB2, iB3, " ");
                sbT.append(iB4);
                strE = sbT.toString();
                i7 = i3 + 4;
                break;
            case 4:
                strE = "clear";
                break;
            case 5:
                i4 = i3 + 2;
                int iB5 = h03Var.b(i7);
                i5 = i2 + 1;
                str = "insertBottomUp " + iB5 + " " + q03Var.f(i2);
                int i8 = i4;
                strE = str;
                i7 = i8;
                i2 = i5;
                break;
            case 6:
                i4 = i3 + 2;
                int iB6 = h03Var.b(i7);
                i5 = i2 + 1;
                str = "insertTopDown " + iB6 + " " + q03Var.f(i2);
                int i9 = i4;
                strE = str;
                i7 = i9;
                i2 = i5;
                break;
            case 7:
                Object objF2 = q03Var.f(i2);
                objF2.getClass();
                jz4.j(2, objF2);
                i2 += 2;
                strE = "apply " + ((wf1) objF2);
                break;
            case 8:
                strE = "reuse " + w70Var.o.f(i);
                i++;
                break;
            case 9:
                strE = "recompose pending";
                break;
            default:
                strE = f34.f(iB, "unknown op: ");
                break;
        }
        this.s = ba4Var;
        this.o = i7;
        this.p = i2;
        this.q = i;
        this.r = 1;
        ba4Var.b(this, i3 + ": " + strE);
        return xe0.n;
    }
}
