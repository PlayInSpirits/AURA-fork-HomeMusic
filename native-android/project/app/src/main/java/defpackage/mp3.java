package defpackage;

import android.text.TextUtils;
import androidx.preference.Preference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mp3 {
    public final int a;
    public final int b;
    public final String c;

    public mp3(Preference r2) {
        this.c = r2.getClass().getName();
        this.a = r2.S;
        this.b = r2.T;
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof mp3) == false) goto L17;
        mp3 r4 = (mp3) r3;
        if (this.a == r4.a) goto L8;
        return false;
    L8:
        if (this.b == r4.b) goto L10;
        return false;
    L10:
        if (TextUtils.equals(this.c, r4.c) == false) goto L16;
        return true;
    L16:
        return false;
    L17:
        return false;
    }

    public final int hashCode() {
        int r0 = (((527 + this.a) * 31) + this.b) * 31;
        return this.c.hashCode() + r0;
    }
}
