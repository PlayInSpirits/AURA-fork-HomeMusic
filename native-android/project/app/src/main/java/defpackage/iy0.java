package defpackage;

import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class iy0 implements jy0 {
    public Long a;

    @Override // defpackage.jy0
    public final boolean a() {
        if (this.a != null) goto L8;
        Method r0 = Build.class.getDeclaredMethod("getLong", new Class[]{String.class});     // Catch: Exception -> L6
        r0.setAccessible(true);     // Catch: Exception -> L6
        Long r1 = (Long) r0.invoke(null, new Object[]{"ro.build.version.oneui"});     // Catch: Exception -> L6
        r1.longValue();     // Catch: Exception -> L6
        this.a = r1;     // Catch: Exception -> L6
    L6:
        this.a = -1L;
    L8:
        if (this.a.longValue() >= 40100) goto L14;
        return false;
    L14:
        return true;
    }
}
