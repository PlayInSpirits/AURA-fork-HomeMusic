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
    public int c = 0;

    public pm0(Context context) {
        this.a = context;
        this.b = new oj1(context, 1);
    }

    public tj0 a(Context context) {
        return new au(context).b();
    }

    public final kq[] b(Handler handler, o55 o55Var, qm qmVar, rs4 rs4Var, xv2 xv2Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        ArrayList arrayList = new ArrayList();
        int i9 = this.c;
        Class<?> cls = Integer.TYPE;
        Class<?> cls2 = Long.TYPE;
        Context context = this.a;
        mk2 mk2Var = new mk2(context);
        oj1 oj1Var = this.b;
        mk2Var.c = oj1Var;
        mk2Var.d = 5000L;
        mk2Var.e = handler;
        mk2Var.f = o55Var;
        mk2Var.g = 50;
        rr2.w(!mk2Var.b);
        Handler handler2 = mk2Var.e;
        rr2.w((handler2 == null && mk2Var.f == null) || !(handler2 == null || mk2Var.f == null));
        mk2Var.b = true;
        arrayList.add(new ok2(mk2Var));
        if (i9 == 0) {
            i = 2;
        } else {
            int size = arrayList.size();
            if (i9 == 2) {
                size--;
            }
            int i10 = size;
            i = 2;
            try {
                try {
                    i2 = i10 + 1;
                    try {
                        arrayList.add(i10, (kq) Class.forName("androidx.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(cls2, Handler.class, o55.class, cls).newInstance(5000L, handler, o55Var, 50));
                        l93.K("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
                    } catch (ClassNotFoundException unused) {
                        i10 = i2;
                        i2 = i10;
                    }
                } catch (Exception e) {
                    mj0.j("Error instantiating VP9 extension", e);
                    return null;
                }
            } catch (ClassNotFoundException unused2) {
            }
            try {
                try {
                    i3 = i2 + 1;
                    try {
                        arrayList.add(i2, (kq) Class.forName("androidx.media3.decoder.av1.Libdav1dVideoRenderer").getConstructor(cls2, Handler.class, o55.class, cls).newInstance(5000L, handler, o55Var, 50));
                        l93.K("DefaultRenderersFactory", "Loaded Libdav1dVideoRenderer.");
                    } catch (ClassNotFoundException unused3) {
                        i2 = i3;
                        i3 = i2;
                    }
                } catch (Exception e2) {
                    mj0.j("Error instantiating AV1 extension", e2);
                    return null;
                }
            } catch (ClassNotFoundException unused4) {
            }
            try {
                arrayList.add(i3, (kq) x41.class.getConstructor(cls2, Handler.class, o55.class, cls).newInstance(5000L, handler, o55Var, 50));
                l93.K("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
            } catch (ClassNotFoundException unused5) {
            } catch (Exception e3) {
                mj0.j("Error instantiating FFmpeg extension", e3);
                return null;
            }
        }
        tj0 tj0VarA = a(context);
        int i11 = this.c;
        Context context2 = this.a;
        arrayList.add(new bk2(context2, oj1Var, handler, qmVar, tj0VarA));
        if (i11 != 0) {
            int size2 = arrayList.size();
            if (i11 == i) {
                size2--;
            }
            try {
                try {
                    i4 = size2 + 1;
                    try {
                        arrayList.add(size2, (kq) Class.forName("androidx.media3.decoder.midi.MidiRenderer").getConstructor(Context.class, Handler.class, qm.class, sm.class).newInstance(context2, handler, qmVar, tj0VarA));
                        l93.K("DefaultRenderersFactory", "Loaded MidiRenderer.");
                    } catch (ClassNotFoundException unused6) {
                        size2 = i4;
                        i4 = size2;
                    }
                } catch (ClassNotFoundException unused7) {
                }
                try {
                    try {
                        i5 = i4 + 1;
                        try {
                            arrayList.add(i4, (kq) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, qm.class, sm.class).newInstance(handler, qmVar, tj0VarA));
                            l93.K("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                        } catch (ClassNotFoundException unused8) {
                            i4 = i5;
                            i5 = i4;
                        }
                    } catch (Exception e4) {
                        mj0.j("Error instantiating Opus extension", e4);
                        return null;
                    }
                } catch (ClassNotFoundException unused9) {
                }
                try {
                    try {
                        i6 = i5 + 1;
                        try {
                            arrayList.add(i5, (kq) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, qm.class, sm.class).newInstance(handler, qmVar, tj0VarA));
                            l93.K("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                        } catch (ClassNotFoundException unused10) {
                            i5 = i6;
                            i6 = i5;
                        }
                    } catch (Exception e5) {
                        mj0.j("Error instantiating FLAC extension", e5);
                        return null;
                    }
                } catch (ClassNotFoundException unused11) {
                }
                try {
                    try {
                        i7 = i6 + 1;
                        try {
                            arrayList.add(i6, (kq) b.class.getConstructor(Handler.class, qm.class, sm.class).newInstance(handler, qmVar, tj0VarA));
                            l93.K("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                        } catch (ClassNotFoundException unused12) {
                            i6 = i7;
                            i7 = i6;
                        }
                    } catch (ClassNotFoundException unused13) {
                    }
                    try {
                        try {
                            i8 = i7 + 1;
                            try {
                                arrayList.add(i7, (kq) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, qm.class, sm.class).newInstance(context2, handler, qmVar, tj0VarA));
                                l93.K("DefaultRenderersFactory", "Loaded LibiamfAudioRenderer.");
                            } catch (ClassNotFoundException unused14) {
                                i7 = i8;
                                i8 = i7;
                            }
                        } catch (Exception e6) {
                            mj0.j("Error instantiating IAMF extension", e6);
                            return null;
                        }
                    } catch (ClassNotFoundException unused15) {
                    }
                    try {
                        arrayList.add(i8, (kq) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, qm.class, sm.class).newInstance(handler, qmVar, tj0VarA));
                        l93.K("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                    } catch (ClassNotFoundException unused16) {
                    } catch (Exception e7) {
                        mj0.j("Error instantiating MPEG-H extension", e7);
                        return null;
                    }
                } catch (Exception e8) {
                    mj0.j("Error instantiating FFmpeg extension", e8);
                    return null;
                }
            } catch (Exception e9) {
                mj0.j("Error instantiating MIDI extension", e9);
                return null;
            }
        }
        arrayList.add(new ts4(rs4Var, handler.getLooper()));
        Looper looper = handler.getLooper();
        arrayList.add(new yv2(xv2Var, looper));
        arrayList.add(new yv2(xv2Var, looper));
        arrayList.add(new vy());
        arrayList.add(new dw1(new vj(context, 1)));
        return (kq[]) arrayList.toArray(new kq[0]);
    }
}
