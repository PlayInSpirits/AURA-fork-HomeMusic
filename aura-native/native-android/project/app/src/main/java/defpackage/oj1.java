package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oj1 implements zj2 {
    public static oj1 o;
    public final Context n;

    public oj1(Context context, int i) {
        switch (i) {
            case 1:
                this.n = context;
                break;
            default:
                this.n = context.getApplicationContext();
                break;
        }
    }

    public static oj1 b(Context context) {
        ji2.m(context);
        synchronized (oj1.class) {
            if (o == null) {
                aj5 aj5Var = mk5.a;
                synchronized (mk5.class) {
                    if (mk5.c == null) {
                        mk5.c = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                o = new oj1(context, 0);
            }
        }
        return o;
    }

    public static final ik5 c(PackageInfo packageInfo, ik5... ik5VarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            kk5 kk5Var = new kk5(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < ik5VarArr.length; i++) {
                if (ik5VarArr[i].equals(kk5Var)) {
                    return ik5VarArr[i];
                }
            }
        }
        return null;
    }

    public static final boolean d(PackageInfo packageInfo, boolean z) {
        PackageInfo packageInfo2;
        if (!z) {
            packageInfo2 = packageInfo;
        } else if (packageInfo != null) {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            packageInfo2 = packageInfo;
        } else {
            packageInfo2 = null;
        }
        if (packageInfo != null && packageInfo2.signatures != null) {
            if ((z ? c(packageInfo2, lk5.a) : c(packageInfo2, lk5.a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.zj2
    public ak2 a(ml3 ml3Var) {
        Context context;
        int i = Build.VERSION.SDK_INT;
        if (i < 31 && ((context = this.n) == null || i < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            return new xi4(16).a(ml3Var);
        }
        int iH = lw2.h(((tb1) ml3Var.c).n);
        l93.K("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(f35.H(iH)));
        mf4 mf4Var = new mf4(new xk(iH, 0), new xk(iH, 1));
        mf4Var.o = true;
        return mf4Var.a(ml3Var);
    }
}
