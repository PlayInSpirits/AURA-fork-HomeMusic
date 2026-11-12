package defpackage;

import android.app.AppOpsManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jg5 extends ef5 {
    public final /* synthetic */ int f;
    public final Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg5(cr4 cr4Var, int i) {
        super(1, "com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback");
        this.f = i;
        switch (i) {
            case 1:
                this.g = cr4Var;
                super(1, "com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
                break;
            case 2:
                this.g = cr4Var;
                super(1, "com.google.android.gms.auth.api.identity.internal.IGetSignInIntentCallback");
                break;
            default:
                this.g = cr4Var;
                break;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.ef5
    public final boolean N0(int i, Parcel parcel, Parcel parcel2) {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        String strD;
        int i2 = this.f;
        Object obj = this.g;
        switch (i2) {
            case 0:
                if (i != 1) {
                    return false;
                }
                Status status = (Status) pg5.a(parcel, Status.CREATOR);
                s44 s44Var = (s44) pg5.a(parcel, s44.CREATOR);
                pg5.b(parcel);
                g12.R(status, s44Var, (cr4) obj);
                return true;
            case 1:
                if (i != 1) {
                    return false;
                }
                Status status2 = (Status) pg5.a(parcel, Status.CREATOR);
                ds dsVar = (ds) pg5.a(parcel, ds.CREATOR);
                pg5.b(parcel);
                g12.R(status2, dsVar, (cr4) obj);
                return true;
            case 2:
                if (i != 1) {
                    return false;
                }
                Status status3 = (Status) pg5.a(parcel, Status.CREATOR);
                PendingIntent pendingIntent = (PendingIntent) pg5.a(parcel, PendingIntent.CREATOR);
                pg5.b(parcel);
                g12.R(status3, pendingIntent, (cr4) obj);
                return true;
            default:
                RevocationBoundService revocationBoundService = (RevocationBoundService) obj;
                if (i != 1) {
                    if (i != 2) {
                        return false;
                    }
                    P0();
                    zg5.E(revocationBoundService).F();
                    return true;
                }
                P0();
                bm4 bm4VarA = bm4.a(revocationBoundService);
                GoogleSignInAccount googleSignInAccountB = bm4VarA.b();
                GoogleSignInOptions googleSignInOptionsB = GoogleSignInOptions.x;
                if (googleSignInAccountB != null) {
                    String strD2 = bm4VarA.d("defaultGoogleSignInAccount");
                    if (TextUtils.isEmpty(strD2) || (strD = bm4VarA.d(bm4.f("googleSignInOptions", strD2))) == null) {
                        googleSignInOptionsB = null;
                    } else {
                        try {
                            googleSignInOptionsB = GoogleSignInOptions.b(strD);
                        } catch (JSONException unused) {
                            googleSignInOptionsB = null;
                        }
                    }
                }
                GoogleSignInOptions googleSignInOptions = googleSignInOptionsB;
                ji2.m(googleSignInOptions);
                r61 r61Var = new r61((RevocationBoundService) obj, null, fn.a, googleSignInOptions, new cj1(new pa(7), Looper.getMainLooper()));
                Context context = r61Var.a;
                if5 if5Var = r61Var.h;
                if (googleSignInAccountB == null) {
                    boolean z = r61Var.c() == 3;
                    ge2 ge2Var = yg5.a;
                    if (ge2Var.c <= 3) {
                        Log.d(ge2Var.a, ge2Var.b.concat("Signing out"));
                    }
                    yg5.a(context);
                    if (z) {
                        zl4 zl4Var = new zl4(if5Var);
                        zl4Var.e(Status.r);
                        basePendingResult = zl4Var;
                    } else {
                        wg5 wg5Var = new wg5(if5Var, 0);
                        if5Var.a(wg5Var);
                        basePendingResult = wg5Var;
                    }
                    basePendingResult.a(new cf5(basePendingResult, new cr4(), new z45(7)));
                    return true;
                }
                boolean z2 = r61Var.c() == 3;
                ge2 ge2Var2 = yg5.a;
                if (ge2Var2.c <= 3) {
                    Log.d(ge2Var2.a, ge2Var2.b.concat("Revoking access"));
                }
                String strD3 = bm4.a(context).d("refreshToken");
                yg5.a(context);
                if (!z2) {
                    wg5 wg5Var2 = new wg5(if5Var, 1);
                    if5Var.a(wg5Var2);
                    basePendingResult2 = wg5Var2;
                } else if (strD3 == null) {
                    ge2 ge2Var3 = ng5.p;
                    Status status4 = new Status(4, null, null, null);
                    ji2.h("Status code must not be SUCCESS", !false);
                    zf5 zf5Var = new zf5(status4);
                    zf5Var.e(status4);
                    basePendingResult2 = zf5Var;
                } else {
                    ng5 ng5Var = new ng5(strD3);
                    new Thread(ng5Var).start();
                    basePendingResult2 = ng5Var.o;
                }
                basePendingResult2.a(new cf5(basePendingResult2, new cr4(), new z45(7)));
                return true;
        }
    }

    public void P0() {
        RevocationBoundService revocationBoundService = (RevocationBoundService) this.g;
        int callingUid = Binder.getCallingUid();
        si1 si1VarA = ae5.a(revocationBoundService);
        si1VarA.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) ((Context) si1VarA.o).getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(callingUid, "com.google.android.gms");
            try {
                PackageInfo packageInfo = revocationBoundService.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                oj1 oj1VarB = oj1.b(revocationBoundService);
                oj1VarB.getClass();
                if (packageInfo != null) {
                    if (oj1.d(packageInfo, false)) {
                        return;
                    }
                    if (oj1.d(packageInfo, true)) {
                        Context context = oj1VarB.n;
                        try {
                            if (!lj1.c) {
                                PackageInfo packageInfo2 = ((Context) ae5.a(context).o).getPackageManager().getPackageInfo("com.google.android.gms", 64);
                                oj1.b(context);
                                if (packageInfo2 == null || oj1.d(packageInfo2, false) || !oj1.d(packageInfo2, true)) {
                                    lj1.b = false;
                                } else {
                                    lj1.b = true;
                                }
                            }
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
                        } finally {
                            lj1.c = true;
                        }
                        if (lj1.b || !"user".equals(Build.TYPE)) {
                            return;
                        } else {
                            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
            throw new SecurityException(b11.j(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
        } catch (SecurityException unused2) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg5(RevocationBoundService revocationBoundService) {
        super(1, "com.google.android.gms.auth.api.signin.internal.IRevocationService");
        this.f = 3;
        this.g = revocationBoundService;
    }
}
