package defpackage;

import android.os.Build;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ue {
    public static final HashSet c = null;
    public final String a;
    public final String b;

    static {
        c = new HashSet();
    }

    public ue(String r1, String r2) {
        this.a = r1;
        this.b = r2;
        c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet r0 = se.a;
        String r3 = this.b;
        if (r0.contains(r3) == true) goto L13;
        String r1 = Build.TYPE;
        if ("eng".equals(r1) == true) goto L9;
        if ("userdebug".equals(r1) == true) goto L9;
        return false;
    L9:
        if (r0.contains(r3.concat(":dev")) == true) goto L16;
        return false;
    L16:
        return true;
    L13:
        return true;
    }
}
