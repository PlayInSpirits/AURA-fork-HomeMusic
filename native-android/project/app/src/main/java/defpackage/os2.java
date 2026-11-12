package defpackage;

import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class os2 {
    public final String a;
    public final int b;
    public final int c;

    public os2(String r1, int r2, int r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    public final boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if ((r7 instanceof os2) == true) goto L8;
        return false;
    L8:
        os2 r8 = (os2) r7;
        int r1 = r8.c;
        String r3 = r8.a;
        int r9 = r8.b;
        int r4 = this.c;
        String r5 = this.a;
        int r6 = this.b;
        if (r6 < 0) goto L19;
        if (r9 < 0) goto L19;
        if (TextUtils.equals(r5, r3) == false) goto L17;
        if (r6 != r9) goto L17;
        if (r4 != r1) goto L17;
        return true;
    L17:
        return false;
    L19:
        if (TextUtils.equals(r5, r3) == false) goto L22;
        if (r4 != r1) goto L22;
        return true;
    L22:
        return false;
    }

    public final int hashCode() {
        Integer r0 = Integer.valueOf(this.c);
        return Objects.hash(new Object[]{this.a, r0});
    }
}
