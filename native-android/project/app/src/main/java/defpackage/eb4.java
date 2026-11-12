package defpackage;

import android.content.ComponentName;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class eb4 implements bb4 {
    public static final String f = null;
    public static final String g = null;
    public static final String h = null;
    public static final String i = null;
    public static final String j = null;
    public static final String k = null;
    public final int a;
    public final int b;
    public final ComponentName c;
    public final String d;
    public final Bundle e;

    static {
        String r0 = f35.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        i = Integer.toString(3, 36);
        j = Integer.toString(4, 36);
        k = Integer.toString(5, 36);
    }

    public eb4(ComponentName r5, int r6) {
        String r0 = r5.getPackageName();
        Bundle r1 = Bundle.EMPTY;
        if (Build.MANUFACTURER.equals("samsung") == false) goto L7;
        if (Build.VERSION.SDK_INT != 36) goto L7;
    L8:
        boolean r2 = true;
    L10:
        rr2.l(r2);
        this.a = r6;
        this.b = 101;
        this.c = r5;
        this.d = r0;
        this.e = r1;
        return;
    L7:
        if (TextUtils.isEmpty(r0) == false) goto L8;
        r2 = false;
        goto L10
    }

    @Override // defpackage.bb4
    public final int a() {
        return this.a;
    }

    @Override // defpackage.bb4
    public final ComponentName b() {
        return this.c;
    }

    @Override // defpackage.bb4
    public final Object c() {
        return null;
    }

    @Override // defpackage.bb4
    public final String d() {
        ComponentName r0 = this.c;
        if (r0 != null) goto L7;
        return "";
    L7:
        return r0.getClassName();
    }

    @Override // defpackage.bb4
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof eb4) == false) goto L18;
        eb4 r4 = (eb4) r3;
        int r0 = r4.b;
        int r1 = this.b;
        if (r1 == r0) goto L9;
        return false;
    L9:
        if (r1 != 100) goto L11;
        return true;
    L11:
        if (r1 == 101) goto L15;
        return false;
    L15:
        return Objects.equals(this.c, r4.c);
    L18:
        return false;
    }

    @Override // defpackage.bb4
    public final int f() {
        return 0;
    }

    @Override // defpackage.bb4
    public final String g() {
        return this.d;
    }

    @Override // defpackage.bb4
    public final Bundle getExtras() {
        return new Bundle(this.e);
    }

    @Override // defpackage.bb4
    public final int getType() {
        if (this.b == 101) goto L6;
        return 0;
    L6:
        return 2;
    }

    @Override // defpackage.bb4
    public final Bundle h() {
        Bundle r0 = new Bundle();
        r0.putBundle(f, null);
        r0.putInt(g, this.a);
        r0.putInt(h, this.b);
        r0.putParcelable(i, this.c);
        r0.putString(j, this.d);
        r0.putBundle(k, this.e);
        return r0;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.b), this.c, null});
    }

    @Override // defpackage.bb4
    public final MediaSession.Token i() {
        return null;
    }

    public final String toString() {
        return f34.i(new StringBuilder("SessionToken {legacy, uid="), this.a, "}");
    }
}
