package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ux3 implements Serializable {
    public final Pattern n;

    public ux3(String r1) {
        Pattern r2 = Pattern.compile(r1);
        r2.getClass();
        this.n = r2;
    }

    public final boolean a(String r1) {
        r1.getClass();
        return this.n.matcher(r1).matches();
    }

    public final String toString() {
        String r0 = this.n.toString();
        r0.getClass();
        return r0;
    }
}
