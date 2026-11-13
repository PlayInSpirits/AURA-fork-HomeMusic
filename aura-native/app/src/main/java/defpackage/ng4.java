package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ng4 implements pv2 {
    public final ArrayList a;

    public ng4(ArrayList arrayList) {
        this.a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((mg4) arrayList.get(0)).b;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                if (((mg4) arrayList.get(i)).a < j) {
                    z = true;
                    break;
                } else {
                    j = ((mg4) arrayList.get(i)).b;
                    i++;
                }
            }
        }
        rr2.l(!z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ng4.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((ng4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.a;
    }
}
