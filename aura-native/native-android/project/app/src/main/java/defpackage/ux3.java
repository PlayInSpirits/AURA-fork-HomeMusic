package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ux3 implements Serializable {
    public final Pattern n;

    public ux3(String str) {
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        this.n = patternCompile;
    }

    public final boolean a(String str) {
        str.getClass();
        return this.n.matcher(str).matches();
    }

    public final String toString() {
        String string = this.n.toString();
        string.getClass();
        return string;
    }
}
