package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yb3 {
    public static final String a = null;

    static {
        a = cx.i("PackageManagerHelper");
    }

    public static void a(Context r7, Class r8, boolean r9) {
        String r0 = "disabled";
        String r2 = a;
        int r4 = r7.getPackageManager().getComponentEnabledSetting(new ComponentName(r7, r8.getName()));     // Catch: Exception -> L11
        boolean r5 = false;
        if (r4 == 0) goto L8;
        if (r4 != 1) goto L8;
        r5 = true;
    L8:
        if (r9 != r5) goto L13;
        cx.f().b(r2, "Skipping component enablement for ".concat(r8.getName()));     // Catch: Exception -> L11
        return;
    L13:
        PackageManager r3 = r7.getPackageManager();     // Catch: Exception -> L11
        ComponentName r6 = new ComponentName(r7, r8.getName());     // Catch: Exception -> L11
        if (r9 == false) goto L16;
        int r10 = 1;
    L17:
        r3.setComponentEnabledSetting(r6, r10, 1);     // Catch: Exception -> L11
        cx r11 = cx.f();     // Catch: Exception -> L11
        StringBuilder r12 = new StringBuilder();     // Catch: Exception -> L11
        r12.append(r8.getName());     // Catch: Exception -> L11
        r12.append(" ");     // Catch: Exception -> L11
        if (r9 == false) goto L20;
        String r13 = "enabled";
    L21:
        r12.append(r13);     // Catch: Exception -> L11
        r11.b(r2, r12.toString());     // Catch: Exception -> L11
        return;
    L20:
        r13 = "disabled";
        goto L21
    L16:
        r10 = 2;
    L11:
        e = move-exception;
        cx r14 = cx.f();
        StringBuilder r15 = new StringBuilder();
        r15.append(r8.getName());
        r15.append("could not be ");
        if (r9 == false) goto L26;
        r0 = "enabled";
    L26:
        r15.append(r0);
        r14.c(r2, r15.toString(), e);
    }
}
