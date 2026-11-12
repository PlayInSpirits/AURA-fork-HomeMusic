package defpackage;

import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k95 extends ue {
    public final Pattern d;

    public k95() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.d = Pattern.compile("\\A\\d+");
    }

    @Override // defpackage.ue
    public final boolean a() {
        if (Build.VERSION.SDK_INT < 33) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // defpackage.ue
    public final boolean b() {
        boolean r0 = super.b();
        if (r0 == false) goto L22;
        int r1 = Build.VERSION.SDK_INT;
        if (r1 >= 29) goto L22;
        int r2 = j95.a;
        if (r1 < 26) goto L23;
        PackageInfo r3 = j3.c();
    L14:
        if (r3 != null) goto L16;
        return false;
    L16:
        Matcher r4 = this.d.matcher(r3.versionName);
        if (r4.find() == true) goto L19;
        return false;
    L19:
        if (Integer.parseInt(r3.versionName.substring(r4.start(), r4.end())) < 105) goto L26;
        return true;
    L26:
        return false;
    L23:
        r3 = j95.a();     // Catch: Throwable -> L12
    L12:
        r3 = null;
    L22:
        return r0;
    }
}
