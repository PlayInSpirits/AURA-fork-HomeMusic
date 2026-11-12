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
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.Normalizer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g12 {
    public static byte a;
    public static final l50 b = new l50(1, "android");
    public static final ca1 c = new ca1(14);
    public static final n7 d = new n7(15);
    public static final f01 e = new f01(1, "NO_VALUE");
    public static Method f;
    public static Method g;
    public static boolean h;

    public static final void A(u62 u62Var) {
        j51.O(u62Var).D();
    }

    public static boolean B(int i) {
        return i != 0 && v50.e(i) > 0.5d;
    }

    public static boolean C(String str) {
        te teVar = m95.a;
        Set<ue> setUnmodifiableSet = Collections.unmodifiableSet(ue.c);
        HashSet<ue> hashSet = new HashSet();
        for (ue ueVar : setUnmodifiableSet) {
            if (ueVar.a.equals(str)) {
                hashSet.add(ueVar);
            }
        }
        if (hashSet.isEmpty()) {
            tb4.e("Unknown feature ".concat(str));
            return false;
        }
        for (ue ueVar2 : hashSet) {
            if (ueVar2.a() || ueVar2.b()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean D(long j) {
        return (j & 2) != 0;
    }

    public static final boolean E(long j) {
        return (j & 1) != 0;
    }

    public static boolean F(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static int H(int i, float f2, int i2) {
        return v50.g(v50.i(i2, Math.round(Color.alpha(i2) * f2)), i);
    }

    public static String I(String str) {
        return str == null ? "" : Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("\\p{M}", "").toLowerCase(Locale.getDefault());
    }

    public static final Object J(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static int N(Context context, int i, int i2) {
        TypedValue typedValueD = zz1.D(context, i);
        return (typedValueD == null || typedValueD.type != 16) ? i2 : typedValueD.data;
    }

    public static TimeInterpolator O(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            kf2.n("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
            return null;
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!F(strValueOf, "cubic-bezier") && !F(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (F(strValueOf, "cubic-bezier")) {
            String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
            if (strArrSplit.length == 4) {
                return new PathInterpolator(w(strArrSplit, 0), w(strArrSplit, 1), w(strArrSplit, 2), w(strArrSplit, 3));
            }
            mj0.f(strArrSplit.length, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
            return null;
        }
        if (!F(strValueOf, "path")) {
            kf2.n("Invalid motion easing type: ".concat(strValueOf));
            return null;
        }
        String strSubstring = strValueOf.substring(5, strValueOf.length() - 1);
        Path path = new Path();
        try {
            cf3.b(fh0.l(strSubstring), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e2) {
            nz2.s("Error in parsing ".concat(strSubstring), e2);
            return null;
        }
    }

    public static final boolean P(Favorite favorite) {
        int i;
        boolean z = false;
        String string = App.a().getSharedPreferences("homemusic_favorite_retries", 0).getString(String.valueOf(favorite.getTimestamp()), null);
        if (string == null) {
            string = b11.k("legacyfav:", favorite.getTimestamp());
        }
        if (favorite.getSongId() != null) {
            i = 1;
        } else {
            i = favorite.getAlbumId() != null ? 2 : 3;
        }
        String songId = favorite.getSongId();
        if (songId == null && (songId = favorite.getAlbumId()) == null) {
            songId = favorite.getArtistId();
        }
        boolean toStar = favorite.getToStar();
        HashMap map = n61.a;
        synchronized (n61.class) {
            if (songId == null) {
                return false;
            }
            HashMap map2 = n61.a;
            if (!map2.containsKey(n61.e(i, songId))) {
                k61 k61Var = new k61(songId, i, string, toStar);
                String strE = n61.e(i, songId);
                map2.put(strE, new l61(strE, toStar, null, k61Var));
                return true;
            }
            l61 l61Var = (l61) map2.get(n61.e(i, songId));
            while (l61Var != null && l61Var.e) {
                l61Var = l61Var.c;
            }
            if (l61Var != null && l61Var.f.d.equals(string)) {
                z = true;
            }
            return z;
        }
    }

    public static final Object Q(wf1 wf1Var) {
        Thread.interrupted();
        return fu.L(q01.n, new e73(wf1Var, null));
    }

    public static void R(Status status, Object obj, cr4 cr4Var) {
        if (status.n <= 0) {
            cr4Var.b(obj);
        } else {
            cr4Var.a(status.p != null ? new ResolvableApiException(status) : new ApiException(status));
        }
    }

    public static byte[] S(short s) {
        return new byte[]{(byte) (s & 255), (byte) ((s >> 8) & 255)};
    }

    public static int T(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    public static int U(Object obj) {
        return T(obj == null ? 0 : obj.hashCode());
    }

    public static final cd4 a(int i, int i2, wv wvVar) {
        if (i < 0) {
            kf2.e(f34.f(i, "replay cannot be negative, but was "));
            return null;
        }
        if (i2 < 0) {
            kf2.e(f34.f(i2, "extraBufferCapacity cannot be negative, but was "));
            return null;
        }
        if (i <= 0 && i2 <= 0 && wvVar != wv.n) {
            nz2.l(wvVar, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ");
            return null;
        }
        int i3 = i2 + i;
        if (i3 < 0) {
            i3 = Integer.MAX_VALUE;
        }
        return new cd4(i, i3, wvVar);
    }

    public static byte[] b(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)};
    }

    public static final float c(long j, long j2) {
        return Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static final void d(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static void f(vo4 vo4Var, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            if (obj == null) {
                vo4Var.e(i);
            } else if (obj instanceof byte[]) {
                vo4Var.x(i, (byte[]) obj);
            } else if (obj instanceof Float) {
                vo4Var.d(((Number) obj).floatValue(), i);
            } else if (obj instanceof Double) {
                vo4Var.d(((Number) obj).doubleValue(), i);
            } else if (obj instanceof Long) {
                vo4Var.c(i, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                vo4Var.c(i, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                vo4Var.c(i, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                vo4Var.c(i, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                vo4Var.h(i, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                vo4Var.c(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
    }

    public static byte[] j(char c2) {
        return new byte[]{(byte) (c2 & 255), (byte) ((c2 >> '\b') & 255)};
    }

    public static final int k(long j, long j2) {
        boolean zE = E(j);
        if (zE != E(j2)) {
            return zE ? -1 : 1;
        }
        int iSignum = (int) Math.signum(u(j) - u(j2));
        if (Math.min(u(j), u(j2)) >= 0.0f && D(j) != D(j2)) {
            return D(j) ? -1 : 1;
        }
        return iSignum;
    }

    public static int l(int i, int i2) {
        return v50.i(i, (Color.alpha(i) * i2) / 255);
    }

    public static byte[] m(df dfVar, Map map) throws IOException {
        l50 l50Var;
        if (map.entrySet().isEmpty()) {
            kf2.n("No color resources provided for harmonization.");
            return null;
        }
        l50 l50Var2 = new l50(127, dfVar.getPackageName());
        HashMap map2 = new HashMap();
        j50 j50Var = null;
        for (Map.Entry entry : map.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            String resourceName = dfVar.getResources().getResourceName(((Integer) entry.getKey()).intValue());
            j50 j50Var2 = new j50(resourceName, iIntValue, ((Integer) entry.getValue()).intValue());
            if (!dfVar.getResources().getResourceTypeName(((Integer) entry.getKey()).intValue()).equals("color")) {
                kf2.g(Integer.toHexString(j50Var2.b & 255), xa3.j("Non color resource found: name=", resourceName, ", typeId="));
                return null;
            }
            byte b2 = j50Var2.a;
            if (b2 == 1) {
                l50Var = b;
            } else {
                if (b2 != 127) {
                    kf2.n(f34.f(b2, "Not supported with unknown package id: "));
                    return null;
                }
                l50Var = l50Var2;
            }
            if (!map2.containsKey(l50Var)) {
                map2.put(l50Var, new ArrayList());
            }
            ((List) map2.get(l50Var)).add(j50Var2);
            j50Var = j50Var2;
        }
        byte b3 = j50Var.b;
        a = b3;
        if (b3 == 0) {
            kf2.n("No color resources found for harmonization.");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ArrayList arrayList = new ArrayList();
        int size = map2.size();
        o50 o50Var = new o50(new String[0], false);
        for (Map.Entry entry2 : map2.entrySet()) {
            List list = (List) entry2.getValue();
            Collections.sort(list, c);
            arrayList.add(new k50((l50) entry2.getKey(), list));
        }
        int size2 = arrayList.size();
        int iA = 0;
        int i = 0;
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            iA += ((k50) obj).a();
        }
        int i2 = o50Var.l + 12 + iA;
        byteArrayOutputStream.write(S((short) 2));
        byteArrayOutputStream.write(S((short) 12));
        byteArrayOutputStream.write(b(i2));
        byteArrayOutputStream.write(b(size));
        o50Var.a(byteArrayOutputStream);
        int size3 = arrayList.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj2 = arrayList.get(i3);
            i3++;
            k50 k50Var = (k50) obj2;
            o50 o50Var2 = k50Var.c;
            k50Var.a.a(byteArrayOutputStream);
            l50 l50Var3 = k50Var.b;
            byteArrayOutputStream.write(b(l50Var3.a));
            char[] charArray = l50Var3.b.toCharArray();
            for (int i4 = 0; i4 < 128; i4++) {
                if (i4 < charArray.length) {
                    byteArrayOutputStream.write(j(charArray[i4]));
                } else {
                    byteArrayOutputStream.write(j((char) 0));
                }
            }
            byteArrayOutputStream.write(b(288));
            byteArrayOutputStream.write(b(0));
            byteArrayOutputStream.write(b(o50Var2.l + 288));
            byteArrayOutputStream.write(b(0));
            byteArrayOutputStream.write(b(0));
            o50Var2.a(byteArrayOutputStream);
            k50Var.d.a(byteArrayOutputStream);
            gc gcVar = k50Var.e;
            ((m50) gcVar.b).a(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{a, 0, 0, 0});
            byteArrayOutputStream.write(b(gcVar.a));
            for (int i5 : (int[]) gcVar.c) {
                byteArrayOutputStream.write(b(i5));
            }
            ew4 ew4Var = (ew4) gcVar.d;
            m50 m50Var = (m50) ew4Var.p;
            int[] iArr = (int[]) ew4Var.r;
            m50Var.a(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{a, 0, 0, 0});
            byteArrayOutputStream.write(b(ew4Var.o));
            byteArrayOutputStream.write(b((iArr.length * 4) + 84));
            byteArrayOutputStream.write((byte[]) ew4Var.q);
            for (int i6 : iArr) {
                byteArrayOutputStream.write(b(i6));
            }
            for (n50 n50Var : (n50[]) ew4Var.s) {
                n50Var.getClass();
                byteArrayOutputStream.write(S((short) 8));
                byteArrayOutputStream.write(S((short) 2));
                byteArrayOutputStream.write(b(n50Var.a));
                byteArrayOutputStream.write(S((short) 8));
                byteArrayOutputStream.write(new byte[]{0, 28});
                byteArrayOutputStream.write(b(n50Var.b));
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static void n(Canvas canvas, boolean z) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (z) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!h) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    g = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    g = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = g;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            h = true;
        }
        if (z) {
            try {
                Method method4 = f;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z || (method = g) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static final p81 o(zc4 zc4Var, ne0 ne0Var, int i, wv wvVar) {
        return ((i == 0 || i == -3) && wvVar == wv.n) ? zc4Var : new b10(zc4Var, ne0Var, i, wvVar);
    }

    public static int r(int i, Context context, String str) {
        TypedValue typedValueF = zz1.F(i, context, str);
        int i2 = typedValueF.resourceId;
        return i2 != 0 ? context.getColor(i2) : typedValueF.data;
    }

    public static int s(Context context, int i, int i2) {
        TypedValue typedValueD = zz1.D(context, i);
        if (typedValueD == null) {
            return i2;
        }
        int i3 = typedValueD.resourceId;
        return i3 != 0 ? context.getColor(i3) : typedValueD.data;
    }

    public static int t(View view, int i) {
        Context context = view.getContext();
        TypedValue typedValueF = zz1.F(i, view.getContext(), view.getClass().getCanonicalName());
        int i2 = typedValueF.resourceId;
        return i2 != 0 ? context.getColor(i2) : typedValueF.data;
    }

    public static final float u(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static is0 v(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.listDivider});
        InsetDrawable insetDrawable = new InsetDrawable(typedArrayObtainStyledAttributes.getDrawable(0), 42, 0, 42, 42);
        typedArrayObtainStyledAttributes.recycle();
        is0 is0Var = new is0(context);
        is0Var.a = insetDrawable;
        return is0Var;
    }

    public static float w(String[] strArr, int i) {
        float f2 = Float.parseFloat(strArr[i]);
        if (f2 >= 0.0f && f2 <= 1.0f) {
            return f2;
        }
        tb4.f("Motion easing control point value must be between 0 and 1; instead got: ", f2);
        return 0.0f;
    }

    public static String x(Date date) {
        return date == null ? App.a().getString(app.homemusic.R.string.share_no_expiration) : new SimpleDateFormat("dd MMM, yyyy", Locale.getDefault()).format(date);
    }

    public static int y(int i, int i2) {
        if (i == 0) {
            i = 1;
        }
        return i / i2 > 0 ? i2 : i % i2;
    }

    public static SimpleDateFormat z(int i, int i2) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (i == 0) {
            str = "EEEE, MMMM d, yyyy";
        } else if (i == 1) {
            str = "MMMM d, yyyy";
        } else if (i == 2) {
            str = "MMM d, yyyy";
        } else {
            if (i != 3) {
                kf2.n(f34.f(i, "Unknown DateFormat style: "));
                return null;
            }
            str = "M/d/yy";
        }
        sb.append(str);
        sb.append(" ");
        if (i2 == 0 || i2 == 1) {
            str2 = "h:mm:ss a z";
        } else if (i2 == 2) {
            str2 = "h:mm:ss a";
        } else {
            if (i2 != 3) {
                kf2.n(f34.f(i2, "Unknown DateFormat style: "));
                return null;
            }
            str2 = "h:mm a";
        }
        sb.append(str2);
        return new SimpleDateFormat(sb.toString(), Locale.US);
    }

    public void G() {
    }

    public abstract void K(t0 t0Var, t0 t0Var2);

    public abstract void L(t0 t0Var, Thread thread);

    public void M(Context context, a aVar, ey3 ey3Var) {
    }

    public void e(Context context, hi1 hi1Var) {
    }

    public abstract boolean g(u0 u0Var, i0 i0Var, i0 i0Var2);

    public abstract boolean h(u0 u0Var, Object obj, Object obj2);

    public abstract boolean i(u0 u0Var, t0 t0Var, t0 t0Var2);

    public abstract i0 p(u0 u0Var);

    public abstract t0 q(u0 u0Var);
}
