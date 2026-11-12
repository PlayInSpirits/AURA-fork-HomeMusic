package defpackage;

import android.app.UiModeManager;
import android.content.res.TypedArray;
import android.content.res.loader.ResourcesLoader;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import android.util.Log;
import app.homemusic.R;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ly0 {
    public static final int[] a = null;
    public static final Map b = null;
    public static final Map c = null;

    static {
        a = new int[]{R.attr.dynamicColorThemeOverlay};
        hy0 r0 = new hy0();
        iy0 r1 = new iy0();
        HashMap r2 = new HashMap();
        r2.put("fcnt", r0);
        r2.put("google", r0);
        r2.put("hmd global", r0);
        r2.put("infinix", r0);
        r2.put("infinix mobility limited", r0);
        r2.put("itel", r0);
        r2.put("kyocera", r0);
        r2.put("lenovo", r0);
        r2.put("lge", r0);
        r2.put("motorola", r0);
        r2.put("nothing", r0);
        r2.put("oneplus", r0);
        r2.put("oppo", r0);
        r2.put("realme", r0);
        r2.put("robolectric", r0);
        r2.put("samsung", r1);
        r2.put("sharp", r0);
        r2.put("sony", r0);
        r2.put("tcl", r0);
        r2.put("tecno", r0);
        r2.put("tecno mobile limited", r0);
        r2.put("vivo", r0);
        r2.put("wingtech", r0);
        r2.put("xiaomi", r0);
        b = Collections.unmodifiableMap(r2);
        HashMap r3 = new HashMap();
        r3.put("asus", r0);
        r3.put("jio", r0);
        c = Collections.unmodifiableMap(r3);
    }

    public static void a(df r17, qr2 r18) {
        Integer r2 = (Integer) r18.p;
        Integer r4 = 0;
        int r5 = Build.VERSION.SDK_INT;
        if (r5 < 31) goto L148;
        int r6 = gw.a;
        ResourcesLoader r7 = null;
        if (r5 < 33) goto L8;
    L38:
        if (r2 != null) goto L40;
        TypedArray r8 = r17.obtainStyledAttributes(a);
        int r9 = r8.getResourceId(0, 0);
        r8.recycle();
    L41:
        ((ky0) r18.o).G(r17);
        if (r2 == null) goto L126;
        ol1 r10 = new ol1(r2.intValue());
        boolean r3 = !zz1.E(r17, R.attr.isLightTheme, true);
        UiModeManager r11 = (UiModeManager) r17.getSystemService("uimode");
        if (r11 == null) goto L48;
        if (r5 < 34) goto L48;
        float r12 = bn.a(r11);
    L49:
        d64 r0 = new d64(r10, r3, r12);
        hh3 r13 = h14.a;
        if (30 > r5) goto L53;
        if (r5 > 33) goto L53;
    L56:
        if (r13 == null) goto L149;
        Map r14 = uh2.a;
        HashMap r15 = new HashMap();
        Iterator r16 = uh2.a.entrySet().iterator();
    L60:
        if (r16.hasNext() == false) goto L134;
        Map.Entry r19 = (Map.Entry) r16.next();
        Integer r20 = (Integer) r19.getKey();
        gy0 r21 = (gy0) r19.getValue();
        HashMap r22 = r21.i;
        ol1 r110 = (ol1) r22.get(r0);
        if (r110 != null) goto L68;
        r110 = ol1.a(((Double) r21.a.apply(r0)).doubleValue(), ((Double) r21.b.apply(r0)).doubleValue(), r21.d(r0));
        if (r22.size() <= 4) goto L67;
        r22.clear();
    L67:
        r22.put(r0, r110);
    L68:
        int r23 = r110.d;
        Function r24 = r21.d;
        if (r24 == null) goto L78;
        int r25 = (int) Math.round(((Double) r24.apply(r0)).doubleValue() * 255.0d);
        if (r25 >= 0) goto L75;
        r25 = 0;
    L77:
        r23 = (r23 & 16777215) | (r25 << 24);
        goto L78
    L75:
        if (r25 <= 255) goto L77;
        r25 = 255;
    L78:
        r15.put(r20, Integer.valueOf(r23));
        goto L60
    L134:
        byte[] r1 = g12.m(r17, Collections.unmodifiableMap(r15));     // Catch: Exception -> L89
        Log.i("ColorResLoaderCreator", "Table created, length: " + r1.length);     // Catch: Exception -> L89
        if (r1.length != 0) goto L135;
    L123:
        if (r7 == null) goto L147;
        xq2.p(r17.getResources(), new ResourcesLoader[]{r7});
        q05.c(r17, R.style.ThemeOverlay_Material3_PersonalizedColors);
        return;
    L147:
        return;
    L135:
        FileDescriptor r26 = l3.n();     // Catch: Throwable -> L117
        if (r26 != null) goto L93;
        Log.w("ColorResLoaderCreator", "Cannot create memory file descriptor.");     // Catch: Throwable -> L91
        if (r26 == null) goto L123;
        Os.close(r26);     // Catch: Exception -> L89
        goto L123
    L93:
        FileOutputStream r27 = new FileOutputStream(r26);     // Catch: Throwable -> L91
        r27.write(r1);     // Catch: Throwable -> L99
        ParcelFileDescriptor r28 = ParcelFileDescriptor.dup(r26);     // Catch: Throwable -> L99
        l3.s();     // Catch: Throwable -> L104
        ResourcesLoader r29 = l3.e();     // Catch: Throwable -> L104
        l3.t(r29, l3.f(r28));     // Catch: Throwable -> L104
        if (r28 == null) goto L101;
        r28.close();     // Catch: Throwable -> L99
    L101:
        r27.close();     // Catch: Throwable -> L91
        Os.close(r26);     // Catch: Exception -> L89
        r7 = r29;
        goto L123
    L104:
        th = move-exception;
        if (r28 == null) goto L142;
        r28.close();     // Catch: Throwable -> L109
    L143:
        throw th;     // Catch: Throwable -> L99
    L109:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L99
        throw th;     // Catch: Throwable -> L99
    L142:
        throw th;     // Catch: Throwable -> L99
    L99:
        th = move-exception;
        r27.close();     // Catch: Throwable -> L114
    L144:
        throw th;     // Catch: Throwable -> L91
    L114:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L91
        throw th;     // Catch: Throwable -> L91
    L91:
        th = th;
    L119:
        if (r26 == null) goto L121;
        Os.close(r26);     // Catch: Exception -> L89
    L121:
        throw th;     // Catch: Exception -> L89
    L117:
        th = th;
        r26 = null;
    L89:
        e = move-exception;
        Log.e("ColorResLoaderCreator", "Failed to create the ColorResourcesTableCreator.", e);
        goto L123
    L149:
        return;
    L53:
        if (r5 >= 34) goto L56;
        r13 = null;
    L48:
        r12 = 0.0f;
        goto L49
    L126:
        q05.c(r17, r9);
        return;
    L40:
        r9 = 0;
        goto L41
    L8:
        if (r5 < 32) goto L32;
        String r30 = Build.VERSION.CODENAME;
        r30.getClass();
        if ("REL".equals(r30) == true) goto L32;
        Locale r31 = Locale.ROOT;
        String r111 = r30.toUpperCase(r31);
        r111.getClass();
        if (r111.equals("BAKLAVA") == false) goto L15;
        Integer r112 = r4;
    L16:
        String r113 = "Tiramisu".toUpperCase(r31);
        r113.getClass();
        if (r113.equals("BAKLAVA") == true) goto L20;
        r4 = null;
    L20:
        if (r112 == null) goto L25;
        if (r4 == null) goto L25;
        if (r112.intValue() < r4.intValue()) goto L32;
    L25:
        if (r112 != null) goto L30;
        if (r4 != null) goto L30;
        String r32 = r30.toUpperCase(r31);
        r32.getClass();
        String r33 = "Tiramisu".toUpperCase(r31);
        r33.getClass();
        if (r32.compareTo(r33) < 0) goto L32;
    L30:
        if (r112 == null) goto L32;
    L15:
        r112 = null;
    L32:
        String r34 = Build.MANUFACTURER;
        Locale r35 = Locale.ROOT;
        jy0 r36 = (jy0) b.get(r34.toLowerCase(r35));
        if (r36 != null) goto L35;
        r36 = (jy0) c.get(Build.BRAND.toLowerCase(r35));
    L35:
        if (r36 != null) goto L37;
        return;
    L37:
        if (r36.a() == true) goto L38;
        return;
    }
}
