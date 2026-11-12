package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j70 {
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final ArrayList d;
    public final transient LinkedHashMap e;
    public final LinkedHashMap f;
    public final Bundle g;
    public final /* synthetic */ nc1 h;

    public j70(nc1 r1) {
        this.h = r1;
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new ArrayList();
        this.e = new LinkedHashMap();
        this.f = new LinkedHashMap();
        this.g = new Bundle();
    }

    public final boolean a(int r4, int r5, Intent r6) {
        String r7 = (String) this.a.get(Integer.valueOf(r4));
        if (r7 != null) goto L6;
        return false;
    L6:
        u5 r0 = (u5) this.e.get(r7);
        if (r0 == null) goto L9;
        p5 r1 = r0.a;
    L10:
        if (r1 == null) goto L14;
        ArrayList r2 = this.d;
        if (r2.contains(r7) == false) goto L14;
        r0.a.i(r0.b.B(r6, r5));
        r2.remove(r7);
        return true;
    L14:
        this.f.remove(r7);
        o5 r3 = new o5(r6, r5);
        this.g.putParcelable(r7, r3);
        return true;
    L9:
        r1 = null;
        goto L10
    }

    public final void b(int r9, su3 r10, Object r11) {
        nc1 r0 = this.h;
        zh0 r1 = r10.w(r0, r11);
        if (r1 == null) goto L6;
        new Handler(Looper.getMainLooper()).post(new gk(this, r9, r1, 1));
        return;
    L6:
        Intent r12 = r10.n(r0, r11);
        if (r12.getExtras() == null) goto L12;
        Bundle r13 = r12.getExtras();
        r13.getClass();
        if (r13.getClassLoader() != null) goto L12;
        r12.setExtrasClassLoader(r0.getClassLoader());
    L12:
        if (r12.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE") == false) goto L15;
        Bundle r2 = r12.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        r12.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
    L14:
        Bundle r7 = r2;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(r12.getAction()) == false) goto L24;
        String[] r8 = r12.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (r8 != null) goto L21;
        r8 = new String[0];
    L21:
        ud3.f0(r0, r8, r9);
        return;
    L24:
        if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(r12.getAction()) == false) goto L36;
        p02 r14 = (p02) r12.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        r14.getClass();     // Catch: IntentSender.SendIntentException -> L32
        int r3 = r9;
        r0.startIntentSenderForResult(r14.n, r3, r14.o, r14.p, r14.q, 0, r7);     // Catch: IntentSender.SendIntentException -> L30
        return;
    L30:
        e = e;
    L31:
        IntentSender.SendIntentException r15 = e;
        new Handler(Looper.getMainLooper()).post(new gk(this, r3, r15, 2));
        return;
    L32:
        e = e;
        r3 = r9;
        goto L31
    L36:
        r0.startActivityForResult(r12, r9, r7);
        return;
    L15:
        r2 = null;
        goto L14
    }

    public final w5 c(String r3, su3 r4, p5 r5) {
        d(r3);
        u5 r0 = new u5(r5, r4);
        this.e.put(r3, r0);
        LinkedHashMap r1 = this.f;
        if (r1.containsKey(r3) == false) goto L5;
        Object r2 = r1.get(r3);
        r1.remove(r3);
        r5.i(r2);
    L5:
        Bundle r6 = this.g;
        o5 r7 = (o5) hw.l(r3, r6);
        if (r7 == null) goto L9;
        r6.remove(r3);
        int r8 = r7.n;
        r5.i(r4.B(r7.o, r8));
    L9:
        return new w5(this, r3, r4, 1);
    }

    public final void d(String r6) {
        LinkedHashMap r0 = this.b;
        if (((Integer) r0.get(r6)) == null) goto L5;
        return;
    L5:
        t5 r1 = new t5(0);
        Iterator r2 = new gb0(new tq4(r1, new kl3(8, r1), 2)).iterator();
    L7:
        if (r2.hasNext() == false) goto L12;
        Number r3 = (Number) r2.next();
        Integer r4 = Integer.valueOf(r3.intValue());
        LinkedHashMap r5 = this.a;
        if (r5.containsKey(r4) == true) goto L7;
        int r7 = r3.intValue();
        r5.put(Integer.valueOf(r7), r6);
        r0.put(r6, Integer.valueOf(r7));
        return;
    L12:
        kf2.m("Sequence contains no element matching the predicate.");
    }

    public final void e(String r7) {
        if (this.d.contains(r7) == true) goto L7;
        Integer r0 = (Integer) this.b.remove(r7);
        if (r0 == null) goto L7;
        this.a.remove(r0);
    L7:
        this.e.remove(r7);
        LinkedHashMap r1 = this.f;
        if (r1.containsKey(r7) == false) goto L10;
        StringBuilder r2 = xa3.j("Dropping pending result for request ", r7, ": ");
        r2.append(r1.get(r7));
        Log.w("ActivityResultRegistry", r2.toString());
        r1.remove(r7);
    L10:
        Bundle r3 = this.g;
        if (r3.containsKey(r7) == false) goto L13;
        Log.w("ActivityResultRegistry", "Dropping pending result for request " + r7 + ": " + ((o5) hw.l(r7, r3)));
        r3.remove(r7);
    L13:
        LinkedHashMap r6 = this.c;
        v5 r4 = (v5) r6.get(r7);
        if (r4 == null) goto L21;
        ArrayList r5 = r4.b;
        int r8 = r5.size();
        int r9 = 0;
    L16:
        if (r9 >= r8) goto L18;
        Object r10 = r5.get(r9);
        r9 = r9 + 1;
        r4.a.f((w92) r10);
        goto L16
    L18:
        r5.clear();
        r6.remove(r7);
        return;
    }
}
