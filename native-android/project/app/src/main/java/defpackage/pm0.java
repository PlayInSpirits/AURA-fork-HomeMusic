package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.decoder.ffmpeg.b;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class pm0 {
    public final Context a;
    public final oj1 b;
    public int c;

    public pm0(Context r3) {
        this.a = r3;
        this.b = new oj1(r3, 1);
        this.c = 0;
    }

    public tj0 a(Context r1) {
        return new au(r1).b();
    }

    public final kq[] b(Handler r24, o55 r25, qm r26, rs4 r27, xv2 r28) {
        ArrayList r7 = new ArrayList();
        int r2 = this.c;
        Class<?> r9 = Integer.TYPE;
        Class<?> r11 = Long.TYPE;
        Context r13 = this.a;
        mk2 r12 = new mk2(r13);
        oj1 r14 = this.b;
        r12.c = r14;
        r12.d = 5000;
        r12.e = r24;
        r12.f = r25;
        r12.g = 50;
        rr2.w(!r12.b);
        Handler r4 = r12.e;
        if (r4 == null) goto L5;
    L6:
        if (r4 != null) goto L8;
    L10:
        boolean r5 = false;
    L11:
        rr2.w(r5);
        r12.b = true;
        r7.add(new ok2(r12));
        if (r2 != 0) goto L14;
        int r21 = 2;
    L43:
        tj0 r6 = a(r13);
        int r8 = this.c;
        Context r0 = this.a;
        r7.add(new bk2(r0, r14, r24, r26, r6));
        if (r8 == 0) goto L104;
        int r1 = r7.size();
        if (r8 != r21) goto L127;
        r1 = r1 - 1;
    L127:
        int r10 = r1 + 1;
        r7.add(r1, (kq) Class.forName("androidx.media3.decoder.midi.MidiRenderer").getConstructor(new Class[]{Context.class, Handler.class, qm.class, sm.class}).newInstance(new Object[]{r0, r24, r26, r6}));     // Catch: Exception -> L53 ClassNotFoundException -> L55
        l93.K("DefaultRenderersFactory", "Loaded MidiRenderer.");     // Catch: Exception -> L53 ClassNotFoundException -> L55
    L125:
        int r3 = r10 + 1;
        r7.add(r10, (kq) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(new Class[]{Handler.class, qm.class, sm.class}).newInstance(new Object[]{r24, r26, r6}));     // Catch: Exception -> L63 ClassNotFoundException -> L65
        l93.K("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");     // Catch: Exception -> L63 ClassNotFoundException -> L65
    L129:
        int r15 = r3 + 1;
        r7.add(r3, (kq) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(new Class[]{Handler.class, qm.class, sm.class}).newInstance(new Object[]{r24, r26, r6}));     // Catch: Exception -> L73 ClassNotFoundException -> L75
        l93.K("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");     // Catch: Exception -> L73 ClassNotFoundException -> L75
    L121:
        int r16 = r15 + 1;
        r7.add(r15, (kq) b.class.getConstructor(new Class[]{Handler.class, qm.class, sm.class}).newInstance(new Object[]{r24, r26, r6}));     // Catch: Exception -> L83 ClassNotFoundException -> L85
        l93.K("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");     // Catch: Exception -> L83 ClassNotFoundException -> L85
    L119:
        int r17 = r16 + 1;
        r7.add(r16, (kq) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(new Class[]{Context.class, Handler.class, qm.class, sm.class}).newInstance(new Object[]{r0, r24, r26, r6}));     // Catch: Exception -> L93 ClassNotFoundException -> L95
        l93.K("DefaultRenderersFactory", "Loaded LibiamfAudioRenderer.");     // Catch: Exception -> L93 ClassNotFoundException -> L95
    L143:
        r7.add(r17, (kq) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(new Class[]{Handler.class, qm.class, sm.class}).newInstance(new Object[]{r24, r26, r6}));     // Catch: Exception -> L101 ClassNotFoundException -> L112
        l93.K("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");     // Catch: Exception -> L101 ClassNotFoundException -> L112
    L101:
        e = move-exception;
        mj0.j("Error instantiating MPEG-H extension", e);
        return null;
    L95:
        r16 = r17;
    L93:
        e = move-exception;
        mj0.j("Error instantiating IAMF extension", e);
        return null;
    L98:
        r17 = r16;
        goto L143
    L85:
        r15 = r16;
    L83:
        e = move-exception;
        mj0.j("Error instantiating FFmpeg extension", e);
        return null;
    L88:
        r16 = r15;
        goto L119
    L75:
        r3 = r15;
    L73:
        e = move-exception;
        mj0.j("Error instantiating FLAC extension", e);
        return null;
    L78:
        r15 = r3;
    L65:
        r10 = r3;
    L63:
        e = move-exception;
        mj0.j("Error instantiating Opus extension", e);
        return null;
    L68:
        r3 = r10;
        goto L129
    L55:
        r1 = r10;
    L53:
        e = move-exception;
        mj0.j("Error instantiating MIDI extension", e);
        return null;
    L58:
        r10 = r1;
    L104:
        r7.add(new ts4(r27, r24.getLooper()));
        Looper r18 = r24.getLooper();
        r7.add(new yv2(r28, r18));
        r7.add(new yv2(r28, r18));
        r7.add(new vy());
        r7.add(new dw1(new vj(r13, 1)));
        return (kq[]) r7.toArray(new kq[0]);
    L14:
        int r20 = r7.size();
        if (r2 != 2) goto L17;
        r20 = r20 - 1;
    L17:
        int r19 = r20;
        r21 = 2;
        int r22 = r19 + 1;
        r7.add(r19, (kq) Class.forName("androidx.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(new Class[]{r11, Handler.class, o55.class, r9}).newInstance(new Object[]{5000L, r24, r25, 50}));     // Catch: Exception -> L22 ClassNotFoundException -> L24
        l93.K("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");     // Catch: Exception -> L22 ClassNotFoundException -> L24
    L117:
        int r23 = r22 + 1;
        r7.add(r22, (kq) Class.forName("androidx.media3.decoder.av1.Libdav1dVideoRenderer").getConstructor(new Class[]{r11, Handler.class, o55.class, r9}).newInstance(new Object[]{5000L, r24, r25, 50}));     // Catch: Exception -> L32 ClassNotFoundException -> L34
        l93.K("DefaultRenderersFactory", "Loaded Libdav1dVideoRenderer.");     // Catch: Exception -> L32 ClassNotFoundException -> L34
    L145:
        r7.add(r23, (kq) x41.class.getConstructor(new Class[]{r11, Handler.class, o55.class, r9}).newInstance(new Object[]{5000L, r24, r25, 50}));     // Catch: Exception -> L40 ClassNotFoundException -> L106
        l93.K("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");     // Catch: Exception -> L40 ClassNotFoundException -> L106
    L40:
        e = move-exception;
        mj0.j("Error instantiating FFmpeg extension", e);
        return null;
    L34:
        r22 = r23;
    L32:
        e = move-exception;
        mj0.j("Error instantiating AV1 extension", e);
        return null;
    L37:
        r23 = r22;
    L24:
        r19 = r22;
    L22:
        e = move-exception;
        mj0.j("Error instantiating VP9 extension", e);
        return null;
    L27:
        r22 = r19;
        goto L117
    L8:
        if (r12.f == null) goto L10;
    L9:
        r5 = true;
        goto L11
    L5:
        if (r12.f == null) goto L9;
        goto L6
    }
}
