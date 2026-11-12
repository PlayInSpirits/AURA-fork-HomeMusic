package defpackage;

import android.net.NetworkRequest;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mc0 {
    public static final mc0 j = null;
    public final int a;
    public final o53 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final Set i;

    static {
        j = new mc0();
    }

    public mc0(mc0 r3) {
        r3.getClass();
        this.c = r3.c;
        this.d = r3.d;
        this.b = r3.b;
        this.a = r3.a;
        this.e = r3.e;
        this.f = r3.f;
        this.i = r3.i;
        this.g = r3.g;
        this.h = r3.h;
    }

    public final NetworkRequest a() {
        return (NetworkRequest) this.b.a;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L5;
        return true;
    L5:
        if (r5 != null) goto L7;
        return false;
    L7:
        if (mc0.class.equals(r5.getClass()) == false) goto L37;
        mc0 r6 = (mc0) r5;
        if (this.c == r6.c) goto L13;
        return false;
    L13:
        if (this.d == r6.d) goto L16;
        return false;
    L16:
        if (this.e == r6.e) goto L19;
        return false;
    L19:
        if (this.f == r6.f) goto L22;
        return false;
    L22:
        if (this.g == r6.g) goto L25;
        return false;
    L25:
        if (this.h == r6.h) goto L28;
        return false;
    L28:
        if (h12.c(a(), r6.a()) == true) goto L31;
        return false;
    L31:
        if (this.a == r6.a) goto L34;
        return false;
    L34:
        return h12.c(this.i, r6.i);
    L37:
        return false;
    }

    public final int hashCode() {
        int r0 = ((((((((xa3.w(this.a) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31;
        long r1 = this.g;
        int r2 = (r0 + ((int) (r1 ^ (r1 >>> 32)))) * 31;
        long r3 = this.h;
        int r4 = (r2 + ((int) (r3 ^ (r3 >>> 32)))) * 31;
        int r5 = (this.i.hashCode() + r4) * 31;
        NetworkRequest r6 = a();
        if (r6 == null) goto L5;
        int r7 = r6.hashCode();
    L7:
        return r5 + r7;
    L5:
        r7 = 0;
        goto L7
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + b11.y(this.a) + ", requiresCharging=" + this.c + ", requiresDeviceIdle=" + this.d + ", requiresBatteryNotLow=" + this.e + ", requiresStorageNotLow=" + this.f + ", contentTriggerUpdateDelayMillis=" + this.g + ", contentTriggerMaxDelayMillis=" + this.h + ", contentUriTriggers=" + this.i + ", }";
    }

    public mc0(o53 r1, int r2, boolean r3, boolean r4, boolean r5, boolean r6, long r7, long r9, Set r11) {
        if (r2 == 0) goto L6;
        this.b = r1;
        this.a = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
        this.g = r7;
        this.h = r9;
        this.i = r11;
        return;
    L6:
        throw null;
    }

    public mc0() {
        this.b = new o53(null);
        this.a = 1;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = -1;
        this.h = -1;
        this.i = z01.n;
    }
}
