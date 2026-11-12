package defpackage;

import android.media.VolumeProvider;
import android.os.Build;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class is2 {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public VolumeProvider e;
    public final /* synthetic */ Handler f;
    public final /* synthetic */ al3 g;

    public is2(int r1, int r2, int r3, String r4, Handler r5, al3 r6) {
        this.f = r5;
        this.g = r6;
        this.a = r1;
        this.b = r2;
        this.d = r3;
        this.c = r4;
    }

    public final VolumeProvider a() {
        if (this.e == null) goto L5;
        is2 r3 = this;
    L10:
        return r3.e;
    L5:
        if (Build.VERSION.SDK_INT < 30) goto L7;
        int r6 = this.d;
        String r7 = this.c;
        r3 = this;
        r3.e = new q85(r3, this.a, this.b, r6, r7);
        goto L10
    L7:
        r3 = this;
        int r0 = r3.b;
        int r1 = r3.d;
        r3.e = new x52(r3, r3.a, r0, r1);
        goto L10
    }
}
