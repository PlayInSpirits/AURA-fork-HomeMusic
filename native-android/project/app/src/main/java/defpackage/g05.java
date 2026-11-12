package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class g05 extends e05 {
    public final Class h;
    public final Constructor i;
    public final Method j;
    public final Method k;
    public final Method l;
    public final Method m;
    public final Method n;

    public g05() {
        Class<?> r0 = null;
        Class<?> r1 = Class.forName("android.graphics.FontFamily");     // Catch: NoSuchMethodException -> L5 Throwable -> L7
        Constructor<?> r2 = r1.getConstructor(null);     // Catch: NoSuchMethodException -> L5 Throwable -> L7
        Method r3 = Q(r1);     // Catch: NoSuchMethodException -> L5 Throwable -> L7
        Class r6 = Integer.TYPE;     // Catch: NoSuchMethodException -> L5 Throwable -> L7
        Method r4 = r1.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, r6, FontVariationAxis[].class, r6, r6});     // Catch: NoSuchMethodException -> L5 Throwable -> L7
        Method r5 = r1.getMethod("freeze", null);     // Catch: NoSuchMethodException -> L5 Throwable -> L7
        Method r7 = r1.getMethod("abortCreation", null);     // Catch: NoSuchMethodException -> L5 Throwable -> L7
        Method r8 = R(r1);     // Catch: NoSuchMethodException -> L5 Throwable -> L7
        r0 = r1;
    L9:
        this.h = r0;
        this.i = r2;
        this.j = r3;
        this.k = r4;
        this.l = r5;
        this.m = r7;
        this.n = r8;
        return;
    L7:
        e = move-exception;
        Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
        r8 = null;
        r2 = null;
        r3 = null;
        r4 = null;
        r5 = null;
        r7 = null;
        goto L9
    }

    public static Method Q(Class r8) {
        Class r3 = Boolean.TYPE;
        Class r2 = Integer.TYPE;
        return r8.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, r2, r3, r2, r2, r2, FontVariationAxis[].class});
    }

    public final boolean N(Context r10, Object r11, String r12, int r13, int r14, int r15, FontVariationAxis[] r16) {
        return ((Boolean) this.j.invoke(r11, new Object[]{r10.getAssets(), r12, 0, Boolean.FALSE, Integer.valueOf(r13), Integer.valueOf(r14), Integer.valueOf(r15), r16})).booleanValue();
    L5:
        return false;
    }

    public Typeface O(Object r5) {
        Object r2 = Array.newInstance(this.h, 1);     // Catch: Throwable -> L5
        Array.set(r2, 0, r5);     // Catch: Throwable -> L5
        return (Typeface) this.n.invoke(null, new Object[]{r2, -1, -1});
    L5:
        return null;
    }

    public final boolean P(Object r2) {
        return ((Boolean) this.l.invoke(r2, null)).booleanValue();
    L4:
        return false;
    }

    public Method R(Class r3) {
        Class<?> r4 = Array.newInstance(r3, 1).getClass();
        Class r0 = Integer.TYPE;
        Method r5 = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{r4, r0, r0});
        r5.setAccessible(true);
        return r5;
    }

    @Override // defpackage.e05, defpackage.vr1
    public final Typeface e(Context r10, ya1 r11, Resources r12, int r13) {
        Method r0 = this.j;
        if (r0 != null) goto L5;
        Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
    L5:
        if (r0 == null) goto L25;
        Object r2 = this.i.newInstance(null);     // Catch: Throwable -> L9
    L10:
        if (r2 == null) goto L21;
        za1[] r14 = r11.a;
        int r15 = r14.length;
        int r8 = 0;
    L13:
        if (r8 >= r15) goto L19;
        za1 r1 = r14[r8];
        String r3 = r1.a;
        int r4 = r1.e;
        int r5 = r1.b;
        boolean r6 = r1.c;
        FontVariationAxis[] r7 = FontVariationAxis.fromFontVariationSettings(r1.d);
        g05 r9 = this;
        Context r16 = r10;
        if (r9.N(r16, r2, r3, r4, r5, r6 ? 1 : 0, r7) == false) goto L29;
        r8 = r8 + 1;
        g05 this = r9;
        r10 = r16;
        goto L13
    L29:
        r9.m.invoke(r2, null);     // Catch: Throwable -> L26
        goto L21
    L19:
        g05 r17 = this;
        if (r17.P(r2) == false) goto L21;
        return r17.O(r2);
    L21:
        return null;
    L9:
        r2 = null;
        goto L10
    L25:
        return super.e(r10, r11, r12, r13);
    }

    @Override // defpackage.e05, defpackage.vr1
    public final Typeface f(Context r13, ib1[] r14, int r15) {
        if (r14.length < 1) goto L64;
        Method r0 = this.j;
        if (r0 != null) goto L72;
        Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
    L72:
        if (r0 == null) goto L50;
        HashMap r1 = new HashMap();
        int r3 = r14.length;
        int r5 = 0;
    L10:
        if (r5 >= r3) goto L19;
        ib1 r6 = r14[r5];
        if (r6.f != 0) goto L18;
        Uri r7 = r6.a;
        if (r1.containsKey(r7) == true) goto L18;
        r1.put(r7, wr1.N(r13, r7));
    L18:
        r5 = r5 + 1;
        goto L10
    L19:
        Map r16 = Collections.unmodifiableMap(r1);
        Object r2 = this.i.newInstance(null);     // Catch: Throwable -> L22
    L23:
        if (r2 == null) goto L64;
        int r4 = r14.length;
        int r8 = 0;
        boolean r9 = false;
    L26:
        Method r10 = this.m;
        if (r8 >= r4) goto L39;
        ib1 r11 = r14[r8];
        ByteBuffer r12 = (ByteBuffer) r16.get(r11.a);
        if (r12 == null) goto L38;
        boolean r17 = ((Boolean) this.k.invoke(r2, new Object[]{r12, Integer.valueOf(r11.b), null, Integer.valueOf(r11.c), Integer.valueOf(r11.d ? 1 : 0)})).booleanValue();     // Catch: Throwable -> L34
    L35:
        if (r17 == false) goto L36;
        r9 = true;
        goto L38
    L36:
        r10.invoke(r2, null);     // Catch: Throwable -> L65
    L34:
        r17 = false;
    L38:
        r8 = r8 + 1;     // Catch: Throwable -> L65
        r9 = r9;
        goto L26
    L39:
        if (r9 == true) goto L43;
        r10.invoke(r2, null);     // Catch: Throwable -> L65
        goto L64
    L43:
        if (P(r2) == false) goto L64;
        Typeface r18 = O(r2);
        if (r18 == null) goto L64;
        return Typeface.create(r18, r15);
    L22:
        r2 = null;
        goto L23
    L50:
        ib1 r19 = vr1.p(r14, r15);
        ParcelFileDescriptor r110 = r13.getContentResolver().openFileDescriptor(r19.a, "r", null);
        if (r110 != null) goto L66;
        if (r110 == null) goto L64;
        r110.close();
        return null;
    L66:
        Typeface r111 = new Typeface.Builder(r110.getFileDescriptor()).setWeight(r19.c).setItalic(r19.d).build();     // Catch: Throwable -> L58
        r110.close();     // Catch: Throwable -> L65
        return r111;
    L58:
        th = move-exception;
        r110.close();     // Catch: Throwable -> L61
    L63:
        throw th;     // Catch: Throwable -> L65
    L61:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L65
    L64:
        return null;
    }

    @Override // defpackage.vr1
    public final Typeface h(Context r10, Resources r11, int r12, String r13, int r14) {
        Method r0 = this.j;
        if (r0 != null) goto L5;
        Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
    L5:
        if (r0 == null) goto L22;
        Object r2 = this.i.newInstance(null);     // Catch: Throwable -> L9
    L10:
        if (r2 != null) goto L13;
    L18:
        return null;
    L13:
        if (N(r10, r2, r13, 0, -1, -1, null) == true) goto L17;
        this.m.invoke(r2, null);     // Catch: Throwable -> L23
        goto L18
    L17:
        if (P(r2) == false) goto L18;
        return O(r2);
    L9:
        r2 = null;
        goto L10
    L22:
        return super.h(r10, r11, r12, r13, r14);
    }
}
