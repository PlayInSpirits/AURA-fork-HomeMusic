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

    public jg5(cr4 r2, int r3) {
        this.f = r3;
        switch(r3) {
            case 1: goto L8;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        this.g = r2;
        super(1, "com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback");
        return;
    L6:
        this.g = r2;
        super(1, "com.google.android.gms.auth.api.identity.internal.IGetSignInIntentCallback");
        return;
    L8:
        this.g = r2;
        super(1, "com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
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
    public final boolean N0(int r10, Parcel r11, Parcel r12) {
        int r13 = this.f;
        boolean r1 = false;
        Object r2 = this.g;
        switch(r13) {
            case 0: goto L56;
            case 1: goto L52;
            case 2: goto L48;
            default: goto L4;
        };
    L4:
        RevocationBoundService r14 = (RevocationBoundService) r2;
        if (r10 != 1) goto L7;
        P0();
        bm4 r9 = bm4.a(r14);
        GoogleSignInAccount r15 = r9.b();
        GoogleSignInOptions r16 = GoogleSignInOptions.x;
        if (r15 == null) goto L20;
        String r17 = r9.d("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(r17) == true) goto L19;
        String r18 = r9.d(bm4.f("googleSignInOptions", r17));
        if (r18 == null) goto L19;
        r16 = GoogleSignInOptions.b(r18);     // Catch: JSONException -> L60
    L19:
        r16 = null;
    L20:
        GoogleSignInOptions r7 = r16;
        ji2.m(r7);
        r61 r3 = new r61((RevocationBoundService) r2, null, fn.a, r7, new cj1(new pa(7), Looper.getMainLooper()));
        Context r4 = r3.a;
        if5 r5 = r3.h;
        if (r15 == null) goto L36;
        if (r3.c() != 3) goto L25;
        r1 = true;
    L25:
        ge2 r19 = yg5.a;
        if (r19.c > 3) goto L28;
        Log.d(r19.a, r19.b.concat("Revoking access"));
    L28:
        String r20 = bm4.a(r4).d("refreshToken");
        yg5.a(r4);
        if (r1 == false) goto L33;
        if (r20 != null) goto L32;
        ge2 r21 = ng5.p;
        Status r22 = new Status(4, null, null, null);
        ji2.h("Status code must not be SUCCESS", !false);
        zf5 r110 = new zf5(r22);
        r110.e(r22);
        BasePendingResult r111 = r110;
    L34:
        r111.a(new cf5(r111, new cr4(), new z45(7)));
        return true;
    L32:
        ng5 r112 = new ng5(r20);
        new Thread(r112).start();
        r111 = r112.o;
        goto L34
    L33:
        wg5 r113 = new wg5(r5, 1);
        r5.a(r113);
        r111 = r113;
        goto L34
    L36:
        if (r3.c() != 3) goto L38;
        boolean r114 = true;
    L39:
        ge2 r115 = yg5.a;
        if (r115.c > 3) goto L42;
        Log.d(r115.a, r115.b.concat("Signing out"));
    L42:
        yg5.a(r4);
        if (r114 == false) goto L45;
        zl4 r23 = new zl4(r5);
        r23.e(Status.r);
        BasePendingResult r24 = r23;
    L46:
        r24.a(new cf5(r24, new cr4(), new z45(7)));
        return true;
    L45:
        wg5 r25 = new wg5(r5, 0);
        r5.a(r25);
        r24 = r25;
        goto L46
    L38:
        r114 = false;
        goto L39
    L7:
        if (r10 != 2) goto L63;
        P0();
        zg5.E(r14).F();
        return true;
    L63:
        return false;
    L48:
        if (r10 != 1) goto L51;
        Status r26 = (Status) pg5.a(r11, Status.CREATOR);
        PendingIntent r116 = (PendingIntent) pg5.a(r11, PendingIntent.CREATOR);
        pg5.b(r11);
        g12.R(r26, r116, (cr4) r2);
        return true;
    L51:
        return false;
    L52:
        if (r10 != 1) goto L55;
        Status r27 = (Status) pg5.a(r11, Status.CREATOR);
        ds r117 = (ds) pg5.a(r11, ds.CREATOR);
        pg5.b(r11);
        g12.R(r27, r117, (cr4) r2);
        return true;
    L55:
        return false;
    L56:
        if (r10 != 1) goto L59;
        Status r28 = (Status) pg5.a(r11, Status.CREATOR);
        s44 r118 = (s44) pg5.a(r11, s44.CREATOR);
        pg5.b(r11);
        g12.R(r28, r118, (cr4) r2);
        return true;
    L59:
        return false;
    }

    public void P0() {
        RevocationBoundService r5 = (RevocationBoundService) this.g;
        int r0 = Binder.getCallingUid();
        si1 r2 = ae5.a(r5);
        r2.getClass();
        AppOpsManager r3 = (AppOpsManager) ((Context) r2.o).getSystemService("appops");     // Catch: SecurityException -> L48
        if (r3 == null) goto L45;
        r3.checkPackage(r0, "com.google.android.gms");     // Catch: SecurityException -> L48
        PackageInfo r1 = r5.getPackageManager().getPackageInfo("com.google.android.gms", 64);     // Catch: PackageManager.NameNotFoundException -> L41
        oj1 r6 = oj1.b(r5);
        r6.getClass();
        if (r1 == null) goto L47;
        if (oj1.d(r1, false) == false) goto L14;
        return;
    L14:
        if (oj1.d(r1, true) == false) goto L47;
        Context r7 = r6.n;
        if (lj1.c == true) goto L35;
        PackageInfo r4 = ((Context) ae5.a(r7).o).getPackageManager().getPackageInfo("com.google.android.gms", 64);     // Catch: Throwable -> L24 PackageManager.NameNotFoundException -> L26
        oj1.b(r7);     // Catch: Throwable -> L24 PackageManager.NameNotFoundException -> L26
        if (r4 != null) goto L20;
    L28:
        lj1.b = false;     // Catch: Throwable -> L24 PackageManager.NameNotFoundException -> L26
    L29:
        lj1.c = true;
        goto L35
    L20:
        if (oj1.d(r4, false) == true) goto L28;
        if (oj1.d(r4, true) == false) goto L28;
        lj1.b = true;     // Catch: Throwable -> L24 PackageManager.NameNotFoundException -> L26
    L26:
        e = move-exception;
        Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);     // Catch: Throwable -> L24
        lj1.c = true;
    L35:
        if (lj1.b == false) goto L37;
        return;
    L37:
        if ("user".equals(Build.TYPE) == false) goto L55;
        Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        goto L47
    L55:
        return;
    L24:
        th = move-exception;
        lj1.c = true;
        throw th;
    L42:
        if (Log.isLoggable("UidVerifier", 3) == false) goto L47;
        Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
        goto L47
    L45:
        throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");     // Catch: SecurityException -> L48
    L47:
        throw new SecurityException(b11.j(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
    }

    public jg5(RevocationBoundService r3) {
        this.f = 3;
        super(1, "com.google.android.gms.auth.api.signin.internal.IRevocationService");
        this.g = r3;
    }
}
