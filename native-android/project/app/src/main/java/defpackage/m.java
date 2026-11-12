package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements ke0 {
    public final float a;

    public m(float r1) {
        this.a = r1;
    }

    @Override // defpackage.ke0
    public final float a(RectF r1) {
        return this.a;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof m) == true) goto L9;
        return false;
    L9:
        if (this.a != ((m) r4).a) goto L11;
        return true;
    L11:
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
