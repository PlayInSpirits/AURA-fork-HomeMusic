.class public final synthetic Ldefpackage/n25;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Ldefpackage/q25;


# direct methods
.method public synthetic constructor <init>(ZLdefpackage/q25;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Ldefpackage/n25;->a:Z

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/n25;->b:Ldefpackage/q25;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-boolean v0, p0, Ldefpackage/n25;->a:Z

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/n25;->b:Ldefpackage/q25;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    :try_start_0
    iget-boolean v3, p0, Ldefpackage/q25;->r:Z

    .line 10
    .line 11
    iget-object v4, p0, Ldefpackage/q25;->j:Ldefpackage/f25;

    .line 12
    .line 13
    iget-object v5, p0, Ldefpackage/q25;->k:Ldefpackage/g25;

    .line 14
    .line 15
    invoke-virtual {v4, v5}, Ldefpackage/f25;->b(Ldefpackage/g25;)V

    .line 16
    .line 17
    .line 18
    iput-boolean v1, p0, Ldefpackage/q25;->r:Z

    .line 19
    .line 20
    invoke-virtual {p0}, Ldefpackage/q25;->c2()V

    .line 21
    .line 22
    .line 23
    if-nez v3, :cond_2

    .line 24
    .line 25
    iget-boolean v3, p0, Ldefpackage/q25;->J:Z

    .line 26
    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    const/4 v3, 0x3

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v3, 0x2

    .line 32
    :goto_0
    iput v3, p0, Ldefpackage/q25;->s:I

    .line 33
    .line 34
    iput-boolean v2, p0, Ldefpackage/q25;->J:Z

    .line 35
    .line 36
    iput v2, p0, Ldefpackage/q25;->K:I

    .line 37
    .line 38
    iget-object v3, p0, Ldefpackage/q25;->H:Ljava/lang/Long;

    .line 39
    .line 40
    if-eqz v3, :cond_1

    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 43
    .line 44
    .line 45
    move-result-wide v3

    .line 46
    const/4 v5, 0x0

    .line 47
    iput-object v5, p0, Ldefpackage/q25;->H:Ljava/lang/Long;

    .line 48
    .line 49
    invoke-virtual {p0, v3, v4}, Ldefpackage/q25;->V1(J)Z

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :catch_0
    move-exception v3

    .line 54
    goto :goto_2

    .line 55
    :cond_1
    :goto_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 56
    .line 57
    .line 58
    move-result-wide v3

    .line 59
    iput-wide v3, p0, Ldefpackage/q25;->u:J

    .line 60
    .line 61
    :cond_2
    invoke-virtual {p0}, Ldefpackage/q25;->X1()V

    .line 62
    .line 63
    .line 64
    iget-object v3, p0, Ldefpackage/q25;->n:Landroid/os/Handler;

    .line 65
    .line 66
    new-instance v4, Ldefpackage/o25;

    .line 67
    .line 68
    invoke-direct {v4, p0, v1}, Ldefpackage/o25;-><init>(Ldefpackage/q25;I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 72
    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_3
    invoke-virtual {p0}, Ldefpackage/q25;->T1()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Ldefpackage/q25;->U1()J

    .line 79
    .line 80
    .line 81
    move-result-wide v3

    .line 82
    invoke-virtual {p0, v3, v4}, Ldefpackage/q25;->Y1(J)V

    .line 83
    .line 84
    .line 85
    iput-boolean v2, p0, Ldefpackage/q25;->r:Z

    .line 86
    .line 87
    invoke-virtual {p0}, Ldefpackage/q25;->c2()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 88
    .line 89
    .line 90
    goto :goto_3

    .line 91
    :goto_2
    if-eqz v0, :cond_4

    .line 92
    .line 93
    invoke-virtual {p0}, Ldefpackage/q25;->J1()Ldefpackage/p25;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {p0, v0, v3}, Ldefpackage/q25;->I1(Ldefpackage/p25;Ljava/lang/Exception;)Landroidx/media3/common/PlaybackException;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {p0, v0}, Ldefpackage/q25;->L1(Landroidx/media3/common/PlaybackException;)V

    .line 102
    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_4
    const-string v0, "UpnpPlayer"

    .line 106
    .line 107
    const-string v4, "renderer did not acknowledge the pause"

    .line 108
    .line 109
    invoke-static {v0, v4, v3}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 110
    .line 111
    .line 112
    iput-boolean v2, p0, Ldefpackage/q25;->r:Z

    .line 113
    .line 114
    invoke-virtual {p0}, Ldefpackage/q25;->c2()V

    .line 115
    .line 116
    .line 117
    iput v1, p0, Ldefpackage/q25;->s:I

    .line 118
    .line 119
    :goto_3
    invoke-virtual {p0}, Ldefpackage/q25;->O1()V

    .line 120
    .line 121
    .line 122
    sget-object p0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 123
    .line 124
    return-object p0
.end method
