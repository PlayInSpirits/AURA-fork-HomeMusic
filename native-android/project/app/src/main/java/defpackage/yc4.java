package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yc4 {
    public static final Map d = null;
    public final String a;
    public final String b;
    public final long c;

    static {
        d = lg2.X(new kd3[]{new kd3("audio/mpeg", "mp3"), new kd3("audio/mp3", "mp3"), new kd3("audio/mp4", "m4a"), new kd3("audio/x-m4a", "m4a"), new kd3("audio/m4a", "m4a"), new kd3("audio/aac", "aac"), new kd3("audio/flac", "flac"), new kd3("audio/x-flac", "flac"), new kd3("audio/ogg", "ogg"), new kd3("audio/opus", "opus"), new kd3("audio/wav", "wav"), new kd3("audio/x-wav", "wav"), new kd3("audio/wave", "wav")});
    }

    public yc4(String r1, long r2, String r4) {
        this.a = r1;
        this.b = r4;
        this.c = r2;
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if ((r3 instanceof yc4) == false) goto L19;
        yc4 r4 = (yc4) r3;
        if (this.a.equals(r4.a) == true) goto L11;
        return false;
    L11:
        if (this.b.equals(r4.b) == true) goto L14;
        return false;
    L14:
        if (this.c == r4.c) goto L17;
        return false;
    L17:
        return true;
    L19:
        return false;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        int r1 = f34.e(this.b, r0, 31);
        return Long.hashCode(this.c) + r1;
    }

    public final String toString() {
        return b11.p(b11.u("SharedFile(name=", this.a, ", mime=", this.b, ", size="), this.c, ")");
    }
}
