package defpackage;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class il {
    public static final il i = new il(0, 0, 1, 1, 0, false, true);
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public AudioAttributes h;

    static {
        String str = f35.a;
        j = Integer.toString(0, 36);
        k = Integer.toString(1, 36);
        l = Integer.toString(2, 36);
        m = Integer.toString(3, 36);
        n = Integer.toString(4, 36);
        o = Integer.toString(5, 36);
        p = Integer.toString(6, 36);
    }

    public il(int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
        this.f = z;
        this.g = z2;
    }

    public static il a(Bundle bundle) {
        String str = j;
        int i2 = bundle.containsKey(str) ? bundle.getInt(str) : 0;
        String str2 = k;
        int i3 = bundle.containsKey(str2) ? bundle.getInt(str2) : 0;
        String str3 = l;
        int i4 = bundle.containsKey(str3) ? bundle.getInt(str3) : 1;
        String str4 = m;
        int i5 = bundle.containsKey(str4) ? bundle.getInt(str4) : 1;
        String str5 = n;
        int i6 = bundle.containsKey(str5) ? bundle.getInt(str5) : 0;
        String str6 = o;
        boolean z = bundle.containsKey(str6) ? bundle.getBoolean(str6) : false;
        String str7 = p;
        return new il(i2, i3, i4, i5, i6, z, bundle.containsKey(str7) ? bundle.getBoolean(str7) : true);
    }

    public static il b(AudioAttributes audioAttributes) {
        int allowedCapturePolicy;
        boolean zAreHapticChannelsMuted;
        int i2;
        boolean zIsContentSpatialized;
        int contentType = audioAttributes.getContentType();
        int flags = audioAttributes.getFlags();
        int usage = audioAttributes.getUsage();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            allowedCapturePolicy = audioAttributes.getAllowedCapturePolicy();
            zAreHapticChannelsMuted = audioAttributes.areHapticChannelsMuted();
        } else {
            allowedCapturePolicy = 1;
            zAreHapticChannelsMuted = true;
        }
        if (i3 >= 32) {
            int spatializationBehavior = audioAttributes.getSpatializationBehavior();
            zIsContentSpatialized = audioAttributes.isContentSpatialized();
            i2 = spatializationBehavior;
        } else {
            i2 = 0;
            zIsContentSpatialized = false;
        }
        return new il(contentType, flags, usage, allowedCapturePolicy, i2, zIsContentSpatialized, zAreHapticChannelsMuted);
    }

    public final AudioAttributes c() {
        if (this.h == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.a).setFlags(this.b).setUsage(this.c);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29) {
                usage.setAllowedCapturePolicy(this.d);
                usage.setHapticChannelsMuted(this.g);
            }
            if (i2 >= 32) {
                usage.setSpatializationBehavior(this.e);
                usage.setIsContentSpatialized(this.f);
            }
            this.h = usage.build();
        }
        return this.h;
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        int i2 = this.a;
        if (i2 != 0) {
            bundle.putInt(j, i2);
        }
        int i3 = this.b;
        if (i3 != 0) {
            bundle.putInt(k, i3);
        }
        int i4 = this.c;
        if (i4 != 1) {
            bundle.putInt(l, i4);
        }
        int i5 = this.d;
        if (i5 != 1) {
            bundle.putInt(m, i5);
        }
        int i6 = this.e;
        if (i6 != 0) {
            bundle.putInt(n, i6);
        }
        boolean z = this.f;
        if (z) {
            bundle.putBoolean(o, z);
        }
        boolean z2 = this.g;
        if (!z2) {
            bundle.putBoolean(p, z2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && il.class == obj.getClass()) {
            il ilVar = (il) obj;
            if (this.a == ilVar.a && this.b == ilVar.b && this.c == ilVar.c && this.d == ilVar.d && this.e == ilVar.e && this.f == ilVar.f && this.g == ilVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0);
    }
}
