package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.eddyizm.tempus.upnp.UpnpException;
import java.util.Map;
import java.util.Set;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o25 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ q25 o;

    public /* synthetic */ o25(q25 q25Var, int i) {
        this.n = i;
        this.o = q25Var;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c6 A[Catch: Exception -> 0x00a3, UpnpException -> 0x00a7, TryCatch #2 {UpnpException -> 0x00a7, blocks: (B:9:0x001d, B:12:0x005e, B:25:0x008e, B:30:0x009c, B:41:0x00be, B:43:0x00c6, B:45:0x00d3, B:47:0x00e3, B:52:0x00f1, B:53:0x00f9, B:55:0x0107, B:57:0x0114, B:59:0x0123, B:61:0x012b, B:66:0x0135, B:67:0x0137, B:71:0x014c, B:73:0x0159, B:76:0x0163, B:78:0x016b, B:80:0x016f, B:82:0x0173, B:83:0x017a, B:84:0x017f, B:37:0x00ad, B:39:0x00b5), top: B:145:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e3 A[Catch: Exception -> 0x00a3, UpnpException -> 0x00a7, TryCatch #2 {UpnpException -> 0x00a7, blocks: (B:9:0x001d, B:12:0x005e, B:25:0x008e, B:30:0x009c, B:41:0x00be, B:43:0x00c6, B:45:0x00d3, B:47:0x00e3, B:52:0x00f1, B:53:0x00f9, B:55:0x0107, B:57:0x0114, B:59:0x0123, B:61:0x012b, B:66:0x0135, B:67:0x0137, B:71:0x014c, B:73:0x0159, B:76:0x0163, B:78:0x016b, B:80:0x016f, B:82:0x0173, B:83:0x017a, B:84:0x017f, B:37:0x00ad, B:39:0x00b5), top: B:145:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f1 A[Catch: Exception -> 0x00a3, UpnpException -> 0x00a7, TryCatch #2 {UpnpException -> 0x00a7, blocks: (B:9:0x001d, B:12:0x005e, B:25:0x008e, B:30:0x009c, B:41:0x00be, B:43:0x00c6, B:45:0x00d3, B:47:0x00e3, B:52:0x00f1, B:53:0x00f9, B:55:0x0107, B:57:0x0114, B:59:0x0123, B:61:0x012b, B:66:0x0135, B:67:0x0137, B:71:0x014c, B:73:0x0159, B:76:0x0163, B:78:0x016b, B:80:0x016f, B:82:0x0173, B:83:0x017a, B:84:0x017f, B:37:0x00ad, B:39:0x00b5), top: B:145:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0107 A[Catch: Exception -> 0x00a3, UpnpException -> 0x00a7, TryCatch #2 {UpnpException -> 0x00a7, blocks: (B:9:0x001d, B:12:0x005e, B:25:0x008e, B:30:0x009c, B:41:0x00be, B:43:0x00c6, B:45:0x00d3, B:47:0x00e3, B:52:0x00f1, B:53:0x00f9, B:55:0x0107, B:57:0x0114, B:59:0x0123, B:61:0x012b, B:66:0x0135, B:67:0x0137, B:71:0x014c, B:73:0x0159, B:76:0x0163, B:78:0x016b, B:80:0x016f, B:82:0x0173, B:83:0x017a, B:84:0x017f, B:37:0x00ad, B:39:0x00b5), top: B:145:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0113  */
    /* JADX WARN: Code duplicated, block: B:59:0x0123 A[Catch: Exception -> 0x00a3, UpnpException -> 0x00a7, TryCatch #2 {UpnpException -> 0x00a7, blocks: (B:9:0x001d, B:12:0x005e, B:25:0x008e, B:30:0x009c, B:41:0x00be, B:43:0x00c6, B:45:0x00d3, B:47:0x00e3, B:52:0x00f1, B:53:0x00f9, B:55:0x0107, B:57:0x0114, B:59:0x0123, B:61:0x012b, B:66:0x0135, B:67:0x0137, B:71:0x014c, B:73:0x0159, B:76:0x0163, B:78:0x016b, B:80:0x016f, B:82:0x0173, B:83:0x017a, B:84:0x017f, B:37:0x00ad, B:39:0x00b5), top: B:145:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:61:0x012b A[Catch: Exception -> 0x00a3, UpnpException -> 0x00a7, TryCatch #2 {UpnpException -> 0x00a7, blocks: (B:9:0x001d, B:12:0x005e, B:25:0x008e, B:30:0x009c, B:41:0x00be, B:43:0x00c6, B:45:0x00d3, B:47:0x00e3, B:52:0x00f1, B:53:0x00f9, B:55:0x0107, B:57:0x0114, B:59:0x0123, B:61:0x012b, B:66:0x0135, B:67:0x0137, B:71:0x014c, B:73:0x0159, B:76:0x0163, B:78:0x016b, B:80:0x016f, B:82:0x0173, B:83:0x017a, B:84:0x017f, B:37:0x00ad, B:39:0x00b5), top: B:145:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0131  */
    /* JADX WARN: Code duplicated, block: B:64:0x0132  */
    /* JADX WARN: Code duplicated, block: B:66:0x0135 A[Catch: Exception -> 0x00a3, UpnpException -> 0x00a7, TryCatch #2 {UpnpException -> 0x00a7, blocks: (B:9:0x001d, B:12:0x005e, B:25:0x008e, B:30:0x009c, B:41:0x00be, B:43:0x00c6, B:45:0x00d3, B:47:0x00e3, B:52:0x00f1, B:53:0x00f9, B:55:0x0107, B:57:0x0114, B:59:0x0123, B:61:0x012b, B:66:0x0135, B:67:0x0137, B:71:0x014c, B:73:0x0159, B:76:0x0163, B:78:0x016b, B:80:0x016f, B:82:0x0173, B:83:0x017a, B:84:0x017f, B:37:0x00ad, B:39:0x00b5), top: B:145:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0147  */
    /* JADX WARN: Code duplicated, block: B:70:0x0149  */
    /* JADX WARN: Code duplicated, block: B:75:0x0161  */
    /* JADX WARN: Code duplicated, block: B:94:0x019a A[Catch: Exception -> 0x0191, UpnpException -> 0x0193, TryCatch #5 {UpnpException -> 0x0193, Exception -> 0x0191, blocks: (B:87:0x018c, B:92:0x0196, B:94:0x019a, B:95:0x01a0), top: B:146:0x0157 }] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        p25 p25VarJ1;
        long jLongValue;
        long jMin;
        Long lD;
        Long lD2;
        Set set;
        long j;
        long j2;
        String str2;
        gn2 gn2Var;
        do2 do2Var;
        Bundle bundle;
        switch (this.n) {
            case 0:
                q25 q25Var = this.o;
                if (q25Var.r && !q25Var.C) {
                    q25Var.M = true;
                    q25Var.c2();
                    q25Var.L = 0L;
                    q25Var.n.removeCallbacks(q25Var.O);
                    q25Var.n.post(q25Var.O);
                    break;
                }
                break;
            case 1:
                q25 q25Var2 = this.o;
                if (!q25Var2.C) {
                    q25Var2.M = true;
                    q25Var2.c2();
                    q25Var2.L = 0L;
                    q25Var2.n.removeCallbacks(q25Var2.O);
                    q25Var2.n.post(q25Var2.O);
                    break;
                }
                break;
            case 2:
                q25 q25Var3 = this.o;
                q25Var3.n.removeCallbacks(q25Var3.O);
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                q25 q25Var4 = this.o;
                if (!q25Var4.C) {
                    q25Var4.F1();
                    if (q25Var4.f.isEmpty() && !q25Var4.i) {
                        q25Var4.D1(q25Var4.i1(), false, false);
                        break;
                    }
                }
                break;
            default:
                q25 q25Var5 = this.o;
                if (!q25Var5.C && q25Var5.M) {
                    try {
                        try {
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            Map mapC = q25Var5.j.c(q25Var5.k);
                            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                            f25 f25Var = q25Var5.j;
                            g25 g25Var = q25Var5.k;
                            f25Var.getClass();
                            g25Var.getClass();
                            Map mapH = f25Var.h(f25.d(g25Var), "GetTransportInfo", gb.O(new kd3("InstanceID", "0")));
                            q25Var5.L = 0L;
                            if (q25Var5.F == q25Var5.E) {
                                long jU1 = q25Var5.U1();
                                long jMax = Math.max(jU1, q25Var5.A);
                                q25Var5.A = jMax;
                                try {
                                    p25 p25VarJ2 = q25Var5.J1();
                                    long j3 = ((long) ((p25VarJ2 != null && (gn2Var = p25VarJ2.b) != null && (do2Var = gn2Var.d) != null && (bundle = do2Var.I) != null) ? bundle.getInt("duration", 0) : 0)) * 1000;
                                    Long lValueOf = Long.valueOf(j3);
                                    if (j3 <= 0) {
                                        lValueOf = null;
                                    }
                                    try {
                                        if (lValueOf != null) {
                                            jLongValue = lValueOf.longValue();
                                        } else {
                                            if (q25Var5.B > 0) {
                                                jLongValue = q25Var5.B / 1000;
                                            } else {
                                                jLongValue = 0;
                                            }
                                            if (q25Var5.B > 0) {
                                                jMin = Math.min(jLongValue, q25Var5.B / 1000);
                                            } else {
                                                jMin = jLongValue;
                                            }
                                            Set set2 = q25.Q;
                                            lD = ya4.d((String) mapC.get("TrackDuration"));
                                            if (lD != null) {
                                                if (lD.longValue() > 0) {
                                                    lD = null;
                                                }
                                                if (lD != null) {
                                                    q25Var5.B = lD.longValue() * 1000;
                                                }
                                            }
                                            lD2 = ya4.d((String) mapC.get("RelTime"));
                                            if (lD2 != null) {
                                                q25Var5.b2(lD2.longValue(), jElapsedRealtime, jElapsedRealtime2);
                                            }
                                            set = q25.Q;
                                            if (!q40.s0(set, mapH.get("CurrentTransportState"))) {
                                                str2 = (String) mapC.get("TrackURI");
                                                if (str2 != null) {
                                                    if (!qm4.u0(str2)) {
                                                        str2 = null;
                                                    }
                                                    if (str2 != null) {
                                                        q25Var5.D = str2;
                                                    }
                                                }
                                                j = jLongValue;
                                                j2 = jMax;
                                                if (q25Var5.N1(j2, j, (String) mapC.get("TrackURI"))) {
                                                }
                                            } else {
                                                j = jLongValue;
                                                j2 = jMax;
                                            }
                                            str = (String) mapH.get("CurrentTransportState");
                                            if (!h12.c(str, "PLAYING") || h12.c(str, "PAUSED_PLAYBACK")) {
                                                if (q25Var5.s != 3) {
                                                    q25Var5.u = SystemClock.elapsedRealtime();
                                                }
                                                q25Var5.x = 0;
                                                q25Var5.J = true;
                                                q25Var5.s = 3;
                                                q25Var5.M1(h12.c(mapH.get("CurrentTransportState"), "PLAYING"));
                                            } else if (h12.c(str, "TRANSITIONING")) {
                                                if (q25Var5.s == 3 && q25Var5.r) {
                                                    q25Var5.Y1(q25Var5.U1());
                                                }
                                                q25Var5.s = 2;
                                            } else if (q40.s0(set, str)) {
                                                q25Var5.S1(j2, j, jMin, jU1);
                                            }
                                            q25Var5.O1();
                                        }
                                        if (h12.c(str, "PLAYING")) {
                                            if (q25Var5.s != 3) {
                                                q25Var5.u = SystemClock.elapsedRealtime();
                                            }
                                            q25Var5.x = 0;
                                            q25Var5.J = true;
                                            q25Var5.s = 3;
                                            q25Var5.M1(h12.c(mapH.get("CurrentTransportState"), "PLAYING"));
                                        } else {
                                            if (q25Var5.s != 3) {
                                                q25Var5.u = SystemClock.elapsedRealtime();
                                            }
                                            q25Var5.x = 0;
                                            q25Var5.J = true;
                                            q25Var5.s = 3;
                                            q25Var5.M1(h12.c(mapH.get("CurrentTransportState"), "PLAYING"));
                                        }
                                        break;
                                    } catch (UpnpException e) {
                                        e = e;
                                        q25Var5.L = 0L;
                                        if (e.n == 716) {
                                            Log.w(str, "could not read the renderer's state", e);
                                        } else {
                                            Log.w(str, "could not read the renderer's state", e);
                                        }
                                    } catch (Exception e2) {
                                        e = e2;
                                        if (q25Var5.L == 0) {
                                            q25Var5.L = SystemClock.uptimeMillis();
                                        }
                                        if (SystemClock.uptimeMillis() - q25Var5.L <= q25.S) {
                                            Log.w(str, "could not read the renderer's state", e);
                                        } else if (q25Var5.r) {
                                            q25Var5.L1(q25Var5.G1(e));
                                        } else {
                                            Log.w(str, "renderer is unreachable while paused, no longer reading it", e);
                                            q25Var5.D = null;
                                            q25Var5.s = 1;
                                            q25Var5.Z1();
                                        }
                                    }
                                    if (q25Var5.B > 0) {
                                        jMin = Math.min(jLongValue, q25Var5.B / 1000);
                                    } else {
                                        jMin = jLongValue;
                                    }
                                    Set set3 = q25.Q;
                                    lD = ya4.d((String) mapC.get("TrackDuration"));
                                    if (lD != null) {
                                        if (lD.longValue() > 0) {
                                            lD = null;
                                        }
                                        if (lD != null) {
                                            q25Var5.B = lD.longValue() * 1000;
                                        }
                                    }
                                    lD2 = ya4.d((String) mapC.get("RelTime"));
                                    if (lD2 != null) {
                                        q25Var5.b2(lD2.longValue(), jElapsedRealtime, jElapsedRealtime2);
                                    }
                                    set = q25.Q;
                                    if (!q40.s0(set, mapH.get("CurrentTransportState"))) {
                                        str2 = (String) mapC.get("TrackURI");
                                        if (str2 != null) {
                                            if (!qm4.u0(str2)) {
                                                str2 = null;
                                            }
                                            if (str2 != null) {
                                                q25Var5.D = str2;
                                            }
                                        }
                                        j = jLongValue;
                                        j2 = jMax;
                                        if (q25Var5.N1(j2, j, (String) mapC.get("TrackURI"))) {
                                        }
                                    } else {
                                        j = jLongValue;
                                        j2 = jMax;
                                    }
                                    str = (String) mapH.get("CurrentTransportState");
                                } catch (UpnpException e3) {
                                    e = e3;
                                    str = "UpnpPlayer";
                                    q25Var5.L = 0L;
                                    if (e.n == 716 || !q25Var5.r || (p25VarJ1 = q25Var5.J1()) == null) {
                                        Log.w(str, "could not read the renderer's state", e);
                                    } else {
                                        q25Var5.L1(q25Var5.H1(p25VarJ1, e));
                                    }
                                    q25Var5.O1();
                                }
                                q25Var5.O1();
                                break;
                            }
                        } catch (UpnpException e4) {
                            e = e4;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        str = "UpnpPlayer";
                    }
                    break;
                }
                break;
        }
    }
}
