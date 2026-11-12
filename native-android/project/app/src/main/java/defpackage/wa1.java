package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wa1 {
    public static final fg4 a = new fg4(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final yd4 d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new h5(2));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new yd4(0);
    }

    public static String a(List list, int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((pa1) list.get(i2)).g);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static va1 b(String str, Context context, List list, int i) {
        int i2;
        Typeface typefaceF;
        fg4 fg4Var = a;
        Trace.beginSection(xl.N("getFontSync"));
        try {
            Typeface typeface = (Typeface) fg4Var.g(str);
            if (typeface != null) {
                va1 va1Var = new va1(typeface);
                Trace.endSection();
                return va1Var;
            }
            try {
                qn0 qn0VarA = oa1.a(context, list);
                List list2 = qn0VarA.b;
                int i3 = qn0VarA.a;
                if (i3 == 0) {
                    ib1[] ib1VarArr = (ib1[]) list2.get(0);
                    if (ib1VarArr == null || ib1VarArr.length == 0) {
                        i2 = 1;
                    } else {
                        int length = ib1VarArr.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                i2 = 0;
                                break;
                            }
                            int i5 = ib1VarArr[i4].f;
                            if (i5 != 0) {
                                if (i5 >= 0) {
                                    i2 = i5;
                                    break;
                                }
                                i2 = -3;
                                break;
                            }
                            i4++;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        i2 = -3;
                        break;
                    }
                    i2 = -2;
                }
                if (i2 != 0) {
                    va1 va1Var2 = new va1(i2);
                    Trace.endSection();
                    return va1Var2;
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    ib1[] ib1VarArr2 = (ib1[]) list2.get(0);
                    vr1 vr1Var = d05.a;
                    Trace.beginSection(xl.N("TypefaceCompat.createFromFontInfo"));
                    try {
                        typefaceF = d05.a.f(context, ib1VarArr2, i);
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    vr1 vr1Var2 = d05.a;
                    Trace.beginSection(xl.N("TypefaceCompat.createFromFontInfoWithFallback"));
                    try {
                        typefaceF = d05.a.g(context, list2, i);
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (typefaceF == null) {
                    va1 va1Var3 = new va1(-3);
                    Trace.endSection();
                    return va1Var3;
                }
                fg4Var.l(str, typefaceF);
                va1 va1Var4 = new va1(typefaceF);
                Trace.endSection();
                return va1Var4;
            } catch (PackageManager.NameNotFoundException unused) {
                va1 va1Var5 = new va1(-1);
                Trace.endSection();
                return va1Var5;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
