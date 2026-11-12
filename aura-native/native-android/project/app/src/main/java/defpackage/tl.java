package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tl {
    public final go4 a;
    public final Handler b;
    public q41 c;
    public il d;
    public int f;
    public wl h;
    public float g = 1.0f;
    public int e = 0;

    public tl(Context context, Looper looper, q41 q41Var) {
        this.a = au0.L(new sl(0, context));
        this.c = q41Var;
        this.b = new Handler(looper);
    }

    public final void a() {
        int i = this.e;
        if (i == 1 || i == 0 || this.h == null) {
            return;
        }
        AudioManager audioManager = (AudioManager) this.a.get();
        wl wlVar = this.h;
        if (Build.VERSION.SDK_INT < 26) {
            audioManager.abandonAudioFocus(wlVar.b);
            return;
        }
        Object obj = wlVar.f;
        obj.getClass();
        audioManager.abandonAudioFocusRequest(j3.k(obj));
    }

    public final void b(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.g == f) {
            return;
        }
        this.g = f;
        q41 q41Var = this.c;
        if (q41Var != null) {
            q41Var.u.g(34);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
    public final int c(int i, boolean z) {
        int i2;
        int iRequestAudioFocus;
        i iVar;
        int i3 = 0;
        if (i == 1 || (i2 = this.f) != 1) {
            a();
            b(0);
            return 1;
        }
        int i4 = this.e;
        if (z) {
            if (i4 != 2) {
                wl wlVar = this.h;
                if (wlVar == null) {
                    if (wlVar == null) {
                        iVar = new i();
                        iVar.c = il.i;
                        iVar.a = i2;
                    } else {
                        i iVar2 = new i();
                        iVar2.a = wlVar.a;
                        iVar2.c = wlVar.d;
                        iVar2.b = wlVar.e;
                        iVar = iVar2;
                    }
                    il ilVar = this.d;
                    boolean z2 = ilVar != null && ilVar.a == 1;
                    ilVar.getClass();
                    iVar.c = ilVar;
                    iVar.b = z2;
                    AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() { // from class: rl
                        @Override // android.media.AudioManager.OnAudioFocusChangeListener
                        public final void onAudioFocusChange(int i5) {
                            il ilVar2;
                            tl tlVar = this.a;
                            tlVar.getClass();
                            if (i5 == -3 || i5 == -2) {
                                if (i5 != -2 && ((ilVar2 = tlVar.d) == null || ilVar2.a != 1)) {
                                    tlVar.b(4);
                                    return;
                                }
                                q41 q41Var = tlVar.c;
                                if (q41Var != null) {
                                    yp4 yp4Var = q41Var.u;
                                    yp4Var.getClass();
                                    xp4 xp4VarC = yp4.c();
                                    xp4VarC.a = yp4Var.a.obtainMessage(33, 0, 0);
                                    xp4VarC.b();
                                }
                                tlVar.b(3);
                                return;
                            }
                            if (i5 == -1) {
                                q41 q41Var2 = tlVar.c;
                                if (q41Var2 != null) {
                                    yp4 yp4Var2 = q41Var2.u;
                                    yp4Var2.getClass();
                                    xp4 xp4VarC2 = yp4.c();
                                    xp4VarC2.a = yp4Var2.a.obtainMessage(33, -1, 0);
                                    xp4VarC2.b();
                                }
                                tlVar.a();
                                tlVar.b(1);
                                return;
                            }
                            if (i5 != 1) {
                                xa3.m(i5, "Unknown focus change type: ", "AudioFocusManager");
                                return;
                            }
                            tlVar.b(2);
                            q41 q41Var3 = tlVar.c;
                            if (q41Var3 != null) {
                                yp4 yp4Var3 = q41Var3.u;
                                yp4Var3.getClass();
                                xp4 xp4VarC3 = yp4.c();
                                xp4VarC3.a = yp4Var3.a.obtainMessage(33, 1, 0);
                                xp4VarC3.b();
                            }
                        }
                    };
                    Handler handler = this.b;
                    handler.getClass();
                    this.h = new wl(iVar.a, onAudioFocusChangeListener, handler, (il) iVar.c, iVar.b);
                }
                AudioManager audioManager = (AudioManager) this.a.get();
                wl wlVar2 = this.h;
                if (Build.VERSION.SDK_INT >= 26) {
                    Object obj = wlVar2.f;
                    obj.getClass();
                    iRequestAudioFocus = audioManager.requestAudioFocus(j3.k(obj));
                } else {
                    AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener2 = wlVar2.b;
                    il ilVar2 = wlVar2.d;
                    if ((ilVar2.b & 1) != 1) {
                        switch (ilVar2.c) {
                            case 2:
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                i3 = 8;
                                break;
                            case 4:
                                i3 = 4;
                                break;
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                i3 = 5;
                                break;
                            case 6:
                                i3 = 2;
                                break;
                            case 11:
                                i3 = 10;
                                break;
                            case 12:
                            default:
                                i3 = 3;
                                break;
                            case 13:
                                i3 = 1;
                                break;
                        }
                    } else {
                        i3 = 1;
                    }
                    iRequestAudioFocus = audioManager.requestAudioFocus(onAudioFocusChangeListener2, i3, wlVar2.a);
                }
                if (iRequestAudioFocus == 1) {
                    b(2);
                    return 1;
                }
                b(1);
                return -1;
            }
        } else {
            if (i4 == 1) {
                return -1;
            }
            if (i4 == 3) {
                return 0;
            }
        }
        return 1;
    }
}
