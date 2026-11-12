package defpackage;

import android.net.NetworkRequest;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mc0 {
    public static final mc0 j = new mc0();
    public final int a;
    public final o53 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final Set i;

    public mc0(mc0 mc0Var) {
        mc0Var.getClass();
        this.c = mc0Var.c;
        this.d = mc0Var.d;
        this.b = mc0Var.b;
        this.a = mc0Var.a;
        this.e = mc0Var.e;
        this.f = mc0Var.f;
        this.i = mc0Var.i;
        this.g = mc0Var.g;
        this.h = mc0Var.h;
    }

    public final NetworkRequest a() {
        return (NetworkRequest) this.b.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !mc0.class.equals(obj.getClass())) {
            return false;
        }
        mc0 mc0Var = (mc0) obj;
        if (this.c == mc0Var.c && this.d == mc0Var.d && this.e == mc0Var.e && this.f == mc0Var.f && this.g == mc0Var.g && this.h == mc0Var.h && h12.c(a(), mc0Var.a()) && this.a == mc0Var.a) {
            return h12.c(this.i, mc0Var.i);
        }
        return false;
    }

    public final int hashCode() {
        int iW = ((((((((xa3.w(this.a) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31;
        long j2 = this.g;
        int i = (iW + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.h;
        int iHashCode = (this.i.hashCode() + ((i + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31;
        NetworkRequest networkRequestA = a();
        return iHashCode + (networkRequestA != null ? networkRequestA.hashCode() : 0);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + b11.y(this.a) + ", requiresCharging=" + this.c + ", requiresDeviceIdle=" + this.d + ", requiresBatteryNotLow=" + this.e + ", requiresStorageNotLow=" + this.f + ", contentTriggerUpdateDelayMillis=" + this.g + ", contentTriggerMaxDelayMillis=" + this.h + ", contentUriTriggers=" + this.i + ", }";
    }

    public mc0(o53 o53Var, int i, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, Set set) {
        if (i != 0) {
            this.b = o53Var;
            this.a = i;
            this.c = z;
            this.d = z2;
            this.e = z3;
            this.f = z4;
            this.g = j2;
            this.h = j3;
            this.i = set;
            return;
        }
        throw null;
    }

    public mc0() {
        this.b = new o53(null);
        this.a = 1;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = -1L;
        this.h = -1L;
        this.i = z01.n;
    }
}
