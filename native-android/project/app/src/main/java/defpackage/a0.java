package defpackage;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Trace
 *  android.widget.Toast
 */
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import android.widget.Toast;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.ui.DefaultTimeBar;
import androidx.recyclerview.widget.RecyclerView;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.ui.fragment.AlbumPageFragment;
import com.eddyizm.tempus.ui.fragment.ArtistPageFragment;
import com.eddyizm.tempus.ui.fragment.DirectoryFragment;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.AlbumBottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.skydoves.colorpickerview.ColorPickerView;
import java.util.ArrayList;
import java.util.List;

public final class a0
implements Runnable {
    public final int n;
    public final Object o;

    public /* synthetic */ a0(int n16, Object object) {
        this.n = n16;
        this.o = object;
    }

    public /* synthetic */ a0(q41 q412, int n16) {
        this.n = 28;
        this.o = q412;
    }

    public /* synthetic */ a0(q41 q412, sk3 sk32) {
        this.n = 29;
        this.o = sk32;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final void run() {
        block95: {
            block96: {
                block94: {
                    block97: {
                        var3_1 = this.n;
                        var2_2 = 1;
                        var1_3 = 0;
                        var9_4 = this.o;
                        switch (var3_1) {
                            default: {
                                var9_4 = (sk3)var9_4;
                                // MONITORENTER : var9_4
                                // MONITOREXIT : var9_4
                                var9_4.a.c(var9_4.c, var9_4.d);
                                {
                                    catch (Throwable var10_16) {
                                        var9_4.a(true);
                                        throw var10_16;
                                    }
                                }
                                try {
                                    var9_4.a(true);
                                    return;
                                }
                                catch (ExoPlaybackException var9_5) {
                                    l93.G("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", var9_5);
                                    er1.m(var9_5);
                                }
                                return;
                            }
                            case 28: {
                                var9_4 = ((q41)var9_4).K;
                                var9_4.b0(var9_4.W(), 1034, new oi0(15));
                                return;
                            }
                            case 27: {
                                var10_17 = (i41)var9_4;
                                var9_4 = var10_17.D;
                                var10_17 = var10_17.f;
                                var11_26 = f35.a;
                                var1_3 = xl.n((Context)var10_17).generateAudioSessionId();
                                if (var1_3 == -1) {
                                    var1_3 = 0;
                                }
                                var9_4.f = var10_17 = Integer.valueOf(var1_3);
                                var10_17 = new wo((c6)var9_4, var10_17, 0);
                                var9_4 = (yp4)var9_4.c;
                                if (!var9_4.a.getLooper().getThread().isAlive()) {
                                    return;
                                }
                                var9_4.d((Runnable)var10_17);
                                return;
                            }
                            case 26: {
                                var9_4 = (ix0)var9_4;
                                var8_33 = var9_4.h.isPopupShowing();
                                var9_4.s(var8_33);
                                var9_4.m = var8_33;
                                return;
                            }
                            case 25: {
                                var10_18 = (bu0)var9_4;
                                var10_18.getClass();
                                var12_35 = 0;
                                if (ud3.o() == null) {
                                    var10_18.f.i(-1);
                                    return;
                                }
                                var9_4 = new lg1(10, (ss0)var10_18.c.o);
                                var11_27 = new Thread((Runnable)var9_4);
                                var11_27.start();
                                try {
                                    var11_27.join();
                                }
                                catch (InterruptedException var11_28) {
                                    var11_28.printStackTrace();
                                }
                                var9_4 = (List)var9_4.p;
                                if (var9_4 != null && !var9_4.isEmpty()) {
                                    var11_27 = new ArrayList<E>();
                                    var13_39 = var9_4.iterator();
                                    break block94;
                                } else {
                                    var10_18.f.i(var12_35);
                                    return;
                                }
                            }
                            case 24: {
                                ((la0)var9_4).d();
                                return;
                            }
                            case 23: {
                                ((zd0)var9_4).d();
                                return;
                            }
                            case 22: {
                                var9_4 = (DirectoryFragment)var9_4;
                                Toast.makeText((Context)var9_4.Z(), (CharSequence)var9_4.s(2131951963), (int)0).show();
                                return;
                            }
                            case 21: {
                                ((tn0)var9_4).h.d();
                                return;
                            }
                            case 20: {
                                var9_4 = (DefaultTimeBar)var9_4;
                                var1_3 = DefaultTimeBar.f0;
                                var9_4.d(false);
                                return;
                            }
                            case 19: {
                                ((ik0)var9_4).d(null);
                                return;
                            }
                            case 18: {
                                var10_19 = (jk0)var9_4;
                                if (var10_19.p) {
                                    return;
                                }
                                var9_4 = var10_19.o;
                                if (var9_4 != null) {
                                    var9_4.d(var10_19.n);
                                }
                                var10_19.q.n.remove(var10_19);
                                var10_19.p = true;
                                return;
                            }
                            case 17: {
                                var9_4 = (tj0)var9_4;
                                if (var9_4.a0 < 300000L) return;
                                var9_4.n.n();
                                var9_4.a0 = 0L;
                                return;
                            }
                            case 16: {
                                var9_4 = (nj0)var9_4;
                                var9_4.b0(var9_4.W(), 1028, new jj0(2));
                                var9_4.s.d();
                                return;
                            }
                            case 15: {
                                CredentialProviderCreatePublicKeyCredentialController.$r8$lambda$5hlDM94MjJzc7w2nd16ozsS7vqI((CredentialProviderCreatePublicKeyCredentialController)var9_4);
                                return;
                            }
                            case 14: {
                                n70.a((n70)var9_4);
                                return;
                            }
                            case 13: {
                                var9_4 = (i70)var9_4;
                                var10_20 = var9_4.o;
                                if (var10_20 == null) return;
                                var10_20.run();
                                var9_4.o = null;
                                return;
                            }
                            case 12: {
                                var9_4 = (ColorPickerView)var9_4;
                                var1_3 = ColorPickerView.H;
                                var9_4.a(var9_4.getColor());
                                var9_4.f(var9_4.p);
                                return;
                            }
                            case 11: {
                                ((s30)var9_4).s(true);
                                return;
                            }
                            case 10: {
                                var9_4 = (au)var9_4;
                                var9_4.g = null;
                                ((BottomSheetBehavior)var9_4.b).J(4);
                                return;
                            }
                            case 9: {
                                ((tc2)var9_4).f(-1, new kf2(6));
                                return;
                            }
                            case 8: {
                                var9_4 = (kl)var9_4;
                                if (var9_4.c.o == false) return;
                                var9_4.a.n.w1(3, false);
                                return;
                            }
                            case 7: {
                                var11_29 = (cl)var9_4;
                                var9_4 = var11_29.a;
                                // MONITORENTER : var9_4
                                if (var11_29.m) {
                                    // MONITOREXIT : var9_4
                                    return;
                                }
                                var11_29.l = var6_49 = var11_29.l - 1L;
                                cfr_temp_0 = var6_49 - 0L;
                                var1_3 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                if (var1_3 > 0) {
                                    // MONITOREXIT : var9_4
                                    return;
                                }
                                if (var1_3 < 0) {
                                    var12_36 = new IllegalStateException();
                                    var10_22 = var11_29.a;
                                    // MONITORENTER : var10_22
                                    var11_29.n = var12_36;
                                    // MONITOREXIT : var10_22
                                    // MONITOREXIT : var9_4
                                    return;
                                }
                                var11_29.a();
                                // MONITOREXIT : var9_4
                                return;
                            }
                            case 6: {
                                var9_4 = (ArtistPageFragment)var9_4;
                                var9_4.l0.k.setVisibility(0);
                                var9_4.l0.p.setVisibility(8);
                                var9_4.l0.s.setVisibility(8);
                                var9_4.l0.r.setVisibility(8);
                                var9_4.l0.q.setVisibility(0);
                                var9_4.l0.t.setVisibility(8);
                                return;
                            }
                            case 5: {
                                var10_23 = (lb)var9_4;
                                var8_34 = var10_23.e();
                                var9_4 = var10_23.n;
                                if (!var8_34) {
                                    return;
                                }
                                Trace.beginSection((String)"ContentCapture:changeChecker");
                                var9_4.q(true);
                                var12_37 = var10_23.x;
                                var11_30 = var12_37.b;
                                var12_37 = var12_37.a;
                                var3_1 = ((Object)var12_37).length - 2;
                                if (var3_1 < 0) break block95;
                                var1_3 = 0;
                                break block96;
                            }
                            case 4: {
                                var9_4 = (ya)var9_4;
                                Trace.beginSection((String)"Compose:semantics:measureAndLayout");
                                var9_4.q.q(true);
                                Trace.beginSection((String)"Compose:semantics:checkForSemanticsChanges");
                                try {
                                    var9_4.n();
                                    var9_4.V = false;
                                    return;
                                }
                                finally {
                                    Trace.endSection();
                                }
                            }
                            case 3: {
                                var9_4 = (AlbumPageFragment)var9_4;
                                if (var9_4.l0 == null) {
                                    return;
                                }
                                var2_2 = (int)var9_4.r().getDimension(2131165931);
                                var10_24 /* !! */  = var9_4.X().getWindow().getDecorView();
                                var11_31 = j65.a;
                                var1_3 = (var10_24 /* !! */  = b65.a(var10_24 /* !! */ )) == null ? 0 : var10_24 /* !! */ .a.h((int)519).d;
                                var10_24 /* !! */  = (RecyclerView)var9_4.l0.q;
                                var10_24 /* !! */ .setPadding(var10_24 /* !! */ .getPaddingLeft(), ((RecyclerView)var9_4.l0.q).getPaddingTop(), ((RecyclerView)var9_4.l0.q).getPaddingRight(), var1_3 + var2_2);
                                return;
                            }
                            case 2: {
                                ((AlbumBottomSheetDialog)var9_4).o0();
                                return;
                            }
                            case 1: {
                                var10_25 = (Activity)var9_4;
                                if (var10_25.isFinishing() != false) return;
                                var13_41 = n5.g;
                                var15_48 = n5.f;
                                var3_1 = Build.VERSION.SDK_INT;
                                if (var3_1 >= 28) {
                                    var10_25.recreate();
                                    return;
                                }
                                if ((var3_1 == 26 || var3_1 == 27) && var15_48 == null || n5.e == null && n5.d == null) break block97;
                                var14_46 = n5.c.get(var10_25);
                                if (var14_46 == null || (var9_4 = n5.b.get(var10_25)) == null) break block97;
                                var12_38 = var10_25.getApplication();
                                var11_32 = new m5(var10_25);
                                var12_38.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)var11_32);
                                var16_43 = new lg1(2, var11_32, var14_46);
                                var13_41.post((Runnable)var16_43);
                                var1_3 = var2_2;
                                if (var3_1 != 26) {
                                    var1_3 = var3_1 == 27 ? var2_2 : 0;
                                }
                                if (var1_3 == 0) ** GOTO lbl265
                                try {
                                    var16_43 = Boolean.FALSE;
                                }
                                catch (Throwable var9_13) {
                                    ** GOTO lbl271
                                }
                                try {
                                    var15_48.invoke(var9_4, new Object[]{var14_46, null, null, 0, var16_43, null, null, var16_43, var16_43});
                                    ** GOTO lbl267
                                }
                                catch (Throwable var9_12) {
                                    ** GOTO lbl271
                                }
lbl265:
                                // 1 sources

                                var10_25.recreate();
lbl267:
                                // 3 sources

                                var9_4 = new lg1(3, var12_38, var11_32);
                                var13_41.post((Runnable)var9_4);
                                return;
lbl271:
                                // 2 sources

                                var14_46 = new lg1(3, var12_38, var11_32);
                                var13_41.post((Runnable)var14_46);
                                throw var9_14;
                            }
                            case 0: {
                                ((b0)var9_4).b();
                                return;
                            }
                        }
                        catch (Throwable var9_15) {}
                    }
                    var10_25.recreate();
                    return;
                }
                while (var13_39.hasNext()) {
                    var14_44 = (Download)var13_39.next();
                    var9_4 = var14_44.getDownloadUri();
                    if (var9_4 == null || var9_4.isEmpty() || (var16_42 = Uri.parse((String)var9_4)).getScheme() == null || !var16_42.getScheme().equalsIgnoreCase("content")) continue;
                    try {
                        var15_47 = var10_18.b;
                        var15_47.getClass();
                        var9_4 = new af4();
                        var9_4.b = var15_47;
                        var9_4.c = var16_42;
                    }
                    catch (SecurityException var9_6) {
                        var9_4 = null;
                    }
                    if (var9_4 != null && var9_4.b()) continue;
                    var11_27.add(var14_44);
                }
                if (var11_27.isEmpty()) {
                    var10_18.f.i(var12_35);
                    return;
                }
                var9_4 = new ArrayList<E>();
                var2_2 = var11_27.size();
                while (true) lbl-1000:
                // 2 sources

                {
                    if (var1_3 >= var2_2) {
                        new Thread(new lg1(9, (ss0)var10_18.c.o, var9_4)).start();
                        g51.i();
                        var10_18.f.i(var9_4.size());
                        return;
                    }
                    var12_35 = var11_27.get(var1_3);
                    ++var1_3;
                    var13_39 = (Download)var12_35;
                    var9_4.add(var13_39.getId());
                    var12_35 = g51.a;
                    // MONITORENTER : g51.class
                    var12_35 = g51.a(var13_39.getArtist(), var13_39.getTitle(), var13_39.getAlbum());
                    g51.a.remove(var12_35);
                    j51.K((String)var12_35);
                    break;
                }
                {
                    catch (Throwable var9_7) {}
                    throw var9_7;
                }
                {
                    // MONITOREXIT : g51.class
                    ** while (true)
                }
            }
            while (true) {
                if ((((var6_50 = var12_37[var1_3]) ^ -1L) << 7 & var6_50 & -9187201950435737472L) != -9187201950435737472L) {
                    var4_51 = 8 - (~(var1_3 - var3_1) >>> 31);
                    for (var2_2 = 0; var2_2 < var4_51; var6_50 >>= 8, ++var2_2) {
                        if ((255L & var6_50) >= 128L) continue;
                        var5_52 = var11_30[(var1_3 << 3) + var2_2];
                        if (var10_23.d().a(var5_52)) continue;
                        var13_40 = var10_23.q;
                        var14_45 = new yc0(var5_52, var10_23.w, zc0.o, null);
                        var13_40.add(var14_45);
                        var10_23.u.d(j15.a);
                    }
                    if (var4_51 != 8) break;
                }
                if (var1_3 == var3_1) break;
                ++var1_3;
            }
        }
        Trace.beginSection((String)"ContentCapture:sendAppearEvents");
        {
            catch (Throwable var9_9) {
                throw var9_9;
            }
        }
        try {
            var10_23.g(var9_4.getSemanticsOwner().a(), var10_23.y);
        }
        catch (Throwable var9_8) {
            Trace.endSection();
            throw var9_8;
        }
        try {
            Trace.endSection();
            var10_23.c(var10_23.d());
            var10_23.l();
            var10_23.z = false;
            return;
        }
        finally {
            Trace.endSection();
        }
    }
}

