package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class iq3 extends uj4 {
    public final /* synthetic */ int a;
    public final long b;
    public final long c;

    public iq3(int r1, long r2, long r4) {
        this.a = r1;
        switch(r1) {
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        this.b = r4;
        this.c = r2;
        return;
    L6:
        this.b = r2;
        this.c = r4;
    }

    public static long d(long r6, be3 r8) {
        long r0 = r8.A();
        if ((128 & r0) != 0) goto L5;
        return -9223372036854775807L;
    L5:
        return 8589934591L & ((((r0 & 1) << 32) | r8.C()) + r6);
    }

    @Override // defpackage.uj4
    public final String toString() {
        switch(this.a) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        StringBuilder r0 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        r0.append(this.b);
        r0.append(", playbackPositionUs= ");
        return b11.p(r0, this.c, " }");
    L6:
        StringBuilder r1 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        r1.append(this.b);
        r1.append(", programSplicePlaybackPositionUs= ");
        return b11.p(r1, this.c, " }");
    L8:
        StringBuilder r2 = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        r2.append(this.b);
        r2.append(", identifier= ");
        return b11.p(r2, this.c, " }");
    }

    public iq3(long r2, long r4, List r6) {
        this.a = 1;
        this.b = r2;
        this.c = r4;
        Collections.unmodifiableList(r6);
    }
}
