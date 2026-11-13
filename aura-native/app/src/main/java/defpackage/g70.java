package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class g70 implements d93 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nc1 b;

    public /* synthetic */ g70(nc1 nc1Var, int i) {
        this.a = i;
        this.b = nc1Var;
    }

    @Override // defpackage.d93
    public final void a(l70 l70Var) {
        int i = this.a;
        nc1 nc1Var = this.b;
        switch (i) {
            case 0:
                l70Var.getClass();
                Bundle A = ((rm3) nc1Var.q.p).A("android:support:activity-result");
                if (A != null) {
                    j70 j70Var = nc1Var.u;
                    LinkedHashMap linkedHashMap = j70Var.b;
                    LinkedHashMap linkedHashMap2 = j70Var.a;
                    Bundle bundle = j70Var.g;
                    ArrayList<Integer> integerArrayList = A.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = A.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ArrayList<String> stringArrayList2 = A.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        if (stringArrayList2 != null) {
                            j70Var.d.addAll(stringArrayList2);
                        }
                        Bundle bundle2 = A.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        if (bundle2 != null) {
                            bundle.putAll(bundle2);
                        }
                        int size = stringArrayList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            String str = stringArrayList.get(i2);
                            if (linkedHashMap.containsKey(str)) {
                                Integer num = (Integer) linkedHashMap.remove(str);
                                if (!bundle.containsKey(str)) {
                                    jz4.f(linkedHashMap2).remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i2);
                            num2.getClass();
                            int intValue = num2.intValue();
                            String str2 = stringArrayList.get(i2);
                            str2.getClass();
                            String str3 = str2;
                            linkedHashMap2.put(Integer.valueOf(intValue), str3);
                            j70Var.b.put(str3, Integer.valueOf(intValue));
                        }
                        break;
                    }
                }
                break;
            default:
                mc1 mc1Var = (mc1) nc1Var.H.o;
                mc1Var.D.b(mc1Var, mc1Var, null);
                break;
        }
    }
}
