package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class iq3 extends uj4 {
    public final /* synthetic */ int a;
    public final long b;
    public final long c;

    public iq3(int i, long j, long j2) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = j;
                this.c = j2;
                break;
            default:
                this.b = j2;
                this.c = j;
                break;
        }
    }

    public static long d(long j, be3 be3Var) {
        long A = be3Var.A();
        if ((128 & A) != 0) {
            return 8589934591L & ((((A & 1) << 32) | be3Var.C()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.uj4
    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb.append(this.b);
                sb.append(", identifier= ");
                return b11.p(sb, this.c, " }");
            case 1:
                StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
                sb2.append(this.b);
                sb2.append(", programSplicePlaybackPositionUs= ");
                return b11.p(sb2, this.c, " }");
            default:
                StringBuilder sb3 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb3.append(this.b);
                sb3.append(", playbackPositionUs= ");
                return b11.p(sb3, this.c, " }");
        }
    }

    public iq3(long j, long j2, List list) {
        this.a = 1;
        this.b = j;
        this.c = j2;
        Collections.unmodifiableList(list);
    }
}
