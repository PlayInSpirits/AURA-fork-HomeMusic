package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nl {
    public static final nl c = new nl(yw1.o(ml.d));
    public static final gy3 d;
    public static final bx1 e;
    public final SparseArray a = new SparseArray();
    public final int b;

    static {
        Object[] objArr = {2, 5, 6};
        gh0.f(3, objArr);
        d = yw1.i(3, objArr);
        ue1 ue1Var = new ue1(4);
        ue1Var.x(5, 6);
        ue1Var.x(17, 6);
        ue1Var.x(7, 6);
        ue1Var.x(30, 10);
        ue1Var.x(18, 6);
        ue1Var.x(6, 8);
        ue1Var.x(8, 8);
        ue1Var.x(14, 8);
        e = ue1Var.d(true);
    }

    public nl(gy3 gy3Var) {
        for (int i = 0; i < gy3Var.q; i++) {
            ml mlVar = (ml) gy3Var.get(i);
            this.a.put(mlVar.a, mlVar);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            iMax = Math.max(iMax, ((ml) this.a.valueAt(i2)).b);
        }
        this.b = iMax;
    }

    public static gy3 a(int[] iArr, int i) {
        uw1 uw1VarJ = yw1.j();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            uw1VarJ.c(new ml(i2, i));
        }
        return uw1VarJ.f();
    }

    public static nl b(Context context, il ilVar, AudioDeviceInfo audioDeviceInfo) {
        return c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), ilVar, audioDeviceInfo);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:84:0x023c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0244  */
    public static nl c(Context context, Intent intent, il ilVar, AudioDeviceInfo audioDeviceInfo) {
        AudioDeviceInfo audioDeviceInfo2;
        AudioManager audioManagerN = xl.n(context);
        if (audioDeviceInfo != null) {
            audioDeviceInfo2 = audioDeviceInfo;
        } else if (Build.VERSION.SDK_INT >= 33) {
            List audioDevicesForAttributes = audioManagerN.getAudioDevicesForAttributes(ilVar.c());
            if (audioDevicesForAttributes.isEmpty()) {
                audioDeviceInfo2 = null;
            } else {
                audioDeviceInfo2 = (AudioDeviceInfo) audioDevicesForAttributes.get(0);
            }
        } else {
            audioDeviceInfo2 = null;
        }
        int i = Build.VERSION.SDK_INT;
        bx1 bx1Var = e;
        if (i >= 33 && (f35.O(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            List directProfilesForAttributes = audioManagerN.getDirectProfilesForAttributes(ilVar.c());
            HashMap map = new HashMap();
            map.put(2, new HashSet(jz4.e(12)));
            for (int i2 = 0; i2 < directProfilesForAttributes.size(); i2++) {
                AudioProfile audioProfileD = db.d(directProfilesForAttributes.get(i2));
                if (audioProfileD.getEncapsulationType() != 1) {
                    int format = audioProfileD.getFormat();
                    if (f35.L(format) || bx1Var.containsKey(Integer.valueOf(format))) {
                        if (map.containsKey(Integer.valueOf(format))) {
                            Set set = (Set) map.get(Integer.valueOf(format));
                            set.getClass();
                            set.addAll(jz4.e(audioProfileD.getChannelMasks()));
                        } else {
                            map.put(Integer.valueOf(format), new HashSet(jz4.e(audioProfileD.getChannelMasks())));
                        }
                    }
                }
            }
            uw1 uw1VarJ = yw1.j();
            for (Map.Entry entry : map.entrySet()) {
                uw1VarJ.c(new ml(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
            }
            return new nl(uw1VarJ.f());
        }
        AudioDeviceInfo[] devices = audioDeviceInfo2 == null ? audioManagerN.getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfo2};
        ix1 ix1Var = new ix1(4);
        Integer[] numArr = {8, 7};
        gh0.f(2, numArr);
        ix1Var.e(2);
        System.arraycopy(numArr, 0, ix1Var.a, ix1Var.b, 2);
        ix1Var.b += 2;
        if (i >= 31) {
            Integer[] numArr2 = {26, 27};
            gh0.f(2, numArr2);
            ix1Var.e(2);
            System.arraycopy(numArr2, 0, ix1Var.a, ix1Var.b, 2);
            ix1Var.b += 2;
        }
        if (i >= 33) {
            ix1Var.c(30);
        }
        jx1 jx1VarG = ix1Var.g();
        for (AudioDeviceInfo audioDeviceInfo3 : devices) {
            if (jx1VarG.contains(Integer.valueOf(audioDeviceInfo3.getType()))) {
                return c;
            }
        }
        ix1 ix1Var2 = new ix1(4);
        ix1Var2.c(2);
        if (Build.VERSION.SDK_INT >= 29 && (f35.O(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            uw1 uw1VarJ2 = yw1.j();
            jx1 jx1VarD = bx1Var.o;
            if (jx1VarD == null) {
                jx1VarD = bx1Var.d();
                bx1Var.o = jx1VarD;
            }
            o15 it = jx1VarD.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int iIntValue = num.intValue();
                if (Build.VERSION.SDK_INT >= f35.r(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), ilVar.c())) {
                    uw1VarJ2.c(num);
                }
            }
            uw1VarJ2.c(2);
            gy3 gy3VarF = uw1VarJ2.f();
            gy3VarF.getClass();
            ix1Var2.d(gy3VarF);
            return new nl(a(jz4.N(ix1Var2.g()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if (!z) {
            String str = Build.MANUFACTURER;
            if (str.equals("Amazon") || str.equals("Xiaomi")) {
                if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                    gy3 gy3Var = d;
                    gy3Var.getClass();
                    ix1Var2.d(gy3Var);
                }
            }
        } else if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            gy3 gy3Var2 = d;
            gy3Var2.getClass();
            ix1Var2.d(gy3Var2);
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new nl(a(jz4.N(ix1Var2.g()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            List listE = jz4.e(intArrayExtra);
            listE.getClass();
            ix1Var2.d(listE);
        }
        return new nl(a(jz4.N(ix1Var2.g()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    /* JADX WARN: Code duplicated, block: B:75:0x00f8  */
    public final Pair d(tb1 tb1Var, il ilVar) {
        String str = tb1Var.n;
        str.getClass();
        int iC = lw2.c(str, tb1Var.k);
        Integer numValueOf = Integer.valueOf(iC);
        bx1 bx1Var = e;
        if (!bx1Var.containsKey(numValueOf)) {
            return null;
        }
        int i = 6;
        SparseArray sparseArray = this.a;
        if (iC == 18 && !f35.l(sparseArray, 18)) {
            iC = 6;
        } else if ((iC == 8 && !f35.l(sparseArray, 8)) || (iC == 30 && !f35.l(sparseArray, 30))) {
            iC = 7;
        }
        if (!f35.l(sparseArray, iC)) {
            return null;
        }
        ml mlVar = (ml) sparseArray.get(iC);
        mlVar.getClass();
        int iIntValue = mlVar.b;
        jx1 jx1Var = mlVar.c;
        int i2 = tb1Var.F;
        boolean zContains = false;
        if (i2 == -1 || iC == 18) {
            int i3 = tb1Var.G;
            if (i3 == -1) {
                i3 = 48000;
            }
            int i4 = mlVar.a;
            if (jx1Var == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    iIntValue = 10;
                    while (true) {
                        if (iIntValue <= 0) {
                            iIntValue = 0;
                            break;
                        }
                        int iS = f35.s(iIntValue);
                        if (iS != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i4).setSampleRate(i3).setChannelMask(iS).build(), ilVar.c())) {
                            break;
                        }
                        iIntValue--;
                    }
                } else {
                    Object obj = bx1Var.get(Integer.valueOf(i4));
                    iIntValue = ((Integer) (obj != null ? obj : 0)).intValue();
                }
            }
            i2 = iIntValue;
        } else if (!tb1Var.n.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
            if (jx1Var != null) {
                int iS2 = f35.s(i2);
                if (iS2 != 0) {
                    zContains = jx1Var.contains(Integer.valueOf(iS2));
                }
            } else if (i2 <= iIntValue) {
                zContains = true;
            }
            if (!zContains) {
                return null;
            }
        } else if (i2 > 10) {
            return null;
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 > 28) {
            i = i2;
        } else if (i2 == 7) {
            i = 8;
        } else if (i2 != 3 && i2 != 4 && i2 != 5) {
            i = i2;
        }
        if (i5 <= 26 && "fugu".equals(Build.DEVICE) && i == 1) {
            i = 2;
        }
        int iS3 = f35.s(i);
        if (iS3 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iC), Integer.valueOf(iS3));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0018  */
    public final boolean equals(Object obj) {
        boolean zContentEquals;
        if (this != obj) {
            if (obj instanceof nl) {
                nl nlVar = (nl) obj;
                SparseArray sparseArray = nlVar.a;
                String str = f35.a;
                SparseArray sparseArray2 = this.a;
                if (sparseArray2 == null) {
                    if (sparseArray == null) {
                        zContentEquals = true;
                    } else {
                        zContentEquals = false;
                    }
                } else if (sparseArray == null) {
                    zContentEquals = false;
                } else if (Build.VERSION.SDK_INT >= 31) {
                    zContentEquals = sparseArray2.contentEquals(sparseArray);
                } else {
                    int size = sparseArray2.size();
                    if (size == sparseArray.size()) {
                        int i = 0;
                        while (true) {
                            if (i < size) {
                                if (Objects.equals(sparseArray2.valueAt(i), sparseArray.get(sparseArray2.keyAt(i)))) {
                                    i++;
                                }
                            } else {
                                zContentEquals = true;
                            }
                        }
                    }
                    zContentEquals = false;
                }
                if (!zContentEquals || this.b != nlVar.b) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode;
        String str = f35.a;
        int i = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.a;
        if (i >= 31) {
            iHashCode = sparseArray.contentHashCode();
        } else {
            iHashCode = 17;
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i2)) + ((sparseArray.keyAt(i2) + (iHashCode * 31)) * 31);
            }
        }
        return (iHashCode * 31) + this.b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", audioProfiles=" + this.a + "]";
    }
}
