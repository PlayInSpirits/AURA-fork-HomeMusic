package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class b9 extends Handler {
    public final /* synthetic */ int a;
    public WeakReference b;

    public b9(xx3 r2) {
        this.a = 1;
        this.b = new WeakReference(r2);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message r22) {
        switch(this.a) {
            case 0: goto L114;
            default: goto L4;
        };
    L4:
        xx3 r0 = (xx3) this.b.get();
        if (r0 == null) goto L135;
        SparseArray r2 = r0.h;
        cy3 r4 = r0.i;
        ArrayList r5 = r4.x;
        int r6 = r22.what;
        int r7 = r22.arg1;
        int r8 = r22.arg2;
        Object r9 = r22.obj;
        Bundle r1 = r22.peekData();
        int r10 = 0;
        String r11 = null;
        yx3 r12 = null;
        yx3 r13 = null;
        switch(r6) {
            case 0: goto L106;
            case 1: goto L136;
            case 2: goto L85;
            case 3: goto L79;
            case 4: goto L70;
            case 5: goto L62;
            case 6: goto L56;
            case 7: goto L25;
            case 8: goto L10;
            default: goto L104;
        };
    L25:
        if (r9 != null) goto L27;
    L28:
        Bundle r14 = (Bundle) r9;
        if (r0.f == 0) goto L104;
        Bundle r3 = (Bundle) r14.getParcelable("groupRoute");
        if (r3 == null) goto L33;
        sp2 r15 = new sp2(r3);
    L34:
        ArrayList r16 = r14.getParcelableArrayList("dynamicRoutes");
        ArrayList r17 = new ArrayList();
        int r18 = r16.size();
        int r19 = 0;
    L35:
        if (r19 >= r18) goto L46;
        Object r110 = r16.get(r19);
        r19 = r19 + 1;
        Bundle r111 = (Bundle) r110;
        if (r111 != null) goto L39;
        mq2 r112 = null;
    L44:
        r17.add(r112);
        goto L35
    L39:
        Bundle r113 = r111.getBundle("mrDescriptor");
        if (r113 == null) goto L42;
        sp2 r114 = new sp2(r113);
    L43:
        r112 = new mq2(r114, r111.getInt("selectionState", 1), r111.getBoolean("isUnselectable", false), r111.getBoolean("isGroupable", false), r111.getBoolean("isTransferable", false));
        goto L44
    L42:
        r114 = null;
        goto L43
    L46:
        if (r4.A != r0) goto L137;
        int r20 = r5.size();
    L48:
        if (r10 >= r20) goto L53;
        Object r21 = r5.get(r10);
        r10 = r10 + 1;
        yx3 r23 = (yx3) r21;
        if (r23.a() != r8) goto L48;
        r13 = r23;
    L53:
        if ((r13 instanceof ay3) == false) goto L138;
        ((ay3) r13).l(r15, r17);
        return;
    L138:
        return;
    L137:
        return;
    L33:
        r15 = null;
        goto L34
    L27:
        if ((r9 instanceof Bundle) == false) goto L104;
    L62:
        if (r9 != null) goto L64;
    L65:
        Bundle r24 = (Bundle) r9;
        if (r0.f == 0) goto L104;
        xk0 r25 = xk0.h(r24);
        if (r4.A != r0) goto L140;
        r4.f(r25);
        return;
    L140:
        return;
    L64:
        if ((r9 instanceof Bundle) == false) goto L104;
    L70:
        if (r9 != null) goto L72;
    L73:
        if (r1 == null) goto L76;
        r11 = r1.getString("error");
    L76:
        Bundle r26 = (Bundle) r9;
        if (((zx3) r2.get(r7)) == null) goto L104;
        r2.remove(r7);
        zx3.a(r11, r26);
        return;
    L72:
        if ((r9 instanceof Bundle) == false) goto L104;
    L79:
        if (r9 != null) goto L81;
    L82:
        Bundle r27 = (Bundle) r9;
        zx3 r28 = (zx3) r2.get(r7);
        if (r28 == null) goto L104;
        r2.remove(r7);
        r28.b(r27);
        return;
    L81:
        if ((r9 instanceof Bundle) == false) goto L104;
    L85:
        if (r9 != null) goto L87;
    L88:
        Bundle r29 = (Bundle) r9;
        if (r0.f != 0) goto L104;
        if (r7 != r0.g) goto L104;
        if (r8 < 1) goto L104;
        r0.g = 0;
        r0.f = r8;
        xk0 r30 = xk0.h(r29);
        if (r4.A != r0) goto L97;
        r4.f(r30);
    L97:
        if (r4.A != r0) goto L144;
        r4.B = true;
        int r31 = r5.size();
    L99:
        if (r10 >= r31) goto L101;
        ((yx3) r5.get(r10)).b(r4.A);
        r10 = r10 + 1;
        goto L99
    L101:
        up2 r32 = r4.r;
        if (r32 == null) goto L145;
        xx3 r33 = r4.A;
        int r34 = r33.d;
        r33.d = r34 + 1;
        r33.b(10, r34, 0, r32.a, null);
        return;
    L145:
        return;
    L144:
        return;
    L87:
        if ((r9 instanceof Bundle) == true) goto L88;
    L104:
        int r35 = cy3.D;
        return;
    L136:
        return;
    L10:
        if (r4.A != r0) goto L104;
        int r36 = r5.size();
    L12:
        if (r10 >= r36) goto L16;
        Object r37 = r5.get(r10);
        r10 = r10 + 1;
        yx3 r38 = (yx3) r37;
        if (r38.a() != r8) goto L12;
        r12 = r38;
    L16:
        ss2 r39 = r4.C;
        if (r39 != null) goto L19;
    L23:
        if (r12 == null) goto L104;
        r5.remove(r12);
        r12.c();
        r4.l();
        goto L104
    L19:
        if ((r12 instanceof oq2) == false) goto L23;
        oq2 r40 = (oq2) r12;
        ui1 r41 = (ui1) ((ip0) r39.o).c;
        if (r41.d != r40) goto L23;
        r41.i(r41.c(), 2, true);
        goto L23
    L56:
        if ((r9 instanceof Bundle) == false) goto L61;
        Bundle r42 = (Bundle) r9;
        zx3 r43 = (zx3) r2.get(r7);
        if (r42.containsKey("routeId") == false) goto L60;
        r2.remove(r7);
        r43.b(r42);
        goto L104
    L60:
        r43.getClass();
        zx3.a("DynamicGroupRouteController is created without valid route id.", r42);
        goto L104
    L61:
        Log.w("MediaRouteProviderProxy", "No further information on the dynamic group controller");
        goto L104
    L106:
        if (r7 != r0.g) goto L111;
        r0.g = 0;
        if (r4.A != r0) goto L111;
        r4.k();
    L111:
        if (((zx3) r2.get(r7)) == null) goto L148;
        r2.remove(r7);
        zx3.a(null, null);
        return;
    L148:
        return;
    L135:
        return;
    L114:
        int r44 = r22.what;
        if (r44 != (-3)) goto L117;
    L123:
        ((DialogInterface.OnClickListener) r22.obj).onClick((DialogInterface) this.b.get(), r22.what);
        return;
    L117:
        if (r44 == (-2)) goto L123;
        if (r44 == (-1)) goto L123;
        if (r44 != 1) goto L150;
        ((DialogInterface) r22.obj).dismiss();
        return;
    }

    public /* synthetic */ b9() {
        this.a = 0;
    }
}
