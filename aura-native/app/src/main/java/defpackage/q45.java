package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class q45 implements Comparable {
    public final String n;

    public q45() {
        if ("1.15.0".matches("\\d+(\\.\\d+)*")) {
            this.n = "1.15.0";
        } else {
            kf2.n("Invalid version format");
            throw null;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        q45 q45Var = (q45) obj;
        if (q45Var == null) {
            return 1;
        }
        String[] split = this.n.split("\\.");
        String[] split2 = q45Var.n.split("\\.");
        int max = Math.max(split.length, split2.length);
        int i = 0;
        while (i < max) {
            int parseInt = i < split.length ? Integer.parseInt(split[i]) : 0;
            int parseInt2 = i < split2.length ? Integer.parseInt(split2[i]) : 0;
            if (parseInt < parseInt2) {
                return -1;
            }
            if (parseInt > parseInt2) {
                return 1;
            }
            i++;
        }
        return 0;
    }

    public final String toString() {
        return this.n;
    }
}
