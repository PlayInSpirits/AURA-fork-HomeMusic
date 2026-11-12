package defpackage;

import android.content.ComponentName;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class db4 implements bb4 {
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final ComponentName g;
    public final IBinder h;
    public final Bundle i;
    public final MediaSession.Token j;

    static {
        String str = f35.a;
        k = Integer.toString(0, 36);
        l = Integer.toString(1, 36);
        m = Integer.toString(2, 36);
        n = Integer.toString(3, 36);
        o = Integer.toString(4, 36);
        p = Integer.toString(5, 36);
        q = Integer.toString(6, 36);
        r = Integer.toString(7, 36);
        s = Integer.toString(8, 36);
        t = Integer.toString(9, 36);
    }

    public db4(int i, int i2, int i3, int i4, String str, String str2, ComponentName componentName, IBinder iBinder, Bundle bundle, MediaSession.Token token) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = str;
        this.f = str2;
        this.g = componentName;
        this.h = iBinder;
        this.i = bundle;
        this.j = token;
    }

    @Override // defpackage.bb4
    public final int a() {
        return this.a;
    }

    @Override // defpackage.bb4
    public final ComponentName b() {
        return this.g;
    }

    @Override // defpackage.bb4
    public final Object c() {
        return this.h;
    }

    @Override // defpackage.bb4
    public final String d() {
        return this.f;
    }

    @Override // defpackage.bb4
    public final boolean e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof db4)) {
            return false;
        }
        db4 db4Var = (db4) obj;
        return this.a == db4Var.a && this.b == db4Var.b && this.c == db4Var.c && this.d == db4Var.d && TextUtils.equals(this.e, db4Var.e) && TextUtils.equals(this.f, db4Var.f) && Objects.equals(this.g, db4Var.g) && Objects.equals(this.h, db4Var.h) && Objects.equals(this.j, db4Var.j);
    }

    @Override // defpackage.bb4
    public final int f() {
        return this.d;
    }

    @Override // defpackage.bb4
    public final String g() {
        return this.e;
    }

    @Override // defpackage.bb4
    public final Bundle getExtras() {
        return new Bundle(this.i);
    }

    @Override // defpackage.bb4
    public final int getType() {
        return this.b;
    }

    @Override // defpackage.bb4
    public final Bundle h() {
        Bundle bundle = new Bundle();
        bundle.putInt(k, this.a);
        bundle.putInt(l, this.b);
        bundle.putInt(m, this.c);
        bundle.putString(n, this.e);
        bundle.putString(o, this.f);
        bundle.putBinder(q, this.h);
        bundle.putParcelable(p, this.g);
        bundle.putBundle(r, this.i);
        bundle.putInt(s, this.d);
        MediaSession.Token token = this.j;
        if (token != null) {
            bundle.putParcelable(t, token);
        }
        return bundle;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.e, this.f, this.g, this.h, this.j);
    }

    @Override // defpackage.bb4
    public final MediaSession.Token i() {
        return this.j;
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.e + " type=" + this.b + " libraryVersion=" + this.c + " interfaceVersion=" + this.d + " service=" + this.f + " IMediaSession=" + this.h + " extras=" + this.i + "}";
    }
}
