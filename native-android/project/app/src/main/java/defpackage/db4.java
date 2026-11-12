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
    public static final String k = null;
    public static final String l = null;
    public static final String m = null;
    public static final String n = null;
    public static final String o = null;
    public static final String p = null;
    public static final String q = null;
    public static final String r = null;
    public static final String s = null;
    public static final String t = null;
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
        String r0 = f35.a;
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

    public db4(int r1, int r2, int r3, int r4, String r5, String r6, ComponentName r7, IBinder r8, Bundle r9, MediaSession.Token r10) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
        this.g = r7;
        this.h = r8;
        this.i = r9;
        this.j = r10;
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

    public final boolean equals(Object r4) {
        if ((r4 instanceof db4) == true) goto L5;
        return false;
    L5:
        db4 r5 = (db4) r4;
        if (this.a == r5.a) goto L8;
    L25:
        return false;
    L8:
        if (this.b != r5.b) goto L25;
        if (this.c != r5.c) goto L25;
        if (this.d != r5.d) goto L25;
        if (TextUtils.equals(this.e, r5.e) == false) goto L25;
        if (TextUtils.equals(this.f, r5.f) == false) goto L25;
        if (Objects.equals(this.g, r5.g) == false) goto L25;
        if (Objects.equals(this.h, r5.h) == false) goto L25;
        if (Objects.equals(this.j, r5.j) == false) goto L25;
        return true;
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
        Bundle r0 = new Bundle();
        r0.putInt(k, this.a);
        r0.putInt(l, this.b);
        r0.putInt(m, this.c);
        r0.putString(n, this.e);
        r0.putString(o, this.f);
        r0.putBinder(q, this.h);
        r0.putParcelable(p, this.g);
        r0.putBundle(r, this.i);
        r0.putInt(s, this.d);
        MediaSession.Token r3 = this.j;
        if (r3 == null) goto L5;
        r0.putParcelable(t, r3);
    L5:
        return r0;
    }

    public final int hashCode() {
        Integer r1 = Integer.valueOf(this.a);
        Integer r2 = Integer.valueOf(this.b);
        Integer r3 = Integer.valueOf(this.c);
        Integer r4 = Integer.valueOf(this.d);
        IBinder r8 = this.h;
        MediaSession.Token r9 = this.j;
        return Objects.hash(new Object[]{r1, r2, r3, r4, this.e, this.f, this.g, r8, r9});
    }

    @Override // defpackage.bb4
    public final MediaSession.Token i() {
        return this.j;
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.e + " type=" + this.b + " libraryVersion=" + this.c + " interfaceVersion=" + this.d + " service=" + this.f + " IMediaSession=" + this.h + " extras=" + this.i + "}";
    }
}
