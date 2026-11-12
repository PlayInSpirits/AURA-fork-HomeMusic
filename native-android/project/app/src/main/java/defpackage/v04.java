package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class v04 implements t04 {
    public static final ab3 b = null;
    public final Context a;

    static {
        b = new ab3("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, ab3.e);
    }

    public v04(Context r1) {
        this.a = r1.getApplicationContext();
    }

    @Override // defpackage.t04
    public final boolean a(Object r1, db3 r2) {
        String r0 = ((Uri) r1).getScheme();
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.equals("android.resource") == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.t04
    public final /* bridge */ /* synthetic */ q04 b(Object r1, int r2, int r3, db3 r4) {
        return c((Uri) r1, r4);
    }

    public final q04 c(Uri r9, db3 r10) {
        String r0 = r9.getAuthority();
        if (TextUtils.isEmpty(r0) == true) goto L43;
        Context r8 = this.a;
        if (r0.equals(r8.getPackageName()) == false) goto L47;
    L6:
        Context r1 = r8;
    L13:
        List<String> r4 = r9.getPathSegments();
        if (r4.size() != 2) goto L23;
        List<String> r5 = r9.getPathSegments();
        String r6 = r9.getAuthority();
        String r3 = r5.get(0);
        String r7 = r5.get(1);
        int r11 = r1.getResources().getIdentifier(r7, r3, r6);
        if (r11 != 0) goto L18;
        r11 = Resources.getSystem().getIdentifier(r7, r3, "android");
    L18:
        if (r11 != 0) goto L27;
        mj0.l(r9, "Failed to find resource id for: ");
        return null;
    L27:
        if (r0.equals(r8.getPackageName()) == false) goto L29;
        Resources.Theme r12 = (Resources.Theme) r10.c(b);
    L30:
        if (r12 != null) goto L32;
        Drawable r13 = uc5.p(r8, r1, r11, null);
    L33:
        if (r13 != null) goto L35;
        return null;
    L35:
        return new wh1(r13, 1);
    L32:
        r13 = uc5.p(r8, r8, r11, r12);
        goto L33
    L29:
        r12 = null;
        goto L30
    L23:
        if (r4.size() == 1) goto L45;
        mj0.l(r9, "Unrecognized Uri format: ");
        return null;
    L45:
        r11 = Integer.parseInt(r9.getPathSegments().get(0));     // Catch: NumberFormatException -> L36
    L36:
        e = move-exception;
        throw new IllegalArgumentException("Unrecognized Uri format: " + r9, e);
    L47:
        r1 = r8.createPackageContext(r0, 0);     // Catch: PackageManager.NameNotFoundException -> L9
    L9:
        e = move-exception;
        if (r0.contains(r8.getPackageName()) == true) goto L6;
        throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + r9, e);
    L43:
        nz2.w(r9, " is null or empty", "Package name for ");
        return null;
    }
}
