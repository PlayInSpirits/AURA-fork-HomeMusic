package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j60 {
    public static final String k = null;
    public static final String l = null;
    public static final String m = null;
    public static final String n = null;
    public static final String o = null;
    public static final String p = null;
    public static final String q = null;
    public static final String r = null;
    public static final String s = null;
    public static final String t = null;
    public final va4 a;
    public final int b;
    public final int c;
    public final int d;
    public final Uri e;
    public final CharSequence f;
    public final Bundle g;
    public final tw1 h;
    public final boolean i;
    public final Object j;

    static {
        String r0 = f35.a;
        k = Integer.toString(0, 36);
        l = Integer.toString(1, 36);
        m = Integer.toString(2, 36);
        n = Integer.toString(3, 36);
        o = Integer.toString(4, 36);
        p = Integer.toString(5, 36);
        q = Integer.toString(6, 36);
        r = Integer.toString(7, 36);
        s = Integer.toString(8, 36);
        t = Integer.toString(9, 36);
    }

    public j60(va4 r1, int r2, int r3, int r4, Uri r5, CharSequence r6, Bundle r7, boolean r8, tw1 r9, Object r10) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
        this.g = new Bundle(r7);
        this.i = r8;
        this.h = r9;
        this.j = r10;
    }

    public static Object a(int r1, Object r2) {
        if (r2 != null) goto L5;
        return null;
    L5:
        switch(r1) {
            case 1: goto L26;
            case 2: goto L23;
            case 3: goto L21;
            case 4: goto L17;
            case 5: goto L14;
            case 6: goto L12;
            case 7: goto L10;
            case 8: goto L8;
            default: goto L6;
        };
    L6:
        return null;
    L8:
        rr2.k("Parameter has incorrect type.", r2 instanceof cw4);
        return r2;
    L10:
        rr2.k("Parameter has incorrect type.", r2 instanceof do2);
        return r2;
    L12:
        rr2.k("Parameter has incorrect type.", r2 instanceof gn2);
        return r2;
    L14:
        rr2.k("Parameter has incorrect type.", r2 instanceof lu3);
        return r2;
    L21:
        rr2.k("Parameter has incorrect type.", r2 instanceof Boolean);
        return r2;
    L23:
        rr2.k("Parameter has incorrect type.", r2 instanceof Integer);
        return r2;
    L17:
        if ((r2 instanceof Double) == false) goto L19;
        r2 = Float.valueOf(((Double) r2).floatValue());
    L19:
        rr2.k("Parameter has incorrect type.", r2 instanceof Float);
        return r2;
    L26:
        if ((r2 instanceof Integer) == false) goto L28;
        r2 = Long.valueOf(((Integer) r2).longValue());
    L28:
        rr2.k("Parameter has incorrect type.", r2 instanceof Long);
        return r2;
    }

    public static boolean c(List r3, int r4) {
        int r1 = 0;
    L4:
        if (r1 >= r3.size()) goto L10;
        if (((j60) r3.get(r1)).h.a(0) == r4) goto L7;
        r1 = r1 + 1;
        goto L4
    L7:
        return true;
    L10:
        return false;
    }

    public static j60 d(va4 r4) {
        String r0 = r4.b;
        Bundle r5 = r4.c;
        boolean r2 = false;
        if (r0.startsWith("androidx.media3.session.PLAYER_COMMAND_") == false) goto L9;
        int r1 = Integer.parseInt(r0.substring(39));
        Object r6 = l("androidx.media3.session.CUSTOM_COMMAND_PARAMETER", m(r1), r5);
        i60 r3 = new i60(0);
        if (r3.b != null) goto L7;
        r2 = true;
    L7:
        rr2.k("sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.", r2);
        r3.c = r1;
        r3.j = a(m(r1), r6);
        return r3.a();
    L9:
        int r7 = Integer.parseInt(r0.substring(40));
        if (r7 != 40010) goto L12;
        int r8 = 5;
    L13:
        Object r9 = l("androidx.media3.session.CUSTOM_COMMAND_PARAMETER", r8, r5);
        i60 r10 = new i60(0);
        r10.e(new va4(r7), r9);
        return r10.a();
    L12:
        r8 = 0;
        goto L13
    }

    public static gy3 g(List r18, wa4 r19, mi3 r20) {
        uw1 r0 = new uw1(4);
        int r1 = 0;
    L4:
        if (r1 >= r18.size()) goto L24;
        j60 r3 = (j60) r18.get(r1);
        va4 r4 = r3.a;
        if (r4 != null) goto L8;
    L11:
        int r5 = r3.b;
        if (r5 == (-1)) goto L18;
        if (r20.a(r5) == false) goto L18;
    L15:
        r0.c(r3);
    L22:
        r1 = r1 + 1;
    L18:
        if (r3.i == false) goto L21;
        r3 = new j60(r3.a, r3.b, r3.c, r3.d, r3.e, r3.f, new Bundle(r3.g), false, r3.h, r3.j);
    L21:
        r0.c(r3);
        goto L22
    L8:
        if (r19.a.contains(r4) == true) goto L15;
    L24:
        return r0.f();
    }

    public static j60 i(int r13, Bundle r14) {
        Bundle r0 = r14.getBundle(k);
        if (r0 != null) goto L5;
        va4 r1 = null;
    L6:
        int r2 = r14.getInt(l, -1);
        int r3 = r14.getInt(m, 0);
        CharSequence r5 = r14.getCharSequence(n, "");
        Bundle r6 = f35.n(r14.getBundle(o));
        if (r13 >= 3) goto L9;
    L12:
        boolean r15 = true;
    L13:
        Uri r7 = (Uri) r14.getParcelable(q);
        int r9 = r14.getInt(r, 0);
        int[] r10 = r14.getIntArray(s);
        i60 r11 = new i60(r9, r3);
        String r4 = t;
        if (r1 != null) goto L16;
    L20:
        if (r2 == (-1)) goto L26;
        Object r16 = l(r4, m(r2), r14);
        if (r11.b != null) goto L24;
        boolean r8 = true;
    L25:
        rr2.k("sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.", r8);
        r11.c = r2;
        r11.j = a(m(r2), r16);
        goto L26
    L24:
        r8 = false;
    L26:
        if (r7 != null) goto L28;
    L32:
        r11.f = r5;
        if (r6 != null) goto L35;
        r6 = Bundle.EMPTY;
    L35:
        r11.g = new Bundle(r6);
        r11.h = r15;
        if (r10 != null) goto L38;
        r10 = new int[]{6};
    L38:
        r11.f(r10);
        return r11.a();
    L28:
        if (Objects.equals(r7.getScheme(), "content") == false) goto L30;
    L31:
        r11.b(r7);
        goto L32
    L30:
        if (Objects.equals(r7.getScheme(), "android.resource") == false) goto L32;
    L16:
        if (r1.a != 40010) goto L18;
        int r12 = 5;
    L19:
        r11.e(r1, l(r4, r12, r14));
        goto L20
    L18:
        r12 = 0;
        goto L19
    L9:
        if (r14.getBoolean(p, true) == true) goto L12;
        r15 = false;
        goto L13
    L5:
        r1 = va4.a(r0);
        goto L6
    }

    public static gy3 j(List r11, boolean r12, boolean r13) {
        if (r11.isEmpty() == false) goto L6;
        vw1 r14 = yw1.o;
        return gy3.r;
    L6:
        int r2 = 0;
        int r3 = -1;
        int r4 = -1;
    L8:
        if (r2 >= r11.size()) goto L30;
        j60 r5 = (j60) r11.get(r2);
        boolean r9 = r5.i;
        tw1 r10 = r5.h;
        if (r9 == false) goto L29;
        if (r5.b() == false) goto L29;
        int r6 = 0;
    L16:
        if (r6 >= r10.o) goto L29;
        int r15 = r10.a(r6);
        if (r15 == 6) goto L29;
        if (r12 == false) goto L24;
        if (r3 != (-1)) goto L24;
        if (r15 != 2) goto L24;
        r3 = r2;
    L24:
        if (r13 == false) goto L28;
        if (r4 != (-1)) goto L28;
        if (r15 != 3) goto L28;
        r4 = r2;
    L28:
        r6 = r6 + 1;
    L29:
        r2 = r2 + 1;
        goto L8
    L30:
        uw1 r16 = yw1.j();
        if (r3 == (-1)) goto L33;
        r16.c(((j60) r11.get(r3)).e(2));
    L33:
        if (r4 == (-1)) goto L35;
        r16.c(((j60) r11.get(r4)).e(3));
    L35:
        int r17 = 0;
    L37:
        if (r17 >= r11.size()) goto L57;
        j60 r7 = (j60) r11.get(r17);
        if (r7.i == false) goto L55;
        if (r7.b() == false) goto L55;
        if (r17 == r3) goto L55;
        if (r17 == r4) goto L55;
        tw1 r8 = r7.h;
        r8.getClass();
        int r18 = 0;
    L47:
        if (r18 >= r8.o) goto L52;
        if (r8.n[r18] == 6) goto L53;
        r18 = r18 + 1;
    L53:
        if (r18 < 0) goto L55;
        r16.c(r7.e(6));
        goto L55
    L52:
        r18 = -1;
    L55:
        r17 = r17 + 1;
        goto L37
    L57:
        return r16.f();
    }

    public static gy3 k(List r8, mi3 r9, Bundle r10) {
        if (r8.isEmpty() == false) goto L6;
        vw1 r11 = yw1.o;
        return gy3.r;
    L6:
        boolean r0 = r9.a.a(new int[]{7, 6});
        boolean r12 = r9.a.a(new int[]{9, 8});
        int r3 = 0;
        boolean r2 = r10.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
        boolean r13 = r10.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        if (r0 == true) goto L11;
        if (r2 == true) goto L11;
        int r1 = 0;
    L12:
        if (r12 == true) goto L18;
        if (r13 == true) goto L18;
        if (r1 != 0) goto L17;
        int r14 = 1;
    L19:
        uw1 r15 = yw1.j();
    L21:
        if (r3 >= r8.size()) goto L33;
        j60 r4 = (j60) r8.get(r3);
        if (r3 == r1) goto L25;
        if (r3 != r14) goto L30;
        r15.c(r4.f(new tw1(new int[]{3, 6})));
    L31:
        r3 = r3 + 1;
        goto L21
    L30:
        r15.c(r4.f(new tw1(new int[]{6})));
        goto L31
    L25:
        if (r14 != (-1)) goto L27;
        r15.c(r4.f(new tw1(new int[]{2, 6})));
        goto L31
    L27:
        r15.c(r4.f(new tw1(new int[]{2, 3, 6})));
        goto L31
    L33:
        return r15.f();
    L17:
        r14 = 0;
    L18:
        r14 = -1;
    L11:
        r1 = -1;
        goto L12
    }

    public static Object l(String r2, int r3, Bundle r4) {
        if (r4.containsKey(r2) == true) goto L5;
        return null;
    L5:
        switch(r3) {
            case 1: goto L22;
            case 2: goto L20;
            case 3: goto L18;
            case 4: goto L16;
            case 5: goto L13;
            case 6: goto L11;
            case 7: goto L9;
            case 8: goto L7;
            default: goto L6;
        };
    L6:
        return null;
    L7:
        Bundle r5 = r4.getBundle(r2);
        r5.getClass();
        return cw4.b(r5);
    L9:
        Bundle r6 = r4.getBundle(r2);
        r6.getClass();
        return do2.b(r6);
    L11:
        Bundle r7 = r4.getBundle(r2);
        r7.getClass();
        return gn2.b(r7);
    L13:
        Bundle r8 = r4.getBundle(r2);
        r8.getClass();
        return lu3.a(r8);
    L16:
        return Float.valueOf(r4.getFloat(r2));
    L18:
        return Boolean.valueOf(r4.getBoolean(r2));
    L20:
        return Integer.valueOf(r4.getInt(r2));
    L22:
        return Long.valueOf(r4.getLong(r2));
    }

    public static int m(int r2) {
        if (r2 != 1) goto L5;
        return 3;
    L5:
        if (r2 != 5) goto L7;
        return 1;
    L7:
        if (r2 != 10) goto L9;
        return 2;
    L9:
        if (r2 != 19) goto L11;
        return 7;
    L11:
        if (r2 != 24) goto L13;
        return 4;
    L13:
        if (r2 != 29) goto L15;
        return 8;
    L15:
        if (r2 == 31) goto L19;
        switch(r2) {
            case 13: goto L32;
            case 14: goto L34;
            case 15: goto L33;
            default: goto L17;
        };
    L17:
        return 0;
    L32:
        return 4;
    L33:
        return 2;
    L34:
        return 3;
    L19:
        return 6;
    }

    public static boolean n(String r1) {
        if (r1.startsWith("androidx.media3.session.PLAYER_COMMAND_") == false) goto L5;
        return true;
    L5:
        if (r1.startsWith("androidx.media3.session.SESSION_COMMAND_") == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final boolean b() {
        Object r0 = this.j;
        va4 r3 = this.a;
        if (r3 == null) goto L13;
        int r4 = r3.a;
        if (r4 != 0) goto L7;
        return true;
    L7:
        if (r4 == 40010) goto L9;
        return false;
    L9:
        if (r0 == null) goto L11;
        return true;
    L11:
        return false;
    L13:
        int r5 = this.b;
        if (r5 != 19) goto L16;
    L24:
        if (r0 == null) goto L26;
        return true;
    L26:
        return false;
    L16:
        if (r5 != 24) goto L18;
    L23:
        return true;
    L18:
        if (r5 == 29) goto L24;
        if (r5 == 31) goto L24;
        switch(r5) {
            case 1: goto L23;
            case 2: goto L23;
            case 3: goto L23;
            case 4: goto L23;
            case 5: goto L24;
            case 6: goto L23;
            case 7: goto L23;
            case 8: goto L23;
            case 9: goto L23;
            case 10: goto L24;
            case 11: goto L23;
            case 12: goto L23;
            case 13: goto L24;
            case 14: goto L23;
            case 15: goto L24;
            default: goto L22;
        };
    L22:
        return false;
    }

    public final j60 e(int r14) {
        va4 r0 = this.a;
        if (r0 != null) goto L5;
    L8:
        Bundle r1 = Bundle.EMPTY;
        if (this.j == null) goto L11;
        r1 = new Bundle();
        p("androidx.media3.session.CUSTOM_COMMAND_PARAMETER", r1);
    L11:
        if (r0 == null) goto L13;
        String r2 = "androidx.media3.session.SESSION_COMMAND_" + r0.a;
    L15:
        return new j60(new va4(r2, r1), -1, this.c, this.d, this.e, this.f, this.g, this.i, new tw1(new int[]{r14}), null);
    L13:
        r2 = "androidx.media3.session.PLAYER_COMMAND_" + this.b;
        goto L15
    L5:
        if (r0.a != 0) goto L8;
        return f(new tw1(new int[]{r14}));
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j60) == true) goto L8;
        return false;
    L8:
        j60 r6 = (j60) r5;
        if (Objects.equals(this.a, r6.a) == true) goto L11;
    L27:
        return false;
    L11:
        if (this.b != r6.b) goto L27;
        if (this.c != r6.c) goto L27;
        if (this.d != r6.d) goto L27;
        if (Objects.equals(this.e, r6.e) == false) goto L27;
        if (TextUtils.equals(this.f, r6.f) == false) goto L27;
        if (this.i != r6.i) goto L27;
        if (this.h.equals(r6.h) == false) goto L27;
        if (Objects.equals(this.j, r6.j) == false) goto L27;
        return true;
    }

    public final j60 f(tw1 r13) {
        if (this.h.equals(r13) == false) goto L5;
        return this;
    L5:
        Bundle r8 = new Bundle(this.g);
        boolean r9 = this.i;
        Object r11 = this.j;
        return new j60(this.a, this.b, this.c, this.d, this.e, this.f, r8, r9, r13, r11);
    }

    public final void h(qi3 r3) {
        if (this.i == false) goto L80;
        Object r1 = this.j;
        int r2 = this.b;
        if (r2 != 19) goto L8;
        if (r1 == null) goto L79;
        r3.l0((do2) r1);
        return;
    L79:
        return;
    L8:
        if (r2 != 24) goto L10;
        if (r1 == null) goto L65;
        r3.R(((Float) r1).floatValue());
        return;
    L65:
        if (r3.B() != 0.0f) goto L68;
        r3.a0();
        return;
    L68:
        r3.A0();
        return;
    L10:
        if (r2 != 29) goto L12;
        if (r1 == null) goto L78;
        r3.M((cw4) r1);
        return;
    L78:
        return;
    L12:
        if (r2 == 31) goto L55;
        switch(r2) {
            case 1: goto L50;
            case 2: goto L48;
            case 3: goto L46;
            case 4: goto L44;
            case 5: goto L41;
            case 6: goto L39;
            case 7: goto L37;
            case 8: goto L35;
            case 9: goto L33;
            case 10: goto L30;
            case 11: goto L28;
            case 12: goto L26;
            case 13: goto L23;
            case 14: goto L18;
            case 15: goto L15;
            default: goto L81;
        };
    L15:
        if (r1 == null) goto L73;
        r3.p0(((Integer) r1).intValue());
        return;
    L73:
        return;
    L18:
        if (r1 == null) goto L21;
        r3.s(((Boolean) r1).booleanValue());
        return;
    L21:
        r3.s(!r3.D0());
        return;
    L23:
        if (r1 == null) goto L74;
        r3.e(((Float) r1).floatValue());
        return;
    L74:
        return;
    L26:
        r3.I0();
        return;
    L28:
        r3.J0();
        return;
    L30:
        if (r1 == null) goto L75;
        r3.W(((Integer) r1).intValue());
        return;
    L75:
        return;
    L33:
        r3.H0();
        return;
    L35:
        r3.c0();
        return;
    L37:
        r3.S();
        return;
    L39:
        r3.A();
        return;
    L41:
        if (r1 == null) goto L76;
        r3.O(((Long) r1).longValue());
        return;
    L76:
        return;
    L44:
        r3.C();
        return;
    L46:
        r3.stop();
        return;
    L48:
        r3.b();
        return;
    L50:
        if (r1 == null) goto L53;
        r3.V(((Boolean) r1).booleanValue());
        return;
    L53:
        r3.V(!r3.q());
        return;
    L81:
        return;
    L55:
        if (r1 == null) goto L77;
        r3.s0((gn2) r1);
        return;
    L77:
        return;
    }

    public final int hashCode() {
        Integer r2 = Integer.valueOf(this.b);
        Integer r3 = Integer.valueOf(this.c);
        Integer r4 = Integer.valueOf(this.d);
        Boolean r6 = Boolean.valueOf(this.i);
        tw1 r8 = this.h;
        Object r9 = this.j;
        return Objects.hash(new Object[]{this.a, r2, r3, r4, this.f, r6, this.e, r8, r9});
    }

    public final Bundle o() {
        Bundle r0 = new Bundle();
        va4 r1 = this.a;
        if (r1 == null) goto L5;
        r0.putBundle(k, r1.b());
    L5:
        int r2 = this.b;
        if (r2 == (-1)) goto L8;
        r0.putInt(l, r2);
    L8:
        int r3 = this.c;
        if (r3 == 0) goto L11;
        r0.putInt(r, r3);
    L11:
        int r4 = this.d;
        if (r4 == 0) goto L14;
        r0.putInt(m, r4);
    L14:
        CharSequence r5 = this.f;
        if (r5 == "") goto L17;
        r0.putCharSequence(n, r5);
    L17:
        Bundle r6 = this.g;
        if (r6.isEmpty() == true) goto L20;
        r0.putBundle(o, r6);
    L20:
        Uri r7 = this.e;
        if (r7 == null) goto L23;
        r0.putParcelable(q, r7);
    L23:
        boolean r8 = this.i;
        if (r8 == true) goto L26;
        r0.putBoolean(p, r8);
    L26:
        tw1 r9 = this.h;
        if (r9.o == 1) goto L29;
    L30:
        int[] r10 = Arrays.copyOfRange(r9.n, 0, r9.o);
        r0.putIntArray(s, r10);
    L32:
        if (this.j == null) goto L34;
        p(t, r0);
    L34:
        return r0;
    L29:
        if (r9.a(0) == 6) goto L32;
        goto L30
    }

    public final void p(String r4, Bundle r5) {
        va4 r1 = this.a;
        if (r1 != null) goto L5;
        int r2 = m(this.b);
    L9:
        Object r3 = this.j;
        switch(r2) {
            case 1: goto L26;
            case 2: goto L24;
            case 3: goto L22;
            case 4: goto L20;
            case 5: goto L18;
            case 6: goto L16;
            case 7: goto L14;
            case 8: goto L12;
            default: goto L11;
        };
    L11:
        return;
    L12:
        r5.putBundle(r4, ((cw4) r3).c());
        return;
    L14:
        r5.putBundle(r4, ((do2) r3).c());
        return;
    L16:
        r5.putBundle(r4, ((gn2) r3).c(false));
        return;
    L18:
        r5.putBundle(r4, ((lu3) r3).c());
        return;
    L20:
        r5.putFloat(r4, ((Float) r3).floatValue());
        return;
    L22:
        r5.putBoolean(r4, ((Boolean) r3).booleanValue());
        return;
    L24:
        r5.putInt(r4, ((Integer) r3).intValue());
        return;
    L26:
        r5.putLong(r4, ((Long) r3).longValue());
        return;
    L5:
        if (r1.a != 40010) goto L7;
        r2 = 5;
        goto L9
    L7:
        r2 = 0;
        goto L9
    }
}
