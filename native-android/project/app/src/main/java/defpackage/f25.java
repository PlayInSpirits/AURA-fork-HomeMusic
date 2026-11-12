package defpackage;

import android.util.Log;
import com.eddyizm.tempus.upnp.UpnpException;
import java.io.StringReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f25 {
    public static final List c = gb.P("urn:schemas-upnp-org:device:MediaRenderer:1", "urn:schemas-upnp-org:service:AVTransport:1");
    public static final hu2 d = ve5.a("text/xml; charset=utf-8");
    public final o83 a;
    public final rp4 b;

    public f25() {
        n83 n83Var = new n83();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        n83Var.b(5L, timeUnit);
        n83Var.z = ze5.b(60L, timeUnit);
        n83Var.A = ze5.b(10L, timeUnit);
        this.a = new o83(n83Var);
        this.b = new rp4(new e25(0, this));
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0199  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    /* JADX WARN: Type inference failed for: r3v14 */
    public static List a(f25 f25Var) {
        u01 u01Var;
        ArrayList arrayList;
        boolean z;
        int i;
        List<g25> arrayList2;
        String string;
        NodeList nodeList;
        u01 u01Var2;
        ArrayList arrayList3;
        int i2;
        g25 g25Var;
        int i3;
        boolean z2;
        String string2;
        String string3;
        String string4;
        int i4;
        String textContent;
        f25Var.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z3 = false;
        try {
            DatagramSocket datagramSocket = new DatagramSocket();
            try {
                try {
                    InetAddress byName = InetAddress.getByName("239.255.255.250");
                    Iterator it = c.iterator();
                    while (it.hasNext()) {
                        byte[] bytes = ("M-SEARCH * HTTP/1.1\r\nHOST: 239.255.255.250:1900\r\nMAN: \"ssdp:discover\"\r\nMX: 2\r\nST: " + ((String) it.next()) + "\r\n\r\n").getBytes(w10.a);
                        bytes.getClass();
                        datagramSocket.send(new DatagramPacket(bytes, bytes.length, new InetSocketAddress(byName, 1900)));
                    }
                    byte[] bArr = new byte[8192];
                    long jCurrentTimeMillis = System.currentTimeMillis() + 3000;
                    while (System.currentTimeMillis() < jCurrentTimeMillis) {
                        DatagramPacket datagramPacket = new DatagramPacket(bArr, 8192);
                        try {
                            datagramSocket.setSoTimeout((int) gb.n(jCurrentTimeMillis - System.currentTimeMillis(), 1L, 3000L));
                            datagramSocket.receive(datagramPacket);
                            byte[] data = datagramPacket.getData();
                            data.getClass();
                            String strZ = ud3.Z(new String(data, 0, datagramPacket.getLength(), w10.a));
                            if (strZ != null) {
                                linkedHashSet.add(strZ);
                            }
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception e) {
                    Log.w("UpnpControlPoint", "search failed", e);
                }
                datagramSocket.close();
            } catch (Throwable th) {
                datagramSocket.close();
                throw th;
            }
        } catch (Exception e2) {
            Log.w("UpnpControlPoint", "cannot open a socket to search", e2);
        }
        boolean zIsEmpty = linkedHashSet.isEmpty();
        u01 u01Var3 = u01.n;
        if (zIsEmpty) {
            return u01Var3;
        }
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.min(linkedHashSet.size(), 8));
        try {
            ArrayList arrayList4 = new ArrayList(r40.k0(linkedHashSet, 10));
            Iterator it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                arrayList4.add(new ei0(3, (String) it2.next(), f25Var));
            }
            List listInvokeAll = executorServiceNewFixedThreadPool.invokeAll(arrayList4);
            listInvokeAll.getClass();
            ArrayList arrayList5 = new ArrayList(r40.k0(listInvokeAll, 10));
            Iterator it3 = listInvokeAll.iterator();
            while (it3.hasNext()) {
                arrayList5.add((kd3) ((Future) it3.next()).get());
            }
            executorServiceNewFixedThreadPool.shutdown();
            ArrayList arrayList6 = new ArrayList();
            HashSet hashSet = new HashSet();
            int size = arrayList5.size();
            int i5 = 0;
            while (i5 < size) {
                i5++;
                kd3 kd3Var = (kd3) arrayList5.get(i5);
                String str = (String) kd3Var.n;
                String str2 = (String) kd3Var.o;
                if (str2 != null) {
                    str.getClass();
                    try {
                        DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
                        documentBuilderFactoryNewInstance.setNamespaceAware(z3);
                        Element documentElement = documentBuilderFactoryNewInstance.newDocumentBuilder().parse(new InputSource(new StringReader(str2))).getDocumentElement();
                        documentElement.getClass();
                        Element element = (Element) q40.x0(su3.p(documentElement, "URLBase"));
                        if (element == null || (textContent = element.getTextContent()) == null || (string = qm4.K0(textContent).toString()) == null) {
                            string = str;
                        } else {
                            if (string.length() <= 0) {
                                string = null;
                            }
                            if (string == null) {
                                string = str;
                            }
                        }
                        arrayList2 = new ArrayList();
                        NodeList elementsByTagName = documentElement.getElementsByTagName("device");
                        int length = elementsByTagName.getLength();
                        ?? r11 = z3;
                        while (r11 < length) {
                            Node nodeItem = elementsByTagName.item(r11 == true ? 1 : 0);
                            Element element2 = nodeItem instanceof Element ? (Element) nodeItem : null;
                            if (element2 == null) {
                                nodeList = elementsByTagName;
                                u01Var2 = u01Var3;
                                arrayList3 = arrayList5;
                                z2 = z3;
                                i2 = size;
                                arrayList2 = arrayList2;
                                i3 = length;
                                r11 = r11 == true ? 1 : 0;
                            } else {
                                HashMap map = new HashMap();
                                ArrayList arrayListP = su3.p(element2, "serviceList");
                                ArrayList arrayList7 = new ArrayList();
                                nodeList = elementsByTagName;
                                int size2 = arrayListP.size();
                                u01Var2 = u01Var3;
                                int i6 = 0;
                                while (i6 < size2) {
                                    Object obj = arrayListP.get(i6);
                                    int i7 = i6 + 1;
                                    int i8 = size2;
                                    ArrayList arrayList8 = new ArrayList();
                                    NodeList childNodes = ((Element) obj).getChildNodes();
                                    ArrayList arrayList9 = arrayList5;
                                    int length2 = childNodes.getLength();
                                    int i9 = size;
                                    int i10 = 0;
                                    while (i10 < length2) {
                                        int i11 = length2;
                                        Node nodeItem2 = childNodes.item(i10);
                                        NodeList nodeList2 = childNodes;
                                        Element element3 = nodeItem2 instanceof Element ? (Element) nodeItem2 : null;
                                        if (element3 == null) {
                                            i4 = i10;
                                        } else {
                                            String tagName = element3.getTagName();
                                            tagName.getClass();
                                            i4 = i10;
                                            if (qm4.E0(tagName, ':').equals("service")) {
                                                arrayList8.add(element3);
                                            }
                                        }
                                        i10 = i4 + 1;
                                        length2 = i11;
                                        childNodes = nodeList2;
                                    }
                                    v40.n0(arrayList8, arrayList7);
                                    arrayList5 = arrayList9;
                                    size2 = i8;
                                    i6 = i7;
                                    size = i9;
                                }
                                arrayList3 = arrayList5;
                                i2 = size;
                                int size3 = arrayList7.size();
                                int i12 = 0;
                                while (i12 < size3) {
                                    Object obj2 = arrayList7.get(i12);
                                    i12++;
                                    Element element4 = (Element) obj2;
                                    NodeList elementsByTagName2 = element4.getElementsByTagName("serviceType");
                                    String textContent2 = elementsByTagName2.getLength() == 0 ? null : elementsByTagName2.item(0).getTextContent();
                                    if (textContent2 != null && (string2 = qm4.K0(textContent2).toString()) != null) {
                                        NodeList elementsByTagName3 = element4.getElementsByTagName("controlURL");
                                        String textContent3 = elementsByTagName3.getLength() == 0 ? null : elementsByTagName3.item(0).getTextContent();
                                        if (textContent3 != null && (string3 = qm4.K0(textContent3).toString()) != null) {
                                            if (string3.length() <= 0) {
                                                string3 = null;
                                            }
                                            if (string3 != null) {
                                                try {
                                                    string4 = new URI(string).resolve(string3).toString();
                                                } catch (Exception unused2) {
                                                    string4 = null;
                                                }
                                                if (string4 != null) {
                                                    map.put(string2, string4);
                                                }
                                            }
                                        }
                                    }
                                }
                                if (map.isEmpty()) {
                                    i3 = length;
                                    g25Var = null;
                                    z2 = false;
                                } else {
                                    i3 = length;
                                    z2 = false;
                                    g25Var = new g25(su3.A(element2, "UDN"), su3.A(element2, "friendlyName"), su3.A(element2, "manufacturer"), su3.A(element2, "modelName"), map, str);
                                }
                                if (g25Var != null) {
                                    arrayList2.add(g25Var);
                                }
                            }
                            int i13 = r11 + 1;
                            arrayList2 = arrayList2;
                            length = i3;
                            z3 = z2;
                            u01Var3 = u01Var2;
                            arrayList5 = arrayList3;
                            size = i2;
                            elementsByTagName = nodeList;
                            r11 = i13;
                        }
                        u01Var = u01Var3;
                        arrayList = arrayList5;
                        z = z3;
                        i = size;
                    } catch (Exception e3) {
                        u01Var = u01Var3;
                        arrayList = arrayList5;
                        z = z3;
                        i = size;
                        Log.w("UpnpDevice", "unparseable description from ".concat(str), e3);
                        arrayList2 = u01Var;
                    }
                    for (g25 g25Var2 : arrayList2) {
                        String str3 = (String) g25Var2.e.get("urn:schemas-upnp-org:service:AVTransport:1");
                        String str4 = g25Var2.a;
                        if (str3 != null && (str4.length() <= 0 || hashSet.add(str4))) {
                            arrayList6.add(g25Var2);
                        }
                    }
                    z3 = z;
                    u01Var3 = u01Var;
                    arrayList5 = arrayList;
                    size = i;
                }
            }
            return arrayList6;
        } catch (Throwable th2) {
            executorServiceNewFixedThreadPool.shutdown();
            throw th2;
        }
    }

    public static String d(g25 g25Var) throws UpnpException {
        String str = (String) g25Var.e.get("urn:schemas-upnp-org:service:AVTransport:1");
        if (str != null) {
            return str;
        }
        throw new UpnpException(501, "no AVTransport on ".concat(g25Var.b));
    }

    public final void b(g25 g25Var) throws InterruptedException, UpnpException {
        g25Var.getClass();
        String strD = d(g25Var);
        for (int i = 1; i < 3; i++) {
            try {
                h(strD, "Play", gb.P(new kd3("InstanceID", "0"), new kd3("Speed", "1")));
                return;
            } catch (UpnpException e) {
                int i2 = e.n;
                if ((i2 != 501 && i2 != 701) || i == 2) {
                    throw e;
                }
                Log.d("UpnpControlPoint", "play refused with " + i2 + ", asking again in 1000ms");
                Thread.sleep(1000L);
            }
        }
    }

    public final Map c(g25 g25Var) {
        g25Var.getClass();
        return h(d(g25Var), "GetPositionInfo", gb.O(new kd3("InstanceID", "0")));
    }

    public final void e(g25 g25Var, String str) {
        g25Var.getClass();
        h(d(g25Var), "Seek", gb.P(new kd3("InstanceID", "0"), new kd3("Unit", "REL_TIME"), new kd3("Target", str)));
    }

    public final void f(g25 g25Var, String str, String str2) {
        g25Var.getClass();
        str.getClass();
        h(d(g25Var), "SetAVTransportURI", gb.P(new kd3("InstanceID", "0"), new kd3("CurrentURI", str), new kd3("CurrentURIMetaData", str2)));
    }

    public final void g(g25 g25Var, String str, String str2) {
        g25Var.getClass();
        str.getClass();
        h(d(g25Var), "SetNextAVTransportURI", gb.P(new kd3("InstanceID", "0"), new kd3("NextURI", str), new kd3("NextURIMetaData", str2)));
    }

    public final Map h(String str, String str2, List list) {
        Integer numL0;
        String str3 = String.format("<?xml version=\"1.0\"?><s:Envelope xmlns:s=\"http://schemas.xmlsoap.org/soap/envelope/\" s:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\"><s:Body><u:%s xmlns:u=\"%s\">%s</u:%s></s:Body></s:Envelope>", Arrays.copyOf(new Object[]{str2, "urn:schemas-upnp-org:service:AVTransport:1", q40.B0(list, "", null, null, new o54(22), 30), str2}, 4));
        nz3 nz3Var = new nz3();
        nz3Var.d(str);
        nz3Var.c.a("SOAPAction", xa3.h("\"urn:schemas-upnp-org:service:AVTransport:1#", str2, "\""));
        tz3.Companion.getClass();
        nz3Var.b("POST", sz3.b(str3, d));
        oz3 oz3Var = new oz3(nz3Var);
        o83 o83Var = this.a;
        o83Var.getClass();
        k14 k14VarC = new bv3(o83Var, oz3Var).c();
        try {
            n14 n14Var = k14VarC.t;
            String strString = n14Var != null ? n14Var.string() : null;
            String str4 = "";
            if (strString == null) {
                strString = "";
            }
            if (k14VarC.C) {
                Map mapE0 = ud3.e0(strString, str2);
                k14VarC.close();
                return mapE0;
            }
            int iIntValue = k14VarC.q;
            Map mapE1 = ud3.e0(strString, "");
            String str5 = (String) mapE1.get("errorCode");
            if (str5 != null && (numL0 = xm4.l0(str5)) != null) {
                iIntValue = numL0.intValue();
            }
            String str6 = (String) mapE1.get("errorDescription");
            if (str6 != null) {
                str4 = str6;
            }
            throw new UpnpException(iIntValue, str4);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                q05.h(k14VarC, th);
                throw th2;
            }
        }
    }
}
