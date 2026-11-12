package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.view.Display;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import androidx.media3.common.ParserException;
import com.eddyizm.tempus.homemusic.SmartSession;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zz1 {
    public static Context a;
    public static Boolean b;
    public static final Object[] c = null;
    public static final f01 d = null;
    public static final f01 e = null;
    public static final f01 f = null;
    public static final f01 g = null;
    public static final f01 h = null;
    public static final n01 i = null;
    public static final n01 j = null;
    public static final p94 k = null;
    public static final p94 l = null;
    public static final p94 m = null;

    static {
        c = new Object[0];
        d = new f01(1, "COMPLETING_ALREADY");
        e = new f01(1, "COMPLETING_WAITING_CHILDREN");
        f = new f01(1, "COMPLETING_RETRY");
        g = new f01(1, "TOO_LATE_TO_CANCEL");
        h = new f01(1, "SEALED");
        i = new n01(false);
        j = new n01(true);
        k = new p94("TestTagsAsResourceId", false, new m94(6));
        l = new p94("AccessibilityClassName", true, new n54(28));
        m = new p94("CredentialRequest", false, new m94(7));
    }

    public static final long A(ey1 r8, hb3 r9, dy1 r10, boolean r11) {
        long r0 = r8.g;
        if (r9 == null) goto L16;
        int r2 = r10.a;
        if (r2 != 1) goto L9;
        float r1 = Float.intBitsToFloat((int) (r0 >> 32));
    L12:
        if (r9 != hb3.o) goto L15;
        long r3 = Float.floatToRawIntBits(r1);
        long r6 = Float.floatToRawIntBits(0.0f);
        long r4 = r3 << 32;
    L14:
        r0 = r4 | (r6 & 4294967295L);
        goto L16
    L15:
        long r5 = Float.floatToRawIntBits(0.0f);
        r6 = Float.floatToRawIntBits(r1);
        r4 = r5 << 32;
        goto L14
    L9:
        if (r2 != 2) goto L16;
        r1 = Float.intBitsToFloat((int) (r0 & 4294967295L));
    L16:
        long r12 = g83.d(B(r8, r9, r10), r0);
        if (r11 == false) goto L19;
    L22:
        return r12;
    L19:
        if (r8.i == false) goto L22;
        return 0;
    }

    public static final long B(ey1 r5, hb3 r6, dy1 r7) {
        if (r6 == null) goto L4;
        int r8 = r7.a;
        if (r8 != 1) goto L9;
        float r9 = Float.intBitsToFloat((int) (r5.c >> 32));
    L12:
        if (r6 != hb3.o) goto L16;
        long r10 = Float.floatToRawIntBits(r9);
        long r3 = Float.floatToRawIntBits(0.0f);
        long r11 = r10 << 32;
    L15:
        return r11 | (4294967295L & r3);
    L16:
        long r12 = Float.floatToRawIntBits(0.0f);
        r3 = Float.floatToRawIntBits(r9);
        r11 = r12 << 32;
        goto L15
    L9:
        if (r8 != 2) goto L18;
        r9 = Float.intBitsToFloat((int) (r5.c & 4294967295L));
        goto L12
    L18:
        return r5.c;
    L4:
        return r5.c;
    }

    public static c05 C(be3 r5, boolean r6, boolean r7) {
        int r0 = 0;
        if (r6 == false) goto L5;
        N(3, r5, false);
    L5:
        r5.y((int) r5.r(), StandardCharsets.UTF_8);
        long r1 = r5.r();
        String[] r8 = new String[(int) r1];
    L7:
        if (r0 >= r1) goto L9;
        r8[r0] = r5.y((int) r5.r(), StandardCharsets.UTF_8);
        r0 = r0 + 1;
        goto L7
    L9:
        if (r7 == false) goto L16;
        if ((r5.A() & 1) != 0) goto L16;
        throw ParserException.a(null, "framing bit expected to be set");
    L16:
        return new c05(r8);
    }

    public static TypedValue D(Context r2, int r3) {
        TypedValue r0 = new TypedValue();
        if (r2.getTheme().resolveAttribute(r3, r0, true) == false) goto L5;
        return r0;
    L5:
        return null;
    }

    public static boolean E(Context r1, int r2, boolean r3) {
        TypedValue r4 = D(r1, r2);
        if (r4 != null) goto L5;
    L12:
        return r3;
    L5:
        if (r4.type != 18) goto L12;
        if (r4.data == 0) goto L10;
        return true;
    L10:
        return false;
    }

    public static TypedValue F(int r1, Context r2, String r3) {
        TypedValue r0 = D(r2, r1);
        if (r0 == null) goto L6;
        return r0;
    L6:
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{r3, r2.getResources().getResourceName(r1)}));
    }

    public static final int G(int r2) {
        int r0 = ((((-16777216) & r2) >>> 24) | ((16711680 & r2) >>> 8)) | ((65280 & r2) << 8);
        return ((r2 & 255) << 24) | r0;
    }

    public static final boolean H(ba1 r12, ba1 r13, int r14, dd0 r15) {
        if (r12.v0() != z91.o) goto L134;
        Object[] r1 = new ba1[16];
        if (r12.n.A == true) goto L7;
        cz1.b("visitChildren called on an unattached node");
    L7:
        f13 r3 = new f13(new cx2[16]);
        cx2 r4 = r12.n;
        cx2 r5 = r4.s;
        if (r5 != null) goto L11;
        j51.b(r3, r4);
    L10:
        int r6 = 0;
    L12:
        int r7 = r3.p;
        cx2 r8 = null;
        if (r7 == 0) goto L49;
        cx2 r9 = (cx2) r3.k(r7 - 1);
        if ((r9.q & 1024) == 0) goto L16;
    L17:
        if (r9 == null) goto L12;
        if ((r9.p & 1024) != 0) goto L20;
        r9 = r9.s;
        goto L17
    L20:
        f13 r10 = null;
    L21:
        if (r9 == null) goto L12;
        if ((r9 instanceof ba1) == true) goto L24;
        if ((r9.p & 1024) == 0) goto L47;
        if ((r9 instanceof fo0) == false) goto L47;
        cx2 r11 = ((fo0) r9).C;
        int r16 = 0;
    L33:
        if (r11 == null) goto L45;
        if ((r11.p & 1024) == 0) goto L44;
        r16 = r16 + 1;
        if (r16 != 1) goto L39;
        r9 = r11;
        goto L44
    L39:
        if (r10 != null) goto L41;
        r10 = new f13(new cx2[16]);
    L41:
        if (r9 == null) goto L43;
        r10.b(r9);
        r9 = null;
    L43:
        r10.b(r11);
    L44:
        r11 = r11.s;
        goto L33
    L45:
        if (r16 == 1) goto L21;
    L47:
        r9 = j51.c(r10);
        goto L21
    L24:
        ba1 r17 = (ba1) r9;
        int r18 = r6 + 1;
        if (r1.length >= r18) goto L27;
        int r19 = r1.length;
        Object[] r110 = new Object[Math.max(r18, r19 * 2)];
        System.arraycopy(r1, 0, r110, 0, r19);
        r1 = r110;
    L27:
        r1[r6] = r17;
        r6 = r18;
        goto L47
    L16:
        j51.b(r3, r9);
        goto L12
    L49:
        Arrays.sort(r1, 0, r6, ca1.o);
        if (r14 != 1) goto L66;
        j02 r20 = gb.g0(0, r6);
        int r21 = r20.n;
        int r22 = r20.o;
        if (r21 > r22) goto L81;
        boolean r23 = false;
    L54:
        if (r23 == false) goto L61;
        ba1 r24 = (ba1) r1[r21];
        if (te5.B(r24) == false) goto L61;
        if (o(r24, r15) == false) goto L61;
    L75:
        return true;
    L61:
        if (h12.c(r1[r21], r13) == false) goto L63;
        r23 = true;
    L63:
        if (r21 == r22) goto L81;
        r21 = r21 + 1;
    L81:
        if (r14 != 1) goto L84;
    L131:
        return false;
    L84:
        if (r12.s0().a == false) goto L131;
        if (r12.n.A == true) goto L88;
        cz1.b("visitAncestors called on an unattached node");
    L88:
        cx2 r111 = r12.n.r;
        c72 r112 = j51.O(r12);
    L89:
        if (r112 == null) goto L127;
        if ((((cx2) r112.Q.g).q & 1024) == 0) goto L121;
    L92:
        if (r111 == null) goto L121;
        if ((r111.p & 1024) == 0) goto L120;
        cx2 r2 = r111;
        f13 r25 = null;
    L96:
        if (r2 == null) goto L120;
        if ((r2 instanceof ba1) == true) goto L99;
        if ((r2.p & 1024) == 0) goto L119;
        if ((r2 instanceof fo0) == false) goto L119;
        cx2 r26 = ((fo0) r2).C;
        int r27 = 0;
    L105:
        if (r26 == null) goto L117;
        if ((r26.p & 1024) == 0) goto L116;
        r27 = r27 + 1;
        if (r27 != 1) goto L111;
        r2 = r26;
        goto L116
    L111:
        if (r25 != null) goto L113;
        r25 = new f13(new cx2[16]);
    L113:
        if (r2 == null) goto L115;
        r25.b(r2);
        r2 = null;
    L115:
        r25.b(r26);
    L116:
        r26 = r26.s;
        goto L105
    L117:
        if (r27 == 1) goto L96;
    L119:
        r2 = j51.c(r25);
        goto L96
    L99:
        r8 = r2;
    L120:
        r111 = r111.r;
    L121:
        r112 = r112.t();
        if (r112 == null) goto L126;
        w12 r113 = r112.Q;
        if (r113 == null) goto L126;
        r111 = (sq4) r113.f;
    L126:
        r111 = null;
    L127:
        if (r8 == null) goto L131;
        return ((Boolean) r15.invoke(r12)).booleanValue();
    L66:
        if (r14 != 2) goto L132;
        j02 r28 = gb.g0(0, r6);
        int r29 = r28.n;
        int r30 = r28.o;
        if (r29 > r30) goto L81;
        boolean r31 = false;
    L70:
        if (r31 == false) goto L77;
        ba1 r32 = (ba1) r1[r30];
        if (te5.B(r32) == false) goto L77;
        if (f(r32, r15) == true) goto L75;
    L77:
        if (h12.c(r1[r30], r13) == false) goto L79;
        r31 = true;
    L79:
        if (r30 == r29) goto L81;
        r30 = r30 - 1;
        goto L70
    L132:
        kf2.o("This function should only be used for 1-D focus search");
        return false;
    L11:
        r3.b(r5);
        goto L10
    L134:
        kf2.o("This function should only be used within a parent that has focus.");
        return false;
    }

    public static final Object[] I(Collection r4) {
        r4.getClass();
        int r0 = r4.size();
        Object[] r1 = c;
        if (r0 != 0) goto L5;
        return r1;
    L5:
        Iterator r5 = r4.iterator();
        if (r5.hasNext() == true) goto L8;
        return r1;
    L8:
        Object[] r2 = new Object[r0];
        int r3 = 0;
    L9:
        int r6 = r3 + 1;
        r2[r3] = r5.next();
        if (r6 < r2.length) goto L24;
        if (r5.hasNext() == false) goto L13;
        int r7 = ((r6 * 3) + 1) >>> 1;
        if (r7 > r6) goto L21;
        r7 = 2147483645;
        if (r6 < 2147483645) goto L21;
        throw new OutOfMemoryError();
    L21:
        r2 = Arrays.copyOf(r2, r7);
    L22:
        r3 = r6;
        goto L9
    L13:
        return r2;
    L24:
        if (r5.hasNext() == true) goto L22;
        return Arrays.copyOf(r2, r6);
    }

    public static final Object[] J(Collection r5, Object[] r6) {
        r5.getClass();
        r6.getClass();
        int r0 = r5.size();
        int r2 = 0;
        if (r0 == 0) goto L5;
        Iterator r7 = r5.iterator();
        if (r7.hasNext() == true) goto L15;
        if (r6.length <= 0) goto L13;
        r6[0] = null;
    L13:
        return r6;
    L15:
        if (r0 > r6.length) goto L17;
        Object[] r1 = r6;
    L18:
        int r3 = r2 + 1;
        r1[r2] = r7.next();
        if (r3 < r1.length) goto L33;
        if (r7.hasNext() == false) goto L22;
        int r4 = ((r3 * 3) + 1) >>> 1;
        if (r4 > r3) goto L30;
        r4 = 2147483645;
        if (r3 < 2147483645) goto L30;
        throw new OutOfMemoryError();
    L30:
        r1 = Arrays.copyOf(r1, r4);
    L31:
        r2 = r3;
        goto L18
    L22:
        return r1;
    L33:
        if (r7.hasNext() == true) goto L31;
        if (r1 != r6) goto L38;
        r6[r3] = null;
        return r6;
    L38:
        return Arrays.copyOf(r1, r3);
    L17:
        Object r8 = Array.newInstance(r6.getClass().getComponentType(), r0);
        r8.getClass();
        r1 = (Object[]) r8;
        goto L18
    L5:
        if (r6.length <= 0) goto L13;
        r6[0] = null;
        return r6;
    }

    public static final String K(byte r3) {
        char[] r0 = e35.d;
        return new String(new char[]{r0[(r3 >> 4) & 15], r0[r3 & 15]});
    }

    public static final String L(int r10) {
        if (r10 != 0) goto L5;
        return "0";
    L5:
        char[] r0 = e35.d;
        int r9 = 0;
        char[] r8 = {r0[(r10 >> 28) & 15], r0[(r10 >> 24) & 15], r0[(r10 >> 20) & 15], r0[(r10 >> 16) & 15], r0[(r10 >> 12) & 15], r0[(r10 >> 8) & 15], r0[(r10 >> 4) & 15], r0[r10 & 15]};
    L6:
        if (r9 >= 8) goto L11;
        if (r8[r9] != '0') goto L11;
        r9 = r9 + 1;
    L11:
        if (r9 < 0) goto L17;
        if (r9 <= 8) goto L14;
        kf2.n(b11.j(r9, "startIndex: ", " > endIndex: 8"));
        return null;
    L14:
        return new String(r8, r9, 8 - r9);
    L17:
        kf2.h(b11.j(r9, "startIndex: ", ", endIndex: 8, size: 8"));
        return null;
    }

    public static final Object M(Object r1) {
        if ((r1 instanceof nx1) == false) goto L5;
        nx1 r0 = (nx1) r1;
    L6:
        if (r0 == null) goto L11;
        mx1 r2 = r0.a;
        if (r2 == null) goto L11;
        return r2;
    L11:
        return r1;
    L5:
        r0 = null;
        goto L6
    }

    public static boolean N(int r3, be3 r4, boolean r5) {
        if (r4.a() >= 7) goto L9;
        if (r5 == false) goto L7;
        return false;
    L7:
        throw ParserException.a(null, "too short header: " + r4.a());
    L9:
        if (r4.A() == r3) goto L15;
        if (r5 == false) goto L13;
        return false;
    L13:
        throw ParserException.a(null, "expected header type " + Integer.toHexString(r3));
    L15:
        if (r4.A() == 118) goto L17;
    L29:
        if (r5 == false) goto L33;
        return false;
    L33:
        throw ParserException.a(null, "expected characters 'vorbis'");
    L17:
        if (r4.A() != 111) goto L29;
        if (r4.A() != 114) goto L29;
        if (r4.A() != 98) goto L29;
        if (r4.A() != 105) goto L29;
        if (r4.A() != 115) goto L29;
        return true;
    }

    public static final int a(cf2 r5, pp1 r6) {
        cf2 r0 = r5.d0();
        if (r0 != null) goto L7;
        cz1.b("Child of " + r5 + " cannot be null when calculating alignment line");
    L7:
        if (r5.h0().a().containsKey(r6) == false) goto L12;
        Integer r7 = (Integer) r5.h0().a().get(r6);
        if (r7 != null) goto L11;
    L14:
        return Integer.MIN_VALUE;
    L11:
        return r7.intValue();
    L12:
        int r1 = r0.c0(r6);
        if (r1 == Integer.MIN_VALUE) goto L14;
        boolean r2 = r5.A;
        boolean r3 = r5.B;
        r0.A = true;
        r5.B = true;
        r5.n0();
        r0.A = r2;
        r5.B = r3;
        if ((r6 instanceof pp1) == false) goto L20;
        long r8 = r0.j0() & 4294967295L;
    L19:
        return r1 + ((int) r8);
    L20:
        r8 = r0.j0() >> 32;
        goto L19
    }

    public static final boolean b(ey1 r1) {
        if (r1.h == true) goto L5;
        return false;
    L5:
        if (r1.d == true) goto L10;
        return true;
    L10:
        return false;
    }

    public static final void c(Logger r1, ar4 r2, fr4 r3, String r4) {
        r1.fine(r3.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{r4}, 1)) + ": " + r2.a);
    }

    public static final float d(ig3 r6, boolean r7, rp1[] r8, float r9) {
        int r0 = r8.length;
        float r1 = Float.NaN;
        int r3 = 0;
    L3:
        if (r3 >= r0) goto L14;
        float r4 = r6.b(r8[r3]);
        if (Float.isNaN(r1) == false) goto L7;
    L11:
        r1 = r4;
    L12:
        r3 = r3 + 1;
        goto L3
    L7:
        if (r4 <= r1) goto L9;
        boolean r5 = true;
    L10:
        if (r7 != r5) goto L12;
    L9:
        r5 = false;
        goto L10
    L14:
        if (Float.isNaN(r1) == false) goto L16;
        return r9;
    L16:
        return r1;
    }

    public static final boolean e(int r4, int r5, int r6, byte[] r7, byte[] r8) {
        r7.getClass();
        r8.getClass();
        int r1 = 0;
    L3:
        if (r1 >= r6) goto L8;
        if (r7[r1 + r4] != r8[r1 + r5]) goto L6;
        r1 = r1 + 1;
        goto L3
    L6:
        return false;
    L8:
        return true;
    }

    public static final boolean f(ba1 r7, dd0 r8) {
        int r0 = r7.v0().ordinal();
        if (r0 == 0) goto L45;
        if (r0 == 1) goto L18;
        if (r0 == 2) goto L45;
        if (r0 == 3) goto L9;
        er1.n();
        return false;
    L9:
        if (x(r7, r8) == false) goto L11;
    L39:
        return true;
    L11:
        if (r7.s0().a == false) goto L13;
        boolean r9 = ((Boolean) r8.invoke(r7)).booleanValue();
    L14:
        if (r9 == true) goto L39;
    L38:
        return false;
    L13:
        r9 = false;
        goto L14
    L18:
        ba1 r1 = te5.s(r7);
        if (r1 == null) goto L42;
        int r6 = r1.v0().ordinal();
        if (r6 == 0) goto L41;
        if (r6 == 1) goto L30;
        if (r6 == 2) goto L41;
        if (r6 == 3) goto L27;
        er1.n();
        return false;
    L27:
        kf2.o("ActiveParent must have a focusedChild");
        return false;
    L30:
        if (f(r1, r8) == true) goto L39;
        if (p(r7, r1, 2, r8) == true) goto L39;
        if (r1.s0().a == false) goto L38;
        if (((Boolean) r8.invoke(r1)).booleanValue() == false) goto L38;
    L41:
        return p(r7, r1, 2, r8);
    L42:
        kf2.o("ActiveParent must have a focusedChild");
        return false;
    L45:
        return x(r7, r8);
    }

    public static void g(float r6, float[] r7) {
        if (r6 > 0.5f) goto L6;
        r7[0] = 1.0f - (r6 * 2.0f);
        r7[1] = 0.0f;
        return;
    L6:
        r7[0] = 0.0f;
        r7[1] = (r6 * 2.0f) - 1.0f;
    }

    public static final boolean h(ey1 r1) {
        if (r1.h == false) goto L5;
        return false;
    L5:
        if (r1.d == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static final void i(long r4, long r6, long r8) {
        if ((r6 | r8) < 0) goto L10;
        if (r6 > r4) goto L10;
        if ((r4 - r6) < r8) goto L10;
        return;
    L10:
        throw new ArrayIndexOutOfBoundsException("size=" + r4 + " offset=" + r6 + " byteCount=" + r8);
    }

    public static long l(int r4, int r5, int r6, int r7) {
        int r0 = 262142;
        int r8 = Math.min(r6, 262142);
        int r1 = Integer.MAX_VALUE;
        if (r7 != Integer.MAX_VALUE) goto L5;
        int r9 = Integer.MAX_VALUE;
    L6:
        if (r9 != Integer.MAX_VALUE) goto L8;
        int r2 = r8;
    L10:
        if (r2 >= 8191) goto L13;
    L21:
        if (r5 == Integer.MAX_VALUE) goto L25;
        r1 = Math.min(r0, r5);
    L25:
        return qc0.a(Math.min(r0, r4), r1, r8, r9);
    L13:
        if (r2 >= 32767) goto L16;
        r0 = 65534;
        goto L21
    L16:
        if (r2 >= 65535) goto L19;
        r0 = 32766;
        goto L21
    L19:
        if (r2 >= 262143) goto L26;
        r0 = 8190;
        goto L21
    L26:
        qc0.i(r2);
        er1.a();
        return 0;
    L8:
        r2 = r9;
        goto L10
    L5:
        r9 = Math.min(r7, 262142);
        goto L6
    }

    public static long m(int r4, int r5, int r6, int r7) {
        int r0 = 262142;
        int r8 = Math.min(r4, 262142);
        int r1 = Integer.MAX_VALUE;
        if (r5 != Integer.MAX_VALUE) goto L5;
        int r9 = Integer.MAX_VALUE;
    L6:
        if (r9 != Integer.MAX_VALUE) goto L8;
        int r2 = r8;
    L10:
        if (r2 >= 8191) goto L13;
    L21:
        if (r7 == Integer.MAX_VALUE) goto L25;
        r1 = Math.min(r0, r7);
    L25:
        return qc0.a(r8, r9, Math.min(r0, r6), r1);
    L13:
        if (r2 >= 32767) goto L16;
        r0 = 65534;
        goto L21
    L16:
        if (r2 >= 65535) goto L19;
        r0 = 32766;
        goto L21
    L19:
        if (r2 >= 262143) goto L26;
        r0 = 8190;
        goto L21
    L26:
        qc0.i(r2);
        er1.a();
        return 0;
    L8:
        r2 = r9;
        goto L10
    L5:
        r9 = Math.min(r5, 262142);
        goto L6
    }

    public static final String n(long r18) {
        if (r18 > (-999500000)) goto L6;
        String r0 = b11.p(new StringBuilder(), (r18 - 500000000) / 1000000000, " s ");
    L19:
        return String.format("%6s", Arrays.copyOf(new Object[]{r0}, 1));
    L6:
        if (r18 > (-999500)) goto L9;
        r0 = b11.p(new StringBuilder(), (r18 - 500000) / 1000000, " ms");
        goto L19
    L9:
        if (r18 > 0) goto L12;
        r0 = b11.p(new StringBuilder(), (r18 - 500) / 1000, " µs");
        goto L19
    L12:
        if (r18 >= 999500) goto L15;
        r0 = b11.p(new StringBuilder(), (r18 + 500) / 1000, " µs");
        goto L19
    L15:
        if (r18 >= 999500000) goto L17;
        r0 = b11.p(new StringBuilder(), (r18 + 500000) / 1000000, " ms");
        goto L19
    L17:
        r0 = b11.p(new StringBuilder(), (r18 + 500000000) / 1000000000, " s ");
        goto L19
    }

    public static final boolean o(ba1 r4, dd0 r5) {
        int r0 = r4.v0().ordinal();
        if (r0 == 0) goto L30;
        if (r0 != 1) goto L7;
        ba1 r1 = te5.s(r4);
        if (r1 != null) goto L21;
        kf2.o("ActiveParent must have a focusedChild");
        return false;
    L21:
        if (o(r1, r5) == false) goto L23;
    L26:
        return true;
    L23:
        if (p(r4, r1, 1, r5) == true) goto L26;
        return false;
    L7:
        if (r0 == 2) goto L30;
        if (r0 == 3) goto L11;
        er1.n();
        return false;
    L11:
        if (r4.s0().a == false) goto L15;
        return ((Boolean) r5.invoke(r4)).booleanValue();
    L15:
        return y(r4, r5);
    L30:
        return y(r4, r5);
    }

    public static final boolean p(ba1 r8, ba1 r9, int r10, dd0 r11) {
        if (H(r8, r9, r10, r11) == false) goto L6;
        return true;
    L6:
        Boolean r12 = (Boolean) uc5.U(r8, r10, new x50(((ey) ((ra) j51.P(r8)).getFocusOwner()).f(), r8, r9, r10, r11, 1));
        if (r12 != null) goto L9;
        return false;
    L9:
        return r12.booleanValue();
    }

    public static jl1 q(SSLSession r6) {
        List r0 = u01.n;
        String r1 = r6.getCipherSuite();
        if (r1 != null) goto L5;
        kf2.o("cipherSuite == null");
        return null;
    L5:
        if (r1.equals("TLS_NULL_WITH_NULL_NULL") == false) goto L7;
        boolean r3 = true;
    L8:
        if (r3 == true) goto L28;
        v20 r2 = v20.b.u(r1);
        String r4 = r6.getProtocol();
        if (r4 != null) goto L12;
        kf2.o("tlsVersion == null");
        return null;
    L12:
        if ("NONE".equals(r4) == true) goto L24;
        mu4.o.getClass();
        mu4 r5 = xi4.m(r4);
        Certificate[] r7 = r6.getPeerCertificates();     // Catch: SSLPeerUnverifiedException -> L32
        if (r7 == null) goto L18;
        List r8 = ze5.f(Arrays.copyOf(r7, r7.length));     // Catch: SSLPeerUnverifiedException -> L32
    L19:
        Certificate[] r9 = r6.getLocalCertificates();
        if (r9 == null) goto L23;
        r0 = ze5.f(Arrays.copyOf(r9, r9.length));
    L23:
        return new jl1(r5, r2, r0, new hl1(r8, 1));
    L18:
        r8 = r0;
        goto L19
    L24:
        mj0.i("tlsVersion == NONE");
        return null;
    L28:
        mj0.i("cipherSuite == ".concat(r1));
        return null;
    L7:
        r3 = r1.equals("SSL_NULL_WITH_NULL_NULL");
        goto L8
    }

    public static Drawable r(Context r1, int r2) {
        return c14.c().d(r1, r2);
    }

    public static final cz s(vd0 r2) {
        if ((r2 instanceof mr0) == false) goto L5;
        cz r0 = ((mr0) r2).j();
        if (r0 == null) goto L16;
        if (r0.C() == true) goto L12;
        r0 = null;
    L12:
        if (r0 == null) goto L16;
        return r0;
    L16:
        return new cz(2, r2);
    L5:
        return new cz(1, r2);
    }

    public static j34 t(Display r3, int r4) {
        if (Build.VERSION.SDK_INT < 31) goto L20;
        RoundedCorner r5 = hd0.n(r3, r4);
        if (r5 == null) goto L20;
        int r0 = go2.a(r5);
        if (r0 == 0) goto L17;
        int r1 = 1;
        if (r0 == 1) goto L19;
        r1 = 2;
        if (r0 == 2) goto L19;
        r1 = 3;
        if (r0 == 3) goto L19;
        kf2.n(f34.f(r0, "Invalid position: "));
        return null;
    L19:
        return new j34(r1, go2.A(r5), go2.b(r5));
    L17:
        r1 = 0;
    L20:
        return null;
    }

    public static boolean u(MotionEvent r0, int r1) {
        if ((r0.getSource() & r1) != r1) goto L6;
        return true;
    L6:
        return false;
    }

    public static Typeface v(Configuration r2, Typeface r3) {
        if (Build.VERSION.SDK_INT >= 31) goto L5;
        return null;
    L5:
        if (hd0.a(r2) != Integer.MAX_VALUE) goto L7;
        return null;
    L7:
        if (hd0.a(r2) == 0) goto L14;
        if (r3 == null) goto L15;
        int r0 = vl4.a(r3);
        return sr0.g(r3, su3.l(hd0.a(r2) + r0, 1, 1000), r3.isItalic());
    L15:
        return null;
    L14:
        return null;
    }

    public static qv2 w(List r8) {
        ArrayList r0 = new ArrayList();
        int r2 = 0;
    L4:
        if (r2 >= r8.size()) goto L17;
        String r3 = (String) r8.get(r2);
        String r4 = f35.a;
        String[] r5 = r3.split("=", 2);
        if (r5.length == 2) goto L9;
        l93.q0("VorbisUtil", "Failed to parse Vorbis comment: ".concat(r3));
    L15:
        r2 = r2 + 1;
        goto L4
    L9:
        if (r5[0].equals("METADATA_BLOCK_PICTURE") == true) goto L21;
        r0.add(new r85(r5[0], r5[1]));
        goto L15
    L21:
        r0.add(dg3.d(new be3(Base64.decode(r5[1], 0))));     // Catch: RuntimeException -> L12
    L12:
        e = move-exception;
        l93.r0("VorbisUtil", "Failed to parse vorbis picture", e);
        goto L15
    L17:
        if (r0.isEmpty() == false) goto L20;
        return null;
    L20:
        return new qv2(r0);
    }

    public static final boolean x(ba1 r11, dd0 r12) {
        Object[] r1 = new ba1[16];
        if (r11.n.A == true) goto L5;
        cz1.b("visitChildren called on an unattached node");
    L5:
        f13 r2 = new f13(new cx2[16]);
        cx2 r13 = r11.n;
        cx2 r3 = r13.s;
        if (r3 != null) goto L9;
        j51.b(r2, r13);
    L8:
        int r14 = 0;
    L10:
        int r4 = r2.p;
        if (r4 == 0) goto L47;
        cx2 r5 = (cx2) r2.k(r4 - 1);
        if ((r5.q & 1024) == 0) goto L14;
    L15:
        if (r5 == null) goto L10;
        if ((r5.p & 1024) != 0) goto L18;
        r5 = r5.s;
        goto L15
    L18:
        f13 r7 = null;
    L19:
        if (r5 == null) goto L10;
        if ((r5 instanceof ba1) == true) goto L22;
        if ((r5.p & 1024) == 0) goto L45;
        if ((r5 instanceof fo0) == false) goto L45;
        cx2 r8 = ((fo0) r5).C;
        int r9 = 0;
    L31:
        if (r8 == null) goto L43;
        if ((r8.p & 1024) == 0) goto L42;
        r9 = r9 + 1;
        if (r9 != 1) goto L37;
        r5 = r8;
        goto L42
    L37:
        if (r7 != null) goto L39;
        r7 = new f13(new cx2[16]);
    L39:
        if (r5 == null) goto L41;
        r7.b(r5);
        r5 = null;
    L41:
        r7.b(r8);
    L42:
        r8 = r8.s;
        goto L31
    L43:
        if (r9 == 1) goto L19;
    L45:
        r5 = j51.c(r7);
        goto L19
    L22:
        ba1 r6 = (ba1) r5;
        int r10 = r14 + 1;
        if (r1.length >= r10) goto L25;
        int r15 = r1.length;
        Object[] r16 = new Object[Math.max(r10, r15 * 2)];
        System.arraycopy(r1, 0, r16, 0, r15);
        r1 = r16;
    L25:
        r1[r14] = r6;
        r14 = r10;
        goto L45
    L14:
        j51.b(r2, r5);
        goto L10
    L47:
        Arrays.sort(r1, 0, r14, ca1.o);
        int r17 = r14 - 1;
        if (r17 >= r1.length) goto L56;
    L49:
        if (r17 < 0) goto L56;
        ba1 r0 = (ba1) r1[r17];
        if (te5.B(r0) == false) goto L55;
        if (f(r0, r12) == false) goto L55;
        return true;
    L55:
        r17 = r17 - 1;
    L56:
        return false;
    L9:
        r2.b(r3);
        goto L8
    }

    public static final boolean y(ba1 r11, dd0 r12) {
        Object[] r1 = new ba1[16];
        if (r11.n.A == true) goto L5;
        cz1.b("visitChildren called on an unattached node");
    L5:
        f13 r2 = new f13(new cx2[16]);
        cx2 r13 = r11.n;
        cx2 r3 = r13.s;
        if (r3 != null) goto L9;
        j51.b(r2, r13);
    L8:
        int r14 = 0;
    L10:
        int r4 = r2.p;
        if (r4 == 0) goto L47;
        cx2 r5 = (cx2) r2.k(r4 - 1);
        if ((r5.q & 1024) == 0) goto L14;
    L15:
        if (r5 == null) goto L10;
        if ((r5.p & 1024) != 0) goto L18;
        r5 = r5.s;
        goto L15
    L18:
        f13 r7 = null;
    L19:
        if (r5 == null) goto L10;
        if ((r5 instanceof ba1) == true) goto L22;
        if ((r5.p & 1024) == 0) goto L45;
        if ((r5 instanceof fo0) == false) goto L45;
        cx2 r8 = ((fo0) r5).C;
        int r9 = 0;
    L31:
        if (r8 == null) goto L43;
        if ((r8.p & 1024) == 0) goto L42;
        r9 = r9 + 1;
        if (r9 != 1) goto L37;
        r5 = r8;
        goto L42
    L37:
        if (r7 != null) goto L39;
        r7 = new f13(new cx2[16]);
    L39:
        if (r5 == null) goto L41;
        r7.b(r5);
        r5 = null;
    L41:
        r7.b(r8);
    L42:
        r8 = r8.s;
        goto L31
    L43:
        if (r9 == 1) goto L19;
    L45:
        r5 = j51.c(r7);
        goto L19
    L22:
        ba1 r6 = (ba1) r5;
        int r10 = r14 + 1;
        if (r1.length >= r10) goto L25;
        int r15 = r1.length;
        Object[] r16 = new Object[Math.max(r10, r15 * 2)];
        System.arraycopy(r1, 0, r16, 0, r15);
        r1 = r16;
    L25:
        r1[r14] = r6;
        r14 = r10;
        goto L45
    L14:
        j51.b(r2, r5);
        goto L10
    L47:
        Arrays.sort(r1, 0, r14, ca1.o);
        int r0 = 0;
    L48:
        if (r0 >= r14) goto L55;
        ba1 r17 = (ba1) r1[r0];
        if (te5.B(r17) == false) goto L54;
        if (o(r17, r12) == false) goto L54;
        return true;
    L54:
        r0 = r0 + 1;
        goto L48
    L55:
        return false;
    L9:
        r2.b(r3);
        goto L8
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1, types: [int] */
    /* JADX WARN: Type inference failed for: r38v12 */
    /* JADX WARN: Type inference failed for: r42v0, types: [android.view.ViewStructure] */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v8, types: [boolean] */
    public static final void z(ViewStructure r42, c72 r43, AutofillId r44, String r45, yv3 r46) {
        p94 r2 = n94.a;
        p94 r3 = d94.a;
        e94 r4 = r43.v();
        int r12 = 8;
        boolean r15 = true;
        if (r4 == null) goto L80;
        w03 r5 = r4.n;
        if (r5 == null) goto L80;
        long r16 = 128;
        Object[] r6 = r5.b;
        Object[] r7 = r5.c;
        long[] r8 = r5.a;
        long r18 = 255;
        int r9 = r8.length - 2;
        if (r9 < 0) goto L78;
        boolean r29 = true;
        int r10 = 0;
        mb r20 = null;
        boolean r21 = false;
        qu4 r22 = null;
        he r23 = null;
        wb r24 = null;
        qd0 r25 = null;
        Boolean r26 = null;
        m24 r27 = null;
        boolean r28 = false;
        Integer r30 = null;
        Object r31 = null;
        char r32 = 7;
    L9:
        long r11 = r8[r10];
        long r34 = -9187201950435737472L;
        if (((((~r11) << 7) & r11) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L75;
        int r13 = 8 - ((~(r10 - r9)) >>> 31);
        int r14 = 0;
    L12:
        if (r14 >= r13) goto L72;
        if ((r11 & 255) >= 128) goto L70;
        int r36 = (r10 << 3) + r14;
        Object r37 = r6[r36];
        Object r38 = r7[r36];
        p94 r17 = (p94) r37;
        if (h12.c(r17, n94.r) == false) goto L19;
        r38.getClass();
        r20 = (mb) r38;
    L65:
        boolean r39 = r15;
        if (Build.VERSION.SDK_INT < 34) goto L71;
        if (h12.c(r17, m) == false) goto L71;
        r31 = r38;
    L71:
        r11 = r11 >> 8;
        r14 = r14 + 1;
        r15 = r39;
        goto L12
    L19:
        if (h12.c(r17, n94.a) == false) goto L24;
        r38.getClass();
        String r19 = (String) q40.x0((List) r38);
        if (r19 == null) goto L65;
        r42.setContentDescription(r19);
        goto L65
    L24:
        if (h12.c(r17, n94.q) == false) goto L27;
        r38.getClass();
        r25 = (qd0) r38;
        goto L65
    L27:
        if (h12.c(r17, n94.s) == false) goto L30;
        r38.getClass();
        r24 = (wb) r38;
        goto L65
    L30:
        if (h12.c(r17, n94.D) == false) goto L33;
        r38.getClass();
        r23 = (he) r38;
        goto L65
    L33:
        if (h12.c(r17, n94.l) == false) goto L36;
        r38.getClass();
        r42.setFocused(((Boolean) r38).booleanValue());
        goto L65
    L36:
        if (h12.c(r17, n94.N) == false) goto L39;
        r38.getClass();
        r30 = (Integer) r38;
        goto L65
    L39:
        if (h12.c(r17, n94.J) == false) goto L42;
        r28 = r15;
        goto L65
    L42:
        if (h12.c(r17, n94.n) == false) goto L45;
        r38.getClass();
        r29 = ((Boolean) r38).booleanValue();
        goto L65
    L45:
        if (h12.c(r17, n94.w) == false) goto L48;
        r38.getClass();
        r27 = (m24) r38;
        goto L65
    L48:
        if (h12.c(r17, n94.G) == false) goto L51;
        r38.getClass();
        r26 = (Boolean) r38;
        goto L65
    L51:
        if (h12.c(r17, n94.H) == false) goto L54;
        r38.getClass();
        r22 = (qu4) r38;
        goto L65
    L54:
        if (h12.c(r17, d94.b) == false) goto L57;
        r42.setClickable(r15);
        goto L65
    L57:
        if (h12.c(r17, d94.c) == false) goto L60;
        r42.setLongClickable(r15);
        goto L65
    L60:
        if (h12.c(r17, d94.v) == false) goto L63;
        r42.setFocusable(r15);
        goto L65
    L63:
        if (h12.c(r17, d94.k) == false) goto L65;
        r21 = r15;
        goto L65
    L70:
        r39 = r15;
        goto L71
    L72:
        boolean r310 = r15;
        r310 = r310;
        if (r13 != 8) goto L79;
    L76:
        if (r10 == r9) goto L79;
        r10 = r10 + 1;
        r15 = r310 ? 1 : 0;
    L79:
        mb r33 = r20;
        qu4 r35 = r22;
        he r40 = r23;
        wb r41 = r24;
        ?? r311 = r310;
    L81:
        e94 r47 = r43.v();
        if (r47 != null) goto L84;
    L99:
        if (r47 == null) goto L125;
        w03 r48 = r47.n;
        if (r48 == null) goto L125;
        Object[] r49 = r48.b;
        Object[] r50 = r48.c;
        long[] r51 = r48.a;
        int r110 = r51.length - 2;
        if (r110 < 0) goto L125;
        int r111 = 0;
        List r112 = null;
    L105:
        long r113 = r51[r111];
        int r210 = r12;
        List r211 = r112;
        if (((((~r113) << r32) & r113) & r34) == r34) goto L122;
        int r114 = 8 - ((~(r111 - r110)) >>> 31);
        r112 = r211;
        int r52 = 0;
    L108:
        if (r52 >= r114) goto L119;
        if ((r113 & r18) >= r16) goto L117;
        int r212 = (r111 << 3) + r52;
        Object r213 = r49[r212];
        Object r214 = r50[r212];
        int r312 = r52;
        p94 r53 = (p94) r213;
        Object[] r215 = r49;
        if (h12.c(r53, n94.j) == false) goto L115;
        r42.setEnabled(false);
    L118:
        r113 = r113 >> r210;
        r52 = r312 + 1;
        r49 = r215;
        goto L108
    L115:
        if (h12.c(r53, n94.z) == false) goto L118;
        r214.getClass();
        r112 = (List) r214;
        goto L118
    L117:
        r312 = r52;
        r215 = r49;
        goto L118
    L119:
        Object[] r216 = r49;
        int r54 = r210;
        if (r114 != r54) goto L126;
    L123:
        if (r111 == r110) goto L126;
        r111 = r111 + 1;
        r12 = r54;
        r51 = r51;
        r49 = r216;
    L126:
        Integer r55 = Integer.valueOf(r43.o);
        if (r43.t() != null) goto L129;
        r55 = null;
    L129:
        if (r55 == null) goto L132;
        int r56 = r55.intValue();
    L133:
        j3.u(r42, r44, r56);
        r42.setId(r56, r45, null, null);
        if (r33 == null) goto L136;
        Integer r57 = Integer.valueOf(r33.a);
    L141:
        if (r57 == null) goto L143;
        tn.r(r42, r57.intValue());
    L143:
        if (r40 == null) goto L154;
        String r58 = r40.o;
        int r59 = r58.length();
        CharSequence r60 = r58;
        if (r59 > 5000) goto L148;
    L153:
        j3.v(r42, tn.g(r60));
        goto L154
    L148:
        if (Character.isHighSurrogate(r58.charAt(4999)) == true) goto L150;
    L152:
        r60 = qm4.I0(SmartSession.MAX_SONGS, r58);
        goto L153
    L150:
        if (Character.isLowSurrogate(r58.charAt(SmartSession.MAX_SONGS)) == false) goto L152;
        r60 = qm4.I0(4999, r58);
    L154:
        if (r41 == null) goto L156;
        j3.v(r42, r41.a);
    L156:
        if (r25 == null) goto L160;
        String[] r61 = h12.t(r25);
        if (r61 == null) goto L160;
        tn.s(r42, r61);
    L160:
        c72 r62 = (c72) r46.a.b(r43.o);
        if (r62 != null) goto L163;
    L165:
        if (r26 == null) goto L167;
        r42.setSelected(r26.booleanValue());
    L167:
        if (r35 == null) goto L173;
        ?? r63 = r311;
        r42.setCheckable(r63);
        if (r35 != qu4.n) goto L171;
        boolean r1 = r63 == true ? 1 : 0;
    L172:
        r42.setChecked(r1);
        ?? r64 = r63;
    L176:
        qd0.a.getClass();
        String[] r65 = h12.t(pd0.b);
        r65.getClass();
        if (r65.length == 0) goto L223;
        String r66 = r65[0];
        if (r25 == null) goto L185;
        String[] r67 = h12.t(r25);
        if (r67 == null) goto L185;
        if (ti.m0(r67, r66) < 0) goto L185;
        ?? r68 = r64;
    L186:
        if (r28 == true) goto L190;
        if (r68 != 0) goto L190;
        ?? r69 = 0;
    L191:
        if (r69 != 0) goto L195;
        if (r29 == true) goto L195;
        ?? r115 = 0;
    L196:
        j3.w(r42, r115);
        if (((f63) r43.Q.e).J0() == false) goto L199;
        int r70 = 4;
    L200:
        r42.setVisibility(r70);
        if (r112 == null) goto L207;
        int r71 = r112.size();
        String r72 = "";
        int r116 = 0;
    L203:
        if (r116 >= r71) goto L205;
        r72 = r72 + ((he) r112.get(r116)).o + "\n";
        r116 = r116 + 1;
        goto L203
    L205:
        r42.setText(r72);
        r42.setClassName("android.widget.TextView");
    L207:
        if (((c13) r43.n()).isEmpty() == false) goto L210;
        if (r27 == null) goto L210;
        r42.setClassName("android.widget.ImageView");
    L210:
        if (r21 == false) goto L218;
        r42.setClassName("android.widget.EditText");
        if (Build.VERSION.SDK_INT < 28) goto L215;
        if (r30 == null) goto L215;
        i3.s(r42, r30.intValue());
    L215:
        if (r69 == 0) goto L218;
        j3.t(r42);
    L218:
        if (Build.VERSION.SDK_INT < 35) goto L249;
        if (r31 == null) goto L250;
        kf2.k();
        return;
    L250:
        return;
    L249:
        return;
    L199:
        r70 = 0;
    L195:
        r115 = r64;
    L190:
        r69 = r64;
    L185:
        r68 = 0;
        goto L186
    L223:
        kf2.m("Array is empty.");
        return;
    L171:
        r1 = false;
        goto L172
    L173:
        ?? r73 = r311;
        r64 = r73;
        if (r26 == null) goto L176;
        r42.setCheckable(r73);
        r42.setChecked(r26.booleanValue());
        r64 = r73;
        goto L176
    L163:
        if (r62.t == (-4)) goto L165;
        ue1 r74 = r46.c;
        int r75 = r46.e(r62);
        long[] r76 = (long[]) r74.p;
        long r77 = r76[r75];
        long r78 = r76[r75 + 1];
        int r79 = (int) (r77 >> 32);
        int r80 = (int) r77;
        r42.setDimens(r79, r80, 0, 0, ((int) (r78 >> 32)) - r79, ((int) r78) - r80);
        goto L165
    L136:
        if (r21 == false) goto L138;
        r57 = Integer.valueOf(r311);
        goto L141
    L138:
        if (r35 == null) goto L140;
        r57 = 2;
        goto L141
    L140:
        r57 = null;
        goto L141
    L132:
        r56 = -1;
        goto L133
    L122:
        r216 = r49;
        r54 = r210;
        r112 = r211;
    L125:
        r112 = null;
        goto L126
    L84:
        if (r47.p == false) goto L99;
        if (r47.q == true) goto L99;
        r47 = r47.b();
        q03 r81 = new q03(((c13) r43.n()).n.p);
        r81.c(r43.n());
    L90:
        if (r81.i() == false) goto L99;
        c72 r82 = (c72) r81.k(r81.b - 1);
        e94 r117 = r82.v();
        if (r117 == null) goto L90;
        if (r117.p == true) goto L90;
        r47.e(r117);
        if (r117.q == true) goto L90;
        r81.c(r82.n());
        goto L90
    L75:
        r310 = r15 ? 1 : 0;
        goto L76
    L78:
        r310 = true;
        r32 = 7;
        r34 = -9187201950435737472L;
        r29 = true;
        r20 = null;
        r21 = false;
        r22 = null;
        r23 = null;
        r24 = null;
        r25 = null;
        r26 = null;
        r27 = null;
        r28 = false;
        r30 = null;
        r31 = null;
    L80:
        r311 = 1;
        r16 = 128;
        r18 = 255;
        r32 = 7;
        r34 = -9187201950435737472L;
        r29 = true;
        r33 = null;
        r40 = null;
        r41 = null;
        r35 = null;
        r21 = false;
        r25 = null;
        r26 = null;
        r27 = null;
        r28 = false;
        r30 = null;
        r31 = null;
        goto L81
    }

    public qv2 j(uv2 r3) {
        ByteBuffer r0 = r3.r;
        r0.getClass();
        if (r0.position() == 0) goto L5;
    L9:
        boolean r1 = false;
    L10:
        rr2.l(r1);
        return k(r3, r0);
    L5:
        if (r0.hasArray() == false) goto L9;
        if (r0.arrayOffset() != 0) goto L9;
        r1 = true;
        goto L10
    }

    public abstract qv2 k(uv2 r1, ByteBuffer r2);
}
