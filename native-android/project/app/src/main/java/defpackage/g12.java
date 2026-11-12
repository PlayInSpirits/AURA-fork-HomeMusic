package defpackage;

import android.R;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import com.bumptech.glide.a;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.model.Favorite;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Method;
import java.text.Normalizer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g12 {
    public static byte a;
    public static final l50 b = null;
    public static final ca1 c = null;
    public static final n7 d = null;
    public static final f01 e = null;
    public static Method f;
    public static Method g;
    public static boolean h;

    static {
        b = new l50(1, "android");
        c = new ca1(14);
        d = new n7(15);
        e = new f01(1, "NO_VALUE");
    }

    public static final void A(u62 r0) {
        j51.O(r0).D();
    }

    public static boolean B(int r4) {
        if (r4 != 0) goto L4;
        return false;
    L4:
        if (v50.e(r4) <= 0.5d) goto L9;
        return true;
    L9:
        return false;
    }

    public static boolean C(String r4) {
        te r0 = m95.a;
        Set r1 = Collections.unmodifiableSet(ue.c);
        HashSet r2 = new HashSet();
        Iterator r3 = r1.iterator();
    L4:
        if (r3.hasNext() == false) goto L9;
        ue r5 = (ue) r3.next();
        if (r5.a.equals(r4) == false) goto L4;
        r2.add(r5);
        goto L4
    L9:
        if (r2.isEmpty() == true) goto L20;
        Iterator r6 = r2.iterator();
    L12:
        if (r6.hasNext() == false) goto L19;
        ue r7 = (ue) r6.next();
        if (r7.a() == true) goto L31;
        if (r7.b() == false) goto L12;
        return true;
    L31:
        return true;
    L19:
        return false;
    L20:
        tb4.e("Unknown feature ".concat(r4));
        return false;
    }

    public static final boolean D(long r2) {
        if ((r2 & 2) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public static final boolean E(long r2) {
        if ((r2 & 1) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public static boolean F(String r1, String r2) {
        if (r1.startsWith(r2.concat("(")) == true) goto L5;
        return false;
    L5:
        if (r1.endsWith(")") == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static int H(int r1, float r2, int r3) {
        return v50.g(v50.i(r3, Math.round(Color.alpha(r3) * r2)), r1);
    }

    public static String I(String r2) {
        if (r2 != null) goto L6;
        return "";
    L6:
        return Normalizer.normalize(r2, Normalizer.Form.NFD).replaceAll("\\p{M}", "").toLowerCase(Locale.getDefault());
    }

    public static final Object J(Object r2, Object r3) {
        if (r2 != null) goto L5;
        return r3;
    L5:
        if ((r2 instanceof ArrayList) == false) goto L8;
        ((ArrayList) r2).add(r3);
        return r2;
    L8:
        ArrayList r0 = new ArrayList(4);
        r0.add(r2);
        r0.add(r3);
        return r0;
    }

    public static int N(Context r1, int r2, int r3) {
        TypedValue r4 = zz1.D(r1, r2);
        if (r4 != null) goto L5;
    L8:
        return r3;
    L5:
        if (r4.type != 16) goto L8;
        return r4.data;
    }

    public static TimeInterpolator O(Context r6, int r7, TimeInterpolator r8) {
        TypedValue r0 = new TypedValue();
        if (r6.getTheme().resolveAttribute(r7, r0, true) == true) goto L6;
        return r8;
    L6:
        if (r0.type != 3) goto L33;
        String r9 = String.valueOf(r0.string);
        if (F(r9, "cubic-bezier") == true) goto L15;
        if (F(r9, "path") == true) goto L15;
        return AnimationUtils.loadInterpolator(r6, r0.resourceId);
    L15:
        if (F(r9, "cubic-bezier") == false) goto L23;
        String[] r10 = r9.substring(13, r9.length() - 1).split(",");
        if (r10.length == 4) goto L19;
        mj0.f(r10.length, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
        return null;
    L19:
        return new PathInterpolator(w(r10, 0), w(r10, 1), w(r10, 2), w(r10, 3));
    L23:
        if (F(r9, "path") == false) goto L31;
        String r11 = r9.substring(5, r9.length() - 1);
        Path r12 = new Path();
        cf3.b(fh0.l(r11), r12);     // Catch: RuntimeException -> L28
        return new PathInterpolator(r12);
    L28:
        e = move-exception;
        nz2.s("Error in parsing ".concat(r11), e);
        return null;
    L31:
        kf2.n("Invalid motion easing type: ".concat(r9));
        return null;
    L33:
        kf2.n("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        return null;
    }

    public static final boolean P(Favorite r9) {
        boolean r2 = false;
        String r0 = App.a().getSharedPreferences("homemusic_favorite_retries", 0).getString(String.valueOf(r9.getTimestamp()), null);
        if (r0 != null) goto L6;
        r0 = b11.k("legacyfav:", r9.getTimestamp());
    L6:
        if (r9.getSongId() == null) goto L9;
        int r1 = 1;
    L12:
        String r5 = r9.getSongId();
        if (r5 != null) goto L17;
        r5 = r9.getAlbumId();
        if (r5 != null) goto L17;
        r5 = r9.getArtistId();
    L17:
        boolean r10 = r9.getToStar();
        HashMap r6 = n61.a;
        monitor-enter(n61.class);
        if (r5 != null) goto L42;
        monitor-exit(n61.class);
        return false;
    L42:
        HashMap r7 = n61.a;     // Catch: Throwable -> L33
        if (r7.containsKey(n61.e(r1, r5)) == false) goto L37;
        l61 r11 = (l61) r7.get(n61.e(r1, r5));     // Catch: Throwable -> L33
    L25:
        if (r11 == null) goto L29;
        if (r11.e == false) goto L29;
        r11 = r11.c;     // Catch: Throwable -> L33
    L29:
        if (r11 != null) goto L31;
    L35:
        monitor-exit(n61.class);
        return r2;
    L31:
        if (r11.f.d.equals(r0) == false) goto L35;
        r2 = true;
        goto L35
    L37:
        k61 r3 = new k61(r5, r1, r0, r10);     // Catch: Throwable -> L33
        String r4 = n61.e(r1, r5);     // Catch: Throwable -> L33
        r7.put(r4, new l61(r4, r10, null, r3));     // Catch: Throwable -> L33
        monitor-exit(n61.class);
        return true;
    L33:
        th = move-exception;
        throw th;
    L9:
        if (r9.getAlbumId() == null) goto L11;
        r1 = 2;
        goto L12
    L11:
        r1 = 3;
        goto L12
    }

    public static final Object Q(wf1 r2) {
        Thread.interrupted();
        e73 r0 = new e73(r2, null);
        return fu.L(q01.n, r0);
    }

    public static void R(Status r1, Object r2, cr4 r3) {
        if (r1.n > 0) goto L7;
        r3.b(r2);
        return;
    L7:
        if (r1.p == null) goto L9;
        ApiException r4 = new ResolvableApiException(r1);
    L10:
        r3.a(r4);
        return;
    L9:
        r4 = new ApiException(r1);
        goto L10
    }

    public static byte[] S(short r3) {
        return new byte[]{(byte) (r3 & 255), (byte) ((r3 >> 8) & 255)};
    }

    public static int T(int r4) {
        return (int) (((long) Integer.rotateLeft((int) (((long) r4) * (-862048943)), 15)) * 461845907);
    }

    public static int U(Object r0) {
        if (r0 != null) goto L4;
        int r1 = 0;
    L6:
        return T(r1);
    L4:
        r1 = r0.hashCode();
        goto L6
    }

    public static final cd4 a(int r2, int r3, wv r4) {
        if (r2 < 0) goto L19;
        if (r3 < 0) goto L17;
        if (r2 > 0) goto L12;
        if (r3 > 0) goto L12;
        if (r4 == wv.n) goto L12;
        nz2.l(r4, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ");
        return null;
    L12:
        int r5 = r3 + r2;
        if (r5 >= 0) goto L16;
        r5 = Integer.MAX_VALUE;
    L16:
        return new cd4(r2, r5, r4);
    L17:
        kf2.e(f34.f(r3, "extraBufferCapacity cannot be negative, but was "));
        return null;
    L19:
        kf2.e(f34.f(r2, "replay cannot be negative, but was "));
        return null;
    }

    public static byte[] b(int r5) {
        return new byte[]{(byte) (r5 & 255), (byte) ((r5 >> 8) & 255), (byte) ((r5 >> 16) & 255), (byte) ((r5 >> 24) & 255)};
    }

    public static final float c(long r4, long r6) {
        return Math.min(Float.intBitsToFloat((int) (r6 >> 32)) / Float.intBitsToFloat((int) (r4 >> 32)), Float.intBitsToFloat((int) (r6 & 4294967295L)) / Float.intBitsToFloat((int) (r4 & 4294967295L)));
    }

    public static final void d(Object[] r0, long r1, Object r3) {
        r0[((int) r1) & (r0.length - 1)] = r3;
    }

    public static void f(vo4 r4, Object[] r5) {
        if (r5 == null) goto L42;
        int r0 = r5.length;
        int r1 = 0;
    L5:
        if (r1 >= r0) goto L74;
        Object r2 = r5[r1];
        r1 = r1 + 1;
        if (r2 == null) goto L8;
        if ((r2 instanceof byte[]) == true) goto L11;
        if ((r2 instanceof Float) == true) goto L14;
        if ((r2 instanceof Double) == true) goto L17;
        if ((r2 instanceof Long) == true) goto L20;
        if ((r2 instanceof Integer) == true) goto L23;
        if ((r2 instanceof Short) == true) goto L26;
        if ((r2 instanceof Byte) == true) goto L29;
        if ((r2 instanceof String) == true) goto L32;
        if ((r2 instanceof Boolean) == false) goto L41;
        if (((Boolean) r2).booleanValue() == false) goto L38;
        long r3 = 1;
    L39:
        r4.c(r1, r3);
        goto L5
    L38:
        r3 = 0;
        goto L39
    L41:
        throw new IllegalArgumentException("Cannot bind " + r2 + " at index " + r1 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
    L32:
        r4.h(r1, (String) r2);
        goto L5
    L29:
        r4.c(r1, ((Number) r2).byteValue());
        goto L5
    L26:
        r4.c(r1, ((Number) r2).shortValue());
        goto L5
    L23:
        r4.c(r1, ((Number) r2).intValue());
        goto L5
    L20:
        r4.c(r1, ((Number) r2).longValue());
        goto L5
    L17:
        r4.d(((Number) r2).doubleValue(), r1);
        goto L5
    L14:
        r4.d(((Number) r2).floatValue(), r1);
        goto L5
    L11:
        r4.x(r1, (byte[]) r2);
        goto L5
    L8:
        r4.e(r1);
        goto L5
    L74:
        return;
    }

    public static byte[] j(char r3) {
        return new byte[]{(byte) (r3 & 255), (byte) ((r3 >> '\b') & 255)};
    }

    public static final int k(long r5, long r7) {
        boolean r0 = E(r5);
        if (r0 == E(r7)) goto L7;
        if (r0 == false) goto L6;
        return -1;
    L6:
        return 1;
    L7:
        int r1 = (int) Math.signum(u(r5) - u(r7));
        if (Math.min(u(r5), u(r7)) >= 0.0f) goto L11;
    L16:
        return r1;
    L11:
        if (D(r5) == D(r7)) goto L16;
        if (D(r5) == false) goto L15;
        return -1;
    L15:
        return 1;
    }

    public static int l(int r1, int r2) {
        return v50.i(r1, (Color.alpha(r1) * r2) / 255);
    }

    public static byte[] m(df r12, Map r13) {
        if (r13.entrySet().isEmpty() == true) goto L54;
        l50 r0 = new l50(127, r12.getPackageName());
        HashMap r2 = new HashMap();
        Iterator r14 = r13.entrySet().iterator();
        j50 r4 = null;
    L6:
        if (r14.hasNext() == false) goto L22;
        Map.Entry r5 = (Map.Entry) r14.next();
        int r7 = ((Integer) r5.getKey()).intValue();
        String r8 = r12.getResources().getResourceName(((Integer) r5.getKey()).intValue());
        j50 r6 = new j50(r8, r7, ((Integer) r5.getValue()).intValue());
        if (r12.getResources().getResourceTypeName(((Integer) r5.getKey()).intValue()).equals("color") == false) goto L20;
        byte r9 = r6.a;
        if (r9 != 1) goto L12;
        l50 r10 = b;
    L15:
        if (r2.containsKey(r10) == true) goto L17;
        r2.put(r10, new ArrayList());
    L17:
        ((List) r2.get(r10)).add(r6);
        r4 = r6;
        goto L6
    L12:
        if (r9 != 127) goto L18;
        r10 = r0;
        goto L15
    L18:
        kf2.n(f34.f(r9, "Not supported with unknown package id: "));
        return null;
    L20:
        kf2.g(Integer.toHexString(r6.b & 255), xa3.j("Non color resource found: name=", r8, ", typeId="));
        return null;
    L22:
        byte r15 = r4.b;
        a = r15;
        if (r15 == 0) goto L52;
        ByteArrayOutputStream r16 = new ByteArrayOutputStream();
        ArrayList r17 = new ArrayList();
        int r1 = r2.size();
        o50 r3 = new o50(new String[0], false);
        Iterator r11 = r2.entrySet().iterator();
    L26:
        if (r11.hasNext() == false) goto L28;
        Map.Entry r18 = (Map.Entry) r11.next();
        List r19 = (List) r18.getValue();
        Collections.sort(r19, c);
        r17.add(new k50((l50) r18.getKey(), r19));
        goto L26
    L28:
        int r20 = r17.size();
        int r21 = 0;
        int r22 = 0;
    L29:
        if (r22 >= r20) goto L31;
        Object r23 = r17.get(r22);
        r22 = r22 + 1;
        r21 = r21 + ((k50) r23).a();
        goto L29
    L31:
        int r24 = (r3.l + 12) + r21;
        r16.write(S(2));
        r16.write(S(12));
        r16.write(b(r24));
        r16.write(b(r1));
        r3.a(r16);
        int r25 = r17.size();
        int r26 = 0;
    L32:
        if (r26 >= r25) goto L51;
        Object r27 = r17.get(r26);
        r26 = r26 + 1;
        k50 r28 = (k50) r27;
        o50 r29 = r28.c;
        r28.a.a(r16);
        l50 r30 = r28.b;
        r16.write(b(r30.a));
        char[] r31 = r30.b.toCharArray();
        int r32 = 0;
    L35:
        if (r32 >= 128) goto L41;
        if (r32 >= r31.length) goto L39;
        r16.write(j(r31[r32]));
    L40:
        r32 = r32 + 1;
        goto L35
    L39:
        r16.write(j(0));
        goto L40
    L41:
        r16.write(b(288));
        r16.write(b(0));
        r16.write(b(r29.l + 288));
        r16.write(b(0));
        r16.write(b(0));
        r29.a(r16);
        r28.d.a(r16);
        gc r33 = r28.e;
        ((m50) r33.b).a(r16);
        r16.write(new byte[]{a, 0, 0, 0});
        r16.write(b(r33.a));
        int[] r34 = (int[]) r33.c;
        int r35 = r34.length;
        int r110 = 0;
    L42:
        if (r110 >= r35) goto L44;
        r16.write(b(r34[r110]));
        r110 = r110 + 1;
        goto L42
    L44:
        ew4 r36 = (ew4) r33.d;
        m50 r37 = (m50) r36.p;
        int[] r38 = (int[]) r36.r;
        r37.a(r16);
        r16.write(new byte[]{a, 0, 0, 0});
        r16.write(b(r36.o));
        r16.write(b((r38.length * 4) + 84));
        r16.write((byte[]) r36.q);
        int r39 = r38.length;
        int r40 = 0;
    L45:
        if (r40 >= r39) goto L47;
        r16.write(b(r38[r40]));
        r40 = r40 + 1;
        goto L45
    L47:
        n50[] r41 = (n50[]) r36.s;
        int r42 = r41.length;
        int r43 = 0;
    L48:
        if (r43 >= r42) goto L32;
        n50 r44 = r41[r43];
        r44.getClass();
        r16.write(S(8));
        r16.write(S(2));
        r16.write(b(r44.a));
        r16.write(S(8));
        r16.write(new byte[]{0, 28});
        r16.write(b(r44.b));
        r43 = r43 + 1;
        goto L48
    L51:
        return r16.toByteArray();
    L52:
        kf2.n("No color resources found for harmonization.");
        return null;
    L54:
        kf2.n("No color resources provided for harmonization.");
        return null;
    }

    public static void n(Canvas r11, boolean r12) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 29) goto L10;
        if (r12 == false) goto L7;
        kz.z(r11);
        return;
    L7:
        kz.C(r11);
        return;
    L10:
        if (h == false) goto L33;
    L22:
        if (r12 == true) goto L35;
    L26:
        if (r12 == true) goto L37;
        Method r13 = g;     // Catch: Throwable -> L32
        if (r13 == null) goto L38;
        r13.invoke(r11, null);     // Catch: Throwable -> L32
        return;
    L39:
        return;
    L38:
        return;
    L37:
        return;
    L35:
        Method r1 = f;     // Catch: Throwable -> L32
        if (r1 == null) goto L26;
        r1.invoke(r11, null);     // Catch: Throwable -> L32
        goto L26
    L33:
        if (r0 != 28) goto L14;
        Method r2 = Class.class.getDeclaredMethod("getDeclaredMethod", new Class[]{String.class, new Class[0].getClass()});     // Catch: Throwable -> L31
        f = (Method) r2.invoke(Canvas.class, new Object[]{"insertReorderBarrier", new Class[0]});     // Catch: Throwable -> L31
        g = (Method) r2.invoke(Canvas.class, new Object[]{"insertInorderBarrier", new Class[0]});     // Catch: Throwable -> L31
    L15:
        Method r3 = f;     // Catch: Throwable -> L31
        if (r3 == null) goto L18;
        r3.setAccessible(true);     // Catch: Throwable -> L31
    L18:
        Method r4 = g;     // Catch: Throwable -> L31
        if (r4 == null) goto L21;
        r4.setAccessible(true);     // Catch: Throwable -> L31
        goto L21
    L14:
        f = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);     // Catch: Throwable -> L31
        g = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);     // Catch: Throwable -> L31
    L21:
        h = true;
        goto L22
    }

    public static final p81 o(zc4 r1, ne0 r2, int r3, wv r4) {
        if (r3 == 0) goto L6;
        if (r3 == (-3)) goto L6;
    L9:
        return new b10(r1, r2, r3, r4);
    L6:
        if (r4 != wv.n) goto L9;
        return r1;
    }

    public static int r(int r0, Context r1, String r2) {
        TypedValue r3 = zz1.F(r0, r1, r2);
        int r4 = r3.resourceId;
        if (r4 == 0) goto L7;
        return r1.getColor(r4);
    L7:
        return r3.data;
    }

    public static int s(Context r0, int r1, int r2) {
        TypedValue r3 = zz1.D(r0, r1);
        if (r3 == null) goto L10;
        int r4 = r3.resourceId;
        if (r4 == 0) goto L9;
        return r0.getColor(r4);
    L9:
        return r3.data;
    L10:
        return r2;
    }

    public static int t(View r2, int r3) {
        Context r0 = r2.getContext();
        TypedValue r4 = zz1.F(r3, r2.getContext(), r2.getClass().getCanonicalName());
        int r5 = r4.resourceId;
        if (r5 == 0) goto L7;
        return r0.getColor(r5);
    L7:
        return r4.data;
    }

    public static final float u(long r1) {
        return Float.intBitsToFloat((int) (r1 >> 32));
    }

    public static is0 v(Context r8) {
        TypedArray r0 = r8.obtainStyledAttributes(new int[]{R.attr.listDivider});
        InsetDrawable r2 = new InsetDrawable(r0.getDrawable(0), 42, 0, 42, 42);
        r0.recycle();
        is0 r1 = new is0(r8);
        r1.a = r2;
        return r1;
    }

    public static float w(String[] r1, int r2) {
        float r3 = Float.parseFloat(r1[r2]);
        if (r3 >= 0.0f) goto L5;
    L7:
        tb4.f("Motion easing control point value must be between 0 and 1; instead got: ", r3);
        return 0.0f;
    L5:
        if (r3 > 1.0f) goto L7;
        return r3;
    }

    public static String x(Date r3) {
        if (r3 != null) goto L6;
        return App.a().getString(app.homemusic.R.string.share_no_expiration);
    L6:
        return new SimpleDateFormat("dd MMM, yyyy", Locale.getDefault()).format(r3);
    }

    public static int y(int r1, int r2) {
        if (r1 != 0) goto L5;
        r1 = 1;
    L5:
        if ((r1 / r2) <= 0) goto L8;
        return r2;
    L8:
        return r1 % r2;
    }

    public static SimpleDateFormat z(int r6, int r7) {
        StringBuilder r0 = new StringBuilder();
        if (r6 == 0) goto L12;
        if (r6 == 1) goto L11;
        if (r6 == 2) goto L10;
        if (r6 != 3) goto L8;
        String r8 = "M/d/yy";
    L13:
        r0.append(r8);
        r0.append(" ");
        if (r7 == 0) goto L22;
        if (r7 == 1) goto L22;
        if (r7 == 2) goto L21;
        if (r7 != 3) goto L19;
        String r9 = "h:mm a";
    L23:
        r0.append(r9);
        return new SimpleDateFormat(r0.toString(), Locale.US);
    L19:
        kf2.n(f34.f(r7, "Unknown DateFormat style: "));
        return null;
    L21:
        r9 = "h:mm:ss a";
    L22:
        r9 = "h:mm:ss a z";
        goto L23
    L8:
        kf2.n(f34.f(r6, "Unknown DateFormat style: "));
        return null;
    L10:
        r8 = "MMM d, yyyy";
        goto L13
    L11:
        r8 = "MMMM d, yyyy";
        goto L13
    L12:
        r8 = "EEEE, MMMM d, yyyy";
        goto L13
    }

    public void G() {
    }

    public abstract void K(t0 r1, t0 r2);

    public abstract void L(t0 r1, Thread r2);

    public void M(Context r1, a r2, ey3 r3) {
    }

    public void e(Context r1, hi1 r2) {
    }

    public abstract boolean g(u0 r1, i0 r2, i0 r3);

    public abstract boolean h(u0 r1, Object r2, Object r3);

    public abstract boolean i(u0 r1, t0 r2, t0 r3);

    public abstract i0 p(u0 r1);

    public abstract t0 q(u0 r1);
}
