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

    public /* synthetic */ q5(int r1) {
        this.g = r1;
    }

    @Override // defpackage.su3
    public final Object B(Intent r6, int r7) {
        boolean r2 = false;
        switch(this.g) {
            case 0: goto L22;
            case 1: goto L8;
            case 2: goto L7;
            default: goto L5;
        };
    L8:
        if (r6 == null) goto L21;
        if (r7 != (-1)) goto L21;
        int[] r5 = r6.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (r5 == null) goto L53;
        int r8 = r5.length;
        int r9 = 0;
    L14:
        if (r9 >= r8) goto L53;
        if (r5[r9] == 0) goto L17;
        r9 = r9 + 1;
        goto L14
    L17:
        r2 = true;
    L53:
        return Boolean.valueOf(r2);
    L21:
        return Boolean.FALSE;
    L22:
        if (r7 != (-1)) goto L45;
        if (r6 == null) goto L45;
        String[] r10 = r6.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] r11 = r6.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (r11 == null) goto L45;
        if (r10 == null) goto L45;
        ArrayList r12 = new ArrayList(r11.length);
        int r0 = r11.length;
        int r1 = 0;
    L31:
        if (r1 >= r0) goto L37;
        if (r11[r1] != 0) goto L35;
        boolean r4 = true;
    L36:
        r12.add(Boolean.valueOf(r4));
        r1 = r1 + 1;
        goto L31
    L35:
        r4 = false;
        goto L36
    L37:
        ArrayList r13 = ti.i0(r10);
        Iterator r14 = r13.iterator();
        Iterator r3 = r12.iterator();
        ArrayList r15 = new ArrayList(Math.min(r40.k0(r13, 10), r40.k0(r12, 10)));
    L39:
        if (r14.hasNext() == false) goto L54;
        if (r3.hasNext() == false) goto L54;
        r15.add(new kd3(r14.next(), r3.next()));
    L54:
        return lg2.Z(r15);
    L45:
        return v01.n;
    L5:
        return new o5(r6, r7);
    L7:
        return new o5(r6, r7);
    }

    @Override // defpackage.su3
    public final Intent n(nc1 r4, Object r5) {
        switch(this.g) {
            case 0: goto L19;
            case 1: goto L17;
            case 2: goto L15;
            default: goto L4;
        };
    L4:
        p02 r6 = (p02) r5;
        Intent r3 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
        Intent r7 = r6.o;
        if (r7 == null) goto L11;
        Bundle r1 = r7.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        if (r1 == null) goto L11;
        r3.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", r1);
        r7.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        if (r7.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false) == false) goto L11;
        r6 = new p02(r6.n, null, r6.p, r6.q);
    L11:
        r3.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", r6);
        if (ld1.I(2) == false) goto L14;
        Log.v("FragmentManager", "CreateIntent created the following intent: " + r3);
    L14:
        return r3;
    L15:
        Intent r8 = (Intent) r5;
        r8.getClass();
        return r8;
    L17:
        String r9 = (String) r5;
        r9.getClass();
        Intent r10 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{r9});
        r10.getClass();
        return r10;
    L19:
        String[] r11 = (String[]) r5;
        r11.getClass();
        Intent r12 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", r11);
        r12.getClass();
        return r12;
    }

    @Override // defpackage.su3
    public zh0 w(nc1 r6, Object r7) {
        switch(this.g) {
            case 0: goto L10;
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        String r8 = (String) r7;
        r8.getClass();
        if (ud3.c(r6, r8) == 0) goto L9;
        return null;
    L9:
        return new zh0(3, Boolean.TRUE);
    L10:
        String[] r9 = (String[]) r7;
        r9.getClass();
        if (r9.length == 0) goto L30;
        int r5 = r9.length;
        int r0 = 0;
        int r3 = 0;
    L14:
        if (r3 >= r5) goto L18;
        if (ud3.c(r6, r9[r3]) != 0) goto L31;
        r3 = r3 + 1;
        goto L14
    L31:
        return null;
    L18:
        int r10 = lg2.W(r9.length);
        if (r10 >= 16) goto L21;
        r10 = 16;
    L21:
        LinkedHashMap r11 = new LinkedHashMap(r10);
        int r12 = r9.length;
    L22:
        if (r0 >= r12) goto L25;
        r11.put(r9[r0], Boolean.TRUE);
        r0 = r0 + 1;
        goto L22
    L25:
        return new zh0(3, r11);
    L30:
        return new zh0(3, v01.n);
    L5:
        return super.w(r6, r7);
    }
}
