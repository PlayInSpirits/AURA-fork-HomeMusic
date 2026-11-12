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
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public final int a;
    public final int b;
    public final ComponentName c;
    public final String d;
    public final Bundle e;

    static {
        String str = f35.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        i = Integer.toString(3, 36);
        j = Integer.toString(4, 36);
        k = Integer.toString(5, 36);
    }

    public eb4(ComponentName componentName, int i2) {
        String packageName = componentName.getPackageName();
        Bundle bundle = Bundle.EMPTY;
        rr2.l((Build.MANUFACTURER.equals("samsung") && Build.VERSION.SDK_INT == 36) || !TextUtils.isEmpty(packageName));
        this.a = i2;
        this.b = 101;
        this.c = componentName;
        this.d = packageName;
        this.e = bundle;
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
        ComponentName componentName = this.c;
        return componentName == null ? "" : componentName.getClassName();
    }

    @Override // defpackage.bb4
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eb4)) {
            return false;
        }
        eb4 eb4Var = (eb4) obj;
        int i2 = eb4Var.b;
        int i3 = this.b;
        if (i3 != i2) {
            return false;
        }
        if (i3 == 100) {
            return true;
        }
        if (i3 != 101) {
            return false;
        }
        return Objects.equals(this.c, eb4Var.c);
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
        return this.b != 101 ? 0 : 2;
    }

    @Override // defpackage.bb4
    public final Bundle h() {
        Bundle bundle = new Bundle();
        bundle.putBundle(f, null);
        bundle.putInt(g, this.a);
        bundle.putInt(h, this.b);
        bundle.putParcelable(i, this.c);
        bundle.putString(j, this.d);
        bundle.putBundle(k, this.e);
        return bundle;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), this.c, null);
    }

    @Override // defpackage.bb4
    public final MediaSession.Token i() {
        return null;
    }

    public final String toString() {
        return f34.i(new StringBuilder("SessionToken {legacy, uid="), this.a, "}");
    }
}
