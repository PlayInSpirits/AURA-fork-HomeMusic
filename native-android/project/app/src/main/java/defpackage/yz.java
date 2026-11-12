package defpackage;

import com.eddyizm.tempus.homemusic.HubException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yz {
    public final xz a;
    public final vz b;
    public final HubException c;

    public /* synthetic */ yz(xz xzVar, vz vzVar, int i) {
        this(xzVar, (i & 2) != 0 ? null : vzVar, (HubException) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz)) {
            return false;
        }
        yz yzVar = (yz) obj;
        return this.a == yzVar.a && h12.c(this.b, yzVar.b) && h12.c(this.c, yzVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        vz vzVar = this.b;
        int iHashCode2 = (iHashCode + (vzVar == null ? 0 : vzVar.hashCode())) * 31;
        HubException hubException = this.c;
        return iHashCode2 + (hubException != null ? hubException.hashCode() : 0);
    }

    public final String toString() {
        return "Result(outcome=" + this.a + ", command=" + this.b + ", error=" + this.c + ")";
    }

    public yz(xz xzVar, vz vzVar, HubException hubException) {
        this.a = xzVar;
        this.b = vzVar;
        this.c = hubException;
    }
}
