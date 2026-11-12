.class public Landroidx/work/impl/diagnostics/DiagnosticsReceiver;
.super Landroid/content/BroadcastReceiver;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "DiagnosticsRcvr"

    .line 2
    .line 3
    invoke-static {v0}, Lcx;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroidx/work/impl/diagnostics/DiagnosticsReceiver;->a:Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 8

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {}, Lcx;->f()Lcx;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const-string p2, "Requesting diagnostics"

    .line 9
    .line 10
    sget-object v1, Landroidx/work/impl/diagnostics/DiagnosticsReceiver;->a:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {p0, v1, p2}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Lsc5;->b(Landroid/content/Context;)Lsc5;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    const-class p0, Landroidx/work/impl/workers/DiagnosticsWorker;

    .line 23
    .line 24
    new-instance p1, Li93;

    .line 25
    .line 26
    invoke-direct {p1, p0}, Li93;-><init>(Ljava/lang/Class;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lrx1;->b()Lbd5;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Lj93;

    .line 34
    .line 35
    invoke-static {p0}, Lgb;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-nez p0, :cond_1

    .line 44
    .line 45
    new-instance v2, Lmc5;

    .line 46
    .line 47
    const/4 v5, 0x2

    .line 48
    const/4 v7, 0x0

    .line 49
    const/4 v4, 0x0

    .line 50
    invoke-direct/range {v2 .. v7}, Lmc5;-><init>(Lsc5;Ljava/lang/String;ILjava/util/List;I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Lmc5;->a()Lrv2;

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 58
    .line 59
    const-string p1, "enqueue needs at least one WorkRequest."

    .line 60
    .line 61
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    :catch_0
    move-exception v0

    .line 66
    move-object p0, v0

    .line 67
    invoke-static {}, Lcx;->f()Lcx;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    const-string p2, "WorkManager is not initialized"

    .line 72
    .line 73
    invoke-virtual {p1, v1, p2, p0}, Lcx;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method
