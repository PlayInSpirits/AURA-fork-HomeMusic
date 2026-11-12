package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yc4 {
    public static final Map d = lg2.X(new kd3("audio/mpeg", "mp3"), new kd3("audio/mp3", "mp3"), new kd3("audio/mp4", "m4a"), new kd3("audio/x-m4a", "m4a"), new kd3("audio/m4a", "m4a"), new kd3("audio/aac", "aac"), new kd3("audio/flac", "flac"), new kd3("audio/x-flac", "flac"), new kd3("audio/ogg", "ogg"), new kd3("audio/opus", "opus"), new kd3("audio/wav", "wav"), new kd3("audio/x-wav", "wav"), new kd3("audio/wave", "wav"));
    public final String a;
    public final String b;
    public final long c;

    public yc4(String str, long j, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yc4)) {
            return false;
        }
        yc4 yc4Var = (yc4) obj;
        return this.a.equals(yc4Var.a) && this.b.equals(yc4Var.b) && this.c == yc4Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + f34.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return b11.p(b11.u("SharedFile(name=", this.a, ", mime=", this.b, ", size="), this.c, ")");
    }
}
