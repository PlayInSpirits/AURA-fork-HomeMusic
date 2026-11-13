package defpackage;

import android.text.TextUtils;
import androidx.preference.Preference;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class mp3 {
    public final int a;
    public final int b;
    public final String c;

    public mp3(Preference preference) {
        this.c = preference.getClass().getName();
        this.a = preference.S;
        this.b = preference.T;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mp3)) {
            return false;
        }
        mp3 mp3Var = (mp3) obj;
        return this.a == mp3Var.a && this.b == mp3Var.b && TextUtils.equals(this.c, mp3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((((527 + this.a) * 31) + this.b) * 31);
    }
}
