package defpackage;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.SubsonicResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ei0 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ei0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        Object s14Var;
        SubsonicResponse subsonicResponse;
        String strString;
        int i = this.a;
        int i2 = 0;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        boolean z = false;
        Object obj = null;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                fi0 fi0Var = (fi0) obj3;
                byte[] bArr = (byte[]) obj2;
                boolean z2 = fi0Var.q;
                Bitmap bitmapS = gb.s(bArr, bArr.length, fi0Var.p);
                return (!z2 || Build.VERSION.SDK_INT < 31) ? bitmapS : bitmapS.asShared();
            case 1:
                fi0 fi0Var2 = (fi0) obj3;
                Uri uri = (Uri) obj2;
                ci0 ci0VarM = fi0Var2.o.m();
                int i3 = fi0Var2.p;
                boolean z3 = fi0Var2.q;
                try {
                    zj0 zj0Var = (zj0) ci0VarM;
                    zj0Var.b(new ii0(uri, 0L, -1L));
                    byte[] bArrCopyOf = new byte[1024];
                    int i4 = 0;
                    while (i2 != -1) {
                        if (i4 == bArrCopyOf.length) {
                            bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
                        }
                        i2 = zj0Var.read(bArrCopyOf, i4, bArrCopyOf.length - i4);
                        if (i2 != -1) {
                            i4 += i2;
                        }
                    }
                    byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i4);
                    Bitmap bitmapS2 = gb.s(bArrCopyOf2, bArrCopyOf2.length, i3);
                    if (z3 && Build.VERSION.SDK_INT >= 31) {
                        bitmapS2 = bitmapS2.asShared();
                        break;
                    }
                    return bitmapS2;
                } finally {
                    ((zj0) ci0VarM).close();
                }
            case 2:
                String str = (String) obj2;
                try {
                    ApiResponse apiResponse = (ApiResponse) ((gp3) obj3).m(str).execute().body();
                    s14Var = (apiResponse != null && (subsonicResponse = apiResponse.getSubsonicResponse()) != null) ? subsonicResponse.getSong() : null;
                    break;
                } catch (Throwable th) {
                    s14Var = new s14(th);
                }
                Throwable thA = bb3.a(s14Var);
                if (thA != null) {
                    Log.w("HubPlayer", "getSong(" + str + ")", thA);
                }
                return (Child) (s14Var instanceof s14 ? null : s14Var);
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                String str2 = (String) obj3;
                f25 f25Var = (f25) obj2;
                f25Var.getClass();
                try {
                    o83 o83Var = (o83) f25Var.b.getValue();
                    nz3 nz3Var = new nz3();
                    nz3Var.d(str2);
                    oz3 oz3Var = new oz3(nz3Var);
                    o83Var.getClass();
                    k14 k14VarC = new bv3(o83Var, oz3Var).c();
                    try {
                        n14 n14Var = k14VarC.t;
                        if (!k14VarC.C) {
                            strString = null;
                        } else if (n14Var.source().G(1048577L)) {
                            Log.w("UpnpControlPoint", "description is over 1048576 bytes, ignoring it: ".concat(str2));
                            strString = null;
                        } else {
                            strString = n14Var.string();
                        }
                        k14VarC.close();
                        obj = strString;
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            q05.h(k14VarC, th2);
                            throw th3;
                        }
                    }
                } catch (Exception e) {
                    Log.w("UpnpControlPoint", "GET failed: " + str2, e);
                }
                return new kd3(str2, obj);
            default:
                pd5 pd5Var = (pd5) obj3;
                td5 td5Var = (td5) obj2;
                String str3 = td5Var.c;
                fd5 fd5Var = td5Var.i;
                if (pd5Var instanceof nd5) {
                    nc2 nc2Var = ((nd5) pd5Var).a;
                    int iG = fd5Var.g(str3);
                    yc5 yc5VarZ = td5Var.h.z();
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) yc5VarZ.n;
                    workDatabase_Impl.b();
                    aq4 aq4Var = (aq4) yc5VarZ.o;
                    df1 df1VarA = aq4Var.a();
                    df1VarA.h(1, str3);
                    try {
                        workDatabase_Impl.c();
                        try {
                            df1VarA.b();
                            workDatabase_Impl.t();
                            workDatabase_Impl.o();
                            aq4Var.h(df1VarA);
                            if (iG != 0) {
                                if (iG == 2) {
                                    dd5 dd5Var = td5Var.a;
                                    String str4 = td5Var.l;
                                    if (nc2Var instanceof mc2) {
                                        cx.f().g(ud5.a, "Worker result SUCCESS for " + str4);
                                        if (dd5Var.d()) {
                                            td5Var.c();
                                        } else {
                                            fd5Var.n(3, str3);
                                            oh0 oh0Var = ((mc2) nc2Var).a;
                                            oh0Var.getClass();
                                            fd5Var.m(str3, oh0Var);
                                            td5Var.f.getClass();
                                            long jCurrentTimeMillis = System.currentTimeMillis();
                                            wo0 wo0Var = td5Var.j;
                                            ArrayList arrayListW = wo0Var.w(str3);
                                            int size = arrayListW.size();
                                            int i5 = 0;
                                            while (i5 < size) {
                                                Object obj4 = arrayListW.get(i5);
                                                i5++;
                                                String str5 = (String) obj4;
                                                if (fd5Var.g(str5) == 5) {
                                                    w24 w24VarB = w24.b(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                                                    w24VarB.h(1, str5);
                                                    WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) wo0Var.n;
                                                    workDatabase_Impl2.b();
                                                    Cursor cursorH = xl.H(workDatabase_Impl2, w24VarB);
                                                    try {
                                                        Object[] objArr = cursorH.moveToFirst() && cursorH.getInt(0) != 0;
                                                        cursorH.close();
                                                        w24VarB.j();
                                                        if (objArr != false) {
                                                            cx.f().g(ud5.a, "Setting status to enqueued for ".concat(str5));
                                                            fd5Var.n(1, str5);
                                                            fd5Var.l(str5, jCurrentTimeMillis);
                                                        }
                                                    } catch (Throwable th4) {
                                                        cursorH.close();
                                                        w24VarB.j();
                                                        throw th4;
                                                    }
                                                }
                                            }
                                        }
                                    } else if (nc2Var instanceof lc2) {
                                        cx.f().g(ud5.a, "Worker result RETRY for " + str4);
                                        td5Var.b(-256);
                                        z = true;
                                    } else {
                                        cx.f().g(ud5.a, "Worker result FAILURE for " + str4);
                                        if (dd5Var.d()) {
                                            td5Var.c();
                                        } else {
                                            td5Var.d(nc2Var);
                                        }
                                    }
                                } else if (!f34.c(iG)) {
                                    td5Var.b(-512);
                                    z = true;
                                }
                            }
                        } catch (Throwable th5) {
                            workDatabase_Impl.o();
                            throw th5;
                        }
                    } catch (Throwable th6) {
                        aq4Var.h(df1VarA);
                        throw th6;
                    }
                } else if (pd5Var instanceof md5) {
                    td5Var.d(((md5) pd5Var).a);
                } else {
                    if (!(pd5Var instanceof od5)) {
                        er1.n();
                        return null;
                    }
                    int i6 = ((od5) pd5Var).a;
                    int iG2 = fd5Var.g(str3);
                    if (iG2 == 0 || f34.c(iG2)) {
                        String str6 = ud5.a;
                        cx cxVarF = cx.f();
                        StringBuilder sbJ = xa3.j("Status for ", str3, " is ");
                        sbJ.append(f34.q(iG2));
                        sbJ.append(" ; not doing any work");
                        cxVarF.b(str6, sbJ.toString());
                    } else {
                        String str7 = ud5.a;
                        cx cxVarF2 = cx.f();
                        StringBuilder sbJ2 = xa3.j("Status for ", str3, " is ");
                        sbJ2.append(f34.q(iG2));
                        sbJ2.append("; not doing any work and rescheduling for later execution");
                        cxVarF2.b(str7, sbJ2.toString());
                        fd5Var.n(1, str3);
                        fd5Var.o(i6, str3);
                        fd5Var.j(str3, -1L);
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
