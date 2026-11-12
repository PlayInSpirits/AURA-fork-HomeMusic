package cat.ereza.customactivityoncrash.provider;

import android.app.Activity;
import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Process;
import android.util.Log;
import cat.ereza.customactivityoncrash.activity.DefaultErrorActivity;
import defpackage.rg0;
import defpackage.sg0;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class CaocInitProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        Application application = sg0.a;
        try {
            if (context == null) {
                Log.e("CustomActivityOnCrash", "Install failed: context is null!");
            } else {
                final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                if (defaultUncaughtExceptionHandler == null || !defaultUncaughtExceptionHandler.getClass().getName().startsWith("cat.ereza.customactivityoncrash")) {
                    if (defaultUncaughtExceptionHandler != null && !defaultUncaughtExceptionHandler.getClass().getName().startsWith("com.android.internal.os")) {
                        Log.e("CustomActivityOnCrash", "IMPORTANT WARNING! You already have an UncaughtExceptionHandler, are you sure this is correct? If you use a custom UncaughtExceptionHandler, you must initialize it AFTER CustomActivityOnCrash! Installing anyway, but your original handler will not be called.");
                    }
                    sg0.a = (Application) context.getApplicationContext();
                    Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: qg0
                        /* JADX WARN: Code duplicated, block: B:10:0x003d  */
                        /* JADX WARN: Code duplicated, block: B:12:0x0060  */
                        /* JADX WARN: Code duplicated, block: B:14:0x0083  */
                        /* JADX WARN: Code duplicated, block: B:19:0x0098  */
                        /* JADX WARN: Code duplicated, block: B:21:0x009b  */
                        /* JADX WARN: Code duplicated, block: B:29:0x00c1  */
                        /* JADX WARN: Code duplicated, block: B:32:0x00ca  */
                        /* JADX WARN: Code duplicated, block: B:34:0x00d8  */
                        /* JADX WARN: Code duplicated, block: B:38:0x00eb  */
                        /* JADX WARN: Code duplicated, block: B:44:0x011c  */
                        /* JADX WARN: Code duplicated, block: B:47:0x0134  */
                        /* JADX WARN: Code duplicated, block: B:49:0x0157  */
                        /* JADX WARN: Code duplicated, block: B:54:0x016c  */
                        /* JADX WARN: Code duplicated, block: B:56:0x016f  */
                        /* JADX WARN: Code duplicated, block: B:58:0x017d  */
                        /* JADX WARN: Code duplicated, block: B:81:0x00f9 A[SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:82:? A[LOOP:0: B:30:0x00c2->B:82:?, LOOP_END, SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:83:0x00f3 A[SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:84:0x00f0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
                        @Override // java.lang.Thread.UncaughtExceptionHandler
                        public final void uncaughtException(Thread thread, Throwable th) {
                            Class<?> cls;
                            Class<?> cls2;
                            String strTrim;
                            Throwable cause;
                            StackTraceElement[] stackTrace;
                            int length;
                            int i;
                            String string;
                            oz ozVar;
                            Application application2;
                            List<ResolveInfo> listQueryIntentActivities;
                            Class<?> cls3;
                            Intent launchIntentForPackage;
                            StackTraceElement stackTraceElement;
                            List<ResolveInfo> listQueryIntentActivities2;
                            Application application3 = sg0.a;
                            Log.e("CustomActivityOnCrash", "App has crashed, executing CustomActivityOnCrash's UncaughtExceptionHandler", th);
                            long j = sg0.a.getSharedPreferences("custom_activity_on_crash", 0).getLong("last_crash_timestamp", -1L);
                            long time = new Date().getTime();
                            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = defaultUncaughtExceptionHandler;
                            if (j <= time) {
                                long j2 = time - j;
                                Application application4 = sg0.a;
                                if (j2 < 3000) {
                                    Log.e("CustomActivityOnCrash", "App already crashed recently, not starting custom error activity because we could enter a restart loop. Are you sure that your app does not crash directly on init?", th);
                                    if (uncaughtExceptionHandler != null) {
                                        uncaughtExceptionHandler.uncaughtException(thread, th);
                                        return;
                                    }
                                } else {
                                    sg0.a.getSharedPreferences("custom_activity_on_crash", 0).edit().putLong("last_crash_timestamp", new Date().getTime()).commit();
                                    cls = sg0.b.o;
                                    cls2 = null;
                                    if (cls == null) {
                                        Application application5 = sg0.a;
                                        listQueryIntentActivities2 = application5.getPackageManager().queryIntentActivities(new Intent().setAction("cat.ereza.customactivityoncrash.ERROR").setPackage(application5.getPackageName()), 64);
                                        if (listQueryIntentActivities2.size() > 0) {
                                            try {
                                                cls = Class.forName(listQueryIntentActivities2.get(0).activityInfo.name);
                                            } catch (ClassNotFoundException e) {
                                                Log.e("CustomActivityOnCrash", "Failed when resolving the error activity class via intent filter, stack trace follows!", e);
                                                cls = null;
                                            }
                                        } else {
                                            cls = null;
                                        }
                                        if (cls == null) {
                                            cls = DefaultErrorActivity.class;
                                        }
                                    }
                                    try {
                                        BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/self/cmdline"));
                                        strTrim = bufferedReader.readLine().trim();
                                        bufferedReader.close();
                                    } catch (IOException unused) {
                                        strTrim = null;
                                    }
                                    if (strTrim == null && strTrim.endsWith(":error_activity")) {
                                        Log.e("CustomActivityOnCrash", "Your application class or your error activity have crashed, the custom activity will not be launched!");
                                        if (uncaughtExceptionHandler != null) {
                                            uncaughtExceptionHandler.uncaughtException(thread, th);
                                            return;
                                        }
                                    } else {
                                        cause = th;
                                        while (true) {
                                            stackTrace = cause.getStackTrace();
                                            length = stackTrace.length;
                                            i = 0;
                                            while (true) {
                                                if (i >= length) {
                                                    cause = cause.getCause();
                                                    if (cause == null) {
                                                        Application application6 = sg0.a;
                                                        Intent intent = new Intent(sg0.a, cls);
                                                        StringWriter stringWriter = new StringWriter();
                                                        th.printStackTrace(new PrintWriter(stringWriter));
                                                        string = stringWriter.toString();
                                                        if (string.length() > 131071) {
                                                            string = string.substring(0, 131047).concat(" [stack trace too large]");
                                                        }
                                                        intent.putExtra("cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE", string);
                                                        ozVar = sg0.b;
                                                        if (ozVar.p == null) {
                                                            application2 = sg0.a;
                                                            listQueryIntentActivities = application2.getPackageManager().queryIntentActivities(new Intent().setAction("cat.ereza.customactivityoncrash.RESTART").setPackage(application2.getPackageName()), 64);
                                                            if (listQueryIntentActivities.size() > 0) {
                                                                try {
                                                                    cls3 = Class.forName(listQueryIntentActivities.get(0).activityInfo.name);
                                                                } catch (ClassNotFoundException e2) {
                                                                    Log.e("CustomActivityOnCrash", "Failed when resolving the restart activity class via intent filter, stack trace follows!", e2);
                                                                    cls3 = null;
                                                                }
                                                            } else {
                                                                cls3 = null;
                                                            }
                                                            if (cls3 == null) {
                                                                launchIntentForPackage = application2.getPackageManager().getLaunchIntentForPackage(application2.getPackageName());
                                                                if (launchIntentForPackage != null && launchIntentForPackage.getComponent() != null) {
                                                                    try {
                                                                        cls2 = Class.forName(launchIntentForPackage.getComponent().getClassName());
                                                                    } catch (ClassNotFoundException e3) {
                                                                        Log.e("CustomActivityOnCrash", "Failed when resolving the restart activity class via getLaunchIntentForPackage, stack trace follows!", e3);
                                                                    }
                                                                }
                                                                cls3 = cls2;
                                                            }
                                                            ozVar.p = cls3;
                                                        }
                                                        intent.putExtra("cat.ereza.customactivityoncrash.EXTRA_CONFIG", sg0.b);
                                                        intent.setFlags(268468224);
                                                        Application application7 = sg0.a;
                                                        sg0.a.startActivity(intent);
                                                    }
                                                } else {
                                                    stackTraceElement = stackTrace[i];
                                                    if (stackTraceElement.getClassName().equals("android.app.ActivityThread") || !stackTraceElement.getMethodName().equals("handleBindApplication")) {
                                                        i++;
                                                    } else {
                                                        Log.e("CustomActivityOnCrash", "Your application class or your error activity have crashed, the custom activity will not be launched!");
                                                        if (uncaughtExceptionHandler != null) {
                                                            uncaughtExceptionHandler.uncaughtException(thread, th);
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                sg0.a.getSharedPreferences("custom_activity_on_crash", 0).edit().putLong("last_crash_timestamp", new Date().getTime()).commit();
                                cls = sg0.b.o;
                                cls2 = null;
                                if (cls == null) {
                                    Application application8 = sg0.a;
                                    listQueryIntentActivities2 = application8.getPackageManager().queryIntentActivities(new Intent().setAction("cat.ereza.customactivityoncrash.ERROR").setPackage(application8.getPackageName()), 64);
                                    if (listQueryIntentActivities2.size() > 0) {
                                        cls = Class.forName(listQueryIntentActivities2.get(0).activityInfo.name);
                                    } else {
                                        cls = null;
                                    }
                                    if (cls == null) {
                                        cls = DefaultErrorActivity.class;
                                    }
                                }
                                BufferedReader bufferedReader2 = new BufferedReader(new FileReader("/proc/self/cmdline"));
                                strTrim = bufferedReader2.readLine().trim();
                                bufferedReader2.close();
                                if (strTrim == null) {
                                    cause = th;
                                    while (true) {
                                        stackTrace = cause.getStackTrace();
                                        length = stackTrace.length;
                                        i = 0;
                                        while (true) {
                                            if (i >= length) {
                                                cause = cause.getCause();
                                                if (cause == null) {
                                                    Application application9 = sg0.a;
                                                    Intent intent2 = new Intent(sg0.a, cls);
                                                    StringWriter stringWriter2 = new StringWriter();
                                                    th.printStackTrace(new PrintWriter(stringWriter2));
                                                    string = stringWriter2.toString();
                                                    if (string.length() > 131071) {
                                                        string = string.substring(0, 131047).concat(" [stack trace too large]");
                                                    }
                                                    intent2.putExtra("cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE", string);
                                                    ozVar = sg0.b;
                                                    if (ozVar.p == null) {
                                                        application2 = sg0.a;
                                                        listQueryIntentActivities = application2.getPackageManager().queryIntentActivities(new Intent().setAction("cat.ereza.customactivityoncrash.RESTART").setPackage(application2.getPackageName()), 64);
                                                        if (listQueryIntentActivities.size() > 0) {
                                                            cls3 = Class.forName(listQueryIntentActivities.get(0).activityInfo.name);
                                                        } else {
                                                            cls3 = null;
                                                        }
                                                        if (cls3 == null) {
                                                            launchIntentForPackage = application2.getPackageManager().getLaunchIntentForPackage(application2.getPackageName());
                                                            if (launchIntentForPackage != null) {
                                                                cls2 = Class.forName(launchIntentForPackage.getComponent().getClassName());
                                                            }
                                                            cls3 = cls2;
                                                        }
                                                        ozVar.p = cls3;
                                                    }
                                                    intent2.putExtra("cat.ereza.customactivityoncrash.EXTRA_CONFIG", sg0.b);
                                                    intent2.setFlags(268468224);
                                                    Application application10 = sg0.a;
                                                    sg0.a.startActivity(intent2);
                                                }
                                            } else {
                                                stackTraceElement = stackTrace[i];
                                                if (stackTraceElement.getClassName().equals("android.app.ActivityThread")) {
                                                }
                                                i++;
                                            }
                                        }
                                    }
                                } else {
                                    cause = th;
                                    while (true) {
                                        stackTrace = cause.getStackTrace();
                                        length = stackTrace.length;
                                        i = 0;
                                        while (true) {
                                            if (i >= length) {
                                                cause = cause.getCause();
                                                if (cause == null) {
                                                    Application application11 = sg0.a;
                                                    Intent intent3 = new Intent(sg0.a, cls);
                                                    StringWriter stringWriter3 = new StringWriter();
                                                    th.printStackTrace(new PrintWriter(stringWriter3));
                                                    string = stringWriter3.toString();
                                                    if (string.length() > 131071) {
                                                        string = string.substring(0, 131047).concat(" [stack trace too large]");
                                                    }
                                                    intent3.putExtra("cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE", string);
                                                    ozVar = sg0.b;
                                                    if (ozVar.p == null) {
                                                        application2 = sg0.a;
                                                        listQueryIntentActivities = application2.getPackageManager().queryIntentActivities(new Intent().setAction("cat.ereza.customactivityoncrash.RESTART").setPackage(application2.getPackageName()), 64);
                                                        if (listQueryIntentActivities.size() > 0) {
                                                            cls3 = Class.forName(listQueryIntentActivities.get(0).activityInfo.name);
                                                        } else {
                                                            cls3 = null;
                                                        }
                                                        if (cls3 == null) {
                                                            launchIntentForPackage = application2.getPackageManager().getLaunchIntentForPackage(application2.getPackageName());
                                                            if (launchIntentForPackage != null) {
                                                                cls2 = Class.forName(launchIntentForPackage.getComponent().getClassName());
                                                            }
                                                            cls3 = cls2;
                                                        }
                                                        ozVar.p = cls3;
                                                    }
                                                    intent3.putExtra("cat.ereza.customactivityoncrash.EXTRA_CONFIG", sg0.b);
                                                    intent3.setFlags(268468224);
                                                    Application application12 = sg0.a;
                                                    sg0.a.startActivity(intent3);
                                                }
                                            } else {
                                                stackTraceElement = stackTrace[i];
                                                if (stackTraceElement.getClassName().equals("android.app.ActivityThread")) {
                                                }
                                                i++;
                                            }
                                        }
                                    }
                                }
                            }
                            Activity activity = (Activity) sg0.c.get();
                            if (activity != null) {
                                activity.finish();
                                sg0.c.clear();
                            }
                            Process.killProcess(Process.myPid());
                            System.exit(10);
                        }
                    });
                    Application application2 = sg0.a;
                    rg0 rg0Var = new rg0();
                    rg0Var.n = 0;
                    new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
                    application2.registerActivityLifecycleCallbacks(rg0Var);
                } else {
                    Log.e("CustomActivityOnCrash", "CustomActivityOnCrash was already installed, doing nothing!");
                }
                Log.i("CustomActivityOnCrash", "CustomActivityOnCrash has been installed.");
            }
        } catch (Throwable th) {
            Log.e("CustomActivityOnCrash", "An unknown error occurred while installing CustomActivityOnCrash, it may not have been properly initialized. Please report this as a bug if needed.", th);
        }
        return false;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
