package defpackage;

import android.R;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Looper;
import android.text.Layout;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import com.google.android.gms.internal.fido.zzhf;
import com.google.android.gms.internal.fido.zzhj;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vr1 {
    public static final f01 a = null;
    public static final byte[] b = null;

    static {
        int r2 = 1;
        a = new f01(r2, "RESUME_TOKEN");
        b = new byte[4096];
    }

    public vr1() {
        new ConcurrentHashMap();
    }

    public static yc4 A(ContentResolver r11, Uri r12, String r13, String r14) {
        r12.getClass();
        String r2 = null;
        long r3 = -1;
        ContentResolver r5 = r11;
        Uri r6 = r12;
        Cursor r15 = r5.query(r6, new String[]{"_display_name", "_size"}, null, null, null);     // Catch: Exception -> L35
        if (r15 != null) goto L85;
        String r16 = null;
    L40:
        if (r16 != null) goto L42;
    L43:
        String r17 = r6.getLastPathSegment();
        if (r17 == null) goto L46;
        r16 = qm4.G0(r17, '/', r17);
    L47:
        String r18 = r5.getType(r6);
        if (r18 != null) goto L56;
        MimeTypeMap r19 = MimeTypeMap.getSingleton();
        if (r16 == null) goto L52;
        String r1 = qm4.G0(r16, '.', "").toLowerCase(Locale.ROOT);
        r1.getClass();
    L53:
        r18 = r19.getMimeTypeFromExtension(r1);
        if (r18 != null) goto L56;
    L57:
        if (r16 == null) goto L65;
        if (qm4.u0(r16) == true) goto L61;
        r2 = r16;
    L61:
        if (r2 == null) goto L65;
        r14 = r2;
    L65:
        if (qm4.n0(r14, '.') == true) goto L72;
        String r110 = (String) yc4.d.get(r13);
        if (r110 != null) goto L69;
        r110 = MimeTypeMap.getSingleton().getExtensionFromMimeType(r13);
    L69:
        if (r110 == null) goto L72;
        r14 = b11.o(r14, ".", r110);
    L72:
        return new yc4(r14, r3, r13);
    L52:
        r1 = null;
    L56:
        r13 = r18;
        goto L57
    L46:
        r16 = null;
        goto L47
    L42:
        if (qm4.u0(r16) == false) goto L47;
    L85:
    L13:
        th = move-exception;
        Throwable r111 = th;
        String r4 = null;
    L81:
        throw r111;     // Catch: Throwable -> L29
    L29:
        th = move-exception;
        q05.h(r15, r111);     // Catch: Exception -> L32
        throw th;     // Catch: Exception -> L32
    L32:
        e = move-exception;
        Exception r112 = e;
        r16 = r4;
    L39:
        Log.w("SharedFile", "Cannot query " + r6, r112);
        goto L40
    L8:
        if (r15.moveToFirst() == false) goto L23;
        int r113 = r15.getColumnIndex("_display_name");     // Catch: Throwable -> L13
        int r0 = r15.getColumnIndex("_size");     // Catch: Throwable -> L13
        if (r113 < 0) goto L15;
        r16 = r15.getString(r113);     // Catch: Throwable -> L13
    L16:
        if (r0 < 0) goto L77;
    L21:
        th = move-exception;
        r4 = r16;
        r111 = th;
        goto L81
    L18:
        if (r15.isNull(r0) == true) goto L77;
        r3 = r15.getLong(r0);     // Catch: Throwable -> L21
    L77:
        r15.close();     // Catch: Exception -> L26
    L26:
        e = move-exception;
        r112 = e;
        goto L39
    L15:
        r16 = null;
        goto L16
    L23:
        r16 = null;
    L35:
        e = e;
    L36:
        r112 = e;
        r16 = null;
    L37:
        e = e;
        r5 = r11;
        r6 = r12;
        goto L36
    }

    public static PorterDuff.Mode B(int r1, PorterDuff.Mode r2) {
        if (r1 == 3) goto L21;
        if (r1 == 5) goto L19;
        if (r1 == 9) goto L17;
        switch(r1) {
            case 14: goto L15;
            case 15: goto L13;
            case 16: goto L11;
            default: goto L9;
        };
    L9:
        return r2;
    L11:
        return PorterDuff.Mode.ADD;
    L13:
        return PorterDuff.Mode.SCREEN;
    L15:
        return PorterDuff.Mode.MULTIPLY;
    L17:
        return PorterDuff.Mode.SRC_ATOP;
    L19:
        return PorterDuff.Mode.SRC_IN;
    L21:
        return PorterDuff.Mode.SRC_OVER;
    }

    public static final Object C(mf3 r1, qr3 r2) {
        r2.getClass();
        Object r0 = r1.get(r2);
        if (r0 != null) goto L6;
        r0 = r2.b();
    L6:
        return ((j35) r0).a(r1);
    }

    public static int D(InputStream r3, byte[] r4, int r5, int r6) {
        if (r6 < 0) goto L14;
        if (r5 < 0) goto L14;
        if ((r6 + r5) > r4.length) goto L14;
        int r0 = 0;
    L7:
        if (r0 == r6) goto L12;
        int r1 = r3.read(r4, r5 + r0, r6 - r0);
        if (r1 == (-1)) goto L12;
        r0 = r0 + r1;
    L12:
        return r0;
    L14:
        throw new IndexOutOfBoundsException();
    }

    public static int E(InputStream r3) {
        byte[] r1 = new byte[8];
        if (r3.read(r1) < 8) goto L14;
        byte r4 = r1[7];
        int r0 = ((((((((((((((r4 & 127) * 256) + (r1[6] & 255)) * 256) + (r1[5] & 255)) * 256) + (r1[4] & 255)) * 256) + (r1[3] & 255)) * 256) + (r1[2] & 255)) * 256) + (r1[1] & 255)) * 256) + (r1[0] & 255);
        if (r0 >= 0) goto L7;
        mj0.i("Integer overflow: 64-bit offsets not supported.");
        return 0;
    L7:
        if ((r4 & 128) != 0) goto L9;
        return r0;
    L9:
        return -r0;
    L14:
        mj0.i("Could not read offset.");
        return 0;
    }

    public static final dx2 F(dx2 r7, lm0 r8, tb r9, boolean r10, gd3 r11, rm2 r12, ec3 r13) {
        sp1 r0 = sp1.b;
        return r7.c(au0.G(ax2.a, r0, 1042431)).c(new r64(r8, r10, r11, r12, r13, r9));
    }

    public static long G(InputStream r7, long r8) {
        long r0 = r8;
    L4:
        if (r0 <= 0) goto L10;
        long r4 = r7.skip(r0);
        if (r4 == 0) goto L10;
        r0 = r0 - r4;
    L10:
        if (r0 <= 0) goto L16;
        int r5 = (int) Math.min(r0, 4096);
        int r6 = D(r7, b, 0, r5);
        if (r6 < 1) goto L16;
        r0 = r0 - ((long) r6);
    L16:
        return r8 - r0;
    }

    public static String H(long r2) {
        return "PointerId(value=" + r2 + ")";
    }

    public static final mf3 I(rr3[] r6, mf3 r7, mf3 r8) {
        lf3 r1 = new lf3(mf3.q);
        int r0 = r6.length;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L11;
        rr3 r3 = r6[r2];
        qr3 r4 = r3.a;
        if (r3.g == false) goto L7;
    L8:
        r1.put(r4, r4.d(r3, (j35) r8.get(r4)));
    L9:
        r2 = r2 + 1;
        goto L3
    L7:
        if (r7.containsKey(r4) == true) goto L9;
    L11:
        return r1.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v6 */
    public static final ak5 J(ck5 r10) {
        bk5 r1 = r10.n();     // Catch: IOException -> L85
        if (r1 == null) goto L84;
        byte r2 = r1.b;     // Catch: Throwable -> L80
        byte r3 = r1.a;     // Catch: Throwable -> L80
        ?? r6 = 0;
        int r7 = 0;
        if (r3 != (-128)) goto L91;
        long r0 = r10.b();     // Catch: Throwable -> L80 Throwable -> L80
        if (r0 > 1000) goto L79;
        K(r2, r0);     // Catch: Throwable -> L80 Throwable -> L80
        ak5[] r4 = new ak5[(int) r0];     // Catch: Throwable -> L80 Throwable -> L80
    L74:
        if (((long) r6) >= r0) goto L77;
        r4[r6] = J(r10);     // Catch: Throwable -> L80 Throwable -> L80
        r6 = r6 + 1;     // Catch: Throwable -> L80 Throwable -> L80
        goto L74
    L77:
        return new uj5(ei5.j(r4));
    L79:
        throw new zzhj("Parser being asked to read a large CBOR array");     // Catch: Throwable -> L80 Throwable -> L80
    L91:
        if (r3 != (-96)) goto L11;
        long r5 = r10.j();     // Catch: Throwable -> L80 Throwable -> L80
        if (r5 > 1000) goto L69;
        K(r2, r5);     // Catch: Throwable -> L80 Throwable -> L80
        int r8 = (int) r5;     // Catch: Throwable -> L80 Throwable -> L80
        qr2[] r9 = new qr2[r8];     // Catch: Throwable -> L80 Throwable -> L80
        ak5 r11 = null;
        int r12 = 0;
    L45:
        if (r12 >= r5) goto L56;
        ak5 r13 = J(r10);     // Catch: Throwable -> L80 Throwable -> L80
        if (r11 == null) goto L55;
        if (r13.compareTo(r11) > 0) goto L55;
        throw new zzhf("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: " + r11.toString() + "\nCurrent key: " + r13.toString());     // Catch: Throwable -> L80 Throwable -> L80
    L55:
        r9[r12] = new qr2(r13, J(r10), r6, 22);     // Catch: Throwable -> L80 Throwable -> L80
        r12 = r12 + 1;     // Catch: Throwable -> L80 Throwable -> L80
        r11 = r13;
        goto L45
    L56:
        TreeMap r14 = new TreeMap();     // Catch: Throwable -> L80 Throwable -> L80
    L57:
        if (r7 >= r8) goto L67;
        qr2 r15 = r9[r7];     // Catch: Throwable -> L80 Throwable -> L80
        if (r14.containsKey((ak5) r15.o) == true) goto L65;
        r14.put((ak5) r15.o, (ak5) r15.p);     // Catch: Throwable -> L80 Throwable -> L80
        r7 = r7 + 1;     // Catch: Throwable -> L80 Throwable -> L80
        goto L57
    L65:
        throw new zzhf("Attempted to add duplicate key to canonical CBOR Map.");     // Catch: Throwable -> L80 Throwable -> L80
    L67:
        return new yj5(ji5.b(r14));
    L69:
        throw new zzhj("Parser being asked to read a large CBOR map");     // Catch: Throwable -> L80 Throwable -> L80
    L11:
        if (r3 == (-64)) goto L40;
        if (r3 == (-32)) goto L38;
        if (r3 != 0) goto L16;
    L31:
        long r16 = r10.f();     // Catch: Throwable -> L80 Throwable -> L80
        if (r16 <= 0) goto L34;
        long r17 = r16;
    L35:
        K(r2, r17);     // Catch: Throwable -> L80 Throwable -> L80
        return new xj5(r16);
    L34:
        r17 = ~r16;     // Catch: Throwable -> L80 Throwable -> L80
        goto L35
    L16:
        if (r3 == 32) goto L31;
        if (r3 != 64) goto L20;
        r10.v((byte) 64);     // Catch: RuntimeException -> L24 Throwable -> L80
        byte[] r18 = r10.H();     // Catch: RuntimeException -> L24 Throwable -> L80
        int r19 = r18.length;     // Catch: Throwable -> L80 Throwable -> L80
        K(r2, r19);     // Catch: Throwable -> L80 Throwable -> L80
        return new wj5(rj5.i(r19, r18));
    L20:
        if (r3 != 96) goto L27;
        r10.v((byte) 96);     // Catch: RuntimeException -> L24 Throwable -> L80
        String r20 = new String(r10.H(), StandardCharsets.UTF_8);     // Catch: RuntimeException -> L24 Throwable -> L80
        K(r2, r20.length());     // Catch: Throwable -> L80 Throwable -> L80
        return new zj5(r20);
    L27:
        throw new zzhj("Unidentifiable major type: " + ((r3 >> 5) & 7));     // Catch: Throwable -> L80 Throwable -> L80
    L38:
        return new vj5(r10.q());
    L40:
        throw new zzhj("Tags are currently unsupported");     // Catch: Throwable -> L80 Throwable -> L80
    L24:
        e = e;
    L82:
        throw new zzhj(e);
    L80:
        e = e;
        goto L82
    L84:
        throw new zzhj("Parser being asked to parse an empty input stream");
    L85:
        e = move-exception;
        throw new zzhj(e);
    }

    public static final void K(byte r2, long r3) {
        switch(r2) {
            case 24: goto L20;
            case 25: goto L15;
            case 26: goto L10;
            case 27: goto L5;
            default: goto L24;
        };
    L24:
        return;
    L5:
        if (r3 >= 4294967296L) goto L25;
        tb4.b(r3, " after add info could have been represented in 0-4 additional bytes, but used 8");
        return;
    L25:
        return;
    L10:
        if (r3 >= 65536) goto L26;
        tb4.b(r3, " after add info could have been represented in 0-2 additional bytes, but used 4");
        return;
    L26:
        return;
    L15:
        if (r3 >= 256) goto L27;
        tb4.b(r3, " after add info could have been represented in 0-1 additional bytes, but used 2");
        return;
    L27:
        return;
    L20:
        if (r3 < 24) goto L22;
        return;
    L22:
        tb4.b(r3, " after add info could have been represented in 0 additional bytes, but used 1");
    }

    public static Rect c(View r5, View r6) {
        int[] r1 = new int[2];
        r6.getLocationOnScreen(r1);
        int r3 = r1[0];
        int r2 = r1[1];
        int[] r0 = new int[2];
        r5.getLocationOnScreen(r0);
        int r7 = r0[0];
        int r4 = r3 - r7;
        int r8 = r2 - r0[1];
        return new Rect(r4, r8, r6.getWidth() + r4, r6.getHeight() + r8);
    }

    public static void d(boolean r0) {
        if (r0 == false) goto L4;
        return;
    L4:
        nz2.c();
    }

    public static final q24 i(Context r2, Class r3, String r4) {
        r2.getClass();
        if (qm4.u0(r4) == false) goto L5;
        kf2.n("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        return null;
    L5:
        if (r4.equals(":memory:") == false) goto L7;
        kf2.n("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        return null;
    L7:
        return new q24(r2, r3, r4);
    }

    public static final boolean j(String r8, String r9) {
        r8.getClass();
        if (r8.equals(r9) == false) goto L6;
        return true;
    L6:
        if (r8.length() == 0) goto L29;
        int r0 = 0;
        int r3 = 0;
        int r4 = 0;
    L10:
        if (r0 >= r8.length()) goto L26;
        char r5 = r8.charAt(r0);
        int r6 = r4 + 1;
        if (r4 != 0) goto L15;
        if (r5 != '(') goto L29;
    L15:
        if (r5 != '(') goto L17;
        r3 = r3 + 1;
    L25:
        r0 = r0 + 1;
        r4 = r6;
        goto L10
    L17:
        if (r5 != ')') goto L25;
        r3 = r3 - 1;
        if (r3 != 0) goto L25;
        if (r4 == (r8.length() - 1)) goto L25;
    L26:
        if (r3 != 0) goto L29;
        return h12.c(qm4.K0(r8.substring(1, r8.length() - 1)).toString(), r9);
    L29:
        return false;
    }

    public static void k(View r5, b85 r6) {
        WeakHashMap r1 = j65.a;
        int r2 = r5.getPaddingStart();
        int r3 = r5.getPaddingTop();
        int r4 = r5.getPaddingEnd();
        int r7 = r5.getPaddingBottom();
        c85 r0 = new c85();
        r0.a = r2;
        r0.b = r3;
        r0.c = r4;
        r0.d = r7;
        a65.c(r5, new gp3(22, r6, r0));
        if (r5.isAttachedToWindow() == false) goto L6;
        r5.requestApplyInsets();
        return;
    L6:
        r5.addOnAttachStateChangeListener(new z75());
    }

    public static float l(Context r1, int r2) {
        return TypedValue.applyDimension(1, r2, r1.getResources().getDisplayMetrics());
    }

    public static Map m(kk1 r5) {
        LinkedHashMap r0 = new LinkedHashMap();
        Iterator r1 = r5.sourceIterator();
    L4:
        if (r1.hasNext() == false) goto L11;
        Object r2 = r5.keyOf(r1.next());
        Object r3 = r0.get(r2);
        if (r3 != null) goto L10;
        if (r0.containsKey(r2) == true) goto L10;
        r3 = new hx3();
    L10:
        hx3 r4 = (hx3) r3;
        r4.n++;
        r0.put(r2, r4);
        goto L4
    L11:
        Iterator r6 = r0.entrySet().iterator();
    L13:
        if (r6.hasNext() == false) goto L23;
        Map.Entry r7 = (Map.Entry) r6.next();
        r7.getClass();
        if ((r7 instanceof x32) == false) goto L21;
        if ((r7 instanceof z32) == true) goto L21;
        jz4.M(r7, "kotlin.collections.MutableMap.MutableEntry");
        throw null;
    L21:
        r7.setValue(Integer.valueOf(((hx3) r7.getValue()).n));
        goto L13
    L23:
        return jz4.f(r0);
    }

    public static final boolean n(long r0, long r2) {
        if (r0 != r2) goto L6;
        return true;
    L6:
        return false;
    }

    public static boolean o(Object r1, Map r2) {
        if (r2 != r1) goto L6;
        return true;
    L6:
        if ((r1 instanceof Map) == true) goto L8;
        return false;
    L8:
        return r2.entrySet().equals(((Map) r1).entrySet());
    }

    public static ib1 p(ib1[] r10, int r11) {
        if ((r11 & 1) != 0) goto L5;
        int r0 = 400;
    L7:
        if ((r11 & 2) == 0) goto L9;
        boolean r12 = true;
    L10:
        int r3 = r10.length;
        ib1 r4 = null;
        int r5 = Integer.MAX_VALUE;
        int r6 = 0;
    L11:
        if (r6 >= r3) goto L21;
        ib1 r7 = r10[r6];
        int r8 = Math.abs(r7.c - r0) * 2;
        if (r7.d != r12) goto L15;
        int r9 = 0;
    L16:
        int r13 = r8 + r9;
        if (r4 == null) goto L19;
        if (r5 > r13) goto L19;
    L20:
        r6 = r6 + 1;
    L19:
        r4 = r7;
        r5 = r13;
        goto L20
    L15:
        r9 = 1;
        goto L16
    L21:
        return r4;
    L9:
        r12 = false;
        goto L10
    L5:
        r0 = 700;
        goto L7
    }

    public static ol1 q(ol1 r10) {
        boolean r1 = false;
        if (Math.round(r10.a) >= 90.0d) goto L5;
    L7:
        boolean r0 = false;
    L9:
        if (Math.round(r10.b) <= 16.0d) goto L11;
        boolean r3 = true;
    L13:
        if (Math.round(r10.c) >= 65.0d) goto L15;
        r1 = true;
    L15:
        if (r0 == false) goto L20;
        if (r3 == false) goto L21;
        if (r1 == true) goto L19;
        return r10;
    L19:
        return ol1.a(r10.a, r10.b, 70.0d);
    L21:
        return r10;
    L20:
        return r10;
    L11:
        r3 = false;
        goto L13
    L5:
        if (Math.round(r10.a) > 111.0d) goto L7;
        r0 = true;
        goto L9
    }

    public static final String r(Collection r7) {
        r7.getClass();
        if (r7.isEmpty() == false) goto L5;
        return " }";
    L5:
        return rm4.b0(q40.B0(r7, ",\n", "\n", "\n", null, 56)).concat("},");
    }

    public static ViewGroup s(View r2) {
        View r0 = r2.getRootView();
        ViewGroup r1 = (ViewGroup) r0.findViewById(R.id.content);
        if (r1 == null) goto L5;
        return r1;
    L5:
        if (r0 != r2) goto L7;
        return null;
    L7:
        if ((r0 instanceof ViewGroup) == true) goto L9;
        return null;
    L9:
        return (ViewGroup) r0;
    }

    public static final float t(Layout r4, int r5, Paint r6) {
        float r0 = r4.getLineLeft(r5);
        ThreadLocal r1 = ns4.a;
        if (r4.getEllipsisCount(r5) > 0) goto L5;
    L17:
        return 0.0f;
    L5:
        if (r4.getParagraphDirection(r5) != 1) goto L17;
        if (r0 >= 0.0f) goto L17;
        float r7 = r6.measureText("…") + (r4.getPrimaryHorizontal(r4.getEllipsisStart(r5) + r4.getLineStart(r5)) - r0);
        Layout.Alignment r8 = r4.getParagraphAlignment(r5);
        if (r8 != null) goto L11;
        int r9 = -1;
    L12:
        if (r9 != 1) goto L16;
        float r10 = Math.abs(r0);
        float r11 = (r4.getWidth() - r7) / 2.0f;
    L15:
        return r11 + r10;
    L16:
        r10 = Math.abs(r0);
        r11 = r4.getWidth() - r7;
        goto L15
    L11:
        r9 = qx1.a[r8.ordinal()];
        goto L12
    }

    public static final float u(Layout r3, int r4, Paint r5) {
        ThreadLocal r0 = ns4.a;
        if (r3.getEllipsisCount(r4) <= 0) goto L18;
        int r1 = -1;
        if (r3.getParagraphDirection(r4) == (-1)) goto L7;
        return 0.0f;
    L7:
        if (r3.getWidth() >= r3.getLineRight(r4)) goto L21;
        float r6 = r5.measureText("…") + (r3.getLineRight(r4) - r3.getPrimaryHorizontal(r3.getEllipsisStart(r4) + r3.getLineStart(r4)));
        Layout.Alignment r2 = r3.getParagraphAlignment(r4);
        if (r2 == null) goto L13;
        r1 = qx1.a[r2.ordinal()];
    L13:
        if (r1 != 1) goto L17;
        float r7 = r3.getWidth() - r3.getLineRight(r4);
        float r8 = (r3.getWidth() - r6) / 2.0f;
    L16:
        return r7 - r8;
    L17:
        r7 = r3.getWidth() - r3.getLineRight(r4);
        r8 = r3.getWidth() - r6;
        goto L16
    L21:
        return 0.0f;
    L18:
        return 0.0f;
    }

    public static ry v(py r3) {
        oy r0 = new oy();
        r0.c = new n04();
        ry r1 = new ry(r0);
        r0.b = r1;
        r0.a = r3.getClass();
        Object r4 = r3.k(r0);     // Catch: Exception -> L7
        if (r4 == null) goto L9;
        r0.a = r4;     // Catch: Exception -> L7
        return r1;
    L9:
        return r1;
    L7:
        e = move-exception;
        r1.o.i(e);
        return r1;
    }

    public static final int w(Layout r2, int r3, boolean r4) {
        if (r3 > 0) goto L6;
        return 0;
    L6:
        if (r3 >= r2.getText().length()) goto L8;
        int r0 = r2.getLineForOffset(r3);
        int r1 = r2.getLineStart(r0);
        int r5 = r2.getLineEnd(r0);
        if (r1 == r3) goto L13;
        if (r5 == r3) goto L13;
    L18:
        return r0;
    L13:
        if (r1 != r3) goto L17;
        if (r4 == false) goto L18;
        return r0 - 1;
    L17:
        if (r4 == true) goto L18;
        return r0 + 1;
    L8:
        return r2.getLineCount() - 1;
    }

    public static final ed x(ne0 r1) {
        ed r2 = (ed) r1.K(rv2.p);
        if (r2 == null) goto L5;
        return r2;
    L5:
        kf2.o("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static final void y(rg1 r1, wf1 r2) {
        r2.getClass();
        jz4.j(2, r2);
        r2.invoke(r1, 1);
    }

    public static boolean z(View r1) {
        WeakHashMap r0 = j65.a;
        if (r1.getLayoutDirection() != 1) goto L5;
        return true;
    L5:
        return false;
    }

    public me a(Context r1, Looper r2, ml3 r3, Object r4, gj1 r5, hj1 r6) {
        return b(r1, r2, r3, r4, (gf5) r5, (gf5) r6);
    }

    public me b(Context r1, Looper r2, ml3 r3, Object r4, gf5 r5, gf5 r6) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public abstract Typeface e(Context r1, ya1 r2, Resources r3, int r4);

    public abstract Typeface f(Context r1, ib1[] r2, int r3);

    public Typeface g(Context r1, List r2, int r3) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface h(Context r1, Resources r2, int r3, String r4, int r5) {
        /*  JADX ERROR: Simple mode code generation failed
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:361)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.codegen.MethodGen.generateSimpleCode(MethodGen.java:354)
            	at jadx.core.codegen.MethodGen.addSimpleMethodCode(MethodGen.java:316)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:279)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            */
        /*
            this = this;
            java.io.File r0 = defpackage.wr1.C(r1)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = defpackage.wr1.k(r0, r2, r3)     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L23
            if (r2 != 0) goto L12
            r0.delete()
            return r1
        L12:
            java.lang.String r2 = r0.getPath()     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L23
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromFile(r2)     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L23
            r0.delete()
            return r1
        L1e:
            r1 = move-exception
            r0.delete()
            throw r1
        L23:
            r0.delete()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vr1.h(android.content.Context, android.content.res.Resources, int, java.lang.String, int):android.graphics.Typeface");
    }
}
