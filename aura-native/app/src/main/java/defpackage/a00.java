package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class a00 {
    public final String a;
    public final boolean b;
    public final l61 c;

    public a00(String str, boolean z, boolean z2, String str2, String str3, boolean z3) {
        this.a = str;
        this.b = z;
        HashMap hashMap = n61.a;
        synchronized (n61.class) {
            n61.b.putIfAbsent(n61.e(1, str), Boolean.valueOf(z));
        }
        this.c = n61.h(1, str, z2, str2, !z3);
    }
}
