package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ux3 implements Serializable {
    public final Pattern n;

    public ux3(String str) {
        Pattern compile = Pattern.compile(str);
        compile.getClass();
        this.n = compile;
    }

    public final boolean a(String str) {
        str.getClass();
        return this.n.matcher(str).matches();
    }

    public final String toString() {
        String pattern = this.n.toString();
        pattern.getClass();
        return pattern;
    }
}
