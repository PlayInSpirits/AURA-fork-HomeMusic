package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ib1 {
    public final Uri a;
    public final int b;
    public final int c;
    public final boolean d;
    public final String e;
    public final int f;

    public ib1(String r3, String r4) {
        this.a = new Uri.Builder().scheme("systemfont").authority(r3).build();
        this.b = 0;
        this.c = 400;
        this.d = false;
        this.e = r4;
        this.f = 0;
    }

    public ib1(Uri r1, int r2, int r3, boolean r4, String r5, int r6) {
        r1.getClass();
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
    }
}
