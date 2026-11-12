package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m94 implements wf1 {
    public final /* synthetic */ int n;

    public /* synthetic */ m94(int i) {
        this.n = i;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        switch (this.n) {
            case 0:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.addAll(list2);
                return arrayList;
            case 1:
                return (ac4) obj;
            case 2:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return (qd0) obj;
            case 4:
                return (mb) obj;
            case 5:
                return (wb) obj;
            case 6:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 7:
                if (obj != null || obj2 != null) {
                    kf2.k();
                }
                return null;
            case 8:
                return obj == null ? obj2 : obj;
            case 9:
                i94 i94Var = (i94) obj2;
                Object objValueOf = Float.valueOf(0.0f);
                e94 e94Var = ((i94) obj).d;
                p94 p94Var = n94.t;
                Object objG = e94Var.n.g(p94Var);
                if (objG == null) {
                    objG = objValueOf;
                }
                float fFloatValue = ((Number) objG).floatValue();
                Object objG2 = i94Var.d.n.g(p94Var);
                if (objG2 != null) {
                    objValueOf = objG2;
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objValueOf).floatValue()));
            case 10:
                le0 le0Var = (le0) obj2;
                if (!(le0Var instanceof ht4)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? le0Var : Integer.valueOf(iIntValue + 1);
            case 11:
                ht4 ht4Var = (ht4) obj;
                le0 le0Var2 = (le0) obj2;
                if (ht4Var != null) {
                    return ht4Var;
                }
                if (le0Var2 instanceof ht4) {
                    return (ht4) le0Var2;
                }
                return null;
            case 12:
                mt4 mt4Var = (mt4) obj;
                le0 le0Var3 = (le0) obj2;
                if (le0Var3 instanceof ht4) {
                    ht4 ht4Var2 = (ht4) le0Var3;
                    ne0 ne0Var = mt4Var.a;
                    Object objC = ht4Var2.c();
                    Object[] objArr = mt4Var.b;
                    int i = mt4Var.d;
                    objArr[i] = objC;
                    ht4[] ht4VarArr = mt4Var.c;
                    mt4Var.d = i + 1;
                    ht4VarArr[i] = ht4Var2;
                }
                return mt4Var;
            default:
                fz0.K.invoke(obj);
                return j15.a;
        }
    }
}
