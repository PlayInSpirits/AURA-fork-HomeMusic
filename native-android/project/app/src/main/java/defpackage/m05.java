package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m05 {
    public final vk0 a;
    public final gb1 b;
    public final int c;
    public final int d;
    public final Object e;

    public m05(vk0 vk0Var, gb1 gb1Var, int i, int i2, Object obj) {
        this.a = vk0Var;
        this.b = gb1Var;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m05)) {
            return false;
        }
        m05 m05Var = (m05) obj;
        return h12.c(this.a, m05Var.a) && h12.c(this.b, m05Var.b) && this.c == m05Var.c && this.d == m05Var.d && h12.c(this.e, m05Var.e);
    }

    public final int hashCode() {
        vk0 vk0Var = this.a;
        int iD = f34.d(this.d, f34.d(this.c, (((vk0Var == null ? 0 : vk0Var.hashCode()) * 31) + this.b.n) * 31, 31), 31);
        Object obj = this.e;
        return iD + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        String str;
        String str2 = "Invalid";
        int i = this.c;
        if (i == 0) {
            str = "Normal";
        } else {
            str = i == 1 ? "Italic" : "Invalid";
        }
        int i2 = this.d;
        if (i2 == 0) {
            str2 = "None";
        } else if (i2 == 1) {
            str2 = "Weight";
        } else if (i2 == 2) {
            str2 = "Style";
        } else if (i2 == 65535) {
            str2 = "All";
        }
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontStyle=");
        f34.n(sb, str, ", fontSynthesis=", str2, ", resourceLoaderCacheKey=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
