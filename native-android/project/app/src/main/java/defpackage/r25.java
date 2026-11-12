package defpackage;

import android.content.IntentFilter;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r25 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ s25 o;

    public /* synthetic */ r25(s25 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        s25 r11 = this.o;
        switch(r0) {
            case 0: goto L10;
            default: goto L34;
        };
    L10:
        ArrayList r1 = new ArrayList();
        Iterator r2 = r11.z.entrySet().iterator();
    L12:
        if (r2.hasNext() == false) goto L32;
        Map.Entry r3 = (Map.Entry) r2.next();
        String r4 = (String) r3.getKey();
        g25 r5 = (g25) r3.getValue();
        String r6 = r5.b;
        if (qm4.u0(r6) == false) goto L16;
        r6 = "UPnP renderer";
    L16:
        ArrayList r7 = new ArrayList();
        ArrayList r8 = new ArrayList();
        HashSet r9 = new HashSet();
        Bundle r10 = new Bundle();
        if (r4 == null) goto L31;
        r10.putString("id", r4);
        r10.putString("name", r6);
        String r12 = r5.d;
        if (qm4.u0(r12) == false) goto L21;
        r12 = r5.c;
    L21:
        r10.putString("status", r12);
        IntentFilter r13 = s25.E;
        if (r13 == null) goto L30;
        if (r8.contains(r13) == true) goto L26;
        r8.add(r13);
    L26:
        r10.putInt("playbackType", 1);
        r10.putInt("volumeHandling", 0);
        r10.putBoolean("enabled", true);
        r10.putParcelableArrayList("controlFilters", new ArrayList(r8));
        r10.putStringArrayList("groupMemberIds", new ArrayList(r7));
        r10.putStringArrayList("allowedPackages", new ArrayList(r9));
        sp2 r14 = new sp2(r10);
        if (r1.contains(r14) == true) goto L29;
        r1.add(r14);
        goto L12
    L29:
        kf2.n("route descriptor already added");
        return;
    L30:
        kf2.n("filter must not be null");
        return;
    L31:
        nz2.n("id must not be null");
        return;
    L32:
        r11.f(new xk0(r1, false));
        return;
    L34:
        s25.h(r11);     // Catch: Throwable -> L7
        r11.C = false;
        return;
    L7:
        th = move-exception;
        r11.C = false;
        throw th;
    }
}
