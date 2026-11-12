package defpackage;

import android.media.AudioFormat;
import android.media.Spatializer;
import android.os.Build;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class en0 implements ro3 {
    public final /* synthetic */ pn0 n;
    public final /* synthetic */ jn0 o;

    public /* synthetic */ en0(pn0 pn0Var, jn0 jn0Var) {
        this.n = pn0Var;
        this.o = jn0Var;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x006c A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x009c  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:56:0x00af  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:61:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e7  */
    @Override // defpackage.ro3
    public final boolean apply(Object obj) {
        Boolean bool;
        ll llVar;
        Spatializer spatializer;
        Spatializer spatializer2;
        ll llVar2;
        il ilVar;
        int i;
        int iS;
        AudioFormat.Builder channelMask;
        int i2;
        boolean zCanBeSpatialized;
        ll llVar3;
        tb1 tb1Var = (tb1) obj;
        pn0 pn0Var = this.n;
        pn0Var.getClass();
        if (this.o.A0 && ((bool = pn0Var.j) == null || !bool.booleanValue())) {
            int i3 = tb1Var.F;
            String str = tb1Var.n;
            if (i3 != -1 && i3 > 2) {
                if (str == null) {
                    if (Build.VERSION.SDK_INT >= 32 && (llVar = pn0Var.h) != null && llVar.o) {
                        spatializer = (Spatializer) llVar.p;
                        spatializer.getClass();
                        if (m3.d(spatializer).isAvailable()) {
                            spatializer2 = (Spatializer) pn0Var.h.p;
                            spatializer2.getClass();
                            if (m3.d(spatializer2).isEnabled()) {
                                llVar2 = pn0Var.h;
                                ilVar = pn0Var.i;
                                llVar2.getClass();
                                i = tb1Var.F;
                                if (Objects.equals(str, "audio/eac3-joc")) {
                                    if (i == 16) {
                                        i = 12;
                                    }
                                } else if (Objects.equals(str, "audio/iamf")) {
                                    if (i == -1) {
                                        i = 6;
                                    }
                                } else if (Objects.equals(str, "audio/ac4") && (i == 18 || i == 21)) {
                                    i = 24;
                                }
                                iS = f35.s(i);
                                if (iS == 0) {
                                    zCanBeSpatialized = false;
                                } else {
                                    channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iS);
                                    i2 = tb1Var.G;
                                    if (i2 != -1) {
                                        channelMask.setSampleRate(i2);
                                    }
                                    Spatializer spatializer3 = (Spatializer) llVar2.p;
                                    spatializer3.getClass();
                                    zCanBeSpatialized = m3.d(spatializer3).canBeSpatialized(ilVar.c(), channelMask.build());
                                }
                                if (zCanBeSpatialized) {
                                }
                            }
                        }
                    }
                    return false;
                }
                switch (str) {
                    case "audio/eac3-joc":
                    case "audio/ac3":
                    case "audio/ac4":
                    case "audio/eac3":
                        if (Build.VERSION.SDK_INT >= 32 && (llVar3 = pn0Var.h) != null && llVar3.o) {
                        }
                    default:
                        if (Build.VERSION.SDK_INT >= 32) {
                            spatializer = (Spatializer) llVar.p;
                            spatializer.getClass();
                            if (m3.d(spatializer).isAvailable()) {
                                spatializer2 = (Spatializer) pn0Var.h.p;
                                spatializer2.getClass();
                                if (m3.d(spatializer2).isEnabled()) {
                                    llVar2 = pn0Var.h;
                                    ilVar = pn0Var.i;
                                    llVar2.getClass();
                                    i = tb1Var.F;
                                    if (Objects.equals(str, "audio/eac3-joc")) {
                                        if (i == 16) {
                                            i = 12;
                                        }
                                    } else if (Objects.equals(str, "audio/iamf")) {
                                        if (i == -1) {
                                            i = 6;
                                        }
                                    } else if (Objects.equals(str, "audio/ac4")) {
                                        i = 24;
                                    }
                                    iS = f35.s(i);
                                    if (iS == 0) {
                                        zCanBeSpatialized = false;
                                    } else {
                                        channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iS);
                                        i2 = tb1Var.G;
                                        if (i2 != -1) {
                                            channelMask.setSampleRate(i2);
                                        }
                                        Spatializer spatializer4 = (Spatializer) llVar2.p;
                                        spatializer4.getClass();
                                        zCanBeSpatialized = m3.d(spatializer4).canBeSpatialized(ilVar.c(), channelMask.build());
                                    }
                                    if (zCanBeSpatialized) {
                                    }
                                }
                            }
                        }
                        return false;
                }
            }
        }
        return true;
    }
}
