package defpackage;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class na1 {
    public String a;
    public String b;
    public List c;

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof na1) == true) goto L8;
        return false;
    L8:
        na1 r6 = (na1) r5;
        if (Objects.equals(this.a, r6.a) == true) goto L11;
    L15:
        return false;
    L11:
        if (Objects.equals(this.b, r6.b) == false) goto L15;
        if (Objects.equals(this.c, r6.c) == false) goto L15;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c});
    }
}
