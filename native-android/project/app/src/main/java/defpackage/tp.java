package defpackage;

import androidx.work.impl.WorkDatabase;
import com.eddyizm.tempus.lan.LanReceiverService;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tp implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tp(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        int i2 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    kd3 kd3Var = (kd3) obj2;
                    int iIntValue = ((Number) kd3Var.n).intValue();
                    Object obj3 = kd3Var.o;
                    obj3.getClass();
                    gn2 gn2Var = (gn2) obj3;
                    gn2 gn2VarJ = gi1.J(gn2Var);
                    kd3 kd3Var2 = !h12.c(gn2VarJ.f.a, gn2Var.f.a) ? new kd3(Integer.valueOf(iIntValue), gn2VarJ) : null;
                    if (kd3Var2 != null) {
                        arrayList2.add(kd3Var2);
                    }
                }
                return arrayList2;
            case 1:
                WorkDatabase workDatabase = ((rv1) obj).a;
                Long l = workDatabase.w().l("next_alarm_manager_id");
                int iLongValue = l != null ? (int) l.longValue() : 0;
                workDatabase.w().n(new fp3("next_alarm_manager_id", Long.valueOf(iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0)));
                return Integer.valueOf(iLongValue);
            default:
                boolean z = LanReceiverService.y;
                return ((gf1) obj).invoke();
        }
    }
}
