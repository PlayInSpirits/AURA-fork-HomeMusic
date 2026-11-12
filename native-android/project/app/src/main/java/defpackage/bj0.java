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
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        int i6 = this.f;
        int i7 = this.g;
        int i8 = this.h;
        int i9 = this.i;
        int i10 = this.j;
        long j = this.k;
        int i11 = this.l;
        String str = f35.a;
        Locale locale = Locale.US;
        StringBuilder sbT = b11.t("DecoderCounters {\n decoderInits=", ",\n decoderReleases=", i, i2, "\n queuedInputBuffers=");
        sbT.append(i3);
        sbT.append("\n skippedInputBuffers=");
        sbT.append(i4);
        sbT.append("\n renderedOutputBuffers=");
        sbT.append(i5);
        sbT.append("\n skippedOutputBuffers=");
        sbT.append(i6);
        sbT.append("\n droppedBuffers=");
        sbT.append(i7);
        sbT.append("\n droppedInputBuffers=");
        sbT.append(i8);
        sbT.append("\n maxConsecutiveDroppedBuffers=");
        sbT.append(i9);
        sbT.append("\n droppedToKeyframeEvents=");
        sbT.append(i10);
        sbT.append("\n totalVideoFrameProcessingOffsetUs=");
        sbT.append(j);
        sbT.append("\n videoFrameProcessingOffsetCount=");
        sbT.append(i11);
        sbT.append("\n}");
        return sbT.toString();
    }
}
