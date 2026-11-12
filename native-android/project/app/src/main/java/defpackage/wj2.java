package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wj2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ hg3 o;
    public final /* synthetic */ String p;
    public final /* synthetic */ Bundle q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ pz1 s;

    public wj2(pz1 r2, hg3 r3, String r4, IBinder r5, Bundle r6) {
        this.n = 2;
        this.s = r2;
        this.o = r3;
        this.p = r4;
        this.r = r5;
        this.q = r6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        String r1 = this.p;
        Object r4 = this.r;
        pz1 r6 = this.s;
        hg3 r7 = this.o;
        switch(r0) {
            case 0: goto L61;
            case 1: goto L45;
            default: goto L4;
        };
    L4:
        oj2 r2 = (oj2) ((pn2) r6.o).r.get(((Messenger) r7.o).getBinder());
        String r11 = this.p;
        if (r2 != null) goto L7;
        xa3.s("addSubscription for callback that isn't registered id=", r11, "MBServiceCompat");
        return;
    L7:
        HashMap r3 = r2.f;
        pn2 r8 = (pn2) r6.o;
        IBinder r5 = (IBinder) r4;
        List r9 = (List) r3.get(r11);
        if (r9 != null) goto L10;
        r9 = new ArrayList();
    L10:
        Iterator r10 = r9.iterator();
    L11:
        boolean r12 = r10.hasNext();
        Bundle r13 = this.q;
        if (r12 == false) goto L36;
        ld3 r14 = (ld3) r10.next();
        if (r5 != r14.a) goto L11;
        Bundle r15 = (Bundle) r14.b;
        if (r13 == r15) goto L101;
        if (r13 == null) goto L20;
        if (r15 == null) goto L27;
        if (r13.getInt("android.media.browse.extra.PAGE", -1) != r15.getInt("android.media.browse.extra.PAGE", -1)) goto L11;
        if (r13.getInt("android.media.browse.extra.PAGE_SIZE", -1) != r15.getInt("android.media.browse.extra.PAGE_SIZE", -1)) goto L11;
        return;
    L27:
        if (r13.getInt("android.media.browse.extra.PAGE", -1) != (-1)) goto L11;
        if (r13.getInt("android.media.browse.extra.PAGE_SIZE", -1) != (-1)) goto L11;
        return;
    L20:
        r15.getClass();
        if (r15.getInt("android.media.browse.extra.PAGE", -1) != (-1)) goto L11;
        if (r15.getInt("android.media.browse.extra.PAGE_SIZE", -1) != (-1)) goto L11;
        return;
    L101:
        return;
    L36:
        r9.add(new ld3(r5, r13));
        r3.put(r11, r9);
        r8.g(r11, r2, r13, null);
        r8.s = r2;
        fr2 r16 = r8.b();
        if (r16 != null) goto L40;
    L43:
        r8.s = null;
        return;
    L40:
        if (TextUtils.isEmpty(r11) == false) goto L42;
        l93.q0("MLSLegacyStub", "onSubscribe(): Ignoring empty id from " + r16);
        goto L43
    L42:
        f35.W(r8.z.l, new t6(r8, r16, r13, r11, 14));
        goto L43
    L45:
        oj2 r17 = (oj2) ((pn2) r6.o).r.get(((Messenger) r7.o).getBinder());
        Bundle r18 = this.q;
        if (r17 != null) goto L48;
        l93.q0("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + r1 + ", extras=" + r18);
        return;
    L48:
        pn2 r19 = (pn2) r6.o;
        String r20 = this.p;
        nj2 r21 = new nj2(r20, (v14) r4, 2);
        r19.s = r17;
        if (r18 != null) goto L51;
        Bundle r110 = Bundle.EMPTY;
    L52:
        fr2 r22 = r19.b();
        if (r22 != null) goto L55;
        r21.e();
    L56:
        r19.s = null;
        if (r21.b() == false) goto L60;
        return;
    L60:
        throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + r20 + " extras=" + r18);
    L55:
        r21.a();
        f35.W(r19.z.l, new mr(r19, r20, r22, r21, r110, 7));
        goto L56
    L51:
        r110 = r18;
        goto L52
    L61:
        oj2 r23 = (oj2) ((pn2) r6.o).r.get(((Messenger) r7.o).getBinder());
        if (r23 != null) goto L64;
        l93.q0("MBServiceCompat", "search for callback that isn't registered query=" + r1);
        return;
    L64:
        pn2 r24 = (pn2) r6.o;
        String r25 = this.p;
        nj2 r26 = new nj2(r25, (v14) r4, 1);
        r24.s = r23;
        fr2 r27 = r24.b();
        if (r27 != null) goto L68;
        r26.f(null);
    L74:
        r24.s = null;
        if (r26.b() == true) goto L107;
        kf2.o(xa3.g("onSearch must call detach() or sendResult() before returning for query=", r25));
        return;
    L107:
        return;
    L68:
        if (TextUtils.isEmpty(r25) == false) goto L71;
        l93.q0("MLSLegacyStub", "Ignoring empty query from " + r27);
        r26.f(null);
        goto L74
    L71:
        if ((r27.d instanceof on2) == false) goto L74;
        r26.a();
        f35.W(r24.z.l, new t6(r24, r27, r26, r25, this.q));
        goto L74
    }

    public /* synthetic */ wj2(pz1 r1, hg3 r2, String r3, Bundle r4, v14 r5, int r6) {
        this.n = r6;
        this.s = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
    }
}
