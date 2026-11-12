package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class q5 extends su3 {
    public final /* synthetic */ int g;

    public /* synthetic */ q5(int i) {
        this.g = i;
    }

    @Override // defpackage.su3
    public final Object B(Intent intent, int i) {
        boolean z = false;
        switch (this.g) {
            case 0:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i2 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i2 == 0));
                        }
                        ArrayList arrayListI0 = ti.i0(stringArrayExtra);
                        Iterator it = arrayListI0.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList2 = new ArrayList(Math.min(r40.k0(arrayListI0, 10), r40.k0(arrayList, 10)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList2.add(new kd3(it.next(), it2.next()));
                        }
                        return lg2.Z(arrayList2);
                    }
                }
                return v01.n;
            case 1:
                if (intent == null || i != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra2 != null) {
                    for (int i3 : intArrayExtra2) {
                        if (i3 == 0) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 2:
                return new o5(intent, i);
            default:
                return new o5(intent, i);
        }
    }

    @Override // defpackage.su3
    public final Intent n(nc1 nc1Var, Object obj) {
        Bundle bundleExtra;
        switch (this.g) {
            case 0:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                intentPutExtra.getClass();
                return intentPutExtra;
            case 1:
                String str = (String) obj;
                str.getClass();
                Intent intentPutExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
                intentPutExtra2.getClass();
                return intentPutExtra2;
            case 2:
                Intent intent = (Intent) obj;
                intent.getClass();
                return intent;
            default:
                p02 p02Var = (p02) obj;
                Intent intent2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent3 = p02Var.o;
                if (intent3 != null && (bundleExtra = intent3.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent3.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent3.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        p02Var = new p02(p02Var.n, null, p02Var.p, p02Var.q);
                    }
                }
                intent2.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", p02Var);
                if (ld1.I(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent2);
                }
                return intent2;
        }
    }

    @Override // defpackage.su3
    public zh0 w(nc1 nc1Var, Object obj) {
        switch (this.g) {
            case 0:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                if (strArr.length == 0) {
                    return new zh0(3, v01.n);
                }
                for (String str : strArr) {
                    if (ud3.c(nc1Var, str) != 0) {
                        return null;
                    }
                }
                int iW = lg2.W(strArr.length);
                if (iW < 16) {
                    iW = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new zh0(3, linkedHashMap);
            case 1:
                String str3 = (String) obj;
                str3.getClass();
                if (ud3.c(nc1Var, str3) == 0) {
                    return new zh0(3, Boolean.TRUE);
                }
                return null;
            default:
                return super.w(nc1Var, obj);
        }
    }
}
