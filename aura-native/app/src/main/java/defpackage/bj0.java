package defpackage;

import java.util.Locale;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class bj0 {
    public bj0() {
        super();
    }

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
        StringBuilder t = b11.t("DecoderCounters {\n decoderInits=", ",\n decoderReleases=", i, i2, "\n queuedInputBuffers=");
        t.append(i3);
        t.append("\n skippedInputBuffers=");
        t.append(i4);
        t.append("\n renderedOutputBuffers=");
        t.append(i5);
        t.append("\n skippedOutputBuffers=");
        t.append(i6);
        t.append("\n droppedBuffers=");
        t.append(i7);
        t.append("\n droppedInputBuffers=");
        t.append(i8);
        t.append("\n maxConsecutiveDroppedBuffers=");
        t.append(i9);
        t.append("\n droppedToKeyframeEvents=");
        t.append(i10);
        t.append("\n totalVideoFrameProcessingOffsetUs=");
        t.append(j);
        t.append("\n videoFrameProcessingOffsetCount=");
        t.append(i11);
        t.append("\n}");
        return t.toString();
    }
}
