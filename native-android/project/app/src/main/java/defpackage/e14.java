package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e14 {
    public final ColorStateList a;
    public final Configuration b;
    public final int c;

    public e14(ColorStateList r1, Configuration r2, Resources.Theme r3) {
        this.a = r1;
        this.b = r2;
        if (r3 != null) goto L5;
        int r4 = 0;
    L6:
        this.c = r4;
        return;
    L5:
        r4 = r3.hashCode();
        goto L6
    }
}
