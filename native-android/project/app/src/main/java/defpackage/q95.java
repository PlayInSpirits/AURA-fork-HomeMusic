package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class q95 {
    public String a;
    public String b;
    public Set c;
    public String d;
    public String e;
    public int f;
    public boolean g;
    public int h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public float o;
    public int p;
    public boolean q;

    public static int a(int r1, int r2, String r3, String r4) {
        if (r3.isEmpty() == false) goto L5;
    L12:
        return r1;
    L5:
        if (r1 == (-1)) goto L12;
        if (r3.equals(r4) == true) goto L10;
        return -1;
    L10:
        return r1 + r2;
    }
}
