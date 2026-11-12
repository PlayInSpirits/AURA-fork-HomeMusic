package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d05 {
    public static final vr1 a;
    public static final fg4 b;
    public static Paint c;

    static {
        Trace.beginSection(xl.N("TypefaceCompat static init"));
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            a = new j05();
        } else if (i >= 29) {
            a = new i05();
        } else if (i >= 28) {
            a = new h05();
        } else if (i >= 26) {
            a = new g05();
        } else {
            Method method = f05.e;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                a = new f05();
            } else {
                a = new e05();
            }
        }
        b = new fg4(16);
        c = null;
        Trace.endSection();
    }

    public static Typeface a(Context context, xa1 xa1Var, Resources resources, int i, String str, int i2, int i3, au0 au0Var, boolean z) {
        Typeface typefaceE;
        Typeface typefaceBuild;
        FontFamily fontFamilyBuild;
        int i4 = 19;
        int i5 = -3;
        if (xa1Var instanceof ab1) {
            ab1 ab1Var = (ab1) xa1Var;
            String str2 = ab1Var.d;
            typefaceE = null;
            int i6 = 1;
            int i7 = 0;
            if (TextUtils.isEmpty(str2) || (typefaceBuild = c(str2)) == null) {
                ArrayList arrayList = ab1Var.a;
                if (arrayList.size() != 1) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i8 = 0;
                        while (true) {
                            if (i8 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilderC = null;
                                int i9 = 0;
                                while (true) {
                                    if (i9 < arrayList.size()) {
                                        pa1 pa1Var = (pa1) arrayList.get(i9);
                                        if (i9 == arrayList.size() - 1 && TextUtils.isEmpty(pa1Var.f)) {
                                            customFallbackBuilderC.setSystemFallback(pa1Var.e);
                                        } else {
                                            String str3 = pa1Var.e;
                                            String str4 = pa1Var.f;
                                            Font fontD = d(c(str3));
                                            if (fontD == null) {
                                                Log.w("TypefaceCompat", "Unable identify the primary font for " + pa1Var.e + ". Falling back to provider font.");
                                            } else {
                                                if (TextUtils.isEmpty(str4)) {
                                                    fontFamilyBuild = lm4.y(fontD).build();
                                                } else {
                                                    try {
                                                        lm4.m();
                                                        lm4.z();
                                                        fontFamilyBuild = lm4.h(b05.c(fontD).setFontVariationSettings(str4).build()).build();
                                                    } catch (IOException unused) {
                                                        Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                                    }
                                                }
                                                if (customFallbackBuilderC == null) {
                                                    customFallbackBuilderC = lm4.c(fontFamilyBuild);
                                                } else {
                                                    customFallbackBuilderC.addCustomFallback(fontFamilyBuild);
                                                }
                                                i9++;
                                            }
                                        }
                                    }
                                    typefaceBuild = customFallbackBuilderC.build();
                                    break;
                                }
                            }
                            if (c(((pa1) arrayList.get(i8)).e) != null) {
                                i8++;
                            }
                            typefaceBuild = null;
                            break;
                        }
                    }
                    typefaceBuild = null;
                    break;
                }
                typefaceBuild = c(((pa1) arrayList.get(0)).e);
            }
            if (typefaceBuild != null) {
                if (au0Var != null) {
                    new Handler(Looper.getMainLooper()).post(new ur2(i4, au0Var, typefaceBuild));
                }
                b.l(b(resources, i, str, i2, i3), typefaceBuild);
                return typefaceBuild;
            }
            boolean z2 = !z ? au0Var != null : ab1Var.c != 0;
            int i10 = z ? ab1Var.b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            c05 c05Var = new c05();
            c05Var.n = au0Var;
            ArrayList arrayList2 = ab1Var.a;
            ok okVar = new ok(handler, 2);
            wo0 wo0Var = new wo0(c05Var, okVar);
            int i11 = 6;
            if (!z2) {
                String strA = wa1.a(arrayList2, i3);
                Typeface typeface = (Typeface) wa1.a.g(strA);
                if (typeface != null) {
                    okVar.execute(new lg1(i11, c05Var, typeface));
                    typefaceE = typeface;
                } else {
                    ua1 ua1Var = new ua1(i7, wo0Var);
                    synchronized (wa1.c) {
                        try {
                            yd4 yd4Var = wa1.d;
                            ArrayList arrayList3 = (ArrayList) yd4Var.get(strA);
                            if (arrayList3 != null) {
                                arrayList3.add(ua1Var);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(ua1Var);
                                yd4Var.put(strA, arrayList4);
                                ta1 ta1Var = new ta1(strA, context, arrayList2, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = wa1.b;
                                ua1 ua1Var2 = new ua1(i6, strA);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                pb0 pb0Var = new pb0();
                                pb0Var.o = ta1Var;
                                pb0Var.p = ua1Var2;
                                pb0Var.q = handler2;
                                threadPoolExecutor.execute(pb0Var);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    kf2.n("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
                pa1 pa1Var2 = (pa1) arrayList2.get(0);
                fg4 fg4Var = wa1.a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{pa1Var2}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String strA2 = wa1.a(Collections.unmodifiableList(arrayList5), i3);
                Typeface typeface2 = (Typeface) wa1.a.g(strA2);
                if (typeface2 != null) {
                    okVar.execute(new lg1(i11, c05Var, typeface2));
                    typefaceE = typeface2;
                } else if (i10 == -1) {
                    Object[] objArr = {pa1Var2};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    va1 va1VarB = wa1.b(strA2, context, Collections.unmodifiableList(arrayList6), i3);
                    wo0Var.H(va1VarB);
                    typefaceE = va1VarB.a;
                } else {
                    try {
                        try {
                            try {
                                va1 va1Var = (va1) wa1.b.submit(new ta1(strA2, context, pa1Var2, i3, 0)).get(i10, TimeUnit.MILLISECONDS);
                                wo0Var.H(va1Var);
                                typefaceE = va1Var.a;
                            } catch (InterruptedException e) {
                                throw e;
                            }
                        } catch (ExecutionException e2) {
                            throw new RuntimeException(e2);
                        } catch (TimeoutException unused2) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused3) {
                        ((ok) wo0Var.o).execute(new rq(i5, i6, (c05) wo0Var.n));
                    }
                }
            }
        } else {
            typefaceE = a.e(context, (ya1) xa1Var, resources, i3);
            if (au0Var != null) {
                if (typefaceE != null) {
                    new Handler(Looper.getMainLooper()).post(new ur2(i4, au0Var, typefaceE));
                } else {
                    au0Var.e(-3);
                }
            }
        }
        if (typefaceE != null) {
            b.l(b(resources, i, str, i2, i3), typefaceE);
        }
        return typefaceE;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        if (c == null) {
            c = new Paint();
        }
        c.setTextSize(10.0f);
        c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
