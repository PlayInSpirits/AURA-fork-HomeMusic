package defpackage;

import android.os.LocaleList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xd2 {
    public final LocaleList a;

    public xd2(LocaleList r1) {
        this.a = r1;
    }

    public final boolean equals(Object r1) {
        LocaleList r2 = ((xd2) r1).a;
        return this.a.equals(r2);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
