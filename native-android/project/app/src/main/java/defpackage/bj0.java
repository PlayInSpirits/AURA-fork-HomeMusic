package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bj0 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public int l;

    public final String toString() {
        int r0 = this.a;
        int r1 = this.b;
        int r2 = this.c;
        int r3 = this.d;
        int r4 = this.e;
        int r5 = this.f;
        int r6 = this.g;
        int r7 = this.h;
        int r8 = this.i;
        int r9 = this.j;
        long r10 = this.k;
        int r15 = this.l;
        String r12 = f35.a;
        Locale r13 = Locale.US;
        StringBuilder r11 = b11.t("DecoderCounters {\n decoderInits=", ",\n decoderReleases=", r0, r1, "\n queuedInputBuffers=");
        r11.append(r2);
        r11.append("\n skippedInputBuffers=");
        r11.append(r3);
        r11.append("\n renderedOutputBuffers=");
        r11.append(r4);
        r11.append("\n skippedOutputBuffers=");
        r11.append(r5);
        r11.append("\n droppedBuffers=");
        r11.append(r6);
        r11.append("\n droppedInputBuffers=");
        r11.append(r7);
        r11.append("\n maxConsecutiveDroppedBuffers=");
        r11.append(r8);
        r11.append("\n droppedToKeyframeEvents=");
        r11.append(r9);
        r11.append("\n totalVideoFrameProcessingOffsetUs=");
        r11.append(r10);
        r11.append("\n videoFrameProcessingOffsetCount=");
        r11.append(r15);
        r11.append("\n}");
        return r11.toString();
    }
}
