package defpackage;

import android.util.Log;
import com.eddyizm.tempus.homemusic.HubException;
import com.eddyizm.tempus.homemusic.HubPlayEventsResult;
import com.eddyizm.tempus.homemusic.PlayEvent;
import com.eddyizm.tempus.homemusic.SmartSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q extends ig1 implements if1 {
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.n = i3;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        Object[] objArr;
        mh3 mh3Var;
        HubPlayEventsResult hubPlayEventsResultR;
        String string;
        int i = this.n;
        vd0 vd0Var = null;
        int i2 = 0;
        int i3 = 1;
        j15 j15Var = j15.a;
        switch (i) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                u30 u30Var = (u30) this.receiver;
                m03 m03Var = u30Var.O;
                if (zBooleanValue) {
                    u30Var.x0();
                } else {
                    if (u30Var.D != null) {
                        Object[] objArr2 = m03Var.c;
                        long[] jArr = m03Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i4 = 0;
                            while (true) {
                                long j = jArr[i4];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i5 = 8;
                                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                                    int i7 = 0;
                                    while (i7 < i6) {
                                        if ((j & 255) < 128) {
                                            fu.G(u30Var.e0(), null, null, new v(u30Var, (bq3) objArr2[(i4 << 3) + i7], vd0Var, i2), 3);
                                        }
                                        j >>= i5;
                                        i7++;
                                        i5 = i5;
                                        objArr2 = objArr2;
                                    }
                                    objArr = objArr2;
                                    if (i6 == i5) {
                                    }
                                } else {
                                    objArr = objArr2;
                                }
                                if (i4 != length) {
                                    i4++;
                                    objArr2 = objArr;
                                }
                            }
                        }
                        bq3 bq3Var = u30Var.P;
                        if (bq3Var != null) {
                            fu.G(u30Var.e0(), null, null, new v(u30Var, bq3Var, vd0Var, 1), 3);
                        }
                    }
                    m03Var.a();
                    u30Var.P = null;
                }
                return j15Var;
            case 1:
                ic.a((ic) this.receiver, (jz) obj);
                return j15Var;
            case 2:
                ic.a((ic) this.receiver, (jz) obj);
                return j15Var;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                mh3 mh3Var2 = mh3.r;
                List list = (List) obj;
                list.getClass();
                ((rs1) this.receiver).getClass();
                try {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String account = ((PlayEvent) it.next()).getAccount();
                        if (account != null) {
                            arrayList.add(account);
                        }
                    }
                    List listT0 = q40.t0(arrayList);
                    if (listT0.isEmpty()) {
                        hubPlayEventsResultR = rr1.r(list);
                    } else {
                        rr1 rr1Var = rr1.a;
                        hubPlayEventsResultR = (HubPlayEventsResult) rr1.B((String) q40.I0(listT0), new km0(list, i3));
                    }
                    List<Map<String, Object>> rejected = hubPlayEventsResultR.getRejected();
                    if (rejected != null && !rejected.isEmpty()) {
                        List<Map<String, Object>> rejected2 = hubPlayEventsResultR.getRejected();
                        rejected2.getClass();
                        int iW = lg2.W(r40.k0(rejected2, 10));
                        if (iW < 16) {
                            iW = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
                        Iterator<T> it2 = rejected2.iterator();
                        while (it2.hasNext()) {
                            Map map = (Map) it2.next();
                            Object obj2 = map.get("index");
                            Number number = obj2 instanceof Number ? (Number) obj2 : null;
                            if (number == null) {
                                throw new IOException("Hub returned invalid rejection index");
                            }
                            PlayEvent playEvent = (PlayEvent) q40.y0(list, number.intValue());
                            if (playEvent == null) {
                                throw new IOException("Hub returned out of range rejection index");
                            }
                            String eventId = playEvent.getEventId();
                            Object obj3 = map.get("detail");
                            if (obj3 == null || (string = obj3.toString()) == null) {
                                string = "Hub rejected event";
                            }
                            linkedHashMap.put(eventId, string);
                        }
                        Log.w("HubPlays", "Hub rejected " + linkedHashMap.size() + " of " + list.size() + "; quarantined");
                        rp4 rp4Var = rs1.b;
                        ((lh3) rp4Var.getValue()).b(linkedHashMap);
                        lh3 lh3Var = (lh3) rp4Var.getValue();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj4 : list) {
                            if (!linkedHashMap.containsKey(((PlayEvent) obj4).getEventId())) {
                                arrayList2.add(obj4);
                            }
                        }
                        lh3Var.c(arrayList2);
                        return mh3.o;
                    }
                    return mh3.n;
                } catch (HubException e) {
                    int i8 = e.n;
                    if (i8 == 404) {
                        mh3Var = mh3.s;
                    } else {
                        if (i8 != 413) {
                            if (i8 != 0 && i8 != 401 && i8 != 403 && i8 != 408 && i8 != 429 && 400 <= i8 && i8 < 500) {
                                mh3Var = mh3.p;
                            }
                            return mh3Var2;
                        }
                        Log.w("HubPlays", "play event batch too large; splitting or retaining single event");
                        mh3Var = mh3.q;
                    }
                    mh3Var2 = mh3Var;
                    return mh3Var2;
                } catch (IOException unused) {
                    rr1.m();
                    return mh3Var2;
                }
            case 4:
                return Boolean.valueOf(((SmartSession) this.receiver).isListed((String) obj));
            case 5:
                return Boolean.valueOf(((SmartSession) this.receiver).isListed((String) obj));
            case 6:
                Set set = (Set) obj;
                set.getClass();
                s12 s12Var = (s12) this.receiver;
                ReentrantLock reentrantLock = s12Var.d;
                reentrantLock.lock();
                try {
                    List<d83> listQ0 = q40.Q0(s12Var.c.values());
                    reentrantLock.unlock();
                    for (d83 d83Var : listQ0) {
                        d83Var.getClass();
                        int[] iArr = d83Var.b;
                        int length2 = iArr.length;
                        Set setL = z01.n;
                        if (length2 != 0) {
                            if (length2 != 1) {
                                fb4 fb4Var = new fb4();
                                int length3 = iArr.length;
                                int i9 = 0;
                                int i10 = 0;
                                while (i9 < length3) {
                                    int i11 = i10 + 1;
                                    if (set.contains(Integer.valueOf(iArr[i9]))) {
                                        fb4Var.add(d83Var.c[i10]);
                                    }
                                    i9++;
                                    i10 = i11;
                                }
                                setL = kb4.l(fb4Var);
                            } else if (set.contains(Integer.valueOf(iArr[0]))) {
                                setL = d83Var.d;
                            }
                        }
                        if (!setL.isEmpty()) {
                            d83Var.a.a(setL);
                        }
                    }
                    return j15Var;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            default:
                ((u22) this.receiver).s((Throwable) obj);
                return j15Var;
        }
    }
}
