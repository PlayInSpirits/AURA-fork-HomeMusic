package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j70 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();
    public final /* synthetic */ nc1 h;

    public j70(nc1 nc1Var) {
        this.h = nc1Var;
    }

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        u5 u5Var = (u5) this.e.get(str);
        if ((u5Var != null ? u5Var.a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                u5Var.a.i(u5Var.b.B(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new o5(intent, i2));
        return true;
    }

    public final void b(int i, su3 su3Var, Object obj) {
        Bundle bundleExtra;
        int i2;
        nc1 nc1Var = this.h;
        zh0 zh0VarW = su3Var.w(nc1Var, obj);
        if (zh0VarW != null) {
            new Handler(Looper.getMainLooper()).post(new gk(this, i, zh0VarW, 1));
            return;
        }
        Intent intentN = su3Var.n(nc1Var, obj);
        if (intentN.getExtras() != null) {
            Bundle extras = intentN.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                intentN.setExtrasClassLoader(nc1Var.getClassLoader());
            }
        }
        if (intentN.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentN.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentN.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentN.getAction())) {
            String[] stringArrayExtra = intentN.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            ud3.f0(nc1Var, stringArrayExtra, i);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentN.getAction())) {
            nc1Var.startActivityForResult(intentN, i, bundle);
            return;
        }
        p02 p02Var = (p02) intentN.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            p02Var.getClass();
            i2 = i;
            try {
                nc1Var.startIntentSenderForResult(p02Var.n, i2, p02Var.o, p02Var.p, p02Var.q, 0, bundle);
            } catch (IntentSender.SendIntentException e) {
                e = e;
                new Handler(Looper.getMainLooper()).post(new gk(this, i2, e, 2));
            }
        } catch (IntentSender.SendIntentException e2) {
            e = e2;
            i2 = i;
        }
    }

    public final w5 c(String str, su3 su3Var, p5 p5Var) {
        d(str);
        this.e.put(str, new u5(p5Var, su3Var));
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            p5Var.i(obj);
        }
        Bundle bundle = this.g;
        o5 o5Var = (o5) hw.l(str, bundle);
        if (o5Var != null) {
            bundle.remove(str);
            p5Var.i(su3Var.B(o5Var.o, o5Var.n));
        }
        return new w5(this, str, su3Var, 1);
    }

    public final void d(String str) {
        LinkedHashMap linkedHashMap = this.b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        t5 t5Var = new t5(0);
        for (Number number : new gb0(new tq4(t5Var, new kl3(8, t5Var), 2))) {
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.a;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        kf2.m("Sequence contains no element matching the predicate.");
    }

    public final void e(String str) {
        Integer num;
        if (!this.d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.e.remove(str);
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            StringBuilder sbJ = xa3.j("Dropping pending result for request ", str, ": ");
            sbJ.append(linkedHashMap.get(str));
            Log.w("ActivityResultRegistry", sbJ.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((o5) hw.l(str, bundle)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.c;
        v5 v5Var = (v5) linkedHashMap2.get(str);
        if (v5Var != null) {
            ArrayList arrayList = v5Var.b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                v5Var.a.f((w92) obj);
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
