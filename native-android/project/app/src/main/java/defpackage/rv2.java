package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import com.eddyizm.tempus.App;
import com.google.common.reflect.TypeToken;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rv2 implements me0, th4, as4, d14, l65, dc5, fv2, s41, Callback, f3, y30 {
    public static final rv2 A = null;
    public static final rv2 B = null;
    public static final rv2 C = null;
    public static final rv2 D = null;
    public static final rv2 E = null;
    public static final rv2 F = null;
    public static final rv2 G = null;
    public static final rv2 H = null;
    public static final rv2 I = null;
    public static final rv2 J = null;
    public static final rv2 K = null;
    public static final rv2 L = null;
    public static final ec5 M = null;
    public static final rv2 o = null;
    public static final /* synthetic */ rv2 p = null;
    public static final /* synthetic */ rv2 q = null;
    public static final rv2 r = null;
    public static final rv2 s = null;
    public static final rv2 t = null;
    public static final rv2 u = null;
    public static final qa3 v = null;
    public static final qa3 w = null;
    public static final rv2 x = null;
    public static final /* synthetic */ rv2 y = null;
    public static final rv2 z = null;
    public final /* synthetic */ int n;

    static {
        o = new rv2(0);
        p = new rv2(1);
        q = new rv2(2);
        r = new rv2(3);
        s = new rv2(4);
        t = new rv2(5);
        u = new rv2(6);
        v = new qa3(1);
        w = new qa3(0);
        x = new rv2(8);
        y = new rv2(9);
        z = new rv2(10);
        A = new rv2(11);
        B = new rv2(12);
        C = new rv2(13);
        D = new rv2(14);
        E = new rv2(15);
        F = new rv2(16);
        G = new rv2(17);
        H = new rv2(18);
        I = new rv2(19);
        J = new rv2(20);
        K = new rv2(21);
        L = new rv2(22);
        M = new ec5();
    }

    public /* synthetic */ rv2(int r1) {
        this.n = r1;
    }

    public static k03 j(String r3) {
        k03 r0 = new k03();
        App.f(false).c().e(r3).enqueue(new p8(r0, 0));
        return r0;
    }

    public static k03 l(String r5) {
        k03 r0 = new k03();
        d7 r1 = new d7(2, r0);
        App.f(false).c().e(r5).enqueue(new gp3(1, r1, r5));
        return r0;
    }

    public static k03 m(String r8, int r9, Integer r10, Integer r11) {
        k03 r1 = new k03(new ArrayList());
        App.f(false).a().q(r8, r9, 0, r10, r11).enqueue(new ew4(r1, r8, r9, r10, r11));
        return r1;
    }

    public static k03 o(int r4, boolean r5) {
        k03 r0 = new k03(new ArrayList());
        App.f(false).a().s().enqueue(new o8(r5, r0, r4, 0));
        return r0;
    }

    @Override // defpackage.fv2
    public void a(qu2 r1, boolean r2) {
    }

    @Override // defpackage.as4
    public float b() {
        return Float.NaN;
    }

    @Override // defpackage.as4
    public long c() {
        int r2 = x40.h;
        return x40.g;
    }

    @Override // defpackage.l65
    public gf1 d(b0 r4) {
        if (r4.isAttachedToWindow() == false) goto L10;
        ba2 r3 = j51.u(r4);
        if (r3 != null) goto L7;
        cz1.c("View tree for " + r4 + " has no ViewTreeLifecycleOwner");
        er1.a();
        return null;
    L7:
        return fu.c(r4, r3.h());
    L10:
        jx3 r5 = new jx3();
        vc1 r0 = new vc1(1, r4, r5);
        r4.addOnAttachStateChangeListener(r0);
        r5.n = new fa(16, r4, r0);
        return new e25(2, r5);
    }

    @Override // defpackage.dc5
    public zb5 e(Context r4, po0 r5) {
        r5.getClass();
        Context r3 = r4;
    L4:
        if ((r3 instanceof ContextWrapper) == false) goto L15;
        if ((r3 instanceof Activity) == true) goto L17;
        if ((r3 instanceof InputMethodService) == true) goto L17;
        ContextWrapper r0 = (ContextWrapper) r3;
        if (r0.getBaseContext() == null) goto L17;
        r3 = r0.getBaseContext();
        r3.getClass();
    L17:
        if ((r3 instanceof Activity) == false) goto L31;
        Activity r6 = (Activity) r3;
        ju.b.getClass();
        int r1 = Build.VERSION.SDK_INT;
        if (r1 < 30) goto L22;
        ju r2 = ku.n;
    L29:
        return new zb5(new hu(r2.a(r6)), r5.c(r6));
    L22:
        if (r1 < 29) goto L25;
        r2 = fz0.D;
        goto L29
    L25:
        if (r1 < 28) goto L27;
        r2 = fz0.C;
        goto L29
    L27:
        r2 = fz0.B;
        goto L29
    L31:
        if ((r3 instanceof InputMethodService) == false) goto L33;
    L37:
        Object r7 = r4.getSystemService("window");
        r7.getClass();
        Display r8 = ((WindowManager) r7).getDefaultDisplay();
        r8.getClass();
        Point r9 = new Point();
        r8.getRealSize(r9);
        return new zb5(new Rect(0, 0, r9.x, r9.y), r5.c(r4));
    L33:
        if ((r3 instanceof Application) == true) goto L37;
        kf2.n("Must provide a UiContext or Application Context");
        return null;
    L15:
        r3 = r4;
        goto L17
    }

    @Override // defpackage.as4
    public uo f() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int g(Object r4, HashMap r5) {
        Integer r0 = (Integer) r5.get(r4);
        if (r0 != null) goto L5;
        boolean r1 = ((TypeToken) r4).getRawType().isInterface();
        Iterator<E> r2 = ((TypeToken) r4).getGenericInterfaces().iterator();
        int r3 = r1;
    L8:
        if (r2.hasNext() == false) goto L10;
        r3 = Math.max(r3, g(r2.next(), r5));
        goto L8
    L10:
        TypeToken r6 = ((TypeToken) r4).getGenericSuperclass();
        int r7 = r3;
        if (r6 == null) goto L13;
        r7 = Math.max(r3, g(r6, r5));
    L13:
        int r8 = r7 + 1;
        r5.put(r4, Integer.valueOf(r8));
        return r8;
    L5:
        return r0.intValue();
    }

    public zz1 h(tb1 r5) {
        String r4 = r5.n;
        if (r4 == null) goto L39;
        int r1 = 1;
        int r2 = 0;
        byte r3 = -1;
        switch(r4.hashCode()) {
            case -1354451219: goto L24;
            case -1348231605: goto L20;
            case -1248341703: goto L16;
            case 1154383568: goto L12;
            case 1652648887: goto L8;
            default: goto L27;
        };
    L27:
        switch(r3) {
            case 0: goto L38;
            case 1: goto L36;
            case 2: goto L34;
            case 3: goto L32;
            case 4: goto L30;
            default: goto L39;
        };
    L30:
        return new vj4();
    L32:
        return new wh(r1);
    L34:
        return new mv1(null);
    L36:
        return new hv1();
    L38:
        return new wh(r2);
    L8:
        if (r4.equals("application/x-scte35") == false) goto L27;
        r3 = 4;
        goto L27
    L12:
        if (r4.equals("application/x-emsg") == false) goto L27;
        r3 = 3;
        goto L27
    L16:
        if (r4.equals("application/id3") == false) goto L27;
        r3 = 2;
        goto L27
    L20:
        if (r4.equals("application/x-icy") == false) goto L27;
        r3 = 1;
        goto L27
    L24:
        if (r4.equals("application/vnd.dvb.ait") == false) goto L27;
        r3 = 0;
    L39:
        kf2.n(xa3.g("Attempted to create decoder for unsupported MIME type: ", r4));
        return null;
    }

    public boolean i(Object r1, Object r2) {
        switch(this.n) {
            case 4: goto L10;
            case 11: goto L6;
            default: goto L5;
        };
    L6:
        if (r1 != r2) goto L8;
        return true;
    L8:
        return false;
    L10:
        return false;
    L5:
        return h12.c(r1, r2);
    }

    @Override // defpackage.s41
    public t41[] k(r41[] r25, cp r26) {
        ArrayList r1 = new ArrayList();
        int r2 = 0;
        int r3 = 0;
    L3:
        int r5 = 1;
        if (r3 >= r25.length) goto L12;
        r41 r4 = r25[r3];
        if (r4 != null) goto L8;
    L10:
        r1.add(null);
    L11:
        r3 = r3 + 1;
        goto L3
    L8:
        if (r4.b.length <= 1) goto L10;
        uw1 r6 = yw1.j();
        r6.c(new d6(0, 0));
        r1.add(r6);
        goto L11
    L12:
        int r7 = r25.length;
        long[][] r8 = new long[r7][];
        int r9 = 0;
    L13:
        long r10 = -1;
        if (r9 >= r25.length) goto L27;
        r41 r11 = r25[r9];
        if (r11 != null) goto L18;
        r8[r9] = new long[0];
    L26:
        r9 = r9 + 1;
        goto L13
    L18:
        int[] r12 = r11.b;
        r8[r9] = new long[r12.length];
        int r13 = 0;
    L20:
        if (r13 >= r12.length) goto L25;
        sv4 r14 = r11.a;
        long r15 = r14.d[r12[r13]].j;
        long[] r16 = r8[r9];
        if (r15 != (-1)) goto L24;
        r15 = 0;
    L24:
        r16[r13] = r15;
        r13 = r13 + 1;
        goto L20
    L25:
        Arrays.sort(r8[r9]);
        goto L26
    L27:
        int[] r17 = new int[r7];
        long[] r18 = new long[r7];
        int r19 = 0;
    L28:
        if (r19 >= r7) goto L34;
        long[] r110 = r8[r19];
        if (r110.length != 0) goto L32;
        long r111 = 0;
    L33:
        r18[r19] = r111;
        r19 = r19 + 1;
        goto L28
    L32:
        r111 = r110[0];
        goto L33
    L34:
        e6.u(r1, r18);
        uc5.f(2, "expectedValuesPerKey");
        TreeMap r20 = new TreeMap(x13.o);
        rz2 r21 = new rz2();
        sz2 r112 = new sz2(r20);
        r112.t = r21;
        int r22 = 0;
    L35:
        if (r22 >= r7) goto L56;
        long[] r23 = r8[r22];
        if (r23.length > 1) goto L40;
        long r113 = r10;
    L55:
        r22 = r22 + 1;
        r2 = r2;
        r10 = r113;
        goto L35
    L40:
        int r24 = r23.length;
        double[] r114 = new double[r24];
        int r115 = r2;
    L41:
        long[] r116 = r8[r22];
        r113 = r10;
        double r117 = 0.0d;
        if (r115 >= r116.length) goto L48;
        long r118 = r116[r115];
        if (r118 == r113) goto L47;
        r117 = Math.log(r118);
    L47:
        r114[r115] = r117;
        r115 = r115 + 1;
        r10 = r113;
        goto L41
    L48:
        int r27 = r24 - 1;
        double r119 = r114[r27] - r114[r2];
        int r120 = r2;
    L49:
        if (r120 >= r27) goto L55;
        double r28 = r114[r120];
        r120 = r120 + 1;
        double r29 = (r28 + r114[r120]) * 0.5d;
        if (r119 != 0.0d) goto L53;
        double r210 = 1.0d;
    L54:
        r112.j(Double.valueOf(r210), Integer.valueOf(r22));
        r2 = r2;
        goto L49
    L53:
        r210 = (r29 - r114[r2]) / r119;
        goto L54
    L56:
        int r211 = r2;
        Collection r30 = r112.p;
        if (r30 != null) goto L59;
        r30 = new s1(r5, r112);
        r112.p = r30;
    L59:
        yw1 r31 = yw1.k(r30);
        int r32 = r211;
    L61:
        if (r32 >= r31.size()) goto L63;
        int r33 = ((Integer) r31.get(r32)).intValue();
        int r34 = r17[r33] + 1;
        r17[r33] = r34;
        r18[r33] = r8[r33][r34];
        e6.u(r1, r18);
        r32 = r32 + 1;
        goto L61
    L63:
        int r35 = r211;
    L65:
        if (r35 >= r25.length) goto L70;
        if (r1.get(r35) == null) goto L69;
        r18[r35] = r18[r35] * 2;
    L69:
        r35 = r35 + 1;
        goto L65
    L70:
        e6.u(r1, r18);
        uw1 r36 = yw1.j();
        int r37 = r211;
    L72:
        if (r37 >= r1.size()) goto L78;
        uw1 r38 = (uw1) r1.get(r37);
        if (r38 != null) goto L76;
        gy3 r39 = gy3.r;
    L77:
        r36.c(r39);
        r37 = r37 + 1;
        goto L72
    L76:
        r39 = r38.f();
        goto L77
    L78:
        gy3 r40 = r36.f();
        t41[] r41 = new t41[r25.length];
        int r42 = r211;
    L80:
        if (r42 >= r25.length) goto L92;
        r41 r43 = r25[r42];
        if (r43 == null) goto L85;
        int[] r44 = r43.b;
        if (r44.length == 0) goto L85;
        int r45 = r44.length;
        sv4 r46 = r43.a;
        if (r45 != 1) goto L89;
        int r47 = r211;
        t41 r48 = new ys0(r46, new int[]{r44[r211]}, r47, r5);
    L90:
        r41[r42] = r48;
    L91:
        r42 = r42 + 1;
        r211 = r47;
        goto L80
    L89:
        r47 = r211;
        r48 = new e6(r46, r44, r26, (yw1) r40.get(r42));
    L85:
        r47 = r211;
        goto L91
    L92:
        return r41;
    }

    public k03 n() {
        k03 r0 = new k03();
        r8 r1 = new r8(this, r0, 0);
        App.f(false).a().q("byYear", 1, 0, 1900, Integer.valueOf(Calendar.getInstance().get(1))).enqueue(new d34(5, r1));
        return r0;
    }

    @Override // retrofit2.Callback
    public void onFailure(Call r1, Throwable r2) {
    }

    @Override // retrofit2.Callback
    public void onResponse(Call r1, Response r2) {
    }

    public boolean p(tb1 r1) {
        String r0 = r1.n;
        if ("application/id3".equals(r0) == false) goto L5;
        return true;
    L5:
        if ("application/x-emsg".equals(r0) == false) goto L7;
        return true;
    L7:
        if ("application/x-scte35".equals(r0) == false) goto L9;
        return true;
    L9:
        if ("application/x-icy".equals(r0) == false) goto L11;
        return true;
    L11:
        if ("application/vnd.dvb.ait".equals(r0) == true) goto L20;
        return false;
    L20:
        return true;
    }

    @Override // defpackage.d14
    public q04 q(q04 r1, db3 r2) {
        return r1;
    }

    public String toString() {
        switch(this.n) {
            case 4: goto L14;
            case 5: goto L12;
            case 11: goto L10;
            case 13: goto L8;
            case 14: goto L6;
            default: goto L5;
        };
    L6:
        return "StructuralEqualityPolicy";
    L8:
        return "Start";
    L10:
        return "ReferentialEqualityPolicy";
    L12:
        return "NoDeclaredBrand";
    L14:
        return "NeverEqualPolicy";
    L5:
        return super.toString();
    }

    @Override // defpackage.fv2
    public boolean w(qu2 r1) {
        return false;
    }
}
