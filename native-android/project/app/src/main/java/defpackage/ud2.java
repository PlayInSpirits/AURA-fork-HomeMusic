package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ud2 {
    public final Locale a;

    public ud2(Locale r1) {
        this.a = r1;
    }

    public final boolean equals(Object r3) {
        if (r3 != null) goto L6;
        return false;
    L6:
        if ((r3 instanceof ud2) == true) goto L8;
        return false;
    L8:
        if (this != r3) goto L12;
        return true;
    L12:
        return h12.c(this.a.toLanguageTag(), ((ud2) r3).a.toLanguageTag());
    }

    public final int hashCode() {
        return this.a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.a.toLanguageTag();
    }
}
