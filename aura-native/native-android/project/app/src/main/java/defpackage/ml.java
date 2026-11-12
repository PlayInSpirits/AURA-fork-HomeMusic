package defpackage;

import android.os.Build;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ml {
    public static final ml d;
    public final int a;
    public final int b;
    public final jx1 c;

    static {
        ml mlVar;
        if (Build.VERSION.SDK_INT >= 33) {
            ix1 ix1Var = new ix1(4);
            for (int i = 1; i <= 10; i++) {
                ix1Var.c(Integer.valueOf(f35.s(i)));
            }
            mlVar = new ml(2, ix1Var.g());
        } else {
            mlVar = new ml(2, 10);
        }
        d = mlVar;
    }

    public ml(int i, Set set) {
        this.a = i;
        jx1 jx1VarK = jx1.k(set);
        this.c = jx1VarK;
        o15 it = jx1VarK.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.b = iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml)) {
            return false;
        }
        ml mlVar = (ml) obj;
        return this.a == mlVar.a && this.b == mlVar.b && Objects.equals(this.c, mlVar.c);
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        jx1 jx1Var = this.c;
        return i + (jx1Var == null ? 0 : jx1Var.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.a + ", maxChannelCount=" + this.b + ", channelMasks=" + this.c + "]";
    }

    public ml(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = null;
    }
}
