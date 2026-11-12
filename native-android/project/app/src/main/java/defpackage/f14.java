package defpackage;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f14 {
    public final Resources a;
    public final Resources.Theme b;

    public f14(Resources r1, Resources.Theme r2) {
        this.a = r1;
        this.b = r2;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L15:
        return false;
    L8:
        if (f14.class != r5.getClass()) goto L15;
        f14 r6 = (f14) r5;
        if (this.a.equals(r6.a) == false) goto L15;
        if (Objects.equals(this.b, r6.b) == false) goto L15;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b});
    }
}
