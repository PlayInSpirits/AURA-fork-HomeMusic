package defpackage;

import android.app.ActionBar;
import android.app.Activity;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.media3.common.ParserException;
import app.homemusic.R;
import com.eddyizm.tempus.database.AppDatabase;
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.eddyizm.tempus.interfaces.RadioCallback;
import com.eddyizm.tempus.interfaces.SystemCallback;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hg3 implements zw, j4, fc2, PointerInputEventHandler, r83, th2, ci, f51, r34, p5, fi1, RadioCallback, yh0, SystemCallback, jg2 {
    public static final Object p = new Object();
    public static volatile hg3 q;
    public static hg3 r;
    public final /* synthetic */ int n;
    public Object o;

    public hg3(int i) {
        this.n = i;
        switch (i) {
            case 14:
                this.o = wr1.m(Looper.getMainLooper());
                break;
            case 15:
                this.o = AppDatabase.y().w();
                break;
            case WaveRetry.MAX_FAILURES /* 16 */:
                this.o = new ArrayList();
                break;
            case 25:
                this.o = new f13(new v72[16]);
                break;
            default:
                this.o = new LinkedHashMap();
                break;
        }
    }

    public static hg3 C(Context context) {
        if (r == null) {
            hg3 hg3Var = new hg3(11, false);
            hg3Var.o = context.getSharedPreferences(context.getPackageName(), 0);
            r = hg3Var;
        }
        return r;
    }

    public static hg3 E(Context context) {
        hg3 hg3Var;
        synchronized (p) {
            try {
                if (q == null) {
                    Context applicationContext = context.getApplicationContext();
                    hg3 hg3Var2 = new hg3(1, false);
                    wo0 wo0Var = new wo0();
                    wo0Var.n = applicationContext;
                    wo0Var.o = applicationContext.getContentResolver();
                    hg3Var2.o = wo0Var;
                    q = hg3Var2;
                }
                hg3Var = q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hg3Var;
    }

    public void A(t20 t20Var) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.o;
        long[] jArr = t20Var.e;
        if (jArr.length <= 0 || linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            return;
        }
        linkedHashMap.put(Long.valueOf(t20Var.e[0]), t20Var);
    }

    /* JADX WARN: Code duplicated, block: B:130:0x0297  */
    public void B(int i, int i2, l51 l51Var) throws ParserException {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j;
        int i9;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        int i13;
        ni2 ni2Var = (ni2) this.o;
        k35 k35Var = ni2Var.b;
        SparseArray sparseArray = ni2Var.c;
        be3 be3Var = ni2Var.k;
        be3 be3Var2 = ni2Var.i;
        int i14 = 2;
        int i15 = 0;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (ni2Var.O != 2) {
                    return;
                }
                mi2 mi2Var = (mi2) sparseArray.get(ni2Var.U);
                int i16 = ni2Var.X;
                be3 be3Var3 = ni2Var.p;
                if (i16 != 4 || !"V_VP9".equals(mi2Var.c)) {
                    l51Var.l(i2);
                    return;
                } else {
                    be3Var3.K(i2);
                    l51Var.readFully(be3Var3.a, 0, i2);
                    return;
                }
            }
            if (i == 16877) {
                ni2Var.h(i);
                mi2 mi2Var2 = ni2Var.y;
                int i17 = mi2Var2.h;
                if (i17 != 1685485123 && i17 != 1685480259) {
                    l51Var.l(i2);
                    return;
                }
                byte[] bArr = new byte[i2];
                mi2Var2.P = bArr;
                l51Var.readFully(bArr, 0, i2);
                return;
            }
            if (i == 16981) {
                ni2Var.h(i);
                byte[] bArr2 = new byte[i2];
                ni2Var.y.j = bArr2;
                l51Var.readFully(bArr2, 0, i2);
                return;
            }
            if (i == 18402) {
                byte[] bArr3 = new byte[i2];
                l51Var.readFully(bArr3, 0, i2);
                ni2Var.h(i);
                ni2Var.y.k = new vv4(1, 0, 0, bArr3);
                return;
            }
            if (i == 21419) {
                Arrays.fill(be3Var.a, (byte) 0);
                l51Var.readFully(be3Var.a, 4 - i2, i2);
                be3Var.N(0);
                ni2Var.A = (int) be3Var.C();
                return;
            }
            if (i == 25506) {
                ni2Var.h(i);
                byte[] bArr4 = new byte[i2];
                ni2Var.y.l = bArr4;
                l51Var.readFully(bArr4, 0, i2);
                return;
            }
            if (i != 30322) {
                throw ParserException.a(null, "Unexpected id: " + i);
            }
            ni2Var.h(i);
            byte[] bArr5 = new byte[i2];
            ni2Var.y.x = bArr5;
            l51Var.readFully(bArr5, 0, i2);
            return;
        }
        int i18 = 8;
        if (ni2Var.O == 0) {
            ni2Var.U = (int) k35Var.b(l51Var, false, true, 8);
            ni2Var.V = k35Var.b;
            ni2Var.Q = -9223372036854775807L;
            ni2Var.O = 1;
            be3Var2.K(0);
        }
        mi2 mi2Var3 = (mi2) sparseArray.get(ni2Var.U);
        if (mi2Var3 == null) {
            l51Var.l(i2 - ni2Var.V);
            ni2Var.O = 0;
            return;
        }
        mi2Var3.a0.getClass();
        if (ni2Var.O == 1) {
            ni2Var.l(l51Var, 3);
            int i19 = (be3Var2.a[2] & 6) >> 1;
            if (i19 == 0) {
                ni2Var.S = 1;
                int[] iArr2 = ni2Var.T;
                if (iArr2 == null) {
                    iArr2 = new int[1];
                } else if (iArr2.length < 1) {
                    iArr2 = new int[Math.max(iArr2.length * 2, 1)];
                }
                ni2Var.T = iArr2;
                iArr2[0] = (i2 - ni2Var.V) - 3;
            } else {
                ni2Var.l(l51Var, 4);
                int i20 = (be3Var2.a[3] & 255) + 1;
                ni2Var.S = i20;
                int[] iArr3 = ni2Var.T;
                if (iArr3 == null) {
                    iArr3 = new int[i20];
                    i3 = 4;
                } else {
                    i3 = 4;
                    if (iArr3.length < i20) {
                        iArr3 = new int[Math.max(iArr3.length * 2, i20)];
                    }
                }
                ni2Var.T = iArr3;
                if (i19 == 2) {
                    int i21 = (i2 - ni2Var.V) - 4;
                    int i22 = ni2Var.S;
                    Arrays.fill(iArr3, 0, i22, i21 / i22);
                } else {
                    if (i19 == 1) {
                        int i23 = 0;
                        int i24 = 0;
                        int i25 = i3;
                        while (true) {
                            i10 = ni2Var.S - 1;
                            iArr = ni2Var.T;
                            if (i23 >= i10) {
                                break;
                            }
                            iArr[i23] = 0;
                            while (true) {
                                i11 = i25 + 1;
                                ni2Var.l(l51Var, i11);
                                int i26 = be3Var2.a[i25] & 255;
                                int[] iArr4 = ni2Var.T;
                                i12 = iArr4[i23] + i26;
                                iArr4[i23] = i12;
                                if (i26 != 255) {
                                    break;
                                } else {
                                    i25 = i11;
                                }
                            }
                            i24 += i12;
                            i23++;
                            i25 = i11;
                        }
                        iArr[i10] = ((i2 - ni2Var.V) - i25) - i24;
                    } else {
                        if (i19 != 3) {
                            throw ParserException.a(null, "Unexpected lacing value: " + i19);
                        }
                        int i27 = 0;
                        int i28 = 0;
                        int i29 = i3;
                        while (true) {
                            int i30 = ni2Var.S - 1;
                            int[] iArr5 = ni2Var.T;
                            if (i27 >= i30) {
                                i4 = i14;
                                i5 = i15;
                                iArr5[i30] = ((i2 - ni2Var.V) - i29) - i28;
                                break;
                            }
                            iArr5[i27] = i15;
                            int i31 = i29 + 1;
                            ni2Var.l(l51Var, i31);
                            if (be3Var2.a[i29] == 0) {
                                throw ParserException.a(null, "No valid varint length mask found");
                            }
                            int i32 = i15;
                            while (true) {
                                if (i32 >= i18) {
                                    i6 = i18;
                                    i7 = i14;
                                    i8 = i15;
                                    j = 0;
                                    i9 = i31;
                                    break;
                                }
                                i6 = i18;
                                int i33 = 1 << (7 - i32);
                                i8 = i15;
                                if ((be3Var2.a[i29] & i33) != 0) {
                                    i9 = i31 + i32;
                                    ni2Var.l(l51Var, i9);
                                    i7 = i14;
                                    j = (~i33) & be3Var2.a[i29] & 255;
                                    while (i31 < i9) {
                                        j = (j << i6) | ((long) (be3Var2.a[i31] & 255));
                                        i31++;
                                    }
                                    if (i27 <= 0) {
                                        break;
                                    }
                                    j -= (1 << ((i32 * 7) + 6)) - 1;
                                    break;
                                }
                                i32++;
                                i15 = i8;
                                i18 = i6;
                            }
                            if (j < -2147483648L || j > 2147483647L) {
                                throw ParserException.a(null, "EBML lacing sample size out of range.");
                            }
                            int i34 = (int) j;
                            int[] iArr6 = ni2Var.T;
                            if (i27 != 0) {
                                i34 += iArr6[i27 - 1];
                            }
                            iArr6[i27] = i34;
                            i28 += i34;
                            i27++;
                            i29 = i9;
                            i15 = i8;
                            i18 = i6;
                            i14 = i7;
                        }
                    }
                    byte[] bArr6 = be3Var2.a;
                    ni2Var.P = ni2Var.n((bArr6[1] & 255) | (bArr6[i5] << 8)) + ni2Var.M;
                    if (mi2Var3.e != 1 || (i == 163 && (be3Var2.a[i4] & 128) == 128)) {
                        i13 = 1;
                    } else {
                        i13 = i5;
                    }
                    ni2Var.W = i13;
                    ni2Var.O = i4;
                    ni2Var.R = i5;
                }
            }
            i4 = 2;
            i5 = 0;
            byte[] bArr7 = be3Var2.a;
            ni2Var.P = ni2Var.n((bArr7[1] & 255) | (bArr7[i5] << 8)) + ni2Var.M;
            if (mi2Var3.e != 1) {
                i13 = 1;
            } else {
                i13 = 1;
            }
            ni2Var.W = i13;
            ni2Var.O = i4;
            ni2Var.R = i5;
        }
        if (i == 163) {
            while (true) {
                int i35 = ni2Var.R;
                if (i35 >= ni2Var.S) {
                    ni2Var.O = 0;
                    return;
                }
                ni2Var.i(mi2Var3, ((long) ((ni2Var.R * mi2Var3.f) / 1000)) + ni2Var.P, ni2Var.W, ni2Var.o(l51Var, mi2Var3, ni2Var.T[i35], false), 0);
                ni2Var.R++;
            }
        } else {
            while (true) {
                int i36 = ni2Var.R;
                if (i36 >= ni2Var.S) {
                    return;
                }
                int[] iArr7 = ni2Var.T;
                iArr7[i36] = ni2Var.o(l51Var, mi2Var3, iArr7[i36], true);
                ni2Var.R++;
            }
        }
    }

    public Point D(String str, Point point) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.o;
        int i = point.x;
        int i2 = point.y;
        return new Point(sharedPreferences.getInt(str + "_SELECTOR_X", i), sharedPreferences.getInt(str + "_SELECTOR_Y", i2));
    }

    public void F(int i, long j) throws ParserException {
        ni2 ni2Var = (ni2) this.o;
        if (i == 240) {
            if (ni2Var.z) {
                return;
            }
            ni2Var.g(i);
            if (ni2Var.H == -1) {
                ni2Var.H = j;
                return;
            }
            return;
        }
        if (i == 241) {
            if (ni2Var.z) {
                return;
            }
            ni2Var.g(i);
            if (ni2Var.G == -1) {
                ni2Var.G = j;
                return;
            }
            return;
        }
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw ParserException.a(null, "ContentEncodingOrder " + j + " not supported");
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw ParserException.a(null, "ContentEncodingScope " + j + " not supported");
        }
        switch (i) {
            case 131:
                int i2 = (int) j;
                if (i2 == 1) {
                    ni2Var.h(i);
                    ni2Var.y.e = 2;
                    return;
                }
                if (i2 == 2) {
                    ni2Var.h(i);
                    ni2Var.y.e = 1;
                    return;
                } else if (i2 == 17) {
                    ni2Var.h(i);
                    ni2Var.y.e = 3;
                    return;
                } else if (i2 != 33) {
                    ni2Var.h(i);
                    ni2Var.y.e = -1;
                    return;
                } else {
                    ni2Var.h(i);
                    ni2Var.y.e = 5;
                    return;
                }
            case 136:
                ni2Var.h(i);
                ni2Var.y.Y = j == 1;
                return;
            case 155:
                ni2Var.Q = ni2Var.n(j);
                return;
            case 159:
                ni2Var.h(i);
                ni2Var.y.Q = (int) j;
                return;
            case 176:
                ni2Var.h(i);
                ni2Var.y.n = (int) j;
                return;
            case 179:
                if (ni2Var.z) {
                    return;
                }
                ni2Var.g(i);
                ni2Var.E = ni2Var.n(j);
                return;
            case 186:
                ni2Var.h(i);
                ni2Var.y.o = (int) j;
                return;
            case 215:
                ni2Var.h(i);
                ni2Var.y.d = (int) j;
                return;
            case 231:
                ni2Var.M = ni2Var.n(j);
                return;
            case 238:
                ni2Var.X = (int) j;
                return;
            case 247:
                if (ni2Var.z) {
                    return;
                }
                ni2Var.g(i);
                ni2Var.F = (int) j;
                return;
            case 251:
                ni2Var.Y = true;
                return;
            case 16871:
                ni2Var.h(i);
                ni2Var.y.h = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw ParserException.a(null, "ContentCompAlgo " + j + " not supported");
            case 17029:
                if (j < 1 || j > 2) {
                    throw ParserException.a(null, "DocTypeReadVersion " + j + " not supported");
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw ParserException.a(null, "EBMLReadVersion " + j + " not supported");
            case 18401:
                if (j == 5) {
                    return;
                }
                throw ParserException.a(null, "ContentEncAlgo " + j + " not supported");
            case 18408:
                if (j == 1) {
                    return;
                }
                throw ParserException.a(null, "AESSettingsCipherMode " + j + " not supported");
            case 21420:
                ni2Var.B = j + ni2Var.s;
                return;
            case 21432:
                int i3 = (int) j;
                ni2Var.h(i);
                if (i3 == 0) {
                    ni2Var.y.y = 0;
                    return;
                }
                if (i3 == 1) {
                    ni2Var.y.y = 2;
                    return;
                } else if (i3 == 3) {
                    ni2Var.y.y = 1;
                    return;
                } else {
                    if (i3 != 15) {
                        return;
                    }
                    ni2Var.y.y = 3;
                    return;
                }
            case 21680:
                ni2Var.h(i);
                ni2Var.y.q = (int) j;
                return;
            case 21682:
                ni2Var.h(i);
                ni2Var.y.s = (int) j;
                return;
            case 21690:
                ni2Var.h(i);
                ni2Var.y.r = (int) j;
                return;
            case 21930:
                ni2Var.h(i);
                ni2Var.y.X = j == 1;
                return;
            case 21938:
                ni2Var.h(i);
                mi2 mi2Var = ni2Var.y;
                mi2Var.z = true;
                mi2Var.p = (int) j;
                return;
            case 21998:
                ni2Var.h(i);
                ni2Var.y.g = (int) j;
                return;
            case 22186:
                ni2Var.h(i);
                ni2Var.y.T = j;
                return;
            case 22203:
                ni2Var.h(i);
                ni2Var.y.U = j;
                return;
            case 25188:
                ni2Var.h(i);
                ni2Var.y.R = (int) j;
                return;
            case 30114:
                ni2Var.Z = j;
                return;
            case 30321:
                ni2Var.h(i);
                int i4 = (int) j;
                if (i4 == 0) {
                    ni2Var.y.t = 0;
                    return;
                }
                if (i4 == 1) {
                    ni2Var.y.t = 1;
                    return;
                } else if (i4 == 2) {
                    ni2Var.y.t = 2;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    ni2Var.y.t = 3;
                    return;
                }
            case 2352003:
                ni2Var.h(i);
                ni2Var.y.f = (int) j;
                return;
            case 2807729:
                ni2Var.t = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        ni2Var.h(i);
                        int i5 = (int) j;
                        if (i5 == 1) {
                            ni2Var.y.C = 2;
                            return;
                        } else {
                            if (i5 != 2) {
                                return;
                            }
                            ni2Var.y.C = 1;
                            return;
                        }
                    case 21946:
                        ni2Var.h(i);
                        int iG = c50.g((int) j);
                        if (iG != -1) {
                            ni2Var.y.B = iG;
                            return;
                        }
                        return;
                    case 21947:
                        ni2Var.h(i);
                        ni2Var.y.z = true;
                        int iF = c50.f((int) j);
                        if (iF != -1) {
                            ni2Var.y.A = iF;
                            return;
                        }
                        return;
                    case 21948:
                        ni2Var.h(i);
                        ni2Var.y.D = (int) j;
                        return;
                    case 21949:
                        ni2Var.h(i);
                        ni2Var.y.E = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    public boolean G(ms2 ms2Var) {
        wo0 wo0Var = (wo0) this.o;
        os2 os2Var = ms2Var.a;
        Context context = (Context) wo0Var.n;
        int i = os2Var.b;
        String str = os2Var.a;
        int i2 = os2Var.c;
        if (context.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", i, i2) == 0) {
            return true;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(str, 0) != null) {
                if (wo0Var.B(os2Var, "android.permission.STATUS_BAR_SERVICE") || wo0Var.B(os2Var, "android.permission.MEDIA_CONTENT_CONTROL") || i2 == 1000 || i2 == Process.myUid()) {
                    return true;
                }
                String string = Settings.Secure.getString((ContentResolver) wo0Var.o, "enabled_notification_listeners");
                if (string != null) {
                    for (String str2 : string.split(":")) {
                        ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str2);
                        if (componentNameUnflattenFromString != null && componentNameUnflattenFromString.getPackageName().equals(str)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            l93.A("MediaSessionManager", "Package " + str + " doesn't exist");
            return false;
        }
    }

    public void H(String str, List list, Bundle bundle, Bundle bundle2) throws RemoteException {
        Bundle bundle3 = new Bundle();
        bundle3.putString("data_media_item_id", str);
        bundle3.putBundle("data_options", bundle);
        bundle3.putBundle("data_notify_children_changed_options", bundle2);
        if (list != null) {
            bundle3.putParcelableArrayList("data_media_item_list", uc5.k(list, MediaBrowserCompat$MediaItem.CREATOR));
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 3;
        messageObtain.arg1 = 2;
        messageObtain.setData(bundle3);
        ((Messenger) this.o).send(messageObtain);
    }

    public void I(int i, long j, long j2) throws ParserException {
        ni2 ni2Var = (ni2) this.o;
        ni2Var.j0.getClass();
        if (i == 160) {
            ni2Var.Y = false;
            ni2Var.Z = 0L;
            return;
        }
        if (i == 174) {
            mi2 mi2Var = new mi2();
            mi2Var.n = -1;
            mi2Var.o = -1;
            mi2Var.p = -1;
            mi2Var.q = -1;
            mi2Var.r = -1;
            mi2Var.s = 0;
            mi2Var.t = -1;
            mi2Var.u = 0.0f;
            mi2Var.v = 0.0f;
            mi2Var.w = 0.0f;
            mi2Var.x = null;
            mi2Var.y = -1;
            mi2Var.z = false;
            mi2Var.A = -1;
            mi2Var.B = -1;
            mi2Var.C = -1;
            mi2Var.D = 1000;
            mi2Var.E = 200;
            mi2Var.F = -1.0f;
            mi2Var.G = -1.0f;
            mi2Var.H = -1.0f;
            mi2Var.I = -1.0f;
            mi2Var.J = -1.0f;
            mi2Var.K = -1.0f;
            mi2Var.L = -1.0f;
            mi2Var.M = -1.0f;
            mi2Var.N = -1.0f;
            mi2Var.O = -1.0f;
            mi2Var.Q = 1;
            mi2Var.R = -1;
            mi2Var.S = 8000;
            mi2Var.T = 0L;
            mi2Var.U = 0L;
            mi2Var.W = false;
            mi2Var.Y = true;
            mi2Var.Z = "eng";
            ni2Var.y = mi2Var;
            mi2Var.a = ni2Var.w;
            return;
        }
        if (i == 183) {
            if (ni2Var.z) {
                return;
            }
            ni2Var.g(i);
            ni2Var.F = -1;
            ni2Var.G = -1L;
            ni2Var.H = -1L;
            return;
        }
        if (i == 187) {
            if (ni2Var.z) {
                return;
            }
            ni2Var.g(i);
            ni2Var.E = -9223372036854775807L;
            return;
        }
        if (i == 19899) {
            ni2Var.A = -1;
            ni2Var.B = -1L;
            return;
        }
        if (i == 20533) {
            ni2Var.h(i);
            ni2Var.y.i = true;
            return;
        }
        if (i == 21968) {
            ni2Var.h(i);
            ni2Var.y.z = true;
            return;
        }
        if (i == 408125543) {
            long j3 = ni2Var.s;
            if (j3 != -1 && j3 != j) {
                throw ParserException.a(null, "Multiple Segment elements not supported");
            }
            ni2Var.s = j;
            ni2Var.r = j2;
            return;
        }
        if (i == 475249515) {
            if (ni2Var.z) {
                return;
            }
            ni2Var.D = true;
        } else if (i == 524531317 && !ni2Var.z) {
            if (ni2Var.d && ni2Var.K != -1) {
                ni2Var.J = true;
            } else {
                ni2Var.j0.w(new bo(ni2Var.v));
                ni2Var.z = true;
            }
        }
    }

    public void J(int i, String str) throws ParserException {
        ni2 ni2Var = (ni2) this.o;
        if (i == 134) {
            ni2Var.h(i);
            ni2Var.y.c = str;
            return;
        }
        if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                ni2Var.w = str.equals("webm");
                return;
            }
            throw ParserException.a(null, "DocType " + str + " not supported");
        }
        if (i == 21358) {
            ni2Var.h(i);
            ni2Var.y.b = str;
        } else {
            if (i != 2274716) {
                return;
            }
            ni2Var.h(i);
            ni2Var.y.Z = str;
        }
    }

    @Override // defpackage.fc2
    public void a(int i, int i2) {
        ((ni4) this.o).n.c(i, i2);
    }

    @Override // defpackage.f51
    public int b() {
        return ((ExtendedFloatingActionButton) this.o).getMeasuredHeight();
    }

    @Override // defpackage.fi1
    public g04 build() {
        g04 g04Var = (g04) this.o;
        return g04Var != null ? g04Var : new g04();
    }

    @Override // defpackage.yh0
    public void c() {
        ((aw3) this.o).f();
    }

    @Override // defpackage.f51
    public int d() {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.o;
        return (extendedFloatingActionButton.getMeasuredWidth() - (extendedFloatingActionButton.getCollapsedPadding() * 2)) + extendedFloatingActionButton.M + extendedFloatingActionButton.N;
    }

    @Override // defpackage.j4
    public boolean e() {
        ActionBar actionBar = ((Activity) this.o).getActionBar();
        return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
    }

    @Override // defpackage.r34
    public boolean f(gr1 gr1Var) {
        gr1Var.getClass();
        return ((gv3) this.o).f(gr1Var);
    }

    @Override // defpackage.jg2
    public Object g(Object obj, Object obj2) {
        return ((eg1) this.o).mo77apply(obj2);
    }

    @Override // defpackage.j4
    public Context h() {
        Activity activity = (Activity) this.o;
        ActionBar actionBar = activity.getActionBar();
        return actionBar != null ? actionBar.getThemedContext() : activity;
    }

    @Override // defpackage.p5
    public void i(Object obj) {
        o5 o5Var = (o5) obj;
        ld1 ld1Var = (ld1) this.o;
        gd1 gd1Var = (gd1) ld1Var.E.pollLast();
        if (gd1Var == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = gd1Var.n;
        int i = gd1Var.o;
        kc1 kc1VarU = ld1Var.c.u(str);
        if (kc1VarU != null) {
            kc1VarU.D(i, o5Var.n, o5Var.o);
            return;
        }
        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public Object invoke(sn3 sn3Var, vd0 vd0Var) {
        Object objG = xl.g(sn3Var, new sb((tb) this.o, null, 0), vd0Var);
        return objG == xe0.n ? objG : j15.a;
    }

    @Override // defpackage.r34
    public boolean isCanceled() {
        return ((gv3) this.o).x.m();
    }

    @Override // defpackage.f51
    public int j() {
        return ((ExtendedFloatingActionButton) this.o).N;
    }

    @Override // defpackage.fc2
    public void k(int i, int i2) {
        ((ni4) this.o).n.e(i, i2);
    }

    @Override // defpackage.yh0
    public Object l() {
        aw3 aw3Var = (aw3) this.o;
        aw3Var.reset();
        return aw3Var;
    }

    @Override // defpackage.r34
    public boolean m(cv3 cv3Var) {
        return ((gv3) this.o).m(cv3Var);
    }

    @Override // defpackage.r34
    public f6 n() {
        return ((gv3) this.o).v;
    }

    @Override // defpackage.f51
    public ViewGroup.LayoutParams o() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    @Override // com.eddyizm.tempus.interfaces.RadioCallback
    public void onDismiss() {
        hp1 hp1Var = (hp1) this.o;
        hp1Var.n0.c(hp1Var.v());
    }

    @Override // com.eddyizm.tempus.interfaces.SystemCallback
    public void onError(Exception exc) {
        exc.getClass();
        oe2.h0((oe2) this.o, cx.h() ? R.string.la_server_toast_connection_failure : R.string.la_server_toast_connection_error, exc.getMessage(), 1);
    }

    @Override // com.eddyizm.tempus.interfaces.SystemCallback
    public void onNetworkFailure(Exception exc) {
        exc.getClass();
        oe2.h0((oe2) this.o, R.string.la_server_toast_connection_error, exc.getMessage(), 1);
    }

    @Override // com.eddyizm.tempus.interfaces.SystemCallback
    public void onSuccess(String str, String str2, String str3) {
        oe2.h0((oe2) this.o, R.string.la_server_toast_connection_success, null, 0);
    }

    @Override // defpackage.zw
    public int p() {
        switch (this.n) {
            case 2:
                return ((w0) this.o).q();
            default:
                return ((qe1) this.o).n();
        }
    }

    @Override // defpackage.j4
    public void q(Drawable drawable, int i) {
        ActionBar actionBar = ((Activity) this.o).getActionBar();
        if (actionBar != null) {
            actionBar.setHomeAsUpIndicator(drawable);
            actionBar.setHomeActionContentDescription(i);
        }
    }

    @Override // defpackage.fc2
    public void r(int i, int i2) {
        ((ni4) this.o).n.f(i, i2);
    }

    @Override // defpackage.f51
    public int s() {
        return ((ExtendedFloatingActionButton) this.o).M;
    }

    @Override // defpackage.j4
    public Drawable t() {
        TypedArray typedArrayObtainStyledAttributes = h().obtainStyledAttributes(null, new int[]{android.R.attr.homeAsUpIndicator}, android.R.attr.actionBarStyle, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        return drawable;
    }

    @Override // defpackage.j4
    public void u(int i) {
        ActionBar actionBar = ((Activity) this.o).getActionBar();
        if (actionBar != null) {
            actionBar.setHomeActionContentDescription(i);
        }
    }

    @Override // defpackage.r34
    public ii v() {
        return ((gv3) this.o).B;
    }

    @Override // defpackage.r34
    public q34 w() {
        return ((gv3) this.o).a();
    }

    @Override // defpackage.r83
    public pb5 x(View view, pb5 pb5Var) {
        switch (this.n) {
            case 7:
                fr frVar = (fr) this.o;
                frVar.n = pb5Var.a();
                frVar.o = pb5Var.b();
                frVar.p = pb5Var.c();
                frVar.g();
                break;
            default:
                mb5 mb5Var = pb5Var.a;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.o;
                if (!Objects.equals(coordinatorLayout.z, pb5Var)) {
                    coordinatorLayout.z = pb5Var;
                    boolean z = pb5Var.d() > 0;
                    coordinatorLayout.A = z;
                    coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
                    if (!mb5Var.r()) {
                        int childCount = coordinatorLayout.getChildCount();
                        for (int i = 0; i < childCount; i++) {
                            View childAt = coordinatorLayout.getChildAt(i);
                            WeakHashMap weakHashMap = j65.a;
                            if (!childAt.getFitsSystemWindows() || ((ge0) childAt.getLayoutParams()).a == null || !mb5Var.r()) {
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                }
                break;
        }
        return pb5Var;
    }

    @Override // defpackage.fc2
    public void y(int i, int i2, Object obj) {
        ((ni4) this.o).n.d(i, i2, obj);
    }

    @Override // defpackage.ci
    public Object z(q64 q64Var, Float f, Float f2, if1 if1Var, vg4 vg4Var) {
        Object objC = su3.c(q64Var, f.floatValue(), j51.a(0.0f, f2.floatValue(), 28), (ui0) this.o, if1Var, vg4Var);
        return objC == xe0.n ? objC : (ud) objC;
    }

    public /* synthetic */ hg3(int i, boolean z) {
        this.n = i;
    }

    public hg3(InputStream inputStream, qj0 qj0Var) {
        this.n = 24;
        aw3 aw3Var = new aw3(inputStream, qj0Var);
        this.o = aw3Var;
        aw3Var.mark(5242880);
    }

    public /* synthetic */ hg3(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }
}
