package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g70 implements d93 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nc1 b;

    public /* synthetic */ g70(nc1 r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // defpackage.d93
    public final void a(l70 r10) {
        int r0 = this.a;
        nc1 r9 = this.b;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        mc1 r11 = (mc1) r9.H.o;
        r11.D.b(r11, r11, null);
        return;
    L6:
        r10.getClass();
        Bundle r12 = ((rm3) r9.q.p).A("android:support:activity-result");
        if (r12 == null) goto L26;
        j70 r13 = r9.u;
        LinkedHashMap r1 = r13.b;
        LinkedHashMap r2 = r13.a;
        Bundle r3 = r13.g;
        ArrayList<Integer> r4 = r12.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> r5 = r12.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (r5 == null) goto L31;
        if (r4 == null) goto L32;
        ArrayList<String> r6 = r12.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        if (r6 == null) goto L15;
        r13.d.addAll(r6);
    L15:
        Bundle r14 = r12.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        if (r14 == null) goto L18;
        r3.putAll(r14);
    L18:
        int r15 = r5.size();
        int r7 = 0;
    L19:
        if (r7 >= r15) goto L33;
        String r8 = r5.get(r7);
        if (r1.containsKey(r8) == false) goto L25;
        Integer r16 = (Integer) r1.remove(r8);
        if (r3.containsKey(r8) == true) goto L25;
        jz4.f(r2).remove(r16);
    L25:
        Integer r17 = r4.get(r7);
        r17.getClass();
        int r18 = r17.intValue();
        String r19 = r5.get(r7);
        r19.getClass();
        String r20 = r19;
        r2.put(Integer.valueOf(r18), r20);
        r13.b.put(r20, Integer.valueOf(r18));
        r7 = r7 + 1;
        goto L19
    L33:
        return;
    L32:
        return;
    L31:
        return;
    }
}
